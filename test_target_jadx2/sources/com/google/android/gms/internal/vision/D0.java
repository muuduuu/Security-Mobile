package com.google.android.gms.internal.vision;

/* loaded from: classes2.dex */
abstract class D0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C0 f25008a = new B0();

    /* renamed from: b, reason: collision with root package name */
    private static final C0 f25009b = c();

    static C0 a() {
        return f25008a;
    }

    static C0 b() {
        C0 c02 = f25009b;
        if (c02 != null) {
            return c02;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static C0 c() {
        try {
            return (C0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
