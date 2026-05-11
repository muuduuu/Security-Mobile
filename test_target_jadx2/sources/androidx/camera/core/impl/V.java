package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface V {

    public static abstract class a {
        a() {
        }

        public static a a(String str, Class cls) {
            return b(str, cls, null);
        }

        public static a b(String str, Class cls, Object obj) {
            return new C1430d(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class e();
    }

    public interface b {
        boolean a(a aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static V H(V v10, V v11) {
        if (v10 == null && v11 == null) {
            return G0.a0();
        }
        B0 e02 = v11 != null ? B0.e0(v11) : B0.d0();
        if (v10 != null) {
            Iterator it = v10.e().iterator();
            while (it.hasNext()) {
                X(e02, v11, v10, (a) it.next());
            }
        }
        return G0.b0(e02);
    }

    static boolean L(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    static void X(B0 b02, V v10, V v11, a aVar) {
        if (!Objects.equals(aVar, InterfaceC1457q0.f14683v)) {
            b02.r(aVar, v11.g(aVar), v11.a(aVar));
            return;
        }
        P.c cVar = (P.c) v11.f(aVar, null);
        b02.r(aVar, v11.g(aVar), E.o.a((P.c) v10.f(aVar, null), cVar));
    }

    Object a(a aVar);

    boolean b(a aVar);

    void c(String str, b bVar);

    Object d(a aVar, c cVar);

    Set e();

    Object f(a aVar, Object obj);

    c g(a aVar);

    Set h(a aVar);
}
