package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import c2.C1718a;
import java.util.Collections;
import u5.C4870a;

/* renamed from: Z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1311b {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12298a = AbstractC1346c.a.a("s", C4870a.f43493a);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12299b = AbstractC1346c.a.a("s", "e", "o", "r");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1346c.a f12300c = AbstractC1346c.a.a("fc", "sc", "sw", "t", "o");

    public static V1.k a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        abstractC1346c.c();
        V1.m mVar = null;
        V1.l lVar = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12298a);
            if (r10 == 0) {
                lVar = b(abstractC1346c, c1038i);
            } else if (r10 != 1) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                mVar = c(abstractC1346c, c1038i);
            }
        }
        abstractC1346c.e();
        return new V1.k(mVar, lVar);
    }

    private static V1.l b(AbstractC1346c abstractC1346c, C1038i c1038i) {
        abstractC1346c.c();
        V1.d dVar = null;
        V1.d dVar2 = null;
        V1.d dVar3 = null;
        W1.u uVar = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12299b);
            if (r10 == 0) {
                dVar = AbstractC1313d.h(abstractC1346c, c1038i);
            } else if (r10 == 1) {
                dVar2 = AbstractC1313d.h(abstractC1346c, c1038i);
            } else if (r10 == 2) {
                dVar3 = AbstractC1313d.h(abstractC1346c, c1038i);
            } else if (r10 != 3) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                int j10 = abstractC1346c.j();
                if (j10 == 1 || j10 == 2) {
                    uVar = j10 == 1 ? W1.u.PERCENT : W1.u.INDEX;
                } else {
                    c1038i.a("Unsupported text range units: " + j10);
                    uVar = W1.u.INDEX;
                }
            }
        }
        abstractC1346c.e();
        if (dVar == null && dVar2 != null) {
            dVar = new V1.d(Collections.singletonList(new C1718a(0)));
        }
        return new V1.l(dVar, dVar2, dVar3, uVar);
    }

    private static V1.m c(AbstractC1346c abstractC1346c, C1038i c1038i) {
        abstractC1346c.c();
        V1.a aVar = null;
        V1.a aVar2 = null;
        V1.b bVar = null;
        V1.b bVar2 = null;
        V1.d dVar = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12300c);
            if (r10 == 0) {
                aVar = AbstractC1313d.c(abstractC1346c, c1038i);
            } else if (r10 == 1) {
                aVar2 = AbstractC1313d.c(abstractC1346c, c1038i);
            } else if (r10 == 2) {
                bVar = AbstractC1313d.e(abstractC1346c, c1038i);
            } else if (r10 == 3) {
                bVar2 = AbstractC1313d.e(abstractC1346c, c1038i);
            } else if (r10 != 4) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                dVar = AbstractC1313d.h(abstractC1346c, c1038i);
            }
        }
        abstractC1346c.e();
        return new V1.m(aVar, aVar2, bVar, bVar2, dVar);
    }
}
