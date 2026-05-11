package io.sentry;

import io.sentry.O0;
import io.sentry.h2;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class G implements L {

    /* renamed from: a, reason: collision with root package name */
    private volatile io.sentry.protocol.r f34455a;

    /* renamed from: b, reason: collision with root package name */
    private final P1 f34456b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f34457c;

    /* renamed from: d, reason: collision with root package name */
    private final h2 f34458d;

    /* renamed from: e, reason: collision with root package name */
    private final m2 f34459e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f34460f;

    /* renamed from: g, reason: collision with root package name */
    private final r2 f34461g;

    public G(P1 p12) {
        this(p12, g(p12));
    }

    private void c(A1 a12) {
        io.sentry.util.o oVar;
        S s10;
        if (!this.f34456b.isTracingEnabled() || a12.O() == null || (oVar = (io.sentry.util.o) this.f34460f.get(io.sentry.util.d.a(a12.O()))) == null) {
            return;
        }
        WeakReference weakReference = (WeakReference) oVar.a();
        if (a12.C().e() == null && weakReference != null && (s10 = (S) weakReference.get()) != null) {
            a12.C().n(s10.n());
        }
        String str = (String) oVar.b();
        if (a12.t0() != null || str == null) {
            return;
        }
        a12.E0(str);
    }

    private O0 d(O0 o02, P0 p02) {
        if (p02 != null) {
            try {
                O0 o03 = new O0(o02);
                p02.a(o03);
                return o03;
            } catch (Throwable th) {
                this.f34456b.getLogger().b(K1.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return o02;
    }

    private io.sentry.protocol.r e(A1 a12, A a10, P0 p02) {
        io.sentry.protocol.r rVar = io.sentry.protocol.r.f35409b;
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return rVar;
        }
        if (a12 == null) {
            this.f34456b.getLogger().c(K1.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return rVar;
        }
        try {
            c(a12);
            h2.a a11 = this.f34458d.a();
            rVar = a11.a().b(a12, d(a11.c(), p02), a10);
            this.f34455a = rVar;
            return rVar;
        } catch (Throwable th) {
            this.f34456b.getLogger().b(K1.ERROR, "Error while capturing event with id: " + a12.G(), th);
            return rVar;
        }
    }

    private io.sentry.protocol.r f(Throwable th, A a10, P0 p02) {
        io.sentry.protocol.r rVar = io.sentry.protocol.r.f35409b;
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th == null) {
            this.f34456b.getLogger().c(K1.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                h2.a a11 = this.f34458d.a();
                A1 a12 = new A1(th);
                c(a12);
                rVar = a11.a().b(a12, d(a11.c(), p02), a10);
            } catch (Throwable th2) {
                this.f34456b.getLogger().b(K1.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            }
        }
        this.f34455a = rVar;
        return rVar;
    }

    private static h2.a g(P1 p12) {
        m(p12);
        return new h2.a(p12, new C3404d1(p12), new O0(p12));
    }

    private T h(o2 o2Var, q2 q2Var) {
        final T t10;
        io.sentry.util.n.c(o2Var, "transactionContext is required");
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            t10 = C3464w0.s();
        } else if (!this.f34456b.getInstrumenter().equals(o2Var.s())) {
            this.f34456b.getLogger().c(K1.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", o2Var.s(), this.f34456b.getInstrumenter());
            t10 = C3464w0.s();
        } else if (this.f34456b.isTracingEnabled()) {
            q2Var.e();
            n2 a10 = this.f34459e.a(new N0(o2Var, null));
            o2Var.n(a10);
            X1 x12 = new X1(o2Var, this, q2Var, this.f34461g);
            if (a10.c().booleanValue() && a10.a().booleanValue()) {
                this.f34456b.getTransactionProfiler().b(x12);
            }
            t10 = x12;
        } else {
            this.f34456b.getLogger().c(K1.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            t10 = C3464w0.s();
        }
        if (q2Var.i()) {
            B(new P0() { // from class: io.sentry.F
                @Override // io.sentry.P0
                public final void a(O0 o02) {
                    o02.x(T.this);
                }
            });
        }
        return t10;
    }

    private static void m(P1 p12) {
        io.sentry.util.n.c(p12, "SentryOptions is required.");
        if (p12.getDsn() == null || p12.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    @Override // io.sentry.L
    public void A(C3405e c3405e, A a10) {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c3405e == null) {
            this.f34456b.getLogger().c(K1.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f34458d.a().c().a(c3405e, a10);
        }
    }

    @Override // io.sentry.L
    public void B(P0 p02) {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            p02.a(this.f34458d.a().c());
        } catch (Throwable th) {
            this.f34456b.getLogger().b(K1.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.L
    public void C(Throwable th, S s10, String str) {
        io.sentry.util.n.c(th, "throwable is required");
        io.sentry.util.n.c(s10, "span is required");
        io.sentry.util.n.c(str, "transactionName is required");
        Throwable a10 = io.sentry.util.d.a(th);
        if (this.f34460f.containsKey(a10)) {
            return;
        }
        this.f34460f.put(a10, new io.sentry.util.o(new WeakReference(s10), str));
    }

    @Override // io.sentry.L
    public P1 D() {
        return this.f34458d.a().b();
    }

    @Override // io.sentry.L
    public void E(P0 p02) {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'withScope' call is a no-op.", new Object[0]);
            return;
        }
        l();
        try {
            p02.a(this.f34458d.a().c());
        } catch (Throwable th) {
            this.f34456b.getLogger().b(K1.ERROR, "Error in the 'withScope' callback.", th);
        }
        k();
    }

    @Override // io.sentry.L
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public L clone() {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new G(this.f34456b, new h2(this.f34458d));
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r H(Throwable th, A a10) {
        return f(th, a10, null);
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r I(io.sentry.protocol.y yVar, l2 l2Var, A a10, I0 i02) {
        io.sentry.util.n.c(yVar, "transaction is required");
        io.sentry.protocol.r rVar = io.sentry.protocol.r.f35409b;
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return rVar;
        }
        if (!yVar.p0()) {
            this.f34456b.getLogger().c(K1.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", yVar.G());
            return rVar;
        }
        if (!Boolean.TRUE.equals(Boolean.valueOf(yVar.q0()))) {
            this.f34456b.getLogger().c(K1.DEBUG, "Transaction %s was dropped due to sampling decision.", yVar.G());
            this.f34456b.getClientReportRecorder().a(io.sentry.clientreport.e.SAMPLE_RATE, EnumC3417i.Transaction);
            return rVar;
        }
        try {
            h2.a a11 = this.f34458d.a();
            return a11.a().c(yVar, l2Var, a11.c(), a10, i02);
        } catch (Throwable th) {
            this.f34456b.getLogger().b(K1.ERROR, "Error while capturing transaction with id: " + yVar.G(), th);
            return rVar;
        }
    }

    @Override // io.sentry.L
    public void J() {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        h2.a a10 = this.f34458d.a();
        Z1 g10 = a10.c().g();
        if (g10 != null) {
            a10.a().a(g10, io.sentry.util.j.e(new io.sentry.hints.l()));
        }
    }

    @Override // io.sentry.L
    public void L() {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        h2.a a10 = this.f34458d.a();
        O0.d y10 = a10.c().y();
        if (y10 == null) {
            this.f34456b.getLogger().c(K1.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (y10.b() != null) {
            a10.a().a(y10.b(), io.sentry.util.j.e(new io.sentry.hints.l()));
        }
        a10.a().a(y10.a(), io.sentry.util.j.e(new io.sentry.hints.n()));
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r M(A1 a12, A a10) {
        return e(a12, a10, null);
    }

    @Override // io.sentry.L
    public void close() {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : this.f34456b.getIntegrations()) {
                if (integration instanceof Closeable) {
                    ((Closeable) integration).close();
                }
            }
            B(new P0() { // from class: io.sentry.E
                @Override // io.sentry.P0
                public final void a(O0 o02) {
                    o02.b();
                }
            });
            this.f34456b.getTransactionProfiler().close();
            this.f34456b.getTransactionPerformanceCollector().close();
            this.f34456b.getExecutorService().a(this.f34456b.getShutdownTimeoutMillis());
            this.f34458d.a().a().close();
        } catch (Throwable th) {
            this.f34456b.getLogger().b(K1.ERROR, "Error while closing the Hub.", th);
        }
        this.f34457c = false;
    }

    @Override // io.sentry.L
    public boolean isEnabled() {
        return this.f34457c;
    }

    public void k() {
        if (isEnabled()) {
            this.f34458d.b();
        } else {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
        }
    }

    public void l() {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
            return;
        }
        h2.a a10 = this.f34458d.a();
        this.f34458d.c(new h2.a(this.f34456b, a10.a(), new O0(a10.c())));
    }

    @Override // io.sentry.L
    public void v(long j10) {
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f34458d.a().a().v(j10);
        } catch (Throwable th) {
            this.f34456b.getLogger().b(K1.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r x(C3416h1 c3416h1, A a10) {
        io.sentry.util.n.c(c3416h1, "SentryEnvelope is required.");
        io.sentry.protocol.r rVar = io.sentry.protocol.r.f35409b;
        if (!isEnabled()) {
            this.f34456b.getLogger().c(K1.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return rVar;
        }
        try {
            io.sentry.protocol.r x10 = this.f34458d.a().a().x(c3416h1, a10);
            return x10 != null ? x10 : rVar;
        } catch (Throwable th) {
            this.f34456b.getLogger().b(K1.ERROR, "Error while capturing envelope.", th);
            return rVar;
        }
    }

    @Override // io.sentry.L
    public T y(o2 o2Var, q2 q2Var) {
        return h(o2Var, q2Var);
    }

    private G(P1 p12, h2 h2Var) {
        this.f34460f = Collections.synchronizedMap(new WeakHashMap());
        m(p12);
        this.f34456b = p12;
        this.f34459e = new m2(p12);
        this.f34458d = h2Var;
        this.f34455a = io.sentry.protocol.r.f35409b;
        this.f34461g = p12.getTransactionPerformanceCollector();
        this.f34457c = true;
    }

    private G(P1 p12, h2.a aVar) {
        this(p12, new h2(p12.getLogger(), aVar));
    }
}
