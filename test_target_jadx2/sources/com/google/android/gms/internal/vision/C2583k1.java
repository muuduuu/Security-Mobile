package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2583k1 implements M1 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2612u1 f25171b = new C2580j1();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2612u1 f25172a;

    public C2583k1() {
        this(new C2589m1(O0.c(), b()));
    }

    private static InterfaceC2612u1 b() {
        try {
            return (InterfaceC2612u1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f25171b;
        }
    }

    private static boolean c(InterfaceC2603r1 interfaceC2603r1) {
        return interfaceC2603r1.zza() == G1.f25028a;
    }

    @Override // com.google.android.gms.internal.vision.M1
    public final K1 a(Class cls) {
        L1.p(cls);
        InterfaceC2603r1 b10 = this.f25172a.b(cls);
        return b10.zzb() ? N0.class.isAssignableFrom(cls) ? C2627z1.i(L1.B(), D0.a(), b10.a()) : C2627z1.i(L1.f(), D0.b(), b10.a()) : N0.class.isAssignableFrom(cls) ? c(b10) ? C2621x1.o(cls, b10, B1.b(), AbstractC2556c1.c(), L1.B(), D0.a(), AbstractC2606s1.b()) : C2621x1.o(cls, b10, B1.b(), AbstractC2556c1.c(), L1.B(), null, AbstractC2606s1.b()) : c(b10) ? C2621x1.o(cls, b10, B1.a(), AbstractC2556c1.a(), L1.f(), D0.b(), AbstractC2606s1.a()) : C2621x1.o(cls, b10, B1.a(), AbstractC2556c1.a(), L1.v(), null, AbstractC2606s1.a());
    }

    private C2583k1(InterfaceC2612u1 interfaceC2612u1) {
        this.f25172a = (InterfaceC2612u1) R0.f(interfaceC2612u1, "messageInfoFactory");
    }
}
