package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC2109a0;

/* renamed from: com.google.android.gms.internal.clearcut.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2157q0 implements S0 {

    /* renamed from: b, reason: collision with root package name */
    private static final A0 f24090b = new C2159r0();

    /* renamed from: a, reason: collision with root package name */
    private final A0 f24091a;

    public C2157q0() {
        this(new C2162s0(Z.c(), c()));
    }

    private static boolean b(InterfaceC2183z0 interfaceC2183z0) {
        return interfaceC2183z0.a() == AbstractC2109a0.c.f24001i;
    }

    private static A0 c() {
        try {
            return (A0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f24090b;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.S0
    public final R0 a(Class cls) {
        T0.I(cls);
        InterfaceC2183z0 b10 = this.f24091a.b(cls);
        if (b10.b()) {
            return AbstractC2109a0.class.isAssignableFrom(cls) ? G0.j(T0.B(), T.b(), b10.c()) : G0.j(T0.z(), T.c(), b10.c());
        }
        if (!AbstractC2109a0.class.isAssignableFrom(cls)) {
            boolean b11 = b(b10);
            H0 a10 = J0.a();
            AbstractC2142l0 c10 = AbstractC2142l0.c();
            return b11 ? F0.s(cls, b10, a10, c10, T0.z(), T.c(), AbstractC2180y0.a()) : F0.s(cls, b10, a10, c10, T0.A(), null, AbstractC2180y0.a());
        }
        boolean b12 = b(b10);
        H0 b13 = J0.b();
        AbstractC2142l0 d10 = AbstractC2142l0.d();
        Y0 B10 = T0.B();
        return b12 ? F0.s(cls, b10, b13, d10, B10, T.b(), AbstractC2180y0.b()) : F0.s(cls, b10, b13, d10, B10, null, AbstractC2180y0.b());
    }

    private C2157q0(A0 a02) {
        this.f24091a = (A0) AbstractC2115c0.e(a02, "messageInfoFactory");
    }
}
