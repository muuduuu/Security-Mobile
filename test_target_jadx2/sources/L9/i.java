package L9;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class i {
    public static final void a(F0 f02, int i10, com.facebook.react.uimanager.events.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.e(f02, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = L0.c(f02, i10);
        if (c10 != null) {
            c10.c(event);
        }
    }

    public static final void b(F0 f02, String event, WritableMap params) {
        ReactApplicationContext b10;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        if (f02 != null && (b10 = f02.b()) != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) b10.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
            rCTDeviceEventEmitter.emit(event, params);
        }
        P9.a.b(P9.a.f7630a, "ThemedReactContext", event, null, 4, null);
    }

    public static final String c(F0 f02) {
        return f02 == null ? "default" : d(f02) ? "dark" : "light";
    }

    private static final boolean d(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        Object systemService = context.getSystemService("uimode");
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        return uiModeManager != null && uiModeManager.getNightMode() == 2;
    }

    public static final void e(F0 f02, int i10) {
        ReactApplicationContext b10;
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(new int[]{i10}[0]);
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("tags", createArray);
        if (f02 == null || (b10 = f02.b()) == null) {
            return;
        }
        b10.emitDeviceEvent("onUserDrivenAnimationEnded", createMap);
    }
}
