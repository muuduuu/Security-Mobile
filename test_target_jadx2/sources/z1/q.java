package Z1;

import O1.C1038i;
import W1.s;
import a2.AbstractC1346c;
import c2.C1718a;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12329a = AbstractC1346c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12330b = AbstractC1346c.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1346c.a f12331c = AbstractC1346c.a.a("n", "v");

    static W1.f a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        String str;
        V1.c cVar;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str2 = null;
        W1.g gVar = null;
        V1.c cVar2 = null;
        V1.f fVar = null;
        V1.f fVar2 = null;
        V1.b bVar = null;
        s.b bVar2 = null;
        s.c cVar3 = null;
        V1.b bVar3 = null;
        boolean z10 = false;
        V1.d dVar = null;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12329a)) {
                case 0:
                    str2 = abstractC1346c.n();
                    continue;
                case 1:
                    str = str2;
                    abstractC1346c.c();
                    int i10 = -1;
                    while (abstractC1346c.f()) {
                        int r10 = abstractC1346c.r(f12330b);
                        if (r10 != 0) {
                            cVar = cVar2;
                            if (r10 != 1) {
                                abstractC1346c.s();
                                abstractC1346c.t();
                            } else {
                                cVar2 = AbstractC1313d.g(abstractC1346c, c1038i, i10);
                            }
                        } else {
                            cVar = cVar2;
                            i10 = abstractC1346c.j();
                        }
                        cVar2 = cVar;
                    }
                    abstractC1346c.e();
                    break;
                case 2:
                    dVar = AbstractC1313d.h(abstractC1346c, c1038i);
                    continue;
                case 3:
                    str = str2;
                    gVar = abstractC1346c.j() == 1 ? W1.g.LINEAR : W1.g.RADIAL;
                    break;
                case 4:
                    fVar = AbstractC1313d.i(abstractC1346c, c1038i);
                    continue;
                case 5:
                    fVar2 = AbstractC1313d.i(abstractC1346c, c1038i);
                    continue;
                case 6:
                    bVar = AbstractC1313d.e(abstractC1346c, c1038i);
                    continue;
                case 7:
                    str = str2;
                    bVar2 = s.b.values()[abstractC1346c.j() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar3 = s.c.values()[abstractC1346c.j() - 1];
                    break;
                case 9:
                    str = str2;
                    f10 = (float) abstractC1346c.i();
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    z10 = abstractC1346c.g();
                    continue;
                case 11:
                    abstractC1346c.b();
                    while (abstractC1346c.f()) {
                        abstractC1346c.c();
                        String str3 = null;
                        V1.b bVar4 = null;
                        while (abstractC1346c.f()) {
                            int r11 = abstractC1346c.r(f12331c);
                            if (r11 != 0) {
                                V1.b bVar5 = bVar3;
                                if (r11 != 1) {
                                    abstractC1346c.s();
                                    abstractC1346c.t();
                                } else {
                                    bVar4 = AbstractC1313d.e(abstractC1346c, c1038i);
                                }
                                bVar3 = bVar5;
                            } else {
                                str3 = abstractC1346c.n();
                            }
                        }
                        V1.b bVar6 = bVar3;
                        abstractC1346c.e();
                        if (str3.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                c1038i.u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    V1.b bVar7 = bVar3;
                    abstractC1346c.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((V1.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    continue;
                default:
                    abstractC1346c.s();
                    abstractC1346c.t();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (dVar == null) {
            dVar = new V1.d(Collections.singletonList(new C1718a(100)));
        }
        return new W1.f(str4, gVar, cVar2, dVar, fVar, fVar2, bVar, bVar2, cVar3, f10, arrayList, bVar3, z10);
    }
}
