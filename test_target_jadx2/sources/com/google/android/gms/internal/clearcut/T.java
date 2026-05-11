package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
abstract class T {

    /* renamed from: a, reason: collision with root package name */
    private static final P f23936a = new Q();

    /* renamed from: b, reason: collision with root package name */
    private static final P f23937b = a();

    private static P a() {
        try {
            return (P) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static P b() {
        return f23936a;
    }

    static P c() {
        P p10 = f23937b;
        if (p10 != null) {
            return p10;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
