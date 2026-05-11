package com.google.android.material.floatingactionbutton;

import H7.k;
import H7.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: t, reason: collision with root package name */
    private static final int f27018t = k.f3345u;

    /* renamed from: u, reason: collision with root package name */
    static final Property f27019u = new a(Float.class, "width");

    /* renamed from: v, reason: collision with root package name */
    static final Property f27020v = new b(Float.class, "height");

    /* renamed from: w, reason: collision with root package name */
    static final Property f27021w = new c(Float.class, "paddingStart");

    /* renamed from: x, reason: collision with root package name */
    static final Property f27022x = new d(Float.class, "paddingEnd");

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC1484a0.F(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            AbstractC1484a0.G0(view, f10.intValue(), view.getPaddingTop(), AbstractC1484a0.E(view), view.getPaddingBottom());
        }
    }

    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC1484a0.E(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            AbstractC1484a0.G0(view, AbstractC1484a0.F(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d j(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ void l(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.d dVar, e eVar) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d m(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d n(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private Rect f27023a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27024b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f27025c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f27024b = false;
            this.f27025c = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f27023a == null) {
                this.f27023a = new Rect();
            }
            Rect rect = this.f27023a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f27025c) {
                ExtendedFloatingActionButton.m(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.n(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, null, null);
        }

        public boolean F(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List s10 = coordinatorLayout.s(extendedFloatingActionButton);
            int size = s10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) s10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(extendedFloatingActionButton, i10);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f27025c) {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, null, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            android.support.v4.media.session.b.a(view);
            return F(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f15677h == 0) {
                fVar.f15677h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.v4.media.session.b.a(view);
            return H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            android.support.v4.media.session.b.a(view);
            return I(coordinatorLayout, null, i10);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3542V1);
            this.f27024b = obtainStyledAttributes.getBoolean(l.f3551W1, false);
            this.f27025c = obtainStyledAttributes.getBoolean(l.f3560X1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
