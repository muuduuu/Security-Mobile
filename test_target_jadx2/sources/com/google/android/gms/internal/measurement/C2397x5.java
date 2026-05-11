package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2397x5 implements F5 {

    /* renamed from: a, reason: collision with root package name */
    private final F5[] f24692a;

    C2397x5(F5... f5Arr) {
        this.f24692a = f5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f24692a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final E5 c(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            F5 f52 = this.f24692a[i10];
            if (f52.b(cls)) {
                return f52.c(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
