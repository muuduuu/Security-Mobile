package x2;

import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1598o;
import androidx.lifecycle.InterfaceC1599p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class k implements j, InterfaceC1598o {

    /* renamed from: a, reason: collision with root package name */
    private final Set f44739a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1592i f44740b;

    k(AbstractC1592i abstractC1592i) {
        this.f44740b = abstractC1592i;
        abstractC1592i.a(this);
    }

    @Override // x2.j
    public void a(l lVar) {
        this.f44739a.remove(lVar);
    }

    @Override // x2.j
    public void b(l lVar) {
        this.f44739a.add(lVar);
        if (this.f44740b.b() == AbstractC1592i.b.DESTROYED) {
            lVar.c();
        } else if (this.f44740b.b().isAtLeast(AbstractC1592i.b.STARTED)) {
            lVar.b();
        } else {
            lVar.a();
        }
    }

    @A(AbstractC1592i.a.ON_DESTROY)
    public void onDestroy(InterfaceC1599p interfaceC1599p) {
        Iterator it = D2.l.k(this.f44739a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).c();
        }
        interfaceC1599p.getLifecycle().d(this);
    }

    @A(AbstractC1592i.a.ON_START)
    public void onStart(InterfaceC1599p interfaceC1599p) {
        Iterator it = D2.l.k(this.f44739a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).b();
        }
    }

    @A(AbstractC1592i.a.ON_STOP)
    public void onStop(InterfaceC1599p interfaceC1599p) {
        Iterator it = D2.l.k(this.f44739a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }
}
