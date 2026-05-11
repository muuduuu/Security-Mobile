package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2052g1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2049f1 f23713a;

    /* renamed from: b, reason: collision with root package name */
    private static final C2049f1 f23714b;

    static {
        C2049f1 c2049f1 = null;
        try {
            c2049f1 = (C2049f1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f23713a = c2049f1;
        f23714b = new C2049f1();
    }

    static C2049f1 a() {
        return f23713a;
    }

    static C2049f1 b() {
        return f23714b;
    }
}
