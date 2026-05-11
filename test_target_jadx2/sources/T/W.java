package t;

import androidx.camera.core.impl.T;
import s.C4301a;

/* loaded from: classes.dex */
class W implements T.b {

    /* renamed from: a, reason: collision with root package name */
    static final W f41935a = new W();

    W() {
    }

    @Override // androidx.camera.core.impl.T.b
    public void a(androidx.camera.core.impl.l1 l1Var, T.a aVar) {
        androidx.camera.core.impl.T z10 = l1Var.z(null);
        androidx.camera.core.impl.V a02 = androidx.camera.core.impl.G0.a0();
        int k10 = androidx.camera.core.impl.T.b().k();
        if (z10 != null) {
            k10 = z10.k();
            aVar.a(z10.c());
            a02 = z10.g();
        }
        aVar.s(a02);
        C4301a c4301a = new C4301a(l1Var);
        aVar.v(c4301a.b0(k10));
        aVar.c(R0.e(c4301a.e0(V.c())));
        aVar.e(c4301a.a0());
    }
}
