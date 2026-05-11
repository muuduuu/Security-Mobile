package Z1;

import O1.C1038i;
import a2.AbstractC1346c;
import java.util.List;

/* renamed from: Z1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1313d {
    private static List a(AbstractC1346c abstractC1346c, float f10, C1038i c1038i, N n10) {
        return u.a(abstractC1346c, c1038i, f10, n10, false);
    }

    private static List b(AbstractC1346c abstractC1346c, C1038i c1038i, N n10) {
        return u.a(abstractC1346c, c1038i, 1.0f, n10, false);
    }

    static V1.a c(AbstractC1346c abstractC1346c, C1038i c1038i) {
        return new V1.a(b(abstractC1346c, c1038i, C1316g.f12306a));
    }

    static V1.j d(AbstractC1346c abstractC1346c, C1038i c1038i) {
        return new V1.j(a(abstractC1346c, b2.l.e(), c1038i, C1318i.f12308a));
    }

    public static V1.b e(AbstractC1346c abstractC1346c, C1038i c1038i) {
        return f(abstractC1346c, c1038i, true);
    }

    public static V1.b f(AbstractC1346c abstractC1346c, C1038i c1038i, boolean z10) {
        return new V1.b(a(abstractC1346c, z10 ? b2.l.e() : 1.0f, c1038i, C1321l.f12322a));
    }

    static V1.c g(AbstractC1346c abstractC1346c, C1038i c1038i, int i10) {
        return new V1.c(b(abstractC1346c, c1038i, new o(i10)));
    }

    static V1.d h(AbstractC1346c abstractC1346c, C1038i c1038i) {
        return new V1.d(b(abstractC1346c, c1038i, r.f12332a));
    }

    static V1.f i(AbstractC1346c abstractC1346c, C1038i c1038i) {
        return new V1.f(u.a(abstractC1346c, c1038i, b2.l.e(), B.f12283a, true));
    }

    static V1.g j(AbstractC1346c abstractC1346c, C1038i c1038i) {
        return new V1.g(b(abstractC1346c, c1038i, G.f12288a));
    }

    static V1.h k(AbstractC1346c abstractC1346c, C1038i c1038i) {
        return new V1.h(a(abstractC1346c, b2.l.e(), c1038i, H.f12289a));
    }
}
