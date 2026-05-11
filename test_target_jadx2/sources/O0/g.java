package o0;

import l0.C3592d;
import l0.C3597i;
import o0.d;
import o0.e;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: K0, reason: collision with root package name */
    protected float f37792K0 = -1.0f;

    /* renamed from: L0, reason: collision with root package name */
    protected int f37793L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    protected int f37794M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    protected boolean f37795N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private d f37796O0 = this.f37697P;

    /* renamed from: P0, reason: collision with root package name */
    private int f37797P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f37798Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f37799R0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37800a;

        static {
            int[] iArr = new int[d.b.values().length];
            f37800a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37800a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37800a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37800a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37800a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37800a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37800a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37800a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37800a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.f37705X.clear();
        this.f37705X.add(this.f37796O0);
        int length = this.f37704W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f37704W[i10] = this.f37796O0;
        }
    }

    @Override // o0.e
    public void g(C3592d c3592d, boolean z10) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d m10 = fVar.m(d.b.LEFT);
        d m11 = fVar.m(d.b.RIGHT);
        e eVar = this.f37709a0;
        boolean z11 = eVar != null && eVar.f37707Z[0] == e.b.WRAP_CONTENT;
        if (this.f37797P0 == 0) {
            m10 = fVar.m(d.b.TOP);
            m11 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.f37709a0;
            z11 = eVar2 != null && eVar2.f37707Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.f37799R0 && this.f37796O0.m()) {
            C3597i q10 = c3592d.q(this.f37796O0);
            c3592d.f(q10, this.f37796O0.d());
            if (this.f37793L0 != -1) {
                if (z11) {
                    c3592d.h(c3592d.q(m11), q10, 0, 5);
                }
            } else if (this.f37794M0 != -1 && z11) {
                C3597i q11 = c3592d.q(m11);
                c3592d.h(q10, c3592d.q(m10), 0, 5);
                c3592d.h(q11, q10, 0, 5);
            }
            this.f37799R0 = false;
            return;
        }
        if (this.f37793L0 != -1) {
            C3597i q12 = c3592d.q(this.f37796O0);
            c3592d.e(q12, c3592d.q(m10), this.f37793L0, 8);
            if (z11) {
                c3592d.h(c3592d.q(m11), q12, 0, 5);
                return;
            }
            return;
        }
        if (this.f37794M0 == -1) {
            if (this.f37792K0 != -1.0f) {
                c3592d.d(C3592d.s(c3592d, c3592d.q(this.f37796O0), c3592d.q(m11), this.f37792K0));
                return;
            }
            return;
        }
        C3597i q13 = c3592d.q(this.f37796O0);
        C3597i q14 = c3592d.q(m11);
        c3592d.e(q13, q14, -this.f37794M0, 8);
        if (z11) {
            c3592d.h(q13, c3592d.q(m10), 0, 5);
            c3592d.h(q14, q13, 0, 5);
        }
    }

    @Override // o0.e
    public boolean h() {
        return true;
    }

    @Override // o0.e
    public boolean l0() {
        return this.f37799R0;
    }

    @Override // o0.e
    public d m(d.b bVar) {
        int i10 = a.f37800a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f37797P0 == 1) {
                return this.f37796O0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f37797P0 == 0) {
            return this.f37796O0;
        }
        return null;
    }

    @Override // o0.e
    public boolean m0() {
        return this.f37799R0;
    }

    @Override // o0.e
    public void m1(C3592d c3592d, boolean z10) {
        if (I() == null) {
            return;
        }
        int y10 = c3592d.y(this.f37796O0);
        if (this.f37797P0 == 1) {
            i1(y10);
            j1(0);
            I0(I().v());
            g1(0);
            return;
        }
        i1(0);
        j1(y10);
        g1(I().U());
        I0(0);
    }

    public d n1() {
        return this.f37796O0;
    }

    public int o1() {
        return this.f37797P0;
    }

    public int p1() {
        return this.f37793L0;
    }

    public int q1() {
        return this.f37794M0;
    }

    public float r1() {
        return this.f37792K0;
    }

    public void s1(int i10) {
        this.f37796O0.s(i10);
        this.f37799R0 = true;
    }

    public void t1(int i10) {
        if (i10 > -1) {
            this.f37792K0 = -1.0f;
            this.f37793L0 = i10;
            this.f37794M0 = -1;
        }
    }

    public void u1(int i10) {
        if (i10 > -1) {
            this.f37792K0 = -1.0f;
            this.f37793L0 = -1;
            this.f37794M0 = i10;
        }
    }

    public void v1(float f10) {
        if (f10 > -1.0f) {
            this.f37792K0 = f10;
            this.f37793L0 = -1;
            this.f37794M0 = -1;
        }
    }

    public void w1(int i10) {
        if (this.f37797P0 == i10) {
            return;
        }
        this.f37797P0 = i10;
        this.f37705X.clear();
        if (this.f37797P0 == 1) {
            this.f37796O0 = this.f37696O;
        } else {
            this.f37796O0 = this.f37697P;
        }
        this.f37705X.add(this.f37796O0);
        int length = this.f37704W.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f37704W[i11] = this.f37796O0;
        }
    }
}
