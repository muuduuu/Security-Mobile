package Z1;

import O1.C1038i;
import a2.AbstractC1346c;

/* renamed from: Z1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1314e {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12303a = AbstractC1346c.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12304b = AbstractC1346c.a.a("ty", "v");

    private static W1.a a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        abstractC1346c.c();
        W1.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (abstractC1346c.f()) {
                int r10 = abstractC1346c.r(f12304b);
                if (r10 != 0) {
                    if (r10 != 1) {
                        abstractC1346c.s();
                        abstractC1346c.t();
                    } else if (z10) {
                        aVar = new W1.a(AbstractC1313d.e(abstractC1346c, c1038i));
                    } else {
                        abstractC1346c.t();
                    }
                } else if (abstractC1346c.j() == 0) {
                    z10 = true;
                }
            }
            abstractC1346c.e();
            return aVar;
        }
    }

    static W1.a b(AbstractC1346c abstractC1346c, C1038i c1038i) {
        W1.a aVar = null;
        while (abstractC1346c.f()) {
            if (abstractC1346c.r(f12303a) != 0) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                abstractC1346c.b();
                while (abstractC1346c.f()) {
                    W1.a a10 = a(abstractC1346c, c1038i);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                abstractC1346c.d();
            }
        }
        return aVar;
    }
}
