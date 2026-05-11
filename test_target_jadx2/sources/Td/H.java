package Td;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final C1225a f9924a;

    /* renamed from: b, reason: collision with root package name */
    private final Proxy f9925b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f9926c;

    public H(C1225a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f9924a = address;
        this.f9925b = proxy;
        this.f9926c = socketAddress;
    }

    public final C1225a a() {
        return this.f9924a;
    }

    public final Proxy b() {
        return this.f9925b;
    }

    public final boolean c() {
        if (this.f9925b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f9924a.k() != null || this.f9924a.f().contains(C.H2_PRIOR_KNOWLEDGE);
    }

    public final InetSocketAddress d() {
        return this.f9926c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof H) {
            H h10 = (H) obj;
            if (Intrinsics.b(h10.f9924a, this.f9924a) && Intrinsics.b(h10.f9925b, this.f9925b) && Intrinsics.b(h10.f9926c, this.f9926c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f9924a.hashCode()) * 31) + this.f9925b.hashCode()) * 31) + this.f9926c.hashCode();
    }

    public String toString() {
        String str;
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String h10 = this.f9924a.l().h();
        InetAddress address = this.f9926c.getAddress();
        if (address == null || (hostAddress = address.getHostAddress()) == null) {
            str = null;
        } else {
            Intrinsics.d(hostAddress);
            str = Wd.f.k(hostAddress);
        }
        if (StringsKt.J(h10, ':', false, 2, null)) {
            sb2.append("[");
            sb2.append(h10);
            sb2.append("]");
        } else {
            sb2.append(h10);
        }
        if (this.f9924a.l().n() != this.f9926c.getPort() || Intrinsics.b(h10, str)) {
            sb2.append(":");
            sb2.append(this.f9924a.l().n());
        }
        if (!Intrinsics.b(h10, str)) {
            if (Intrinsics.b(this.f9925b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (str == null) {
                sb2.append("<unresolved>");
            } else if (StringsKt.J(str, ':', false, 2, null)) {
                sb2.append("[");
                sb2.append(str);
                sb2.append("]");
            } else {
                sb2.append(str);
            }
            sb2.append(":");
            sb2.append(this.f9926c.getPort());
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
