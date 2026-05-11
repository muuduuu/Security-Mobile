package Z1;

import O1.C1038i;
import W1.s;
import a2.AbstractC1346c;
import c2.C1718a;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class L {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12294a = AbstractC1346c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12295b = AbstractC1346c.a.a("n", "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static W1.s a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        char c10;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        boolean z10 = false;
        String str = null;
        V1.b bVar = null;
        V1.a aVar = null;
        V1.b bVar2 = null;
        V1.d dVar = null;
        s.b bVar3 = null;
        s.c cVar = null;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12294a)) {
                case 0:
                    str = abstractC1346c.n();
                    break;
                case 1:
                    aVar = AbstractC1313d.c(abstractC1346c, c1038i);
                    break;
                case 2:
                    bVar2 = AbstractC1313d.e(abstractC1346c, c1038i);
                    break;
                case 3:
                    dVar = AbstractC1313d.h(abstractC1346c, c1038i);
                    break;
                case 4:
                    bVar3 = s.b.values()[abstractC1346c.j() - 1];
                    break;
                case 5:
                    cVar = s.c.values()[abstractC1346c.j() - 1];
                    break;
                case 6:
                    f10 = (float) abstractC1346c.i();
                    break;
                case 7:
                    z10 = abstractC1346c.g();
                    break;
                case 8:
                    abstractC1346c.b();
                    while (abstractC1346c.f()) {
                        abstractC1346c.c();
                        String str2 = null;
                        V1.b bVar4 = null;
                        while (abstractC1346c.f()) {
                            int r10 = abstractC1346c.r(f12295b);
                            if (r10 == 0) {
                                str2 = abstractC1346c.n();
                            } else if (r10 != 1) {
                                abstractC1346c.s();
                                abstractC1346c.t();
                            } else {
                                bVar4 = AbstractC1313d.e(abstractC1346c, c1038i);
                            }
                        }
                        abstractC1346c.e();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                c1038i.u(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar = bVar4;
                                break;
                        }
                    }
                    abstractC1346c.d();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((V1.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    abstractC1346c.t();
                    break;
            }
        }
        return new W1.s(str, bVar, arrayList, aVar, dVar == null ? new V1.d(Collections.singletonList(new C1718a(100))) : dVar, bVar2, bVar3 == null ? s.b.BUTT : bVar3, cVar == null ? s.c.MITER : cVar, f10, z10);
    }
}
