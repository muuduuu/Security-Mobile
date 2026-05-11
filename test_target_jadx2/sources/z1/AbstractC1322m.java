package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import java.util.ArrayList;

/* renamed from: Z1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1322m {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12323a = AbstractC1346c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12324b = AbstractC1346c.a.a("shapes");

    static U1.d a(AbstractC1346c abstractC1346c, C1038i c1038i) {
        ArrayList arrayList = new ArrayList();
        abstractC1346c.c();
        double d10 = 0.0d;
        String str = null;
        String str2 = null;
        char c10 = 0;
        double d11 = 0.0d;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12323a);
            if (r10 == 0) {
                c10 = abstractC1346c.n().charAt(0);
            } else if (r10 == 1) {
                d11 = abstractC1346c.i();
            } else if (r10 == 2) {
                d10 = abstractC1346c.i();
            } else if (r10 == 3) {
                str = abstractC1346c.n();
            } else if (r10 == 4) {
                str2 = abstractC1346c.n();
            } else if (r10 != 5) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                abstractC1346c.c();
                while (abstractC1346c.f()) {
                    if (abstractC1346c.r(f12324b) != 0) {
                        abstractC1346c.s();
                        abstractC1346c.t();
                    } else {
                        abstractC1346c.b();
                        while (abstractC1346c.f()) {
                            arrayList.add((W1.q) AbstractC1317h.a(abstractC1346c, c1038i));
                        }
                        abstractC1346c.d();
                    }
                }
                abstractC1346c.e();
            }
        }
        abstractC1346c.e();
        return new U1.d(arrayList, c10, d11, d10, str, str2);
    }
}
