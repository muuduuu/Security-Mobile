package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import c2.C1718a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC1346c.a f12339a = AbstractC1346c.a.a("k");

    static List a(AbstractC1346c abstractC1346c, C1038i c1038i, float f10, N n10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (abstractC1346c.p() == AbstractC1346c.b.STRING) {
            c1038i.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC1346c.c();
        while (abstractC1346c.f()) {
            if (abstractC1346c.r(f12339a) != 0) {
                abstractC1346c.t();
            } else if (abstractC1346c.p() == AbstractC1346c.b.BEGIN_ARRAY) {
                abstractC1346c.b();
                if (abstractC1346c.p() == AbstractC1346c.b.NUMBER) {
                    arrayList.add(t.c(abstractC1346c, c1038i, f10, n10, false, z10));
                } else {
                    while (abstractC1346c.f()) {
                        arrayList.add(t.c(abstractC1346c, c1038i, f10, n10, true, z10));
                    }
                }
                abstractC1346c.d();
            } else {
                arrayList.add(t.c(abstractC1346c, c1038i, f10, n10, false, z10));
            }
        }
        abstractC1346c.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i10;
        Object obj;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            C1718a c1718a = (C1718a) list.get(i11);
            i11++;
            C1718a c1718a2 = (C1718a) list.get(i11);
            c1718a.f19342h = Float.valueOf(c1718a2.f19341g);
            if (c1718a.f19337c == null && (obj = c1718a2.f19336b) != null) {
                c1718a.f19337c = obj;
                if (c1718a instanceof R1.i) {
                    ((R1.i) c1718a).j();
                }
            }
        }
        C1718a c1718a3 = (C1718a) list.get(i10);
        if ((c1718a3.f19336b == null || c1718a3.f19337c == null) && list.size() > 1) {
            list.remove(c1718a3);
        }
    }
}
