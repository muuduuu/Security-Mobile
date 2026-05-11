package la;

import O4.g;
import O4.h;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.app.v;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.t;

/* renamed from: la.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3617d {

    /* renamed from: b, reason: collision with root package name */
    private static int f37115b;

    /* renamed from: a, reason: collision with root package name */
    public static final C3617d f37114a = new C3617d();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f37116c = G.k(t.a("android.permission.ACCEPT_HANDOVER", 28), t.a("android.permission.ACCESS_BACKGROUND_LOCATION", 29), t.a("android.permission.ACCESS_MEDIA_LOCATION", 29), t.a("android.permission.ACTIVITY_RECOGNITION", 29), t.a("android.permission.ANSWER_PHONE_CALLS", 26), t.a("android.permission.BLUETOOTH_ADVERTISE", 31), t.a("android.permission.BLUETOOTH_CONNECT", 31), t.a("android.permission.BLUETOOTH_SCAN", 31), t.a("android.permission.BODY_SENSORS_BACKGROUND", 33), t.a("android.permission.NEARBY_WIFI_DEVICES", 33), t.a("android.permission.READ_MEDIA_AUDIO", 33), t.a("android.permission.READ_MEDIA_IMAGES", 33), t.a("android.permission.READ_MEDIA_VIDEO", 33), t.a("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", 34), t.a("android.permission.READ_PHONE_NUMBERS", 26), t.a("android.permission.UWB_RANGING", 31));

    private C3617d() {
    }

    private final g i(ReactApplicationContext reactApplicationContext) {
        ComponentCallbacks2 currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof g) {
            return (g) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private final boolean j(String str) {
        if (!StringsKt.F(str, "android.", false, 2, null) && !StringsKt.F(str, "com.android", false, 2, null)) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        Integer num = (Integer) f37116c.get(str);
        return i10 >= (num != null ? num.intValue() : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Promise promise, String permission, Object[] args) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(permission, "$permission");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args[0];
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.IntArray");
        Object obj2 = args[1];
        Intrinsics.e(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        g gVar = (g) obj2;
        Integer F10 = AbstractC3574i.F((int[]) obj, 0);
        promise.resolve((F10 != null && F10.intValue() == 0) ? "granted" : gVar.shouldShowRequestPermissionRationale(permission) ? "denied" : "blocked");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ArrayList permissionsToCheck, Promise promise, WritableMap output, Object[] args) {
        Intrinsics.checkNotNullParameter(permissionsToCheck, "$permissionsToCheck");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(output, "$output");
        Intrinsics.checkNotNullParameter(args, "args");
        int i10 = 0;
        Object obj = args[0];
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        Object obj2 = args[1];
        Intrinsics.e(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        g gVar = (g) obj2;
        for (Object obj3 : permissionsToCheck) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            String str = (String) obj3;
            Integer F10 = AbstractC3574i.F(iArr, i10);
            output.putString(str, (F10 != null && F10.intValue() == 0) ? "granted" : gVar.shouldShowRequestPermissionRationale(str) ? "denied" : "blocked");
            i10 = i11;
        }
        promise.resolve(output);
    }

    public final void c(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 31) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Object systemService = reactContext.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        promise.resolve(Boolean.valueOf(alarmManager != null ? alarmManager.canScheduleExactAlarms() : false));
    }

    public final void d(ReactApplicationContext reactContext, Promise promise) {
        boolean canUseFullScreenIntent;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 34) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Object systemService = reactContext.getSystemService("notification");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        canUseFullScreenIntent = ((NotificationManager) systemService).canUseFullScreenIntent();
        promise.resolve(Boolean.valueOf(canUseFullScreenIntent));
    }

    public final void e(ReactApplicationContext reactContext, String permission, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (!j(permission)) {
            promise.resolve("unavailable");
        } else if (reactContext.getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve("granted");
        } else {
            promise.resolve("denied");
        }
    }

    public final void f(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:checkLocationAccuracy", "checkLocationAccuracy is not supported on Android");
    }

    public final void g(ReactApplicationContext reactContext, ReadableArray permissions, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = reactContext.getBaseContext();
        int size = permissions.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = permissions.getString(i10);
            if (string != null && !StringsKt.Z(string)) {
                writableNativeMap.putString(string, !j(string) ? "unavailable" : baseContext.checkSelfPermission(string) == 0 ? "granted" : "denied");
            }
        }
        promise.resolve(writableNativeMap);
    }

    public final void h(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        boolean a10 = v.b(reactContext).a();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("status", a10 ? "granted" : "denied");
        createMap.putMap("settings", Arguments.createMap());
        promise.resolve(createMap);
    }

    public final boolean k(ReactApplicationContext reactContext, SparseArray callbacks, int i10, int[] grantResults) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        try {
            Callback callback = (Callback) callbacks.get(i10);
            if (callback != null) {
                callback.invoke(grantResults, i(reactContext));
                callbacks.remove(i10);
            } else {
                AbstractC1721a.L("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i10));
            }
            return callbacks.size() == 0;
        } catch (IllegalStateException e10) {
            AbstractC1721a.p("PermissionsModule", e10, "Unexpected invocation of `onRequestPermissionsResult`", new Object[0]);
            return false;
        }
    }

    public final void l(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:openPhotoPicker", "openPhotoPicker is not supported on Android");
    }

    public final void m(ReactApplicationContext reactContext, String str, Promise promise) {
        Intent intent;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            String packageName = reactContext.getPackageName();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && Intrinsics.b(str, "alarms")) {
                intent = new Intent();
                intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (i10 >= 34 && Intrinsics.b(str, "fullscreen")) {
                intent = new Intent();
                intent.setAction("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (i10 < 26 || !Intrinsics.b(str, "notifications")) {
                intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + packageName));
            } else {
                intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
            }
            intent.addFlags(268435456);
            reactContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void n(ReactApplicationContext reactContext, h listener, SparseArray callbacks, final String permission, final Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (!j(permission)) {
            promise.resolve("unavailable");
            return;
        }
        if (reactContext.getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve("granted");
            return;
        }
        try {
            g i10 = i(reactContext);
            callbacks.put(f37115b, new Callback() { // from class: la.b
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    C3617d.o(Promise.this, permission, objArr);
                }
            });
            i10.c(new String[]{permission}, f37115b, listener);
            f37115b++;
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void p(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:requestLocationAccuracy", "requestLocationAccuracy is not supported on Android");
    }

    public final void q(ReactApplicationContext reactContext, h listener, SparseArray callbacks, ReadableArray permissions, final Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = reactContext.getBaseContext();
        int size = permissions.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            String string = permissions.getString(i11);
            if (string != null && !StringsKt.Z(string)) {
                if (!j(string)) {
                    writableNativeMap.putString(string, "unavailable");
                } else if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, "granted");
                } else {
                    arrayList.add(string);
                }
                i10++;
            }
        }
        if (permissions.size() == i10) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            g i12 = i(reactContext);
            callbacks.put(f37115b, new Callback() { // from class: la.c
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    C3617d.r(arrayList, promise, writableNativeMap, objArr);
                }
            });
            i12.c((String[]) arrayList.toArray(new String[0]), f37115b, listener);
            f37115b++;
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void s(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        boolean a10 = v.b(reactContext).a();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("status", a10 ? "granted" : "blocked");
        createMap.putMap("settings", Arguments.createMap());
        promise.resolve(createMap);
    }

    public final void t(ReactApplicationContext reactContext, String permission, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(i(reactContext).shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }
}
