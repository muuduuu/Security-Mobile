package o8;

import java.util.Set;

/* renamed from: o8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3767d {
    default Object a(Class cls) {
        return g(C3762D.b(cls));
    }

    default Set b(C3762D c3762d) {
        return (Set) f(c3762d).get();
    }

    A8.b c(C3762D c3762d);

    default A8.b d(Class cls) {
        return c(C3762D.b(cls));
    }

    default Set e(Class cls) {
        return b(C3762D.b(cls));
    }

    A8.b f(C3762D c3762d);

    default Object g(C3762D c3762d) {
        A8.b c10 = c(c3762d);
        if (c10 == null) {
            return null;
        }
        return c10.get();
    }
}
