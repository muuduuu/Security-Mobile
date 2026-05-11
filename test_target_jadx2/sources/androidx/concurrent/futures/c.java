package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Object f14951a;

        /* renamed from: b, reason: collision with root package name */
        d f14952b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f14953c = androidx.concurrent.futures.d.B();

        /* renamed from: d, reason: collision with root package name */
        private boolean f14954d;

        a() {
        }

        private void e() {
            this.f14951a = null;
            this.f14952b = null;
            this.f14953c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d dVar = this.f14953c;
            if (dVar != null) {
                dVar.e(runnable, executor);
            }
        }

        void b() {
            this.f14951a = null;
            this.f14952b = null;
            this.f14953c.x(null);
        }

        public boolean c(Object obj) {
            this.f14954d = true;
            d dVar = this.f14952b;
            boolean z10 = dVar != null && dVar.b(obj);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f14954d = true;
            d dVar = this.f14952b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th) {
            this.f14954d = true;
            d dVar = this.f14952b;
            boolean z10 = dVar != null && dVar.c(th);
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f14952b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f14951a));
            }
            if (this.f14954d || (dVar = this.f14953c) == null) {
                return;
            }
            dVar.x(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0253c {
        Object a(a aVar);
    }

    private static final class d implements h8.d {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference f14955a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f14956b = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String u() {
                a aVar = (a) d.this.f14955a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f14951a + "]";
            }
        }

        d(a aVar) {
            this.f14955a = new WeakReference(aVar);
        }

        boolean a(boolean z10) {
            return this.f14956b.cancel(z10);
        }

        boolean b(Object obj) {
            return this.f14956b.x(obj);
        }

        boolean c(Throwable th) {
            return this.f14956b.y(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f14955a.get();
            boolean cancel = this.f14956b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // h8.d
        public void e(Runnable runnable, Executor executor) {
            this.f14956b.e(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f14956b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f14956b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f14956b.isDone();
        }

        public String toString() {
            return this.f14956b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f14956b.get(j10, timeUnit);
        }
    }

    public static h8.d a(InterfaceC0253c interfaceC0253c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f14952b = dVar;
        aVar.f14951a = interfaceC0253c.getClass();
        try {
            Object a10 = interfaceC0253c.a(aVar);
            if (a10 != null) {
                aVar.f14951a = a10;
            }
        } catch (Exception e10) {
            dVar.c(e10);
        }
        return dVar;
    }
}
