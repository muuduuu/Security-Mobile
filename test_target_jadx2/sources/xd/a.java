package Xd;

import Td.C1225a;
import Td.C1232h;
import Td.D;
import Td.F;
import Td.H;
import Td.InterfaceC1226b;
import Td.p;
import Td.r;
import Td.w;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class a implements InterfaceC1226b {

    /* renamed from: d, reason: collision with root package name */
    private final r f11879d;

    /* renamed from: Xd.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0222a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11880a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11880a = iArr;
        }
    }

    public a(r defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f11879d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, w wVar, r rVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0222a.f11880a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.d0(rVar.a(wVar.h()));
        }
        SocketAddress address = proxy.address();
        Intrinsics.e(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        Intrinsics.checkNotNullExpressionValue(address2, "getAddress(...)");
        return address2;
    }

    @Override // Td.InterfaceC1226b
    public D a(H h10, F response) {
        Proxy proxy;
        r rVar;
        PasswordAuthentication requestPasswordAuthentication;
        C1225a a10;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C1232h> e10 = response.e();
        D z10 = response.z();
        w n10 = z10.n();
        boolean z11 = response.f() == 407;
        if (h10 == null || (proxy = h10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C1232h c1232h : e10) {
            if (StringsKt.r("Basic", c1232h.d(), true)) {
                if (h10 == null || (a10 = h10.a()) == null || (rVar = a10.c()) == null) {
                    rVar = this.f11879d;
                }
                if (z11) {
                    SocketAddress address = proxy.address();
                    Intrinsics.e(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.d(proxy);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, n10, rVar), inetSocketAddress.getPort(), n10.u(), c1232h.c(), c1232h.d(), n10.w(), Authenticator.RequestorType.PROXY);
                } else {
                    String h11 = n10.h();
                    Intrinsics.d(proxy);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(h11, b(proxy, n10, rVar), n10.n(), n10.u(), c1232h.c(), c1232h.d(), n10.w(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z11 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "getUserName(...)");
                    char[] password = requestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "getPassword(...)");
                    return z10.j().l(str, p.a(userName, new String(password), c1232h.b())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? r.f10198b : rVar);
    }
}
