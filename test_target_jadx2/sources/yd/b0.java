package yd;

import kotlin.jvm.internal.Intrinsics;
import yd.Z;

/* loaded from: classes3.dex */
public abstract class b0 {
    public static final a0 a(a0 a0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        a0 w10;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        if (AbstractC5208j.a(a0Var) == newAnnotations) {
            return a0Var;
        }
        C5207i b10 = AbstractC5208j.b(a0Var);
        if (b10 != null && (w10 = a0Var.w(b10)) != null) {
            a0Var = w10;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? a0Var.v(new C5207i(newAnnotations)) : a0Var;
    }

    public static final a0 b(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return Z.a.a(C5212n.f45551a, gVar, null, null, 6, null);
    }
}
