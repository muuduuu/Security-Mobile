package y3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class g extends Drawable implements Drawable.Callback, r, q, InterfaceC5169c {

    /* renamed from: d, reason: collision with root package name */
    private static final Matrix f45200d = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    private Drawable f45201a;

    /* renamed from: b, reason: collision with root package name */
    private final C5170d f45202b = new C5170d();

    /* renamed from: c, reason: collision with root package name */
    protected r f45203c;

    public g(Drawable drawable) {
        this.f45201a = drawable;
        AbstractC5171e.d(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // y3.r
    public void g(Matrix matrix) {
        u(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f45201a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f45201a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f45201a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f45201a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f45201a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f45201a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f45201a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // y3.InterfaceC5169c
    public Drawable l(Drawable drawable) {
        return v(drawable);
    }

    @Override // y3.r
    public void m(RectF rectF) {
        r rVar = this.f45203c;
        if (rVar != null) {
            rVar.m(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f45201a;
        return drawable == null ? super.onLevelChange(i10) : drawable.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f45201a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // y3.q
    public void r(r rVar) {
        this.f45203c = rVar;
    }

    @Override // y3.InterfaceC5169c
    public Drawable s() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f45202b.b(i10);
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45202b.c(colorFilter);
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f45202b.d(z10);
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.setDither(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f45202b.e(z10);
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f45201a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f45201a;
        return drawable == null ? visible : drawable.setVisible(z10, z11);
    }

    protected void u(Matrix matrix) {
        r rVar = this.f45203c;
        if (rVar != null) {
            rVar.g(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public Drawable v(Drawable drawable) {
        Drawable w10 = w(drawable);
        invalidateSelf();
        return w10;
    }

    protected Drawable w(Drawable drawable) {
        Drawable drawable2 = this.f45201a;
        AbstractC5171e.d(drawable2, null, null);
        AbstractC5171e.d(drawable, null, null);
        AbstractC5171e.e(drawable, this.f45202b);
        AbstractC5171e.a(drawable, this);
        AbstractC5171e.d(drawable, this, this);
        this.f45201a = drawable;
        return drawable2;
    }
}
