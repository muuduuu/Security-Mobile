package be;

import Td.B;
import Td.D;
import Td.E;
import Td.F;
import Td.H;
import Td.w;
import Td.x;
import Wd.m;
import Wd.p;
import ae.l;
import de.C3044a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class j implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19072b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final B f19073a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(B client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f19073a = client;
    }

    private final D a(F f10, String str) {
        String o10;
        w t10;
        if (!this.f19073a.s() || (o10 = F.o(f10, "Location", null, 2, null)) == null || (t10 = f10.z().n().t(o10)) == null) {
            return null;
        }
        if (!Intrinsics.b(t10.u(), f10.z().n().u()) && !this.f19073a.t()) {
            return null;
        }
        D.a j10 = f10.z().j();
        if (f.b(str)) {
            int f11 = f10.f();
            f fVar = f.f19058a;
            boolean z10 = fVar.d(str) || f11 == 308 || f11 == 307;
            if (!fVar.c(str) || f11 == 308 || f11 == 307) {
                j10.n(str, z10 ? f10.z().a() : null);
            } else {
                j10.n("GET", null);
            }
            if (!z10) {
                j10.p("Transfer-Encoding");
                j10.p("Content-Length");
                j10.p("Content-Type");
            }
        }
        if (!p.e(f10.z().n(), t10)) {
            j10.p("Authorization");
        }
        return j10.w(t10).b();
    }

    private final D b(F f10, ae.e eVar) {
        l h10;
        H v10 = (eVar == null || (h10 = eVar.h()) == null) ? null : h10.v();
        int f11 = f10.f();
        String i10 = f10.z().i();
        if (f11 != 307 && f11 != 308) {
            if (f11 == 401) {
                return this.f19073a.f().a(v10, f10);
            }
            if (f11 == 421) {
                E a10 = f10.z().a();
                if ((a10 != null && a10.isOneShot()) || eVar == null || !eVar.l()) {
                    return null;
                }
                eVar.h().u();
                return f10.z();
            }
            if (f11 == 503) {
                F u10 = f10.u();
                if ((u10 == null || u10.f() != 503) && f(f10, Integer.MAX_VALUE) == 0) {
                    return f10.z();
                }
                return null;
            }
            if (f11 == 407) {
                Intrinsics.d(v10);
                if (v10.b().type() == Proxy.Type.HTTP) {
                    return this.f19073a.F().a(v10, f10);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (f11 == 408) {
                if (!this.f19073a.I()) {
                    return null;
                }
                E a11 = f10.z().a();
                if (a11 != null && a11.isOneShot()) {
                    return null;
                }
                F u11 = f10.u();
                if ((u11 == null || u11.f() != 408) && f(f10, 0) <= 0) {
                    return f10.z();
                }
                return null;
            }
            switch (f11) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(f10, i10);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, ae.k kVar, D d10, boolean z10) {
        if (this.f19073a.I()) {
            return !(z10 && e(iOException, d10)) && c(iOException, z10) && kVar.D();
        }
        return false;
    }

    private final boolean e(IOException iOException, D d10) {
        E a10 = d10.a();
        return (a10 != null && a10.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(F f10, int i10) {
        String o10 = F.o(f10, "Retry-After", null, 2, null);
        if (o10 == null) {
            return i10;
        }
        if (!new Regex("\\d+").d(o10)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(o10);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = r11.a(r0).t().r(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r6 = Wd.l.v(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r7 = r0.n(r6).c();
        r0 = r1.s();
        r6 = b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r6 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r0.isOneShot() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        r1.m(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        Wd.m.f(r7.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r8 > 20) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (r0.m() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        r1.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        r1.m(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0038, code lost:
    
        r6 = null;
     */
    @Override // Td.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F intercept(x.a chain) {
        D b10;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        D i10 = gVar.i();
        ae.k e10 = gVar.e();
        List j10 = CollectionsKt.j();
        int i11 = 0;
        F f10 = null;
        while (true) {
            boolean z10 = true;
            while (true) {
                e10.l(i10, z10, gVar);
                try {
                    if (e10.e()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        break;
                    } catch (IOException e11) {
                        if (!d(e11, e10, i10, !(e11 instanceof C3044a))) {
                            throw m.K(e11, j10);
                        }
                        j10 = CollectionsKt.x0(j10, e11);
                        e10.m(true);
                        z10 = false;
                    }
                } catch (Throwable th) {
                    e10.m(true);
                    throw th;
                }
            }
            e10.m(true);
            i10 = b10;
        }
    }
}
