package p0;

import o0.d;
import o0.e;
import p0.f;
import p0.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f38261k;

    /* renamed from: l, reason: collision with root package name */
    g f38262l;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38263a;

        static {
            int[] iArr = new int[p.b.values().length];
            f38263a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38263a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38263a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(o0.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f38261k = fVar;
        this.f38262l = null;
        this.f38286h.f38239e = f.a.TOP;
        this.f38287i.f38239e = f.a.BOTTOM;
        fVar.f38239e = f.a.BASELINE;
        this.f38284f = 1;
    }

    @Override // p0.p, p0.d
    public void a(d dVar) {
        float f10;
        float t10;
        float f11;
        int i10;
        int i11 = a.f38263a[this.f38288j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            o0.e eVar = this.f38280b;
            n(dVar, eVar.f37697P, eVar.f37699R, 1);
            return;
        }
        g gVar = this.f38283e;
        if (gVar.f38237c && !gVar.f38244j && this.f38282d == e.b.MATCH_CONSTRAINT) {
            o0.e eVar2 = this.f38280b;
            int i12 = eVar2.f37754x;
            if (i12 == 2) {
                o0.e I10 = eVar2.I();
                if (I10 != null) {
                    if (I10.f37718f.f38283e.f38244j) {
                        this.f38283e.d((int) ((r7.f38241g * this.f38280b.f37681E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f37716e.f38283e.f38244j) {
                int u10 = eVar2.u();
                if (u10 == -1) {
                    o0.e eVar3 = this.f38280b;
                    f10 = eVar3.f37716e.f38283e.f38241g;
                    t10 = eVar3.t();
                } else if (u10 == 0) {
                    f11 = r7.f37716e.f38283e.f38241g * this.f38280b.t();
                    i10 = (int) (f11 + 0.5f);
                    this.f38283e.d(i10);
                } else if (u10 != 1) {
                    i10 = 0;
                    this.f38283e.d(i10);
                } else {
                    o0.e eVar4 = this.f38280b;
                    f10 = eVar4.f37716e.f38283e.f38241g;
                    t10 = eVar4.t();
                }
                f11 = f10 / t10;
                i10 = (int) (f11 + 0.5f);
                this.f38283e.d(i10);
            }
        }
        f fVar = this.f38286h;
        if (fVar.f38237c) {
            f fVar2 = this.f38287i;
            if (fVar2.f38237c) {
                if (fVar.f38244j && fVar2.f38244j && this.f38283e.f38244j) {
                    return;
                }
                if (!this.f38283e.f38244j && this.f38282d == e.b.MATCH_CONSTRAINT) {
                    o0.e eVar5 = this.f38280b;
                    if (eVar5.f37752w == 0 && !eVar5.i0()) {
                        f fVar3 = (f) this.f38286h.f38246l.get(0);
                        f fVar4 = (f) this.f38287i.f38246l.get(0);
                        int i13 = fVar3.f38241g;
                        f fVar5 = this.f38286h;
                        int i14 = i13 + fVar5.f38240f;
                        int i15 = fVar4.f38241g + this.f38287i.f38240f;
                        fVar5.d(i14);
                        this.f38287i.d(i15);
                        this.f38283e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f38283e.f38244j && this.f38282d == e.b.MATCH_CONSTRAINT && this.f38279a == 1 && this.f38286h.f38246l.size() > 0 && this.f38287i.f38246l.size() > 0) {
                    f fVar6 = (f) this.f38286h.f38246l.get(0);
                    int i16 = (((f) this.f38287i.f38246l.get(0)).f38241g + this.f38287i.f38240f) - (fVar6.f38241g + this.f38286h.f38240f);
                    g gVar2 = this.f38283e;
                    int i17 = gVar2.f38247m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f38283e.f38244j && this.f38286h.f38246l.size() > 0 && this.f38287i.f38246l.size() > 0) {
                    f fVar7 = (f) this.f38286h.f38246l.get(0);
                    f fVar8 = (f) this.f38287i.f38246l.get(0);
                    int i18 = fVar7.f38241g + this.f38286h.f38240f;
                    int i19 = fVar8.f38241g + this.f38287i.f38240f;
                    float P10 = this.f38280b.P();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f38241g;
                        i19 = fVar8.f38241g;
                        P10 = 0.5f;
                    }
                    this.f38286h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f38283e.f38241g) * P10)));
                    this.f38287i.d(this.f38286h.f38241g + this.f38283e.f38241g);
                }
            }
        }
    }

    @Override // p0.p
    void d() {
        o0.e I10;
        o0.e I11;
        o0.e eVar = this.f38280b;
        if (eVar.f37708a) {
            this.f38283e.d(eVar.v());
        }
        if (!this.f38283e.f38244j) {
            this.f38282d = this.f38280b.R();
            if (this.f38280b.X()) {
                this.f38262l = new C3785a(this);
            }
            e.b bVar = this.f38282d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I11 = this.f38280b.I()) != null && I11.R() == e.b.FIXED) {
                    int v10 = (I11.v() - this.f38280b.f37697P.e()) - this.f38280b.f37699R.e();
                    b(this.f38286h, I11.f37718f.f38286h, this.f38280b.f37697P.e());
                    b(this.f38287i, I11.f37718f.f38287i, -this.f38280b.f37699R.e());
                    this.f38283e.d(v10);
                    return;
                }
                if (this.f38282d == e.b.FIXED) {
                    this.f38283e.d(this.f38280b.v());
                }
            }
        } else if (this.f38282d == e.b.MATCH_PARENT && (I10 = this.f38280b.I()) != null && I10.R() == e.b.FIXED) {
            b(this.f38286h, I10.f37718f.f38286h, this.f38280b.f37697P.e());
            b(this.f38287i, I10.f37718f.f38287i, -this.f38280b.f37699R.e());
            return;
        }
        g gVar = this.f38283e;
        boolean z10 = gVar.f38244j;
        if (z10) {
            o0.e eVar2 = this.f38280b;
            if (eVar2.f37708a) {
                o0.d[] dVarArr = eVar2.f37704W;
                o0.d dVar = dVarArr[2];
                o0.d dVar2 = dVar.f37667f;
                if (dVar2 != null && dVarArr[3].f37667f != null) {
                    if (eVar2.i0()) {
                        this.f38286h.f38240f = this.f38280b.f37704W[2].e();
                        this.f38287i.f38240f = -this.f38280b.f37704W[3].e();
                    } else {
                        f h10 = h(this.f38280b.f37704W[2]);
                        if (h10 != null) {
                            b(this.f38286h, h10, this.f38280b.f37704W[2].e());
                        }
                        f h11 = h(this.f38280b.f37704W[3]);
                        if (h11 != null) {
                            b(this.f38287i, h11, -this.f38280b.f37704W[3].e());
                        }
                        this.f38286h.f38236b = true;
                        this.f38287i.f38236b = true;
                    }
                    if (this.f38280b.X()) {
                        b(this.f38261k, this.f38286h, this.f38280b.n());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f38286h, h12, this.f38280b.f37704W[2].e());
                        b(this.f38287i, this.f38286h, this.f38283e.f38241g);
                        if (this.f38280b.X()) {
                            b(this.f38261k, this.f38286h, this.f38280b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                o0.d dVar3 = dVarArr[3];
                if (dVar3.f37667f != null) {
                    f h13 = h(dVar3);
                    if (h13 != null) {
                        b(this.f38287i, h13, -this.f38280b.f37704W[3].e());
                        b(this.f38286h, this.f38287i, -this.f38283e.f38241g);
                    }
                    if (this.f38280b.X()) {
                        b(this.f38261k, this.f38286h, this.f38280b.n());
                        return;
                    }
                    return;
                }
                o0.d dVar4 = dVarArr[4];
                if (dVar4.f37667f != null) {
                    f h14 = h(dVar4);
                    if (h14 != null) {
                        b(this.f38261k, h14, 0);
                        b(this.f38286h, this.f38261k, -this.f38280b.n());
                        b(this.f38287i, this.f38286h, this.f38283e.f38241g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof o0.h) || eVar2.I() == null || this.f38280b.m(d.b.CENTER).f37667f != null) {
                    return;
                }
                b(this.f38286h, this.f38280b.I().f37718f.f38286h, this.f38280b.W());
                b(this.f38287i, this.f38286h, this.f38283e.f38241g);
                if (this.f38280b.X()) {
                    b(this.f38261k, this.f38286h, this.f38280b.n());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f38282d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            o0.e eVar3 = this.f38280b;
            int i10 = eVar3.f37754x;
            if (i10 == 2) {
                o0.e I12 = eVar3.I();
                if (I12 != null) {
                    g gVar2 = I12.f37718f.f38283e;
                    this.f38283e.f38246l.add(gVar2);
                    gVar2.f38245k.add(this.f38283e);
                    g gVar3 = this.f38283e;
                    gVar3.f38236b = true;
                    gVar3.f38245k.add(this.f38286h);
                    this.f38283e.f38245k.add(this.f38287i);
                }
            } else if (i10 == 3 && !eVar3.i0()) {
                o0.e eVar4 = this.f38280b;
                if (eVar4.f37752w != 3) {
                    g gVar4 = eVar4.f37716e.f38283e;
                    this.f38283e.f38246l.add(gVar4);
                    gVar4.f38245k.add(this.f38283e);
                    g gVar5 = this.f38283e;
                    gVar5.f38236b = true;
                    gVar5.f38245k.add(this.f38286h);
                    this.f38283e.f38245k.add(this.f38287i);
                }
            }
        }
        o0.e eVar5 = this.f38280b;
        o0.d[] dVarArr2 = eVar5.f37704W;
        o0.d dVar5 = dVarArr2[2];
        o0.d dVar6 = dVar5.f37667f;
        if (dVar6 != null && dVarArr2[3].f37667f != null) {
            if (eVar5.i0()) {
                this.f38286h.f38240f = this.f38280b.f37704W[2].e();
                this.f38287i.f38240f = -this.f38280b.f37704W[3].e();
            } else {
                f h15 = h(this.f38280b.f37704W[2]);
                f h16 = h(this.f38280b.f37704W[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f38288j = p.b.CENTER;
            }
            if (this.f38280b.X()) {
                c(this.f38261k, this.f38286h, 1, this.f38262l);
            }
        } else if (dVar6 != null) {
            f h17 = h(dVar5);
            if (h17 != null) {
                b(this.f38286h, h17, this.f38280b.f37704W[2].e());
                c(this.f38287i, this.f38286h, 1, this.f38283e);
                if (this.f38280b.X()) {
                    c(this.f38261k, this.f38286h, 1, this.f38262l);
                }
                e.b bVar2 = this.f38282d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f38280b.t() > 0.0f) {
                    l lVar = this.f38280b.f37716e;
                    if (lVar.f38282d == bVar3) {
                        lVar.f38283e.f38245k.add(this.f38283e);
                        this.f38283e.f38246l.add(this.f38280b.f37716e.f38283e);
                        this.f38283e.f38235a = this;
                    }
                }
            }
        } else {
            o0.d dVar7 = dVarArr2[3];
            if (dVar7.f37667f != null) {
                f h18 = h(dVar7);
                if (h18 != null) {
                    b(this.f38287i, h18, -this.f38280b.f37704W[3].e());
                    c(this.f38286h, this.f38287i, -1, this.f38283e);
                    if (this.f38280b.X()) {
                        c(this.f38261k, this.f38286h, 1, this.f38262l);
                    }
                }
            } else {
                o0.d dVar8 = dVarArr2[4];
                if (dVar8.f37667f != null) {
                    f h19 = h(dVar8);
                    if (h19 != null) {
                        b(this.f38261k, h19, 0);
                        c(this.f38286h, this.f38261k, -1, this.f38262l);
                        c(this.f38287i, this.f38286h, 1, this.f38283e);
                    }
                } else if (!(eVar5 instanceof o0.h) && eVar5.I() != null) {
                    b(this.f38286h, this.f38280b.I().f37718f.f38286h, this.f38280b.W());
                    c(this.f38287i, this.f38286h, 1, this.f38283e);
                    if (this.f38280b.X()) {
                        c(this.f38261k, this.f38286h, 1, this.f38262l);
                    }
                    e.b bVar4 = this.f38282d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f38280b.t() > 0.0f) {
                        l lVar2 = this.f38280b.f37716e;
                        if (lVar2.f38282d == bVar5) {
                            lVar2.f38283e.f38245k.add(this.f38283e);
                            this.f38283e.f38246l.add(this.f38280b.f37716e.f38283e);
                            this.f38283e.f38235a = this;
                        }
                    }
                }
            }
        }
        if (this.f38283e.f38246l.size() == 0) {
            this.f38283e.f38237c = true;
        }
    }

    @Override // p0.p
    public void e() {
        f fVar = this.f38286h;
        if (fVar.f38244j) {
            this.f38280b.j1(fVar.f38241g);
        }
    }

    @Override // p0.p
    void f() {
        this.f38281c = null;
        this.f38286h.c();
        this.f38287i.c();
        this.f38261k.c();
        this.f38283e.c();
        this.f38285g = false;
    }

    @Override // p0.p
    boolean m() {
        return this.f38282d != e.b.MATCH_CONSTRAINT || this.f38280b.f37754x == 0;
    }

    void q() {
        this.f38285g = false;
        this.f38286h.c();
        this.f38286h.f38244j = false;
        this.f38287i.c();
        this.f38287i.f38244j = false;
        this.f38261k.c();
        this.f38261k.f38244j = false;
        this.f38283e.f38244j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f38280b.r();
    }
}
