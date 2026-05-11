package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class SurfaceHandlerBinding implements E4.b {
    public static final int DISPLAY_MODE_HIDDEN = 2;
    public static final int DISPLAY_MODE_SUSPENDED = 1;
    public static final int DISPLAY_MODE_VISIBLE = 0;
    private static final int NO_SURFACE_ID = 0;
    private final HybridData mHybridData;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayModeTypeDef {
    }

    static {
        FabricSoLoader.staticInit();
    }

    public SurfaceHandlerBinding(String str) {
        this.mHybridData = initHybrid(0, str);
    }

    private native String getModuleNameNative();

    private native int getSurfaceIdNative();

    private static native HybridData initHybrid(int i10, String str);

    private native boolean isRunningNative();

    private native void setDisplayModeNative(int i10);

    private native void setLayoutConstraintsNative(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, float f16);

    private native void setPropsNative(NativeMap nativeMap);

    private native void setSurfaceIdNative(int i10);

    private native void startNative();

    private native void stopNative();

    @Override // E4.b
    public String getModuleName() {
        return getModuleNameNative();
    }

    @Override // E4.b
    public int getSurfaceId() {
        return getSurfaceIdNative();
    }

    @Override // E4.b
    public boolean isRunning() {
        return isRunningNative();
    }

    @Override // E4.b
    public void setLayoutConstraints(int i10, int i11, int i12, int i13, boolean z10, boolean z11, float f10) {
        setLayoutConstraintsNative(LayoutMetricsConversions.getMinSize(i10) / f10, LayoutMetricsConversions.getMaxSize(i10) / f10, LayoutMetricsConversions.getMinSize(i11) / f10, LayoutMetricsConversions.getMaxSize(i11) / f10, i12 / f10, i13 / f10, z10, z11, f10);
    }

    @Override // E4.b
    public void setMountable(boolean z10) {
        setDisplayModeNative(!z10 ? 1 : 0);
    }

    @Override // E4.b
    public void setProps(NativeMap nativeMap) {
        setPropsNative(nativeMap);
    }

    @Override // E4.b
    public void setSurfaceId(int i10) {
        setSurfaceIdNative(i10);
    }

    @Override // E4.b
    public void start() {
        startNative();
    }

    @Override // E4.b
    public void stop() {
        stopNative();
    }
}
