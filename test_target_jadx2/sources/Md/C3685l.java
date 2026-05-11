package md;

import Kc.G;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: md.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3685l extends AbstractC3680g {
    public C3685l(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // md.AbstractC3680g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        M B10 = module.v().B();
        Intrinsics.checkNotNullExpressionValue(B10, "getFloatType(...)");
        return B10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
