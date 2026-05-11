package be;

import Td.D;
import Td.E;
import Td.F;
import Td.G;
import Td.n;
import Td.o;
import Td.x;
import Td.z;
import Wd.p;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.M;
import pe.r;

/* renamed from: be.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1679a implements x {

    /* renamed from: a, reason: collision with root package name */
    private final o f19051a;

    public C1679a(o cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f19051a = cookieJar;
    }

    private final String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            n nVar = (n) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(nVar.e());
            sb2.append('=');
            sb2.append(nVar.g());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // Td.x
    public F intercept(x.a chain) {
        G b10;
        Intrinsics.checkNotNullParameter(chain, "chain");
        D t10 = chain.t();
        D.a j10 = t10.j();
        E a10 = t10.a();
        if (a10 != null) {
            z contentType = a10.getContentType();
            if (contentType != null) {
                j10.l("Content-Type", contentType.toString());
            }
            long contentLength = a10.contentLength();
            if (contentLength != -1) {
                j10.l("Content-Length", String.valueOf(contentLength));
                j10.p("Transfer-Encoding");
            } else {
                j10.l("Transfer-Encoding", "chunked");
                j10.p("Content-Length");
            }
        }
        boolean z10 = false;
        if (t10.e("Host") == null) {
            j10.l("Host", p.v(t10.n(), false, 1, null));
        }
        if (t10.e("Connection") == null) {
            j10.l("Connection", "Keep-Alive");
        }
        if (t10.e("Accept-Encoding") == null && t10.e("Range") == null) {
            j10.l("Accept-Encoding", "gzip");
            z10 = true;
        }
        List d10 = this.f19051a.d(t10.n());
        if (!d10.isEmpty()) {
            j10.l("Cookie", a(d10));
        }
        if (t10.e("User-Agent") == null) {
            j10.l("User-Agent", "okhttp/5.0.0-alpha.14");
        }
        D b11 = j10.b();
        F a11 = chain.a(b11);
        e.f(this.f19051a, b11.n(), a11.p());
        F.a r10 = a11.t().r(b11);
        if (z10 && StringsKt.r("gzip", F.o(a11, "Content-Encoding", null, 2, null), true) && e.b(a11) && (b10 = a11.b()) != null) {
            r rVar = new r(b10.j());
            r10.j(a11.p().m().i("Content-Encoding").i("Content-Length").f());
            r10.b(new h(F.o(a11, "Content-Type", null, 2, null), -1L, M.c(rVar)));
        }
        return r10.c();
    }
}
