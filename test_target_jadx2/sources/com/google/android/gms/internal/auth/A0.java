package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class A0 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    private static final A0 f23580a = new A0();

    private A0() {
    }

    public static A0 a() {
        return f23580a;
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final W0 b(Class cls) {
        if (!C0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (W0) C0.b(cls.asSubclass(C0.class)).o(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final boolean c(Class cls) {
        return C0.class.isAssignableFrom(cls);
    }
}
