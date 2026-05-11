package ge;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final a f33759e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f33760f;

    /* renamed from: d, reason: collision with root package name */
    private final List f33761d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a() {
            if (b()) {
                return new e();
            }
            return null;
        }

        public final boolean b() {
            return e.f33760f;
        }

        private a() {
        }
    }

    static {
        f33760f = n.f33789a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public e() {
        List o10 = CollectionsKt.o(he.c.f34082a.a(), new he.k(he.h.f34090f.d()), new he.k(he.j.f34100a.a()), new he.k(he.i.f34098a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : o10) {
            if (((he.l) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f33761d = arrayList;
    }

    @Override // ge.n
    public je.c c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        he.d a10 = he.d.f34083d.a(trustManager);
        return a10 != null ? a10 : super.c(trustManager);
    }

    @Override // ge.n
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f33761d.iterator();
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
    public String h(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f33761d.iterator();
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
    public Object i(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.i(closer);
        }
        CloseGuard a10 = d.a();
        a10.open(closer);
        return a10;
    }

    @Override // ge.n
    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // ge.n
    public void m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.m(message, obj);
        } else {
            Intrinsics.e(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            b.a(obj).warnIfOpen();
        }
    }
}
