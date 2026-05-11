package md;

import Kc.G;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: md.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3693t extends AbstractC3688o {
    public C3693t(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // md.AbstractC3680g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        M T10 = module.v().T();
        Intrinsics.checkNotNullExpressionValue(T10, "getShortType(...)");
        return T10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        return ((Number) b()).intValue() + ".toShort()";
    }
}
