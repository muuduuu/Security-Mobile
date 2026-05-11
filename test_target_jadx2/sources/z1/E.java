package Z1;

import O1.C1038i;
import a2.AbstractC1346c;

/* loaded from: classes.dex */
abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12286a = AbstractC1346c.a.a("nm", "c", "o", "tr", "hd");

    static W1.m a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        String str = null;
        V1.b bVar = null;
        V1.b bVar2 = null;
        V1.n nVar = null;
        boolean z10 = false;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12286a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                bVar = AbstractC1313d.f(abstractC1346c, c1038i, false);
            } else if (r10 == 2) {
                bVar2 = AbstractC1313d.f(abstractC1346c, c1038i, false);
            } else if (r10 == 3) {
                nVar = AbstractC1312c.g(abstractC1346c, c1038i);
            } else if (r10 != 4) {
                abstractC1346c.t();
            } else {
                z10 = abstractC1346c.g();
            }
        }
        return new W1.m(str, bVar, bVar2, nVar, z10);
    }
}
