package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import android.graphics.PointF;
import c2.C1718a;
import u5.C4870a;

/* renamed from: Z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1312c {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12301a = AbstractC1346c.a.a(C4870a.f43493a, "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12302b = AbstractC1346c.a.a("k");

    private static boolean a(V1.e eVar) {
        return eVar == null || (eVar.o() && ((PointF) ((C1718a) eVar.q().get(0)).f19336b).equals(0.0f, 0.0f));
    }

    private static boolean b(V1.o oVar) {
        return oVar == null || (!(oVar instanceof V1.i) && oVar.o() && ((PointF) ((C1718a) oVar.q().get(0)).f19336b).equals(0.0f, 0.0f));
    }

    private static boolean c(V1.b bVar) {
        return bVar == null || (bVar.o() && ((Float) ((C1718a) bVar.q().get(0)).f19336b).floatValue() == 0.0f);
    }

    private static boolean d(V1.g gVar) {
        return gVar == null || (gVar.o() && ((c2.d) ((C1718a) gVar.q().get(0)).f19336b).a(1.0f, 1.0f));
    }

    private static boolean e(V1.b bVar) {
        return bVar == null || (bVar.o() && ((Float) ((C1718a) bVar.q().get(0)).f19336b).floatValue() == 0.0f);
    }

    private static boolean f(V1.b bVar) {
        return bVar == null || (bVar.o() && ((Float) ((C1718a) bVar.q().get(0)).f19336b).floatValue() == 0.0f);
    }

    public static V1.n g(AbstractC1346c abstractC1346c, C1038i c1038i) {
        boolean z10;
        boolean z11 = false;
        boolean z12 = abstractC1346c.p() == AbstractC1346c.b.BEGIN_OBJECT;
        if (z12) {
            abstractC1346c.c();
        }
        V1.b bVar = null;
        V1.e eVar = null;
        V1.o oVar = null;
        V1.g gVar = null;
        V1.b bVar2 = null;
        V1.b bVar3 = null;
        V1.d dVar = null;
        V1.b bVar4 = null;
        V1.b bVar5 = null;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12301a)) {
                case 0:
                    boolean z13 = z11;
                    abstractC1346c.c();
                    while (abstractC1346c.f()) {
                        if (abstractC1346c.r(f12302b) != 0) {
                            abstractC1346c.s();
                            abstractC1346c.t();
                        } else {
                            eVar = AbstractC1310a.a(abstractC1346c, c1038i);
                        }
                    }
                    abstractC1346c.e();
                    z11 = z13;
                    continue;
                case 1:
                    oVar = AbstractC1310a.b(abstractC1346c, c1038i);
                    continue;
                case 2:
                    gVar = AbstractC1313d.j(abstractC1346c, c1038i);
                    continue;
                case 3:
                    c1038i.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = AbstractC1313d.h(abstractC1346c, c1038i);
                    continue;
                case 6:
                    bVar4 = AbstractC1313d.f(abstractC1346c, c1038i, z11);
                    continue;
                case 7:
                    bVar5 = AbstractC1313d.f(abstractC1346c, c1038i, z11);
                    continue;
                case 8:
                    bVar2 = AbstractC1313d.f(abstractC1346c, c1038i, z11);
                    continue;
                case 9:
                    bVar3 = AbstractC1313d.f(abstractC1346c, c1038i, z11);
                    continue;
                default:
                    abstractC1346c.s();
                    abstractC1346c.t();
                    continue;
            }
            V1.b f10 = AbstractC1313d.f(abstractC1346c, c1038i, z11);
            if (f10.q().isEmpty()) {
                f10.q().add(new C1718a(c1038i, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c1038i.f())));
            } else if (((C1718a) f10.q().get(0)).f19336b == null) {
                z10 = false;
                f10.q().set(0, new C1718a(c1038i, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c1038i.f())));
                z11 = z10;
                bVar = f10;
            }
            z10 = false;
            z11 = z10;
            bVar = f10;
        }
        if (z12) {
            abstractC1346c.e();
        }
        V1.e eVar2 = a(eVar) ? null : eVar;
        V1.o oVar2 = b(oVar) ? null : oVar;
        V1.b bVar6 = c(bVar) ? null : bVar;
        if (d(gVar)) {
            gVar = null;
        }
        return new V1.n(eVar2, oVar2, gVar, bVar6, dVar, bVar4, bVar5, f(bVar2) ? null : bVar2, e(bVar3) ? null : bVar3);
    }
}
