package Z1;

import O1.C1038i;
import a2.AbstractC1346c;

/* loaded from: classes.dex */
abstract class K {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC1346c.a f12293a = AbstractC1346c.a.a("nm", "ind", "ks", "hd");

    static W1.r a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        V1.h hVar = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12293a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                i10 = abstractC1346c.j();
            } else if (r10 == 2) {
                hVar = AbstractC1313d.k(abstractC1346c, c1038i);
            } else if (r10 != 3) {
                abstractC1346c.t();
            } else {
                z10 = abstractC1346c.g();
            }
        }
        return new W1.r(str, i10, hVar, z10);
    }
}
