package Z1;

import W1.j;
import a2.AbstractC1346c;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12348a = AbstractC1346c.a.a("nm", "mm", "hd");

    static W1.j a(AbstractC1346c abstractC1346c) {
        String str = null;
        boolean z10 = false;
        j.a aVar = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12348a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                aVar = j.a.forId(abstractC1346c.j());
            } else if (r10 != 2) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                z10 = abstractC1346c.g();
            }
        }
        return new W1.j(str, aVar, z10);
    }
}
