package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.AbstractC2022n;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f23530a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f23531b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f23532c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f23533d;

    public static boolean a(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i10 = AbstractC2022n.f23510a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return e(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !m.d()) {
            return true;
        }
        if (f(context)) {
            return !m.e() || m.h();
        }
        return false;
    }

    public static boolean e(PackageManager packageManager) {
        if (f23530a == null) {
            f23530a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f23530a.booleanValue();
    }

    public static boolean f(Context context) {
        if (f23531b == null) {
            f23531b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f23531b.booleanValue();
    }

    public static boolean g(Context context) {
        if (f23532c == null) {
            f23532c = Boolean.valueOf(m.e() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f23532c.booleanValue();
    }

    public static boolean h(PackageManager packageManager) {
        if (f23533d == null) {
            boolean z10 = false;
            if (m.e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f23533d = Boolean.valueOf(z10);
        }
        return f23533d.booleanValue();
    }
}
