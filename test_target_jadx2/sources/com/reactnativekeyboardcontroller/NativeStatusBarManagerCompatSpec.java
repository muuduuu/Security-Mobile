package com.reactnativekeyboardcontroller;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes2.dex */
public abstract class NativeStatusBarManagerCompatSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "StatusBarManagerCompat";

    public NativeStatusBarManagerCompatSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void setColor(double d10, boolean z10);

    @ReactMethod
    public abstract void setHidden(boolean z10);

    @ReactMethod
    public abstract void setStyle(String str);

    @ReactMethod
    public abstract void setTranslucent(boolean z10);
}
