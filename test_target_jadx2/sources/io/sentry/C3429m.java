package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3429m implements r2 {

    /* renamed from: d, reason: collision with root package name */
    private final List f35206d;

    /* renamed from: e, reason: collision with root package name */
    private final P1 f35207e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f35203a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile Timer f35204b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Map f35205c = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f35208f = new AtomicBoolean(false);

    /* renamed from: io.sentry.m$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = C3429m.this.f35206d.iterator();
            while (it.hasNext()) {
                ((I) it.next()).b();
            }
        }
    }

    /* renamed from: io.sentry.m$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            F0 f02 = new F0();
            Iterator it = C3429m.this.f35206d.iterator();
            while (it.hasNext()) {
                ((I) it.next()).a(f02);
            }
            Iterator it2 = C3429m.this.f35205c.values().iterator();
            while (it2.hasNext()) {
                ((List) it2.next()).add(f02);
            }
        }
    }

    public C3429m(P1 p12) {
        this.f35207e = (P1) io.sentry.util.n.c(p12, "The options object is required.");
        this.f35206d = p12.getCollectors();
    }

    @Override // io.sentry.r2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List f(T t10) {
        List list = (List) this.f35205c.remove(t10.l().toString());
        this.f35207e.getLogger().c(K1.DEBUG, "stop collecting performance info for transactions %s (%s)", t10.getName(), t10.n().k().toString());
        if (this.f35205c.isEmpty() && this.f35208f.getAndSet(false)) {
            synchronized (this.f35203a) {
                try {
                    if (this.f35204b != null) {
                        this.f35204b.cancel();
                        this.f35204b = null;
                    }
                } finally {
                }
            }
        }
        return list;
    }

    @Override // io.sentry.r2
    public void b(final T t10) {
        if (this.f35206d.isEmpty()) {
            this.f35207e.getLogger().c(K1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f35205c.containsKey(t10.l().toString())) {
            this.f35205c.put(t10.l().toString(), new ArrayList());
            try {
                this.f35207e.getExecutorService().b(new Runnable() { // from class: io.sentry.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3429m.this.f(t10);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e10) {
                this.f35207e.getLogger().b(K1.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e10);
            }
        }
        if (this.f35208f.getAndSet(true)) {
            return;
        }
        synchronized (this.f35203a) {
            try {
                if (this.f35204b == null) {
                    this.f35204b = new Timer(true);
                }
                this.f35204b.schedule(new a(), 0L);
                this.f35204b.scheduleAtFixedRate(new b(), 100L, 100L);
            } finally {
            }
        }
    }

    @Override // io.sentry.r2
    public void close() {
        this.f35205c.clear();
        this.f35207e.getLogger().c(K1.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        if (this.f35208f.getAndSet(false)) {
            synchronized (this.f35203a) {
                try {
                    if (this.f35204b != null) {
                        this.f35204b.cancel();
                        this.f35204b = null;
                    }
                } finally {
                }
            }
        }
    }
}
