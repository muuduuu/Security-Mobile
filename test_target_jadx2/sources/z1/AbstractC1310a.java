package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import c2.C1718a;
import java.util.ArrayList;

/* renamed from: Z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1310a {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12297a = AbstractC1346c.a.a("k", "x", "y");

    public static V1.e a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        ArrayList arrayList = new ArrayList();
        if (abstractC1346c.p() == AbstractC1346c.b.BEGIN_ARRAY) {
            abstractC1346c.b();
            while (abstractC1346c.f()) {
                arrayList.add(z.a(abstractC1346c, c1038i));
            }
            abstractC1346c.d();
            u.b(arrayList);
        } else {
            arrayList.add(new C1718a(s.e(abstractC1346c, b2.l.e())));
        }
        return new V1.e(arrayList);
    }

    static V1.o b(AbstractC1346c abstractC1346c, C1038i c1038i) {
        abstractC1346c.c();
        V1.e eVar = null;
        V1.b bVar = null;
        boolean z10 = false;
        V1.b bVar2 = null;
        while (abstractC1346c.p() != AbstractC1346c.b.END_OBJECT) {
            int r10 = abstractC1346c.r(f12297a);
            if (r10 == 0) {
                eVar = a(abstractC1346c, c1038i);
            } else if (r10 != 1) {
                if (r10 != 2) {
                    abstractC1346c.s();
                    abstractC1346c.t();
                } else if (abstractC1346c.p() == AbstractC1346c.b.STRING) {
                    abstractC1346c.t();
                    z10 = true;
                } else {
                    bVar = AbstractC1313d.e(abstractC1346c, c1038i);
                }
            } else if (abstractC1346c.p() == AbstractC1346c.b.STRING) {
                abstractC1346c.t();
                z10 = true;
            } else {
                bVar2 = AbstractC1313d.e(abstractC1346c, c1038i);
            }
        }
        abstractC1346c.e();
        if (z10) {
            c1038i.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new V1.i(bVar2, bVar);
    }
}
