package yd;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5221x {
    public static final Ad.i a(o0 o0Var, Ad.i inlineClassType) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
        return b(o0Var, inlineClassType, new HashSet());
    }

    private static final Ad.i b(o0 o0Var, Ad.i iVar, HashSet hashSet) {
        Ad.i b10;
        Ad.i g02;
        Ad.m e02 = o0Var.e0(iVar);
        if (!hashSet.add(e02)) {
            return null;
        }
        Ad.n C02 = o0Var.C0(e02);
        if (C02 != null) {
            Ad.i Y10 = o0Var.Y(C02);
            b10 = b(o0Var, Y10, hashSet);
            if (b10 == null) {
                return null;
            }
            boolean z10 = o0Var.U(o0Var.e0(Y10)) || ((Y10 instanceof Ad.j) && o0Var.p0((Ad.j) Y10));
            if ((b10 instanceof Ad.j) && o0Var.p0((Ad.j) b10) && o0Var.z0(iVar) && z10) {
                g02 = o0Var.g0(Y10);
            } else if (!o0Var.z0(b10) && o0Var.A0(iVar)) {
                g02 = o0Var.g0(b10);
            }
            return g02;
        }
        if (!o0Var.U(e02)) {
            return iVar;
        }
        Ad.i w10 = o0Var.w(iVar);
        if (w10 == null || (b10 = b(o0Var, w10, hashSet)) == null) {
            return null;
        }
        if (o0Var.z0(iVar)) {
            return o0Var.z0(b10) ? iVar : ((b10 instanceof Ad.j) && o0Var.p0((Ad.j) b10)) ? iVar : o0Var.g0(b10);
        }
        return b10;
    }
}
