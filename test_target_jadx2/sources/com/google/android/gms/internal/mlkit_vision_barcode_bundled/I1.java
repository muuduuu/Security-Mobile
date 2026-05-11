package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class I1 implements InterfaceC2465j2 {

    /* renamed from: b, reason: collision with root package name */
    private static final N1 f24764b = new G1();

    /* renamed from: a, reason: collision with root package name */
    private final N1 f24765a;

    public I1() {
        N1 n12;
        Y0 a10 = Y0.a();
        try {
            n12 = (N1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n12 = f24764b;
        }
        H1 h12 = new H1(a10, n12);
        byte[] bArr = AbstractC2489o1.f24887d;
        this.f24765a = h12;
    }

    private static boolean b(M1 m12) {
        return m12.a() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2465j2
    public final InterfaceC2460i2 a(Class cls) {
        AbstractC2470k2.d(cls);
        M1 b10 = this.f24765a.b(cls);
        return b10.zzb() ? AbstractC2444f1.class.isAssignableFrom(cls) ? T1.a(AbstractC2470k2.W(), T0.b(), b10.zza()) : T1.a(AbstractC2470k2.V(), T0.a(), b10.zza()) : AbstractC2444f1.class.isAssignableFrom(cls) ? b(b10) ? S1.H(cls, b10, V1.b(), E1.d(), AbstractC2470k2.W(), T0.b(), L1.b()) : S1.H(cls, b10, V1.b(), E1.d(), AbstractC2470k2.W(), null, L1.b()) : b(b10) ? S1.H(cls, b10, V1.a(), E1.c(), AbstractC2470k2.V(), T0.a(), L1.a()) : S1.H(cls, b10, V1.a(), E1.c(), AbstractC2470k2.V(), null, L1.a());
    }
}
