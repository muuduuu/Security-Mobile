package o8;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import x8.C5133a;
import x8.InterfaceC5134b;
import x8.InterfaceC5135c;
import x8.InterfaceC5136d;

/* loaded from: classes2.dex */
class u implements InterfaceC5136d, InterfaceC5135c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f38028a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f38029b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f38030c;

    u(Executor executor) {
        this.f38030c = executor;
    }

    private synchronized Set g(C5133a c5133a) {
        Map map;
        try {
            map = (Map) this.f38028a.get(c5133a.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map.Entry entry, C5133a c5133a) {
        ((InterfaceC5134b) entry.getKey()).a(c5133a);
    }

    @Override // x8.InterfaceC5136d
    public synchronized void a(Class cls, InterfaceC5134b interfaceC5134b) {
        AbstractC3761C.b(cls);
        AbstractC3761C.b(interfaceC5134b);
        if (this.f38028a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f38028a.get(cls);
            concurrentHashMap.remove(interfaceC5134b);
            if (concurrentHashMap.isEmpty()) {
                this.f38028a.remove(cls);
            }
        }
    }

    @Override // x8.InterfaceC5136d
    public void b(Class cls, InterfaceC5134b interfaceC5134b) {
        c(cls, this.f38030c, interfaceC5134b);
    }

    @Override // x8.InterfaceC5136d
    public synchronized void c(Class cls, Executor executor, InterfaceC5134b interfaceC5134b) {
        try {
            AbstractC3761C.b(cls);
            AbstractC3761C.b(interfaceC5134b);
            AbstractC3761C.b(executor);
            if (!this.f38028a.containsKey(cls)) {
                this.f38028a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f38028a.get(cls)).put(interfaceC5134b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // x8.InterfaceC5135c
    public void d(final C5133a c5133a) {
        AbstractC3761C.b(c5133a);
        synchronized (this) {
            try {
                Queue queue = this.f38029b;
                if (queue != null) {
                    queue.add(c5133a);
                    return;
                }
                for (final Map.Entry entry : g(c5133a)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: o8.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            u.h(entry, c5133a);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f38029b;
                if (queue != null) {
                    this.f38029b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                d((C5133a) it.next());
            }
        }
    }
}
