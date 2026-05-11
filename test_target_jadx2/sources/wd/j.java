package Wd;

import Td.C1228d;
import Td.D;
import Td.E;
import Td.v;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class j {
    public static final String a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.D(url, "ws:", true)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("http:");
            String substring = url.substring(3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb2.append(substring);
            return sb2.toString();
        }
        if (!StringsKt.D(url, "wss:", true)) {
            return url;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("https:");
        String substring2 = url.substring(4);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb3.append(substring2);
        return sb3.toString();
    }

    public static final D.a b(D.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.h().a(name, value);
        return aVar;
    }

    public static final D.a c(D.a aVar, C1228d cacheControl) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        String c1228d = cacheControl.toString();
        return c1228d.length() == 0 ? aVar.p(AppConstants.S3_CACHE_CONTROL) : aVar.l(AppConstants.S3_CACHE_CONTROL, c1228d);
    }

    public static final D.a d(D.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.n("GET", null);
    }

    public static final D.a e(D.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.h().j(name, value);
        return aVar;
    }

    public static final String f(D d10, String name) {
        Intrinsics.checkNotNullParameter(d10, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return d10.f().c(name);
    }

    public static final D.a g(D.a aVar, v headers) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        aVar.r(headers.m());
        return aVar;
    }

    public static final List h(D d10, String name) {
        Intrinsics.checkNotNullParameter(d10, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return d10.f().w(name);
    }

    public static final D.a i(D.a aVar, String method, E e10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (e10 == null) {
            if (be.f.e(method)) {
                throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
            }
        } else if (!be.f.b(method)) {
            throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
        }
        aVar.s(method);
        aVar.q(e10);
        return aVar;
    }

    public static final D.a j(D.a aVar, E body) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        return aVar.n("POST", body);
    }

    public static final D.a k(D.a aVar, String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        aVar.h().i(name);
        return aVar;
    }

    public static final D.a l(D.a aVar, kotlin.reflect.d type, Object obj) {
        Map d10;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (obj != null) {
            if (aVar.j().isEmpty()) {
                d10 = new LinkedHashMap();
                aVar.t(d10);
            } else {
                Map j10 = aVar.j();
                Intrinsics.e(j10, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                d10 = kotlin.jvm.internal.a.d(j10);
            }
            d10.put(type, obj);
        } else if (!aVar.j().isEmpty()) {
            Map j11 = aVar.j();
            Intrinsics.e(j11, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
            kotlin.jvm.internal.a.d(j11).remove(type);
        }
        return aVar;
    }

    public static final String m(D d10) {
        Intrinsics.checkNotNullParameter(d10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(d10.i());
        sb2.append(", url=");
        sb2.append(d10.n());
        if (d10.f().size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : d10.f()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.t();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (m.B(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!d10.d().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(d10.d());
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
