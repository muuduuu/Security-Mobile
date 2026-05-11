package y3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class l extends g implements i {

    /* renamed from: e, reason: collision with root package name */
    b f45231e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f45232f;

    /* renamed from: g, reason: collision with root package name */
    private RectF f45233g;

    /* renamed from: h, reason: collision with root package name */
    private Matrix f45234h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f45235i;

    /* renamed from: j, reason: collision with root package name */
    final float[] f45236j;

    /* renamed from: k, reason: collision with root package name */
    final Paint f45237k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45238l;

    /* renamed from: m, reason: collision with root package name */
    private float f45239m;

    /* renamed from: n, reason: collision with root package name */
    private int f45240n;

    /* renamed from: o, reason: collision with root package name */
    private int f45241o;

    /* renamed from: p, reason: collision with root package name */
    private float f45242p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f45243q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f45244r;

    /* renamed from: s, reason: collision with root package name */
    private final Path f45245s;

    /* renamed from: t, reason: collision with root package name */
    private final Path f45246t;

    /* renamed from: u, reason: collision with root package name */
    private final RectF f45247u;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45248a;

        static {
            int[] iArr = new int[b.values().length];
            f45248a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45248a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public l(Drawable drawable) {
        super((Drawable) b3.l.g(drawable));
        this.f45231e = b.OVERLAY_COLOR;
        this.f45232f = new RectF();
        this.f45235i = new float[8];
        this.f45236j = new float[8];
        this.f45237k = new Paint(1);
        this.f45238l = false;
        this.f45239m = 0.0f;
        this.f45240n = 0;
        this.f45241o = 0;
        this.f45242p = 0.0f;
        this.f45243q = false;
        this.f45244r = false;
        this.f45245s = new Path();
        this.f45246t = new Path();
        this.f45247u = new RectF();
    }

    private void z() {
        float[] fArr;
        this.f45245s.reset();
        this.f45246t.reset();
        this.f45247u.set(getBounds());
        RectF rectF = this.f45247u;
        float f10 = this.f45242p;
        rectF.inset(f10, f10);
        if (this.f45231e == b.OVERLAY_COLOR) {
            this.f45245s.addRect(this.f45247u, Path.Direction.CW);
        }
        if (this.f45238l) {
            this.f45245s.addCircle(this.f45247u.centerX(), this.f45247u.centerY(), Math.min(this.f45247u.width(), this.f45247u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f45245s.addRoundRect(this.f45247u, this.f45235i, Path.Direction.CW);
        }
        RectF rectF2 = this.f45247u;
        float f11 = this.f45242p;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f45247u;
        float f12 = this.f45239m;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f45238l) {
            this.f45246t.addCircle(this.f45247u.centerX(), this.f45247u.centerY(), Math.min(this.f45247u.width(), this.f45247u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f45236j;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.f45235i[i10] + this.f45242p) - (this.f45239m / 2.0f);
                i10++;
            }
            this.f45246t.addRoundRect(this.f45247u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f45247u;
        float f13 = this.f45239m;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    @Override // y3.i
    public void b(int i10, float f10) {
        this.f45240n = i10;
        this.f45239m = f10;
        z();
        invalidateSelf();
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f45232f.set(getBounds());
        int i10 = a.f45248a[this.f45231e.ordinal()];
        if (i10 == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f45245s);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i10 == 2) {
            if (this.f45243q) {
                RectF rectF = this.f45233g;
                if (rectF == null) {
                    this.f45233g = new RectF(this.f45232f);
                    this.f45234h = new Matrix();
                } else {
                    rectF.set(this.f45232f);
                }
                RectF rectF2 = this.f45233g;
                float f10 = this.f45239m;
                rectF2.inset(f10, f10);
                this.f45234h.setRectToRect(this.f45232f, this.f45233g, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f45232f);
                canvas.concat(this.f45234h);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f45237k.setStyle(Paint.Style.FILL);
            this.f45237k.setColor(this.f45241o);
            this.f45237k.setStrokeWidth(0.0f);
            this.f45237k.setFilterBitmap(x());
            this.f45245s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f45245s, this.f45237k);
            if (this.f45238l) {
                float width = ((this.f45232f.width() - this.f45232f.height()) + this.f45239m) / 2.0f;
                float height = ((this.f45232f.height() - this.f45232f.width()) + this.f45239m) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f45232f;
                    float f11 = rectF3.left;
                    canvas.drawRect(f11, rectF3.top, f11 + width, rectF3.bottom, this.f45237k);
                    RectF rectF4 = this.f45232f;
                    float f12 = rectF4.right;
                    canvas.drawRect(f12 - width, rectF4.top, f12, rectF4.bottom, this.f45237k);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f45232f;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    canvas.drawRect(f13, f14, rectF5.right, f14 + height, this.f45237k);
                    RectF rectF6 = this.f45232f;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas.drawRect(f15, f16 - height, rectF6.right, f16, this.f45237k);
                }
            }
        }
        if (this.f45240n != 0) {
            this.f45237k.setStyle(Paint.Style.STROKE);
            this.f45237k.setColor(this.f45240n);
            this.f45237k.setStrokeWidth(this.f45239m);
            this.f45245s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f45246t, this.f45237k);
        }
    }

    @Override // y3.i
    public void e(boolean z10) {
        this.f45238l = z10;
        z();
        invalidateSelf();
    }

    @Override // y3.i
    public void h(boolean z10) {
        if (this.f45244r != z10) {
            this.f45244r = z10;
            invalidateSelf();
        }
    }

    @Override // y3.i
    public void j(boolean z10) {
        this.f45243q = z10;
        z();
        invalidateSelf();
    }

    @Override // y3.i
    public void n(float f10) {
        this.f45242p = f10;
        z();
        invalidateSelf();
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    @Override // y3.i
    public void q(float f10) {
        Arrays.fill(this.f45235i, f10);
        z();
        invalidateSelf();
    }

    @Override // y3.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f45235i, 0.0f);
        } else {
            b3.l.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f45235i, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f45244r;
    }

    public void y(int i10) {
        this.f45241o = i10;
        invalidateSelf();
    }

    @Override // y3.i
    public void c(boolean z10) {
    }
}
