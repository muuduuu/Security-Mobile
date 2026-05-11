package com.google.protobuf;

/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2873d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f28717a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f28718b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f28719c;

    static {
        f28719c = (f28717a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f28718b;
    }

    static boolean c() {
        return f28717a || !(f28718b == null || f28719c);
    }
}
