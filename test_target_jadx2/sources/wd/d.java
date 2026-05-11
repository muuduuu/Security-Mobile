package Wd;

import Td.C1232h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {
    public static final boolean a(C1232h c1232h, Object obj) {
        Intrinsics.checkNotNullParameter(c1232h, "<this>");
        if (obj instanceof C1232h) {
            C1232h c1232h2 = (C1232h) obj;
            if (Intrinsics.b(c1232h2.d(), c1232h.d()) && Intrinsics.b(c1232h2.a(), c1232h.a())) {
                return true;
            }
        }
        return false;
    }

    public static final int b(C1232h c1232h) {
        Intrinsics.checkNotNullParameter(c1232h, "<this>");
        return ((899 + c1232h.d().hashCode()) * 31) + c1232h.a().hashCode();
    }

    public static final String c(C1232h c1232h) {
        Intrinsics.checkNotNullParameter(c1232h, "<this>");
        return c1232h.d() + " authParams=" + c1232h.a();
    }
}
