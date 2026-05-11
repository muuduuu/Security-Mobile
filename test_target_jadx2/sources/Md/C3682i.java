package md;

import Kc.G;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: md.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3682i extends AbstractC3680g {
    public C3682i(double d10) {
        super(Double.valueOf(d10));
    }

    @Override // md.AbstractC3680g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        M z10 = module.v().z();
        Intrinsics.checkNotNullExpressionValue(z10, "getDoubleType(...)");
        return z10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        return ((Number) b()).doubleValue() + ".toDouble()";
    }
}
