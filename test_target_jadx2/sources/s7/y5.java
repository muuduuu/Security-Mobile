package s7;

import V6.AbstractC1287s;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public final class y5 implements InterfaceC4437p5 {

    /* renamed from: a, reason: collision with root package name */
    private final G3 f41651a;

    /* renamed from: b, reason: collision with root package name */
    private K4 f41652b = new K4();

    private y5(G3 g32, int i10) {
        this.f41651a = g32;
        K5.a();
    }

    public static InterfaceC4437p5 e(G3 g32) {
        return new y5(g32, 0);
    }

    @Override // s7.InterfaceC4437p5
    public final String a() {
        N4 c10 = this.f41651a.f().c();
        return (c10 == null || AbstractC4378h2.b(c10.k())) ? "NA" : (String) AbstractC1287s.m(c10.k());
    }

    @Override // s7.InterfaceC4437p5
    public final InterfaceC4437p5 b(K4 k42) {
        this.f41652b = k42;
        return this;
    }

    @Override // s7.InterfaceC4437p5
    public final InterfaceC4437p5 c(F3 f32) {
        this.f41651a.c(f32);
        return this;
    }

    @Override // s7.InterfaceC4437p5
    public final byte[] d(int i10, boolean z10) {
        this.f41652b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f41652b.e(Boolean.FALSE);
        this.f41651a.e(this.f41652b.m());
        try {
            K5.a();
            if (i10 == 0) {
                return new v8.d().j(N2.f40986a).k(true).i().b(this.f41651a.f()).getBytes("utf-8");
            }
            I3 f10 = this.f41651a.f();
            C4417n c4417n = new C4417n();
            N2.f40986a.a(c4417n);
            return c4417n.b().a(f10);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
