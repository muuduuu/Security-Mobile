package r7;

import V6.AbstractC1287s;
import java.io.UnsupportedEncodingException;

/* renamed from: r7.w8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4257w8 implements InterfaceC4108h8 {

    /* renamed from: a, reason: collision with root package name */
    private final C4096g6 f40368a;

    /* renamed from: b, reason: collision with root package name */
    private D7 f40369b = new D7();

    /* renamed from: c, reason: collision with root package name */
    private final int f40370c;

    private C4257w8(C4096g6 c4096g6, int i10) {
        this.f40368a = c4096g6;
        F8.a();
        this.f40370c = i10;
    }

    public static InterfaceC4108h8 d(C4096g6 c4096g6) {
        return new C4257w8(c4096g6, 0);
    }

    public static InterfaceC4108h8 e(C4096g6 c4096g6, int i10) {
        return new C4257w8(c4096g6, 1);
    }

    @Override // r7.InterfaceC4108h8
    public final InterfaceC4108h8 a(EnumC4086f6 enumC4086f6) {
        this.f40368a.f(enumC4086f6);
        return this;
    }

    @Override // r7.InterfaceC4108h8
    public final byte[] b(int i10, boolean z10) {
        this.f40369b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f40369b.e(Boolean.FALSE);
        this.f40368a.i(this.f40369b.m());
        try {
            F8.a();
            if (i10 == 0) {
                return new v8.d().j(C4055c5.f39950a).k(true).i().b(this.f40368a.j()).getBytes("utf-8");
            }
            C4116i6 j10 = this.f40368a.j();
            W0 w02 = new W0();
            C4055c5.f39950a.a(w02);
            return w02.b().a(j10);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // r7.InterfaceC4108h8
    public final InterfaceC4108h8 c(D7 d72) {
        this.f40369b = d72;
        return this;
    }

    @Override // r7.InterfaceC4108h8
    public final String f() {
        F7 g10 = this.f40368a.j().g();
        return (g10 == null || AbstractC4258x.b(g10.k())) ? "NA" : (String) AbstractC1287s.m(g10.k());
    }

    @Override // r7.InterfaceC4108h8
    public final int zza() {
        return this.f40370c;
    }
}
