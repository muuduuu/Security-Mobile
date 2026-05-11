package androidx.camera.view;

import A.AbstractC0708l0;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;

/* loaded from: classes.dex */
class o extends AbstractC0708l0 {

    /* renamed from: e, reason: collision with root package name */
    static final PointF f14868e = new PointF(2.0f, 2.0f);

    /* renamed from: b, reason: collision with root package name */
    private final f f14869b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f14870c = null;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f14871d;

    o(f fVar) {
        this.f14869b = fVar;
    }

    @Override // A.AbstractC0708l0
    protected PointF a(float f10, float f11) {
        float[] fArr = {f10, f11};
        synchronized (this) {
            try {
                Matrix matrix = this.f14871d;
                if (matrix == null) {
                    return f14868e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f(Size size, int i10) {
        Rect rect;
        E.q.a();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f14870c) != null) {
                    this.f14871d = this.f14869b.c(size, i10, rect);
                    return;
                }
                this.f14871d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(Rect rect) {
        e(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f14870c = rect;
        }
    }
}
