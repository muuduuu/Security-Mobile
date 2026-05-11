package ae;

import Td.AbstractC1235k;
import Td.B;
import Td.C;
import Td.C1225a;
import Td.C1231g;
import Td.H;
import Td.InterfaceC1234j;
import Td.u;
import Td.w;
import be.d;
import de.C3044a;
import de.C3050g;
import de.C3051h;
import de.C3053j;
import de.C3057n;
import de.C3058o;
import de.EnumC3045b;
import de.InterfaceC3046c;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import le.d;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.c0;

/* loaded from: classes3.dex */
public final class l extends C3050g.d implements InterfaceC1234j, d.a {

    /* renamed from: w, reason: collision with root package name */
    public static final a f12824w = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final Zd.d f12825c;

    /* renamed from: d, reason: collision with root package name */
    private final m f12826d;

    /* renamed from: e, reason: collision with root package name */
    private final H f12827e;

    /* renamed from: f, reason: collision with root package name */
    private Socket f12828f;

    /* renamed from: g, reason: collision with root package name */
    private Socket f12829g;

    /* renamed from: h, reason: collision with root package name */
    private u f12830h;

    /* renamed from: i, reason: collision with root package name */
    private C f12831i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3879g f12832j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3878f f12833k;

    /* renamed from: l, reason: collision with root package name */
    private final int f12834l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC1235k f12835m;

    /* renamed from: n, reason: collision with root package name */
    private C3050g f12836n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12837o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12838p;

    /* renamed from: q, reason: collision with root package name */
    private int f12839q;

    /* renamed from: r, reason: collision with root package name */
    private int f12840r;

    /* renamed from: s, reason: collision with root package name */
    private int f12841s;

    /* renamed from: t, reason: collision with root package name */
    private int f12842t;

    /* renamed from: u, reason: collision with root package name */
    private final List f12843u;

    /* renamed from: v, reason: collision with root package name */
    private long f12844v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends d.AbstractC0552d {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f12845d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3879g interfaceC3879g, InterfaceC3878f interfaceC3878f, e eVar) {
            super(true, interfaceC3879g, interfaceC3878f);
            this.f12845d = eVar;
        }

        @Override // le.d.AbstractC0552d
        public void a() {
            this.f12845d.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f12845d.a(-1L, true, true, null);
        }
    }

    public l(Zd.d taskRunner, m connectionPool, H route, Socket socket, Socket socket2, u uVar, C c10, InterfaceC3879g interfaceC3879g, InterfaceC3878f interfaceC3878f, int i10, AbstractC1235k connectionListener) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f12825c = taskRunner;
        this.f12826d = connectionPool;
        this.f12827e = route;
        this.f12828f = socket;
        this.f12829g = socket2;
        this.f12830h = uVar;
        this.f12831i = c10;
        this.f12832j = interfaceC3879g;
        this.f12833k = interfaceC3878f;
        this.f12834l = i10;
        this.f12835m = connectionListener;
        this.f12842t = 1;
        this.f12843u = new ArrayList();
        this.f12844v = Long.MAX_VALUE;
    }

    private final void B() {
        Socket socket = this.f12829g;
        Intrinsics.d(socket);
        InterfaceC3879g interfaceC3879g = this.f12832j;
        Intrinsics.d(interfaceC3879g);
        InterfaceC3878f interfaceC3878f = this.f12833k;
        Intrinsics.d(interfaceC3878f);
        socket.setSoTimeout(0);
        Object obj = this.f12835m;
        InterfaceC3046c interfaceC3046c = obj instanceof InterfaceC3046c ? (InterfaceC3046c) obj : null;
        if (interfaceC3046c == null) {
            interfaceC3046c = InterfaceC3046c.a.f31897a;
        }
        C3050g a10 = new C3050g.b(true, this.f12825c).s(socket, h().a().l().h(), interfaceC3879g, interfaceC3878f).m(this).n(this.f12834l).b(interfaceC3046c).a();
        this.f12836n = a10;
        this.f12842t = C3050g.f31934C.a().d();
        C3050g.A1(a10, false, 1, null);
    }

    private final boolean C(w wVar) {
        u uVar;
        if (Wd.p.f11601e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        w l10 = h().a().l();
        if (wVar.n() != l10.n()) {
            return false;
        }
        if (Intrinsics.b(wVar.h(), l10.h())) {
            return true;
        }
        if (this.f12838p || (uVar = this.f12830h) == null) {
            return false;
        }
        Intrinsics.d(uVar);
        return e(wVar, uVar);
    }

    private final boolean e(w wVar, u uVar) {
        List d10 = uVar.d();
        if (d10.isEmpty()) {
            return false;
        }
        je.d dVar = je.d.f35958a;
        String h10 = wVar.h();
        Object obj = d10.get(0);
        Intrinsics.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return dVar.e(h10, (X509Certificate) obj);
    }

    private final boolean w(List list) {
        List<H> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (H h10 : list2) {
            Proxy.Type type = h10.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && h().b().type() == type2 && Intrinsics.b(h().d(), h10.d())) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        this.f12844v = System.nanoTime();
        C c10 = this.f12831i;
        if (c10 == C.HTTP_2 || c10 == C.H2_PRIOR_KNOWLEDGE) {
            B();
        }
    }

    @Override // Td.InterfaceC1234j
    public C a() {
        C c10 = this.f12831i;
        Intrinsics.d(c10);
        return c10;
    }

    @Override // be.d.a
    public void b(k call, IOException iOException) {
        boolean z10;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                z10 = false;
                if (iOException instanceof C3058o) {
                    if (((C3058o) iOException).f32082a == EnumC3045b.REFUSED_STREAM) {
                        int i10 = this.f12841s + 1;
                        this.f12841s = i10;
                        if (i10 > 1) {
                            z10 = !this.f12837o;
                            this.f12837o = true;
                            this.f12839q++;
                        }
                    } else if (((C3058o) iOException).f32082a != EnumC3045b.CANCEL || !call.e()) {
                        z10 = !this.f12837o;
                        this.f12837o = true;
                        this.f12839q++;
                    }
                } else if (!r() || (iOException instanceof C3044a)) {
                    z10 = !this.f12837o;
                    this.f12837o = true;
                    if (this.f12840r == 0) {
                        if (iOException != null) {
                            g(call.n(), h(), iOException);
                        }
                        this.f12839q++;
                    }
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            this.f12835m.h(this);
        }
    }

    @Override // de.C3050g.d
    public synchronized void c(C3050g connection, C3057n settings) {
        try {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
            int i10 = this.f12842t;
            int d10 = settings.d();
            this.f12842t = d10;
            if (d10 < i10) {
                this.f12826d.i(h().a());
            } else if (d10 > i10) {
                this.f12826d.h();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // be.d.a
    public void cancel() {
        Socket socket = this.f12828f;
        if (socket != null) {
            Wd.p.g(socket);
        }
    }

    @Override // de.C3050g.d
    public void d(C3053j stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.e(EnumC3045b.REFUSED_STREAM, null);
    }

    @Override // be.d.a
    public void f() {
        synchronized (this) {
            this.f12837o = true;
            Unit unit = Unit.f36324a;
        }
        this.f12835m.h(this);
    }

    public final void g(B client, H failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            C1225a a10 = failedRoute.a();
            a10.i().connectFailed(a10.l().v(), failedRoute.b().address(), failure);
        }
        client.u().b(failedRoute);
    }

    @Override // be.d.a
    public H h() {
        return this.f12827e;
    }

    public final List i() {
        return this.f12843u;
    }

    public final AbstractC1235k j() {
        return this.f12835m;
    }

    public final long k() {
        return this.f12844v;
    }

    public final boolean l() {
        return this.f12837o;
    }

    public final int m() {
        return this.f12839q;
    }

    public u n() {
        return this.f12830h;
    }

    public final synchronized void o() {
        this.f12840r++;
    }

    public final boolean p(C1225a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (Wd.p.f11601e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f12843u.size() >= this.f12842t || this.f12837o || !h().a().d(address)) {
            return false;
        }
        if (Intrinsics.b(address.l().h(), v().a().l().h())) {
            return true;
        }
        if (this.f12836n == null || list == null || !w(list) || address.e() != je.d.f35958a || !C(address.l())) {
            return false;
        }
        try {
            C1231g a10 = address.a();
            Intrinsics.d(a10);
            String h10 = address.l().h();
            u n10 = n();
            Intrinsics.d(n10);
            a10.a(h10, n10.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean q(boolean z10) {
        long j10;
        if (Wd.p.f11601e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f12828f;
        Intrinsics.d(socket);
        Socket socket2 = this.f12829g;
        Intrinsics.d(socket2);
        InterfaceC3879g interfaceC3879g = this.f12832j;
        Intrinsics.d(interfaceC3879g);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C3050g c3050g = this.f12836n;
        if (c3050g != null) {
            return c3050g.A0(nanoTime);
        }
        synchronized (this) {
            j10 = nanoTime - this.f12844v;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return Wd.p.l(socket2, interfaceC3879g);
    }

    public final boolean r() {
        return this.f12836n != null;
    }

    public final be.d s(B client, be.g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f12829g;
        Intrinsics.d(socket);
        InterfaceC3879g interfaceC3879g = this.f12832j;
        Intrinsics.d(interfaceC3879g);
        InterfaceC3878f interfaceC3878f = this.f12833k;
        Intrinsics.d(interfaceC3878f);
        C3050g c3050g = this.f12836n;
        if (c3050g != null) {
            return new C3051h(client, this, chain, c3050g);
        }
        socket.setSoTimeout(chain.k());
        c0 A10 = interfaceC3879g.A();
        long h10 = chain.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        A10.g(h10, timeUnit);
        interfaceC3878f.A().g(chain.j(), timeUnit);
        return new ce.b(client, this, interfaceC3879g, interfaceC3878f);
    }

    public final d.AbstractC0552d t(e exchange) {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Socket socket = this.f12829g;
        Intrinsics.d(socket);
        InterfaceC3879g interfaceC3879g = this.f12832j;
        Intrinsics.d(interfaceC3879g);
        InterfaceC3878f interfaceC3878f = this.f12833k;
        Intrinsics.d(interfaceC3878f);
        socket.setSoTimeout(0);
        f();
        return new b(interfaceC3879g, interfaceC3878f, exchange);
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(h().a().l().h());
        sb2.append(':');
        sb2.append(h().a().l().n());
        sb2.append(", proxy=");
        sb2.append(h().b());
        sb2.append(" hostAddress=");
        sb2.append(h().d());
        sb2.append(" cipherSuite=");
        u uVar = this.f12830h;
        if (uVar == null || (obj = uVar.a()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f12831i);
        sb2.append('}');
        return sb2.toString();
    }

    public final synchronized void u() {
        this.f12838p = true;
    }

    public H v() {
        return h();
    }

    public final void x(long j10) {
        this.f12844v = j10;
    }

    public final void y(boolean z10) {
        this.f12837o = z10;
    }

    public Socket z() {
        Socket socket = this.f12829g;
        Intrinsics.d(socket);
        return socket;
    }
}
