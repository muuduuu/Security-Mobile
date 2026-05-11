package com.google.android.gms.internal.vision;

/* loaded from: classes2.dex */
abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f25095a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f25096b;

    static {
        f25096b = a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (f25095a == null || f25096b) ? false : true;
    }

    static Class c() {
        return f25095a;
    }
}
