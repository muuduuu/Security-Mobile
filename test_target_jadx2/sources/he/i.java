package he;

import ge.n;
import he.k;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final b f34098a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final k.a f34099b = new a();

    public static final class a implements k.a {
        a() {
        }

        @Override // he.k.a
        public boolean a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            ge.g.f33767e.b();
            return false;
        }

        @Override // he.k.a
        public l b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k.a a() {
            return i.f34099b;
        }

        private b() {
        }
    }

    @Override // he.l
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // he.l
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.b(applicationProtocol, BuildConfig.FLAVOR)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // he.l
    public void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) n.f33789a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // he.l
    public boolean isSupported() {
        return ge.g.f33767e.b();
    }
}
