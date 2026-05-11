package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import x4.C5109a;

/* loaded from: classes.dex */
public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "StatusBarManager";

    public NativeStatusBarManagerAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (C5109a.f44775b || C5109a.f44776c) {
            HashSet hashSet = new HashSet(Arrays.asList("DEFAULT_BACKGROUND_COLOR", "HEIGHT"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StatusBarManager";
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    public abstract void setColor(double d10, boolean z10);

    @ReactMethod
    public abstract void setHidden(boolean z10);

    @ReactMethod
    public abstract void setStyle(String str);

    @ReactMethod
    public abstract void setTranslucent(boolean z10);
}
