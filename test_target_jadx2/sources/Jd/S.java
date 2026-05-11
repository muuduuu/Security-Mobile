package Jd;

import Od.C1080h;
import lc.o;

/* loaded from: classes3.dex */
public abstract class S {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(kotlin.coroutines.d dVar) {
        Object b10;
        if (dVar instanceof C1080h) {
            return ((C1080h) dVar).toString();
        }
        try {
            o.a aVar = lc.o.f37128b;
            b10 = lc.o.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (lc.o.d(b10) != null) {
            b10 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b10;
    }
}
