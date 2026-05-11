package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private int f26610a;

    /* renamed from: b, reason: collision with root package name */
    private int f26611b;

    /* renamed from: c, reason: collision with root package name */
    private int f26612c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f26613d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f26613d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f26610a = 0;
        this.f26611b = 2;
        this.f26612c = 0;
    }

    private void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f26613d = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f26611b == 1;
    }

    public boolean H() {
        return this.f26611b == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f26613d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f26611b = 1;
        int i10 = this.f26610a + this.f26612c;
        if (z10) {
            F(view, i10, 175L, I7.a.f4337c);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f26613d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f26611b = 2;
        if (z10) {
            F(view, 0, 225L, I7.a.f4338d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f26610a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26610a = 0;
        this.f26611b = 2;
        this.f26612c = 0;
    }
}
