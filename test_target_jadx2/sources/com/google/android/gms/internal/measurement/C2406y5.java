package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2406y5 implements T5 {

    /* renamed from: b, reason: collision with root package name */
    private static final F5 f24700b = new C2388w5();

    /* renamed from: a, reason: collision with root package name */
    private final F5 f24701a;

    public C2406y5() {
        C2218d5 a10 = C2218d5.a();
        int i10 = P5.f24329d;
        C2397x5 c2397x5 = new C2397x5(a10, f24700b);
        byte[] bArr = AbstractC2308n5.f24582b;
        this.f24701a = c2397x5;
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final S5 a(Class cls) {
        int i10 = U5.f24390b;
        if (!AbstractC2245g5.class.isAssignableFrom(cls)) {
            int i11 = P5.f24329d;
        }
        E5 c10 = this.f24701a.c(cls);
        if (c10.zza()) {
            int i12 = P5.f24329d;
            return L5.i(U5.a(), W4.a(), c10.zzb());
        }
        int i13 = P5.f24329d;
        return K5.A(cls, c10, N5.a(), AbstractC2361t5.a(), U5.a(), c10.a() + (-1) != 1 ? W4.a() : null, D5.a());
    }
}
