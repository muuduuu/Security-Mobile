package com.google.protobuf;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2883n {

    /* renamed from: a, reason: collision with root package name */
    static final Class f28797a = c();

    public static C2884o a() {
        C2884o b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : C2884o.f28801d;
    }

    private static final C2884o b(String str) {
        Class cls = f28797a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2884o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
