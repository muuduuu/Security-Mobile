package md;

import Kc.G;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: md.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3694u extends AbstractC3680g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3694u(String value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // md.AbstractC3680g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        M W10 = module.v().W();
        Intrinsics.checkNotNullExpressionValue(W10, "getStringType(...)");
        return W10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        return '\"' + ((String) b()) + '\"';
    }
}
