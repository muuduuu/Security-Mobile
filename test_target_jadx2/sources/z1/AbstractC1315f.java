package Z1;

import O1.C1038i;
import a2.AbstractC1346c;

/* renamed from: Z1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1315f {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12305a = AbstractC1346c.a.a("nm", "p", "s", "hd", "d");

    static W1.b a(AbstractC1346c abstractC1346c, C1038i c1038i, int i10) {
        boolean z10 = i10 == 3;
        boolean z11 = false;
        String str = null;
        V1.o oVar = null;
        V1.f fVar = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12305a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                oVar = AbstractC1310a.b(abstractC1346c, c1038i);
            } else if (r10 == 2) {
                fVar = AbstractC1313d.i(abstractC1346c, c1038i);
            } else if (r10 == 3) {
                z11 = abstractC1346c.g();
            } else if (r10 != 4) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                z10 = abstractC1346c.j() == 3;
            }
        }
        return new W1.b(str, oVar, fVar, z10, z11);
    }
}
