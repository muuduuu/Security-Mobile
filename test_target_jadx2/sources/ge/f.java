package ge;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import he.m;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final a f33762e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f33763f;

    /* renamed from: d, reason: collision with root package name */
    private final List f33764d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a() {
            if (b()) {
                return new f();
            }
            return null;
        }

        public final boolean b() {
            return f.f33763f;
        }

        private a() {
        }
    }

    public static final class b implements je.e {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f33765a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f33766b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f33765a = trustManager;
            this.f33766b = findByIssuerAndSignatureMethod;
        }

        @Override // je.e
        public X509Certificate a(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object invoke = this.f33766b.invoke(this.f33765a, cert);
                Intrinsics.e(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f33765a, bVar.f33765a) && Intrinsics.b(this.f33766b, bVar.f33766b);
        }

        public int hashCode() {
            return (this.f33765a.hashCode() * 31) + this.f33766b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f33765a + ", findByIssuerAndSignatureMethod=" + this.f33766b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (n.f33789a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f33763f = z10;
    }

    public f() {
        List o10 = CollectionsKt.o(m.a.b(he.m.f34104j, null, 1, null), new he.k(he.h.f34090f.d()), new he.k(he.j.f34100a.a()), new he.k(he.i.f34098a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : o10) {
            if (((he.l) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f33764d = arrayList;
    }

    @Override // ge.n
    public je.c c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        he.d a10 = he.d.f34083d.a(trustManager);
        return a10 != null ? a10 : super.c(trustManager);
    }

    @Override // ge.n
    public je.e d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            Intrinsics.d(declaredMethod);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // ge.n
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f33764d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((he.l) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        he.l lVar = (he.l) obj;
        if (lVar != null) {
            lVar.c(sslSocket, str, protocols);
        }
    }

    @Override // ge.n
    public void f(Socket socket, InetSocketAddress address, int i10) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // ge.n
    public String h(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f33764d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((he.l) obj).a(sslSocket)) {
                break;
            }
        }
        he.l lVar = (he.l) obj;
        if (lVar != null) {
            return lVar.b(sslSocket);
        }
        return null;
    }

    @Override // ge.n
    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
