package Wd;

import Td.C1228d;
import Td.v;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.a;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public abstract class c {
    public static final C1228d a(C1228d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new C1228d(aVar.f(), aVar.g(), aVar.c(), -1, false, false, false, aVar.d(), aVar.e(), aVar.i(), aVar.h(), aVar.b(), null);
    }

    public static final int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public static final C1228d c(C1228d.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C1228d.a n10 = new C1228d.a().n();
        a.C0542a c0542a = kotlin.time.a.f36861b;
        return n10.k(kotlin.time.b.j(Integer.MAX_VALUE, Id.b.SECONDS)).a();
    }

    public static final C1228d d(C1228d.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new C1228d.a().l().a();
    }

    public static final C1228d.a e(C1228d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.o(true);
        return aVar;
    }

    public static final C1228d.a f(C1228d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.p(true);
        return aVar;
    }

    public static final C1228d.a g(C1228d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.q(true);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1228d h(C1228d.b bVar, v vVar) {
        int i10;
        int i11;
        int i12;
        String str;
        v headers = vVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = vVar.size();
        boolean z10 = true;
        boolean z11 = true;
        int i13 = 0;
        String str2 = null;
        boolean z12 = false;
        boolean z13 = false;
        int i14 = -1;
        int i15 = -1;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i16 = -1;
        int i17 = -1;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (i13 < size) {
            String h10 = headers.h(i13);
            String v10 = headers.v(i13);
            if (StringsKt.r(h10, AppConstants.S3_CACHE_CONTROL, z10)) {
                if (str2 == null) {
                    str2 = v10;
                    i10 = 0;
                    while (i10 < v10.length()) {
                        int j10 = j(v10, "=,;", i10);
                        String substring = v10.substring(i10, j10);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        String obj = StringsKt.S0(substring).toString();
                        if (j10 != v10.length()) {
                            i11 = size;
                            if (v10.charAt(j10) != ',' && v10.charAt(j10) != ';') {
                                int x10 = m.x(v10, j10 + 1);
                                if (x10 >= v10.length() || v10.charAt(x10) != '\"') {
                                    i12 = j(v10, ",;", x10);
                                    String substring2 = v10.substring(x10, i12);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    str = StringsKt.S0(substring2).toString();
                                } else {
                                    int i18 = x10 + 1;
                                    int W10 = StringsKt.W(v10, '\"', i18, false, 4, null);
                                    str = v10.substring(i18, W10);
                                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                                    i12 = W10 + 1;
                                }
                                z10 = true;
                                if (!StringsKt.r("no-cache", obj, true)) {
                                    i10 = i12;
                                    z12 = true;
                                } else if (StringsKt.r("no-store", obj, true)) {
                                    i10 = i12;
                                    z13 = true;
                                } else {
                                    if (StringsKt.r("max-age", obj, true)) {
                                        i14 = m.H(str, -1);
                                    } else if (StringsKt.r("s-maxage", obj, true)) {
                                        i15 = m.H(str, -1);
                                    } else if (StringsKt.r("private", obj, true)) {
                                        i10 = i12;
                                        z14 = true;
                                    } else if (StringsKt.r("public", obj, true)) {
                                        i10 = i12;
                                        z15 = true;
                                    } else if (StringsKt.r("must-revalidate", obj, true)) {
                                        i10 = i12;
                                        z16 = true;
                                    } else if (StringsKt.r("max-stale", obj, true)) {
                                        i16 = m.H(str, Integer.MAX_VALUE);
                                    } else if (StringsKt.r("min-fresh", obj, true)) {
                                        i17 = m.H(str, -1);
                                    } else if (StringsKt.r("only-if-cached", obj, true)) {
                                        i10 = i12;
                                        z17 = true;
                                    } else if (StringsKt.r("no-transform", obj, true)) {
                                        i10 = i12;
                                        z18 = true;
                                    } else if (StringsKt.r("immutable", obj, true)) {
                                        i10 = i12;
                                        z19 = true;
                                    }
                                    i10 = i12;
                                }
                                size = i11;
                            }
                        } else {
                            i11 = size;
                        }
                        i12 = j10 + 1;
                        str = null;
                        z10 = true;
                        if (!StringsKt.r("no-cache", obj, true)) {
                        }
                        size = i11;
                    }
                    i13++;
                    headers = vVar;
                    size = size;
                }
            } else if (!StringsKt.r(h10, "Pragma", z10)) {
                i13++;
                headers = vVar;
                size = size;
            }
            z11 = false;
            i10 = 0;
            while (i10 < v10.length()) {
            }
            i13++;
            headers = vVar;
            size = size;
        }
        return new C1228d(z12, z13, i14, i15, z14, z15, z16, i16, i17, z17, z18, z19, !z11 ? null : str2);
    }

    public static final String i(C1228d c1228d) {
        Intrinsics.checkNotNullParameter(c1228d, "<this>");
        String a10 = c1228d.a();
        if (a10 != null) {
            return a10;
        }
        StringBuilder sb2 = new StringBuilder();
        if (c1228d.i()) {
            sb2.append("no-cache, ");
        }
        if (c1228d.j()) {
            sb2.append("no-store, ");
        }
        if (c1228d.e() != -1) {
            sb2.append("max-age=");
            sb2.append(c1228d.e());
            sb2.append(", ");
        }
        if (c1228d.m() != -1) {
            sb2.append("s-maxage=");
            sb2.append(c1228d.m());
            sb2.append(", ");
        }
        if (c1228d.c()) {
            sb2.append("private, ");
        }
        if (c1228d.d()) {
            sb2.append("public, ");
        }
        if (c1228d.h()) {
            sb2.append("must-revalidate, ");
        }
        if (c1228d.f() != -1) {
            sb2.append("max-stale=");
            sb2.append(c1228d.f());
            sb2.append(", ");
        }
        if (c1228d.g() != -1) {
            sb2.append("min-fresh=");
            sb2.append(c1228d.g());
            sb2.append(", ");
        }
        if (c1228d.l()) {
            sb2.append("only-if-cached, ");
        }
        if (c1228d.k()) {
            sb2.append("no-transform, ");
        }
        if (c1228d.b()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        Intrinsics.checkNotNullExpressionValue(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        c1228d.n(sb3);
        return sb3;
    }

    private static final int j(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (StringsKt.J(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
