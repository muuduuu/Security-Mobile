package t7;

import V6.AbstractC1287s;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public final class Q5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4735n4 f42685a;

    /* renamed from: b, reason: collision with root package name */
    private C4666d5 f42686b = new C4666d5();

    /* renamed from: c, reason: collision with root package name */
    private final int f42687c;

    private Q5(C4735n4 c4735n4, int i10) {
        this.f42685a = c4735n4;
        Z5.a();
        this.f42687c = i10;
    }

    public static Q5 d(C4735n4 c4735n4) {
        return new Q5(c4735n4, 0);
    }

    public static Q5 e(C4735n4 c4735n4, int i10) {
        return new Q5(c4735n4, 1);
    }

    public final int a() {
        return this.f42687c;
    }

    public final String b() {
        C4680f5 f10 = this.f42685a.j().f();
        return (f10 == null || AbstractC4660d.b(f10.k())) ? "NA" : (String) AbstractC1287s.m(f10.k());
    }

    public final byte[] c(int i10, boolean z10) {
        this.f42686b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f42686b.e(Boolean.FALSE);
        this.f42685a.i(this.f42686b.m());
        try {
            Z5.a();
            if (i10 == 0) {
                return new v8.d().j(C4741o3.f43112a).k(true).i().b(this.f42685a.j()).getBytes("utf-8");
            }
            C4749p4 j10 = this.f42685a.j();
            B0 b02 = new B0();
            C4741o3.f43112a.a(b02);
            return b02.b().a(j10);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    public final Q5 f(EnumC4728m4 enumC4728m4) {
        this.f42685a.f(enumC4728m4);
        return this;
    }

    public final Q5 g(C4666d5 c4666d5) {
        this.f42686b = c4666d5;
        return this;
    }
}
