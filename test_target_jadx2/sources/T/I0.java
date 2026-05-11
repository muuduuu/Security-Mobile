package t;

import android.content.Context;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.m1;

/* loaded from: classes.dex */
public final class I0 implements androidx.camera.core.impl.m1 {

    /* renamed from: b, reason: collision with root package name */
    final C4545g1 f41752b;

    public I0(Context context) {
        this.f41752b = C4545g1.c(context);
    }

    @Override // androidx.camera.core.impl.m1
    public androidx.camera.core.impl.V a(m1.b bVar, int i10) {
        androidx.camera.core.impl.B0 d02 = androidx.camera.core.impl.B0.d0();
        V0.b bVar2 = new V0.b();
        bVar2.z(W1.b(bVar, i10));
        d02.x(androidx.camera.core.impl.l1.f14639x, bVar2.o());
        d02.x(androidx.camera.core.impl.l1.f14641z, H0.f41742a);
        T.a aVar = new T.a();
        aVar.v(W1.a(bVar, i10));
        d02.x(androidx.camera.core.impl.l1.f14640y, aVar.h());
        d02.x(androidx.camera.core.impl.l1.f14631A, bVar == m1.b.IMAGE_CAPTURE ? B1.f41711c : W.f41935a);
        if (bVar == m1.b.PREVIEW) {
            d02.x(InterfaceC1457q0.f14681t, this.f41752b.f());
        }
        d02.x(InterfaceC1457q0.f14676o, Integer.valueOf(this.f41752b.d(true).getRotation()));
        if (bVar == m1.b.VIDEO_CAPTURE || bVar == m1.b.STREAM_SHARING) {
            d02.x(androidx.camera.core.impl.l1.f14634D, Boolean.TRUE);
        }
        return androidx.camera.core.impl.G0.b0(d02);
    }
}
