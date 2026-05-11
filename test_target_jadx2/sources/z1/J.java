package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class J {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12292a = AbstractC1346c.a.a("nm", "hd", "it");

    static W1.q a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12292a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                z10 = abstractC1346c.g();
            } else if (r10 != 2) {
                abstractC1346c.t();
            } else {
                abstractC1346c.b();
                while (abstractC1346c.f()) {
                    W1.c a10 = AbstractC1317h.a(abstractC1346c, c1038i);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                abstractC1346c.d();
            }
        }
        return new W1.q(str, arrayList, z10);
    }
}
