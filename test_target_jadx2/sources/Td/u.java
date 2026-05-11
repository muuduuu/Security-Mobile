package Td;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final a f10209e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final I f10210a;

    /* renamed from: b, reason: collision with root package name */
    private final C1233i f10211b;

    /* renamed from: c, reason: collision with root package name */
    private final List f10212c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f10213d;

    public static final class a {

        /* renamed from: Td.u$a$a, reason: collision with other inner class name */
        static final class C0194a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f10214a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0194a(List list) {
                super(0);
                this.f10214a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f10214a;
            }
        }

        static final class b extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f10215a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f10215a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f10215a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List c(Certificate[] certificateArr) {
            return certificateArr != null ? Wd.p.k(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.j();
        }

        public final u a(I tlsVersion, C1233i cipherSuite, List peerCertificates, List localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new u(tlsVersion, cipherSuite, Wd.p.w(localCertificates), new C0194a(Wd.p.w(peerCertificates)));
        }

        public final u b(SSLSession sSLSession) {
            List j10;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C1233i b10 = C1233i.f10065b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            I a10 = I.Companion.a(protocol);
            try {
                j10 = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                j10 = CollectionsKt.j();
            }
            return new u(a10, b10, c(sSLSession.getLocalCertificates()), new b(j10));
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f10216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f10216a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.f10216a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.j();
            }
        }
    }

    public u(I tlsVersion, C1233i cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f10210a = tlsVersion;
        this.f10211b = cipherSuite;
        this.f10212c = localCertificates;
        this.f10213d = lc.i.a(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    public final C1233i a() {
        return this.f10211b;
    }

    public final List c() {
        return this.f10212c;
    }

    public final List d() {
        return (List) this.f10213d.getValue();
    }

    public final I e() {
        return this.f10210a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (uVar.f10210a == this.f10210a && Intrinsics.b(uVar.f10211b, this.f10211b) && Intrinsics.b(uVar.d(), d()) && Intrinsics.b(uVar.f10212c, this.f10212c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f10210a.hashCode()) * 31) + this.f10211b.hashCode()) * 31) + d().hashCode()) * 31) + this.f10212c.hashCode();
    }

    public String toString() {
        List d10 = d();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(d10, 10));
        Iterator it = d10.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f10210a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f10211b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List list = this.f10212c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
