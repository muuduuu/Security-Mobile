package Sc;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class F {
    public static final List a(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String c10 = name.c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return A.c(c10) ? CollectionsKt.n(b(name)) : A.d(c10) ? f(name) : C1157g.f9031a.b(name);
    }

    public static final id.f b(id.f methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        id.f e10 = e(methodName, "get", false, null, 12, null);
        return e10 == null ? e(methodName, "is", false, null, 8, null) : e10;
    }

    public static final id.f c(id.f methodName, boolean z10) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return e(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final id.f d(id.f fVar, String str, boolean z10, String str2) {
        if (fVar.p()) {
            return null;
        }
        String e10 = fVar.e();
        Intrinsics.checkNotNullExpressionValue(e10, "getIdentifier(...)");
        if (!StringsKt.F(e10, str, false, 2, null) || e10.length() == str.length()) {
            return null;
        }
        char charAt = e10.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            return id.f.o(str2 + StringsKt.o0(e10, str));
        }
        if (!z10) {
            return fVar;
        }
        String c10 = Ed.a.c(StringsKt.o0(e10, str), true);
        if (id.f.q(c10)) {
            return id.f.o(c10);
        }
        return null;
    }

    static /* synthetic */ id.f e(id.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List f(id.f methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return CollectionsKt.o(c(methodName, false), c(methodName, true));
    }
}
