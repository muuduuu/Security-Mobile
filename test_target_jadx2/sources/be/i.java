package be;

import Td.D;
import Td.w;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f19071a = new i();

    private i() {
    }

    private final boolean b(D d10, Proxy.Type type) {
        return !d10.h() && type == Proxy.Type.HTTP;
    }

    public final String a(D request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.i());
        sb2.append(' ');
        i iVar = f19071a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.n());
        } else {
            sb2.append(iVar.c(request.n()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String c(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String c10 = url.c();
        String e10 = url.e();
        if (e10 == null) {
            return c10;
        }
        return c10 + '?' + e10;
    }
}
