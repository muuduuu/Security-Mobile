package l0;

import java.util.ArrayList;
import l0.C3592d;
import l0.C3597i;
import org.conscrypt.BuildConfig;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3590b implements C3592d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f36916e;

    /* renamed from: a, reason: collision with root package name */
    C3597i f36912a = null;

    /* renamed from: b, reason: collision with root package name */
    float f36913b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f36914c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f36915d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f36917f = false;

    /* renamed from: l0.b$a */
    public interface a {
        int a();

        C3597i b(int i10);

        float c(C3590b c3590b, boolean z10);

        void clear();

        void d();

        float e(int i10);

        float f(C3597i c3597i, boolean z10);

        float g(C3597i c3597i);

        boolean h(C3597i c3597i);

        void i(C3597i c3597i, float f10, boolean z10);

        void j(C3597i c3597i, float f10);

        void k(float f10);
    }

    public C3590b() {
    }

    private boolean u(C3597i c3597i, C3592d c3592d) {
        return c3597i.f36973m <= 1;
    }

    private C3597i w(boolean[] zArr, C3597i c3597i) {
        C3597i.a aVar;
        int a10 = this.f36916e.a();
        C3597i c3597i2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < a10; i10++) {
            float e10 = this.f36916e.e(i10);
            if (e10 < 0.0f) {
                C3597i b10 = this.f36916e.b(i10);
                if ((zArr == null || !zArr[b10.f36963c]) && b10 != c3597i && (((aVar = b10.f36970j) == C3597i.a.SLACK || aVar == C3597i.a.ERROR) && e10 < f10)) {
                    f10 = e10;
                    c3597i2 = b10;
                }
            }
        }
        return c3597i2;
    }

    public void A(C3592d c3592d, C3597i c3597i, boolean z10) {
        if (c3597i == null || !c3597i.f36967g) {
            return;
        }
        this.f36913b += c3597i.f36966f * this.f36916e.g(c3597i);
        this.f36916e.f(c3597i, z10);
        if (z10) {
            c3597i.e(this);
        }
        if (C3592d.f36924t && this.f36916e.a() == 0) {
            this.f36917f = true;
            c3592d.f36930a = true;
        }
    }

    public void B(C3592d c3592d, C3590b c3590b, boolean z10) {
        this.f36913b += c3590b.f36913b * this.f36916e.c(c3590b, z10);
        if (z10) {
            c3590b.f36912a.e(this);
        }
        if (C3592d.f36924t && this.f36912a != null && this.f36916e.a() == 0) {
            this.f36917f = true;
            c3592d.f36930a = true;
        }
    }

    public void C(C3592d c3592d, C3597i c3597i, boolean z10) {
        if (c3597i == null || !c3597i.f36974n) {
            return;
        }
        float g10 = this.f36916e.g(c3597i);
        this.f36913b += c3597i.f36976p * g10;
        this.f36916e.f(c3597i, z10);
        if (z10) {
            c3597i.e(this);
        }
        this.f36916e.i(c3592d.f36943n.f36921d[c3597i.f36975o], g10, z10);
        if (C3592d.f36924t && this.f36916e.a() == 0) {
            this.f36917f = true;
            c3592d.f36930a = true;
        }
    }

    public void D(C3592d c3592d) {
        if (c3592d.f36936g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int a10 = this.f36916e.a();
            for (int i10 = 0; i10 < a10; i10++) {
                C3597i b10 = this.f36916e.b(i10);
                if (b10.f36964d != -1 || b10.f36967g || b10.f36974n) {
                    this.f36915d.add(b10);
                }
            }
            int size = this.f36915d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    C3597i c3597i = (C3597i) this.f36915d.get(i11);
                    if (c3597i.f36967g) {
                        A(c3592d, c3597i, true);
                    } else if (c3597i.f36974n) {
                        C(c3592d, c3597i, true);
                    } else {
                        B(c3592d, c3592d.f36936g[c3597i.f36964d], true);
                    }
                }
                this.f36915d.clear();
            } else {
                z10 = true;
            }
        }
        if (C3592d.f36924t && this.f36912a != null && this.f36916e.a() == 0) {
            this.f36917f = true;
            c3592d.f36930a = true;
        }
    }

    @Override // l0.C3592d.a
    public void a(C3597i c3597i) {
        int i10 = c3597i.f36965e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f36916e.j(c3597i, f10);
    }

    @Override // l0.C3592d.a
    public void b(C3592d.a aVar) {
        if (aVar instanceof C3590b) {
            C3590b c3590b = (C3590b) aVar;
            this.f36912a = null;
            this.f36916e.clear();
            for (int i10 = 0; i10 < c3590b.f36916e.a(); i10++) {
                this.f36916e.i(c3590b.f36916e.b(i10), c3590b.f36916e.e(i10), true);
            }
        }
    }

    @Override // l0.C3592d.a
    public C3597i c(C3592d c3592d, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // l0.C3592d.a
    public void clear() {
        this.f36916e.clear();
        this.f36912a = null;
        this.f36913b = 0.0f;
    }

    public C3590b d(C3592d c3592d, int i10) {
        this.f36916e.j(c3592d.o(i10, "ep"), 1.0f);
        this.f36916e.j(c3592d.o(i10, "em"), -1.0f);
        return this;
    }

    C3590b e(C3597i c3597i, int i10) {
        this.f36916e.j(c3597i, i10);
        return this;
    }

    boolean f(C3592d c3592d) {
        boolean z10;
        C3597i g10 = g(c3592d);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f36916e.a() == 0) {
            this.f36917f = true;
        }
        return z10;
    }

    C3597i g(C3592d c3592d) {
        boolean u10;
        boolean u11;
        int a10 = this.f36916e.a();
        C3597i c3597i = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        C3597i c3597i2 = null;
        for (int i10 = 0; i10 < a10; i10++) {
            float e10 = this.f36916e.e(i10);
            C3597i b10 = this.f36916e.b(i10);
            if (b10.f36970j == C3597i.a.UNRESTRICTED) {
                if (c3597i == null) {
                    u11 = u(b10, c3592d);
                } else if (f10 > e10) {
                    u11 = u(b10, c3592d);
                } else if (!z10 && u(b10, c3592d)) {
                    f10 = e10;
                    c3597i = b10;
                    z10 = true;
                }
                z10 = u11;
                f10 = e10;
                c3597i = b10;
            } else if (c3597i == null && e10 < 0.0f) {
                if (c3597i2 == null) {
                    u10 = u(b10, c3592d);
                } else if (f11 > e10) {
                    u10 = u(b10, c3592d);
                } else if (!z11 && u(b10, c3592d)) {
                    f11 = e10;
                    c3597i2 = b10;
                    z11 = true;
                }
                z11 = u10;
                f11 = e10;
                c3597i2 = b10;
            }
        }
        return c3597i != null ? c3597i : c3597i2;
    }

    @Override // l0.C3592d.a
    public C3597i getKey() {
        return this.f36912a;
    }

    C3590b h(C3597i c3597i, C3597i c3597i2, int i10, float f10, C3597i c3597i3, C3597i c3597i4, int i11) {
        if (c3597i2 == c3597i3) {
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i4, 1.0f);
            this.f36916e.j(c3597i2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i2, -1.0f);
            this.f36916e.j(c3597i3, -1.0f);
            this.f36916e.j(c3597i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f36913b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f36916e.j(c3597i, -1.0f);
            this.f36916e.j(c3597i2, 1.0f);
            this.f36913b = i10;
        } else if (f10 >= 1.0f) {
            this.f36916e.j(c3597i4, -1.0f);
            this.f36916e.j(c3597i3, 1.0f);
            this.f36913b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f36916e.j(c3597i, f11 * 1.0f);
            this.f36916e.j(c3597i2, f11 * (-1.0f));
            this.f36916e.j(c3597i3, (-1.0f) * f10);
            this.f36916e.j(c3597i4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f36913b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    C3590b i(C3597i c3597i, int i10) {
        this.f36912a = c3597i;
        float f10 = i10;
        c3597i.f36966f = f10;
        this.f36913b = f10;
        this.f36917f = true;
        return this;
    }

    @Override // l0.C3592d.a
    public boolean isEmpty() {
        return this.f36912a == null && this.f36913b == 0.0f && this.f36916e.a() == 0;
    }

    C3590b j(C3597i c3597i, C3597i c3597i2, float f10) {
        this.f36916e.j(c3597i, -1.0f);
        this.f36916e.j(c3597i2, f10);
        return this;
    }

    public C3590b k(C3597i c3597i, C3597i c3597i2, C3597i c3597i3, C3597i c3597i4, float f10) {
        this.f36916e.j(c3597i, -1.0f);
        this.f36916e.j(c3597i2, 1.0f);
        this.f36916e.j(c3597i3, f10);
        this.f36916e.j(c3597i4, -f10);
        return this;
    }

    public C3590b l(float f10, float f11, float f12, C3597i c3597i, C3597i c3597i2, C3597i c3597i3, C3597i c3597i4) {
        this.f36913b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i2, -1.0f);
            this.f36916e.j(c3597i4, 1.0f);
            this.f36916e.j(c3597i3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f36916e.j(c3597i3, 1.0f);
            this.f36916e.j(c3597i4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i2, -1.0f);
            this.f36916e.j(c3597i4, f13);
            this.f36916e.j(c3597i3, -f13);
        }
        return this;
    }

    public C3590b m(C3597i c3597i, int i10) {
        if (i10 < 0) {
            this.f36913b = i10 * (-1);
            this.f36916e.j(c3597i, 1.0f);
        } else {
            this.f36913b = i10;
            this.f36916e.j(c3597i, -1.0f);
        }
        return this;
    }

    public C3590b n(C3597i c3597i, C3597i c3597i2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f36913b = i10;
        }
        if (z10) {
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i2, -1.0f);
        } else {
            this.f36916e.j(c3597i, -1.0f);
            this.f36916e.j(c3597i2, 1.0f);
        }
        return this;
    }

    public C3590b o(C3597i c3597i, C3597i c3597i2, C3597i c3597i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f36913b = i10;
        }
        if (z10) {
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i2, -1.0f);
            this.f36916e.j(c3597i3, -1.0f);
        } else {
            this.f36916e.j(c3597i, -1.0f);
            this.f36916e.j(c3597i2, 1.0f);
            this.f36916e.j(c3597i3, 1.0f);
        }
        return this;
    }

    public C3590b p(C3597i c3597i, C3597i c3597i2, C3597i c3597i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f36913b = i10;
        }
        if (z10) {
            this.f36916e.j(c3597i, 1.0f);
            this.f36916e.j(c3597i2, -1.0f);
            this.f36916e.j(c3597i3, 1.0f);
        } else {
            this.f36916e.j(c3597i, -1.0f);
            this.f36916e.j(c3597i2, 1.0f);
            this.f36916e.j(c3597i3, -1.0f);
        }
        return this;
    }

    public C3590b q(C3597i c3597i, C3597i c3597i2, C3597i c3597i3, C3597i c3597i4, float f10) {
        this.f36916e.j(c3597i3, 0.5f);
        this.f36916e.j(c3597i4, 0.5f);
        this.f36916e.j(c3597i, -0.5f);
        this.f36916e.j(c3597i2, -0.5f);
        this.f36913b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f36913b;
        if (f10 < 0.0f) {
            this.f36913b = f10 * (-1.0f);
            this.f36916e.d();
        }
    }

    boolean s() {
        C3597i c3597i = this.f36912a;
        return c3597i != null && (c3597i.f36970j == C3597i.a.UNRESTRICTED || this.f36913b >= 0.0f);
    }

    boolean t(C3597i c3597i) {
        return this.f36916e.h(c3597i);
    }

    public String toString() {
        return z();
    }

    public C3597i v(C3597i c3597i) {
        return w(null, c3597i);
    }

    void x(C3597i c3597i) {
        C3597i c3597i2 = this.f36912a;
        if (c3597i2 != null) {
            this.f36916e.j(c3597i2, -1.0f);
            this.f36912a.f36964d = -1;
            this.f36912a = null;
        }
        float f10 = this.f36916e.f(c3597i, true) * (-1.0f);
        this.f36912a = c3597i;
        if (f10 == 1.0f) {
            return;
        }
        this.f36913b /= f10;
        this.f36916e.k(f10);
    }

    public void y() {
        this.f36912a = null;
        this.f36916e.clear();
        this.f36913b = 0.0f;
        this.f36917f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String z() {
        boolean z10;
        String str = (this.f36912a == null ? BuildConfig.FLAVOR + "0" : BuildConfig.FLAVOR + this.f36912a) + " = ";
        if (this.f36913b != 0.0f) {
            str = str + this.f36913b;
            z10 = true;
        } else {
            z10 = false;
        }
        int a10 = this.f36916e.a();
        for (int i10 = 0; i10 < a10; i10++) {
            C3597i b10 = this.f36916e.b(i10);
            if (b10 != null) {
                float e10 = this.f36916e.e(i10);
                if (e10 != 0.0f) {
                    String c3597i = b10.toString();
                    if (!z10) {
                        if (e10 < 0.0f) {
                            str = str + "- ";
                            e10 *= -1.0f;
                        }
                        str = e10 == 1.0f ? str + c3597i : str + e10 + " " + c3597i;
                        z10 = true;
                    } else if (e10 > 0.0f) {
                        str = str + " + ";
                        if (e10 == 1.0f) {
                        }
                        z10 = true;
                    } else {
                        str = str + " - ";
                        e10 *= -1.0f;
                        if (e10 == 1.0f) {
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public C3590b(C3591c c3591c) {
        this.f36916e = new C3589a(this, c3591c);
    }
}
