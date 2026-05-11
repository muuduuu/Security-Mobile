package bd;

import bd.w;
import dd.C3037n;
import gd.AbstractC3218a;
import hd.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* renamed from: bd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1676c {
    public static final w a(C3037n proto, fd.c nameResolver, fd.g typeTable, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        i.f propertySignature = AbstractC3218a.f33677d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        AbstractC3218a.d dVar = (AbstractC3218a.d) fd.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            d.a c10 = hd.i.f34080a.c(proto, nameResolver, typeTable, z12);
            if (c10 == null) {
                return null;
            }
            return w.f19048b.b(c10);
        }
        if (!z11 || !dVar.F()) {
            return null;
        }
        w.a aVar = w.f19048b;
        AbstractC3218a.c A10 = dVar.A();
        Intrinsics.checkNotNullExpressionValue(A10, "getSyntheticMethod(...)");
        return aVar.c(nameResolver, A10);
    }

    public static /* synthetic */ w b(C3037n c3037n, fd.c cVar, fd.g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        boolean z13 = (i10 & 8) != 0 ? false : z10;
        boolean z14 = (i10 & 16) != 0 ? false : z11;
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(c3037n, cVar, gVar, z13, z14, z12);
    }
}
