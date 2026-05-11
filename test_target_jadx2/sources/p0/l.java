package p0;

import o0.d;
import o0.e;
import p0.f;
import p0.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f38251k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38252a;

        static {
            int[] iArr = new int[p.b.values().length];
            f38252a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38252a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38252a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(o0.e eVar) {
        super(eVar);
        this.f38286h.f38239e = f.a.LEFT;
        this.f38287i.f38239e = f.a.RIGHT;
        this.f38284f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ba, code lost:
    
        if (r14 != 1) goto L135;
     */
    @Override // p0.p, p0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        float f10;
        float t10;
        float f11;
        int i10;
        int i11 = a.f38252a[this.f38288j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            o0.e eVar = this.f38280b;
            n(dVar, eVar.f37696O, eVar.f37698Q, 0);
            return;
        }
        if (!this.f38283e.f38244j && this.f38282d == e.b.MATCH_CONSTRAINT) {
            o0.e eVar2 = this.f38280b;
            int i12 = eVar2.f37752w;
            if (i12 == 2) {
                o0.e I10 = eVar2.I();
                if (I10 != null) {
                    if (I10.f37716e.f38283e.f38244j) {
                        this.f38283e.d((int) ((r0.f38241g * this.f38280b.f37675B) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = eVar2.f37754x;
                if (i13 == 0 || i13 == 3) {
                    n nVar = eVar2.f37718f;
                    f fVar = nVar.f38286h;
                    f fVar2 = nVar.f38287i;
                    boolean z10 = eVar2.f37696O.f37667f != null;
                    boolean z11 = eVar2.f37697P.f37667f != null;
                    boolean z12 = eVar2.f37698Q.f37667f != null;
                    boolean z13 = eVar2.f37699R.f37667f != null;
                    int u10 = eVar2.u();
                    if (z10 && z11 && z12 && z13) {
                        float t11 = this.f38280b.t();
                        if (fVar.f38244j && fVar2.f38244j) {
                            f fVar3 = this.f38286h;
                            if (fVar3.f38237c && this.f38287i.f38237c) {
                                q(f38251k, ((f) fVar3.f38246l.get(0)).f38241g + this.f38286h.f38240f, ((f) this.f38287i.f38246l.get(0)).f38241g - this.f38287i.f38240f, fVar.f38241g + fVar.f38240f, fVar2.f38241g - fVar2.f38240f, t11, u10);
                                this.f38283e.d(f38251k[0]);
                                this.f38280b.f37718f.f38283e.d(f38251k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f38286h;
                        if (fVar4.f38244j) {
                            f fVar5 = this.f38287i;
                            if (fVar5.f38244j) {
                                if (!fVar.f38237c || !fVar2.f38237c) {
                                    return;
                                }
                                q(f38251k, fVar4.f38241g + fVar4.f38240f, fVar5.f38241g - fVar5.f38240f, ((f) fVar.f38246l.get(0)).f38241g + fVar.f38240f, ((f) fVar2.f38246l.get(0)).f38241g - fVar2.f38240f, t11, u10);
                                this.f38283e.d(f38251k[0]);
                                this.f38280b.f37718f.f38283e.d(f38251k[1]);
                            }
                        }
                        f fVar6 = this.f38286h;
                        if (!fVar6.f38237c || !this.f38287i.f38237c || !fVar.f38237c || !fVar2.f38237c) {
                            return;
                        }
                        q(f38251k, ((f) fVar6.f38246l.get(0)).f38241g + this.f38286h.f38240f, ((f) this.f38287i.f38246l.get(0)).f38241g - this.f38287i.f38240f, ((f) fVar.f38246l.get(0)).f38241g + fVar.f38240f, ((f) fVar2.f38246l.get(0)).f38241g - fVar2.f38240f, t11, u10);
                        this.f38283e.d(f38251k[0]);
                        this.f38280b.f37718f.f38283e.d(f38251k[1]);
                    } else if (z10 && z12) {
                        if (!this.f38286h.f38237c || !this.f38287i.f38237c) {
                            return;
                        }
                        float t12 = this.f38280b.t();
                        int i14 = ((f) this.f38286h.f38246l.get(0)).f38241g + this.f38286h.f38240f;
                        int i15 = ((f) this.f38287i.f38246l.get(0)).f38241g - this.f38287i.f38240f;
                        if (u10 == -1 || u10 == 0) {
                            int g10 = g(i15 - i14, 0);
                            int i16 = (int) ((g10 * t12) + 0.5f);
                            int g11 = g(i16, 1);
                            if (i16 != g11) {
                                g10 = (int) ((g11 / t12) + 0.5f);
                            }
                            this.f38283e.d(g10);
                            this.f38280b.f37718f.f38283e.d(g11);
                        } else if (u10 == 1) {
                            int g12 = g(i15 - i14, 0);
                            int i17 = (int) ((g12 / t12) + 0.5f);
                            int g13 = g(i17, 1);
                            if (i17 != g13) {
                                g12 = (int) ((g13 * t12) + 0.5f);
                            }
                            this.f38283e.d(g12);
                            this.f38280b.f37718f.f38283e.d(g13);
                        }
                    } else if (z11 && z13) {
                        if (!fVar.f38237c || !fVar2.f38237c) {
                            return;
                        }
                        float t13 = this.f38280b.t();
                        int i18 = ((f) fVar.f38246l.get(0)).f38241g + fVar.f38240f;
                        int i19 = ((f) fVar2.f38246l.get(0)).f38241g - fVar2.f38240f;
                        if (u10 != -1) {
                            if (u10 == 0) {
                                int g14 = g(i19 - i18, 1);
                                int i20 = (int) ((g14 * t13) + 0.5f);
                                int g15 = g(i20, 0);
                                if (i20 != g15) {
                                    g14 = (int) ((g15 / t13) + 0.5f);
                                }
                                this.f38283e.d(g15);
                                this.f38280b.f37718f.f38283e.d(g14);
                            }
                        }
                        int g16 = g(i19 - i18, 1);
                        int i21 = (int) ((g16 / t13) + 0.5f);
                        int g17 = g(i21, 0);
                        if (i21 != g17) {
                            g16 = (int) ((g17 * t13) + 0.5f);
                        }
                        this.f38283e.d(g17);
                        this.f38280b.f37718f.f38283e.d(g16);
                    }
                } else {
                    int u11 = eVar2.u();
                    if (u11 == -1) {
                        o0.e eVar3 = this.f38280b;
                        f10 = eVar3.f37718f.f38283e.f38241g;
                        t10 = eVar3.t();
                    } else if (u11 == 0) {
                        f11 = r0.f37718f.f38283e.f38241g / this.f38280b.t();
                        i10 = (int) (f11 + 0.5f);
                        this.f38283e.d(i10);
                    } else if (u11 != 1) {
                        i10 = 0;
                        this.f38283e.d(i10);
                    } else {
                        o0.e eVar4 = this.f38280b;
                        f10 = eVar4.f37718f.f38283e.f38241g;
                        t10 = eVar4.t();
                    }
                    f11 = f10 * t10;
                    i10 = (int) (f11 + 0.5f);
                    this.f38283e.d(i10);
                }
            }
        }
        f fVar7 = this.f38286h;
        if (fVar7.f38237c) {
            f fVar8 = this.f38287i;
            if (fVar8.f38237c) {
                if (fVar7.f38244j && fVar8.f38244j && this.f38283e.f38244j) {
                    return;
                }
                if (!this.f38283e.f38244j && this.f38282d == e.b.MATCH_CONSTRAINT) {
                    o0.e eVar5 = this.f38280b;
                    if (eVar5.f37752w == 0 && !eVar5.g0()) {
                        f fVar9 = (f) this.f38286h.f38246l.get(0);
                        f fVar10 = (f) this.f38287i.f38246l.get(0);
                        int i22 = fVar9.f38241g;
                        f fVar11 = this.f38286h;
                        int i23 = i22 + fVar11.f38240f;
                        int i24 = fVar10.f38241g + this.f38287i.f38240f;
                        fVar11.d(i23);
                        this.f38287i.d(i24);
                        this.f38283e.d(i24 - i23);
                        return;
                    }
                }
                if (!this.f38283e.f38244j && this.f38282d == e.b.MATCH_CONSTRAINT && this.f38279a == 1 && this.f38286h.f38246l.size() > 0 && this.f38287i.f38246l.size() > 0) {
                    int min = Math.min((((f) this.f38287i.f38246l.get(0)).f38241g + this.f38287i.f38240f) - (((f) this.f38286h.f38246l.get(0)).f38241g + this.f38286h.f38240f), this.f38283e.f38247m);
                    o0.e eVar6 = this.f38280b;
                    int i25 = eVar6.f37673A;
                    int max = Math.max(eVar6.f37758z, min);
                    if (i25 > 0) {
                        max = Math.min(i25, max);
                    }
                    this.f38283e.d(max);
                }
                if (this.f38283e.f38244j) {
                    f fVar12 = (f) this.f38286h.f38246l.get(0);
                    f fVar13 = (f) this.f38287i.f38246l.get(0);
                    int i26 = fVar12.f38241g + this.f38286h.f38240f;
                    int i27 = fVar13.f38241g + this.f38287i.f38240f;
                    float w10 = this.f38280b.w();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f38241g;
                        i27 = fVar13.f38241g;
                        w10 = 0.5f;
                    }
                    this.f38286h.d((int) (i26 + 0.5f + (((i27 - i26) - this.f38283e.f38241g) * w10)));
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
            this.f38283e.d(eVar.U());
        }
        if (this.f38283e.f38244j) {
            e.b bVar = this.f38282d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (I10 = this.f38280b.I()) != null && (I10.y() == e.b.FIXED || I10.y() == bVar2)) {
                b(this.f38286h, I10.f37716e.f38286h, this.f38280b.f37696O.e());
                b(this.f38287i, I10.f37716e.f38287i, -this.f38280b.f37698Q.e());
                return;
            }
        } else {
            e.b y10 = this.f38280b.y();
            this.f38282d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (y10 == bVar3 && (I11 = this.f38280b.I()) != null && (I11.y() == e.b.FIXED || I11.y() == bVar3)) {
                    int U10 = (I11.U() - this.f38280b.f37696O.e()) - this.f38280b.f37698Q.e();
                    b(this.f38286h, I11.f37716e.f38286h, this.f38280b.f37696O.e());
                    b(this.f38287i, I11.f37716e.f38287i, -this.f38280b.f37698Q.e());
                    this.f38283e.d(U10);
                    return;
                }
                if (this.f38282d == e.b.FIXED) {
                    this.f38283e.d(this.f38280b.U());
                }
            }
        }
        g gVar = this.f38283e;
        if (gVar.f38244j) {
            o0.e eVar2 = this.f38280b;
            if (eVar2.f37708a) {
                o0.d[] dVarArr = eVar2.f37704W;
                o0.d dVar = dVarArr[0];
                o0.d dVar2 = dVar.f37667f;
                if (dVar2 != null && dVarArr[1].f37667f != null) {
                    if (eVar2.g0()) {
                        this.f38286h.f38240f = this.f38280b.f37704W[0].e();
                        this.f38287i.f38240f = -this.f38280b.f37704W[1].e();
                        return;
                    }
                    f h10 = h(this.f38280b.f37704W[0]);
                    if (h10 != null) {
                        b(this.f38286h, h10, this.f38280b.f37704W[0].e());
                    }
                    f h11 = h(this.f38280b.f37704W[1]);
                    if (h11 != null) {
                        b(this.f38287i, h11, -this.f38280b.f37704W[1].e());
                    }
                    this.f38286h.f38236b = true;
                    this.f38287i.f38236b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f38286h, h12, this.f38280b.f37704W[0].e());
                        b(this.f38287i, this.f38286h, this.f38283e.f38241g);
                        return;
                    }
                    return;
                }
                o0.d dVar3 = dVarArr[1];
                if (dVar3.f37667f != null) {
                    f h13 = h(dVar3);
                    if (h13 != null) {
                        b(this.f38287i, h13, -this.f38280b.f37704W[1].e());
                        b(this.f38286h, this.f38287i, -this.f38283e.f38241g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof o0.h) || eVar2.I() == null || this.f38280b.m(d.b.CENTER).f37667f != null) {
                    return;
                }
                b(this.f38286h, this.f38280b.I().f37716e.f38286h, this.f38280b.V());
                b(this.f38287i, this.f38286h, this.f38283e.f38241g);
                return;
            }
        }
        if (this.f38282d == e.b.MATCH_CONSTRAINT) {
            o0.e eVar3 = this.f38280b;
            int i10 = eVar3.f37752w;
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
            } else if (i10 == 3) {
                if (eVar3.f37754x == 3) {
                    this.f38286h.f38235a = this;
                    this.f38287i.f38235a = this;
                    n nVar = eVar3.f37718f;
                    nVar.f38286h.f38235a = this;
                    nVar.f38287i.f38235a = this;
                    gVar.f38235a = this;
                    if (eVar3.i0()) {
                        this.f38283e.f38246l.add(this.f38280b.f37718f.f38283e);
                        this.f38280b.f37718f.f38283e.f38245k.add(this.f38283e);
                        n nVar2 = this.f38280b.f37718f;
                        nVar2.f38283e.f38235a = this;
                        this.f38283e.f38246l.add(nVar2.f38286h);
                        this.f38283e.f38246l.add(this.f38280b.f37718f.f38287i);
                        this.f38280b.f37718f.f38286h.f38245k.add(this.f38283e);
                        this.f38280b.f37718f.f38287i.f38245k.add(this.f38283e);
                    } else if (this.f38280b.g0()) {
                        this.f38280b.f37718f.f38283e.f38246l.add(this.f38283e);
                        this.f38283e.f38245k.add(this.f38280b.f37718f.f38283e);
                    } else {
                        this.f38280b.f37718f.f38283e.f38246l.add(this.f38283e);
                    }
                } else {
                    g gVar4 = eVar3.f37718f.f38283e;
                    gVar.f38246l.add(gVar4);
                    gVar4.f38245k.add(this.f38283e);
                    this.f38280b.f37718f.f38286h.f38245k.add(this.f38283e);
                    this.f38280b.f37718f.f38287i.f38245k.add(this.f38283e);
                    g gVar5 = this.f38283e;
                    gVar5.f38236b = true;
                    gVar5.f38245k.add(this.f38286h);
                    this.f38283e.f38245k.add(this.f38287i);
                    this.f38286h.f38246l.add(this.f38283e);
                    this.f38287i.f38246l.add(this.f38283e);
                }
            }
        }
        o0.e eVar4 = this.f38280b;
        o0.d[] dVarArr2 = eVar4.f37704W;
        o0.d dVar4 = dVarArr2[0];
        o0.d dVar5 = dVar4.f37667f;
        if (dVar5 != null && dVarArr2[1].f37667f != null) {
            if (eVar4.g0()) {
                this.f38286h.f38240f = this.f38280b.f37704W[0].e();
                this.f38287i.f38240f = -this.f38280b.f37704W[1].e();
                return;
            }
            f h14 = h(this.f38280b.f37704W[0]);
            f h15 = h(this.f38280b.f37704W[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f38288j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h16 = h(dVar4);
            if (h16 != null) {
                b(this.f38286h, h16, this.f38280b.f37704W[0].e());
                c(this.f38287i, this.f38286h, 1, this.f38283e);
                return;
            }
            return;
        }
        o0.d dVar6 = dVarArr2[1];
        if (dVar6.f37667f != null) {
            f h17 = h(dVar6);
            if (h17 != null) {
                b(this.f38287i, h17, -this.f38280b.f37704W[1].e());
                c(this.f38286h, this.f38287i, -1, this.f38283e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof o0.h) || eVar4.I() == null) {
            return;
        }
        b(this.f38286h, this.f38280b.I().f37716e.f38286h, this.f38280b.V());
        c(this.f38287i, this.f38286h, 1, this.f38283e);
    }

    @Override // p0.p
    public void e() {
        f fVar = this.f38286h;
        if (fVar.f38244j) {
            this.f38280b.i1(fVar.f38241g);
        }
    }

    @Override // p0.p
    void f() {
        this.f38281c = null;
        this.f38286h.c();
        this.f38287i.c();
        this.f38283e.c();
        this.f38285g = false;
    }

    @Override // p0.p
    boolean m() {
        return this.f38282d != e.b.MATCH_CONSTRAINT || this.f38280b.f37752w == 0;
    }

    void r() {
        this.f38285g = false;
        this.f38286h.c();
        this.f38286h.f38244j = false;
        this.f38287i.c();
        this.f38287i.f38244j = false;
        this.f38283e.f38244j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f38280b.r();
    }
}
