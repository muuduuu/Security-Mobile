package yd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5194B {
    public static final AbstractC5222y a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        t0 Z02 = abstractC5197E.Z0();
        Intrinsics.e(Z02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (AbstractC5222y) Z02;
    }

    public static final boolean b(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return abstractC5197E.Z0() instanceof AbstractC5222y;
    }

    public static final M c(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        t0 Z02 = abstractC5197E.Z0();
        if (Z02 instanceof AbstractC5222y) {
            return ((AbstractC5222y) Z02).e1();
        }
        if (Z02 instanceof M) {
            return (M) Z02;
        }
        throw new lc.m();
    }

    public static final M d(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        t0 Z02 = abstractC5197E.Z0();
        if (Z02 instanceof AbstractC5222y) {
            return ((AbstractC5222y) Z02).f1();
        }
        if (Z02 instanceof M) {
            return (M) Z02;
        }
        throw new lc.m();
    }
}
