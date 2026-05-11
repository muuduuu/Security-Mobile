package g5;

import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3193c {

    /* renamed from: a, reason: collision with root package name */
    public static final C3193c f33559a = new C3193c();

    private C3193c() {
    }

    public static final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1721a.m("ReactNative", message);
    }

    private final String b(int i10) {
        return (i10 == 2 || i10 == 3) ? "log" : (i10 == 4 || i10 == 5) ? "warn" : i10 != 6 ? "none" : AppConstants.VIDEO_RECORDING_ERROR;
    }

    private final void c(ReactContext reactContext, String str, int i10) {
        if (i10 < 5 || reactContext == null || !reactContext.hasActiveReactInstance() || str == null) {
            return;
        }
        ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(b(i10), str);
    }

    public static final void d(ReactContext reactContext, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f33559a.c(reactContext, message, 5);
        AbstractC1721a.J("ReactNative", message);
    }
}
