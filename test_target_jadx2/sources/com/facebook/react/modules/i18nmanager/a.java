package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.text.q;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0380a f21807a = new C0380a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final a f21808b = new a();

    /* renamed from: com.facebook.react.modules.i18nmanager.a$a, reason: collision with other inner class name */
    public static final class C0380a {
        public /* synthetic */ C0380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f21808b;
        }

        private C0380a() {
        }
    }

    private a() {
    }

    private final boolean c(Context context) {
        return (context.getApplicationInfo().flags & 4194304) != 0;
    }

    public static final a f() {
        return f21807a.a();
    }

    private final boolean g() {
        return q.a(Locale.getDefault()) == 1;
    }

    private final boolean h(Context context, String str, boolean z10) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z10);
    }

    private final boolean j(Context context) {
        return h(context, "RCTI18nUtil_allowRTL", true);
    }

    private final boolean k(Context context) {
        return h(context, "RCTI18nUtil_forceRTL", false) || StringsKt.r(System.getProperty("FORCE_RTL_FOR_TESTING", "false"), "true", true);
    }

    private final void l(Context context, String str, boolean z10) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public final void b(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        l(context, "RCTI18nUtil_allowRTL", z10);
    }

    public final boolean d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return h(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final void e(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        l(context, "RCTI18nUtil_forceRTL", z10);
    }

    public final boolean i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context) && (k(context) || (j(context) && g()));
    }

    public final void m(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        l(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z10);
    }
}
