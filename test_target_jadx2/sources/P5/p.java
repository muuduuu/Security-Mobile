package P5;

import D5.B;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f7516a = new HashMap(64);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f7517b = new AtomicReference();

    private final synchronized Q5.l a() {
        Q5.l lVar;
        lVar = (Q5.l) this.f7517b.get();
        if (lVar == null) {
            lVar = Q5.l.b(this.f7516a);
            this.f7517b.set(lVar);
        }
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(D5.j jVar, D5.o oVar, B b10) {
        synchronized (this) {
            try {
                if (this.f7516a.put(new T5.r(jVar, false), oVar) == null) {
                    this.f7517b.set(null);
                }
                if (oVar instanceof o) {
                    ((o) oVar).b(b10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Class cls, D5.j jVar, D5.o oVar, B b10) {
        synchronized (this) {
            try {
                Object put = this.f7516a.put(new T5.r(cls, false), oVar);
                Object put2 = this.f7516a.put(new T5.r(jVar, false), oVar);
                if (put == null || put2 == null) {
                    this.f7517b.set(null);
                }
                if (oVar instanceof o) {
                    ((o) oVar).b(b10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Class cls, D5.o oVar) {
        synchronized (this) {
            try {
                if (this.f7516a.put(new T5.r(cls, true), oVar) == null) {
                    this.f7517b.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Q5.l e() {
        Q5.l lVar = (Q5.l) this.f7517b.get();
        return lVar != null ? lVar : a();
    }

    public D5.o f(Class cls) {
        D5.o oVar;
        synchronized (this) {
            oVar = (D5.o) this.f7516a.get(new T5.r(cls, true));
        }
        return oVar;
    }

    public D5.o g(D5.j jVar) {
        D5.o oVar;
        synchronized (this) {
            oVar = (D5.o) this.f7516a.get(new T5.r(jVar, false));
        }
        return oVar;
    }

    public D5.o h(Class cls) {
        D5.o oVar;
        synchronized (this) {
            oVar = (D5.o) this.f7516a.get(new T5.r(cls, false));
        }
        return oVar;
    }
}
