package com.hypersnapsdk;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

@K4.a(name = HypersnapsdkModule.NAME)
/* loaded from: classes2.dex */
public class HypersnapsdkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Hypersnapsdk";

    public HypersnapsdkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void multiply(double d10, double d11, Promise promise) {
        promise.resolve(Double.valueOf(d10 * d11));
    }
}
