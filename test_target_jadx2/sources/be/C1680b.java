package be;

import Td.D;
import Td.E;
import Td.F;
import Td.x;
import Wd.l;
import de.C3044a;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.AbstractC3622a;
import pe.InterfaceC3878f;
import pe.M;

/* renamed from: be.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1680b implements x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19052a;

    public C1680b(boolean z10) {
        this.f19052a = z10;
    }

    private final boolean a(int i10, ae.e eVar) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:57:0x00aa, B:59:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x0135, B:35:0x0143, B:43:0x0159, B:45:0x0168, B:46:0x018e, B:54:0x014e, B:55:0x0125), top: B:56:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // Td.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F intercept(x.a chain) {
        boolean z10;
        F.a aVar;
        F.a aVar2;
        int f10;
        F c10;
        F.a aVar3;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        ae.e g10 = gVar.g();
        Intrinsics.d(g10);
        D i10 = gVar.i();
        E a10 = i10.a();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            g10.x(i10);
            ?? b10 = f.b(i10.i());
            try {
                if (b10 == 0 || a10 == null) {
                    g10.p();
                    z10 = true;
                    b10 = 0;
                } else {
                    if (StringsKt.r("100-continue", i10.e("Expect"), true)) {
                        g10.f();
                        F.a r10 = g10.r(true);
                        try {
                            g10.t();
                            z10 = false;
                            aVar3 = r10;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            aVar = r10;
                            if (e instanceof C3044a) {
                                throw e;
                            }
                            aVar2 = aVar;
                            if (!g10.k()) {
                                throw e;
                            }
                            if (aVar2 == null) {
                            }
                            F c11 = aVar2.r(i10).h(g10.h().n()).s(currentTimeMillis).p(System.currentTimeMillis()).c();
                            f10 = c11.f();
                            if (a(f10, g10)) {
                            }
                            g10.s(c11);
                            if (this.f19052a) {
                            }
                            if (!StringsKt.r("close", c10.z().e("Connection"), true)) {
                            }
                            g10.o();
                            if (f10 == 204) {
                            }
                            throw new ProtocolException("HTTP " + f10 + " had non-zero Content-Length: " + c10.b().e());
                        }
                    } else {
                        z10 = true;
                        aVar3 = null;
                    }
                    if (aVar3 != null) {
                        g10.p();
                        b10 = aVar3;
                        if (!g10.h().r()) {
                            g10.o();
                            b10 = aVar3;
                        }
                    } else if (a10.isDuplex()) {
                        g10.f();
                        a10.writeTo(M.b(g10.c(i10, true)));
                        b10 = aVar3;
                    } else {
                        InterfaceC3878f b11 = M.b(g10.c(i10, false));
                        a10.writeTo(b11);
                        b11.close();
                        b10 = aVar3;
                    }
                }
                if (a10 == null || !a10.isDuplex()) {
                    g10.e();
                }
                e = null;
                aVar2 = b10;
            } catch (IOException e11) {
                e = e11;
                aVar = b10;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            aVar = null;
        }
        if (aVar2 == null) {
            try {
                aVar2 = g10.r(false);
                Intrinsics.d(aVar2);
                if (z10) {
                    g10.t();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                AbstractC3622a.a(e, e13);
                throw e;
            }
        }
        F c112 = aVar2.r(i10).h(g10.h().n()).s(currentTimeMillis).p(System.currentTimeMillis()).c();
        f10 = c112.f();
        if (a(f10, g10)) {
            F.a r11 = g10.r(false);
            Intrinsics.d(r11);
            if (z10) {
                g10.t();
            }
            c112 = r11.r(i10).h(g10.h().n()).s(currentTimeMillis).p(System.currentTimeMillis()).c();
            f10 = c112.f();
        }
        g10.s(c112);
        c10 = (this.f19052a || f10 != 101) ? c112.t().b(g10.q(c112)).c() : l.v(c112);
        if (!StringsKt.r("close", c10.z().e("Connection"), true) || StringsKt.r("close", F.o(c10, "Connection", null, 2, null), true)) {
            g10.o();
        }
        if ((f10 == 204 && f10 != 205) || c10.b().e() <= 0) {
            return c10;
        }
        throw new ProtocolException("HTTP " + f10 + " had non-zero Content-Length: " + c10.b().e());
    }
}
