package com.facebook.react.fabric;

import c3.AbstractC1721a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.E0;

/* loaded from: classes.dex */
public class StateWrapperImpl implements E0 {
    private static final String TAG = "StateWrapperImpl";
    private volatile boolean mDestroyed = false;
    private final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    private StateWrapperImpl() {
    }

    private native ReadableNativeMap getStateDataImpl();

    private native ReadableMapBuffer getStateMapBufferDataImpl();

    private static native HybridData initHybrid();

    @Override // com.facebook.react.uimanager.E0
    public void destroyState() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        this.mHybridData.resetNative();
    }

    public ReadableNativeMap getStateData() {
        if (!this.mDestroyed) {
            return getStateDataImpl();
        }
        AbstractC1721a.m(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // com.facebook.react.uimanager.E0
    public ReadableMapBuffer getStateDataMapBuffer() {
        if (!this.mDestroyed) {
            return getStateMapBufferDataImpl();
        }
        AbstractC1721a.m(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    public String toString() {
        if (this.mDestroyed) {
            return "<destroyed>";
        }
        ReadableMapBuffer stateMapBufferDataImpl = getStateMapBufferDataImpl();
        if (stateMapBufferDataImpl != null) {
            return stateMapBufferDataImpl.toString();
        }
        ReadableNativeMap stateDataImpl = getStateDataImpl();
        return stateDataImpl == null ? "<unexpected null>" : stateDataImpl.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.E0
    public void updateState(WritableMap writableMap) {
        if (this.mDestroyed) {
            AbstractC1721a.m(TAG, "Race between StateWrapperImpl destruction and updateState");
        } else {
            updateStateImpl((NativeMap) writableMap);
        }
    }

    public native void updateStateImpl(NativeMap nativeMap);
}
