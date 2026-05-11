package De;

import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import java.io.IOException;
import java.util.Objects;
import pe.AbstractC3887o;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;

/* loaded from: classes3.dex */
final class n implements InterfaceC0818b {

    /* renamed from: a, reason: collision with root package name */
    private final y f1679a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f1680b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1229e.a f1681c;

    /* renamed from: d, reason: collision with root package name */
    private final f f1682d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f1683e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC1229e f1684f;

    /* renamed from: g, reason: collision with root package name */
    private Throwable f1685g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1686h;

    class a implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0820d f1687a;

        a(InterfaceC0820d interfaceC0820d) {
            this.f1687a = interfaceC0820d;
        }

        private void a(Throwable th) {
            try {
                this.f1687a.onFailure(n.this, th);
            } catch (Throwable th2) {
                E.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, F f10) {
            try {
                try {
                    this.f1687a.onResponse(n.this, n.this.h(f10));
                } catch (Throwable th) {
                    E.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                E.s(th2);
                a(th2);
            }
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
            a(iOException);
        }
    }

    static final class b extends G {

        /* renamed from: c, reason: collision with root package name */
        private final G f1689c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3879g f1690d;

        /* renamed from: e, reason: collision with root package name */
        IOException f1691e;

        class a extends AbstractC3887o {
            a(b0 b0Var) {
                super(b0Var);
            }

            @Override // pe.AbstractC3887o, pe.b0
            public long b2(C3877e c3877e, long j10) {
                try {
                    return super.b2(c3877e, j10);
                } catch (IOException e10) {
                    b.this.f1691e = e10;
                    throw e10;
                }
            }
        }

        b(G g10) {
            this.f1689c = g10;
            this.f1690d = M.c(new a(g10.j()));
        }

        @Override // Td.G, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1689c.close();
        }

        @Override // Td.G
        public long e() {
            return this.f1689c.e();
        }

        @Override // Td.G
        public Td.z f() {
            return this.f1689c.f();
        }

        @Override // Td.G
        public InterfaceC3879g j() {
            return this.f1690d;
        }

        void n() {
            IOException iOException = this.f1691e;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class c extends G {

        /* renamed from: c, reason: collision with root package name */
        private final Td.z f1693c;

        /* renamed from: d, reason: collision with root package name */
        private final long f1694d;

        c(Td.z zVar, long j10) {
            this.f1693c = zVar;
            this.f1694d = j10;
        }

        @Override // Td.G
        public long e() {
            return this.f1694d;
        }

        @Override // Td.G
        public Td.z f() {
            return this.f1693c;
        }

        @Override // Td.G
        public InterfaceC3879g j() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    n(y yVar, Object[] objArr, InterfaceC1229e.a aVar, f fVar) {
        this.f1679a = yVar;
        this.f1680b = objArr;
        this.f1681c = aVar;
        this.f1682d = fVar;
    }

    private InterfaceC1229e b() {
        InterfaceC1229e a10 = this.f1681c.a(this.f1679a.a(this.f1680b));
        if (a10 != null) {
            return a10;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private InterfaceC1229e d() {
        InterfaceC1229e interfaceC1229e = this.f1684f;
        if (interfaceC1229e != null) {
            return interfaceC1229e;
        }
        Throwable th = this.f1685g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC1229e b10 = b();
            this.f1684f = b10;
            return b10;
        } catch (IOException | Error | RuntimeException e10) {
            E.s(e10);
            this.f1685g = e10;
            throw e10;
        }
    }

    @Override // De.InterfaceC0818b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n clone() {
        return new n(this.f1679a, this.f1680b, this.f1681c, this.f1682d);
    }

    @Override // De.InterfaceC0818b
    public void cancel() {
        InterfaceC1229e interfaceC1229e;
        this.f1683e = true;
        synchronized (this) {
            interfaceC1229e = this.f1684f;
        }
        if (interfaceC1229e != null) {
            interfaceC1229e.cancel();
        }
    }

    @Override // De.InterfaceC0818b
    public boolean e() {
        boolean z10 = true;
        if (this.f1683e) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC1229e interfaceC1229e = this.f1684f;
                if (interfaceC1229e == null || !interfaceC1229e.e()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    z h(F f10) {
        G b10 = f10.b();
        F c10 = f10.t().b(new c(b10.f(), b10.e())).c();
        int f11 = c10.f();
        if (f11 < 200 || f11 >= 300) {
            try {
                return z.c(E.a(b10), c10);
            } finally {
                b10.close();
            }
        }
        if (f11 == 204 || f11 == 205) {
            b10.close();
            return z.h(null, c10);
        }
        b bVar = new b(b10);
        try {
            return z.h(this.f1682d.a(bVar), c10);
        } catch (RuntimeException e10) {
            bVar.n();
            throw e10;
        }
    }

    @Override // De.InterfaceC0818b
    public z j() {
        InterfaceC1229e d10;
        synchronized (this) {
            if (this.f1686h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f1686h = true;
            d10 = d();
        }
        if (this.f1683e) {
            d10.cancel();
        }
        return h(d10.j());
    }

    @Override // De.InterfaceC0818b
    public synchronized Td.D t() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return d().t();
    }

    @Override // De.InterfaceC0818b
    public void v1(InterfaceC0820d interfaceC0820d) {
        InterfaceC1229e interfaceC1229e;
        Throwable th;
        Objects.requireNonNull(interfaceC0820d, "callback == null");
        synchronized (this) {
            try {
                if (this.f1686h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f1686h = true;
                interfaceC1229e = this.f1684f;
                th = this.f1685g;
                if (interfaceC1229e == null && th == null) {
                    try {
                        InterfaceC1229e b10 = b();
                        this.f1684f = b10;
                        interfaceC1229e = b10;
                    } catch (Throwable th2) {
                        th = th2;
                        E.s(th);
                        this.f1685g = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC0820d.onFailure(this, th);
            return;
        }
        if (this.f1683e) {
            interfaceC1229e.cancel();
        }
        interfaceC1229e.g1(new a(interfaceC0820d));
    }
}
