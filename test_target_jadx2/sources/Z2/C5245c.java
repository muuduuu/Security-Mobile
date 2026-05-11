package z2;

import D2.j;
import j0.C3476a;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import k2.i;
import k2.t;
import w2.C5034g;

/* renamed from: z2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5245c {

    /* renamed from: c, reason: collision with root package name */
    private static final t f45682c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new C5034g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final C3476a f45683a = new C3476a();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f45684b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f45684b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j b10 = b(cls, cls2, cls3);
        synchronized (this.f45683a) {
            tVar = (t) this.f45683a.get(b10);
        }
        this.f45684b.set(b10);
        return tVar;
    }

    public boolean c(t tVar) {
        return f45682c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f45683a) {
            C3476a c3476a = this.f45683a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f45682c;
            }
            c3476a.put(jVar, tVar);
        }
    }
}
