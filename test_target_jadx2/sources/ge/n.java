package ge;

import Td.B;
import Td.C;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33789a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile n f33790b;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f33791c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final n d() {
            he.e.f34086a.b();
            n a10 = e.f33759e.a();
            if (a10 != null) {
                return a10;
            }
            n a11 = f.f33762e.a();
            Intrinsics.d(a11);
            return a11;
        }

        private final n e() {
            m a10;
            g a11;
            h b10;
            if (j() && (b10 = h.f33770e.b()) != null) {
                return b10;
            }
            if (i() && (a11 = g.f33767e.a()) != null) {
                return a11;
            }
            if (k() && (a10 = m.f33786e.a()) != null) {
                return a10;
            }
            l a12 = l.f33783d.a();
            if (a12 != null) {
                return a12;
            }
            n a13 = i.f33774i.a();
            return a13 != null ? a13 : new n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return Intrinsics.b("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return Intrinsics.b("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return Intrinsics.b("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((C) obj) != C.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            C3877e c3877e = new C3877e();
            for (String str : b(protocols)) {
                c3877e.q0(str.length());
                c3877e.T0(str);
            }
            return c3877e.n0();
        }

        public final n g() {
            return n.f33790b;
        }

        public final boolean h() {
            return Intrinsics.b("Dalvik", System.getProperty("java.vm.name"));
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f33789a = aVar;
        f33790b = aVar.f();
        f33791c = Logger.getLogger(B.class.getName());
    }

    public static /* synthetic */ void l(n nVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        nVar.k(str, i10, th);
    }

    public void b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public je.c c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new je.a(d(trustManager));
    }

    public je.e d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return new je.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f33791c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void k(String message, int i10, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f33791c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext n10 = n();
            n10.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = n10.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
