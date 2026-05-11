package md;

import Kc.G;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: md.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3690q extends AbstractC3688o {
    public C3690q(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // md.AbstractC3680g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        M F10 = module.v().F();
        Intrinsics.checkNotNullExpressionValue(F10, "getLongType(...)");
        return F10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        return ((Number) b()).longValue() + ".toLong()";
    }
}
