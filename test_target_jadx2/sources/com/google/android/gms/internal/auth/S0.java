package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class S0 implements InterfaceC2070m1 {

    /* renamed from: b, reason: collision with root package name */
    private static final X0 f23652b = new Q0();

    /* renamed from: a, reason: collision with root package name */
    private final X0 f23653a;

    public S0() {
        X0 x02;
        A0 a10 = A0.a();
        try {
            x02 = (X0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            x02 = f23652b;
        }
        R0 r02 = new R0(a10, x02);
        byte[] bArr = G0.f23599d;
        this.f23653a = r02;
    }

    private static boolean b(W0 w02) {
        return w02.a() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2070m1
    public final InterfaceC2067l1 a(Class cls) {
        AbstractC2073n1.d(cls);
        W0 b10 = this.f23653a.b(cls);
        return b10.zzb() ? C0.class.isAssignableFrom(cls) ? C2046e1.a(AbstractC2073n1.b(), AbstractC2104y0.b(), b10.zza()) : C2046e1.a(AbstractC2073n1.a(), AbstractC2104y0.a(), b10.zza()) : C0.class.isAssignableFrom(cls) ? b(b10) ? C2043d1.s(cls, b10, AbstractC2052g1.b(), P0.d(), AbstractC2073n1.b(), AbstractC2104y0.b(), V0.b()) : C2043d1.s(cls, b10, AbstractC2052g1.b(), P0.d(), AbstractC2073n1.b(), null, V0.b()) : b(b10) ? C2043d1.s(cls, b10, AbstractC2052g1.a(), P0.c(), AbstractC2073n1.a(), AbstractC2104y0.a(), V0.a()) : C2043d1.s(cls, b10, AbstractC2052g1.a(), P0.c(), AbstractC2073n1.a(), null, V0.a());
    }
}
