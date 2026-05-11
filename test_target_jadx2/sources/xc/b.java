package Xc;

import Kc.f0;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;
import yd.p0;

/* loaded from: classes3.dex */
public abstract class b {
    public static final a a(p0 p0Var, boolean z10, boolean z11, f0 f0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        return new a(p0Var, null, z11, z10, f0Var != null ? O.c(f0Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(p0 p0Var, boolean z10, boolean z11, f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            f0Var = null;
        }
        return a(p0Var, z10, z11, f0Var);
    }
}
