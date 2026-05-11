package o8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class x implements A8.b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f38035b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f38034a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f38034a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f38034a.iterator();
            while (it.hasNext()) {
                this.f38035b.add(((A8.b) it.next()).get());
            }
            this.f38034a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(A8.b bVar) {
        try {
            if (this.f38035b == null) {
                this.f38034a.add(bVar);
            } else {
                this.f38035b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // A8.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f38035b == null) {
            synchronized (this) {
                try {
                    if (this.f38035b == null) {
                        this.f38035b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f38035b);
    }
}
