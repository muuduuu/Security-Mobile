package com.shopify.reactnative.skia;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.F0;

/* loaded from: classes2.dex */
public class SkiaDomView extends i {
    private HybridData mHybridData;

    public SkiaDomView(F0 f02) {
        super(f02);
        this.mHybridData = initHybrid(((RNSkiaModule) f02.b().getNativeModule(RNSkiaModule.class)).getSkiaManager());
    }

    private native HybridData initHybrid(SkiaManager skiaManager);

    protected void finalize() {
        super.finalize();
        this.mHybridData.resetNative();
    }

    @Override // com.shopify.reactnative.skia.i
    protected native void registerView(int i10);

    protected native void setBgColor(int i10);

    @Override // com.shopify.reactnative.skia.i
    protected native void setDebugMode(boolean z10);

    @Override // com.shopify.reactnative.skia.i
    protected native void setMode(String str);

    @Override // com.shopify.reactnative.skia.i
    protected native void surfaceAvailable(Object obj, int i10, int i11);

    @Override // com.shopify.reactnative.skia.i
    protected native void surfaceDestroyed();

    @Override // com.shopify.reactnative.skia.i
    protected native void surfaceSizeChanged(int i10, int i11);

    @Override // com.shopify.reactnative.skia.i
    protected native void unregisterView();

    protected native void updateTouchPoints(double[] dArr);
}
