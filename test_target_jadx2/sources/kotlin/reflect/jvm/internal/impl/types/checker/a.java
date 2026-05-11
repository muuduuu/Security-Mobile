package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import yd.d0;

/* loaded from: classes3.dex */
public abstract class a {
    public static final d0 a(boolean z10, boolean z11, b typeSystemContext, f kotlinTypePreparator, g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new d0(z10, z11, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ d0 b(boolean z10, boolean z11, b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = o.f36699a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f36673a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f36674a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
