package io.sentry.transport;

import io.sentry.AbstractC3420j;
import io.sentry.C3416h1;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.L0;
import io.sentry.P1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.transport.d;
import io.sentry.util.j;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    private final v f35506a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.cache.f f35507b;

    /* renamed from: c, reason: collision with root package name */
    private final P1 f35508c;

    /* renamed from: d, reason: collision with root package name */
    private final y f35509d;

    /* renamed from: e, reason: collision with root package name */
    private final q f35510e;

    /* renamed from: f, reason: collision with root package name */
    private final n f35511f;

    private static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f35512a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i10 = this.f35512a;
            this.f35512a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C3416h1 f35513a;

        /* renamed from: b, reason: collision with root package name */
        private final io.sentry.A f35514b;

        /* renamed from: c, reason: collision with root package name */
        private final io.sentry.cache.f f35515c;

        /* renamed from: d, reason: collision with root package name */
        private final A f35516d = A.a();

        c(C3416h1 c3416h1, io.sentry.A a10, io.sentry.cache.f fVar) {
            this.f35513a = (C3416h1) io.sentry.util.n.c(c3416h1, "Envelope is required.");
            this.f35514b = a10;
            this.f35515c = (io.sentry.cache.f) io.sentry.util.n.c(fVar, "EnvelopeCache is required.");
        }

        private A j() {
            A a10 = this.f35516d;
            this.f35513a.b().d(null);
            this.f35515c.z0(this.f35513a, this.f35514b);
            io.sentry.util.j.o(this.f35514b, io.sentry.hints.f.class, new j.a() { // from class: io.sentry.transport.f
                @Override // io.sentry.util.j.a
                public final void accept(Object obj) {
                    d.c.this.k((io.sentry.hints.f) obj);
                }
            });
            if (!d.this.f35510e.a()) {
                io.sentry.util.j.p(this.f35514b, io.sentry.hints.j.class, new j.a() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).c(true);
                    }
                }, new j.b() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.j.b
                    public final void a(Object obj, Class cls) {
                        d.c.this.p(obj, cls);
                    }
                });
                return a10;
            }
            final C3416h1 c10 = d.this.f35508c.getClientReportRecorder().c(this.f35513a);
            try {
                c10.b().d(AbstractC3420j.j(d.this.f35508c.getDateProvider().now().o()));
                A h10 = d.this.f35511f.h(c10);
                if (h10.d()) {
                    this.f35515c.Q(this.f35513a);
                    return h10;
                }
                String str = "The transport failed to send the envelope with response code " + h10.c();
                d.this.f35508c.getLogger().c(K1.ERROR, str, new Object[0]);
                if (h10.c() >= 400 && h10.c() != 429) {
                    io.sentry.util.j.n(this.f35514b, io.sentry.hints.j.class, new j.c() { // from class: io.sentry.transport.g
                        @Override // io.sentry.util.j.c
                        public final void accept(Object obj) {
                            d.c.this.l(c10, obj);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                io.sentry.util.j.p(this.f35514b, io.sentry.hints.j.class, new j.a() { // from class: io.sentry.transport.h
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).c(true);
                    }
                }, new j.b() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.j.b
                    public final void a(Object obj, Class cls) {
                        d.c.this.n(c10, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(io.sentry.hints.f fVar) {
            fVar.b();
            d.this.f35508c.getLogger().c(K1.DEBUG, "Disk flush envelope fired", new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(C3416h1 c3416h1, Object obj) {
            d.this.f35508c.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, c3416h1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(C3416h1 c3416h1, Object obj, Class cls) {
            io.sentry.util.m.a(cls, obj, d.this.f35508c.getLogger());
            d.this.f35508c.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, c3416h1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(Object obj, Class cls) {
            io.sentry.util.m.a(cls, obj, d.this.f35508c.getLogger());
            d.this.f35508c.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, this.f35513a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(A a10, io.sentry.hints.o oVar) {
            d.this.f35508c.getLogger().c(K1.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(a10.d()));
            oVar.b(a10.d());
        }

        @Override // java.lang.Runnable
        public void run() {
            final A a10 = this.f35516d;
            try {
                a10 = j();
                d.this.f35508c.getLogger().c(K1.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public d(P1 p12, y yVar, q qVar, L0 l02) {
        this(g(p12.getMaxQueueSize(), p12.getEnvelopeDiskCache(), p12.getLogger()), p12, yVar, qVar, new n(p12, l02, yVar));
    }

    private static v g(int i10, final io.sentry.cache.f fVar, final ILogger iLogger) {
        return new v(1, i10, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                d.i(io.sentry.cache.f.this, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(io.sentry.cache.f fVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.j.h(cVar.f35514b, io.sentry.hints.e.class)) {
                fVar.z0(cVar.f35513a, cVar.f35514b);
            }
            n(cVar.f35514b, true);
            iLogger.c(K1.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static void n(io.sentry.A a10, final boolean z10) {
        io.sentry.util.j.o(a10, io.sentry.hints.o.class, new j.a() { // from class: io.sentry.transport.b
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.o) obj).b(false);
            }
        });
        io.sentry.util.j.o(a10, io.sentry.hints.j.class, new j.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.j) obj).c(z10);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35506a.shutdown();
        this.f35508c.getLogger().c(K1.DEBUG, "Shutting down", new Object[0]);
        try {
            if (this.f35506a.awaitTermination(1L, TimeUnit.MINUTES)) {
                return;
            }
            this.f35508c.getLogger().c(K1.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
            this.f35506a.shutdownNow();
        } catch (InterruptedException unused) {
            this.f35508c.getLogger().c(K1.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.p
    public void v(long j10) {
        this.f35506a.b(j10);
    }

    @Override // io.sentry.transport.p
    public void w0(C3416h1 c3416h1, io.sentry.A a10) {
        io.sentry.cache.f fVar = this.f35507b;
        boolean z10 = false;
        if (io.sentry.util.j.h(a10, io.sentry.hints.e.class)) {
            fVar = r.c();
            this.f35508c.getLogger().c(K1.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        }
        C3416h1 d10 = this.f35509d.d(c3416h1, a10);
        if (d10 == null) {
            if (z10) {
                this.f35507b.Q(c3416h1);
                return;
            }
            return;
        }
        if (io.sentry.util.j.h(a10, UncaughtExceptionHandlerIntegration.a.class)) {
            d10 = this.f35508c.getClientReportRecorder().c(d10);
        }
        Future submit = this.f35506a.submit(new c(d10, a10, fVar));
        if (submit == null || !submit.isCancelled()) {
            return;
        }
        this.f35508c.getClientReportRecorder().b(io.sentry.clientreport.e.QUEUE_OVERFLOW, d10);
    }

    public d(v vVar, P1 p12, y yVar, q qVar, n nVar) {
        this.f35506a = (v) io.sentry.util.n.c(vVar, "executor is required");
        this.f35507b = (io.sentry.cache.f) io.sentry.util.n.c(p12.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f35508c = (P1) io.sentry.util.n.c(p12, "options is required");
        this.f35509d = (y) io.sentry.util.n.c(yVar, "rateLimiter is required");
        this.f35510e = (q) io.sentry.util.n.c(qVar, "transportGate is required");
        this.f35511f = (n) io.sentry.util.n.c(nVar, "httpConnection is required");
    }
}
