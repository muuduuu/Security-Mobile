package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;

/* loaded from: classes2.dex */
public class KeyboardWorkletWrapper {
    private final HybridData mHybridData;

    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void invoke(int i10, int i11);
}
