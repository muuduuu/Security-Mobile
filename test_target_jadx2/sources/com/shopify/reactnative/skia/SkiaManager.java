package com.shopify.reactnative.skia;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;

/* loaded from: classes2.dex */
public class SkiaManager {
    private ReactContext mContext;
    private HybridData mHybridData;
    private PlatformContext mPlatformContext;

    SkiaManager(ReactContext reactContext) {
        this.mContext = reactContext;
        RuntimeExecutor a10 = g.a(reactContext);
        this.mPlatformContext = new PlatformContext(reactContext);
        this.mHybridData = initHybrid(reactContext.getJavaScriptContextHolder().get(), a10, this.mPlatformContext);
        initializeRuntime();
    }

    private native HybridData initHybrid(long j10, RuntimeExecutor runtimeExecutor, PlatformContext platformContext);

    private native void initializeRuntime();

    public void a() {
        this.mHybridData.resetNative();
    }

    public void b() {
        this.mPlatformContext.h();
    }

    public void c() {
        this.mPlatformContext.i();
    }

    public native void invalidate();
}
