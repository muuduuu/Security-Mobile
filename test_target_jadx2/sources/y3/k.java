package y3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class k extends Drawable implements i {

    /* renamed from: c, reason: collision with root package name */
    float[] f45218c;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f45216a = new float[8];

    /* renamed from: b, reason: collision with root package name */
    final float[] f45217b = new float[8];

    /* renamed from: d, reason: collision with root package name */
    final Paint f45219d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    private boolean f45220e = false;

    /* renamed from: f, reason: collision with root package name */
    private float f45221f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f45222g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private int f45223h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f45224i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f45225j = false;

    /* renamed from: k, reason: collision with root package name */
    final Path f45226k = new Path();

    /* renamed from: l, reason: collision with root package name */
    final Path f45227l = new Path();

    /* renamed from: m, reason: collision with root package name */
    private int f45228m = 0;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f45229n = new RectF();

    /* renamed from: o, reason: collision with root package name */
    private int f45230o = 255;

    public k(int i10) {
        f(i10);
    }

    public static k a(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void g() {
        float[] fArr;
        float[] fArr2;
        this.f45226k.reset();
        this.f45227l.reset();
        this.f45229n.set(getBounds());
        RectF rectF = this.f45229n;
        float f10 = this.f45221f;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        int i10 = 0;
        if (this.f45220e) {
            this.f45227l.addCircle(this.f45229n.centerX(), this.f45229n.centerY(), Math.min(this.f45229n.width(), this.f45229n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f45217b;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f45216a[i11] + this.f45222g) - (this.f45221f / 2.0f);
                i11++;
            }
            this.f45227l.addRoundRect(this.f45229n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f45229n;
        float f11 = this.f45221f;
        rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f45222g + (this.f45224i ? this.f45221f : 0.0f);
        this.f45229n.inset(f12, f12);
        if (this.f45220e) {
            this.f45226k.addCircle(this.f45229n.centerX(), this.f45229n.centerY(), Math.min(this.f45229n.width(), this.f45229n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f45224i) {
            if (this.f45218c == null) {
                this.f45218c = new float[8];
            }
            while (true) {
                fArr2 = this.f45218c;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = this.f45216a[i10] - this.f45221f;
                i10++;
            }
            this.f45226k.addRoundRect(this.f45229n, fArr2, Path.Direction.CW);
        } else {
            this.f45226k.addRoundRect(this.f45229n, this.f45216a, Path.Direction.CW);
        }
        float f13 = -f12;
        this.f45229n.inset(f13, f13);
    }

    @Override // y3.i
    public void b(int i10, float f10) {
        if (this.f45223h != i10) {
            this.f45223h = i10;
            invalidateSelf();
        }
        if (this.f45221f != f10) {
            this.f45221f = f10;
            g();
            invalidateSelf();
        }
    }

    public boolean d() {
        return this.f45225j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f45219d.setColor(AbstractC5171e.c(this.f45228m, this.f45230o));
        this.f45219d.setStyle(Paint.Style.FILL);
        this.f45219d.setFilterBitmap(d());
        canvas.drawPath(this.f45226k, this.f45219d);
        if (this.f45221f != 0.0f) {
            this.f45219d.setColor(AbstractC5171e.c(this.f45223h, this.f45230o));
            this.f45219d.setStyle(Paint.Style.STROKE);
            this.f45219d.setStrokeWidth(this.f45221f);
            canvas.drawPath(this.f45227l, this.f45219d);
        }
    }

    @Override // y3.i
    public void e(boolean z10) {
        this.f45220e = z10;
        g();
        invalidateSelf();
    }

    public void f(int i10) {
        if (this.f45228m != i10) {
            this.f45228m = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45230o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return AbstractC5171e.b(AbstractC5171e.c(this.f45228m, this.f45230o));
    }

    @Override // y3.i
    public void h(boolean z10) {
        if (this.f45225j != z10) {
            this.f45225j = z10;
            invalidateSelf();
        }
    }

    @Override // y3.i
    public void j(boolean z10) {
        if (this.f45224i != z10) {
            this.f45224i = z10;
            g();
            invalidateSelf();
        }
    }

    @Override // y3.i
    public void n(float f10) {
        if (this.f45222g != f10) {
            this.f45222g = f10;
            g();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        g();
    }

    @Override // y3.i
    public void q(float f10) {
        b3.l.c(f10 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f45216a, f10);
        g();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f45230o) {
            this.f45230o = i10;
            invalidateSelf();
        }
    }

    @Override // y3.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f45216a, 0.0f);
        } else {
            b3.l.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f45216a, 0, 8);
        }
        g();
        invalidateSelf();
    }

    @Override // y3.i
    public void c(boolean z10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
