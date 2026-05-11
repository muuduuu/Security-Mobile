package Z1;

import O1.C1038i;
import W1.t;
import a2.AbstractC1346c;

/* loaded from: classes.dex */
abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12296a = AbstractC1346c.a.a("s", "e", "o", "nm", "m", "hd");

    static W1.t a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        String str = null;
        t.a aVar = null;
        V1.b bVar = null;
        V1.b bVar2 = null;
        V1.b bVar3 = null;
        boolean z10 = false;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12296a);
            if (r10 == 0) {
                bVar = AbstractC1313d.f(abstractC1346c, c1038i, false);
            } else if (r10 == 1) {
                bVar2 = AbstractC1313d.f(abstractC1346c, c1038i, false);
            } else if (r10 == 2) {
                bVar3 = AbstractC1313d.f(abstractC1346c, c1038i, false);
            } else if (r10 == 3) {
                str = abstractC1346c.n();
            } else if (r10 == 4) {
                aVar = t.a.forId(abstractC1346c.j());
            } else if (r10 != 5) {
                abstractC1346c.t();
            } else {
                z10 = abstractC1346c.g();
            }
        }
        return new W1.t(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
