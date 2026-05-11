package com.mrousavy.mmkv;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes2.dex */
public abstract class NativeMmkvPlatformContextSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "MmkvPlatformContext";

    public NativeMmkvPlatformContextSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getAppGroupDirectory();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getBaseDirectory();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
