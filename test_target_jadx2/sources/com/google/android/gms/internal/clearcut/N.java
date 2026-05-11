package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
abstract class N {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f23890a = a();

    private static Class a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static O b() {
        Class cls = f23890a;
        if (cls != null) {
            try {
                return (O) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return O.f23895c;
    }
}
