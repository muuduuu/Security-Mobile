package Q2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class x {
    private static final boolean a(Td.v vVar) {
        return StringsKt.r(vVar.c("Content-Encoding"), "gzip", true);
    }

    private static final long b(Td.F f10) {
        Long l10;
        String l11 = f10.l("Content-Length");
        if (l11 == null || (l10 = StringsKt.l(l11)) == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public static final String c(Td.F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        return f10.l("Content-Type");
    }

    public static final boolean d(Td.F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        if (Intrinsics.b(f10.z().i(), "HEAD")) {
            return false;
        }
        int f11 = f10.f();
        if ((f11 >= 100 && f11 < 200) || f11 == 204 || f11 == 304) {
            return b(f10) > 0 || e(f10);
        }
        return true;
    }

    public static final boolean e(Td.F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        return StringsKt.r(f10.l("Transfer-Encoding"), "chunked", true);
    }

    public static final boolean f(Td.D d10) {
        Intrinsics.checkNotNullParameter(d10, "<this>");
        Td.v f10 = d10.f();
        Intrinsics.checkNotNullExpressionValue(f10, "this.headers()");
        return a(f10);
    }

    public static final boolean g(Td.F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        Td.v p10 = f10.p();
        Intrinsics.checkNotNullExpressionValue(p10, "this.headers()");
        return a(p10);
    }
}
