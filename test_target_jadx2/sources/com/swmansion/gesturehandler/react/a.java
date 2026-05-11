package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter a(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        Intrinsics.checkNotNullExpressionValue(jSModule, "getJSModule(...)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    public static final UIManagerModule b(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        Intrinsics.d(nativeModule);
        return (UIManagerModule) nativeModule;
    }

    public static final boolean c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isTouchExplorationEnabled();
    }
}
