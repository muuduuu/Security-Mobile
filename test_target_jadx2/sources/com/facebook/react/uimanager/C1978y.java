package com.facebook.react.uimanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.react.uimanager.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978y {

    /* renamed from: a, reason: collision with root package name */
    public static final C1978y f22500a = new C1978y();

    /* renamed from: b, reason: collision with root package name */
    private static DisplayMetrics f22501b;

    /* renamed from: c, reason: collision with root package name */
    private static DisplayMetrics f22502c;

    private C1978y() {
    }

    public static final WritableMap a(double d10) {
        if (f22501b == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        if (f22502c == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        C1978y c1978y = f22500a;
        DisplayMetrics displayMetrics = f22501b;
        Intrinsics.e(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", c1978y.b(displayMetrics, d10));
        DisplayMetrics displayMetrics2 = f22502c;
        Intrinsics.e(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", c1978y.b(displayMetrics2, d10));
        return writableNativeMap;
    }

    private final WritableMap b(DisplayMetrics displayMetrics, double d10) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d10);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics c() {
        DisplayMetrics displayMetrics = f22502c;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        Intrinsics.e(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final DisplayMetrics d() {
        DisplayMetrics displayMetrics = f22501b;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        Intrinsics.e(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final void e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f22501b = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        f22502c = displayMetrics2;
    }

    public static final void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f22502c != null) {
            return;
        }
        e(context);
    }
}
