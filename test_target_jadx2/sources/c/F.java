package C;

import C.O;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1469x;
import java.io.IOException;

/* loaded from: classes.dex */
final class F implements M.y {
    F() {
    }

    private static M.z b(P p10, E.g gVar, androidx.camera.core.n nVar) {
        return M.z.k(nVar, gVar, p10.b(), p10.f(), p10.g(), d(nVar));
    }

    private static M.z c(P p10, E.g gVar, androidx.camera.core.n nVar) {
        Size size = new Size(nVar.getWidth(), nVar.getHeight());
        int f10 = p10.f() - gVar.s();
        Size e10 = e(f10, size);
        Matrix d10 = E.r.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, e10.getWidth(), e10.getHeight()), f10);
        return M.z.l(nVar, gVar, e10, f(p10.b(), d10), gVar.s(), g(p10.g(), d10), d(nVar));
    }

    private static InterfaceC1469x d(androidx.camera.core.n nVar) {
        return nVar.G() instanceof H.c ? ((H.c) nVar.G()).e() : InterfaceC1469x.a.l();
    }

    private static Size e(int i10, Size size) {
        return E.r.i(E.r.v(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // M.y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public M.z apply(O.b bVar) {
        E.g j10;
        androidx.camera.core.n a10 = bVar.a();
        P b10 = bVar.b();
        if (L.b.i(a10.getFormat())) {
            try {
                j10 = E.g.j(a10);
                a10.S()[0].m().rewind();
            } catch (IOException e10) {
                throw new A.X(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            j10 = null;
        }
        if (!C0746y.f728g.b(a10)) {
            return b(b10, j10, a10);
        }
        y0.f.h(j10, "JPEG image must have exif.");
        return c(b10, j10, a10);
    }
}
