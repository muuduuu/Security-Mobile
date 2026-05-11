package ae;

import Td.AbstractC1235k;
import Td.C;
import Td.H;
import Td.InterfaceC1234j;
import Td.u;
import Td.w;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ae.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1395a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final k f12739a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1235k f12740b;

    /* renamed from: c, reason: collision with root package name */
    private final be.g f12741c;

    public C1395a(k call, AbstractC1235k poolConnectionListener, be.g chain) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(poolConnectionListener, "poolConnectionListener");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.f12739a = call;
        this.f12740b = poolConnectionListener;
        this.f12741c = chain;
    }

    private final Td.s y() {
        return this.f12739a.p();
    }

    @Override // ae.d
    public void a(InterfaceC1234j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        y().l(this.f12739a, connection);
    }

    @Override // ae.d
    public void b(InterfaceC1234j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        y().k(this.f12739a, connection);
    }

    @Override // ae.d
    public void c(H route) {
        Intrinsics.checkNotNullParameter(route, "route");
        y().j(this.f12739a, route.d(), route.b());
        this.f12740b.d(route, this.f12739a);
    }

    @Override // ae.d
    public void d(u uVar) {
        y().B(this.f12739a, uVar);
    }

    @Override // ae.d
    public boolean e() {
        return this.f12739a.e();
    }

    @Override // ae.d
    public boolean f() {
        return !Intrinsics.b(this.f12741c.i().i(), "GET");
    }

    @Override // ae.d
    public void g(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f12739a.d(connection);
    }

    @Override // ae.d
    public void h(w url, List proxies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        y().o(this.f12739a, url, proxies);
    }

    @Override // ae.d
    public void i(InterfaceC1234j connection, H route) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f12740b.b(connection, route, this.f12739a);
    }

    @Override // ae.d
    public void j(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.j().f(connection);
    }

    @Override // ae.d
    public void k(H route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f12739a.n().u().a(route);
    }

    @Override // ae.d
    public void l(H route, C c10, IOException e10) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(e10, "e");
        y().i(this.f12739a, route.d(), route.b(), null, e10);
        this.f12740b.c(route, this.f12739a, e10);
    }

    @Override // ae.d
    public void m(String socketHost) {
        Intrinsics.checkNotNullParameter(socketHost, "socketHost");
        y().n(this.f12739a, socketHost);
    }

    @Override // ae.d
    public void n(String socketHost, List result) {
        Intrinsics.checkNotNullParameter(socketHost, "socketHost");
        Intrinsics.checkNotNullParameter(result, "result");
        y().m(this.f12739a, socketHost, result);
    }

    @Override // ae.d
    public void o(H route, C c10) {
        Intrinsics.checkNotNullParameter(route, "route");
        y().h(this.f12739a, route.d(), route.b(), c10);
    }

    @Override // ae.d
    public void p(c connectPlan) {
        Intrinsics.checkNotNullParameter(connectPlan, "connectPlan");
        this.f12739a.w().add(connectPlan);
    }

    @Override // ae.d
    public void q() {
        y().C(this.f12739a);
    }

    @Override // ae.d
    public Socket r() {
        return this.f12739a.C();
    }

    @Override // ae.d
    public void s(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.j().h(connection);
    }

    @Override // ae.d
    public void t(c connectPlan) {
        Intrinsics.checkNotNullParameter(connectPlan, "connectPlan");
        this.f12739a.w().remove(connectPlan);
    }

    @Override // ae.d
    public l u() {
        return this.f12739a.o();
    }

    @Override // ae.d
    public void v(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        y().p(this.f12739a, url);
    }

    @Override // ae.d
    public void w(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.j().e(connection, this.f12739a);
    }

    @Override // ae.d
    public void x(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.j().g(connection, this.f12739a);
    }
}
