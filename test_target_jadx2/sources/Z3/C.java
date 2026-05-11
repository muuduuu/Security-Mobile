package Z3;

import c3.AbstractC1721a;
import f3.AbstractC3142a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class C {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f12365b = C.class;

    /* renamed from: a, reason: collision with root package name */
    private Map f12366a = new HashMap();

    private C() {
    }

    public static C d() {
        return new C();
    }

    private synchronized void e() {
        AbstractC1721a.z(f12365b, "Count = %d", Integer.valueOf(this.f12366a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f12366a.values());
            this.f12366a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g4.i iVar = (g4.i) arrayList.get(i10);
            if (iVar != null) {
                iVar.close();
            }
        }
    }

    public synchronized boolean b(V2.d dVar) {
        b3.l.g(dVar);
        if (!this.f12366a.containsKey(dVar)) {
            return false;
        }
        g4.i iVar = (g4.i) this.f12366a.get(dVar);
        synchronized (iVar) {
            if (g4.i.y(iVar)) {
                return true;
            }
            this.f12366a.remove(dVar);
            AbstractC1721a.H(f12365b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(iVar)), dVar.c(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    public synchronized g4.i c(V2.d dVar) {
        b3.l.g(dVar);
        g4.i iVar = (g4.i) this.f12366a.get(dVar);
        if (iVar != null) {
            synchronized (iVar) {
                if (!g4.i.y(iVar)) {
                    this.f12366a.remove(dVar);
                    AbstractC1721a.H(f12365b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(iVar)), dVar.c(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                iVar = g4.i.b(iVar);
            }
        }
        return iVar;
    }

    public synchronized void f(V2.d dVar, g4.i iVar) {
        b3.l.g(dVar);
        b3.l.b(Boolean.valueOf(g4.i.y(iVar)));
        g4.i.c((g4.i) this.f12366a.put(dVar, g4.i.b(iVar)));
        e();
    }

    public boolean g(V2.d dVar) {
        g4.i iVar;
        b3.l.g(dVar);
        synchronized (this) {
            iVar = (g4.i) this.f12366a.remove(dVar);
        }
        if (iVar == null) {
            return false;
        }
        try {
            return iVar.x();
        } finally {
            iVar.close();
        }
    }

    public synchronized boolean h(V2.d dVar, g4.i iVar) {
        b3.l.g(dVar);
        b3.l.g(iVar);
        b3.l.b(Boolean.valueOf(g4.i.y(iVar)));
        g4.i iVar2 = (g4.i) this.f12366a.get(dVar);
        if (iVar2 == null) {
            return false;
        }
        AbstractC3142a e10 = iVar2.e();
        AbstractC3142a e11 = iVar.e();
        if (e10 != null && e11 != null) {
            try {
                if (e10.p() == e11.p()) {
                    this.f12366a.remove(dVar);
                    AbstractC3142a.n(e11);
                    AbstractC3142a.n(e10);
                    g4.i.c(iVar2);
                    e();
                    return true;
                }
            } finally {
                AbstractC3142a.n(e11);
                AbstractC3142a.n(e10);
                g4.i.c(iVar2);
            }
        }
        return false;
    }
}
