package com.google.firebase.messaging;

import D7.InterfaceC0783g;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
abstract class V {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    static void f(Context context, boolean z10) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_notification_initialized", z10);
        edit.apply();
    }

    static void g(final Context context, H h10, final boolean z10) {
        if (com.google.android.gms.common.util.m.g() && !d(b(context), z10)) {
            h10.l(z10).g(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC0783g() { // from class: com.google.firebase.messaging.U
                @Override // D7.InterfaceC0783g
                public final void onSuccess(Object obj) {
                    V.h(context, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Context context, boolean z10) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_retention", z10);
        edit.apply();
    }
}
