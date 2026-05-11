package Td;

import Td.InterfaceC1229e;
import Td.s;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import ge.n;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import je.c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class B implements InterfaceC1229e.a {

    /* renamed from: H, reason: collision with root package name */
    public static final b f9795H = new b(null);

    /* renamed from: I, reason: collision with root package name */
    private static final List f9796I = Wd.p.k(C.HTTP_2, C.HTTP_1_1);

    /* renamed from: J, reason: collision with root package name */
    private static final List f9797J = Wd.p.k(m.f10150i, m.f10152k);

    /* renamed from: A, reason: collision with root package name */
    private final int f9798A;

    /* renamed from: B, reason: collision with root package name */
    private final int f9799B;

    /* renamed from: C, reason: collision with root package name */
    private final int f9800C;

    /* renamed from: D, reason: collision with root package name */
    private final long f9801D;

    /* renamed from: E, reason: collision with root package name */
    private final ae.q f9802E;

    /* renamed from: F, reason: collision with root package name */
    private final Zd.d f9803F;

    /* renamed from: G, reason: collision with root package name */
    private final l f9804G;

    /* renamed from: a, reason: collision with root package name */
    private final q f9805a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9806b;

    /* renamed from: c, reason: collision with root package name */
    private final List f9807c;

    /* renamed from: d, reason: collision with root package name */
    private final s.c f9808d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9809e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9810f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1226b f9811g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9812h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f9813i;

    /* renamed from: j, reason: collision with root package name */
    private final o f9814j;

    /* renamed from: k, reason: collision with root package name */
    private final C1227c f9815k;

    /* renamed from: l, reason: collision with root package name */
    private final r f9816l;

    /* renamed from: m, reason: collision with root package name */
    private final Proxy f9817m;

    /* renamed from: n, reason: collision with root package name */
    private final ProxySelector f9818n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1226b f9819o;

    /* renamed from: p, reason: collision with root package name */
    private final SocketFactory f9820p;

    /* renamed from: q, reason: collision with root package name */
    private final SSLSocketFactory f9821q;

    /* renamed from: r, reason: collision with root package name */
    private final X509TrustManager f9822r;

    /* renamed from: s, reason: collision with root package name */
    private final List f9823s;

    /* renamed from: t, reason: collision with root package name */
    private final List f9824t;

    /* renamed from: u, reason: collision with root package name */
    private final HostnameVerifier f9825u;

    /* renamed from: v, reason: collision with root package name */
    private final C1231g f9826v;

    /* renamed from: w, reason: collision with root package name */
    private final je.c f9827w;

    /* renamed from: x, reason: collision with root package name */
    private final int f9828x;

    /* renamed from: y, reason: collision with root package name */
    private final int f9829y;

    /* renamed from: z, reason: collision with root package name */
    private final int f9830z;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return B.f9797J;
        }

        public final List b() {
            return B.f9796I;
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B(a builder) {
        ProxySelector O10;
        List list;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f9805a = builder.A();
        this.f9806b = Wd.p.w(builder.H());
        this.f9807c = Wd.p.w(builder.J());
        this.f9808d = builder.C();
        boolean Q10 = builder.Q();
        this.f9809e = Q10;
        boolean D10 = builder.D();
        this.f9810f = D10;
        this.f9811g = builder.r();
        this.f9812h = builder.E();
        this.f9813i = builder.F();
        this.f9814j = builder.z();
        this.f9815k = builder.s();
        this.f9816l = builder.B();
        this.f9817m = builder.M();
        if (builder.M() != null) {
            O10 = ie.a.f34299a;
        } else {
            O10 = builder.O();
            O10 = O10 == null ? ProxySelector.getDefault() : O10;
            if (O10 == null) {
                O10 = ie.a.f34299a;
            }
        }
        this.f9818n = O10;
        this.f9819o = builder.N();
        this.f9820p = builder.S();
        List y10 = builder.y();
        this.f9823s = y10;
        this.f9824t = builder.L();
        this.f9825u = builder.G();
        this.f9828x = builder.t();
        int w10 = builder.w();
        this.f9829y = w10;
        int P10 = builder.P();
        this.f9830z = P10;
        int W10 = builder.W();
        this.f9798A = W10;
        int K10 = builder.K();
        this.f9799B = K10;
        this.f9800C = builder.V();
        this.f9801D = builder.I();
        ae.q R10 = builder.R();
        ae.q qVar = R10 == null ? new ae.q() : R10;
        this.f9802E = qVar;
        Zd.d U10 = builder.U();
        this.f9803F = U10 == null ? Zd.d.f12525m : U10;
        l x10 = builder.x();
        if (x10 == null) {
            list = y10;
            l lVar = new l(0, 0L, null, null, 0 == true ? 1 : 0, P10, W10, w10, P10, K10, Q10, D10, qVar, 31, null);
            builder.f0(lVar);
            x10 = lVar;
        } else {
            list = y10;
        }
        this.f9804G = x10;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (builder.T() != null) {
                        this.f9821q = builder.T();
                        je.c u10 = builder.u();
                        Intrinsics.d(u10);
                        this.f9827w = u10;
                        X509TrustManager X10 = builder.X();
                        Intrinsics.d(X10);
                        this.f9822r = X10;
                        C1231g v10 = builder.v();
                        Intrinsics.d(u10);
                        this.f9826v = v10.e(u10);
                    } else {
                        n.a aVar = ge.n.f33789a;
                        X509TrustManager p10 = aVar.g().p();
                        this.f9822r = p10;
                        ge.n g10 = aVar.g();
                        Intrinsics.d(p10);
                        this.f9821q = g10.o(p10);
                        c.a aVar2 = je.c.f35957a;
                        Intrinsics.d(p10);
                        je.c a10 = aVar2.a(p10);
                        this.f9827w = a10;
                        C1231g v11 = builder.v();
                        Intrinsics.d(a10);
                        this.f9826v = v11.e(a10);
                    }
                    L();
                }
            }
        }
        this.f9821q = null;
        this.f9827w = null;
        this.f9822r = null;
        this.f9826v = C1231g.f9999d;
        L();
    }

    private final void L() {
        List list = this.f9806b;
        Intrinsics.e(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f9806b).toString());
        }
        List list2 = this.f9807c;
        Intrinsics.e(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f9807c).toString());
        }
        List list3 = this.f9823s;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (this.f9821q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f9827w == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f9822r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f9821q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f9827w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f9822r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.b(this.f9826v, C1231g.f9999d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public a A() {
        return new a(this);
    }

    public J B(D request, K listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        le.d dVar = new le.d(this.f9803F, request, listener, new Random(), this.f9799B, null, this.f9801D, this.f9800C);
        dVar.p(this);
        return dVar;
    }

    public final int C() {
        return this.f9799B;
    }

    public final List D() {
        return this.f9824t;
    }

    public final Proxy E() {
        return this.f9817m;
    }

    public final InterfaceC1226b F() {
        return this.f9819o;
    }

    public final ProxySelector G() {
        return this.f9818n;
    }

    public final int H() {
        return this.f9830z;
    }

    public final boolean I() {
        return this.f9809e;
    }

    public final SocketFactory J() {
        return this.f9820p;
    }

    public final SSLSocketFactory K() {
        SSLSocketFactory sSLSocketFactory = this.f9821q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int M() {
        return this.f9800C;
    }

    public final int N() {
        return this.f9798A;
    }

    public final X509TrustManager O() {
        return this.f9822r;
    }

    @Override // Td.InterfaceC1229e.a
    public InterfaceC1229e a(D request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new ae.k(this, request, false);
    }

    public final C1225a e(w url) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C1231g c1231g;
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.i()) {
            sSLSocketFactory = K();
            hostnameVerifier = this.f9825u;
            c1231g = this.f9826v;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c1231g = null;
        }
        return new C1225a(url.h(), url.n(), this.f9816l, this.f9820p, sSLSocketFactory, hostnameVerifier, c1231g, this.f9819o, this.f9817m, this.f9824t, this.f9823s, this.f9818n);
    }

    public final InterfaceC1226b f() {
        return this.f9811g;
    }

    public final C1227c g() {
        return this.f9815k;
    }

    public final int h() {
        return this.f9828x;
    }

    public final je.c i() {
        return this.f9827w;
    }

    public final C1231g j() {
        return this.f9826v;
    }

    public final int k() {
        return this.f9829y;
    }

    public final l l() {
        return this.f9804G;
    }

    public final List m() {
        return this.f9823s;
    }

    public final o n() {
        return this.f9814j;
    }

    public final q o() {
        return this.f9805a;
    }

    public final r p() {
        return this.f9816l;
    }

    public final s.c q() {
        return this.f9808d;
    }

    public final boolean r() {
        return this.f9810f;
    }

    public final boolean s() {
        return this.f9812h;
    }

    public final boolean t() {
        return this.f9813i;
    }

    public final ae.q u() {
        return this.f9802E;
    }

    public final Zd.d v() {
        return this.f9803F;
    }

    public final HostnameVerifier w() {
        return this.f9825u;
    }

    public final List x() {
        return this.f9806b;
    }

    public final long y() {
        return this.f9801D;
    }

    public final List z() {
        return this.f9807c;
    }

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private int f9831A;

        /* renamed from: B, reason: collision with root package name */
        private int f9832B;

        /* renamed from: C, reason: collision with root package name */
        private int f9833C;

        /* renamed from: D, reason: collision with root package name */
        private int f9834D;

        /* renamed from: E, reason: collision with root package name */
        private long f9835E;

        /* renamed from: F, reason: collision with root package name */
        private ae.q f9836F;

        /* renamed from: G, reason: collision with root package name */
        private Zd.d f9837G;

        /* renamed from: a, reason: collision with root package name */
        private q f9838a;

        /* renamed from: b, reason: collision with root package name */
        private l f9839b;

        /* renamed from: c, reason: collision with root package name */
        private final List f9840c;

        /* renamed from: d, reason: collision with root package name */
        private final List f9841d;

        /* renamed from: e, reason: collision with root package name */
        private s.c f9842e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9843f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9844g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC1226b f9845h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f9846i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f9847j;

        /* renamed from: k, reason: collision with root package name */
        private o f9848k;

        /* renamed from: l, reason: collision with root package name */
        private C1227c f9849l;

        /* renamed from: m, reason: collision with root package name */
        private r f9850m;

        /* renamed from: n, reason: collision with root package name */
        private Proxy f9851n;

        /* renamed from: o, reason: collision with root package name */
        private ProxySelector f9852o;

        /* renamed from: p, reason: collision with root package name */
        private InterfaceC1226b f9853p;

        /* renamed from: q, reason: collision with root package name */
        private SocketFactory f9854q;

        /* renamed from: r, reason: collision with root package name */
        private SSLSocketFactory f9855r;

        /* renamed from: s, reason: collision with root package name */
        private X509TrustManager f9856s;

        /* renamed from: t, reason: collision with root package name */
        private List f9857t;

        /* renamed from: u, reason: collision with root package name */
        private List f9858u;

        /* renamed from: v, reason: collision with root package name */
        private HostnameVerifier f9859v;

        /* renamed from: w, reason: collision with root package name */
        private C1231g f9860w;

        /* renamed from: x, reason: collision with root package name */
        private je.c f9861x;

        /* renamed from: y, reason: collision with root package name */
        private int f9862y;

        /* renamed from: z, reason: collision with root package name */
        private int f9863z;

        public a() {
            this.f9838a = new q();
            this.f9840c = new ArrayList();
            this.f9841d = new ArrayList();
            this.f9842e = Wd.p.c(s.f10201b);
            this.f9843f = true;
            this.f9844g = true;
            InterfaceC1226b interfaceC1226b = InterfaceC1226b.f9939b;
            this.f9845h = interfaceC1226b;
            this.f9846i = true;
            this.f9847j = true;
            this.f9848k = o.f10187b;
            this.f9850m = r.f10198b;
            this.f9853p = interfaceC1226b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
            this.f9854q = socketFactory;
            b bVar = B.f9795H;
            this.f9857t = bVar.a();
            this.f9858u = bVar.b();
            this.f9859v = je.d.f35958a;
            this.f9860w = C1231g.f9999d;
            this.f9863z = ModuleDescriptor.MODULE_VERSION;
            this.f9831A = ModuleDescriptor.MODULE_VERSION;
            this.f9832B = ModuleDescriptor.MODULE_VERSION;
            this.f9834D = 60000;
            this.f9835E = 1024L;
        }

        public final q A() {
            return this.f9838a;
        }

        public final r B() {
            return this.f9850m;
        }

        public final s.c C() {
            return this.f9842e;
        }

        public final boolean D() {
            return this.f9844g;
        }

        public final boolean E() {
            return this.f9846i;
        }

        public final boolean F() {
            return this.f9847j;
        }

        public final HostnameVerifier G() {
            return this.f9859v;
        }

        public final List H() {
            return this.f9840c;
        }

        public final long I() {
            return this.f9835E;
        }

        public final List J() {
            return this.f9841d;
        }

        public final int K() {
            return this.f9833C;
        }

        public final List L() {
            return this.f9858u;
        }

        public final Proxy M() {
            return this.f9851n;
        }

        public final InterfaceC1226b N() {
            return this.f9853p;
        }

        public final ProxySelector O() {
            return this.f9852o;
        }

        public final int P() {
            return this.f9831A;
        }

        public final boolean Q() {
            return this.f9843f;
        }

        public final ae.q R() {
            return this.f9836F;
        }

        public final SocketFactory S() {
            return this.f9854q;
        }

        public final SSLSocketFactory T() {
            return this.f9855r;
        }

        public final Zd.d U() {
            return this.f9837G;
        }

        public final int V() {
            return this.f9834D;
        }

        public final int W() {
            return this.f9832B;
        }

        public final X509TrustManager X() {
            return this.f9856s;
        }

        public final a Y(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.b(hostnameVerifier, this.f9859v)) {
                this.f9836F = null;
            }
            this.f9859v = hostnameVerifier;
            return this;
        }

        public final List Z() {
            return this.f9840c;
        }

        public final a a(x interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f9840c.add(interceptor);
            return this;
        }

        public final List a0() {
            return this.f9841d;
        }

        public final a b(x interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f9841d.add(interceptor);
            return this;
        }

        public final a b0(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List Q02 = CollectionsKt.Q0(protocols);
            C c10 = C.H2_PRIOR_KNOWLEDGE;
            if (!Q02.contains(c10) && !Q02.contains(C.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + Q02).toString());
            }
            if (Q02.contains(c10) && Q02.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + Q02).toString());
            }
            if (Q02.contains(C.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + Q02).toString());
            }
            Intrinsics.e(Q02, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (Q02.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            Q02.remove(C.SPDY_3);
            if (!Intrinsics.b(Q02, this.f9858u)) {
                this.f9836F = null;
            }
            List unmodifiableList = Collections.unmodifiableList(Q02);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
            this.f9858u = unmodifiableList;
            return this;
        }

        public final B c() {
            return new B(this);
        }

        public final a c0(Proxy proxy) {
            if (!Intrinsics.b(proxy, this.f9851n)) {
                this.f9836F = null;
            }
            this.f9851n = proxy;
            return this;
        }

        public final a d(C1227c c1227c) {
            this.f9849l = c1227c;
            return this;
        }

        public final a d0(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f9831A = Wd.p.f("timeout", j10, unit);
            return this;
        }

        public final a e(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f9862y = Wd.p.f("timeout", j10, unit);
            return this;
        }

        public final a e0(boolean z10) {
            this.f9843f = z10;
            return this;
        }

        public final a f(C1231g certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!Intrinsics.b(certificatePinner, this.f9860w)) {
                this.f9836F = null;
            }
            this.f9860w = certificatePinner;
            return this;
        }

        public final void f0(l lVar) {
            this.f9839b = lVar;
        }

        public final a g(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f9863z = Wd.p.f("timeout", j10, unit);
            return this;
        }

        public final a g0(SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!Intrinsics.b(socketFactory, this.f9854q)) {
                this.f9836F = null;
            }
            this.f9854q = socketFactory;
            return this;
        }

        public final a h(l connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.f9839b = connectionPool;
            return this;
        }

        public final a h0(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.b(sslSocketFactory, this.f9855r) || !Intrinsics.b(trustManager, this.f9856s)) {
                this.f9836F = null;
            }
            this.f9855r = sslSocketFactory;
            this.f9861x = je.c.f35957a.a(trustManager);
            this.f9856s = trustManager;
            return this;
        }

        public final a i(List connectionSpecs) {
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!Intrinsics.b(connectionSpecs, this.f9857t)) {
                this.f9836F = null;
            }
            this.f9857t = Wd.p.w(connectionSpecs);
            return this;
        }

        public final a i0(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f9832B = Wd.p.f("timeout", j10, unit);
            return this;
        }

        public final a j(o cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.f9848k = cookieJar;
            return this;
        }

        public final a k(q dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f9838a = dispatcher;
            return this;
        }

        public final a l(r dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.b(dns, this.f9850m)) {
                this.f9836F = null;
            }
            this.f9850m = dns;
            return this;
        }

        public final a m(s eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.f9842e = Wd.p.c(eventListener);
            return this;
        }

        public final a n(s.c eventListenerFactory) {
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.f9842e = eventListenerFactory;
            return this;
        }

        public final a o(boolean z10) {
            this.f9844g = z10;
            return this;
        }

        public final a p(boolean z10) {
            this.f9846i = z10;
            return this;
        }

        public final a q(boolean z10) {
            this.f9847j = z10;
            return this;
        }

        public final InterfaceC1226b r() {
            return this.f9845h;
        }

        public final C1227c s() {
            return this.f9849l;
        }

        public final int t() {
            return this.f9862y;
        }

        public final je.c u() {
            return this.f9861x;
        }

        public final C1231g v() {
            return this.f9860w;
        }

        public final int w() {
            return this.f9863z;
        }

        public final l x() {
            return this.f9839b;
        }

        public final List y() {
            return this.f9857t;
        }

        public final o z() {
            return this.f9848k;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(B okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f9838a = okHttpClient.o();
            this.f9839b = okHttpClient.l();
            CollectionsKt.z(this.f9840c, okHttpClient.x());
            CollectionsKt.z(this.f9841d, okHttpClient.z());
            this.f9842e = okHttpClient.q();
            this.f9843f = okHttpClient.I();
            this.f9844g = okHttpClient.r();
            this.f9845h = okHttpClient.f();
            this.f9846i = okHttpClient.s();
            this.f9847j = okHttpClient.t();
            this.f9848k = okHttpClient.n();
            this.f9849l = okHttpClient.g();
            this.f9850m = okHttpClient.p();
            this.f9851n = okHttpClient.E();
            this.f9852o = okHttpClient.G();
            this.f9853p = okHttpClient.F();
            this.f9854q = okHttpClient.J();
            this.f9855r = okHttpClient.f9821q;
            this.f9856s = okHttpClient.O();
            this.f9857t = okHttpClient.m();
            this.f9858u = okHttpClient.D();
            this.f9859v = okHttpClient.w();
            this.f9860w = okHttpClient.j();
            this.f9861x = okHttpClient.i();
            this.f9862y = okHttpClient.h();
            this.f9863z = okHttpClient.k();
            this.f9831A = okHttpClient.H();
            this.f9832B = okHttpClient.N();
            this.f9833C = okHttpClient.C();
            this.f9834D = okHttpClient.M();
            this.f9835E = okHttpClient.y();
            this.f9836F = okHttpClient.u();
            this.f9837G = okHttpClient.v();
        }
    }

    public B() {
        this(new a());
    }
}
