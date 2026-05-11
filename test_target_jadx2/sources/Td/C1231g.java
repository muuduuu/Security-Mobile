package Td;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3880h;

/* renamed from: Td.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1231g {

    /* renamed from: c, reason: collision with root package name */
    public static final b f9998c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final C1231g f9999d = new a().b();

    /* renamed from: a, reason: collision with root package name */
    private final Set f10000a;

    /* renamed from: b, reason: collision with root package name */
    private final je.c f10001b;

    /* renamed from: Td.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f10002a = new ArrayList();

        public final a a(String pattern, String... pins) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.f10002a.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C1231g b() {
            return new C1231g(CollectionsKt.S0(this.f10002a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: Td.g$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).b();
        }

        public final C3880h b(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            C3880h.a aVar = C3880h.f38683d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return C3880h.a.g(aVar, encoded, 0, 0, 3, null).J();
        }

        public final C3880h c(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            C3880h.a aVar = C3880h.f38683d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return C3880h.a.g(aVar, encoded, 0, 0, 3, null).K();
        }

        private b() {
        }
    }

    /* renamed from: Td.g$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f10003a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10004b;

        /* renamed from: c, reason: collision with root package name */
        private final C3880h f10005c;

        public c(String pattern, String pin) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if ((!StringsKt.F(pattern, "*.", false, 2, null) || StringsKt.X(pattern, "*", 1, false, 4, null) != -1) && ((!StringsKt.F(pattern, "**.", false, 2, null) || StringsKt.X(pattern, "*", 2, false, 4, null) != -1) && StringsKt.X(pattern, "*", 0, false, 6, null) != -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + pattern).toString());
            }
            String k10 = Wd.f.k(pattern);
            if (k10 == null) {
                throw new IllegalArgumentException("Invalid pattern: " + pattern);
            }
            this.f10003a = k10;
            if (StringsKt.F(pin, "sha1/", false, 2, null)) {
                this.f10004b = "sha1";
                C3880h.a aVar = C3880h.f38683d;
                String substring = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                C3880h a10 = aVar.a(substring);
                if (a10 != null) {
                    this.f10005c = a10;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            if (!StringsKt.F(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.f10004b = "sha256";
            C3880h.a aVar2 = C3880h.f38683d;
            String substring2 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            C3880h a11 = aVar2.a(substring2);
            if (a11 != null) {
                this.f10005c = a11;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + pin);
        }

        public final C3880h a() {
            return this.f10005c;
        }

        public final String b() {
            return this.f10004b;
        }

        public final boolean c(String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt.F(this.f10003a, "**.", false, 2, null)) {
                int length = this.f10003a.length() - 3;
                int length2 = hostname.length() - length;
                if (!StringsKt.u(hostname, hostname.length() - length, this.f10003a, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!StringsKt.F(this.f10003a, "*.", false, 2, null)) {
                    return Intrinsics.b(hostname, this.f10003a);
                }
                int length3 = this.f10003a.length() - 1;
                int length4 = hostname.length() - length3;
                if (!StringsKt.u(hostname, hostname.length() - length3, this.f10003a, 1, length3, false, 16, null) || StringsKt.c0(hostname, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.b(this.f10003a, cVar.f10003a) && Intrinsics.b(this.f10004b, cVar.f10004b) && Intrinsics.b(this.f10005c, cVar.f10005c);
        }

        public int hashCode() {
            return (((this.f10003a.hashCode() * 31) + this.f10004b.hashCode()) * 31) + this.f10005c.hashCode();
        }

        public String toString() {
            return this.f10004b + '/' + this.f10005c.b();
        }
    }

    /* renamed from: Td.g$d */
    static final class d extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f10007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10008c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, String str) {
            super(0);
            this.f10007b = list;
            this.f10008c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            je.c d10 = C1231g.this.d();
            if (d10 == null || (list = d10.a(this.f10007b, this.f10008c)) == null) {
                list = this.f10007b;
            }
            List<Certificate> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
            for (Certificate certificate : list2) {
                Intrinsics.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C1231g(Set pins, je.c cVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f10000a = pins;
        this.f10001b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(hostname, new d(peerCertificates, hostname));
    }

    public final void b(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> c10 = c(hostname);
        if (c10.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            C3880h c3880h = null;
            C3880h c3880h2 = null;
            for (c cVar : c10) {
                String b10 = cVar.b();
                if (Intrinsics.b(b10, "sha256")) {
                    if (c3880h == null) {
                        c3880h = f9998c.c(x509Certificate);
                    }
                    if (Intrinsics.b(cVar.a(), c3880h)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.b(b10, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                    }
                    if (c3880h2 == null) {
                        c3880h2 = f9998c.b(x509Certificate);
                    }
                    if (Intrinsics.b(cVar.a(), c3880h2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f9998c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : c10) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        throw new SSLPeerUnverifiedException(sb3);
    }

    public final List c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f10000a;
        List j10 = CollectionsKt.j();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (j10.isEmpty()) {
                    j10 = new ArrayList();
                }
                Intrinsics.e(j10, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>");
                kotlin.jvm.internal.a.c(j10).add(obj);
            }
        }
        return j10;
    }

    public final je.c d() {
        return this.f10001b;
    }

    public final C1231g e(je.c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.b(this.f10001b, certificateChainCleaner) ? this : new C1231g(this.f10000a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1231g) {
            C1231g c1231g = (C1231g) obj;
            if (Intrinsics.b(c1231g.f10000a, this.f10000a) && Intrinsics.b(c1231g.f10001b, this.f10001b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f10000a.hashCode()) * 41;
        je.c cVar = this.f10001b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C1231g(Set set, je.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
