package io.sentry;

import io.sentry.protocol.C3444d;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3427l0 implements InterfaceC3466x, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f35185a;

    /* renamed from: b, reason: collision with root package name */
    private final S1 f35186b;

    /* renamed from: c, reason: collision with root package name */
    private final B1 f35187c;

    /* renamed from: d, reason: collision with root package name */
    private volatile D f35188d = null;

    public C3427l0(P1 p12) {
        P1 p13 = (P1) io.sentry.util.n.c(p12, "The SentryOptions is required.");
        this.f35185a = p13;
        R1 r12 = new R1(p13);
        this.f35187c = new B1(r12);
        this.f35186b = new S1(r12, p13);
    }

    private void a() {
        if (this.f35188d == null) {
            synchronized (this) {
                try {
                    if (this.f35188d == null) {
                        this.f35188d = D.e();
                    }
                } finally {
                }
            }
        }
    }

    private boolean c(A a10) {
        return io.sentry.util.j.h(a10, io.sentry.hints.e.class);
    }

    private void d(AbstractC3370a1 abstractC3370a1) {
        if (this.f35185a.isSendDefaultPii()) {
            if (abstractC3370a1.Q() == null) {
                io.sentry.protocol.B b10 = new io.sentry.protocol.B();
                b10.o("{{auto}}");
                abstractC3370a1.e0(b10);
            } else if (abstractC3370a1.Q().l() == null) {
                abstractC3370a1.Q().o("{{auto}}");
            }
        }
    }

    private void f(AbstractC3370a1 abstractC3370a1) {
        q(abstractC3370a1);
        l(abstractC3370a1);
        s(abstractC3370a1);
        j(abstractC3370a1);
        r(abstractC3370a1);
        t(abstractC3370a1);
        d(abstractC3370a1);
    }

    private void g(AbstractC3370a1 abstractC3370a1) {
        p(abstractC3370a1);
    }

    private void i(AbstractC3370a1 abstractC3370a1) {
        ArrayList arrayList = new ArrayList();
        if (this.f35185a.getProguardUuid() != null) {
            C3444d c3444d = new C3444d();
            c3444d.k("proguard");
            c3444d.m(this.f35185a.getProguardUuid());
            arrayList.add(c3444d);
        }
        for (String str : this.f35185a.getBundleIds()) {
            C3444d c3444d2 = new C3444d();
            c3444d2.k("jvm");
            c3444d2.j(str);
            arrayList.add(c3444d2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        io.sentry.protocol.e D10 = abstractC3370a1.D();
        if (D10 == null) {
            D10 = new io.sentry.protocol.e();
        }
        if (D10.c() == null) {
            D10.d(arrayList);
        } else {
            D10.c().addAll(arrayList);
        }
        abstractC3370a1.S(D10);
    }

    private void j(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.E() == null) {
            abstractC3370a1.T(this.f35185a.getDist());
        }
    }

    private void l(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.F() == null) {
            abstractC3370a1.U(this.f35185a.getEnvironment());
        }
    }

    private void n(A1 a12) {
        Throwable P10 = a12.P();
        if (P10 != null) {
            a12.x0(this.f35187c.c(P10));
        }
    }

    private void o(A1 a12) {
        Map a10 = this.f35185a.getModulesLoader().a();
        if (a10 == null) {
            return;
        }
        Map r02 = a12.r0();
        if (r02 == null) {
            a12.B0(a10);
        } else {
            r02.putAll(a10);
        }
    }

    private void p(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.I() == null) {
            abstractC3370a1.X("java");
        }
    }

    private void q(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.J() == null) {
            abstractC3370a1.Y(this.f35185a.getRelease());
        }
    }

    private void r(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.L() == null) {
            abstractC3370a1.a0(this.f35185a.getSdkVersion());
        }
    }

    private void s(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.M() == null) {
            abstractC3370a1.b0(this.f35185a.getServerName());
        }
        if (this.f35185a.isAttachServerName() && abstractC3370a1.M() == null) {
            a();
            if (this.f35188d != null) {
                abstractC3370a1.b0(this.f35188d.d());
            }
        }
    }

    private void t(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.N() == null) {
            abstractC3370a1.d0(new HashMap(this.f35185a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f35185a.getTags().entrySet()) {
            if (!abstractC3370a1.N().containsKey(entry.getKey())) {
                abstractC3370a1.c0(entry.getKey(), entry.getValue());
            }
        }
    }

    private void u(A1 a12, A a10) {
        if (a12.s0() == null) {
            List<io.sentry.protocol.q> o02 = a12.o0();
            ArrayList arrayList = null;
            if (o02 != null && !o02.isEmpty()) {
                for (io.sentry.protocol.q qVar : o02) {
                    if (qVar.g() != null && qVar.h() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(qVar.h());
                    }
                }
            }
            if (this.f35185a.isAttachThreads() || io.sentry.util.j.h(a10, io.sentry.hints.a.class)) {
                Object g10 = io.sentry.util.j.g(a10);
                a12.C0(this.f35186b.b(arrayList, g10 instanceof io.sentry.hints.a ? ((io.sentry.hints.a) g10).d() : false));
            } else if (this.f35185a.isAttachStacktrace()) {
                if ((o02 == null || o02.isEmpty()) && !c(a10)) {
                    a12.C0(this.f35186b.a());
                }
            }
        }
    }

    private boolean x(AbstractC3370a1 abstractC3370a1, A a10) {
        if (io.sentry.util.j.u(a10)) {
            return true;
        }
        this.f35185a.getLogger().c(K1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC3370a1.G());
        return false;
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, A a10) {
        g(a12);
        n(a12);
        i(a12);
        o(a12);
        if (x(a12, a10)) {
            f(a12);
            u(a12, a10);
        }
        return a12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f35188d != null) {
            this.f35188d.c();
        }
    }

    @Override // io.sentry.InterfaceC3466x
    public io.sentry.protocol.y e(io.sentry.protocol.y yVar, A a10) {
        g(yVar);
        i(yVar);
        if (x(yVar, a10)) {
            f(yVar);
        }
        return yVar;
    }
}
