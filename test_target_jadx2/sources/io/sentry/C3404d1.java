package io.sentry;

import io.sentry.O0;
import io.sentry.P1;
import io.sentry.Z1;
import io.sentry.protocol.C3443c;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3404d1 implements O {

    /* renamed from: b, reason: collision with root package name */
    private final P1 f35093b;

    /* renamed from: c, reason: collision with root package name */
    private final io.sentry.transport.p f35094c;

    /* renamed from: d, reason: collision with root package name */
    private final SecureRandom f35095d;

    /* renamed from: e, reason: collision with root package name */
    private final b f35096e = new b();

    /* renamed from: a, reason: collision with root package name */
    private boolean f35092a = true;

    /* renamed from: io.sentry.d1$b */
    private static final class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C3405e c3405e, C3405e c3405e2) {
            return c3405e.g().compareTo(c3405e2.g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C3404d1(P1 p12) {
        this.f35093b = (P1) io.sentry.util.n.c(p12, "SentryOptions is required.");
        V transportFactory = p12.getTransportFactory();
        if (transportFactory instanceof C3473z0) {
            transportFactory = new C3368a();
            p12.setTransportFactory(transportFactory);
        }
        this.f35094c = transportFactory.a(p12, new M0(p12).a());
        this.f35095d = p12.getSampleRate() != null ? new SecureRandom() : null;
    }

    private void f(O0 o02, A a10) {
        if (o02 != null) {
            a10.b(o02.h());
        }
    }

    private AbstractC3370a1 g(AbstractC3370a1 abstractC3370a1, O0 o02) {
        if (o02 != null) {
            if (abstractC3370a1.K() == null) {
                abstractC3370a1.Z(o02.p());
            }
            if (abstractC3370a1.Q() == null) {
                abstractC3370a1.e0(o02.v());
            }
            if (abstractC3370a1.N() == null) {
                abstractC3370a1.d0(new HashMap(o02.s()));
            } else {
                for (Map.Entry entry : o02.s().entrySet()) {
                    if (!abstractC3370a1.N().containsKey(entry.getKey())) {
                        abstractC3370a1.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (abstractC3370a1.B() == null) {
                abstractC3370a1.R(new ArrayList(o02.i()));
            } else {
                u(abstractC3370a1, o02.i());
            }
            if (abstractC3370a1.H() == null) {
                abstractC3370a1.W(new HashMap(o02.l()));
            } else {
                for (Map.Entry entry2 : o02.l().entrySet()) {
                    if (!abstractC3370a1.H().containsKey(entry2.getKey())) {
                        abstractC3370a1.H().put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C3443c C10 = abstractC3370a1.C();
            Iterator it = new C3443c(o02.j()).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                if (!C10.containsKey(entry3.getKey())) {
                    C10.put((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
        return abstractC3370a1;
    }

    private A1 h(A1 a12, O0 o02, A a10) {
        if (o02 == null) {
            return a12;
        }
        g(a12, o02);
        if (a12.t0() == null) {
            a12.E0(o02.u());
        }
        if (a12.p0() == null) {
            a12.y0(o02.m());
        }
        if (o02.n() != null) {
            a12.z0(o02.n());
        }
        S r10 = o02.r();
        if (a12.C().e() == null) {
            if (r10 == null) {
                a12.C().n(o2.q(o02.o()));
            } else {
                a12.C().n(r10.n());
            }
        }
        return p(a12, a10, o02.k());
    }

    private C3416h1 i(AbstractC3370a1 abstractC3370a1, List list, Z1 z12, l2 l2Var, I0 i02) {
        io.sentry.protocol.r rVar;
        ArrayList arrayList = new ArrayList();
        if (abstractC3370a1 != null) {
            arrayList.add(C3471y1.s(this.f35093b.getSerializer(), abstractC3370a1));
            rVar = abstractC3370a1.G();
        } else {
            rVar = null;
        }
        if (z12 != null) {
            arrayList.add(C3471y1.u(this.f35093b.getSerializer(), z12));
        }
        if (i02 != null) {
            arrayList.add(C3471y1.t(i02, this.f35093b.getMaxTraceFileSize(), this.f35093b.getSerializer()));
            if (rVar == null) {
                rVar = new io.sentry.protocol.r(i02.A());
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C3471y1.q(this.f35093b.getSerializer(), this.f35093b.getLogger(), (C3396b) it.next(), this.f35093b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C3416h1(new C3419i1(rVar, this.f35093b.getSdkVersion(), l2Var), arrayList);
    }

    private A1 j(A1 a12, A a10) {
        P1.b beforeSend = this.f35093b.getBeforeSend();
        if (beforeSend == null) {
            return a12;
        }
        try {
            return beforeSend.a(a12, a10);
        } catch (Throwable th) {
            this.f35093b.getLogger().b(K1.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    private io.sentry.protocol.y k(io.sentry.protocol.y yVar, A a10) {
        this.f35093b.getBeforeSendTransaction();
        return yVar;
    }

    private List l(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3396b c3396b = (C3396b) it.next();
            if (c3396b.j()) {
                arrayList.add(c3396b);
            }
        }
        return arrayList;
    }

    private List m(A a10) {
        List f10 = a10.f();
        C3396b g10 = a10.g();
        if (g10 != null) {
            f10.add(g10);
        }
        C3396b i10 = a10.i();
        if (i10 != null) {
            f10.add(i10);
        }
        C3396b h10 = a10.h();
        if (h10 != null) {
            f10.add(h10);
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Z1 z12) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(A1 a12, A a10, Z1 z12) {
        if (z12 == null) {
            this.f35093b.getLogger().c(K1.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String str = null;
        Z1.b bVar = a12.v0() ? Z1.b.Crashed : null;
        boolean z10 = Z1.b.Crashed == bVar || a12.w0();
        String str2 = (a12.K() == null || a12.K().l() == null || !a12.K().l().containsKey("user-agent")) ? null : (String) a12.K().l().get("user-agent");
        Object g10 = io.sentry.util.j.g(a10);
        if (g10 instanceof io.sentry.hints.a) {
            str = ((io.sentry.hints.a) g10).f();
            bVar = Z1.b.Abnormal;
        }
        if (z12.q(bVar, str2, z10, str) && z12.m()) {
            z12.c();
        }
    }

    private A1 p(A1 a12, A a10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC3466x interfaceC3466x = (InterfaceC3466x) it.next();
            try {
                boolean z10 = interfaceC3466x instanceof InterfaceC3399c;
                boolean h10 = io.sentry.util.j.h(a10, io.sentry.hints.c.class);
                if (h10 && z10) {
                    a12 = interfaceC3466x.b(a12, a10);
                } else if (!h10 && !z10) {
                    a12 = interfaceC3466x.b(a12, a10);
                }
            } catch (Throwable th) {
                this.f35093b.getLogger().a(K1.ERROR, th, "An exception occurred while processing event by processor: %s", interfaceC3466x.getClass().getName());
            }
            if (a12 == null) {
                this.f35093b.getLogger().c(K1.DEBUG, "Event was dropped by a processor: %s", interfaceC3466x.getClass().getName());
                this.f35093b.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC3417i.Error);
                break;
            }
        }
        return a12;
    }

    private io.sentry.protocol.y q(io.sentry.protocol.y yVar, A a10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC3466x interfaceC3466x = (InterfaceC3466x) it.next();
            try {
                yVar = interfaceC3466x.e(yVar, a10);
            } catch (Throwable th) {
                this.f35093b.getLogger().a(K1.ERROR, th, "An exception occurred while processing transaction by processor: %s", interfaceC3466x.getClass().getName());
            }
            if (yVar == null) {
                this.f35093b.getLogger().c(K1.DEBUG, "Transaction was dropped by a processor: %s", interfaceC3466x.getClass().getName());
                this.f35093b.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC3417i.Transaction);
                break;
            }
        }
        return yVar;
    }

    private boolean r() {
        return this.f35093b.getSampleRate() == null || this.f35095d == null || this.f35093b.getSampleRate().doubleValue() >= this.f35095d.nextDouble();
    }

    private boolean s(AbstractC3370a1 abstractC3370a1, A a10) {
        if (io.sentry.util.j.u(a10)) {
            return true;
        }
        this.f35093b.getLogger().c(K1.DEBUG, "Event was cached so not applying scope: %s", abstractC3370a1.G());
        return false;
    }

    private boolean t(Z1 z12, Z1 z13) {
        if (z13 == null) {
            return false;
        }
        if (z12 == null) {
            return true;
        }
        Z1.b l10 = z13.l();
        Z1.b bVar = Z1.b.Crashed;
        if (l10 != bVar || z12.l() == bVar) {
            return z13.e() > 0 && z12.e() <= 0;
        }
        return true;
    }

    private void u(AbstractC3370a1 abstractC3370a1, Collection collection) {
        List B10 = abstractC3370a1.B();
        if (B10 == null || collection.isEmpty()) {
            return;
        }
        B10.addAll(collection);
        Collections.sort(B10, this.f35096e);
    }

    @Override // io.sentry.O
    public void a(Z1 z12, A a10) {
        io.sentry.util.n.c(z12, "Session is required.");
        if (z12.h() == null || z12.h().isEmpty()) {
            this.f35093b.getLogger().c(K1.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            x(C3416h1.a(this.f35093b.getSerializer(), z12, this.f35093b.getSdkVersion()), a10);
        } catch (IOException e10) {
            this.f35093b.getLogger().b(K1.ERROR, "Failed to capture session.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    @Override // io.sentry.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public io.sentry.protocol.r b(A1 a12, O0 o02, A a10) {
        A1 a13;
        T t10;
        l2 b10;
        l2 l2Var;
        io.sentry.util.n.c(a12, "SentryEvent is required.");
        if (a10 == null) {
            a10 = new A();
        }
        if (s(a12, a10)) {
            f(o02, a10);
        }
        ILogger logger = this.f35093b.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "Capturing event: %s", a12.G());
        Throwable O10 = a12.O();
        if (O10 != null && this.f35093b.containsIgnoredExceptionForType(O10)) {
            this.f35093b.getLogger().c(k12, "Event was dropped as the exception %s is ignored", O10.getClass());
            this.f35093b.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC3417i.Error);
            return io.sentry.protocol.r.f35409b;
        }
        if (s(a12, a10) && (a12 = h(a12, o02, a10)) == null) {
            this.f35093b.getLogger().c(k12, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.r.f35409b;
        }
        A1 p10 = p(a12, a10, this.f35093b.getEventProcessors());
        if (p10 != null && (p10 = j(p10, a10)) == null) {
            this.f35093b.getLogger().c(k12, "Event was dropped by beforeSend", new Object[0]);
            this.f35093b.getClientReportRecorder().a(io.sentry.clientreport.e.BEFORE_SEND, EnumC3417i.Error);
        }
        if (p10 == null) {
            return io.sentry.protocol.r.f35409b;
        }
        Z1 A10 = o02 != null ? o02.A(new O0.b() { // from class: io.sentry.b1
            @Override // io.sentry.O0.b
            public final void a(Z1 z12) {
                C3404d1.n(z12);
            }
        }) : null;
        Z1 w10 = (A10 == null || !A10.m()) ? w(p10, a10, o02) : null;
        if (r()) {
            a13 = p10;
        } else {
            this.f35093b.getLogger().c(k12, "Event %s was dropped due to sampling decision.", p10.G());
            this.f35093b.getClientReportRecorder().a(io.sentry.clientreport.e.SAMPLE_RATE, EnumC3417i.Error);
            a13 = null;
        }
        boolean t11 = t(A10, w10);
        if (a13 == null && !t11) {
            this.f35093b.getLogger().c(k12, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.r.f35409b;
        }
        io.sentry.protocol.r rVar = io.sentry.protocol.r.f35409b;
        if (a13 != null && a13.G() != null) {
            rVar = a13.G();
        }
        try {
            if (io.sentry.util.j.h(a10, io.sentry.hints.c.class)) {
                if (a13 != null) {
                    b10 = C3402d.b(a13, this.f35093b).F();
                    l2Var = b10;
                }
                l2Var = null;
            } else {
                if (o02 != null) {
                    T t12 = o02.t();
                    b10 = t12 != null ? t12.b() : io.sentry.util.v.g(o02, this.f35093b).h();
                    l2Var = b10;
                }
                l2Var = null;
            }
            C3416h1 i10 = i(a13, a13 != null ? m(a10) : null, w10, l2Var, null);
            a10.c();
            if (i10 != null) {
                this.f35094c.w0(i10, a10);
            }
        } catch (io.sentry.exception.b e10) {
            e = e10;
            this.f35093b.getLogger().a(K1.WARNING, e, "Capturing event %s failed.", rVar);
            rVar = io.sentry.protocol.r.f35409b;
            if (o02 != null) {
                t10.f(g2.ABORTED, false);
            }
            return rVar;
        } catch (IOException e11) {
            e = e11;
            this.f35093b.getLogger().a(K1.WARNING, e, "Capturing event %s failed.", rVar);
            rVar = io.sentry.protocol.r.f35409b;
            if (o02 != null) {
            }
            return rVar;
        }
        if (o02 != null && (t10 = o02.t()) != null && io.sentry.util.j.h(a10, io.sentry.hints.p.class)) {
            t10.f(g2.ABORTED, false);
        }
        return rVar;
    }

    @Override // io.sentry.O
    public io.sentry.protocol.r c(io.sentry.protocol.y yVar, l2 l2Var, O0 o02, A a10, I0 i02) {
        io.sentry.util.n.c(yVar, "Transaction is required.");
        if (a10 == null) {
            a10 = new A();
        }
        if (s(yVar, a10)) {
            f(o02, a10);
        }
        ILogger logger = this.f35093b.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "Capturing transaction: %s", yVar.G());
        io.sentry.protocol.r rVar = io.sentry.protocol.r.f35409b;
        io.sentry.protocol.r G10 = yVar.G() != null ? yVar.G() : rVar;
        if (s(yVar, a10)) {
            yVar = (io.sentry.protocol.y) g(yVar, o02);
            if (yVar != null && o02 != null) {
                yVar = q(yVar, a10, o02.k());
            }
            if (yVar == null) {
                this.f35093b.getLogger().c(k12, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (yVar != null) {
            yVar = q(yVar, a10, this.f35093b.getEventProcessors());
        }
        if (yVar == null) {
            this.f35093b.getLogger().c(k12, "Transaction was dropped by Event processors.", new Object[0]);
            return rVar;
        }
        io.sentry.protocol.y k10 = k(yVar, a10);
        if (k10 == null) {
            this.f35093b.getLogger().c(k12, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            this.f35093b.getClientReportRecorder().a(io.sentry.clientreport.e.BEFORE_SEND, EnumC3417i.Transaction);
            return rVar;
        }
        try {
            C3416h1 i10 = i(k10, l(m(a10)), null, l2Var, i02);
            a10.c();
            if (i10 == null) {
                return rVar;
            }
            this.f35094c.w0(i10, a10);
            return G10;
        } catch (io.sentry.exception.b | IOException e10) {
            this.f35093b.getLogger().a(K1.WARNING, e10, "Capturing transaction %s failed.", G10);
            return io.sentry.protocol.r.f35409b;
        }
    }

    @Override // io.sentry.O
    public void close() {
        this.f35093b.getLogger().c(K1.INFO, "Closing SentryClient.", new Object[0]);
        try {
            v(this.f35093b.getShutdownTimeoutMillis());
            this.f35094c.close();
        } catch (IOException e10) {
            this.f35093b.getLogger().b(K1.WARNING, "Failed to close the connection to the Sentry Server.", e10);
        }
        for (InterfaceC3466x interfaceC3466x : this.f35093b.getEventProcessors()) {
            if (interfaceC3466x instanceof Closeable) {
                try {
                    ((Closeable) interfaceC3466x).close();
                } catch (IOException e11) {
                    this.f35093b.getLogger().c(K1.WARNING, "Failed to close the event processor {}.", interfaceC3466x, e11);
                }
            }
        }
        this.f35092a = false;
    }

    @Override // io.sentry.O
    public void v(long j10) {
        this.f35094c.v(j10);
    }

    Z1 w(final A1 a12, final A a10, O0 o02) {
        if (io.sentry.util.j.u(a10)) {
            if (o02 != null) {
                return o02.A(new O0.b() { // from class: io.sentry.c1
                    @Override // io.sentry.O0.b
                    public final void a(Z1 z12) {
                        C3404d1.this.o(a12, a10, z12);
                    }
                });
            }
            this.f35093b.getLogger().c(K1.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.O
    public io.sentry.protocol.r x(C3416h1 c3416h1, A a10) {
        io.sentry.util.n.c(c3416h1, "SentryEnvelope is required.");
        if (a10 == null) {
            a10 = new A();
        }
        try {
            a10.c();
            this.f35094c.w0(c3416h1, a10);
            io.sentry.protocol.r a11 = c3416h1.b().a();
            return a11 != null ? a11 : io.sentry.protocol.r.f35409b;
        } catch (IOException e10) {
            this.f35093b.getLogger().b(K1.ERROR, "Failed to capture envelope.", e10);
            return io.sentry.protocol.r.f35409b;
        }
    }
}
