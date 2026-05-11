package com.gantix.JailMonkey;

import Y5.c;
import android.os.Debug;
import android.provider.Settings;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class JailMonkeyModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public JailMonkeyModule(ReactApplicationContext reactApplicationContext, boolean z10) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        c cVar = new c(reactApplicationContext);
        HashMap hashMap = new HashMap();
        hashMap.put("isJailBroken", Boolean.valueOf(cVar.c()));
        hashMap.put("rootedDetectionMethods", cVar.b());
        hashMap.put("hookDetected", Boolean.valueOf(W5.a.c(reactApplicationContext)));
        hashMap.put("canMockLocation", Boolean.valueOf(X5.a.a(reactApplicationContext)));
        hashMap.put("isOnExternalStorage", Boolean.valueOf(V5.a.a(reactApplicationContext)));
        hashMap.put("AdbEnabled", Boolean.valueOf(U5.a.a(reactApplicationContext)));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JailMonkey";
    }

    @ReactMethod
    public void isDebuggedMode(Promise promise) {
        boolean z10 = true;
        if (!Debug.isDebuggerConnected() && (this.reactContext.getApplicationContext().getApplicationInfo().flags & 2) == 0) {
            z10 = false;
        }
        promise.resolve(Boolean.valueOf(z10));
    }

    @ReactMethod
    public void isDevelopmentSettingsMode(Promise promise) {
        promise.resolve(Boolean.valueOf(Settings.Global.getInt(this.reactContext.getContentResolver(), "development_settings_enabled", 0) == 1));
    }
}
