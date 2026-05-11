package x2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set f44770a = Collections.newSetFromMap(new WeakHashMap());

    @Override // x2.l
    public void a() {
        Iterator it = D2.l.k(this.f44770a).iterator();
        while (it.hasNext()) {
            ((A2.d) it.next()).a();
        }
    }

    @Override // x2.l
    public void b() {
        Iterator it = D2.l.k(this.f44770a).iterator();
        while (it.hasNext()) {
            ((A2.d) it.next()).b();
        }
    }

    @Override // x2.l
    public void c() {
        Iterator it = D2.l.k(this.f44770a).iterator();
        while (it.hasNext()) {
            ((A2.d) it.next()).c();
        }
    }

    public void e() {
        this.f44770a.clear();
    }

    public List f() {
        return D2.l.k(this.f44770a);
    }

    public void g(A2.d dVar) {
        this.f44770a.add(dVar);
    }

    public void o(A2.d dVar) {
        this.f44770a.remove(dVar);
    }
}
