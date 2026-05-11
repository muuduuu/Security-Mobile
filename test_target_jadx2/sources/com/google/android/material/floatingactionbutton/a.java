package com.google.android.material.floatingactionbutton;

import Y7.k;
import Y7.l;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    private final Paint f27047b;

    /* renamed from: h, reason: collision with root package name */
    float f27053h;

    /* renamed from: i, reason: collision with root package name */
    private int f27054i;

    /* renamed from: j, reason: collision with root package name */
    private int f27055j;

    /* renamed from: k, reason: collision with root package name */
    private int f27056k;

    /* renamed from: l, reason: collision with root package name */
    private int f27057l;

    /* renamed from: m, reason: collision with root package name */
    private int f27058m;

    /* renamed from: o, reason: collision with root package name */
    private k f27060o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f27061p;

    /* renamed from: a, reason: collision with root package name */
    private final l f27046a = l.k();

    /* renamed from: c, reason: collision with root package name */
    private final Path f27048c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f27049d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f27050e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f27051f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final b f27052g = new b();

    /* renamed from: n, reason: collision with root package name */
    private boolean f27059n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.f27060o = kVar;
        Paint paint = new Paint(1);
        this.f27047b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        copyBounds(this.f27049d);
        float height = this.f27053h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{androidx.core.graphics.d.k(this.f27054i, this.f27058m), androidx.core.graphics.d.k(this.f27055j, this.f27058m), androidx.core.graphics.d.k(androidx.core.graphics.d.p(this.f27055j, 0), this.f27058m), androidx.core.graphics.d.k(androidx.core.graphics.d.p(this.f27057l, 0), this.f27058m), androidx.core.graphics.d.k(this.f27057l, this.f27058m), androidx.core.graphics.d.k(this.f27056k, this.f27058m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f27051f.set(getBounds());
        return this.f27051f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f27058m = colorStateList.getColorForState(getState(), this.f27058m);
        }
        this.f27061p = colorStateList;
        this.f27059n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f27053h != f10) {
            this.f27053h = f10;
            this.f27047b.setStrokeWidth(f10 * 1.3333f);
            this.f27059n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f27059n) {
            this.f27047b.setShader(a());
            this.f27059n = false;
        }
        float strokeWidth = this.f27047b.getStrokeWidth() / 2.0f;
        copyBounds(this.f27049d);
        this.f27050e.set(this.f27049d);
        float min = Math.min(this.f27060o.r().a(b()), this.f27050e.width() / 2.0f);
        if (this.f27060o.u(b())) {
            this.f27050e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f27050e, min, min, this.f27047b);
        }
    }

    void e(int i10, int i11, int i12, int i13) {
        this.f27054i = i10;
        this.f27055j = i11;
        this.f27056k = i12;
        this.f27057l = i13;
    }

    public void f(k kVar) {
        this.f27060o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f27052g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f27053h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f27060o.u(b())) {
            outline.setRoundRect(getBounds(), this.f27060o.r().a(b()));
            return;
        }
        copyBounds(this.f27049d);
        this.f27050e.set(this.f27049d);
        this.f27046a.e(this.f27060o, 1.0f, this.f27050e, this.f27048c);
        if (this.f27048c.isConvex()) {
            outline.setConvexPath(this.f27048c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f27060o.u(b())) {
            return true;
        }
        int round = Math.round(this.f27053h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f27061p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f27059n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f27061p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f27058m)) != this.f27058m) {
            this.f27059n = true;
            this.f27058m = colorForState;
        }
        if (this.f27059n) {
            invalidateSelf();
        }
        return this.f27059n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f27047b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27047b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
