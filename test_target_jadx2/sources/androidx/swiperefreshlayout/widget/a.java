package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.AbstractC1484a0;
import p1.AbstractC3786a;

/* loaded from: classes.dex */
class a extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f17832a;

    /* renamed from: b, reason: collision with root package name */
    private int f17833b;

    /* renamed from: c, reason: collision with root package name */
    private int f17834c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private static class C0306a extends OvalShape {

        /* renamed from: a, reason: collision with root package name */
        private Paint f17835a = new Paint();

        /* renamed from: b, reason: collision with root package name */
        private int f17836b;

        /* renamed from: c, reason: collision with root package name */
        private a f17837c;

        C0306a(a aVar, int i10) {
            this.f17837c = aVar;
            this.f17836b = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f10 = i10 / 2;
            this.f17835a.setShader(new RadialGradient(f10, f10, this.f17836b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f17837c.getWidth() / 2;
            float height = this.f17837c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f17835a);
            canvas.drawCircle(width, height, r0 - this.f17836b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f17833b = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(AbstractC3786a.f38295f);
        this.f17834c = obtainStyledAttributes.getColor(AbstractC3786a.f38296g, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC1484a0.y0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0306a(this, this.f17833b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f17833b, i11, i10, 503316480);
            int i12 = this.f17833b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f17834c);
        AbstractC1484a0.u0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f17832a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f17832a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f17832a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f17833b * 2), getMeasuredHeight() + (this.f17833b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f17834c = i10;
        }
    }
}
