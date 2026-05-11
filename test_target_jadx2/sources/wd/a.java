package Wd;

import Td.C1233i;
import Td.z;
import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lc.t;

/* loaded from: classes3.dex */
public abstract class a {
    public static final Charset a(z zVar) {
        Charset b10;
        return (zVar == null || (b10 = z.b(zVar, null, 1, null)) == null) ? Charsets.UTF_8 : b10;
    }

    public static final Pair b(z zVar) {
        Charset charset = Charsets.UTF_8;
        if (zVar != null) {
            Charset b10 = z.b(zVar, null, 1, null);
            if (b10 == null) {
                zVar = z.f10239e.b(zVar + "; charset=utf-8");
            } else {
                charset = b10;
            }
        }
        return t.a(charset, zVar);
    }

    public static final String c(Td.n cookie, boolean z10) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return cookie.f(z10);
    }

    public static final String[] d(Td.m mVar, String[] socketEnabledCipherSuites) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return mVar.d() != null ? m.z(mVar.d(), socketEnabledCipherSuites, C1233i.f10065b.c()) : socketEnabledCipherSuites;
    }
}
