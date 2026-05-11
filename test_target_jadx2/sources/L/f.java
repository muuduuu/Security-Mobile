package L;

import A.Y;
import L.c;
import androidx.camera.core.impl.AbstractC1471y;
import androidx.camera.core.impl.EnumC1461t;
import androidx.camera.core.impl.EnumC1465v;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.r;
import androidx.camera.core.n;

/* loaded from: classes.dex */
public final class f extends a {
    public f(int i10, c.a aVar) {
        super(i10, aVar);
    }

    private boolean d(Y y10) {
        InterfaceC1469x a10 = AbstractC1471y.a(y10);
        return (a10.k() == EnumC1461t.LOCKED_FOCUSED || a10.k() == EnumC1461t.PASSIVE_FOCUSED) && a10.h() == r.CONVERGED && a10.d() == EnumC1465v.CONVERGED;
    }

    @Override // L.a, L.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(n nVar) {
        if (d(nVar.G())) {
            super.b(nVar);
        } else {
            this.f5615d.a(nVar);
        }
    }
}
