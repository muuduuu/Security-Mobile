package com.google.android.material.imageview;

import H7.k;
import V7.c;
import Y7.g;
import Y7.l;
import Y7.n;
import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.r;
import h.AbstractC3220a;

/* loaded from: classes2.dex */
public class ShapeableImageView extends r implements n {

    /* renamed from: s, reason: collision with root package name */
    private static final int f27127s = k.f3349y;

    /* renamed from: a, reason: collision with root package name */
    private final l f27128a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f27129b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f27130c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f27131d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f27132e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f27133f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f27134g;

    /* renamed from: h, reason: collision with root package name */
    private g f27135h;

    /* renamed from: i, reason: collision with root package name */
    private Y7.k f27136i;

    /* renamed from: j, reason: collision with root package name */
    private float f27137j;

    /* renamed from: k, reason: collision with root package name */
    private Path f27138k;

    /* renamed from: l, reason: collision with root package name */
    private int f27139l;

    /* renamed from: m, reason: collision with root package name */
    private int f27140m;

    /* renamed from: n, reason: collision with root package name */
    private int f27141n;

    /* renamed from: o, reason: collision with root package name */
    private int f27142o;

    /* renamed from: p, reason: collision with root package name */
    private int f27143p;

    /* renamed from: q, reason: collision with root package name */
    private int f27144q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27145r;

    class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f27146a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f27136i == null) {
                return;
            }
            if (ShapeableImageView.this.f27135h == null) {
                ShapeableImageView.this.f27135h = new g(ShapeableImageView.this.f27136i);
            }
            ShapeableImageView.this.f27129b.round(this.f27146a);
            ShapeableImageView.this.f27135h.setBounds(this.f27146a);
            ShapeableImageView.this.f27135h.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void g(Canvas canvas) {
        if (this.f27134g == null) {
            return;
        }
        this.f27131d.setStrokeWidth(this.f27137j);
        int colorForState = this.f27134g.getColorForState(getDrawableState(), this.f27134g.getDefaultColor());
        if (this.f27137j <= 0.0f || colorForState == 0) {
            return;
        }
        this.f27131d.setColor(colorForState);
        canvas.drawPath(this.f27133f, this.f27131d);
    }

    private boolean h() {
        return (this.f27143p == Integer.MIN_VALUE && this.f27144q == Integer.MIN_VALUE) ? false : true;
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    private void j(int i10, int i11) {
        this.f27129b.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f27128a.e(this.f27136i, 1.0f, this.f27129b, this.f27133f);
        this.f27138k.rewind();
        this.f27138k.addPath(this.f27133f);
        this.f27130c.set(0.0f, 0.0f, i10, i11);
        this.f27138k.addRect(this.f27130c, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f27142o;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f27144q;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f27139l : this.f27141n;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f27144q) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f27143p) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f27139l;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f27143p) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f27144q) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f27141n;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f27143p;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f27141n : this.f27139l;
    }

    public int getContentPaddingTop() {
        return this.f27140m;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public Y7.k getShapeAppearanceModel() {
        return this.f27136i;
    }

    public ColorStateList getStrokeColor() {
        return this.f27134g;
    }

    public float getStrokeWidth() {
        return this.f27137j;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f27138k, this.f27132e);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f27145r && isLayoutDirectionResolved()) {
            this.f27145r = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // Y7.n
    public void setShapeAppearanceModel(Y7.k kVar) {
        this.f27136i = kVar;
        g gVar = this.f27135h;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f27134g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(AbstractC3220a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f27137j != f10) {
            this.f27137j = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r0), attributeSet, i10);
        int i11 = f27127s;
        this.f27128a = l.k();
        this.f27133f = new Path();
        this.f27145r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f27132e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f27129b = new RectF();
        this.f27130c = new RectF();
        this.f27138k = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, H7.l.f3626e5, i10, i11);
        this.f27134g = c.a(context2, obtainStyledAttributes, H7.l.f3698m5);
        this.f27137j = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3707n5, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3635f5, 0);
        this.f27139l = dimensionPixelSize;
        this.f27140m = dimensionPixelSize;
        this.f27141n = dimensionPixelSize;
        this.f27142o = dimensionPixelSize;
        this.f27139l = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3662i5, dimensionPixelSize);
        this.f27140m = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3689l5, dimensionPixelSize);
        this.f27141n = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3671j5, dimensionPixelSize);
        this.f27142o = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3644g5, dimensionPixelSize);
        this.f27143p = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3680k5, Integer.MIN_VALUE);
        this.f27144q = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3653h5, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f27131d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f27136i = Y7.k.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }
}
