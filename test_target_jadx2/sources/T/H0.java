package t;

import android.util.Size;
import androidx.camera.core.impl.V0;
import s.C4301a;

/* loaded from: classes.dex */
final class H0 implements V0.e {

    /* renamed from: a, reason: collision with root package name */
    static final H0 f41742a = new H0();

    H0() {
    }

    @Override // androidx.camera.core.impl.V0.e
    public void a(Size size, androidx.camera.core.impl.l1 l1Var, V0.b bVar) {
        androidx.camera.core.impl.V0 q10 = l1Var.q(null);
        androidx.camera.core.impl.V a02 = androidx.camera.core.impl.G0.a0();
        int o10 = androidx.camera.core.impl.V0.b().o();
        if (q10 != null) {
            o10 = q10.o();
            bVar.b(q10.c());
            bVar.d(q10.k());
            bVar.c(q10.i());
            a02 = q10.f();
        }
        bVar.v(a02);
        if (l1Var instanceof androidx.camera.core.impl.J0) {
            x.p.b(size, bVar);
        }
        C4301a c4301a = new C4301a(l1Var);
        bVar.z(c4301a.b0(o10));
        bVar.f(c4301a.c0(L0.b()));
        bVar.k(c4301a.f0(K0.b()));
        bVar.e(R0.e(c4301a.e0(V.c())));
        bVar.A(l1Var.G());
        bVar.y(l1Var.O());
        androidx.camera.core.impl.B0 d02 = androidx.camera.core.impl.B0.d0();
        d02.x(C4301a.f40680P, c4301a.d0(null));
        d02.x(C4301a.f40675K, Long.valueOf(c4301a.g0(-1L)));
        bVar.g(d02);
        bVar.g(c4301a.a0());
    }
}
