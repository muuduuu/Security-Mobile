package je;

import Wd.f;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.d0;

/* loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f35958a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.j();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.b(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.j();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) d0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.F(str, ".", false, 2, null) && !StringsKt.q(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !StringsKt.F(str2, ".", false, 2, null) && !StringsKt.q(str2, "..", false, 2, null)) {
            if (!StringsKt.q(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt.q(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String b10 = b(str2);
            if (!StringsKt.K(b10, "*", false, 2, null)) {
                return Intrinsics.b(str3, b10);
            }
            if (!StringsKt.F(b10, "*.", false, 2, null) || StringsKt.W(b10, '*', 1, false, 4, null) != -1 || str3.length() < b10.length() || Intrinsics.b("*.", b10)) {
                return false;
            }
            String substring = b10.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (!StringsKt.q(str3, substring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || StringsKt.c0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        List c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            if (f35958a.f(b10, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String k10 = f.k(str);
        List c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b(k10, f.k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.w0(c(certificate, 7), c(certificate, 2));
    }

    public final boolean e(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return f.a(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
