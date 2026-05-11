package y3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: J, reason: collision with root package name */
    private static boolean f45209J = false;

    /* renamed from: D, reason: collision with root package name */
    private final Paint f45210D;

    /* renamed from: E, reason: collision with root package name */
    private final Paint f45211E;

    /* renamed from: F, reason: collision with root package name */
    private final Bitmap f45212F;

    /* renamed from: G, reason: collision with root package name */
    private WeakReference f45213G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f45214H;

    /* renamed from: I, reason: collision with root package name */
    private RectF f45215I;

    public j(Resources resources, Bitmap bitmap, Paint paint, boolean z10) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f45210D = paint2;
        Paint paint3 = new Paint(1);
        this.f45211E = paint3;
        this.f45215I = null;
        this.f45212F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f45214H = z10;
    }

    public static boolean i() {
        return f45209J;
    }

    private void k() {
        WeakReference weakReference = this.f45213G;
        if (weakReference == null || weakReference.get() != this.f45212F) {
            this.f45213G = new WeakReference(this.f45212F);
            Paint paint = this.f45210D;
            Bitmap bitmap = this.f45212F;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f45257f = true;
        }
        if (this.f45257f) {
            this.f45210D.getShader().setLocalMatrix(this.f45275x);
            this.f45257f = false;
        }
        this.f45210D.setFilterBitmap(a());
    }

    @Override // y3.m, y3.i
    public void c(boolean z10) {
        this.f45214H = z10;
    }

    @Override // y3.m
    boolean d() {
        return super.d() && this.f45212F != null;
    }

    @Override // y3.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (n4.b.d()) {
            n4.b.a("RoundedBitmapDrawable#draw");
        }
        if (!d()) {
            super.draw(canvas);
            if (n4.b.d()) {
                n4.b.b();
                return;
            }
            return;
        }
        g();
        f();
        k();
        int save = canvas.save();
        canvas.concat(this.f45272u);
        if (this.f45214H || this.f45215I == null) {
            canvas.drawPath(this.f45256e, this.f45210D);
        } else {
            int save2 = canvas.save();
            canvas.clipRect(this.f45215I);
            canvas.drawPath(this.f45256e, this.f45210D);
            canvas.restoreToCount(save2);
        }
        float f10 = this.f45255d;
        if (f10 > 0.0f) {
            this.f45211E.setStrokeWidth(f10);
            this.f45211E.setColor(AbstractC5171e.c(this.f45258g, this.f45210D.getAlpha()));
            canvas.drawPath(this.f45259h, this.f45211E);
        }
        canvas.restoreToCount(save);
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    @Override // y3.m
    protected void g() {
        super.g();
        if (this.f45214H) {
            return;
        }
        if (this.f45215I == null) {
            this.f45215I = new RectF();
        }
        this.f45275x.mapRect(this.f45215I, this.f45265n);
    }

    @Override // y3.m, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.f45210D.getAlpha()) {
            this.f45210D.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // y3.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f45210D.setColorFilter(colorFilter);
    }
}
