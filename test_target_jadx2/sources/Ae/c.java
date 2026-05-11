package ae;

import Td.C;
import Td.C1225a;
import Td.C1231g;
import Td.D;
import Td.F;
import Td.H;
import Td.u;
import ae.r;
import be.d;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.M;
import pe.c0;

/* loaded from: classes3.dex */
public final class c implements r.b, d.a {

    /* renamed from: y, reason: collision with root package name */
    public static final a f12743y = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Zd.d f12744a;

    /* renamed from: b, reason: collision with root package name */
    private final m f12745b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12746c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12747d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12748e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12749f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12750g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12751h;

    /* renamed from: i, reason: collision with root package name */
    private final ae.d f12752i;

    /* renamed from: j, reason: collision with root package name */
    private final n f12753j;

    /* renamed from: k, reason: collision with root package name */
    private final H f12754k;

    /* renamed from: l, reason: collision with root package name */
    private final List f12755l;

    /* renamed from: m, reason: collision with root package name */
    private final int f12756m;

    /* renamed from: n, reason: collision with root package name */
    private final D f12757n;

    /* renamed from: o, reason: collision with root package name */
    private final int f12758o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f12759p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f12760q;

    /* renamed from: r, reason: collision with root package name */
    private Socket f12761r;

    /* renamed from: s, reason: collision with root package name */
    private Socket f12762s;

    /* renamed from: t, reason: collision with root package name */
    private u f12763t;

    /* renamed from: u, reason: collision with root package name */
    private C f12764u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC3879g f12765v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC3878f f12766w;

    /* renamed from: x, reason: collision with root package name */
    private l f12767x;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12768a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12768a = iArr;
        }
    }

    /* renamed from: ae.c$c, reason: collision with other inner class name */
    static final class C0238c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f12769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0238c(u uVar) {
            super(0);
            this.f12769a = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> d10 = this.f12769a.d();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(d10, 10));
            for (Certificate certificate : d10) {
                Intrinsics.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    static final class d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1231g f12770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f12771b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1225a f12772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1231g c1231g, u uVar, C1225a c1225a) {
            super(0);
            this.f12770a = c1231g;
            this.f12771b = uVar;
            this.f12772c = c1225a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            je.c d10 = this.f12770a.d();
            Intrinsics.d(d10);
            return d10.a(this.f12771b.d(), this.f12772c.l().h());
        }
    }

    public c(Zd.d taskRunner, m connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, ae.d user, n routePlanner, H route, List list, int i15, D d10, int i16, boolean z11) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f12744a = taskRunner;
        this.f12745b = connectionPool;
        this.f12746c = i10;
        this.f12747d = i11;
        this.f12748e = i12;
        this.f12749f = i13;
        this.f12750g = i14;
        this.f12751h = z10;
        this.f12752i = user;
        this.f12753j = routePlanner;
        this.f12754k = route;
        this.f12755l = list;
        this.f12756m = i15;
        this.f12757n = d10;
        this.f12758o = i16;
        this.f12759p = z11;
    }

    private final void j() {
        Socket createSocket;
        Proxy.Type type = h().b().type();
        int i10 = type == null ? -1 : b.f12768a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            createSocket = h().a().j().createSocket();
            Intrinsics.d(createSocket);
        } else {
            createSocket = new Socket(h().b());
        }
        this.f12761r = createSocket;
        if (this.f12760q) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f12749f);
        try {
            ge.n.f33789a.g().f(createSocket, h().d(), this.f12748e);
            try {
                this.f12765v = M.c(M.l(createSocket));
                this.f12766w = M.b(M.h(createSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + h().d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void k(SSLSocket sSLSocket, Td.m mVar) {
        C1225a a10 = h().a();
        try {
            if (mVar.h()) {
                ge.n.f33789a.g().e(sSLSocket, a10.l().h(), a10.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            u.a aVar = u.f10209e;
            Intrinsics.d(session);
            u b10 = aVar.b(session);
            HostnameVerifier e10 = a10.e();
            Intrinsics.d(e10);
            if (e10.verify(a10.l().h(), session)) {
                C1231g a11 = a10.a();
                Intrinsics.d(a11);
                u uVar = new u(b10.e(), b10.a(), b10.c(), new d(a11, b10, a10));
                this.f12763t = uVar;
                a11.b(a10.l().h(), new C0238c(uVar));
                String h10 = mVar.h() ? ge.n.f33789a.g().h(sSLSocket) : null;
                this.f12762s = sSLSocket;
                this.f12765v = M.c(M.l(sSLSocket));
                this.f12766w = M.b(M.h(sSLSocket));
                this.f12764u = h10 != null ? C.Companion.a(h10) : C.HTTP_1_1;
                ge.n.f33789a.g().b(sSLSocket);
                return;
            }
            List d10 = b10.d();
            if (d10.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + a10.l().h() + " not verified (no certificates)");
            }
            Object obj = d10.get(0);
            Intrinsics.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(StringsKt.h("\n            |Hostname " + a10.l().h() + " not verified:\n            |    certificate: " + C1231g.f9998c.a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + je.d.f35958a.a(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th) {
            ge.n.f33789a.g().b(sSLSocket);
            Wd.p.g(sSLSocket);
            throw th;
        }
    }

    private final c m(int i10, D d10, int i11, boolean z10) {
        return new c(this.f12744a, this.f12745b, this.f12746c, this.f12747d, this.f12748e, this.f12749f, this.f12750g, this.f12751h, this.f12752i, this.f12753j, h(), this.f12755l, i10, d10, i11, z10);
    }

    static /* synthetic */ c n(c cVar, int i10, D d10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = cVar.f12756m;
        }
        if ((i12 & 2) != 0) {
            d10 = cVar.f12757n;
        }
        if ((i12 & 4) != 0) {
            i11 = cVar.f12758o;
        }
        if ((i12 & 8) != 0) {
            z10 = cVar.f12759p;
        }
        return cVar.m(i10, d10, i11, z10);
    }

    private final D o() {
        D d10 = this.f12757n;
        Intrinsics.d(d10);
        String str = "CONNECT " + Wd.p.u(h().a().l(), true) + " HTTP/1.1";
        while (true) {
            InterfaceC3879g interfaceC3879g = this.f12765v;
            Intrinsics.d(interfaceC3879g);
            InterfaceC3878f interfaceC3878f = this.f12766w;
            Intrinsics.d(interfaceC3878f);
            ce.b bVar = new ce.b(null, this, interfaceC3879g, interfaceC3878f);
            c0 A10 = interfaceC3879g.A();
            long j10 = this.f12746c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            A10.g(j10, timeUnit);
            interfaceC3878f.A().g(this.f12747d, timeUnit);
            bVar.B(d10.f(), str);
            bVar.c();
            F.a g10 = bVar.g(false);
            Intrinsics.d(g10);
            F c10 = g10.r(d10).c();
            bVar.A(c10);
            int f10 = c10.f();
            if (f10 == 200) {
                return null;
            }
            if (f10 != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c10.f());
            }
            D a10 = h().a().h().a(h(), c10);
            if (a10 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.r("close", F.o(c10, "Connection", null, 2, null), true)) {
                return a10;
            }
            d10 = a10;
        }
    }

    @Override // ae.r.b
    public r.b a() {
        return new c(this.f12744a, this.f12745b, this.f12746c, this.f12747d, this.f12748e, this.f12749f, this.f12750g, this.f12751h, this.f12752i, this.f12753j, h(), this.f12755l, this.f12756m, this.f12757n, this.f12758o, this.f12759p);
    }

    @Override // be.d.a
    public void b(k call, IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    @Override // ae.r.b
    public l c() {
        this.f12752i.k(h());
        l lVar = this.f12767x;
        Intrinsics.d(lVar);
        this.f12752i.i(lVar, h());
        p m10 = this.f12753j.m(this, this.f12755l);
        if (m10 != null) {
            return m10.i();
        }
        synchronized (lVar) {
            this.f12745b.g(lVar);
            this.f12752i.g(lVar);
            Unit unit = Unit.f36324a;
        }
        this.f12752i.b(lVar);
        this.f12752i.w(lVar);
        return lVar;
    }

    @Override // ae.r.b, be.d.a
    public void cancel() {
        this.f12760q = true;
        Socket socket = this.f12761r;
        if (socket != null) {
            Wd.p.g(socket);
        }
    }

    @Override // ae.r.b
    public boolean d() {
        return this.f12764u != null;
    }

    @Override // ae.r.b
    public r.a e() {
        Socket socket;
        Socket socket2;
        if (this.f12761r != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.f12752i.p(this);
        boolean z10 = false;
        try {
            try {
                this.f12752i.c(h());
                j();
                z10 = true;
                r.a aVar = new r.a(this, null, null, 6, null);
                this.f12752i.t(this);
                return aVar;
            } catch (IOException e10) {
                this.f12752i.l(h(), null, e10);
                r.a aVar2 = new r.a(this, null, e10, 2, null);
                this.f12752i.t(this);
                if (!z10 && (socket2 = this.f12761r) != null) {
                    Wd.p.g(socket2);
                }
                return aVar2;
            }
        } catch (Throwable th) {
            this.f12752i.t(this);
            if (!z10 && (socket = this.f12761r) != null) {
                Wd.p.g(socket);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0171 A[Catch: all -> 0x017a, TryCatch #4 {all -> 0x017a, blocks: (B:53:0x0164, B:55:0x0171, B:59:0x017c), top: B:52:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    @Override // ae.r.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r.a g() {
        boolean z10;
        c cVar;
        c cVar2;
        InterfaceC3878f interfaceC3878f;
        C3877e m10;
        C3877e m11;
        if (this.f12761r == null) {
            throw new IllegalStateException("TCP not connected");
        }
        if (d()) {
            throw new IllegalStateException("already connected");
        }
        List b10 = h().a().b();
        this.f12752i.p(this);
        c cVar3 = null;
        try {
            try {
                if (this.f12757n != null) {
                    r.a l10 = l();
                    if (l10.c() != null || l10.e() != null) {
                        this.f12752i.t(this);
                        Socket socket = this.f12762s;
                        if (socket != null) {
                            Wd.p.g(socket);
                        }
                        Socket socket2 = this.f12761r;
                        if (socket2 != null) {
                            Wd.p.g(socket2);
                        }
                        return l10;
                    }
                }
                if (h().a().k() != null) {
                    InterfaceC3879g interfaceC3879g = this.f12765v;
                    if ((interfaceC3879g != null && (m11 = interfaceC3879g.m()) != null && !m11.p0()) || ((interfaceC3878f = this.f12766w) != null && (m10 = interfaceC3878f.m()) != null && !m10.p0())) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    this.f12752i.q();
                    Socket createSocket = h().a().k().createSocket(this.f12761r, h().a().l().h(), h().a().l().n(), true);
                    Intrinsics.e(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                    SSLSocket sSLSocket = (SSLSocket) createSocket;
                    c r10 = r(b10, sSLSocket);
                    Td.m mVar = (Td.m) b10.get(r10.f12758o);
                    cVar = r10.q(b10, sSLSocket);
                    try {
                        mVar.b(sSLSocket, r10.f12759p);
                        k(sSLSocket, mVar);
                        this.f12752i.d(this.f12763t);
                        cVar2 = cVar;
                    } catch (IOException e10) {
                        e = e10;
                        z10 = false;
                        try {
                            this.f12752i.l(h(), null, e);
                            if (this.f12751h && o.a(e)) {
                                cVar3 = cVar;
                            }
                            r.a aVar = new r.a(this, cVar3, e);
                            this.f12752i.t(this);
                            if (!z10) {
                                Socket socket3 = this.f12762s;
                                if (socket3 != null) {
                                    Wd.p.g(socket3);
                                }
                                Socket socket4 = this.f12761r;
                                if (socket4 != null) {
                                    Wd.p.g(socket4);
                                }
                            }
                            return aVar;
                        } catch (Throwable th) {
                            th = th;
                            this.f12752i.t(this);
                            if (!z10) {
                                Socket socket5 = this.f12762s;
                                if (socket5 != null) {
                                    Wd.p.g(socket5);
                                }
                                Socket socket6 = this.f12761r;
                                if (socket6 != null) {
                                    Wd.p.g(socket6);
                                }
                            }
                            throw th;
                        }
                    }
                } else {
                    this.f12762s = this.f12761r;
                    List f10 = h().a().f();
                    C c10 = C.H2_PRIOR_KNOWLEDGE;
                    if (!f10.contains(c10)) {
                        c10 = C.HTTP_1_1;
                    }
                    this.f12764u = c10;
                    cVar2 = null;
                }
            } catch (IOException e11) {
                e = e11;
                cVar = null;
            }
            try {
                l lVar = new l(this.f12744a, this.f12745b, h(), this.f12761r, this.f12762s, this.f12763t, this.f12764u, this.f12765v, this.f12766w, this.f12750g, this.f12745b.d());
                this.f12767x = lVar;
                lVar.A();
                this.f12752i.o(h(), this.f12764u);
            } catch (IOException e12) {
                e = e12;
                cVar = cVar2;
                z10 = false;
                this.f12752i.l(h(), null, e);
                if (this.f12751h) {
                    cVar3 = cVar;
                }
                r.a aVar2 = new r.a(this, cVar3, e);
                this.f12752i.t(this);
                if (!z10) {
                }
                return aVar2;
            }
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
        }
        try {
            r.a aVar3 = new r.a(this, null, null, 6, null);
            this.f12752i.t(this);
            return aVar3;
        } catch (IOException e13) {
            e = e13;
            z10 = true;
            cVar = cVar2;
            this.f12752i.l(h(), null, e);
            if (this.f12751h) {
            }
            r.a aVar22 = new r.a(this, cVar3, e);
            this.f12752i.t(this);
            if (!z10) {
            }
            return aVar22;
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
            this.f12752i.t(this);
            if (!z10) {
            }
            throw th;
        }
    }

    @Override // be.d.a
    public H h() {
        return this.f12754k;
    }

    public final void i() {
        Socket socket = this.f12762s;
        if (socket != null) {
            Wd.p.g(socket);
        }
    }

    public final r.a l() {
        D o10 = o();
        if (o10 == null) {
            return new r.a(this, null, null, 6, null);
        }
        Socket socket = this.f12761r;
        if (socket != null) {
            Wd.p.g(socket);
        }
        int i10 = this.f12756m + 1;
        if (i10 < 21) {
            this.f12752i.o(h(), null);
            return new r.a(this, n(this, i10, o10, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f12752i.l(h(), null, protocolException);
        return new r.a(this, null, protocolException, 2, null);
    }

    public final List p() {
        return this.f12755l;
    }

    public final c q(List connectionSpecs, SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f12758o + 1;
        int size = connectionSpecs.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (((Td.m) connectionSpecs.get(i11)).e(sslSocket)) {
                return n(this, 0, null, i11, this.f12758o != -1, 3, null);
            }
        }
        return null;
    }

    public final c r(List connectionSpecs, SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f12758o != -1) {
            return this;
        }
        c q10 = q(connectionSpecs, sslSocket);
        if (q10 != null) {
            return q10;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f12759p);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.d(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // be.d.a
    public void f() {
    }
}
