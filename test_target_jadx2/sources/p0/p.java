package p0;

import o0.d;
import o0.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f38279a;

    /* renamed from: b, reason: collision with root package name */
    o0.e f38280b;

    /* renamed from: c, reason: collision with root package name */
    m f38281c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f38282d;

    /* renamed from: e, reason: collision with root package name */
    g f38283e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f38284f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f38285g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f38286h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f38287i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f38288j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38289a;

        static {
            int[] iArr = new int[d.b.values().length];
            f38289a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38289a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38289a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38289a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38289a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(o0.e eVar) {
        this.f38280b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f38279a;
        if (i12 == 0) {
            this.f38283e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f38283e.d(Math.min(g(this.f38283e.f38247m, i10), i11));
            return;
        }
        if (i12 == 2) {
            o0.e I10 = this.f38280b.I();
            if (I10 != null) {
                if ((i10 == 0 ? I10.f37716e : I10.f37718f).f38283e.f38244j) {
                    o0.e eVar = this.f38280b;
                    this.f38283e.d(g((int) ((r9.f38241g * (i10 == 0 ? eVar.f37675B : eVar.f37681E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        o0.e eVar2 = this.f38280b;
        p pVar = eVar2.f37716e;
        e.b bVar = pVar.f38282d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f38279a == 3) {
            n nVar = eVar2.f37718f;
            if (nVar.f38282d == bVar2 && nVar.f38279a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar2.f37718f;
        }
        if (pVar.f38283e.f38244j) {
            float t10 = eVar2.t();
            this.f38283e.d(i10 == 1 ? (int) ((pVar.f38283e.f38241g / t10) + 0.5f) : (int) ((t10 * pVar.f38283e.f38241g) + 0.5f));
        }
    }

    @Override // p0.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f38246l.add(fVar2);
        fVar.f38240f = i10;
        fVar2.f38245k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f38246l.add(fVar2);
        fVar.f38246l.add(this.f38283e);
        fVar.f38242h = i10;
        fVar.f38243i = gVar;
        fVar2.f38245k.add(fVar);
        gVar.f38245k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            o0.e eVar = this.f38280b;
            int i12 = eVar.f37673A;
            max = Math.max(eVar.f37758z, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            o0.e eVar2 = this.f38280b;
            int i13 = eVar2.f37679D;
            max = Math.max(eVar2.f37677C, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    protected final f h(o0.d dVar) {
        o0.d dVar2 = dVar.f37667f;
        if (dVar2 == null) {
            return null;
        }
        o0.e eVar = dVar2.f37665d;
        int i10 = a.f38289a[dVar2.f37666e.ordinal()];
        if (i10 == 1) {
            return eVar.f37716e.f38286h;
        }
        if (i10 == 2) {
            return eVar.f37716e.f38287i;
        }
        if (i10 == 3) {
            return eVar.f37718f.f38286h;
        }
        if (i10 == 4) {
            return eVar.f37718f.f38261k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f37718f.f38287i;
    }

    protected final f i(o0.d dVar, int i10) {
        o0.d dVar2 = dVar.f37667f;
        if (dVar2 == null) {
            return null;
        }
        o0.e eVar = dVar2.f37665d;
        p pVar = i10 == 0 ? eVar.f37716e : eVar.f37718f;
        int i11 = a.f38289a[dVar2.f37666e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f38287i;
        }
        return pVar.f38286h;
    }

    public long j() {
        if (this.f38283e.f38244j) {
            return r0.f38241g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f38285g;
    }

    abstract boolean m();

    protected void n(d dVar, o0.d dVar2, o0.d dVar3, int i10) {
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f38244j && h11.f38244j) {
            int e10 = h10.f38241g + dVar2.e();
            int e11 = h11.f38241g - dVar3.e();
            int i11 = e11 - e10;
            if (!this.f38283e.f38244j && this.f38282d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f38283e;
            if (gVar.f38244j) {
                if (gVar.f38241g == i11) {
                    this.f38286h.d(e10);
                    this.f38287i.d(e11);
                    return;
                }
                o0.e eVar = this.f38280b;
                float w10 = i10 == 0 ? eVar.w() : eVar.P();
                if (h10 == h11) {
                    e10 = h10.f38241g;
                    e11 = h11.f38241g;
                    w10 = 0.5f;
                }
                this.f38286h.d((int) (e10 + 0.5f + (((e11 - e10) - this.f38283e.f38241g) * w10)));
                this.f38287i.d(this.f38286h.f38241g + this.f38283e.f38241g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
