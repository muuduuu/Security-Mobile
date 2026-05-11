package com.google.android.gms.internal.vision;

/* loaded from: classes2.dex */
abstract class B1 {

    /* renamed from: a, reason: collision with root package name */
    private static final A1 f24999a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final A1 f25000b = new C1();

    static A1 a() {
        return f24999a;
    }

    static A1 b() {
        return f25000b;
    }

    private static A1 c() {
        try {
            return (A1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
