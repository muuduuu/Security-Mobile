package com.shopify.reactnative.skia;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes2.dex */
public abstract class NativeSkiaModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSkiaModule";

    public NativeSkiaModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSkiaModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean install();
}
