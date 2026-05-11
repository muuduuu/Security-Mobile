package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.Arrays;
import r4.AbstractC4012a;

/* renamed from: com.facebook.react.uimanager.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1971u0 implements InterfaceC1969t0 {

    /* renamed from: x, reason: collision with root package name */
    private static final com.facebook.yoga.c f22471x = C1977x0.a();

    /* renamed from: a, reason: collision with root package name */
    private int f22472a;

    /* renamed from: b, reason: collision with root package name */
    private String f22473b;

    /* renamed from: c, reason: collision with root package name */
    private int f22474c;

    /* renamed from: d, reason: collision with root package name */
    private F0 f22475d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22476e;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f22478g;

    /* renamed from: h, reason: collision with root package name */
    private C1971u0 f22479h;

    /* renamed from: i, reason: collision with root package name */
    private C1971u0 f22480i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22481j;

    /* renamed from: l, reason: collision with root package name */
    private C1971u0 f22483l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f22484m;

    /* renamed from: n, reason: collision with root package name */
    private int f22485n;

    /* renamed from: o, reason: collision with root package name */
    private int f22486o;

    /* renamed from: p, reason: collision with root package name */
    private int f22487p;

    /* renamed from: q, reason: collision with root package name */
    private int f22488q;

    /* renamed from: s, reason: collision with root package name */
    private final float[] f22490s;

    /* renamed from: u, reason: collision with root package name */
    private com.facebook.yoga.r f22492u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f22493v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f22494w;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22477f = true;

    /* renamed from: k, reason: collision with root package name */
    private int f22482k = 0;

    /* renamed from: t, reason: collision with root package name */
    private final boolean[] f22491t = new boolean[9];

    /* renamed from: r, reason: collision with root package name */
    private final D0 f22489r = new D0(0.0f);

    public C1971u0() {
        float[] fArr = new float[9];
        this.f22490s = fArr;
        if (u()) {
            this.f22492u = null;
            return;
        }
        com.facebook.yoga.r rVar = (com.facebook.yoga.r) n1.a().b();
        rVar = rVar == null ? com.facebook.yoga.s.a(f22471x) : rVar;
        this.f22492u = rVar;
        rVar.G(this);
        Arrays.fill(fArr, Float.NaN);
    }

    private int n0() {
        EnumC1934b0 I10 = I();
        if (I10 == EnumC1934b0.NONE) {
            return this.f22482k;
        }
        if (I10 == EnumC1934b0.LEAF) {
            return this.f22482k + 1;
        }
        return 1;
    }

    private void t1(int i10) {
        if (I() != EnumC1934b0.PARENT) {
            for (C1971u0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f22482k += i10;
                if (parent.I() == EnumC1934b0.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void u1() {
        for (int i10 = 0; i10 <= 8; i10++) {
            if (i10 == 0 || i10 == 2 || i10 == 4 || i10 == 5) {
                if (com.facebook.yoga.g.a(this.f22490s[i10]) && com.facebook.yoga.g.a(this.f22490s[6]) && com.facebook.yoga.g.a(this.f22490s[8])) {
                    this.f22492u.k0(com.facebook.yoga.j.fromInt(i10), this.f22489r.b(i10));
                }
                if (this.f22491t[i10]) {
                    this.f22492u.l0(com.facebook.yoga.j.fromInt(i10), this.f22490s[i10]);
                } else {
                    this.f22492u.k0(com.facebook.yoga.j.fromInt(i10), this.f22490s[i10]);
                }
            } else if (i10 == 1 || i10 == 3) {
                if (com.facebook.yoga.g.a(this.f22490s[i10]) && com.facebook.yoga.g.a(this.f22490s[7]) && com.facebook.yoga.g.a(this.f22490s[8])) {
                    this.f22492u.k0(com.facebook.yoga.j.fromInt(i10), this.f22489r.b(i10));
                }
                if (this.f22491t[i10]) {
                }
            } else {
                if (com.facebook.yoga.g.a(this.f22490s[i10])) {
                    this.f22492u.k0(com.facebook.yoga.j.fromInt(i10), this.f22489r.b(i10));
                }
                if (this.f22491t[i10]) {
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final void A(int i10) {
        this.f22474c = i10;
    }

    public void A0(R0 r02) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void B(F0 f02) {
        this.f22475d = f02;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C1971u0 f(int i10) {
        ArrayList arrayList = this.f22478g;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
        }
        C1971u0 c1971u0 = (C1971u0) arrayList.remove(i10);
        c1971u0.f22479h = null;
        if (this.f22492u != null && !w0()) {
            this.f22492u.x(i10);
        }
        y0();
        int n02 = c1971u0.n0();
        this.f22482k -= n02;
        t1(-n02);
        return c1971u0;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void C(float f10) {
        this.f22492u.p0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final C1971u0 U(int i10) {
        AbstractC4012a.c(this.f22484m);
        C1971u0 c1971u0 = (C1971u0) this.f22484m.remove(i10);
        c1971u0.f22483l = null;
        return c1971u0;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public int D() {
        return this.f22487p;
    }

    public void D0(com.facebook.yoga.a aVar) {
        this.f22492u.z(aVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final YogaValue E() {
        return this.f22492u.p();
    }

    public void E0(com.facebook.yoga.a aVar) {
        this.f22492u.A(aVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public int F() {
        return this.f22486o;
    }

    public void F0(com.facebook.yoga.a aVar) {
        this.f22492u.B(aVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void G(Object obj) {
    }

    public void G0(com.facebook.yoga.b bVar) {
        this.f22492u.D(bVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final F0 H() {
        return (F0) AbstractC4012a.c(this.f22475d);
    }

    public void H0(int i10, float f10) {
        this.f22492u.E(com.facebook.yoga.j.fromInt(i10), f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public EnumC1934b0 I() {
        return (u() || d0()) ? EnumC1934b0.NONE : p0() ? EnumC1934b0.LEAF : EnumC1934b0.PARENT;
    }

    public void I0(float f10) {
        this.f22492u.R(com.facebook.yoga.m.COLUMN, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final int J() {
        AbstractC4012a.a(this.f22474c != 0);
        return this.f22474c;
    }

    public void J0(float f10) {
        this.f22492u.S(com.facebook.yoga.m.COLUMN, f10);
    }

    public void K0(int i10, float f10) {
        this.f22489r.c(i10, f10);
        u1();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public boolean L(float f10, float f11) {
        if (!o0()) {
            return false;
        }
        float V10 = V();
        float R10 = R();
        float f12 = f10 + V10;
        int round = Math.round(f12);
        float f13 = f11 + R10;
        int round2 = Math.round(f13);
        return (Math.round(V10) == this.f22485n && Math.round(R10) == this.f22486o && Math.round(f12 + e0()) - round == this.f22487p && Math.round(f13 + l()) - round2 == this.f22488q) ? false : true;
    }

    public void L0(com.facebook.yoga.i iVar) {
        this.f22492u.J(iVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final boolean M() {
        return this.f22476e;
    }

    public void M0(float f10) {
        this.f22492u.L(f10);
    }

    public void N0() {
        this.f22492u.M();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final String O() {
        return (String) AbstractC4012a.c(this.f22473b);
    }

    public void O0(float f10) {
        this.f22492u.N(f10);
    }

    public void P0(com.facebook.yoga.l lVar) {
        this.f22492u.O(lVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void Q(int i10) {
        this.f22472a = i10;
    }

    public void Q0(com.facebook.yoga.x xVar) {
        this.f22492u.s0(xVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final float R() {
        return this.f22492u.o();
    }

    public void R0(float f10) {
        this.f22492u.R(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void S(float f10, float f11) {
        this.f22492u.b(f10, f11);
    }

    public void S0(float f10) {
        this.f22492u.R(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public int T() {
        return this.f22485n;
    }

    public void T0(com.facebook.yoga.n nVar) {
        this.f22492u.W(nVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final void P(C1971u0 c1971u0) {
        this.f22480i = c1971u0;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final float V() {
        return this.f22492u.n();
    }

    public void V0(int i10, float f10) {
        this.f22492u.X(com.facebook.yoga.j.fromInt(i10), f10);
    }

    public void W0(int i10) {
        this.f22492u.Y(com.facebook.yoga.j.fromInt(i10));
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void X(C1938d0 c1938d0) {
    }

    public void X0(int i10, float f10) {
        this.f22492u.Z(com.facebook.yoga.j.fromInt(i10), f10);
    }

    public void Y0(com.facebook.yoga.o oVar) {
        this.f22492u.e0(oVar);
    }

    public void Z0(com.facebook.yoga.u uVar) {
        this.f22492u.j0(uVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void a() {
        com.facebook.yoga.r rVar = this.f22492u;
        if (rVar != null) {
            rVar.y();
            n1.a().a(this.f22492u);
        }
    }

    public void a1(int i10, float f10) {
        this.f22490s[i10] = f10;
        this.f22491t[i10] = !com.facebook.yoga.g.a(f10);
        u1();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final void b0(boolean z10) {
        AbstractC4012a.b(getParent() == null, "Must remove from no opt parent first");
        AbstractC4012a.b(this.f22483l == null, "Must remove from native parent first");
        AbstractC4012a.b(x() == 0, "Must remove all native children first");
        this.f22481j = z10;
    }

    public void b1(int i10, float f10) {
        this.f22492u.m0(com.facebook.yoga.j.fromInt(i10), f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final int c() {
        ArrayList arrayList = this.f22478g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final void c0(C1973v0 c1973v0) {
        e1.f(this, c1973v0);
        z0();
    }

    public void c1(int i10, float f10) {
        this.f22492u.n0(com.facebook.yoga.j.fromInt(i10), f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public int d() {
        return this.f22488q;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final boolean d0() {
        return this.f22481j;
    }

    public void d1(com.facebook.yoga.v vVar) {
        this.f22492u.o0(vVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final void e() {
        this.f22477f = false;
        if (o0()) {
            x0();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final float e0() {
        return this.f22492u.m();
    }

    public void e1(float f10) {
        this.f22492u.R(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void K(C1971u0 c1971u0, int i10) {
        if (this.f22478g == null) {
            this.f22478g = new ArrayList(4);
        }
        this.f22478g.add(i10, c1971u0);
        c1971u0.f22479h = this;
        if (this.f22492u != null && !w0()) {
            com.facebook.yoga.r rVar = c1971u0.f22492u;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + c1971u0.toString() + "' to a '" + toString() + "')");
            }
            this.f22492u.a(rVar, i10);
        }
        y0();
        int n02 = c1971u0.n0();
        this.f22482k += n02;
        t1(n02);
    }

    public void f1(float f10) {
        this.f22492u.S(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void g(float f10) {
        this.f22492u.T(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void z(C1971u0 c1971u0, int i10) {
        AbstractC4012a.a(I() == EnumC1934b0.PARENT);
        AbstractC4012a.a(c1971u0.I() != EnumC1934b0.NONE);
        if (this.f22484m == null) {
            this.f22484m = new ArrayList(4);
        }
        this.f22484m.add(i10, c1971u0);
        c1971u0.f22483l = this;
    }

    public void g1(float f10) {
        this.f22492u.C(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public Integer getHeightMeasureSpec() {
        return this.f22494w;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final com.facebook.yoga.h getLayoutDirection() {
        return this.f22492u.i();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public Integer getWidthMeasureSpec() {
        return this.f22493v;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void h(int i10, int i11) {
        this.f22493v = Integer.valueOf(i10);
        this.f22494w = Integer.valueOf(i11);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final C1971u0 b(int i10) {
        ArrayList arrayList = this.f22478g;
        if (arrayList != null) {
            return (C1971u0) arrayList.get(i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    public void h1() {
        this.f22492u.U();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void i() {
        if (!u()) {
            this.f22492u.d();
        } else if (getParent() != null) {
            getParent().i();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final C1971u0 Y() {
        C1971u0 c1971u0 = this.f22480i;
        return c1971u0 != null ? c1971u0 : a0();
    }

    public void i1(float f10) {
        this.f22492u.V(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final void j(String str) {
        this.f22473b = str;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final int w(C1971u0 c1971u0) {
        int i10 = 0;
        for (int i11 = 0; i11 < c(); i11++) {
            C1971u0 b10 = b(i11);
            if (c1971u0 == b10) {
                return i10;
            }
            i10 += b10.n0();
        }
        throw new RuntimeException("Child " + c1971u0.r() + " was not a child of " + this.f22472a);
    }

    public void j1(float f10) {
        this.f22492u.a0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void k(com.facebook.yoga.h hVar) {
        this.f22492u.H(hVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final C1971u0 a0() {
        return this.f22483l;
    }

    public void k1(float f10) {
        this.f22492u.b0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final float l() {
        return this.f22492u.k();
    }

    public final float l0(int i10) {
        return this.f22492u.l(com.facebook.yoga.j.fromInt(i10));
    }

    public void l1(float f10) {
        this.f22492u.c0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final boolean m() {
        return this.f22477f || o0() || t0();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final C1971u0 getParent() {
        return this.f22479h;
    }

    public void m1(float f10) {
        this.f22492u.d0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final YogaValue n() {
        return this.f22492u.h();
    }

    public void n1(float f10) {
        this.f22492u.f0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public Iterable o() {
        if (v0()) {
            return null;
        }
        return this.f22478g;
    }

    public final boolean o0() {
        com.facebook.yoga.r rVar = this.f22492u;
        return rVar != null && rVar.q();
    }

    public void o1(float f10) {
        this.f22492u.g0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void p(float f10, float f11, R0 r02, C1938d0 c1938d0) {
        if (this.f22477f) {
            A0(r02);
        }
        if (o0()) {
            float V10 = V();
            float R10 = R();
            float f12 = f10 + V10;
            int round = Math.round(f12);
            float f13 = f11 + R10;
            int round2 = Math.round(f13);
            int round3 = Math.round(f12 + e0());
            int round4 = Math.round(f13 + l());
            int round5 = Math.round(V10);
            int round6 = Math.round(R10);
            int i10 = round3 - round;
            int i11 = round4 - round2;
            boolean z10 = (round5 == this.f22485n && round6 == this.f22486o && i10 == this.f22487p && i11 == this.f22488q) ? false : true;
            this.f22485n = round5;
            this.f22486o = round6;
            this.f22487p = i10;
            this.f22488q = i11;
            if (z10) {
                if (c1938d0 != null) {
                    c1938d0.l(this);
                } else {
                    r02.P(getParent().r(), r(), T(), F(), D(), d(), getLayoutDirection());
                }
            }
        }
    }

    public boolean p0() {
        return false;
    }

    public void p1(float f10) {
        this.f22492u.h0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void q() {
        if (c() == 0) {
            return;
        }
        int i10 = 0;
        for (int c10 = c() - 1; c10 >= 0; c10--) {
            if (this.f22492u != null && !w0()) {
                this.f22492u.x(c10);
            }
            C1971u0 b10 = b(c10);
            b10.f22479h = null;
            i10 += b10.n0();
            b10.a();
        }
        ((ArrayList) AbstractC4012a.c(this.f22478g)).clear();
        y0();
        this.f22482k -= i10;
        t1(-i10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final int N(C1971u0 c1971u0) {
        ArrayList arrayList = this.f22478g;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(c1971u0);
    }

    public void q1(float f10) {
        this.f22492u.i0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final int r() {
        return this.f22472a;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final int y(C1971u0 c1971u0) {
        AbstractC4012a.c(this.f22484m);
        return this.f22484m.indexOf(c1971u0);
    }

    public void r1() {
        this.f22492u.q0();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final void s() {
        ArrayList arrayList = this.f22484m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1971u0) this.f22484m.get(size)).f22483l = null;
            }
            this.f22484m.clear();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public boolean Z(C1971u0 c1971u0) {
        for (C1971u0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == c1971u0) {
                return true;
            }
        }
        return false;
    }

    public void s1(float f10) {
        this.f22492u.r0(f10);
    }

    public void setFlex(float f10) {
        this.f22492u.K(f10);
    }

    public void setFlexGrow(float f10) {
        this.f22492u.P(f10);
    }

    public void setFlexShrink(float f10) {
        this.f22492u.Q(f10);
    }

    public void setShouldNotifyOnLayout(boolean z10) {
        this.f22476e = z10;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void t() {
        S(Float.NaN, Float.NaN);
    }

    public final boolean t0() {
        com.facebook.yoga.r rVar = this.f22492u;
        return rVar != null && rVar.s();
    }

    public String toString() {
        return "[" + this.f22473b + " " + r() + "]";
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public boolean u() {
        return false;
    }

    public boolean u0() {
        return this.f22492u.v();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public void v(int i10, float f10) {
        this.f22490s[i10] = f10;
        this.f22491t[i10] = false;
        u1();
    }

    public boolean v0() {
        return false;
    }

    public boolean w0() {
        return u0();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1969t0
    public final int x() {
        ArrayList arrayList = this.f22484m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void x0() {
        com.facebook.yoga.r rVar = this.f22492u;
        if (rVar != null) {
            rVar.w();
        }
    }

    public void y0() {
        if (this.f22477f) {
            return;
        }
        this.f22477f = true;
        C1971u0 parent = getParent();
        if (parent != null) {
            parent.y0();
        }
    }

    public void z0() {
    }
}
