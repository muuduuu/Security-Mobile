package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
abstract class J0 {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f23840a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f23841b = new I0();

    static H0 a() {
        return f23840a;
    }

    static H0 b() {
        return f23841b;
    }

    private static H0 c() {
        try {
            return (H0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
