package l0;

import java.util.Arrays;
import java.util.HashMap;
import l0.C3597i;
import o0.d;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3592d {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f36922r = false;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f36923s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f36924t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f36925u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f36926v = false;

    /* renamed from: w, reason: collision with root package name */
    private static int f36927w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public static long f36928x;

    /* renamed from: y, reason: collision with root package name */
    public static long f36929y;

    /* renamed from: d, reason: collision with root package name */
    private a f36933d;

    /* renamed from: g, reason: collision with root package name */
    C3590b[] f36936g;

    /* renamed from: n, reason: collision with root package name */
    final C3591c f36943n;

    /* renamed from: q, reason: collision with root package name */
    private a f36946q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f36930a = false;

    /* renamed from: b, reason: collision with root package name */
    int f36931b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f36932c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f36934e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f36935f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36937h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36938i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f36939j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f36940k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f36941l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f36942m = 32;

    /* renamed from: o, reason: collision with root package name */
    private C3597i[] f36944o = new C3597i[f36927w];

    /* renamed from: p, reason: collision with root package name */
    private int f36945p = 0;

    /* renamed from: l0.d$a */
    interface a {
        void a(C3597i c3597i);

        void b(a aVar);

        C3597i c(C3592d c3592d, boolean[] zArr);

        void clear();

        C3597i getKey();

        boolean isEmpty();
    }

    /* renamed from: l0.d$b */
    class b extends C3590b {
        public b(C3591c c3591c) {
            this.f36916e = new j(this, c3591c);
        }
    }

    public C3592d() {
        this.f36936g = null;
        this.f36936g = new C3590b[32];
        D();
        C3591c c3591c = new C3591c();
        this.f36943n = c3591c;
        this.f36933d = new C3596h(c3591c);
        if (f36926v) {
            this.f36946q = new b(c3591c);
        } else {
            this.f36946q = new C3590b(c3591c);
        }
    }

    private final int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f36940k; i10++) {
            this.f36939j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f36940k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f36939j[aVar.getKey().f36963c] = true;
            }
            C3597i c10 = aVar.c(this, this.f36939j);
            if (c10 != null) {
                boolean[] zArr = this.f36939j;
                int i12 = c10.f36963c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (c10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f36941l; i14++) {
                    C3590b c3590b = this.f36936g[i14];
                    if (c3590b.f36912a.f36970j != C3597i.a.UNRESTRICTED && !c3590b.f36917f && c3590b.t(c10)) {
                        float g10 = c3590b.f36916e.g(c10);
                        if (g10 < 0.0f) {
                            float f11 = (-c3590b.f36913b) / g10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C3590b c3590b2 = this.f36936g[i13];
                    c3590b2.f36912a.f36964d = -1;
                    c3590b2.x(c10);
                    C3597i c3597i = c3590b2.f36912a;
                    c3597i.f36964d = i13;
                    c3597i.q(this, c3590b2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void D() {
        int i10 = 0;
        if (f36926v) {
            while (i10 < this.f36941l) {
                C3590b c3590b = this.f36936g[i10];
                if (c3590b != null) {
                    this.f36943n.f36918a.a(c3590b);
                }
                this.f36936g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f36941l) {
            C3590b c3590b2 = this.f36936g[i10];
            if (c3590b2 != null) {
                this.f36943n.f36919b.a(c3590b2);
            }
            this.f36936g[i10] = null;
            i10++;
        }
    }

    private C3597i a(C3597i.a aVar, String str) {
        C3597i c3597i = (C3597i) this.f36943n.f36920c.b();
        if (c3597i == null) {
            c3597i = new C3597i(aVar, str);
            c3597i.p(aVar, str);
        } else {
            c3597i.n();
            c3597i.p(aVar, str);
        }
        int i10 = this.f36945p;
        int i11 = f36927w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f36927w = i12;
            this.f36944o = (C3597i[]) Arrays.copyOf(this.f36944o, i12);
        }
        C3597i[] c3597iArr = this.f36944o;
        int i13 = this.f36945p;
        this.f36945p = i13 + 1;
        c3597iArr[i13] = c3597i;
        return c3597i;
    }

    private final void l(C3590b c3590b) {
        int i10;
        if (f36924t && c3590b.f36917f) {
            c3590b.f36912a.o(this, c3590b.f36913b);
        } else {
            C3590b[] c3590bArr = this.f36936g;
            int i11 = this.f36941l;
            c3590bArr[i11] = c3590b;
            C3597i c3597i = c3590b.f36912a;
            c3597i.f36964d = i11;
            this.f36941l = i11 + 1;
            c3597i.q(this, c3590b);
        }
        if (f36924t && this.f36930a) {
            int i12 = 0;
            while (i12 < this.f36941l) {
                if (this.f36936g[i12] == null) {
                    System.out.println("WTF");
                }
                C3590b c3590b2 = this.f36936g[i12];
                if (c3590b2 != null && c3590b2.f36917f) {
                    c3590b2.f36912a.o(this, c3590b2.f36913b);
                    if (f36926v) {
                        this.f36943n.f36918a.a(c3590b2);
                    } else {
                        this.f36943n.f36919b.a(c3590b2);
                    }
                    this.f36936g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f36941l;
                        if (i13 >= i10) {
                            break;
                        }
                        C3590b[] c3590bArr2 = this.f36936g;
                        int i15 = i13 - 1;
                        C3590b c3590b3 = c3590bArr2[i13];
                        c3590bArr2[i15] = c3590b3;
                        C3597i c3597i2 = c3590b3.f36912a;
                        if (c3597i2.f36964d == i13) {
                            c3597i2.f36964d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f36936g[i14] = null;
                    }
                    this.f36941l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f36930a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f36941l; i10++) {
            C3590b c3590b = this.f36936g[i10];
            c3590b.f36912a.f36966f = c3590b.f36913b;
        }
    }

    public static C3590b s(C3592d c3592d, C3597i c3597i, C3597i c3597i2, float f10) {
        return c3592d.r().j(c3597i, c3597i2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f36941l; i10++) {
            C3590b c3590b = this.f36936g[i10];
            if (c3590b.f36912a.f36970j != C3597i.a.UNRESTRICTED && c3590b.f36913b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = 0;
                    while (true) {
                        if (i12 >= this.f36941l) {
                            break;
                        }
                        C3590b c3590b2 = this.f36936g[i12];
                        if (c3590b2.f36912a.f36970j != C3597i.a.UNRESTRICTED && !c3590b2.f36917f && c3590b2.f36913b < 0.0f) {
                            int i16 = 9;
                            if (f36925u) {
                                int a10 = c3590b2.f36916e.a();
                                int i17 = 0;
                                while (i17 < a10) {
                                    C3597i b10 = c3590b2.f36916e.b(i17);
                                    float g10 = c3590b2.f36916e.g(b10);
                                    if (g10 > 0.0f) {
                                        int i18 = 0;
                                        while (i18 < i16) {
                                            float f11 = b10.f36968h[i18] / g10;
                                            if ((f11 < f10 && i18 == i15) || i18 > i15) {
                                                i15 = i18;
                                                i14 = b10.f36963c;
                                                i13 = i12;
                                                f10 = f11;
                                            }
                                            i18++;
                                            i16 = 9;
                                        }
                                    }
                                    i17++;
                                    i16 = 9;
                                }
                            } else {
                                for (int i19 = 1; i19 < this.f36940k; i19++) {
                                    C3597i c3597i = this.f36943n.f36921d[i19];
                                    float g11 = c3590b2.f36916e.g(c3597i);
                                    if (g11 > 0.0f) {
                                        for (int i20 = 0; i20 < 9; i20++) {
                                            float f12 = c3597i.f36968h[i20] / g11;
                                            if ((f12 < f10 && i20 == i15) || i20 > i15) {
                                                i13 = i12;
                                                i14 = i19;
                                                i15 = i20;
                                                f10 = f12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                    if (i13 != -1) {
                        C3590b c3590b3 = this.f36936g[i13];
                        c3590b3.f36912a.f36964d = -1;
                        c3590b3.x(this.f36943n.f36921d[i14]);
                        C3597i c3597i2 = c3590b3.f36912a;
                        c3597i2.f36964d = i13;
                        c3597i2.q(this, c3590b3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f36940k / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static AbstractC3593e x() {
        return null;
    }

    private void z() {
        int i10 = this.f36934e * 2;
        this.f36934e = i10;
        this.f36936g = (C3590b[]) Arrays.copyOf(this.f36936g, i10);
        C3591c c3591c = this.f36943n;
        c3591c.f36921d = (C3597i[]) Arrays.copyOf(c3591c.f36921d, this.f36934e);
        int i11 = this.f36934e;
        this.f36939j = new boolean[i11];
        this.f36935f = i11;
        this.f36942m = i11;
    }

    public void A() {
        if (this.f36933d.isEmpty()) {
            n();
            return;
        }
        if (!this.f36937h && !this.f36938i) {
            B(this.f36933d);
            return;
        }
        for (int i10 = 0; i10 < this.f36941l; i10++) {
            if (!this.f36936g[i10].f36917f) {
                B(this.f36933d);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        C3591c c3591c;
        int i10 = 0;
        while (true) {
            c3591c = this.f36943n;
            C3597i[] c3597iArr = c3591c.f36921d;
            if (i10 >= c3597iArr.length) {
                break;
            }
            C3597i c3597i = c3597iArr[i10];
            if (c3597i != null) {
                c3597i.n();
            }
            i10++;
        }
        c3591c.f36920c.c(this.f36944o, this.f36945p);
        this.f36945p = 0;
        Arrays.fill(this.f36943n.f36921d, (Object) null);
        HashMap hashMap = this.f36932c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f36931b = 0;
        this.f36933d.clear();
        this.f36940k = 1;
        for (int i11 = 0; i11 < this.f36941l; i11++) {
            C3590b c3590b = this.f36936g[i11];
            if (c3590b != null) {
                c3590b.f36914c = false;
            }
        }
        D();
        this.f36941l = 0;
        if (f36926v) {
            this.f36946q = new b(this.f36943n);
        } else {
            this.f36946q = new C3590b(this.f36943n);
        }
    }

    public void b(o0.e eVar, o0.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        C3597i q10 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        C3597i q11 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        C3597i q12 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        C3597i q13 = q(eVar.m(bVar4));
        C3597i q14 = q(eVar2.m(bVar));
        C3597i q15 = q(eVar2.m(bVar2));
        C3597i q16 = q(eVar2.m(bVar3));
        C3597i q17 = q(eVar2.m(bVar4));
        C3590b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        C3590b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(C3597i c3597i, C3597i c3597i2, int i10, float f10, C3597i c3597i3, C3597i c3597i4, int i11, int i12) {
        C3590b r10 = r();
        r10.h(c3597i, c3597i2, i10, f10, c3597i3, c3597i4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(C3590b c3590b) {
        C3597i v10;
        if (c3590b == null) {
            return;
        }
        boolean z10 = true;
        if (this.f36941l + 1 >= this.f36942m || this.f36940k + 1 >= this.f36935f) {
            z();
        }
        boolean z11 = false;
        if (!c3590b.f36917f) {
            c3590b.D(this);
            if (c3590b.isEmpty()) {
                return;
            }
            c3590b.r();
            if (c3590b.f(this)) {
                C3597i p10 = p();
                c3590b.f36912a = p10;
                int i10 = this.f36941l;
                l(c3590b);
                if (this.f36941l == i10 + 1) {
                    this.f36946q.b(c3590b);
                    C(this.f36946q, true);
                    if (p10.f36964d == -1) {
                        if (c3590b.f36912a == p10 && (v10 = c3590b.v(p10)) != null) {
                            c3590b.x(v10);
                        }
                        if (!c3590b.f36917f) {
                            c3590b.f36912a.q(this, c3590b);
                        }
                        if (f36926v) {
                            this.f36943n.f36918a.a(c3590b);
                        } else {
                            this.f36943n.f36919b.a(c3590b);
                        }
                        this.f36941l--;
                    }
                    if (c3590b.s()) {
                        return;
                    } else {
                        z11 = z10;
                    }
                }
            }
            z10 = false;
            if (c3590b.s()) {
            }
        }
        if (z11) {
            return;
        }
        l(c3590b);
    }

    public C3590b e(C3597i c3597i, C3597i c3597i2, int i10, int i11) {
        if (f36923s && i11 == 8 && c3597i2.f36967g && c3597i.f36964d == -1) {
            c3597i.o(this, c3597i2.f36966f + i10);
            return null;
        }
        C3590b r10 = r();
        r10.n(c3597i, c3597i2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(C3597i c3597i, int i10) {
        if (f36923s && c3597i.f36964d == -1) {
            float f10 = i10;
            c3597i.o(this, f10);
            for (int i11 = 0; i11 < this.f36931b + 1; i11++) {
                C3597i c3597i2 = this.f36943n.f36921d[i11];
                if (c3597i2 != null && c3597i2.f36974n && c3597i2.f36975o == c3597i.f36963c) {
                    c3597i2.o(this, c3597i2.f36976p + f10);
                }
            }
            return;
        }
        int i12 = c3597i.f36964d;
        if (i12 == -1) {
            C3590b r10 = r();
            r10.i(c3597i, i10);
            d(r10);
            return;
        }
        C3590b c3590b = this.f36936g[i12];
        if (c3590b.f36917f) {
            c3590b.f36913b = i10;
            return;
        }
        if (c3590b.f36916e.a() == 0) {
            c3590b.f36917f = true;
            c3590b.f36913b = i10;
        } else {
            C3590b r11 = r();
            r11.m(c3597i, i10);
            d(r11);
        }
    }

    public void g(C3597i c3597i, C3597i c3597i2, int i10, boolean z10) {
        C3590b r10 = r();
        C3597i t10 = t();
        t10.f36965e = 0;
        r10.o(c3597i, c3597i2, t10, i10);
        d(r10);
    }

    public void h(C3597i c3597i, C3597i c3597i2, int i10, int i11) {
        C3590b r10 = r();
        C3597i t10 = t();
        t10.f36965e = 0;
        r10.o(c3597i, c3597i2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f36916e.g(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(C3597i c3597i, C3597i c3597i2, int i10, boolean z10) {
        C3590b r10 = r();
        C3597i t10 = t();
        t10.f36965e = 0;
        r10.p(c3597i, c3597i2, t10, i10);
        d(r10);
    }

    public void j(C3597i c3597i, C3597i c3597i2, int i10, int i11) {
        C3590b r10 = r();
        C3597i t10 = t();
        t10.f36965e = 0;
        r10.p(c3597i, c3597i2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f36916e.g(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(C3597i c3597i, C3597i c3597i2, C3597i c3597i3, C3597i c3597i4, float f10, int i10) {
        C3590b r10 = r();
        r10.k(c3597i, c3597i2, c3597i3, c3597i4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    void m(C3590b c3590b, int i10, int i11) {
        c3590b.e(o(i11, null), i10);
    }

    public C3597i o(int i10, String str) {
        if (this.f36940k + 1 >= this.f36935f) {
            z();
        }
        C3597i a10 = a(C3597i.a.ERROR, str);
        int i11 = this.f36931b + 1;
        this.f36931b = i11;
        this.f36940k++;
        a10.f36963c = i11;
        a10.f36965e = i10;
        this.f36943n.f36921d[i11] = a10;
        this.f36933d.a(a10);
        return a10;
    }

    public C3597i p() {
        if (this.f36940k + 1 >= this.f36935f) {
            z();
        }
        C3597i a10 = a(C3597i.a.SLACK, null);
        int i10 = this.f36931b + 1;
        this.f36931b = i10;
        this.f36940k++;
        a10.f36963c = i10;
        this.f36943n.f36921d[i10] = a10;
        return a10;
    }

    public C3597i q(Object obj) {
        C3597i c3597i = null;
        if (obj == null) {
            return null;
        }
        if (this.f36940k + 1 >= this.f36935f) {
            z();
        }
        if (obj instanceof o0.d) {
            o0.d dVar = (o0.d) obj;
            c3597i = dVar.h();
            if (c3597i == null) {
                dVar.r(this.f36943n);
                c3597i = dVar.h();
            }
            int i10 = c3597i.f36963c;
            if (i10 == -1 || i10 > this.f36931b || this.f36943n.f36921d[i10] == null) {
                if (i10 != -1) {
                    c3597i.n();
                }
                int i11 = this.f36931b + 1;
                this.f36931b = i11;
                this.f36940k++;
                c3597i.f36963c = i11;
                c3597i.f36970j = C3597i.a.UNRESTRICTED;
                this.f36943n.f36921d[i11] = c3597i;
            }
        }
        return c3597i;
    }

    public C3590b r() {
        C3590b c3590b;
        if (f36926v) {
            c3590b = (C3590b) this.f36943n.f36918a.b();
            if (c3590b == null) {
                c3590b = new b(this.f36943n);
                f36929y++;
            } else {
                c3590b.y();
            }
        } else {
            c3590b = (C3590b) this.f36943n.f36919b.b();
            if (c3590b == null) {
                c3590b = new C3590b(this.f36943n);
                f36928x++;
            } else {
                c3590b.y();
            }
        }
        C3597i.d();
        return c3590b;
    }

    public C3597i t() {
        if (this.f36940k + 1 >= this.f36935f) {
            z();
        }
        C3597i a10 = a(C3597i.a.SLACK, null);
        int i10 = this.f36931b + 1;
        this.f36931b = i10;
        this.f36940k++;
        a10.f36963c = i10;
        this.f36943n.f36921d[i10] = a10;
        return a10;
    }

    public C3591c w() {
        return this.f36943n;
    }

    public int y(Object obj) {
        C3597i h10 = ((o0.d) obj).h();
        if (h10 != null) {
            return (int) (h10.f36966f + 0.5f);
        }
        return 0;
    }

    public void v(AbstractC3593e abstractC3593e) {
    }
}
