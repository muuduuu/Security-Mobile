package Td;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.AbstractC3728a;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final b f10146e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final List f10147f;

    /* renamed from: g, reason: collision with root package name */
    private static final List f10148g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f10149h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f10150i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f10151j;

    /* renamed from: k, reason: collision with root package name */
    public static final m f10152k;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f10153a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10154b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f10155c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f10156d;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        C1233i c1233i = C1233i.f10106o1;
        C1233i c1233i2 = C1233i.f10109p1;
        C1233i c1233i3 = C1233i.f10112q1;
        C1233i c1233i4 = C1233i.f10064a1;
        C1233i c1233i5 = C1233i.f10076e1;
        C1233i c1233i6 = C1233i.f10067b1;
        C1233i c1233i7 = C1233i.f10079f1;
        C1233i c1233i8 = C1233i.f10097l1;
        C1233i c1233i9 = C1233i.f10094k1;
        List m10 = CollectionsKt.m(c1233i, c1233i2, c1233i3, c1233i4, c1233i5, c1233i6, c1233i7, c1233i8, c1233i9);
        f10147f = m10;
        List m11 = CollectionsKt.m(c1233i, c1233i2, c1233i3, c1233i4, c1233i5, c1233i6, c1233i7, c1233i8, c1233i9, C1233i.f10034L0, C1233i.f10036M0, C1233i.f10090j0, C1233i.f10093k0, C1233i.f10025H, C1233i.f10033L, C1233i.f10095l);
        f10148g = m11;
        a aVar = new a(true);
        C1233i[] c1233iArr = (C1233i[]) m10.toArray(new C1233i[0]);
        a b10 = aVar.b((C1233i[]) Arrays.copyOf(c1233iArr, c1233iArr.length));
        I i10 = I.TLS_1_3;
        I i11 = I.TLS_1_2;
        f10149h = b10.e(i10, i11).d(true).a();
        a aVar2 = new a(true);
        C1233i[] c1233iArr2 = (C1233i[]) m11.toArray(new C1233i[0]);
        f10150i = aVar2.b((C1233i[]) Arrays.copyOf(c1233iArr2, c1233iArr2.length)).e(i10, i11).d(true).a();
        a aVar3 = new a(true);
        C1233i[] c1233iArr3 = (C1233i[]) m11.toArray(new C1233i[0]);
        f10151j = aVar3.b((C1233i[]) Arrays.copyOf(c1233iArr3, c1233iArr3.length)).e(i10, i11, I.TLS_1_1, I.TLS_1_0).d(true).a();
        f10152k = new a(false).a();
    }

    public m(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f10153a = z10;
        this.f10154b = z11;
        this.f10155c = strArr;
        this.f10156d = strArr2;
    }

    private final m g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        Intrinsics.d(enabledCipherSuites);
        String[] d10 = Wd.a.d(this, enabledCipherSuites);
        if (this.f10156d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = Wd.m.z(enabledProtocols2, this.f10156d, AbstractC3728a.b());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.d(supportedCipherSuites);
        int r10 = Wd.m.r(supportedCipherSuites, "TLS_FALLBACK_SCSV", C1233i.f10065b.c());
        if (z10 && r10 != -1) {
            String str = supportedCipherSuites[r10];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            d10 = Wd.m.g(d10, str);
        }
        a c10 = new a(this).c((String[]) Arrays.copyOf(d10, d10.length));
        Intrinsics.d(enabledProtocols);
        return c10.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void b(SSLSocket sslSocket, boolean z10) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m g10 = g(sslSocket, z10);
        if (g10.i() != null) {
            sslSocket.setEnabledProtocols(g10.f10156d);
        }
        if (g10.c() != null) {
            sslSocket.setEnabledCipherSuites(g10.f10155c);
        }
    }

    public final List c() {
        String[] strArr = this.f10155c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1233i.f10065b.b(str));
        }
        return arrayList;
    }

    public final String[] d() {
        return this.f10155c;
    }

    public final boolean e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f10153a) {
            return false;
        }
        String[] strArr = this.f10156d;
        if (strArr != null && !Wd.m.q(strArr, socket.getEnabledProtocols(), AbstractC3728a.b())) {
            return false;
        }
        String[] strArr2 = this.f10155c;
        return strArr2 == null || Wd.m.q(strArr2, socket.getEnabledCipherSuites(), C1233i.f10065b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f10153a;
        m mVar = (m) obj;
        if (z10 != mVar.f10153a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f10155c, mVar.f10155c) && Arrays.equals(this.f10156d, mVar.f10156d) && this.f10154b == mVar.f10154b);
    }

    public final boolean f() {
        return this.f10153a;
    }

    public final boolean h() {
        return this.f10154b;
    }

    public int hashCode() {
        if (!this.f10153a) {
            return 17;
        }
        String[] strArr = this.f10155c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f10156d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f10154b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f10156d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(I.Companion.a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f10153a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f10154b + ')';
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10157a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f10158b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f10159c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10160d;

        public a(boolean z10) {
            this.f10157a = z10;
        }

        public final m a() {
            return new m(this.f10157a, this.f10160d, this.f10158b, this.f10159c);
        }

        public final a b(C1233i... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f10157a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C1233i c1233i : cipherSuites) {
                arrayList.add(c1233i.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f10157a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] copyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f10158b = (String[]) copyOf;
            return this;
        }

        public final a d(boolean z10) {
            if (!this.f10157a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f10160d = z10;
            return this;
        }

        public final a e(I... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f10157a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (I i10 : tlsVersions) {
                arrayList.add(i10.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f10157a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] copyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f10159c = (String[]) copyOf;
            return this;
        }

        public a(m connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f10157a = connectionSpec.f();
            this.f10158b = connectionSpec.d();
            this.f10159c = connectionSpec.f10156d;
            this.f10160d = connectionSpec.h();
        }
    }
}
