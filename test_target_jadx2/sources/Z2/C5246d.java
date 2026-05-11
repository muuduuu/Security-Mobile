package z2;

import D2.j;
import j0.C3476a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5246d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f45685a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final C3476a f45686b = new C3476a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f45685a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f45686b) {
            list = (List) this.f45686b.get(jVar);
        }
        this.f45685a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f45686b) {
            this.f45686b.put(new j(cls, cls2, cls3), list);
        }
    }
}
