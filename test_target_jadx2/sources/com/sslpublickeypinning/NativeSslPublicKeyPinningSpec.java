package com.sslpublickeypinning;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes2.dex */
public abstract class NativeSslPublicKeyPinningSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SslPublicKeyPinning";

    public NativeSslPublicKeyPinningSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void disable(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SslPublicKeyPinning";
    }

    @ReactMethod
    public abstract void initialize(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void removeListeners(double d10);
}
