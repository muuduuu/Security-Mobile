package Z1;

import O1.C1038i;
import a2.AbstractC1346c;

/* loaded from: classes.dex */
abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12285a = AbstractC1346c.a.a("nm", "p", "s", "r", "hd");

    static W1.l a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        String str = null;
        V1.o oVar = null;
        V1.f fVar = null;
        V1.b bVar = null;
        boolean z10 = false;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12285a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                oVar = AbstractC1310a.b(abstractC1346c, c1038i);
            } else if (r10 == 2) {
                fVar = AbstractC1313d.i(abstractC1346c, c1038i);
            } else if (r10 == 3) {
                bVar = AbstractC1313d.e(abstractC1346c, c1038i);
            } else if (r10 != 4) {
                abstractC1346c.t();
            } else {
                z10 = abstractC1346c.g();
            }
        }
        return new W1.l(str, oVar, fVar, bVar, z10);
    }
}
