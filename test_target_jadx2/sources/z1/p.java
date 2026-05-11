package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import android.graphics.Path;
import c2.C1718a;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12327a = AbstractC1346c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12328b = AbstractC1346c.a.a("p", "k");

    static W1.e a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        V1.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        W1.g gVar = null;
        V1.c cVar = null;
        V1.f fVar = null;
        V1.f fVar2 = null;
        boolean z10 = false;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12327a)) {
                case 0:
                    str = abstractC1346c.n();
                    break;
                case 1:
                    abstractC1346c.c();
                    int i10 = -1;
                    while (abstractC1346c.f()) {
                        int r10 = abstractC1346c.r(f12328b);
                        if (r10 == 0) {
                            i10 = abstractC1346c.j();
                        } else if (r10 != 1) {
                            abstractC1346c.s();
                            abstractC1346c.t();
                        } else {
                            cVar = AbstractC1313d.g(abstractC1346c, c1038i, i10);
                        }
                    }
                    abstractC1346c.e();
                    break;
                case 2:
                    dVar = AbstractC1313d.h(abstractC1346c, c1038i);
                    break;
                case 3:
                    gVar = abstractC1346c.j() == 1 ? W1.g.LINEAR : W1.g.RADIAL;
                    break;
                case 4:
                    fVar = AbstractC1313d.i(abstractC1346c, c1038i);
                    break;
                case 5:
                    fVar2 = AbstractC1313d.i(abstractC1346c, c1038i);
                    break;
                case 6:
                    fillType = abstractC1346c.j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z10 = abstractC1346c.g();
                    break;
                default:
                    abstractC1346c.s();
                    abstractC1346c.t();
                    break;
            }
        }
        return new W1.e(str, gVar, fillType, cVar, dVar == null ? new V1.d(Collections.singletonList(new C1718a(100))) : dVar, fVar, fVar2, null, null, z10);
    }
}
