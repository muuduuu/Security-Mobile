package Vd;

import Td.F;
import Td.G;
import be.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.InterfaceC3879g;
import pe.M;
import pe.r;
import xe.b;

/* loaded from: classes3.dex */
public abstract class a {
    public static final F a(F response) {
        InterfaceC3879g c10;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!e.b(response)) {
            return response;
        }
        G b10 = response.b();
        String o10 = F.o(response, "Content-Encoding", null, 2, null);
        if (o10 == null) {
            return response;
        }
        if (StringsKt.r(o10, "br", true)) {
            c10 = M.c(M.k(new b(b10.j().a2())));
        } else {
            if (!StringsKt.r(o10, "gzip", true)) {
                return response;
            }
            c10 = M.c(new r(b10.j()));
        }
        return response.t().q("Content-Encoding").q("Content-Length").b(G.f9918b.d(c10, b10.f(), -1L)).c();
    }
}
