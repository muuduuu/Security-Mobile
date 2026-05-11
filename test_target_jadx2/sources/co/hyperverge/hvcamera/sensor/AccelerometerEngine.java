package co.hyperverge.hvcamera.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import co.hyperverge.hvcamera.HVLog;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AccelerometerEngine extends SensorEnginev2 {
    private static final String TAG = "AccelerometerEngine";
    private final int MAX_WINDOWSIZE;
    private ArrayList<ArrayList<Float>> accValues;
    private final long burnInPeriod;
    private HVMagicView.SensorCallback callback;

    /* renamed from: h, reason: collision with root package name */
    private Handler f19511h;
    private boolean hasAccelSensing;
    private boolean isAccelSensing;
    private boolean isReferenceSet;
    private boolean isRunning;
    private boolean isTouchEvent;
    private Sensor mAccelerometerSensor;
    private ArrayList<Float> meanValues;
    private Runnable motionFocusRunnable;
    private Long refSensorTimestamp;
    private Long refTimestamp;
    private final float threshold;
    private ArrayList<Long> timestamps;
    private Runnable touchEventRunnable;
    private int windowSize;

    public AccelerometerEngine(Context context, int i10) {
        super(context);
        this.MAX_WINDOWSIZE = 15;
        this.isTouchEvent = false;
        this.burnInPeriod = 1000L;
        this.threshold = 0.325f;
        init(i10);
    }

    private boolean isZeroCrossingAnyAxis() {
        System.currentTimeMillis();
        int i10 = this.windowSize;
        int i11 = (i10 / 2) - 1;
        int i12 = i10 / 2;
        if (this.timestamps.get(i12).longValue() - this.timestamps.get(i11).longValue() < 500) {
            for (int i13 = 0; i13 < this.accValues.size(); i13++) {
                float floatValue = this.accValues.get(i13).get(i12).floatValue() - this.meanValues.get(i13).floatValue();
                float floatValue2 = this.accValues.get(i13).get(i11).floatValue() - this.meanValues.get(i13).floatValue();
                if ((Math.abs(floatValue) > Math.max(0.325f, this.meanValues.get(i13).floatValue() / 4.0f) || Math.abs(floatValue2) > Math.max(0.325f, this.meanValues.get(i13).floatValue() / 4.0f)) && floatValue * floatValue2 < 0.0f) {
                    if (!this.isRunning) {
                        if (this.f19511h.hasMessages(0)) {
                            this.f19511h.removeCallbacks(this.motionFocusRunnable);
                            this.f19511h.removeMessages(0);
                        }
                        this.f19511h.postDelayed(this.motionFocusRunnable, 300L);
                        this.f19511h.sendEmptyMessage(0);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void updateAccQueue(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.accValues.get(i10).add(Float.valueOf(fArr[i10]));
            if (this.accValues.get(i10).size() > this.windowSize) {
                this.accValues.get(i10).remove(0);
            }
        }
    }

    private void updateTStampQueue(Long l10) {
        this.timestamps.add(l10);
        if (this.timestamps.size() > this.windowSize) {
            this.timestamps.remove(0);
        }
    }

    public void init(int i10) {
        HVLog.d(TAG, "init() called with: wSize = [" + i10 + "]");
        this.hasAccelSensing = false;
        this.isAccelSensing = false;
        this.isReferenceSet = false;
        this.isRunning = false;
        this.f19511h = new Handler();
        this.motionFocusRunnable = new Runnable() { // from class: co.hyperverge.hvcamera.sensor.AccelerometerEngine.1
            @Override // java.lang.Runnable
            public void run() {
                AccelerometerEngine.this.isRunning = true;
                CameraEngine.clearEvent(null);
                AccelerometerEngine.this.isTouchEvent = false;
                if (AccelerometerEngine.this.callback != null) {
                    AccelerometerEngine.this.callback.onSensorCallback();
                }
                AccelerometerEngine.this.isRunning = false;
                AccelerometerEngine.this.f19511h.removeMessages(0);
            }
        };
        this.touchEventRunnable = new Runnable() { // from class: co.hyperverge.hvcamera.sensor.AccelerometerEngine.2
            @Override // java.lang.Runnable
            public void run() {
                AccelerometerEngine.this.isRunning = false;
            }
        };
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            this.mAccelerometerSensor = sensorManager.getDefaultSensor(1);
        } else {
            this.hasAccelSensing = false;
        }
        if (this.mAccelerometerSensor != null) {
            this.hasAccelSensing = true;
        }
        if (i10 > 15) {
            this.windowSize = 15;
        } else {
            this.windowSize = i10;
        }
        this.accValues = new ArrayList<>(3);
        this.meanValues = new ArrayList<>(3);
        for (int i11 = 0; i11 < 3; i11++) {
            this.accValues.add(i11, new ArrayList<>(this.windowSize));
            for (int i12 = 0; i12 < this.windowSize; i12++) {
                this.accValues.get(i11).add(i12, Float.valueOf(0.0f));
            }
            this.meanValues.add(i11, Float.valueOf(0.0f));
        }
        this.timestamps = new ArrayList<>();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (!this.isReferenceSet) {
            this.refSensorTimestamp = Long.valueOf(sensorEvent.timestamp);
            this.refTimestamp = Long.valueOf(System.currentTimeMillis());
            this.isReferenceSet = true;
        }
        long longValue = this.refTimestamp.longValue() + Math.round((sensorEvent.timestamp - this.refSensorTimestamp.longValue()) / 1000000);
        Long valueOf = Long.valueOf(longValue);
        if (type == 1) {
            for (int i10 = 0; i10 < this.meanValues.size(); i10++) {
                ArrayList<Float> arrayList = this.meanValues;
                arrayList.set(i10, Float.valueOf(SensorEnginev2.computeMean(arrayList.get(i10).floatValue(), this.accValues.get(i10).get(0).floatValue(), sensorEvent.values[i10], this.windowSize)));
            }
            updateAccQueue(sensorEvent.values);
            updateTStampQueue(valueOf);
            if (this.timestamps.size() == this.windowSize && longValue - this.refTimestamp.longValue() >= 1000 && this.isTouchEvent) {
                isZeroCrossingAnyAxis();
            }
        }
    }

    public void setCallback(HVMagicView.SensorCallback sensorCallback) {
        this.callback = sensorCallback;
    }

    @Override // co.hyperverge.hvcamera.sensor.SensorEnginev2
    public void start() {
        if (!this.hasAccelSensing) {
            HVLog.d("Sensing", "Acceleration is unavailable");
        } else {
            if (this.isAccelSensing) {
                return;
            }
            this.mSensorManager.registerListener(this, this.mAccelerometerSensor, 3);
            this.isAccelSensing = true;
            HVLog.d(TAG, "Acceleration Sensing started");
        }
    }

    @Override // co.hyperverge.hvcamera.sensor.SensorEnginev2
    public void stop() {
        HVLog.d(TAG, "stop() called");
        if (this.isAccelSensing && this.hasAccelSensing) {
            this.mSensorManager.unregisterListener(this, this.mAccelerometerSensor);
            this.isAccelSensing = false;
            this.isReferenceSet = false;
            this.f19511h.removeCallbacksAndMessages(null);
            HVLog.d(TAG, "Accelerometer sensing stopped");
        }
    }

    public void touchEventRunning() {
        this.isTouchEvent = true;
        if (!this.isRunning && this.f19511h.hasMessages(0)) {
            this.f19511h.removeCallbacks(this.motionFocusRunnable);
            this.f19511h.removeMessages(0);
        }
        this.isRunning = true;
        this.f19511h.postDelayed(this.touchEventRunnable, 2500L);
    }
}
