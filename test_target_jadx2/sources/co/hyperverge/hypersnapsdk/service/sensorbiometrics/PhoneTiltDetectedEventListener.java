package co.hyperverge.hypersnapsdk.service.sensorbiometrics;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
class PhoneTiltDetectedEventListener implements SensorEventListener {
    private static final String TAG = "PhoneTiltDetectedEventL";
    private final float[][] accels;
    private final float[] azimuth;
    private final float[][] gravity;
    private final PhoneTiltListener mPhoneTiltListener;
    private final float[][] magnetic;
    private final float[][] mags;
    private final float[] pitch;
    private final float[] roll;
    private final float[] values;

    public PhoneTiltDetectedEventListener(PhoneTiltListener phoneTiltListener) {
        Class cls = Float.TYPE;
        this.gravity = (float[][]) Array.newInstance((Class<?>) cls, 1, 1);
        this.magnetic = (float[][]) Array.newInstance((Class<?>) cls, 1, 1);
        this.accels = new float[][]{new float[3]};
        this.mags = new float[][]{new float[3]};
        this.values = new float[3];
        this.azimuth = new float[1];
        this.pitch = new float[1];
        this.roll = new float[1];
        this.mPhoneTiltListener = phoneTiltListener;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.accels[0] = (float[]) sensorEvent.values.clone();
        } else if (type == 2) {
            this.mags[0] = (float[]) sensorEvent.values.clone();
        }
        float[][] fArr = this.mags;
        if (fArr[0] != null) {
            float[][] fArr2 = this.accels;
            if (fArr2[0] != null) {
                float[][] fArr3 = this.gravity;
                fArr3[0] = new float[9];
                float[] fArr4 = new float[9];
                this.magnetic[0] = fArr4;
                SensorManager.getRotationMatrix(fArr3[0], fArr4, fArr2[0], fArr[0]);
                SensorManager.getOrientation(this.gravity[0], this.values);
                float[] fArr5 = this.azimuth;
                float[] fArr6 = this.values;
                fArr5[0] = fArr6[0] * 57.29578f;
                float[] fArr7 = this.pitch;
                fArr7[0] = fArr6[1] * 57.29578f;
                float[] fArr8 = this.roll;
                float f10 = fArr6[2] * 57.29578f;
                fArr8[0] = f10;
                this.mags[0] = null;
                this.accels[0] = null;
                this.mPhoneTiltListener.onSensorDataChanged(new SensorData(fArr5[0], fArr7[0], f10));
            }
        }
    }
}
