package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class R0 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    private final X0[] f23651a;

    R0(X0... x0Arr) {
        this.f23651a = x0Arr;
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final W0 b(Class cls) {
        X0[] x0Arr = this.f23651a;
        for (int i10 = 0; i10 < 2; i10++) {
            X0 x02 = x0Arr[i10];
            if (x02.c(cls)) {
                return x02.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final boolean c(Class cls) {
        X0[] x0Arr = this.f23651a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (x0Arr[i10].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
