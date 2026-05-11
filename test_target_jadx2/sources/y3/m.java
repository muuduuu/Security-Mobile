package y3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends Drawable implements i, q {

    /* renamed from: C, reason: collision with root package name */
    private r f45251C;

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f45252a;

    /* renamed from: k, reason: collision with root package name */
    float[] f45262k;

    /* renamed from: p, reason: collision with root package name */
    RectF f45267p;

    /* renamed from: v, reason: collision with root package name */
    Matrix f45273v;

    /* renamed from: w, reason: collision with root package name */
    Matrix f45274w;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f45253b = false;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f45254c = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f45255d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    protected final Path f45256e = new Path();

    /* renamed from: f, reason: collision with root package name */
    protected boolean f45257f = true;

    /* renamed from: g, reason: collision with root package name */
    protected int f45258g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected final Path f45259h = new Path();

    /* renamed from: i, reason: collision with root package name */
    private final float[] f45260i = new float[8];

    /* renamed from: j, reason: collision with root package name */
    final float[] f45261j = new float[8];

    /* renamed from: l, reason: collision with root package name */
    final RectF f45263l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    final RectF f45264m = new RectF();

    /* renamed from: n, reason: collision with root package name */
    final RectF f45265n = new RectF();

    /* renamed from: o, reason: collision with root package name */
    final RectF f45266o = new RectF();

    /* renamed from: q, reason: collision with root package name */
    final Matrix f45268q = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    final Matrix f45269r = new Matrix();

    /* renamed from: s, reason: collision with root package name */
    final Matrix f45270s = new Matrix();

    /* renamed from: t, reason: collision with root package name */
    final Matrix f45271t = new Matrix();

    /* renamed from: u, reason: collision with root package name */
    final Matrix f45272u = new Matrix();

    /* renamed from: x, reason: collision with root package name */
    final Matrix f45275x = new Matrix();

    /* renamed from: y, reason: collision with root package name */
    private float f45276y = 0.0f;

    /* renamed from: z, reason: collision with root package name */
    private boolean f45277z = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f45249A = false;

    /* renamed from: B, reason: collision with root package name */
    private boolean f45250B = true;

    m(Drawable drawable) {
        this.f45252a = drawable;
    }

    public boolean a() {
        return this.f45249A;
    }

    @Override // y3.i
    public void b(int i10, float f10) {
        if (this.f45258g == i10 && this.f45255d == f10) {
            return;
        }
        this.f45258g = i10;
        this.f45255d = f10;
        this.f45250B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f45252a.clearColorFilter();
    }

    boolean d() {
        return this.f45253b || this.f45254c || this.f45255d > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (n4.b.d()) {
            n4.b.a("RoundedDrawable#draw");
        }
        this.f45252a.draw(canvas);
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    @Override // y3.i
    public void e(boolean z10) {
        this.f45253b = z10;
        this.f45250B = true;
        invalidateSelf();
    }

    protected void f() {
        float[] fArr;
        if (this.f45250B) {
            this.f45259h.reset();
            RectF rectF = this.f45263l;
            float f10 = this.f45255d;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            if (this.f45253b) {
                this.f45259h.addCircle(this.f45263l.centerX(), this.f45263l.centerY(), Math.min(this.f45263l.width(), this.f45263l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.f45261j;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.f45260i[i10] + this.f45276y) - (this.f45255d / 2.0f);
                    i10++;
                }
                this.f45259h.addRoundRect(this.f45263l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f45263l;
            float f11 = this.f45255d;
            rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
            this.f45256e.reset();
            float f12 = this.f45276y + (this.f45277z ? this.f45255d : 0.0f);
            this.f45263l.inset(f12, f12);
            if (this.f45253b) {
                this.f45256e.addCircle(this.f45263l.centerX(), this.f45263l.centerY(), Math.min(this.f45263l.width(), this.f45263l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f45277z) {
                if (this.f45262k == null) {
                    this.f45262k = new float[8];
                }
                for (int i11 = 0; i11 < this.f45261j.length; i11++) {
                    this.f45262k[i11] = this.f45260i[i11] - this.f45255d;
                }
                this.f45256e.addRoundRect(this.f45263l, this.f45262k, Path.Direction.CW);
            } else {
                this.f45256e.addRoundRect(this.f45263l, this.f45260i, Path.Direction.CW);
            }
            float f13 = -f12;
            this.f45263l.inset(f13, f13);
            this.f45256e.setFillType(Path.FillType.WINDING);
            this.f45250B = false;
        }
    }

    protected void g() {
        Matrix matrix;
        r rVar = this.f45251C;
        if (rVar != null) {
            rVar.g(this.f45270s);
            this.f45251C.m(this.f45263l);
        } else {
            this.f45270s.reset();
            this.f45263l.set(getBounds());
        }
        this.f45265n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f45266o.set(this.f45252a.getBounds());
        Matrix matrix2 = this.f45268q;
        RectF rectF = this.f45265n;
        RectF rectF2 = this.f45266o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix2.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f45277z) {
            RectF rectF3 = this.f45267p;
            if (rectF3 == null) {
                this.f45267p = new RectF(this.f45263l);
            } else {
                rectF3.set(this.f45263l);
            }
            RectF rectF4 = this.f45267p;
            float f10 = this.f45255d;
            rectF4.inset(f10, f10);
            if (this.f45273v == null) {
                this.f45273v = new Matrix();
            }
            this.f45273v.setRectToRect(this.f45263l, this.f45267p, scaleToFit);
        } else {
            Matrix matrix3 = this.f45273v;
            if (matrix3 != null) {
                matrix3.reset();
            }
        }
        if (!this.f45270s.equals(this.f45271t) || !this.f45268q.equals(this.f45269r) || ((matrix = this.f45273v) != null && !matrix.equals(this.f45274w))) {
            this.f45257f = true;
            this.f45270s.invert(this.f45272u);
            this.f45275x.set(this.f45270s);
            if (this.f45277z) {
                this.f45275x.postConcat(this.f45273v);
            }
            this.f45275x.preConcat(this.f45268q);
            this.f45271t.set(this.f45270s);
            this.f45269r.set(this.f45268q);
            if (this.f45277z) {
                Matrix matrix4 = this.f45274w;
                if (matrix4 == null) {
                    this.f45274w = new Matrix(this.f45273v);
                } else {
                    matrix4.set(this.f45273v);
                }
            } else {
                Matrix matrix5 = this.f45274w;
                if (matrix5 != null) {
                    matrix5.reset();
                }
            }
        }
        if (this.f45263l.equals(this.f45264m)) {
            return;
        }
        this.f45250B = true;
        this.f45264m.set(this.f45263l);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45252a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f45252a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f45252a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f45252a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f45252a.getOpacity();
    }

    @Override // y3.i
    public void h(boolean z10) {
        if (this.f45249A != z10) {
            this.f45249A = z10;
            invalidateSelf();
        }
    }

    @Override // y3.i
    public void j(boolean z10) {
        if (this.f45277z != z10) {
            this.f45277z = z10;
            this.f45250B = true;
            invalidateSelf();
        }
    }

    @Override // y3.i
    public void n(float f10) {
        if (this.f45276y != f10) {
            this.f45276y = f10;
            this.f45250B = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f45252a.setBounds(rect);
    }

    @Override // y3.i
    public void q(float f10) {
        b3.l.i(f10 >= 0.0f);
        Arrays.fill(this.f45260i, f10);
        this.f45254c = f10 != 0.0f;
        this.f45250B = true;
        invalidateSelf();
    }

    @Override // y3.q
    public void r(r rVar) {
        this.f45251C = rVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f45252a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f45252a.setColorFilter(i10, mode);
    }

    @Override // y3.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f45260i, 0.0f);
            this.f45254c = false;
        } else {
            b3.l.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f45260i, 0, 8);
            this.f45254c = false;
            for (int i10 = 0; i10 < 8; i10++) {
                this.f45254c |= fArr[i10] > 0.0f;
            }
        }
        this.f45250B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45252a.setColorFilter(colorFilter);
    }

    public void c(boolean z10) {
    }
}
