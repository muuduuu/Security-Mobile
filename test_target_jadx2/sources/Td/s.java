package Td;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10200a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final s f10201b = new a();

    public static final class a extends s {
        a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        s a(InterfaceC1229e interfaceC1229e);
    }

    public void A(InterfaceC1229e call, F response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void B(InterfaceC1229e call, u uVar) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void C(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void a(InterfaceC1229e call, F cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void b(InterfaceC1229e call, F response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void c(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void d(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void e(InterfaceC1229e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void f(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void g(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void h(InterfaceC1229e call, InetSocketAddress inetSocketAddress, Proxy proxy, C c10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void i(InterfaceC1229e call, InetSocketAddress inetSocketAddress, Proxy proxy, C c10, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void j(InterfaceC1229e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void k(InterfaceC1229e call, InterfaceC1234j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void l(InterfaceC1229e call, InterfaceC1234j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void m(InterfaceC1229e call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void n(InterfaceC1229e call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void o(InterfaceC1229e call, w url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void p(InterfaceC1229e call, w url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void q(InterfaceC1229e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void r(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void s(InterfaceC1229e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void t(InterfaceC1229e call, D request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void u(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void v(InterfaceC1229e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void w(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void x(InterfaceC1229e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void y(InterfaceC1229e call, F response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void z(InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
