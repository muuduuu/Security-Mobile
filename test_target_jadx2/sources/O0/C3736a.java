package o0;

import l0.C3592d;
import l0.C3597i;
import o0.d;
import o0.e;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3736a extends i {

    /* renamed from: M0, reason: collision with root package name */
    private int f37636M0 = 0;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f37637N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private int f37638O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    boolean f37639P0 = false;

    @Override // o0.e
    public void g(C3592d c3592d, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f37704W;
        dVarArr2[0] = this.f37696O;
        dVarArr2[2] = this.f37697P;
        dVarArr2[1] = this.f37698Q;
        dVarArr2[3] = this.f37699R;
        int i13 = 0;
        while (true) {
            dVarArr = this.f37704W;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar = dVarArr[i13];
            dVar.f37670i = c3592d.q(dVar);
            i13++;
        }
        int i14 = this.f37636M0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar2 = dVarArr[i14];
        if (!this.f37639P0) {
            p1();
        }
        if (this.f37639P0) {
            this.f37639P0 = false;
            int i15 = this.f37636M0;
            if (i15 == 0 || i15 == 1) {
                c3592d.f(this.f37696O.f37670i, this.f37719f0);
                c3592d.f(this.f37698Q.f37670i, this.f37719f0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    c3592d.f(this.f37697P.f37670i, this.f37721g0);
                    c3592d.f(this.f37699R.f37670i, this.f37721g0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f37802L0; i16++) {
            e eVar = this.f37801K0[i16];
            if ((this.f37637N0 || eVar.h()) && ((((i11 = this.f37636M0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f37696O.f37667f != null && eVar.f37698Q.f37667f != null) || (((i12 = this.f37636M0) == 2 || i12 == 3) && eVar.R() == e.b.MATCH_CONSTRAINT && eVar.f37697P.f37667f != null && eVar.f37699R.f37667f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f37696O.k() || this.f37698Q.k();
        boolean z13 = this.f37697P.k() || this.f37699R.k();
        int i17 = !(!z11 && (((i10 = this.f37636M0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f37802L0; i18++) {
            e eVar2 = this.f37801K0[i18];
            if (this.f37637N0 || eVar2.h()) {
                C3597i q10 = c3592d.q(eVar2.f37704W[this.f37636M0]);
                d[] dVarArr3 = eVar2.f37704W;
                int i19 = this.f37636M0;
                d dVar3 = dVarArr3[i19];
                dVar3.f37670i = q10;
                d dVar4 = dVar3.f37667f;
                int i20 = (dVar4 == null || dVar4.f37665d != this) ? 0 : dVar3.f37668g;
                if (i19 == 0 || i19 == 2) {
                    c3592d.i(dVar2.f37670i, q10, this.f37638O0 - i20, z11);
                } else {
                    c3592d.g(dVar2.f37670i, q10, this.f37638O0 + i20, z11);
                }
                c3592d.e(dVar2.f37670i, q10, this.f37638O0 + i20, i17);
            }
        }
        int i21 = this.f37636M0;
        if (i21 == 0) {
            c3592d.e(this.f37698Q.f37670i, this.f37696O.f37670i, 0, 8);
            c3592d.e(this.f37696O.f37670i, this.f37709a0.f37698Q.f37670i, 0, 4);
            c3592d.e(this.f37696O.f37670i, this.f37709a0.f37696O.f37670i, 0, 0);
            return;
        }
        if (i21 == 1) {
            c3592d.e(this.f37696O.f37670i, this.f37698Q.f37670i, 0, 8);
            c3592d.e(this.f37696O.f37670i, this.f37709a0.f37696O.f37670i, 0, 4);
            c3592d.e(this.f37696O.f37670i, this.f37709a0.f37698Q.f37670i, 0, 0);
        } else if (i21 == 2) {
            c3592d.e(this.f37699R.f37670i, this.f37697P.f37670i, 0, 8);
            c3592d.e(this.f37697P.f37670i, this.f37709a0.f37699R.f37670i, 0, 4);
            c3592d.e(this.f37697P.f37670i, this.f37709a0.f37697P.f37670i, 0, 0);
        } else if (i21 == 3) {
            c3592d.e(this.f37697P.f37670i, this.f37699R.f37670i, 0, 8);
            c3592d.e(this.f37697P.f37670i, this.f37709a0.f37697P.f37670i, 0, 4);
            c3592d.e(this.f37697P.f37670i, this.f37709a0.f37699R.f37670i, 0, 0);
        }
    }

    @Override // o0.e
    public boolean h() {
        return true;
    }

    @Override // o0.e
    public boolean l0() {
        return this.f37639P0;
    }

    @Override // o0.e
    public boolean m0() {
        return this.f37639P0;
    }

    public boolean p1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f37802L0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f37801K0[i13];
            if ((this.f37637N0 || eVar.h()) && ((((i11 = this.f37636M0) == 0 || i11 == 1) && !eVar.l0()) || (((i12 = this.f37636M0) == 2 || i12 == 3) && !eVar.m0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f37802L0; i15++) {
            e eVar2 = this.f37801K0[i15];
            if (this.f37637N0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.f37636M0;
                    if (i16 == 0) {
                        i14 = eVar2.m(d.b.LEFT).d();
                    } else if (i16 == 1) {
                        i14 = eVar2.m(d.b.RIGHT).d();
                    } else if (i16 == 2) {
                        i14 = eVar2.m(d.b.TOP).d();
                    } else if (i16 == 3) {
                        i14 = eVar2.m(d.b.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i17 = this.f37636M0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.m(d.b.LEFT).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.m(d.b.RIGHT).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.m(d.b.TOP).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.m(d.b.BOTTOM).d());
                }
            }
        }
        int i18 = i14 + this.f37638O0;
        int i19 = this.f37636M0;
        if (i19 == 0 || i19 == 1) {
            C0(i18, i18);
        } else {
            F0(i18, i18);
        }
        this.f37639P0 = true;
        return true;
    }

    public boolean q1() {
        return this.f37637N0;
    }

    public int r1() {
        return this.f37636M0;
    }

    public int s1() {
        return this.f37638O0;
    }

    public int t1() {
        int i10 = this.f37636M0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // o0.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.f37802L0; i10++) {
            e eVar = this.f37801K0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    protected void u1() {
        for (int i10 = 0; i10 < this.f37802L0; i10++) {
            e eVar = this.f37801K0[i10];
            if (this.f37637N0 || eVar.h()) {
                int i11 = this.f37636M0;
                if (i11 == 0 || i11 == 1) {
                    eVar.P0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.P0(1, true);
                }
            }
        }
    }

    public void v1(boolean z10) {
        this.f37637N0 = z10;
    }

    public void w1(int i10) {
        this.f37636M0 = i10;
    }

    public void x1(int i10) {
        this.f37638O0 = i10;
    }
}
