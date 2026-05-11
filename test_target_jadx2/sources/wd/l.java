package Wd;

import Td.C;
import Td.C1228d;
import Td.D;
import Td.F;
import Td.G;
import Td.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l {
    private static final void a(String str, F f10) {
        if (f10 != null) {
            if (f10.s() != null) {
                throw new IllegalArgumentException((str + ".networkResponse != null").toString());
            }
            if (f10.d() != null) {
                throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
            }
            if (f10.u() == null) {
                return;
            }
            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
        }
    }

    public static final F.a b(F.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.g().a(name, value);
        return aVar;
    }

    public static final F.a c(F.a aVar, G body) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        aVar.t(body);
        return aVar;
    }

    public static final F.a d(F.a aVar, F f10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        a("cacheResponse", f10);
        aVar.u(f10);
        return aVar;
    }

    public static final void e(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        f10.b().close();
    }

    public static final F.a f(F.a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.v(i10);
        return aVar;
    }

    public static final F.a g(F.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.g().j(name, value);
        return aVar;
    }

    public static final String h(F f10, String name, String str) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String c10 = f10.p().c(name);
        return c10 == null ? str : c10;
    }

    public static final F.a i(F.a aVar, v headers) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        aVar.w(headers.m());
        return aVar;
    }

    public static final F.a j(F.a aVar, String message) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        aVar.x(message);
        return aVar;
    }

    public static final F.a k(F.a aVar, F f10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        a("networkResponse", f10);
        aVar.y(f10);
        return aVar;
    }

    public static final F.a l(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        return new F.a(f10);
    }

    public static final F.a m(F.a aVar, F f10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.z(f10);
        return aVar;
    }

    public static final F.a n(F.a aVar, C protocol) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        aVar.A(protocol);
        return aVar;
    }

    public static final F.a o(F.a aVar, String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        aVar.g().i(name);
        return aVar;
    }

    public static final F.a p(F.a aVar, D request) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        aVar.B(request);
        return aVar;
    }

    public static final String q(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        return "Response{protocol=" + f10.x() + ", code=" + f10.f() + ", message=" + f10.r() + ", url=" + f10.z().n() + '}';
    }

    public static final F.a r(F.a aVar, Function0 trailersFn) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(trailersFn, "trailersFn");
        aVar.C(trailersFn);
        return aVar;
    }

    public static final C1228d s(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        C1228d i10 = f10.i();
        if (i10 != null) {
            return i10;
        }
        C1228d a10 = C1228d.f9974n.a(f10.p());
        f10.F(a10);
        return a10;
    }

    public static final boolean t(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        int f11 = f10.f();
        if (f11 != 307 && f11 != 308) {
            switch (f11) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static final boolean u(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        int f11 = f10.f();
        return 200 <= f11 && f11 < 300;
    }

    public static final F v(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        return f10.t().b(new b(f10.b().f(), f10.b().e())).c();
    }
}
