package Z1;

import O1.C1038i;
import a2.AbstractC1346c;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12287a = AbstractC1346c.a.a("nm", "r", "hd");

    static W1.n a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        boolean z10 = false;
        String str = null;
        V1.b bVar = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12287a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                bVar = AbstractC1313d.f(abstractC1346c, c1038i, true);
            } else if (r10 != 2) {
                abstractC1346c.t();
            } else {
                z10 = abstractC1346c.g();
            }
        }
        if (z10) {
            return null;
        }
        return new W1.n(str, bVar);
    }
}
