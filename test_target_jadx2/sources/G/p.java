package G;

import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class p implements h8.d {

    /* renamed from: a, reason: collision with root package name */
    List f2752a;

    /* renamed from: b, reason: collision with root package name */
    List f2753b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2754c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f2755d;

    /* renamed from: e, reason: collision with root package name */
    private final h8.d f2756e = androidx.concurrent.futures.c.a(new a());

    /* renamed from: f, reason: collision with root package name */
    c.a f2757f;

    class a implements c.InterfaceC0253c {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0253c
        public Object a(c.a aVar) {
            y0.f.j(p.this.f2757f == null, "The result can only set once!");
            p.this.f2757f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f2753b = null;
            pVar.f2752a = null;
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h8.d f2761b;

        c(int i10, h8.d dVar) {
            this.f2760a = i10;
            this.f2761b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f(this.f2760a, this.f2761b);
        }
    }

    p(List list, boolean z10, Executor executor) {
        this.f2752a = (List) y0.f.g(list);
        this.f2753b = new ArrayList(list.size());
        this.f2754c = z10;
        this.f2755d = new AtomicInteger(list.size());
        d(executor);
    }

    private void a() {
        List<h8.d> list = this.f2752a;
        if (list == null || isDone()) {
            return;
        }
        for (h8.d dVar : list) {
            while (!dVar.isDone()) {
                try {
                    dVar.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f2754c) {
                        return;
                    }
                }
            }
        }
    }

    private void d(Executor executor) {
        e(new b(), F.c.b());
        if (this.f2752a.isEmpty()) {
            this.f2757f.c(new ArrayList(this.f2753b));
            return;
        }
        for (int i10 = 0; i10 < this.f2752a.size(); i10++) {
            this.f2753b.add(null);
        }
        List list = this.f2752a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            h8.d dVar = (h8.d) list.get(i11);
            dVar.e(new c(i11, dVar), executor);
        }
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List get() {
        a();
        return (List) this.f2756e.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List get(long j10, TimeUnit timeUnit) {
        return (List) this.f2756e.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List list = this.f2752a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h8.d) it.next()).cancel(z10);
            }
        }
        return this.f2756e.cancel(z10);
    }

    @Override // h8.d
    public void e(Runnable runnable, Executor executor) {
        this.f2756e.e(runnable, executor);
    }

    void f(int i10, Future future) {
        c.a aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List list = this.f2753b;
        if (isDone() || list == null) {
            y0.f.j(this.f2754c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        y0.f.j(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i10, n.m(future));
                        decrementAndGet = this.f2755d.decrementAndGet();
                        y0.f.j(decrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (RuntimeException e10) {
                        if (this.f2754c) {
                            this.f2757f.f(e10);
                        }
                        int decrementAndGet2 = this.f2755d.decrementAndGet();
                        y0.f.j(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet2 != 0) {
                            return;
                        }
                        List list2 = this.f2753b;
                        if (list2 != null) {
                            aVar = this.f2757f;
                            arrayList = new ArrayList(list2);
                        }
                    }
                } catch (ExecutionException e11) {
                    if (this.f2754c) {
                        this.f2757f.f(e11.getCause());
                    }
                    int decrementAndGet3 = this.f2755d.decrementAndGet();
                    y0.f.j(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet3 != 0) {
                        return;
                    }
                    List list3 = this.f2753b;
                    if (list3 != null) {
                        aVar = this.f2757f;
                        arrayList = new ArrayList(list3);
                    }
                }
            } catch (Error e12) {
                this.f2757f.f(e12);
                int decrementAndGet4 = this.f2755d.decrementAndGet();
                y0.f.j(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet4 != 0) {
                    return;
                }
                List list4 = this.f2753b;
                if (list4 != null) {
                    aVar = this.f2757f;
                    arrayList = new ArrayList(list4);
                }
            } catch (CancellationException unused) {
                if (this.f2754c) {
                    cancel(false);
                }
                int decrementAndGet5 = this.f2755d.decrementAndGet();
                y0.f.j(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                List list5 = this.f2753b;
                if (list5 != null) {
                    aVar = this.f2757f;
                    arrayList = new ArrayList(list5);
                }
            }
            if (decrementAndGet == 0) {
                List list6 = this.f2753b;
                if (list6 != null) {
                    aVar = this.f2757f;
                    arrayList = new ArrayList(list6);
                    aVar.c(arrayList);
                    return;
                }
                y0.f.i(isDone());
            }
        } catch (Throwable th) {
            int decrementAndGet6 = this.f2755d.decrementAndGet();
            y0.f.j(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List list7 = this.f2753b;
                if (list7 != null) {
                    this.f2757f.c(new ArrayList(list7));
                } else {
                    y0.f.i(isDone());
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2756e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2756e.isDone();
    }
}
