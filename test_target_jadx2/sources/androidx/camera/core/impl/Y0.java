package androidx.camera.core.impl;

import androidx.camera.core.impl.E0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class Y0 implements E0 {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f14512b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f14511a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private int f14513c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14514d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Map f14515e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet f14516f = new CopyOnWriteArraySet();

    static abstract class a {
        a() {
        }

        static a b(Throwable th) {
            return new C1442j(th);
        }

        public abstract Throwable a();
    }

    private static final class b implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        private static final Object f14517h = new Object();

        /* renamed from: a, reason: collision with root package name */
        private final Executor f14518a;

        /* renamed from: b, reason: collision with root package name */
        private final E0.a f14519b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReference f14521d;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f14520c = new AtomicBoolean(true);

        /* renamed from: e, reason: collision with root package name */
        private Object f14522e = f14517h;

        /* renamed from: f, reason: collision with root package name */
        private int f14523f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f14524g = false;

        b(AtomicReference atomicReference, Executor executor, E0.a aVar) {
            this.f14521d = atomicReference;
            this.f14518a = executor;
            this.f14519b = aVar;
        }

        void a() {
            this.f14520c.set(false);
        }

        void b(int i10) {
            synchronized (this) {
                try {
                    if (!this.f14520c.get()) {
                        return;
                    }
                    if (i10 <= this.f14523f) {
                        return;
                    }
                    this.f14523f = i10;
                    if (this.f14524g) {
                        return;
                    }
                    this.f14524g = true;
                    try {
                        this.f14518a.execute(this);
                    } finally {
                        synchronized (this) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f14520c.get()) {
                        this.f14524g = false;
                        return;
                    }
                    Object obj = this.f14521d.get();
                    int i10 = this.f14523f;
                    while (true) {
                        if (!Objects.equals(this.f14522e, obj)) {
                            this.f14522e = obj;
                            if (obj instanceof a) {
                                this.f14519b.onError(((a) obj).a());
                            } else {
                                this.f14519b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f14523f || !this.f14520c.get()) {
                                    break;
                                }
                                obj = this.f14521d.get();
                                i10 = this.f14523f;
                            } finally {
                            }
                        }
                    }
                    this.f14524g = false;
                } finally {
                }
            }
        }
    }

    Y0(Object obj, boolean z10) {
        if (!z10) {
            this.f14512b = new AtomicReference(obj);
        } else {
            y0.f.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f14512b = new AtomicReference(a.b((Throwable) obj));
        }
    }

    private void d(E0.a aVar) {
        b bVar = (b) this.f14515e.remove(aVar);
        if (bVar != null) {
            bVar.a();
            this.f14516f.remove(bVar);
        }
    }

    private void i(Object obj) {
        Iterator it;
        int i10;
        synchronized (this.f14511a) {
            try {
                if (Objects.equals(this.f14512b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f14513c + 1;
                this.f14513c = i11;
                if (this.f14514d) {
                    return;
                }
                this.f14514d = true;
                Iterator it2 = this.f14516f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((b) it2.next()).b(i11);
                    } else {
                        synchronized (this.f14511a) {
                            try {
                                if (this.f14513c == i11) {
                                    this.f14514d = false;
                                    return;
                                } else {
                                    it = this.f14516f.iterator();
                                    i10 = this.f14513c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i11 = i10;
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.E0
    public void a(E0.a aVar) {
        synchronized (this.f14511a) {
            d(aVar);
        }
    }

    @Override // androidx.camera.core.impl.E0
    public h8.d c() {
        Object obj = this.f14512b.get();
        return obj instanceof a ? G.n.n(((a) obj).a()) : G.n.p(obj);
    }

    @Override // androidx.camera.core.impl.E0
    public void e(Executor executor, E0.a aVar) {
        b bVar;
        synchronized (this.f14511a) {
            d(aVar);
            bVar = new b(this.f14512b, executor, aVar);
            this.f14515e.put(aVar, bVar);
            this.f14516f.add(bVar);
        }
        bVar.b(0);
    }

    public void f() {
        synchronized (this.f14511a) {
            try {
                Iterator it = new HashSet(this.f14515e.keySet()).iterator();
                while (it.hasNext()) {
                    d((E0.a) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void g(Object obj) {
        i(obj);
    }

    void h(Throwable th) {
        i(a.b(th));
    }
}
