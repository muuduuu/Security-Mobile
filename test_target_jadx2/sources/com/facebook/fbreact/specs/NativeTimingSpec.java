package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes.dex */
public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Timing";

    public NativeTimingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void createTimer(double d10, double d11, double d12, boolean z10);

    @ReactMethod
    public abstract void deleteTimer(double d10);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Timing";
    }

    @ReactMethod
    public abstract void setSendIdleEvents(boolean z10);
}
