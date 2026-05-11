package com.swmansion.reanimated.sensor;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.nativeProxy.SensorSetter;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class ReanimatedSensor {
    private static final int DEFAULT_INTERVAL = 8;
    int interval;
    ReanimatedSensorListener listener;
    Sensor sensor;
    SensorManager sensorManager;
    ReanimatedSensorType sensorType;

    ReanimatedSensor(WeakReference<ReactApplicationContext> weakReference, ReanimatedSensorType reanimatedSensorType, int i10, SensorSetter sensorSetter) {
        this.listener = new ReanimatedSensorListener(sensorSetter, i10, ((WindowManager) weakReference.get().getSystemService("window")).getDefaultDisplay());
        ReactApplicationContext reactApplicationContext = weakReference.get();
        weakReference.get();
        this.sensorManager = (SensorManager) reactApplicationContext.getSystemService("sensor");
        this.sensorType = reanimatedSensorType;
        if (i10 == -1) {
            this.interval = 8;
        } else {
            this.interval = i10;
        }
    }

    void cancel() {
        this.sensorManager.unregisterListener(this.listener, this.sensor);
    }

    boolean initialize() {
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(this.sensorType.getType());
        this.sensor = defaultSensor;
        if (defaultSensor == null) {
            return false;
        }
        this.sensorManager.registerListener(this.listener, defaultSensor, this.interval * 1000);
        return true;
    }
}
