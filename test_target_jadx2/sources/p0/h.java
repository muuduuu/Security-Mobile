package p0;

import java.util.ArrayList;
import java.util.Iterator;
import o0.C3736a;
import o0.d;
import o0.e;
import p0.b;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f38248a = new b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f38249b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f38250c = 0;

    private static boolean a(int i10, o0.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b y10 = eVar.y();
        e.b R10 = eVar.R();
        o0.f fVar = eVar.I() != null ? (o0.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.R();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = y10 == bVar5 || eVar.l0() || y10 == e.b.WRAP_CONTENT || (y10 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f37752w == 0 && eVar.f37715d0 == 0.0f && eVar.Y(0)) || (y10 == bVar2 && eVar.f37752w == 1 && eVar.b0(0, eVar.U()));
        boolean z11 = R10 == bVar5 || eVar.m0() || R10 == e.b.WRAP_CONTENT || (R10 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f37754x == 0 && eVar.f37715d0 == 0.0f && eVar.Y(1)) || (R10 == bVar && eVar.f37754x == 1 && eVar.b0(1, eVar.v()));
        if (eVar.f37715d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, o0.e eVar, b.InterfaceC0588b interfaceC0588b, boolean z10) {
        o0.d dVar;
        o0.d dVar2;
        o0.d dVar3;
        o0.d dVar4;
        if (eVar.e0()) {
            return;
        }
        boolean z11 = true;
        f38249b++;
        if (!(eVar instanceof o0.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                o0.f.O1(i11, eVar, interfaceC0588b, new b.a(), b.a.f38211k);
            }
        }
        o0.d m10 = eVar.m(d.b.LEFT);
        o0.d m11 = eVar.m(d.b.RIGHT);
        int d10 = m10.d();
        int d11 = m11.d();
        if (m10.c() != null && m10.m()) {
            Iterator it = m10.c().iterator();
            while (it.hasNext()) {
                o0.d dVar5 = (o0.d) it.next();
                o0.e eVar2 = dVar5.f37665d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.k0() && a10) {
                    o0.f.O1(i12, eVar2, interfaceC0588b, new b.a(), b.a.f38211k);
                }
                boolean z12 = ((dVar5 == eVar2.f37696O && (dVar4 = eVar2.f37698Q.f37667f) != null && dVar4.m()) || (dVar5 == eVar2.f37698Q && (dVar3 = eVar2.f37696O.f37667f) != null && dVar3.m())) ? z11 : false;
                e.b y10 = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y10 != bVar || a10) {
                    if (!eVar2.k0()) {
                        o0.d dVar6 = eVar2.f37696O;
                        if (dVar5 == dVar6 && eVar2.f37698Q.f37667f == null) {
                            int e10 = dVar6.e() + d10;
                            eVar2.C0(e10, eVar2.U() + e10);
                            b(i12, eVar2, interfaceC0588b, z10);
                        } else {
                            o0.d dVar7 = eVar2.f37698Q;
                            if (dVar5 == dVar7 && dVar6.f37667f == null) {
                                int e11 = d10 - dVar7.e();
                                eVar2.C0(e11 - eVar2.U(), e11);
                                b(i12, eVar2, interfaceC0588b, z10);
                            } else if (z12 && !eVar2.g0()) {
                                d(i12, interfaceC0588b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.y() == bVar && eVar2.f37673A >= 0 && eVar2.f37758z >= 0 && ((eVar2.T() == 8 || (eVar2.f37752w == 0 && eVar2.t() == 0.0f)) && !eVar2.g0() && !eVar2.j0() && z12 && !eVar2.g0())) {
                    e(i12, eVar, interfaceC0588b, eVar2, z10);
                }
                z11 = true;
            }
        }
        if (eVar instanceof o0.g) {
            return;
        }
        if (m11.c() != null && m11.m()) {
            Iterator it2 = m11.c().iterator();
            while (it2.hasNext()) {
                o0.d dVar8 = (o0.d) it2.next();
                o0.e eVar3 = dVar8.f37665d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.k0() && a11) {
                    o0.f.O1(i13, eVar3, interfaceC0588b, new b.a(), b.a.f38211k);
                }
                boolean z13 = (dVar8 == eVar3.f37696O && (dVar2 = eVar3.f37698Q.f37667f) != null && dVar2.m()) || (dVar8 == eVar3.f37698Q && (dVar = eVar3.f37696O.f37667f) != null && dVar.m());
                e.b y11 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (y11 != bVar2 || a11) {
                    if (!eVar3.k0()) {
                        o0.d dVar9 = eVar3.f37696O;
                        if (dVar8 == dVar9 && eVar3.f37698Q.f37667f == null) {
                            int e12 = dVar9.e() + d11;
                            eVar3.C0(e12, eVar3.U() + e12);
                            b(i13, eVar3, interfaceC0588b, z10);
                        } else {
                            o0.d dVar10 = eVar3.f37698Q;
                            if (dVar8 == dVar10 && dVar9.f37667f == null) {
                                int e13 = d11 - dVar10.e();
                                eVar3.C0(e13 - eVar3.U(), e13);
                                b(i13, eVar3, interfaceC0588b, z10);
                            } else if (z13 && !eVar3.g0()) {
                                d(i13, interfaceC0588b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.y() == bVar2 && eVar3.f37673A >= 0 && eVar3.f37758z >= 0 && (eVar3.T() == 8 || (eVar3.f37752w == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.g0() && !eVar3.j0() && z13 && !eVar3.g0()) {
                        e(i13, eVar, interfaceC0588b, eVar3, z10);
                    }
                }
            }
        }
        eVar.o0();
    }

    private static void c(int i10, C3736a c3736a, b.InterfaceC0588b interfaceC0588b, int i11, boolean z10) {
        if (c3736a.p1()) {
            if (i11 == 0) {
                b(i10 + 1, c3736a, interfaceC0588b, z10);
            } else {
                i(i10 + 1, c3736a, interfaceC0588b);
            }
        }
    }

    private static void d(int i10, b.InterfaceC0588b interfaceC0588b, o0.e eVar, boolean z10) {
        float w10 = eVar.w();
        int d10 = eVar.f37696O.f37667f.d();
        int d11 = eVar.f37698Q.f37667f.d();
        int e10 = eVar.f37696O.e() + d10;
        int e11 = d11 - eVar.f37698Q.e();
        if (d10 == d11) {
            w10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int U10 = eVar.U();
        int i11 = (d11 - d10) - U10;
        if (d10 > d11) {
            i11 = (d10 - d11) - U10;
        }
        int i12 = ((int) (i11 > 0 ? (w10 * i11) + 0.5f : w10 * i11)) + d10;
        int i13 = i12 + U10;
        if (d10 > d11) {
            i13 = i12 - U10;
        }
        eVar.C0(i12, i13);
        b(i10 + 1, eVar, interfaceC0588b, z10);
    }

    private static void e(int i10, o0.e eVar, b.InterfaceC0588b interfaceC0588b, o0.e eVar2, boolean z10) {
        float w10 = eVar2.w();
        int d10 = eVar2.f37696O.f37667f.d() + eVar2.f37696O.e();
        int d11 = eVar2.f37698Q.f37667f.d() - eVar2.f37698Q.e();
        if (d11 >= d10) {
            int U10 = eVar2.U();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f37752w;
                if (i11 == 2) {
                    U10 = (int) (eVar2.w() * 0.5f * (eVar instanceof o0.f ? eVar.U() : eVar.I().U()));
                } else if (i11 == 0) {
                    U10 = d11 - d10;
                }
                U10 = Math.max(eVar2.f37758z, U10);
                int i12 = eVar2.f37673A;
                if (i12 > 0) {
                    U10 = Math.min(i12, U10);
                }
            }
            int i13 = d10 + ((int) ((w10 * ((d11 - d10) - U10)) + 0.5f));
            eVar2.C0(i13, U10 + i13);
            b(i10 + 1, eVar2, interfaceC0588b, z10);
        }
    }

    private static void f(int i10, b.InterfaceC0588b interfaceC0588b, o0.e eVar) {
        float P10 = eVar.P();
        int d10 = eVar.f37697P.f37667f.d();
        int d11 = eVar.f37699R.f37667f.d();
        int e10 = eVar.f37697P.e() + d10;
        int e11 = d11 - eVar.f37699R.e();
        if (d10 == d11) {
            P10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int v10 = eVar.v();
        int i11 = (d11 - d10) - v10;
        if (d10 > d11) {
            i11 = (d10 - d11) - v10;
        }
        int i12 = (int) (i11 > 0 ? (P10 * i11) + 0.5f : P10 * i11);
        int i13 = d10 + i12;
        int i14 = i13 + v10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - v10;
        }
        eVar.F0(i13, i14);
        i(i10 + 1, eVar, interfaceC0588b);
    }

    private static void g(int i10, o0.e eVar, b.InterfaceC0588b interfaceC0588b, o0.e eVar2) {
        float P10 = eVar2.P();
        int d10 = eVar2.f37697P.f37667f.d() + eVar2.f37697P.e();
        int d11 = eVar2.f37699R.f37667f.d() - eVar2.f37699R.e();
        if (d11 >= d10) {
            int v10 = eVar2.v();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f37754x;
                if (i11 == 2) {
                    v10 = (int) (P10 * 0.5f * (eVar instanceof o0.f ? eVar.v() : eVar.I().v()));
                } else if (i11 == 0) {
                    v10 = d11 - d10;
                }
                v10 = Math.max(eVar2.f37677C, v10);
                int i12 = eVar2.f37679D;
                if (i12 > 0) {
                    v10 = Math.min(i12, v10);
                }
            }
            int i13 = d10 + ((int) ((P10 * ((d11 - d10) - v10)) + 0.5f));
            eVar2.F0(i13, v10 + i13);
            i(i10 + 1, eVar2, interfaceC0588b);
        }
    }

    public static void h(o0.f fVar, b.InterfaceC0588b interfaceC0588b) {
        e.b y10 = fVar.y();
        e.b R10 = fVar.R();
        f38249b = 0;
        f38250c = 0;
        fVar.s0();
        ArrayList n12 = fVar.n1();
        int size = n12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o0.e) n12.get(i10)).s0();
        }
        boolean L12 = fVar.L1();
        if (y10 == e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            o0.e eVar = (o0.e) n12.get(i11);
            if (eVar instanceof o0.g) {
                o0.g gVar = (o0.g) eVar;
                if (gVar.o1() == 1) {
                    if (gVar.p1() != -1) {
                        gVar.s1(gVar.p1());
                    } else if (gVar.q1() != -1 && fVar.l0()) {
                        gVar.s1(fVar.U() - gVar.q1());
                    } else if (fVar.l0()) {
                        gVar.s1((int) ((gVar.r1() * fVar.U()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof C3736a) && ((C3736a) eVar).t1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                o0.e eVar2 = (o0.e) n12.get(i12);
                if (eVar2 instanceof o0.g) {
                    o0.g gVar2 = (o0.g) eVar2;
                    if (gVar2.o1() == 1) {
                        b(0, gVar2, interfaceC0588b, L12);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0588b, L12);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                o0.e eVar3 = (o0.e) n12.get(i13);
                if (eVar3 instanceof C3736a) {
                    C3736a c3736a = (C3736a) eVar3;
                    if (c3736a.t1() == 0) {
                        c(0, c3736a, interfaceC0588b, 0, L12);
                    }
                }
            }
        }
        if (R10 == e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            o0.e eVar4 = (o0.e) n12.get(i14);
            if (eVar4 instanceof o0.g) {
                o0.g gVar3 = (o0.g) eVar4;
                if (gVar3.o1() == 0) {
                    if (gVar3.p1() != -1) {
                        gVar3.s1(gVar3.p1());
                    } else if (gVar3.q1() != -1 && fVar.m0()) {
                        gVar3.s1(fVar.v() - gVar3.q1());
                    } else if (fVar.m0()) {
                        gVar3.s1((int) ((gVar3.r1() * fVar.v()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof C3736a) && ((C3736a) eVar4).t1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                o0.e eVar5 = (o0.e) n12.get(i15);
                if (eVar5 instanceof o0.g) {
                    o0.g gVar4 = (o0.g) eVar5;
                    if (gVar4.o1() == 0) {
                        i(1, gVar4, interfaceC0588b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0588b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                o0.e eVar6 = (o0.e) n12.get(i16);
                if (eVar6 instanceof C3736a) {
                    C3736a c3736a2 = (C3736a) eVar6;
                    if (c3736a2.t1() == 1) {
                        c(0, c3736a2, interfaceC0588b, 1, L12);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            o0.e eVar7 = (o0.e) n12.get(i17);
            if (eVar7.k0() && a(0, eVar7)) {
                o0.f.O1(0, eVar7, interfaceC0588b, f38248a, b.a.f38211k);
                if (!(eVar7 instanceof o0.g)) {
                    b(0, eVar7, interfaceC0588b, L12);
                    i(0, eVar7, interfaceC0588b);
                } else if (((o0.g) eVar7).o1() == 0) {
                    i(0, eVar7, interfaceC0588b);
                } else {
                    b(0, eVar7, interfaceC0588b, L12);
                }
            }
        }
    }

    private static void i(int i10, o0.e eVar, b.InterfaceC0588b interfaceC0588b) {
        o0.d dVar;
        o0.d dVar2;
        o0.d dVar3;
        o0.d dVar4;
        if (eVar.n0()) {
            return;
        }
        f38250c++;
        if (!(eVar instanceof o0.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                o0.f.O1(i11, eVar, interfaceC0588b, new b.a(), b.a.f38211k);
            }
        }
        o0.d m10 = eVar.m(d.b.TOP);
        o0.d m11 = eVar.m(d.b.BOTTOM);
        int d10 = m10.d();
        int d11 = m11.d();
        if (m10.c() != null && m10.m()) {
            Iterator it = m10.c().iterator();
            while (it.hasNext()) {
                o0.d dVar5 = (o0.d) it.next();
                o0.e eVar2 = dVar5.f37665d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.k0() && a10) {
                    o0.f.O1(i12, eVar2, interfaceC0588b, new b.a(), b.a.f38211k);
                }
                boolean z10 = (dVar5 == eVar2.f37697P && (dVar4 = eVar2.f37699R.f37667f) != null && dVar4.m()) || (dVar5 == eVar2.f37699R && (dVar3 = eVar2.f37697P.f37667f) != null && dVar3.m());
                e.b R10 = eVar2.R();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (R10 != bVar || a10) {
                    if (!eVar2.k0()) {
                        o0.d dVar6 = eVar2.f37697P;
                        if (dVar5 == dVar6 && eVar2.f37699R.f37667f == null) {
                            int e10 = dVar6.e() + d10;
                            eVar2.F0(e10, eVar2.v() + e10);
                            i(i12, eVar2, interfaceC0588b);
                        } else {
                            o0.d dVar7 = eVar2.f37699R;
                            if (dVar5 == dVar7 && dVar6.f37667f == null) {
                                int e11 = d10 - dVar7.e();
                                eVar2.F0(e11 - eVar2.v(), e11);
                                i(i12, eVar2, interfaceC0588b);
                            } else if (z10 && !eVar2.i0()) {
                                f(i12, interfaceC0588b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.R() == bVar && eVar2.f37679D >= 0 && eVar2.f37677C >= 0 && (eVar2.T() == 8 || (eVar2.f37754x == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.i0() && !eVar2.j0() && z10 && !eVar2.i0()) {
                        g(i12, eVar, interfaceC0588b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof o0.g) {
            return;
        }
        if (m11.c() != null && m11.m()) {
            Iterator it2 = m11.c().iterator();
            while (it2.hasNext()) {
                o0.d dVar8 = (o0.d) it2.next();
                o0.e eVar3 = dVar8.f37665d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.k0() && a11) {
                    o0.f.O1(i13, eVar3, interfaceC0588b, new b.a(), b.a.f38211k);
                }
                boolean z11 = (dVar8 == eVar3.f37697P && (dVar2 = eVar3.f37699R.f37667f) != null && dVar2.m()) || (dVar8 == eVar3.f37699R && (dVar = eVar3.f37697P.f37667f) != null && dVar.m());
                e.b R11 = eVar3.R();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (R11 != bVar2 || a11) {
                    if (!eVar3.k0()) {
                        o0.d dVar9 = eVar3.f37697P;
                        if (dVar8 == dVar9 && eVar3.f37699R.f37667f == null) {
                            int e12 = dVar9.e() + d11;
                            eVar3.F0(e12, eVar3.v() + e12);
                            i(i13, eVar3, interfaceC0588b);
                        } else {
                            o0.d dVar10 = eVar3.f37699R;
                            if (dVar8 == dVar10 && dVar9.f37667f == null) {
                                int e13 = d11 - dVar10.e();
                                eVar3.F0(e13 - eVar3.v(), e13);
                                i(i13, eVar3, interfaceC0588b);
                            } else if (z11 && !eVar3.i0()) {
                                f(i13, interfaceC0588b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.R() == bVar2 && eVar3.f37679D >= 0 && eVar3.f37677C >= 0 && (eVar3.T() == 8 || (eVar3.f37754x == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.j0() && z11 && !eVar3.i0()) {
                        g(i13, eVar, interfaceC0588b, eVar3);
                    }
                }
            }
        }
        o0.d m12 = eVar.m(d.b.BASELINE);
        if (m12.c() != null && m12.m()) {
            int d12 = m12.d();
            Iterator it3 = m12.c().iterator();
            while (it3.hasNext()) {
                o0.d dVar11 = (o0.d) it3.next();
                o0.e eVar4 = dVar11.f37665d;
                int i14 = i10 + 1;
                boolean a12 = a(i14, eVar4);
                if (eVar4.k0() && a12) {
                    o0.f.O1(i14, eVar4, interfaceC0588b, new b.a(), b.a.f38211k);
                }
                if (eVar4.R() != e.b.MATCH_CONSTRAINT || a12) {
                    if (!eVar4.k0() && dVar11 == eVar4.f37700S) {
                        eVar4.B0(dVar11.e() + d12);
                        i(i14, eVar4, interfaceC0588b);
                    }
                }
            }
        }
        eVar.p0();
    }
}
