package md;

import Hc.j;
import Kc.AbstractC0951x;
import Kc.G;
import Kc.InterfaceC0933e;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.M;

/* renamed from: md.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3696w extends AbstractC3673A {
    public C3696w(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // md.AbstractC3680g
    public AbstractC5197E a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        InterfaceC0933e a10 = AbstractC0951x.a(module, j.a.f3894A0);
        M y10 = a10 != null ? a10.y() : null;
        return y10 == null ? kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NOT_FOUND_UNSIGNED_TYPE, "UByte") : y10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        return ((Number) b()).intValue() + ".toUByte()";
    }
}
