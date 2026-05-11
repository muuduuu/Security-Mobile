package com.google.android.material.progressindicator;

import H7.k;
import H7.l;
import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.internal.m;
import java.util.Arrays;
import s1.AbstractC4306a;

/* loaded from: classes2.dex */
public abstract class a extends ProgressBar {

    /* renamed from: o, reason: collision with root package name */
    static final int f27299o = k.f3348x;

    /* renamed from: a, reason: collision with root package name */
    com.google.android.material.progressindicator.b f27300a;

    /* renamed from: b, reason: collision with root package name */
    private int f27301b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27302c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27303d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27304e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27305f;

    /* renamed from: g, reason: collision with root package name */
    private long f27306g;

    /* renamed from: h, reason: collision with root package name */
    T7.a f27307h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27308i;

    /* renamed from: j, reason: collision with root package name */
    private int f27309j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f27310k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f27311l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC4306a f27312m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC4306a f27313n;

    /* renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    class RunnableC0402a implements Runnable {
        RunnableC0402a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.f27306g = -1L;
        }
    }

    class c extends AbstractC4306a {
        c() {
        }

        @Override // s1.AbstractC4306a
        public void a(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.o(aVar.f27301b, a.this.f27302c);
        }
    }

    class d extends AbstractC4306a {
        d() {
        }

        @Override // s1.AbstractC4306a
        public void a(Drawable drawable) {
            super.a(drawable);
            if (a.this.f27308i) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.f27309j);
        }
    }

    protected a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(AbstractC1367a.c(context, attributeSet, i10, f27299o), attributeSet, i10);
        this.f27306g = -1L;
        this.f27308i = false;
        this.f27309j = 4;
        this.f27310k = new RunnableC0402a();
        this.f27311l = new b();
        this.f27312m = new c();
        this.f27313n = new d();
        Context context2 = getContext();
        this.f27300a = i(context2, attributeSet);
        TypedArray h10 = m.h(context2, attributeSet, l.f3495Q, i10, i11, new int[0]);
        this.f27304e = h10.getInt(l.f3540V, -1);
        this.f27305f = Math.min(h10.getInt(l.f3522T, -1), 1000);
        h10.recycle();
        this.f27307h = new T7.a();
        this.f27303d = true;
    }

    private h getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().u();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((g) getCurrentDrawable()).p(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f27305f > 0) {
            this.f27306g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().t().d(this.f27312m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().l(this.f27313n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().l(this.f27313n);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().r(this.f27313n);
            getIndeterminateDrawable().t().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().r(this.f27313n);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f27300a.f27323f;
    }

    public int[] getIndicatorColor() {
        return this.f27300a.f27320c;
    }

    public int getShowAnimationBehavior() {
        return this.f27300a.f27322e;
    }

    public int getTrackColor() {
        return this.f27300a.f27321d;
    }

    public int getTrackCornerRadius() {
        return this.f27300a.f27319b;
    }

    public int getTrackThickness() {
        return this.f27300a.f27318a;
    }

    protected void h(boolean z10) {
        if (this.f27303d) {
            ((g) getCurrentDrawable()).p(q(), false, z10);
        }
    }

    abstract com.google.android.material.progressindicator.b i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public void o(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f27301b = i10;
            this.f27302c = z10;
            this.f27308i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f27307h.a(getContext().getContentResolver()) == 0.0f) {
                this.f27312m.a(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().t().f();
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f27311l);
        removeCallbacks(this.f27310k);
        ((g) getCurrentDrawable()).h();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(i10, i11);
            h currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int e10 = currentDrawingDelegate.e();
            int d10 = currentDrawingDelegate.d();
            setMeasuredDimension(e10 < 0 ? getMeasuredWidth() : e10 + getPaddingLeft() + getPaddingRight(), d10 < 0 ? getMeasuredHeight() : d10 + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    boolean q() {
        return AbstractC1484a0.T(this) && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(T7.a aVar) {
        this.f27307h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f27355c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f27355c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f27300a.f27323f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            g gVar = (g) getCurrentDrawable();
            if (gVar != null) {
                gVar.h();
            }
            super.setIndeterminate(z10);
            g gVar2 = (g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.p(q(), false, false);
            }
            if ((gVar2 instanceof j) && q()) {
                ((j) gVar2).t().g();
            }
            this.f27308i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof j)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((g) drawable).h();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{M7.a.b(getContext(), H7.b.f3141n, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f27300a.f27320c = iArr;
        getIndeterminateDrawable().t().c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        o(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof f)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            f fVar = (f) drawable;
            fVar.h();
            super.setProgressDrawable(fVar);
            fVar.z(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f27300a.f27322e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f27300a;
        if (bVar.f27321d != i10) {
            bVar.f27321d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f27300a;
        if (bVar.f27319b != i10) {
            bVar.f27319b = Math.min(i10, bVar.f27318a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f27300a;
        if (bVar.f27318a != i10) {
            bVar.f27318a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f27309j = i10;
    }

    @Override // android.widget.ProgressBar
    public j getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public f getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}
