package R5;

import D5.AbstractC0776b;
import K5.AbstractC0928i;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import v5.InterfaceC4942i;
import v5.p;

/* loaded from: classes2.dex */
public abstract class H extends D5.o implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f8472b = new Object();

    /* renamed from: a, reason: collision with root package name */
    protected final Class f8473a;

    protected H(Class cls) {
        this.f8473a = cls;
    }

    protected static final boolean j(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    protected static final boolean k(Collection collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    @Override // D5.o
    public Class c() {
        return this.f8473a;
    }

    @Override // D5.o
    public abstract void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10);

    protected D5.o l(D5.B b10, D5.d dVar) {
        Object f10;
        if (dVar == null) {
            return null;
        }
        AbstractC0928i a10 = dVar.a();
        AbstractC0776b J10 = b10.J();
        if (a10 == null || (f10 = J10.f(a10)) == null) {
            return null;
        }
        return b10.g0(a10, f10);
    }

    protected D5.o m(D5.B b10, D5.d dVar, D5.o oVar) {
        Object obj = f8472b;
        Map map = (Map) b10.K(obj);
        if (map == null) {
            map = new IdentityHashMap();
            b10.h0(obj, map);
        } else if (map.get(dVar) != null) {
            return oVar;
        }
        map.put(dVar, Boolean.TRUE);
        try {
            D5.o n10 = n(b10, dVar, oVar);
            return n10 != null ? b10.V(n10, dVar) : oVar;
        } finally {
            map.remove(dVar);
        }
    }

    protected D5.o n(D5.B b10, D5.d dVar, D5.o oVar) {
        AbstractC0928i a10;
        Object J10;
        AbstractC0776b J11 = b10.J();
        if (!j(J11, dVar) || (a10 = dVar.a()) == null || (J10 = J11.J(a10)) == null) {
            return oVar;
        }
        b10.e(dVar.a(), J10);
        b10.g();
        throw null;
    }

    protected Boolean o(D5.B b10, D5.d dVar, Class cls, InterfaceC4942i.a aVar) {
        InterfaceC4942i.d p10 = p(b10, dVar, cls);
        if (p10 != null) {
            return p10.e(aVar);
        }
        return null;
    }

    protected InterfaceC4942i.d p(D5.B b10, D5.d dVar, Class cls) {
        return dVar != null ? dVar.b(b10.f(), cls) : b10.N(cls);
    }

    protected p.b q(D5.B b10, D5.d dVar, Class cls) {
        return dVar != null ? dVar.c(b10.f(), cls) : b10.O(cls);
    }

    protected P5.m r(D5.B b10, Object obj, Object obj2) {
        b10.P();
        android.support.v4.media.session.b.a(b10.j(c(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured"));
        return null;
    }

    protected boolean s(D5.o oVar) {
        return T5.f.J(oVar);
    }

    public void t(D5.B b10, Throwable th, Object obj, int i10) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        T5.f.U(th);
        boolean z10 = b10 == null || b10.Z(D5.A.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z10 || !(th instanceof com.fasterxml.jackson.core.c)) {
                throw ((IOException) th);
            }
        } else if (!z10) {
            T5.f.W(th);
        }
        throw D5.l.o(th, obj, i10);
    }

    public void u(D5.B b10, Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        T5.f.U(th);
        boolean z10 = b10 == null || b10.Z(D5.A.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z10 || !(th instanceof com.fasterxml.jackson.core.c)) {
                throw ((IOException) th);
            }
        } else if (!z10) {
            T5.f.W(th);
        }
        throw D5.l.p(th, obj, str);
    }

    protected H(D5.j jVar) {
        this.f8473a = jVar.q();
    }

    protected H(Class cls, boolean z10) {
        this.f8473a = cls;
    }

    protected H(H h10) {
        this.f8473a = h10.f8473a;
    }
}
