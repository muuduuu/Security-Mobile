package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2164t {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f24095a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f24096b;

    static {
        f24096b = a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (f24095a == null || f24096b) ? false : true;
    }

    static Class c() {
        return f24095a;
    }
}
