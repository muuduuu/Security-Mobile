package co.hyperverge.hvcamera.sensor;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class SensorEnginev2 implements SensorEventListener {
    private static final String TAG = "SensorEnginev2";
    protected boolean isInitialized;
    protected final SensorManager mSensorManager;

    public SensorEnginev2(Context context) {
        this.isInitialized = false;
        this.mSensorManager = (SensorManager) context.getSystemService("sensor");
        this.isInitialized = true;
    }

    protected static float computeMean(float f10, float f11, float f12, int i10) {
        return f10 + ((f12 - f11) / i10);
    }

    private static float computeVectorMagnitudeSquared(ArrayList<Float> arrayList) {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f10 += arrayList.get(i10).floatValue() * arrayList.get(i10).floatValue();
        }
        return f10;
    }

    public abstract void start();

    public abstract void stop();

    protected static float computeMean(ArrayList<Float> arrayList) {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f10 += arrayList.get(i10).floatValue();
        }
        return f10 / arrayList.size();
    }
}
