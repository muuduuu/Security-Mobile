package Z1;

import a2.AbstractC1346c;

/* renamed from: Z1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1323n {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12325a = AbstractC1346c.a.a("fFamily", "fName", "fStyle", "ascent");

    static U1.c a(AbstractC1346c abstractC1346c) {
        abstractC1346c.c();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (abstractC1346c.f()) {
            int r10 = abstractC1346c.r(f12325a);
            if (r10 == 0) {
                str = abstractC1346c.n();
            } else if (r10 == 1) {
                str3 = abstractC1346c.n();
            } else if (r10 == 2) {
                str2 = abstractC1346c.n();
            } else if (r10 != 3) {
                abstractC1346c.s();
                abstractC1346c.t();
            } else {
                f10 = (float) abstractC1346c.i();
            }
        }
        abstractC1346c.e();
        return new U1.c(str, str3, str2, f10);
    }
}
