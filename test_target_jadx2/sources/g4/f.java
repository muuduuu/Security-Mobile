package g4;

import android.graphics.Bitmap;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
public interface f extends InterfaceC3189d {
    static f P1(AbstractC3142a abstractC3142a, n nVar, int i10, int i11) {
        return C3187b.x() ? new C3187b(abstractC3142a, nVar, i10, i11) : new h(abstractC3142a, nVar, i10, i11);
    }

    static f Q0(Bitmap bitmap, f3.h hVar, n nVar, int i10, int i11) {
        return C3187b.x() ? new C3187b(bitmap, hVar, nVar, i10, i11) : new h(bitmap, hVar, nVar, i10, i11);
    }

    static f U(AbstractC3142a abstractC3142a, n nVar, int i10) {
        return P1(abstractC3142a, nVar, i10, 0);
    }

    static f d2(Bitmap bitmap, f3.h hVar, n nVar, int i10) {
        return Q0(bitmap, hVar, nVar, i10, 0);
    }

    int c2();

    AbstractC3142a h0();

    int t0();
}
