package he;

import ge.n;
import he.k;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final b f34100a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final k.a f34101b = new a();

    public static final class a implements k.a {
        a() {
        }

        @Override // he.k.a
        public boolean a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return ge.h.f33770e.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // he.k.a
        public l b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new j();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k.a a() {
            return j.f34101b;
        }

        private b() {
        }
    }

    @Override // he.l
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // he.l
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // he.l
    public void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) n.f33789a.b(protocols).toArray(new String[0]));
        }
    }

    @Override // he.l
    public boolean isSupported() {
        return ge.h.f33770e.c();
    }
}
