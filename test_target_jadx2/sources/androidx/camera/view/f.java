package androidx.camera.view;

import A.AbstractC0700h0;
import A.I0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.m;

/* loaded from: classes.dex */
final class f {

    /* renamed from: i, reason: collision with root package name */
    private static final m.d f14826i = m.d.FILL_CENTER;

    /* renamed from: a, reason: collision with root package name */
    private Size f14827a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f14828b;

    /* renamed from: c, reason: collision with root package name */
    private int f14829c;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f14830d;

    /* renamed from: e, reason: collision with root package name */
    private int f14831e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14832f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14833g;

    /* renamed from: h, reason: collision with root package name */
    private m.d f14834h = f14826i;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14835a;

        static {
            int[] iArr = new int[m.d.values().length];
            f14835a = iArr;
            try {
                iArr[m.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14835a[m.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14835a[m.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14835a[m.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14835a[m.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14835a[m.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    f() {
    }

    private static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f14833g ? this.f14829c : -E.c.b(this.f14831e);
    }

    private Size f() {
        return E.r.i(this.f14829c) ? new Size(this.f14828b.height(), this.f14828b.width()) : new Size(this.f14828b.width(), this.f14828b.height());
    }

    private RectF l(Size size, int i10) {
        y0.f.i(m());
        Matrix j10 = j(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f14827a.getWidth(), this.f14827a.getHeight());
        j10.mapRect(rectF);
        return rectF;
    }

    private boolean m() {
        return (this.f14828b == null || this.f14827a == null || !(!this.f14833g || this.f14831e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, m.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f14835a[dVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                AbstractC0700h0.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == m.d.FIT_CENTER || dVar == m.d.FIT_START || dVar == m.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    Bitmap a(Bitmap bitmap, Size size, int i10) {
        if (!m()) {
            return bitmap;
        }
        Matrix k10 = k();
        RectF l10 = l(size, i10);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(k10);
        matrix.postScale(l10.width() / this.f14827a.getWidth(), l10.height() / this.f14827a.getHeight());
        matrix.postTranslate(l10.left, l10.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    Matrix c(Size size, int i10, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size f10 = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, f10.getWidth(), f10.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f14834h);
        matrix.mapRect(rectF2);
        return i10 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    m.d g() {
        return this.f14834h;
    }

    Matrix h(Size size, int i10) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f14830d);
        matrix.postConcat(j(size, i10));
        return matrix;
    }

    Rect i() {
        return this.f14828b;
    }

    Matrix j(Size size, int i10) {
        y0.f.i(m());
        Matrix d10 = E.r.d(new RectF(this.f14828b), n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i10), this.f14829c);
        if (this.f14832f && this.f14833g) {
            if (E.r.i(this.f14829c)) {
                d10.preScale(1.0f, -1.0f, this.f14828b.centerX(), this.f14828b.centerY());
            } else {
                d10.preScale(-1.0f, 1.0f, this.f14828b.centerX(), this.f14828b.centerY());
            }
        }
        return d10;
    }

    Matrix k() {
        y0.f.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f14827a.getWidth(), this.f14827a.getHeight());
        return E.r.d(rectF, rectF, e());
    }

    boolean n(Size size) {
        return E.r.k(size, true, f(), false);
    }

    void o(int i10, int i11) {
        if (this.f14833g) {
            this.f14829c = i10;
            this.f14831e = i11;
        }
    }

    void q(m.d dVar) {
        this.f14834h = dVar;
    }

    void r(I0.h hVar, Size size, boolean z10) {
        AbstractC0700h0.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z10);
        this.f14828b = hVar.a();
        this.f14829c = hVar.b();
        this.f14831e = hVar.d();
        this.f14827a = size;
        this.f14832f = z10;
        this.f14833g = hVar.e();
        this.f14830d = hVar.c();
    }

    void s(Size size, int i10, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            AbstractC0700h0.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z10 = false;
                boolean z11 = (!this.f14833g || display == null || display.getRotation() == this.f14831e) ? false : true;
                if (!this.f14833g && e() != 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    AbstractC0700h0.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF l10 = l(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(l10.width() / this.f14827a.getWidth());
            view.setScaleY(l10.height() / this.f14827a.getHeight());
            view.setTranslationX(l10.left - view.getLeft());
            view.setTranslationY(l10.top - view.getTop());
        }
    }
}
