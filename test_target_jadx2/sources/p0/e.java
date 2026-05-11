package p0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o0.e;
import p0.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private o0.f f38226a;

    /* renamed from: d, reason: collision with root package name */
    private o0.f f38229d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38227b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38228c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f38230e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f38231f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0588b f38232g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f38233h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f38234i = new ArrayList();

    public e(o0.f fVar) {
        this.f38226a = fVar;
        this.f38229d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        p pVar = fVar.f38238d;
        if (pVar.f38281c == null) {
            o0.f fVar3 = this.f38226a;
            if (pVar == fVar3.f37716e || pVar == fVar3.f37718f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f38281c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f38286h.f38245k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f38287i.f38245k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f38261k.f38245k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f38286h.f38246l) {
                if (fVar4 == fVar2) {
                    mVar.f38255b = true;
                }
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f38287i.f38246l) {
                if (fVar5 == fVar2) {
                    mVar.f38255b = true;
                }
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f38261k.f38246l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i10, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(o0.f fVar) {
        int i10;
        e.b bVar;
        int i11;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator it = fVar.f37804K0.iterator();
        while (it.hasNext()) {
            o0.e eVar = (o0.e) it.next();
            e.b[] bVarArr = eVar.f37707Z;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (eVar.T() == 8) {
                eVar.f37708a = true;
            } else {
                if (eVar.f37675B < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    eVar.f37752w = 2;
                }
                if (eVar.f37681E < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar.f37754x = 2;
                }
                if (eVar.t() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        eVar.f37752w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        eVar.f37754x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (eVar.f37752w == 0) {
                            eVar.f37752w = 3;
                        }
                        if (eVar.f37754x == 0) {
                            eVar.f37754x = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && eVar.f37752w == 1 && (eVar.f37696O.f37667f == null || eVar.f37698Q.f37667f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && eVar.f37754x == 1 && (eVar.f37697P.f37667f == null || eVar.f37699R.f37667f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = eVar.f37716e;
                lVar.f38282d = bVar9;
                int i12 = eVar.f37752w;
                lVar.f38279a = i12;
                n nVar = eVar.f37718f;
                nVar.f38282d = bVar10;
                int i13 = eVar.f37754x;
                nVar.f38279a = i13;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int U10 = eVar.U();
                    if (bVar9 == bVar11) {
                        i10 = (fVar.U() - eVar.f37696O.f37668g) - eVar.f37698Q.f37668g;
                        bVar = e.b.FIXED;
                    } else {
                        i10 = U10;
                        bVar = bVar9;
                    }
                    int v10 = eVar.v();
                    if (bVar10 == bVar11) {
                        i11 = (fVar.v() - eVar.f37697P.f37668g) - eVar.f37699R.f37668g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i11 = v10;
                        bVar2 = bVar10;
                    }
                    l(eVar, bVar, i10, bVar2, i11);
                    eVar.f37716e.f38283e.d(eVar.U());
                    eVar.f37718f.f38283e.d(eVar.v());
                    eVar.f37708a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i12 == 3) {
                            if (bVar10 == bVar4) {
                                l(eVar, bVar4, 0, bVar4, 0);
                            }
                            int v11 = eVar.v();
                            int i14 = (int) ((v11 * eVar.f37715d0) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            l(eVar, bVar12, i14, bVar12, v11);
                            eVar.f37716e.f38283e.d(eVar.U());
                            eVar.f37718f.f38283e.d(eVar.v());
                            eVar.f37708a = true;
                        } else if (i12 == 1) {
                            l(eVar, bVar4, 0, bVar10, 0);
                            eVar.f37716e.f38283e.f38247m = eVar.U();
                        } else if (i12 == 2) {
                            e.b bVar13 = fVar.f37707Z[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                l(eVar, bVar14, (int) ((eVar.f37675B * fVar.U()) + 0.5f), bVar10, eVar.v());
                                eVar.f37716e.f38283e.d(eVar.U());
                                eVar.f37718f.f38283e.d(eVar.v());
                                eVar.f37708a = true;
                            }
                        } else {
                            o0.d[] dVarArr = eVar.f37704W;
                            if (dVarArr[0].f37667f == null || dVarArr[1].f37667f == null) {
                                l(eVar, bVar4, 0, bVar10, 0);
                                eVar.f37716e.f38283e.d(eVar.U());
                                eVar.f37718f.f38283e.d(eVar.v());
                                eVar.f37708a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar9 == bVar3) {
                                l(eVar, bVar3, 0, bVar3, 0);
                            }
                            int U11 = eVar.U();
                            float f10 = eVar.f37715d0;
                            if (eVar.u() == -1) {
                                f10 = 1.0f / f10;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(eVar, bVar15, U11, bVar15, (int) ((U11 * f10) + 0.5f));
                            eVar.f37716e.f38283e.d(eVar.U());
                            eVar.f37718f.f38283e.d(eVar.v());
                            eVar.f37708a = true;
                        } else if (i13 == 1) {
                            l(eVar, bVar9, 0, bVar3, 0);
                            eVar.f37718f.f38283e.f38247m = eVar.v();
                        } else if (i13 == 2) {
                            e.b bVar16 = fVar.f37707Z[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                l(eVar, bVar9, eVar.U(), bVar17, (int) ((eVar.f37681E * fVar.v()) + 0.5f));
                                eVar.f37716e.f38283e.d(eVar.U());
                                eVar.f37718f.f38283e.d(eVar.v());
                                eVar.f37708a = true;
                            }
                        } else {
                            o0.d[] dVarArr2 = eVar.f37704W;
                            if (dVarArr2[2].f37667f == null || dVarArr2[3].f37667f == null) {
                                l(eVar, bVar3, 0, bVar10, 0);
                                eVar.f37716e.f38283e.d(eVar.U());
                                eVar.f37718f.f38283e.d(eVar.v());
                                eVar.f37708a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i12 == 1 || i13 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(eVar, bVar18, 0, bVar18, 0);
                            eVar.f37716e.f38283e.f38247m = eVar.U();
                            eVar.f37718f.f38283e.f38247m = eVar.v();
                        } else if (i13 == 2 && i12 == 2) {
                            e.b[] bVarArr2 = fVar.f37707Z;
                            e.b bVar19 = bVarArr2[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                l(eVar, bVar20, (int) ((eVar.f37675B * fVar.U()) + 0.5f), bVar20, (int) ((eVar.f37681E * fVar.v()) + 0.5f));
                                eVar.f37716e.f38283e.d(eVar.U());
                                eVar.f37718f.f38283e.d(eVar.v());
                                eVar.f37708a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(o0.f fVar, int i10) {
        int size = this.f38234i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, ((m) this.f38234i.get(i11)).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f38286h.f38245k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f38287i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f38286h, i10, 0, pVar.f38287i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f38287i.f38245k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f38286h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f38287i, i10, 1, pVar.f38286h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f38261k.f38245k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(o0.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f38233h;
        aVar.f38214a = bVar;
        aVar.f38215b = bVar2;
        aVar.f38216c = i10;
        aVar.f38217d = i11;
        this.f38232g.b(eVar, aVar);
        eVar.g1(this.f38233h.f38218e);
        eVar.I0(this.f38233h.f38219f);
        eVar.H0(this.f38233h.f38221h);
        eVar.x0(this.f38233h.f38220g);
    }

    public void c() {
        d(this.f38230e);
        this.f38234i.clear();
        m.f38253h = 0;
        i(this.f38226a.f37716e, 0, this.f38234i);
        i(this.f38226a.f37718f, 1, this.f38234i);
        this.f38227b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f38229d.f37716e.f();
        this.f38229d.f37718f.f();
        arrayList.add(this.f38229d.f37716e);
        arrayList.add(this.f38229d.f37718f);
        Iterator it = this.f38229d.f37804K0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o0.e eVar = (o0.e) it.next();
            if (eVar instanceof o0.g) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.g0()) {
                    if (eVar.f37712c == null) {
                        eVar.f37712c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f37712c);
                } else {
                    arrayList.add(eVar.f37716e);
                }
                if (eVar.i0()) {
                    if (eVar.f37714d == null) {
                        eVar.f37714d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f37714d);
                } else {
                    arrayList.add(eVar.f37718f);
                }
                if (eVar instanceof o0.i) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f38280b != this.f38229d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f38227b || this.f38228c) {
            Iterator it = this.f38226a.f37804K0.iterator();
            while (it.hasNext()) {
                o0.e eVar = (o0.e) it.next();
                eVar.l();
                eVar.f37708a = false;
                eVar.f37716e.r();
                eVar.f37718f.q();
            }
            this.f38226a.l();
            o0.f fVar = this.f38226a;
            fVar.f37708a = false;
            fVar.f37716e.r();
            this.f38226a.f37718f.q();
            this.f38228c = false;
        }
        if (b(this.f38229d)) {
            return false;
        }
        this.f38226a.i1(0);
        this.f38226a.j1(0);
        e.b s10 = this.f38226a.s(0);
        e.b s11 = this.f38226a.s(1);
        if (this.f38227b) {
            c();
        }
        int V10 = this.f38226a.V();
        int W10 = this.f38226a.W();
        this.f38226a.f37716e.f38286h.d(V10);
        this.f38226a.f37718f.f38286h.d(W10);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z10) {
                Iterator it2 = this.f38230e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((p) it2.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && s10 == e.b.WRAP_CONTENT) {
                this.f38226a.M0(e.b.FIXED);
                o0.f fVar2 = this.f38226a;
                fVar2.g1(e(fVar2, 0));
                o0.f fVar3 = this.f38226a;
                fVar3.f37716e.f38283e.d(fVar3.U());
            }
            if (z10 && s11 == e.b.WRAP_CONTENT) {
                this.f38226a.c1(e.b.FIXED);
                o0.f fVar4 = this.f38226a;
                fVar4.I0(e(fVar4, 1));
                o0.f fVar5 = this.f38226a;
                fVar5.f37718f.f38283e.d(fVar5.v());
            }
        }
        o0.f fVar6 = this.f38226a;
        e.b bVar2 = fVar6.f37707Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int U10 = fVar6.U() + V10;
            this.f38226a.f37716e.f38287i.d(U10);
            this.f38226a.f37716e.f38283e.d(U10 - V10);
            m();
            o0.f fVar7 = this.f38226a;
            e.b bVar4 = fVar7.f37707Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + W10;
                this.f38226a.f37718f.f38287i.d(v10);
                this.f38226a.f37718f.f38283e.d(v10 - W10);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = this.f38230e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f38280b != this.f38226a || pVar.f38285g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f38230e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p pVar2 = (p) it4.next();
            if (z11 || pVar2.f38280b != this.f38226a) {
                if (!pVar2.f38286h.f38244j) {
                    break;
                }
                if (!pVar2.f38287i.f38244j) {
                    if (!(pVar2 instanceof j)) {
                        break;
                    }
                }
                if (!pVar2.f38283e.f38244j && !(pVar2 instanceof c) && !(pVar2 instanceof j)) {
                    break;
                }
            }
        }
        this.f38226a.M0(s10);
        this.f38226a.c1(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f38227b) {
            Iterator it = this.f38226a.f37804K0.iterator();
            while (it.hasNext()) {
                o0.e eVar = (o0.e) it.next();
                eVar.l();
                eVar.f37708a = false;
                l lVar = eVar.f37716e;
                lVar.f38283e.f38244j = false;
                lVar.f38285g = false;
                lVar.r();
                n nVar = eVar.f37718f;
                nVar.f38283e.f38244j = false;
                nVar.f38285g = false;
                nVar.q();
            }
            this.f38226a.l();
            o0.f fVar = this.f38226a;
            fVar.f37708a = false;
            l lVar2 = fVar.f37716e;
            lVar2.f38283e.f38244j = false;
            lVar2.f38285g = false;
            lVar2.r();
            n nVar2 = this.f38226a.f37718f;
            nVar2.f38283e.f38244j = false;
            nVar2.f38285g = false;
            nVar2.q();
            c();
        }
        if (b(this.f38229d)) {
            return false;
        }
        this.f38226a.i1(0);
        this.f38226a.j1(0);
        this.f38226a.f37716e.f38286h.d(0);
        this.f38226a.f37718f.f38286h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b s10 = this.f38226a.s(0);
        e.b s11 = this.f38226a.s(1);
        int V10 = this.f38226a.V();
        int W10 = this.f38226a.W();
        if (z10 && (s10 == (bVar = e.b.WRAP_CONTENT) || s11 == bVar)) {
            Iterator it = this.f38230e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f38284f == i10 && !pVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && s10 == e.b.WRAP_CONTENT) {
                    this.f38226a.M0(e.b.FIXED);
                    o0.f fVar = this.f38226a;
                    fVar.g1(e(fVar, 0));
                    o0.f fVar2 = this.f38226a;
                    fVar2.f37716e.f38283e.d(fVar2.U());
                }
            } else if (z10 && s11 == e.b.WRAP_CONTENT) {
                this.f38226a.c1(e.b.FIXED);
                o0.f fVar3 = this.f38226a;
                fVar3.I0(e(fVar3, 1));
                o0.f fVar4 = this.f38226a;
                fVar4.f37718f.f38283e.d(fVar4.v());
            }
        }
        if (i10 == 0) {
            o0.f fVar5 = this.f38226a;
            e.b bVar2 = fVar5.f37707Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int U10 = fVar5.U() + V10;
                this.f38226a.f37716e.f38287i.d(U10);
                this.f38226a.f37716e.f38283e.d(U10 - V10);
                z11 = true;
            }
            z11 = false;
        } else {
            o0.f fVar6 = this.f38226a;
            e.b bVar3 = fVar6.f37707Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int v10 = fVar6.v() + W10;
                this.f38226a.f37718f.f38287i.d(v10);
                this.f38226a.f37718f.f38283e.d(v10 - W10);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator it2 = this.f38230e.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f38284f == i10 && (pVar2.f38280b != this.f38226a || pVar2.f38285g)) {
                pVar2.e();
            }
        }
        Iterator it3 = this.f38230e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            p pVar3 = (p) it3.next();
            if (pVar3.f38284f == i10 && (z11 || pVar3.f38280b != this.f38226a)) {
                if (!pVar3.f38286h.f38244j) {
                    break;
                }
                if (!pVar3.f38287i.f38244j) {
                    break;
                }
                if (!(pVar3 instanceof c) && !pVar3.f38283e.f38244j) {
                    break;
                }
            }
        }
        this.f38226a.M0(s10);
        this.f38226a.c1(s11);
        return z12;
    }

    public void j() {
        this.f38227b = true;
    }

    public void k() {
        this.f38228c = true;
    }

    public void m() {
        g gVar;
        Iterator it = this.f38226a.f37804K0.iterator();
        while (it.hasNext()) {
            o0.e eVar = (o0.e) it.next();
            if (!eVar.f37708a) {
                e.b[] bVarArr = eVar.f37707Z;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = eVar.f37752w;
                int i11 = eVar.f37754x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = eVar.f37716e.f38283e;
                boolean z12 = gVar2.f38244j;
                g gVar3 = eVar.f37718f.f38283e;
                boolean z13 = gVar3.f38244j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar2.f38241g, bVar4, gVar3.f38241g);
                    eVar.f37708a = true;
                } else if (z12 && z10) {
                    l(eVar, e.b.FIXED, gVar2.f38241g, bVar3, gVar3.f38241g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f37718f.f38283e.f38247m = eVar.v();
                    } else {
                        eVar.f37718f.f38283e.d(eVar.v());
                        eVar.f37708a = true;
                    }
                } else if (z13 && z11) {
                    l(eVar, bVar3, gVar2.f38241g, e.b.FIXED, gVar3.f38241g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f37716e.f38283e.f38247m = eVar.U();
                    } else {
                        eVar.f37716e.f38283e.d(eVar.U());
                        eVar.f37708a = true;
                    }
                }
                if (eVar.f37708a && (gVar = eVar.f37718f.f38262l) != null) {
                    gVar.d(eVar.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0588b interfaceC0588b) {
        this.f38232g = interfaceC0588b;
    }
}
