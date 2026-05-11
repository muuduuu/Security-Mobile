package ae;

import Td.C;
import Td.C1225a;
import Td.D;
import Td.F;
import Td.H;
import Td.w;
import ae.r;
import ae.s;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.collections.C3573h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Zd.d f12858a;

    /* renamed from: b, reason: collision with root package name */
    private final m f12859b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12860c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12861d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12862e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12863f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12864g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12865h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f12866i;

    /* renamed from: j, reason: collision with root package name */
    private final C1225a f12867j;

    /* renamed from: k, reason: collision with root package name */
    private final q f12868k;

    /* renamed from: l, reason: collision with root package name */
    private final d f12869l;

    /* renamed from: m, reason: collision with root package name */
    private s.b f12870m;

    /* renamed from: n, reason: collision with root package name */
    private s f12871n;

    /* renamed from: o, reason: collision with root package name */
    private H f12872o;

    /* renamed from: p, reason: collision with root package name */
    private final C3573h f12873p;

    public n(Zd.d taskRunner, m connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, C1225a address, q routeDatabase, d connectionUser) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        this.f12858a = taskRunner;
        this.f12859b = connectionPool;
        this.f12860c = i10;
        this.f12861d = i11;
        this.f12862e = i12;
        this.f12863f = i13;
        this.f12864g = i14;
        this.f12865h = z10;
        this.f12866i = z11;
        this.f12867j = address;
        this.f12868k = routeDatabase;
        this.f12869l = connectionUser;
        this.f12873p = new C3573h();
    }

    private final D h(H h10) {
        D b10 = new D.a().w(h10.a().l()).n("CONNECT", null).l("Host", Wd.p.u(h10.a().l(), true)).l("Proxy-Connection", "Keep-Alive").l("User-Agent", "okhttp/5.0.0-alpha.14").b();
        D a10 = h10.a().h().a(h10, new F.a().r(b10).o(C.HTTP_1_1).e(407).l("Preemptive Authenticate").s(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 == null ? b10 : a10;
    }

    public static /* synthetic */ c k(n nVar, H h10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return nVar.j(h10, list);
    }

    private final p l() {
        Socket r10;
        boolean z10;
        l u10 = this.f12869l.u();
        if (u10 == null) {
            return null;
        }
        boolean q10 = u10.q(this.f12869l.f());
        synchronized (u10) {
            try {
                if (q10) {
                    if (!u10.l() && c(u10.v().a().l())) {
                        z10 = false;
                        r10 = null;
                    }
                    r10 = this.f12869l.r();
                    z10 = false;
                } else {
                    z10 = !u10.l();
                    u10.y(true);
                    r10 = this.f12869l.r();
                }
            } finally {
            }
        }
        if (this.f12869l.u() != null) {
            if (r10 == null) {
                return new p(u10);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (r10 != null) {
            Wd.p.g(r10);
        }
        this.f12869l.a(u10);
        this.f12869l.x(u10);
        if (r10 != null) {
            this.f12869l.j(u10);
        } else if (z10) {
            this.f12869l.s(u10);
        }
        return null;
    }

    public static /* synthetic */ p n(n nVar, c cVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return nVar.m(cVar, list);
    }

    private final H o(l lVar) {
        H h10;
        synchronized (lVar) {
            h10 = null;
            if (lVar.m() == 0 && lVar.l() && Wd.p.e(lVar.v().a().l(), b().l())) {
                h10 = lVar.v();
            }
        }
        return h10;
    }

    @Override // ae.r
    public C1225a b() {
        return this.f12867j;
    }

    @Override // ae.r
    public boolean c(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        w l10 = b().l();
        return url.n() == l10.n() && Intrinsics.b(url.h(), l10.h());
    }

    @Override // ae.r
    public boolean d(l lVar) {
        s sVar;
        H o10;
        if (!f().isEmpty() || this.f12872o != null) {
            return true;
        }
        if (lVar != null && (o10 = o(lVar)) != null) {
            this.f12872o = o10;
            return true;
        }
        s.b bVar = this.f12870m;
        if ((bVar == null || !bVar.b()) && (sVar = this.f12871n) != null) {
            return sVar.a();
        }
        return true;
    }

    @Override // ae.r
    public boolean e() {
        return this.f12869l.e();
    }

    @Override // ae.r
    public C3573h f() {
        return this.f12873p;
    }

    @Override // ae.r
    public r.b g() {
        p l10 = l();
        if (l10 != null) {
            return l10;
        }
        p n10 = n(this, null, null, 3, null);
        if (n10 != null) {
            return n10;
        }
        if (!f().isEmpty()) {
            return (r.b) f().removeFirst();
        }
        c i10 = i();
        p m10 = m(i10, i10.p());
        return m10 != null ? m10 : i10;
    }

    public final c i() {
        H h10 = this.f12872o;
        if (h10 != null) {
            this.f12872o = null;
            return k(this, h10, null, 2, null);
        }
        s.b bVar = this.f12870m;
        if (bVar != null && bVar.b()) {
            return k(this, bVar.c(), null, 2, null);
        }
        s sVar = this.f12871n;
        if (sVar == null) {
            sVar = new s(b(), this.f12868k, this.f12869l, this.f12866i);
            this.f12871n = sVar;
        }
        if (!sVar.a()) {
            throw new IOException("exhausted all routes");
        }
        s.b c10 = sVar.c();
        this.f12870m = c10;
        if (e()) {
            throw new IOException("Canceled");
        }
        return j(c10.c(), c10.a());
    }

    public final c j(H route, List list) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (route.a().k() == null) {
            if (!route.a().b().contains(Td.m.f10152k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String h10 = route.a().l().h();
            if (!ge.n.f33789a.g().j(h10)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + h10 + " not permitted by network security policy");
            }
        } else if (route.a().f().contains(C.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new c(this.f12858a, this.f12859b, this.f12860c, this.f12861d, this.f12862e, this.f12863f, this.f12864g, this.f12865h, this.f12869l, this, route, list, 0, route.c() ? h(route) : null, -1, false);
    }

    public final p m(c cVar, List list) {
        l a10 = this.f12859b.a(this.f12869l.f(), b(), this.f12869l, list, cVar != null && cVar.d());
        if (a10 == null) {
            return null;
        }
        if (cVar != null) {
            this.f12872o = cVar.h();
            cVar.i();
        }
        this.f12869l.b(a10);
        this.f12869l.w(a10);
        return new p(a10);
    }
}
