package Ic;

import Ic.f;
import Kc.InterfaceC0933e;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import xd.n;

/* loaded from: classes3.dex */
public final class d extends rd.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n storageManager, b containingClass) {
        super(storageManager, containingClass);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
    }

    @Override // rd.e
    protected List i() {
        InterfaceC0933e l10 = l();
        Intrinsics.e(l10, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        f d12 = ((b) l10).d1();
        return Intrinsics.b(d12, f.a.f4418e) ? CollectionsKt.e(e.f4413E.a((b) l(), false)) : Intrinsics.b(d12, f.d.f4421e) ? CollectionsKt.e(e.f4413E.a((b) l(), true)) : CollectionsKt.j();
    }
}
