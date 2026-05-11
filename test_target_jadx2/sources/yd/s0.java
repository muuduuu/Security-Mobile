package yd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class s0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC5197E a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        if (abstractC5197E instanceof r0) {
            return ((r0) abstractC5197E).N();
        }
        return null;
    }

    public static final t0 b(t0 t0Var, AbstractC5197E origin) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return d(t0Var, a(origin));
    }

    public static final t0 c(t0 t0Var, AbstractC5197E origin, Function1 transform) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(transform, "transform");
        AbstractC5197E a10 = a(origin);
        return d(t0Var, a10 != null ? (AbstractC5197E) transform.invoke(a10) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t0 d(t0 t0Var, AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        if (t0Var instanceof r0) {
            return d(((r0) t0Var).N0(), abstractC5197E);
        }
        if (abstractC5197E == null || Intrinsics.b(abstractC5197E, t0Var)) {
            return t0Var;
        }
        if (t0Var instanceof M) {
            return new P((M) t0Var, abstractC5197E);
        }
        if (t0Var instanceof AbstractC5222y) {
            return new C5193A((AbstractC5222y) t0Var, abstractC5197E);
        }
        throw new lc.m();
    }
}
