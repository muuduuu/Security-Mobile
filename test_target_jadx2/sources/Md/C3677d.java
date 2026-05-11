package md;

import Kc.G;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: md.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3677d extends AbstractC3688o {
    public C3677d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // md.AbstractC3680g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        M t10 = module.v().t();
        Intrinsics.checkNotNullExpressionValue(t10, "getByteType(...)");
        return t10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}
