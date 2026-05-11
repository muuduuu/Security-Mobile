package lc;

import kotlin.jvm.internal.Intrinsics;
import lc.o;

/* loaded from: classes2.dex */
public abstract class p {
    public static final Object a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new o.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof o.b) {
            throw ((o.b) obj).f37130a;
        }
    }
}
