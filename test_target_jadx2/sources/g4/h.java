package g4;

import android.graphics.Bitmap;
import c3.AbstractC1721a;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
class h extends C3187b {
    protected h(AbstractC3142a abstractC3142a, n nVar, int i10, int i11) {
        super(abstractC3142a, nVar, i10, i11);
    }

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        AbstractC1721a.L("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    protected h(Bitmap bitmap, f3.h hVar, n nVar, int i10, int i11) {
        super(bitmap, hVar, nVar, i10, i11);
    }
}
