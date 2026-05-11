package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1518s;
import androidx.core.view.K0;
import java.util.List;
import u0.AbstractC4860a;

/* loaded from: classes2.dex */
abstract class c extends d {

    /* renamed from: d, reason: collision with root package name */
    final Rect f26595d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f26596e;

    /* renamed from: f, reason: collision with root package name */
    private int f26597f;

    /* renamed from: g, reason: collision with root package name */
    private int f26598g;

    public c() {
        this.f26595d = new Rect();
        this.f26596e = new Rect();
        this.f26597f = 0;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.d
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View H10 = H(coordinatorLayout.s(view));
        if (H10 == null) {
            super.F(coordinatorLayout, view, i10);
            this.f26597f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f26595d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H10.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        K0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && AbstractC1484a0.x(coordinatorLayout) && !AbstractC1484a0.x(view)) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.f26596e;
        AbstractC1518s.a(N(fVar.f15672c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int I10 = I(H10);
        view.layout(rect2.left, rect2.top - I10, rect2.right, rect2.bottom - I10);
        this.f26597f = rect2.top - H10.getBottom();
    }

    abstract View H(List list);

    final int I(View view) {
        if (this.f26598g == 0) {
            return 0;
        }
        float J10 = J(view);
        int i10 = this.f26598g;
        return AbstractC4860a.b((int) (J10 * i10), 0, i10);
    }

    abstract float J(View view);

    public final int K() {
        return this.f26598g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f26597f;
    }

    public final void O(int i10) {
        this.f26598g = i10;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View H10;
        K0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (H10 = H(coordinatorLayout.s(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (AbstractC1484a0.x(H10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int L10 = size + L(H10);
        int measuredHeight = H10.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            L10 -= measuredHeight;
        }
        coordinatorLayout.L(view, i10, i11, View.MeasureSpec.makeMeasureSpec(L10, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26595d = new Rect();
        this.f26596e = new Rect();
        this.f26597f = 0;
    }
}
