package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;

/* loaded from: classes2.dex */
abstract class b extends d {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f26585d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f26586e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26587f;

    /* renamed from: g, reason: collision with root package name */
    private int f26588g;

    /* renamed from: h, reason: collision with root package name */
    private int f26589h;

    /* renamed from: i, reason: collision with root package name */
    private int f26590i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f26591j;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f26592a;

        /* renamed from: b, reason: collision with root package name */
        private final View f26593b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f26592a = coordinatorLayout;
            this.f26593b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f26593b == null || (overScroller = b.this.f26586e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                b.this.N(this.f26592a, this.f26593b);
                return;
            }
            b bVar = b.this;
            bVar.P(this.f26592a, this.f26593b, bVar.f26586e.getCurrY());
            AbstractC1484a0.i0(this.f26593b, this);
        }
    }

    public b() {
        this.f26588g = -1;
        this.f26590i = -1;
    }

    private void I() {
        if (this.f26591j == null) {
            this.f26591j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f26588g);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y10 = (int) motionEvent.getY(findPointerIndex);
                int i10 = this.f26589h - y10;
                this.f26589h = y10;
                O(coordinatorLayout, view, i10, K(view), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f26588g = motionEvent.getPointerId(i11);
                    this.f26589h = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z10 = false;
            velocityTracker2 = this.f26591j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f26587f || z10;
        }
        VelocityTracker velocityTracker3 = this.f26591j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f26591j.computeCurrentVelocity(1000);
            J(coordinatorLayout, view, -L(view), 0, this.f26591j.getYVelocity(this.f26588g));
            z10 = true;
            this.f26587f = false;
            this.f26588g = -1;
            velocityTracker = this.f26591j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f26591j = null;
            }
            velocityTracker2 = this.f26591j;
            if (velocityTracker2 != null) {
            }
            if (this.f26587f) {
                return true;
            }
        }
        z10 = false;
        this.f26587f = false;
        this.f26588g = -1;
        velocityTracker = this.f26591j;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f26591j;
        if (velocityTracker2 != null) {
        }
        if (this.f26587f) {
        }
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f26585d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f26585d = null;
        }
        if (this.f26586e == null) {
            this.f26586e = new OverScroller(view.getContext());
        }
        this.f26586e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f26586e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f26585d = aVar;
        AbstractC1484a0.i0(view, aVar);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f26590i < 0) {
            this.f26590i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f26587f) {
            int i10 = this.f26588g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f26589h) > this.f26590i) {
                this.f26589h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f26588g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(view) && coordinatorLayout.C(view, x10, y11);
            this.f26587f = z10;
            if (z10) {
                this.f26589h = y11;
                this.f26588g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f26586e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f26586e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f26591j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26588g = -1;
        this.f26590i = -1;
    }
}
