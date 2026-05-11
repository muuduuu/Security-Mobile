package t;

import androidx.camera.core.impl.C1453o0;
import androidx.camera.core.impl.T;
import s.C4301a;

/* loaded from: classes.dex */
final class B1 extends W {

    /* renamed from: c, reason: collision with root package name */
    static final B1 f41711c = new B1(new x.k());

    /* renamed from: b, reason: collision with root package name */
    private final x.k f41712b;

    private B1(x.k kVar) {
        this.f41712b = kVar;
    }

    @Override // t.W, androidx.camera.core.impl.T.b
    public void a(androidx.camera.core.impl.l1 l1Var, T.a aVar) {
        super.a(l1Var, aVar);
        if (!(l1Var instanceof C1453o0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C1453o0 c1453o0 = (C1453o0) l1Var;
        C4301a.C0609a c0609a = new C4301a.C0609a();
        if (c1453o0.h0()) {
            this.f41712b.a(c1453o0.a0(), c0609a);
        }
        aVar.e(c0609a.a());
    }
}
