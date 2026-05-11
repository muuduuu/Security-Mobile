package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f14914a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f14916c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f14917d;

    /* renamed from: e, reason: collision with root package name */
    private float f14918e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f14921h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f14922i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f14923j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14919f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14920g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f14924k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f14915b = new Paint(5);

    d(ColorStateList colorStateList, float f10) {
        this.f14914a = f10;
        e(colorStateList);
        this.f14916c = new RectF();
        this.f14917d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f14921h = colorStateList;
        this.f14915b.setColor(colorStateList.getColorForState(getState(), this.f14921h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f14916c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f14917d.set(rect);
        if (this.f14919f) {
            this.f14917d.inset((int) Math.ceil(e.a(this.f14918e, this.f14914a, this.f14920g)), (int) Math.ceil(e.b(this.f14918e, this.f14914a, this.f14920g)));
            this.f14916c.set(this.f14917d);
        }
    }

    public ColorStateList b() {
        return this.f14921h;
    }

    float c() {
        return this.f14918e;
    }

    public float d() {
        return this.f14914a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f14915b;
        if (this.f14922i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f14922i);
            z10 = true;
        }
        RectF rectF = this.f14916c;
        float f10 = this.f14914a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f14918e && this.f14919f == z10 && this.f14920g == z11) {
            return;
        }
        this.f14918e = f10;
        this.f14919f = z10;
        this.f14920g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f14917d, this.f14914a);
    }

    void h(float f10) {
        if (f10 == this.f14914a) {
            return;
        }
        this.f14914a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f14923j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f14921h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f14921h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f14915b.getColor();
        if (z10) {
            this.f14915b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f14923j;
        if (colorStateList2 == null || (mode = this.f14924k) == null) {
            return z10;
        }
        this.f14922i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f14915b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14915b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f14923j = colorStateList;
        this.f14922i = a(colorStateList, this.f14924k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f14924k = mode;
        this.f14922i = a(this.f14923j, mode);
        invalidateSelf();
    }
}
