package Z1;

import O1.C1038i;
import W1.k;
import a2.AbstractC1346c;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes.dex */
abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12284a = AbstractC1346c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static W1.k a(AbstractC1346c abstractC1346c, C1038i c1038i, int i10) {
        boolean z10 = false;
        boolean z11 = i10 == 3;
        String str = null;
        k.a aVar = null;
        V1.b bVar = null;
        V1.o oVar = null;
        V1.b bVar2 = null;
        V1.b bVar3 = null;
        V1.b bVar4 = null;
        V1.b bVar5 = null;
        V1.b bVar6 = null;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12284a)) {
                case 0:
                    str = abstractC1346c.n();
                    break;
                case 1:
                    aVar = k.a.forValue(abstractC1346c.j());
                    break;
                case 2:
                    bVar = AbstractC1313d.f(abstractC1346c, c1038i, false);
                    break;
                case 3:
                    oVar = AbstractC1310a.b(abstractC1346c, c1038i);
                    break;
                case 4:
                    bVar2 = AbstractC1313d.f(abstractC1346c, c1038i, false);
                    break;
                case 5:
                    bVar4 = AbstractC1313d.e(abstractC1346c, c1038i);
                    break;
                case 6:
                    bVar6 = AbstractC1313d.f(abstractC1346c, c1038i, false);
                    break;
                case 7:
                    bVar3 = AbstractC1313d.e(abstractC1346c, c1038i);
                    break;
                case 8:
                    bVar5 = AbstractC1313d.f(abstractC1346c, c1038i, false);
                    break;
                case 9:
                    z10 = abstractC1346c.g();
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (abstractC1346c.j() != 3) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                default:
                    abstractC1346c.s();
                    abstractC1346c.t();
                    break;
            }
        }
        return new W1.k(str, aVar, bVar, oVar, bVar2, bVar3, bVar4, bVar5, bVar6, z10, z11);
    }
}
