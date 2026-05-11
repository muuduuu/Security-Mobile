package ge;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes3.dex */
public final class g extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final a f33767e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f33768f;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f33769d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b()) {
                return new g(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean b() {
            return g.f33768f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f33767e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f33768f = z10;
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // ge.n
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.e(sslSocket, str, protocols);
    }

    @Override // ge.n
    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return super.h(sslSocket);
    }

    @Override // ge.n
    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f33769d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @Override // ge.n
    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    private g() {
        this.f33769d = new BouncyCastleJsseProvider();
    }
}
