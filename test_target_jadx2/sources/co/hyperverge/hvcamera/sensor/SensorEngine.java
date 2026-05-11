package co.hyperverge.hvcamera.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import co.hyperverge.hvcamera.HVLog;
import co.hyperverge.hvcamera.magicfilter.utils.Quaternion;

/* loaded from: classes.dex */
public class SensorEngine {
    private static final String TAG = "SensorEngine";
    private static boolean accFirstMeasure;
    private static float currentAccel;
    private static Quaternion currentRotVec;
    private static boolean hasAccelSensing;
    private static boolean hasRotSensing;
    private static boolean hiAccFlag;
    private static Quaternion initialRotVec;
    private static boolean isAccelSensing;
    private static boolean isRotSensing;
    private static Sensor mAccelerometerSensor;
    private static Sensor mRotationVectorSensor;
    private static SensorEventListener mSensorEventListener;
    private static SensorManager mSensorManager;
    private static float referenceAccel;
    private static boolean rotFirstMeasure;

    /* JADX INFO: Access modifiers changed from: private */
    public static float computeVectorMagnitudeSquared(float[] fArr) {
        HVLog.d(TAG, "computeVectorMagnitudeSquared() called with: mData = [" + fArr + "]");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11 * f11;
        }
        return f10;
    }

    public static void init(Context context) {
        HVLog.d(TAG, "init() called with: ctx = [" + context + "]");
        hasAccelSensing = true;
        hasRotSensing = true;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        mSensorManager = sensorManager;
        mRotationVectorSensor = sensorManager.getDefaultSensor(11);
        mAccelerometerSensor = mSensorManager.getDefaultSensor(1);
        mSensorEventListener = new SensorEventListener() { // from class: co.hyperverge.hvcamera.sensor.SensorEngine.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i10) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                int type = sensorEvent.sensor.getType();
                if (type != 1) {
                    if (type == 11) {
                        float[] fArr = sensorEvent.values;
                        Quaternion unused = SensorEngine.currentRotVec = new Quaternion(fArr[0], fArr[1], fArr[2]);
                        if (SensorEngine.rotFirstMeasure) {
                            Quaternion unused2 = SensorEngine.initialRotVec = SensorEngine.currentRotVec;
                            boolean unused3 = SensorEngine.rotFirstMeasure = false;
                            return;
                        } else {
                            if (SensorEngine.currentRotVec.getTheta(SensorEngine.initialRotVec) > Math.toRadians(20.0d)) {
                                SensorEngine.stopRotationSensing();
                                HVLog.d("Sensing", "Rotation based reset");
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                float unused4 = SensorEngine.currentAccel = SensorEngine.computeVectorMagnitudeSquared(sensorEvent.values);
                if (SensorEngine.accFirstMeasure) {
                    float unused5 = SensorEngine.referenceAccel = SensorEngine.currentAccel;
                    HVLog.d("Sensing", "Ref. Accel Mag : " + SensorEngine.referenceAccel);
                    boolean unused6 = SensorEngine.accFirstMeasure = false;
                    return;
                }
                if (SensorEngine.hiAccFlag) {
                    if (Math.abs(SensorEngine.currentAccel - SensorEngine.referenceAccel) < 2.0f) {
                        HVLog.d("Sensing", "Low flag set");
                        boolean unused7 = SensorEngine.hiAccFlag = false;
                        return;
                    }
                    return;
                }
                if (Math.abs(SensorEngine.currentAccel - SensorEngine.referenceAccel) > 11.0f) {
                    HVLog.d("Sensing", "Hi flag set");
                    boolean unused8 = SensorEngine.hiAccFlag = true;
                }
            }
        };
        if (mRotationVectorSensor == null) {
            hasRotSensing = false;
        }
        if (mAccelerometerSensor == null) {
            hasAccelSensing = false;
        }
        boolean z10 = hasRotSensing;
        if (z10 && hasAccelSensing) {
            HVLog.d("Sensing", "We have both the sensors!");
        } else {
            if (hasAccelSensing || z10) {
                return;
            }
            HVLog.d("Sensing", "No suitable sensor found");
        }
    }

    public static void startAccelerometerSensing() {
        HVLog.d(TAG, "startAccelerometerSensing() called");
        if (isAccelSensing || !hasAccelSensing) {
            HVLog.d("Sensing", "Acceleration is already enabled or unavailable");
        } else {
            mSensorManager.registerListener(mSensorEventListener, mAccelerometerSensor, 3);
            isAccelSensing = true;
            HVLog.d("Sensing", "Acceleration Sensing started");
        }
        accFirstMeasure = true;
    }

    public static void startRotationSensing() {
        HVLog.d(TAG, "startRotationSensing() called");
        if (isRotSensing || !hasRotSensing) {
            HVLog.d("Sensing", "Rotation is already enabled or unavailable");
        } else {
            mSensorManager.registerListener(mSensorEventListener, mRotationVectorSensor, 3);
            isRotSensing = true;
            HVLog.d("Sensing", "Rotation Sensing started");
        }
        rotFirstMeasure = true;
    }

    public static void startSensing() {
        HVLog.d(TAG, "startSensing() called");
        startAccelerometerSensing();
        startRotationSensing();
        HVLog.d("Sensing", "Sensors started");
    }

    public static void stopAccelerometerSensing() {
        HVLog.d(TAG, "stopAccelerometerSensing() called");
        if (isAccelSensing && hasAccelSensing) {
            mSensorManager.unregisterListener(mSensorEventListener, mAccelerometerSensor);
            isAccelSensing = false;
            HVLog.d("Sensing", "Accelerometer sensing stopped");
        }
    }

    public static void stopRotationSensing() {
        HVLog.d(TAG, "stopRotationSensing() called");
        if (isRotSensing && hasRotSensing) {
            mSensorManager.unregisterListener(mSensorEventListener, mRotationVectorSensor);
            isRotSensing = false;
            HVLog.d("Sensing", "Rotation sensing stopped");
        }
    }

    public static void stopSensing() {
        HVLog.d(TAG, "stopSensing() called");
        stopRotationSensing();
        stopAccelerometerSensing();
        mSensorManager.unregisterListener(mSensorEventListener);
        HVLog.d("Sensing", "Sensing Stopped");
    }
}
