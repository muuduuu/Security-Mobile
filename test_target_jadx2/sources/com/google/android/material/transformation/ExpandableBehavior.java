package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private int f27799a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f27800a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27801b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q7.a f27802c;

        a(View view, int i10, Q7.a aVar) {
            this.f27800a = view;
            this.f27801b = i10;
            this.f27802c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f27800a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f27799a == this.f27801b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                Q7.a aVar = this.f27802c;
                expandableBehavior.H((View) aVar, this.f27800a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f27799a = 0;
    }

    private boolean F(boolean z10) {
        if (!z10) {
            return this.f27799a == 1;
        }
        int i10 = this.f27799a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected Q7.a G(CoordinatorLayout coordinatorLayout, View view) {
        List s10 = coordinatorLayout.s(view);
        int size = s10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) s10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (Q7.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Q7.a aVar = (Q7.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f27799a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        Q7.a G10;
        if (AbstractC1484a0.U(view) || (G10 = G(coordinatorLayout, view)) == null || !F(G10.a())) {
            return false;
        }
        int i11 = G10.a() ? 1 : 2;
        this.f27799a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, G10));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27799a = 0;
    }
}
