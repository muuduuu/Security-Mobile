package com.google.android.material.timepicker;

import H7.d;
import H7.k;
import H7.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC1484a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator f27758a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27759b;

    /* renamed from: c, reason: collision with root package name */
    private float f27760c;

    /* renamed from: d, reason: collision with root package name */
    private float f27761d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27762e;

    /* renamed from: f, reason: collision with root package name */
    private int f27763f;

    /* renamed from: g, reason: collision with root package name */
    private final List f27764g;

    /* renamed from: h, reason: collision with root package name */
    private final int f27765h;

    /* renamed from: i, reason: collision with root package name */
    private final float f27766i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f27767j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f27768k;

    /* renamed from: l, reason: collision with root package name */
    private final int f27769l;

    /* renamed from: m, reason: collision with root package name */
    private float f27770m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27771n;

    /* renamed from: o, reason: collision with root package name */
    private double f27772o;

    /* renamed from: p, reason: collision with root package name */
    private int f27773p;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3110B);
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f27773p * ((float) Math.cos(this.f27772o))) + width;
        float f10 = height;
        float sin = (this.f27773p * ((float) Math.sin(this.f27772o))) + f10;
        this.f27767j.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f27765h, this.f27767j);
        double sin2 = Math.sin(this.f27772o);
        double cos2 = Math.cos(this.f27772o);
        this.f27767j.setStrokeWidth(this.f27769l);
        canvas.drawLine(width, f10, r1 + ((int) (cos2 * r6)), height + ((int) (r6 * sin2)), this.f27767j);
        canvas.drawCircle(width, f10, this.f27766i, this.f27767j);
    }

    private int e(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private Pair h(float f10) {
        float f11 = f();
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f11), Float.valueOf(f10));
    }

    private boolean i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float e10 = e(f10, f11);
        boolean z13 = false;
        boolean z14 = f() != e10;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f27759b) {
            z13 = true;
        }
        l(e10, z13);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f27770m = f11;
        this.f27772o = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f27773p * ((float) Math.cos(this.f27772o)));
        float sin = height + (this.f27773p * ((float) Math.sin(this.f27772o)));
        RectF rectF = this.f27768k;
        int i10 = this.f27765h;
        rectF.set(width - i10, sin - i10, width + i10, sin + i10);
        Iterator it = this.f27764g.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void b(c cVar) {
        this.f27764g.add(cVar);
    }

    public RectF d() {
        return this.f27768k;
    }

    public float f() {
        return this.f27770m;
    }

    public int g() {
        return this.f27765h;
    }

    public void j(int i10) {
        this.f27773p = i10;
        invalidate();
    }

    public void k(float f10) {
        l(f10, false);
    }

    public void l(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f27758a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m(f10, false);
            return;
        }
        Pair h10 = h(f10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h10.first).floatValue(), ((Float) h10.second).floatValue());
        this.f27758a = ofFloat;
        ofFloat.setDuration(200L);
        this.f27758a.addUpdateListener(new a());
        this.f27758a.addListener(new b());
        this.f27758a.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k(f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f27760c = x10;
            this.f27761d = y10;
            this.f27762e = true;
            this.f27771n = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f27760c);
            int i11 = (int) (y10 - this.f27761d);
            this.f27762e = (i10 * i10) + (i11 * i11) > this.f27763f;
            z11 = this.f27771n;
            z12 = actionMasked == 1;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f27771n |= i(x10, y10, z11, z10, z12);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27764g = new ArrayList();
        Paint paint = new Paint();
        this.f27767j = paint;
        this.f27768k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3380D1, i10, k.f3350z);
        this.f27773p = obtainStyledAttributes.getDimensionPixelSize(l.f3398F1, 0);
        this.f27765h = obtainStyledAttributes.getDimensionPixelSize(l.f3407G1, 0);
        this.f27769l = getResources().getDimensionPixelSize(d.f3209m);
        this.f27766i = r6.getDimensionPixelSize(d.f3207k);
        int color = obtainStyledAttributes.getColor(l.f3389E1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f27763f = ViewConfiguration.get(context).getScaledTouchSlop();
        AbstractC1484a0.B0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
