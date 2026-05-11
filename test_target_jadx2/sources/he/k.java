package he;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    private final a f34102a;

    /* renamed from: b, reason: collision with root package name */
    private l f34103b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        l b(SSLSocket sSLSocket);
    }

    public k(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f34102a = socketAdapterFactory;
    }

    private final synchronized l d(SSLSocket sSLSocket) {
        try {
            if (this.f34103b == null && this.f34102a.a(sSLSocket)) {
                this.f34103b = this.f34102a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f34103b;
    }

    @Override // he.l
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f34102a.a(sslSocket);
    }

    @Override // he.l
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        l d10 = d(sslSocket);
        if (d10 != null) {
            return d10.b(sslSocket);
        }
        return null;
    }

    @Override // he.l
    public void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        l d10 = d(sslSocket);
        if (d10 != null) {
            d10.c(sslSocket, str, protocols);
        }
    }

    @Override // he.l
    public boolean isSupported() {
        return true;
    }
}
