package yd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5219v {
    public static /* synthetic */ i0 b(AbstractC5219v abstractC5219v, Kc.f0 f0Var, AbstractC5220w abstractC5220w, h0 h0Var, AbstractC5197E abstractC5197E, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            abstractC5197E = h0Var.c(f0Var, abstractC5220w);
        }
        return abstractC5219v.a(f0Var, abstractC5220w, h0Var, abstractC5197E);
    }

    public i0 a(Kc.f0 parameter, AbstractC5220w typeAttr, h0 typeParameterUpperBoundEraser, AbstractC5197E erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        return new k0(u0.OUT_VARIANCE, erasedUpperBound);
    }
}
