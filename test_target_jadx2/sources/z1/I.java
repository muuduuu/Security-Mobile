package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import android.graphics.Path;
import c2.C1718a;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class I {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12291a = AbstractC1346c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static W1.p a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        V1.d dVar = null;
        String str = null;
        V1.a aVar = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12291a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                aVar = AbstractC1313d.c(abstractC1346c, c1038i);
            } else if (r10 == 2) {
                dVar = AbstractC1313d.h(abstractC1346c, c1038i);
            } else if (r10 == 3) {
                z10 = abstractC1346c.g();
            } else if (r10 == 4) {
                i10 = abstractC1346c.j();
            } else if (r10 != 5) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                z11 = abstractC1346c.g();
            }
        }
        if (dVar == null) {
            dVar = new V1.d(Collections.singletonList(new C1718a(100)));
        }
        return new W1.p(str, z10, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z11);
    }
}
