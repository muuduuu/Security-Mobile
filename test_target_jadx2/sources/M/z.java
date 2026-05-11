package M;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1469x;

/* loaded from: classes.dex */
public abstract class z {
    public static z j(Bitmap bitmap, E.g gVar, Rect rect, int i10, Matrix matrix, InterfaceC1469x interfaceC1469x) {
        return new C0955b(bitmap, gVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, interfaceC1469x);
    }

    public static z k(androidx.camera.core.n nVar, E.g gVar, Rect rect, int i10, Matrix matrix, InterfaceC1469x interfaceC1469x) {
        return l(nVar, gVar, new Size(nVar.getWidth(), nVar.getHeight()), rect, i10, matrix, interfaceC1469x);
    }

    public static z l(androidx.camera.core.n nVar, E.g gVar, Size size, Rect rect, int i10, Matrix matrix, InterfaceC1469x interfaceC1469x) {
        if (L.b.i(nVar.getFormat())) {
            y0.f.h(gVar, "JPEG image must have Exif.");
        }
        return new C0955b(nVar, gVar, nVar.getFormat(), size, rect, i10, matrix, interfaceC1469x);
    }

    public static z m(byte[] bArr, E.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC1469x interfaceC1469x) {
        return new C0955b(bArr, gVar, i10, size, rect, i11, matrix, interfaceC1469x);
    }

    public abstract InterfaceC1469x a();

    public abstract Rect b();

    public abstract Object c();

    public abstract E.g d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return E.r.h(b(), h());
    }
}
