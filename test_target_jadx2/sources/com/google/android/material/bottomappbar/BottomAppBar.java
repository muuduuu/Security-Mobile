package com.google.android.material.bottomappbar;

import H7.k;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: q0, reason: collision with root package name */
    private static final int f26632q0 = k.f3338n;

    static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ void U(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f26633e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference f26634f;

        /* renamed from: g, reason: collision with root package name */
        private int f26635g;

        /* renamed from: h, reason: collision with root package name */
        private final View.OnLayoutChangeListener f26636h;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                b.a(Behavior.this.f26634f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f26636h = new a();
            this.f26633e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            b.a(view);
            return O(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean N(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f26634f = new WeakReference(bottomAppBar);
            View T10 = BottomAppBar.T(bottomAppBar);
            if (T10 != null && !AbstractC1484a0.U(T10)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) T10.getLayoutParams();
                fVar.f15673d = 49;
                this.f26635g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (T10 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) T10;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(H7.a.f3106b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(H7.a.f3105a);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f26636h);
                    BottomAppBar.U(bottomAppBar, floatingActionButton);
                }
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.K(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            b.a(view);
            return N(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26636h = new a();
            this.f26633e = new Rect();
        }
    }
}
