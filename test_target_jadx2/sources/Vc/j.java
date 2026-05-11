package Vc;

import Kc.InterfaceC0933e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public pd.c f11156a;

    @Override // Vc.i
    public InterfaceC0933e a(Zc.g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final pd.c b() {
        pd.c cVar = this.f11156a;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.v("resolver");
        return null;
    }

    public final void c(pd.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f11156a = cVar;
    }
}
