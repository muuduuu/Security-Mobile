package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;

/* loaded from: classes2.dex */
public class SensorSetter {
    private final HybridData mHybridData;

    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i10);
}
