package ae;

import Td.C1225a;
import Td.H;
import Td.w;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: i, reason: collision with root package name */
    public static final a f12880i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C1225a f12881a;

    /* renamed from: b, reason: collision with root package name */
    private final q f12882b;

    /* renamed from: c, reason: collision with root package name */
    private final d f12883c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12884d;

    /* renamed from: e, reason: collision with root package name */
    private List f12885e;

    /* renamed from: f, reason: collision with root package name */
    private int f12886f;

    /* renamed from: g, reason: collision with root package name */
    private List f12887g;

    /* renamed from: h, reason: collision with root package name */
    private final List f12888h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f12889a;

        /* renamed from: b, reason: collision with root package name */
        private int f12890b;

        public b(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f12889a = routes;
        }

        public final List a() {
            return this.f12889a;
        }

        public final boolean b() {
            return this.f12890b < this.f12889a.size();
        }

        public final H c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f12889a;
            int i10 = this.f12890b;
            this.f12890b = i10 + 1;
            return (H) list.get(i10);
        }
    }

    public s(C1225a address, q routeDatabase, d connectionUser, boolean z10) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        this.f12881a = address;
        this.f12882b = routeDatabase;
        this.f12883c = connectionUser;
        this.f12884d = z10;
        this.f12885e = CollectionsKt.j();
        this.f12887g = CollectionsKt.j();
        this.f12888h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f12886f < this.f12885e.size();
    }

    private final Proxy d() {
        if (b()) {
            List list = this.f12885e;
            int i10 = this.f12886f;
            this.f12886f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f12881a.l().h() + "; exhausted proxy configurations: " + this.f12885e);
    }

    private final void e(Proxy proxy) {
        String h10;
        int n10;
        List a10;
        ArrayList arrayList = new ArrayList();
        this.f12887g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            h10 = this.f12881a.l().h();
            n10 = this.f12881a.l().n();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
            a aVar = f12880i;
            Intrinsics.d(address);
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            h10 = aVar.a(inetSocketAddress);
            n10 = inetSocketAddress.getPort();
        }
        if (1 > n10 || n10 >= 65536) {
            throw new SocketException("No route to " + h10 + ':' + n10 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(h10, n10));
            return;
        }
        if (Wd.f.a(h10)) {
            a10 = CollectionsKt.e(InetAddress.getByName(h10));
        } else {
            this.f12883c.m(h10);
            a10 = this.f12881a.c().a(h10);
            if (a10.isEmpty()) {
                throw new UnknownHostException(this.f12881a.c() + " returned no addresses for " + h10);
            }
            this.f12883c.n(h10, a10);
        }
        if (this.f12884d) {
            a10 = j.a(a10);
        }
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), n10));
        }
    }

    private final void f(w wVar, Proxy proxy) {
        this.f12883c.v(wVar);
        List g10 = g(proxy, wVar, this);
        this.f12885e = g10;
        this.f12886f = 0;
        this.f12883c.h(wVar, g10);
    }

    private static final List g(Proxy proxy, w wVar, s sVar) {
        if (proxy != null) {
            return CollectionsKt.e(proxy);
        }
        URI v10 = wVar.v();
        if (v10.getHost() == null) {
            return Wd.p.k(Proxy.NO_PROXY);
        }
        List<Proxy> select = sVar.f12881a.i().select(v10);
        List<Proxy> list = select;
        if (list == null || list.isEmpty()) {
            return Wd.p.k(Proxy.NO_PROXY);
        }
        Intrinsics.d(select);
        return Wd.p.w(select);
    }

    public final boolean a() {
        return b() || !this.f12888h.isEmpty();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy d10 = d();
            Iterator it = this.f12887g.iterator();
            while (it.hasNext()) {
                H h10 = new H(this.f12881a, d10, (InetSocketAddress) it.next());
                if (this.f12882b.c(h10)) {
                    this.f12888h.add(h10);
                } else {
                    arrayList.add(h10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.z(arrayList, this.f12888h);
            this.f12888h.clear();
        }
        return new b(arrayList);
    }
}
