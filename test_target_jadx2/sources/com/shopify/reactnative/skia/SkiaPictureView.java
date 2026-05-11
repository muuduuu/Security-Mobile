package com.shopify.reactnative.skia;

import android.content.Context;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
public class SkiaPictureView extends i {
    private HybridData mHybridData;

    public SkiaPictureView(Context context) {
        super(context);
        this.mHybridData = initHybrid(((RNSkiaModule) ((ReactContext) context).getNativeModule(RNSkiaModule.class)).getSkiaManager());
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
