package Jd;

import lc.o;

/* loaded from: classes3.dex */
public abstract class D {
    public static final Object a(Object obj, kotlin.coroutines.d dVar) {
        if (!(obj instanceof B)) {
            return lc.o.b(obj);
        }
        o.a aVar = lc.o.f37128b;
        return lc.o.b(lc.p.a(((B) obj).f4974a));
    }

    public static final Object b(Object obj) {
        Throwable d10 = lc.o.d(obj);
        return d10 == null ? obj : new B(d10, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC0895m interfaceC0895m) {
        Throwable d10 = lc.o.d(obj);
        return d10 == null ? obj : new B(d10, false, 2, null);
    }
}
