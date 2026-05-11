package Qc;

import Kc.InterfaceC0933e;
import Kc.K;
import Rc.b;
import Rc.c;
import id.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final void a(c cVar, b from, InterfaceC0933e scopeOwner, f name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        if (cVar == c.a.f8658a) {
            return;
        }
        from.getLocation();
    }

    public static final void b(c cVar, b from, K scopeOwner, f name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        String b10 = scopeOwner.e().b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        String c10 = name.c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        c(cVar, from, b10, c10);
    }

    public static final void c(c cVar, b from, String packageFqName, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        if (cVar == c.a.f8658a) {
            return;
        }
        from.getLocation();
    }
}
