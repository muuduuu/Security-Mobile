package U;

import A.L0;
import H.f;
import androidx.camera.core.impl.T0;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1598o;
import androidx.lifecycle.InterfaceC1599p;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10252a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f10253b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f10254c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f10255d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    B.a f10256e;

    static abstract class a {
        a() {
        }

        static a a(InterfaceC1599p interfaceC1599p, f.b bVar) {
            return new U.a(interfaceC1599p, bVar);
        }

        public abstract f.b b();

        public abstract InterfaceC1599p c();
    }

    private static class b implements InterfaceC1598o {

        /* renamed from: a, reason: collision with root package name */
        private final c f10257a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1599p f10258b;

        b(InterfaceC1599p interfaceC1599p, c cVar) {
            this.f10258b = interfaceC1599p;
            this.f10257a = cVar;
        }

        InterfaceC1599p a() {
            return this.f10258b;
        }

        @A(AbstractC1592i.a.ON_DESTROY)
        public void onDestroy(InterfaceC1599p interfaceC1599p) {
            this.f10257a.m(interfaceC1599p);
        }

        @A(AbstractC1592i.a.ON_START)
        public void onStart(InterfaceC1599p interfaceC1599p) {
            this.f10257a.h(interfaceC1599p);
        }

        @A(AbstractC1592i.a.ON_STOP)
        public void onStop(InterfaceC1599p interfaceC1599p) {
            this.f10257a.i(interfaceC1599p);
        }
    }

    c() {
    }

    private b d(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10252a) {
            try {
                for (b bVar : this.f10254c.keySet()) {
                    if (interfaceC1599p.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean f(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10252a) {
            try {
                b d10 = d(interfaceC1599p);
                if (d10 == null) {
                    return false;
                }
                Iterator it = ((Set) this.f10254c.get(d10)).iterator();
                while (it.hasNext()) {
                    if (!((U.b) y0.f.g((U.b) this.f10253b.get((a) it.next()))).s().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g(U.b bVar) {
        synchronized (this.f10252a) {
            try {
                InterfaceC1599p k10 = bVar.k();
                a a10 = a.a(k10, H.f.B((T0) bVar.c(), (T0) bVar.r()));
                b d10 = d(k10);
                Set hashSet = d10 != null ? (Set) this.f10254c.get(d10) : new HashSet();
                hashSet.add(a10);
                this.f10253b.put(a10, bVar);
                if (d10 == null) {
                    b bVar2 = new b(k10, this);
                    this.f10254c.put(bVar2, hashSet);
                    k10.getLifecycle().a(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10252a) {
            try {
                b d10 = d(interfaceC1599p);
                if (d10 == null) {
                    return;
                }
                Iterator it = ((Set) this.f10254c.get(d10)).iterator();
                while (it.hasNext()) {
                    ((U.b) y0.f.g((U.b) this.f10253b.get((a) it.next()))).u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10252a) {
            try {
                Iterator it = ((Set) this.f10254c.get(d(interfaceC1599p))).iterator();
                while (it.hasNext()) {
                    U.b bVar = (U.b) this.f10253b.get((a) it.next());
                    if (!((U.b) y0.f.g(bVar)).s().isEmpty()) {
                        bVar.x();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(U.b bVar, L0 l02, List list, Collection collection, B.a aVar) {
        synchronized (this.f10252a) {
            try {
                y0.f.a(!collection.isEmpty());
                this.f10256e = aVar;
                InterfaceC1599p k10 = bVar.k();
                b d10 = d(k10);
                if (d10 == null) {
                    return;
                }
                Set set = (Set) this.f10254c.get(d10);
                B.a aVar2 = this.f10256e;
                if (aVar2 == null || aVar2.a() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        U.b bVar2 = (U.b) y0.f.g((U.b) this.f10253b.get((a) it.next()));
                        if (!bVar2.equals(bVar) && !bVar2.s().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.j().d0(l02);
                    bVar.j().b0(list);
                    bVar.f(collection);
                    if (k10.getLifecycle().b().isAtLeast(AbstractC1592i.b.STARTED)) {
                        h(k10);
                    }
                } catch (f.a e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    U.b b(InterfaceC1599p interfaceC1599p, H.f fVar) {
        synchronized (this.f10252a) {
            try {
                y0.f.b(this.f10253b.get(a.a(interfaceC1599p, fVar.D())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                U.b bVar = new U.b(interfaceC1599p, fVar);
                if (fVar.J().isEmpty()) {
                    bVar.u();
                }
                if (interfaceC1599p.getLifecycle().b() == AbstractC1592i.b.DESTROYED) {
                    return bVar;
                }
                g(bVar);
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    U.b c(InterfaceC1599p interfaceC1599p, f.b bVar) {
        U.b bVar2;
        synchronized (this.f10252a) {
            bVar2 = (U.b) this.f10253b.get(a.a(interfaceC1599p, bVar));
        }
        return bVar2;
    }

    Collection e() {
        Collection unmodifiableCollection;
        synchronized (this.f10252a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f10253b.values());
        }
        return unmodifiableCollection;
    }

    void h(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10252a) {
            try {
                if (f(interfaceC1599p)) {
                    if (this.f10255d.isEmpty()) {
                        this.f10255d.push(interfaceC1599p);
                    } else {
                        B.a aVar = this.f10256e;
                        if (aVar == null || aVar.a() != 2) {
                            InterfaceC1599p interfaceC1599p2 = (InterfaceC1599p) this.f10255d.peek();
                            if (!interfaceC1599p.equals(interfaceC1599p2)) {
                                j(interfaceC1599p2);
                                this.f10255d.remove(interfaceC1599p);
                                this.f10255d.push(interfaceC1599p);
                            }
                        }
                    }
                    n(interfaceC1599p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void i(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10252a) {
            try {
                this.f10255d.remove(interfaceC1599p);
                j(interfaceC1599p);
                if (!this.f10255d.isEmpty()) {
                    n((InterfaceC1599p) this.f10255d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k(Collection collection) {
        synchronized (this.f10252a) {
            try {
                Iterator it = this.f10253b.keySet().iterator();
                while (it.hasNext()) {
                    U.b bVar = (U.b) this.f10253b.get((a) it.next());
                    boolean isEmpty = bVar.s().isEmpty();
                    bVar.v(collection);
                    if (!isEmpty && bVar.s().isEmpty()) {
                        i(bVar.k());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void l() {
        synchronized (this.f10252a) {
            try {
                Iterator it = this.f10253b.keySet().iterator();
                while (it.hasNext()) {
                    U.b bVar = (U.b) this.f10253b.get((a) it.next());
                    bVar.w();
                    i(bVar.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void m(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10252a) {
            try {
                b d10 = d(interfaceC1599p);
                if (d10 == null) {
                    return;
                }
                i(interfaceC1599p);
                Iterator it = ((Set) this.f10254c.get(d10)).iterator();
                while (it.hasNext()) {
                    this.f10253b.remove((a) it.next());
                }
                this.f10254c.remove(d10);
                d10.a().getLifecycle().d(d10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
