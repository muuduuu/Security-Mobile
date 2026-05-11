package p0;

import java.util.ArrayList;
import java.util.Iterator;
import o0.C3736a;
import o0.d;
import o0.e;
import p0.b;

/* loaded from: classes.dex */
public abstract class i {
    public static o a(o0.e eVar, int i10, ArrayList arrayList, o oVar) {
        int o12;
        int i11 = i10 == 0 ? eVar.f37688H0 : eVar.f37690I0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f38266b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof o0.i) && (o12 = ((o0.i) eVar).o1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i13);
                    if (oVar3.c() == o12) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof o0.g) {
                o0.g gVar = (o0.g) eVar;
                gVar.n1().b(gVar.o1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.f37688H0 = oVar.c();
                eVar.f37696O.b(i10, arrayList, oVar);
                eVar.f37698Q.b(i10, arrayList, oVar);
            } else {
                eVar.f37690I0 = oVar.c();
                eVar.f37697P.b(i10, arrayList, oVar);
                eVar.f37700S.b(i10, arrayList, oVar);
                eVar.f37699R.b(i10, arrayList, oVar);
            }
            eVar.f37703V.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.f38266b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(o0.f fVar, b.InterfaceC0588b interfaceC0588b) {
        o oVar;
        boolean z10;
        boolean z11;
        o oVar2;
        ArrayList n12 = fVar.n1();
        int size = n12.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            o0.e eVar = (o0.e) n12.get(i11);
            if (!d(fVar.y(), fVar.R(), eVar.y(), eVar.R())) {
                return false;
            }
        }
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i12 < size) {
            o0.e eVar2 = (o0.e) n12.get(i12);
            if (!d(fVar.y(), fVar.R(), eVar2.y(), eVar2.R())) {
                o0.f.O1(i10, eVar2, interfaceC0588b, fVar.f37791o1, b.a.f38211k);
            }
            boolean z12 = eVar2 instanceof o0.g;
            if (z12) {
                o0.g gVar = (o0.g) eVar2;
                if (gVar.o1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(gVar);
                }
                if (gVar.o1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gVar);
                }
            }
            if (eVar2 instanceof o0.i) {
                if (eVar2 instanceof C3736a) {
                    C3736a c3736a = (C3736a) eVar2;
                    if (c3736a.t1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c3736a);
                    }
                    if (c3736a.t1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c3736a);
                    }
                } else {
                    o0.i iVar = (o0.i) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(iVar);
                }
            }
            if (eVar2.f37696O.f37667f == null && eVar2.f37698Q.f37667f == null && !z12 && !(eVar2 instanceof C3736a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.f37697P.f37667f == null && eVar2.f37699R.f37667f == null && eVar2.f37700S.f37667f == null && !z12 && !(eVar2 instanceof C3736a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((o0.g) it.next(), 0, arrayList7, null);
            }
        }
        int i13 = 0;
        o oVar3 = null;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                o0.i iVar2 = (o0.i) it2.next();
                o a10 = a(iVar2, i13, arrayList7, oVar3);
                iVar2.n1(arrayList7, i13, a10);
                a10.b(arrayList7);
                i13 = 0;
                oVar3 = null;
            }
        }
        o0.d m10 = fVar.m(d.b.LEFT);
        if (m10.c() != null) {
            Iterator it3 = m10.c().iterator();
            while (it3.hasNext()) {
                a(((o0.d) it3.next()).f37665d, 0, arrayList7, null);
            }
        }
        o0.d m11 = fVar.m(d.b.RIGHT);
        if (m11.c() != null) {
            Iterator it4 = m11.c().iterator();
            while (it4.hasNext()) {
                a(((o0.d) it4.next()).f37665d, 0, arrayList7, null);
            }
        }
        o0.d m12 = fVar.m(d.b.CENTER);
        if (m12.c() != null) {
            Iterator it5 = m12.c().iterator();
            while (it5.hasNext()) {
                a(((o0.d) it5.next()).f37665d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                a((o0.e) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                a((o0.g) it7.next(), 1, arrayList7, null);
            }
        }
        int i14 = 1;
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                o0.i iVar3 = (o0.i) it8.next();
                o a11 = a(iVar3, i14, arrayList7, oVar4);
                iVar3.n1(arrayList7, i14, a11);
                a11.b(arrayList7);
                i14 = 1;
                oVar4 = null;
            }
        }
        o0.d m13 = fVar.m(d.b.TOP);
        if (m13.c() != null) {
            Iterator it9 = m13.c().iterator();
            while (it9.hasNext()) {
                a(((o0.d) it9.next()).f37665d, 1, arrayList7, null);
            }
        }
        o0.d m14 = fVar.m(d.b.BASELINE);
        if (m14.c() != null) {
            Iterator it10 = m14.c().iterator();
            while (it10.hasNext()) {
                a(((o0.d) it10.next()).f37665d, 1, arrayList7, null);
            }
        }
        o0.d m15 = fVar.m(d.b.BOTTOM);
        if (m15.c() != null) {
            Iterator it11 = m15.c().iterator();
            while (it11.hasNext()) {
                a(((o0.d) it11.next()).f37665d, 1, arrayList7, null);
            }
        }
        o0.d m16 = fVar.m(d.b.CENTER);
        if (m16.c() != null) {
            Iterator it12 = m16.c().iterator();
            while (it12.hasNext()) {
                a(((o0.d) it12.next()).f37665d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                a((o0.e) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            o0.e eVar3 = (o0.e) n12.get(i15);
            if (eVar3.q0()) {
                o b10 = b(arrayList7, eVar3.f37688H0);
                o b11 = b(arrayList7, eVar3.f37690I0);
                if (b10 != null && b11 != null) {
                    b10.g(0, b11);
                    b11.i(2);
                    arrayList7.remove(b10);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.y() == e.b.WRAP_CONTENT) {
            Iterator it14 = arrayList7.iterator();
            oVar = null;
            int i16 = 0;
            while (it14.hasNext()) {
                o oVar5 = (o) it14.next();
                if (oVar5.d() != 1) {
                    oVar5.h(false);
                    int f10 = oVar5.f(fVar.H1(), 0);
                    if (f10 > i16) {
                        oVar = oVar5;
                        i16 = f10;
                    }
                }
            }
            if (oVar != null) {
                fVar.M0(e.b.FIXED);
                fVar.g1(i16);
                oVar.h(true);
                if (fVar.R() != e.b.WRAP_CONTENT) {
                    Iterator it15 = arrayList7.iterator();
                    o oVar6 = null;
                    int i17 = 0;
                    while (it15.hasNext()) {
                        o oVar7 = (o) it15.next();
                        if (oVar7.d() != 0) {
                            oVar7.h(false);
                            int f11 = oVar7.f(fVar.H1(), 1);
                            if (f11 > i17) {
                                oVar6 = oVar7;
                                i17 = f11;
                            }
                        }
                    }
                    z10 = false;
                    z11 = true;
                    if (oVar6 != null) {
                        fVar.c1(e.b.FIXED);
                        fVar.I0(i17);
                        oVar6.h(true);
                        oVar2 = oVar6;
                        return (oVar == null || oVar2 != null) ? z11 : z10;
                    }
                } else {
                    z10 = false;
                    z11 = true;
                }
                oVar2 = null;
                if (oVar == null) {
                }
            }
        }
        oVar = null;
        if (fVar.R() != e.b.WRAP_CONTENT) {
        }
        oVar2 = null;
        if (oVar == null) {
        }
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
