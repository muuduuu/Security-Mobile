package com.google.android.material.appbar;

import H7.k;
import H7.l;
import Y7.g;
import Y7.h;
import a8.AbstractC1367a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import androidx.core.view.D;
import androidx.core.view.I;
import androidx.core.view.K0;
import com.google.android.material.internal.m;
import h.AbstractC3220a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.AbstractC4860a;
import z0.C5228A;
import z0.InterfaceC5231D;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: t, reason: collision with root package name */
    private static final int f26527t = k.f3331g;

    /* renamed from: a, reason: collision with root package name */
    private int f26528a;

    /* renamed from: b, reason: collision with root package name */
    private int f26529b;

    /* renamed from: c, reason: collision with root package name */
    private int f26530c;

    /* renamed from: d, reason: collision with root package name */
    private int f26531d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26532e;

    /* renamed from: f, reason: collision with root package name */
    private int f26533f;

    /* renamed from: g, reason: collision with root package name */
    private K0 f26534g;

    /* renamed from: h, reason: collision with root package name */
    private List f26535h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26536i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26537j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26538k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26539l;

    /* renamed from: m, reason: collision with root package name */
    private int f26540m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference f26541n;

    /* renamed from: o, reason: collision with root package name */
    private ValueAnimator f26542o;

    /* renamed from: p, reason: collision with root package name */
    private final List f26543p;

    /* renamed from: q, reason: collision with root package name */
    private int[] f26544q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f26545r;

    /* renamed from: s, reason: collision with root package name */
    private Behavior f26546s;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.b {

        /* renamed from: k, reason: collision with root package name */
        private int f26547k;

        /* renamed from: l, reason: collision with root package name */
        private int f26548l;

        /* renamed from: m, reason: collision with root package name */
        private ValueAnimator f26549m;

        /* renamed from: n, reason: collision with root package name */
        private e f26550n;

        /* renamed from: o, reason: collision with root package name */
        private WeakReference f26551o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f26552p;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f26553a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f26554b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f26553a = coordinatorLayout;
                this.f26554b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f26553a, this.f26554b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C1483a {
            b() {
            }

            @Override // androidx.core.view.C1483a
            public void g(View view, C5228A c5228a) {
                super.g(view, c5228a);
                c5228a.M0(BaseBehavior.this.f26552p);
                c5228a.q0(ScrollView.class.getName());
            }
        }

        class c implements InterfaceC5231D {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f26557a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f26558b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f26559c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f26560d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f26557a = coordinatorLayout;
                this.f26558b = appBarLayout;
                this.f26559c = view;
                this.f26560d = i10;
            }

            @Override // z0.InterfaceC5231D
            public boolean a(View view, InterfaceC5231D.a aVar) {
                BaseBehavior.this.q(this.f26557a, this.f26558b, this.f26559c, 0, this.f26560d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class d implements InterfaceC5231D {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f26562a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f26563b;

            d(AppBarLayout appBarLayout, boolean z10) {
                this.f26562a = appBarLayout;
                this.f26563b = z10;
            }

            @Override // z0.InterfaceC5231D
            public boolean a(View view, InterfaceC5231D.a aVar) {
                this.f26562a.setExpanded(this.f26563b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        private boolean T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z10 = false;
            if (M() != (-appBarLayout.getTotalScrollRange())) {
                U(coordinatorLayout, appBarLayout, C5228A.a.f45635q, false);
                z10 = true;
            }
            if (M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    U(coordinatorLayout, appBarLayout, C5228A.a.f45636r, true);
                    return true;
                }
                int i10 = -appBarLayout.getDownNestedPreScrollRange();
                if (i10 != 0) {
                    AbstractC1484a0.m0(coordinatorLayout, C5228A.a.f45636r, null, new c(coordinatorLayout, appBarLayout, view, i10));
                    return true;
                }
            }
            return z10;
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C5228A.a aVar, boolean z10) {
            AbstractC1484a0.m0(coordinatorLayout, aVar, null, new d(appBarLayout, z10));
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            W(coordinatorLayout, appBarLayout, i10, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int M10 = M();
            if (M10 == i10) {
                ValueAnimator valueAnimator = this.f26549m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f26549m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f26549m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f26549m = valueAnimator3;
                valueAnimator3.setInterpolator(I7.a.f4339e);
                this.f26549m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f26549m.setDuration(Math.min(i11, 600));
            this.f26549m.setIntValues(M10, i10);
            this.f26549m.start();
        }

        private int X(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.j() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f26575a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof D) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (a0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d10 = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = eVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= AbstractC1484a0.B(childAt);
                        }
                    }
                    if (AbstractC1484a0.x(childAt)) {
                        i11 -= appBarLayout.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List t10 = coordinatorLayout.t(appBarLayout);
            int size = t10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) ((View) t10.get(i10)).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int M10 = M() - topInset;
            int e02 = e0(appBarLayout, M10);
            if (e02 >= 0) {
                View childAt = appBarLayout.getChildAt(e02);
                e eVar = (e) childAt.getLayoutParams();
                int c10 = eVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (e02 == 0 && AbstractC1484a0.x(appBarLayout) && AbstractC1484a0.x(childAt)) {
                        i10 -= appBarLayout.getTopInset();
                    }
                    if (a0(c10, 2)) {
                        i11 += AbstractC1484a0.B(childAt);
                    } else if (a0(c10, 5)) {
                        int B10 = AbstractC1484a0.B(childAt) + i11;
                        if (M10 < B10) {
                            i10 = B10;
                        } else {
                            i11 = B10;
                        }
                    }
                    if (a0(c10, 32)) {
                        i10 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, AbstractC4860a.b(X(M10, i11, i10) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View f02;
            AbstractC1484a0.k0(coordinatorLayout, C5228A.a.f45635q.b());
            AbstractC1484a0.k0(coordinatorLayout, C5228A.a.f45636r.b());
            if (appBarLayout.getTotalScrollRange() == 0 || (f02 = f0(coordinatorLayout)) == null || !b0(appBarLayout)) {
                return;
            }
            if (!AbstractC1484a0.O(coordinatorLayout)) {
                AbstractC1484a0.q0(coordinatorLayout, new b());
            }
            this.f26552p = T(coordinatorLayout, appBarLayout, f02);
        }

        private void y0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View d02 = d0(appBarLayout, i10);
            boolean z11 = false;
            if (d02 != null) {
                int c10 = ((e) d02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int B10 = AbstractC1484a0.B(d02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (d02.getBottom() - B10) - appBarLayout.getTopInset()) : (-i10) >= (d02.getBottom() - B10) - appBarLayout.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (appBarLayout.l()) {
                z11 = appBarLayout.v(c0(coordinatorLayout));
            }
            boolean s10 = appBarLayout.s(z11);
            if (z10 || (s10 && v0(coordinatorLayout, appBarLayout))) {
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.b
        int M() {
            return E() + this.f26547k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f26551o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(c0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean l10 = super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            e eVar = this.f26550n;
            if (eVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (eVar.f26565c) {
                P(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (eVar.f26566d) {
                P(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(eVar.f26567e);
                P(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f26550n.f26569g ? AbstractC1484a0.B(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f26550n.f26568f)));
            }
            appBarLayout.o();
            this.f26550n = null;
            G(AbstractC4860a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            y0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.m(E());
            x0(coordinatorLayout, appBarLayout);
            return l10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.L(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    i14 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                int i15 = i13;
                int i16 = i14;
                if (i15 != i16) {
                    iArr[1] = O(coordinatorLayout, appBarLayout, i11, i15, i16);
                }
            }
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, appBarLayout, i13, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                x0(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof e) {
                s0((e) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f26550n.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f26550n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y10 = super.y(coordinatorLayout, appBarLayout);
            e t02 = t0(y10, appBarLayout);
            return t02 == null ? y10 : t02;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.l() || Z(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f26549m) != null) {
                valueAnimator.cancel();
            }
            this.f26551o = null;
            this.f26548l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f26548l == 0 || i10 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
            this.f26551o = new WeakReference(view);
        }

        void s0(e eVar, boolean z10) {
            if (this.f26550n == null || z10) {
                this.f26550n = eVar;
            }
        }

        e t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int E10 = E();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + E10;
                if (childAt.getTop() + E10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = F0.a.f2196b;
                    }
                    e eVar = new e(parcelable);
                    boolean z10 = E10 == 0;
                    eVar.f26566d = z10;
                    eVar.f26565c = !z10 && (-E10) >= appBarLayout.getTotalScrollRange();
                    eVar.f26567e = i10;
                    eVar.f26569g = bottom == AbstractC1484a0.B(childAt) + appBarLayout.getTopInset();
                    eVar.f26568f = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int M10 = M();
            int i13 = 0;
            if (i11 == 0 || M10 < i11 || M10 > i12) {
                this.f26547k = 0;
            } else {
                int b10 = AbstractC4860a.b(i10, i11, i12);
                if (M10 != b10) {
                    int i02 = appBarLayout.h() ? i0(appBarLayout, b10) : b10;
                    boolean G10 = G(i02);
                    int i14 = M10 - b10;
                    this.f26547k = b10 - i02;
                    if (G10) {
                        while (i13 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i13).getLayoutParams();
                            c b11 = eVar.b();
                            if (b11 != null && (eVar.c() & 1) != 0) {
                                b11.a(appBarLayout, appBarLayout.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!G10 && appBarLayout.h()) {
                        coordinatorLayout.g(appBarLayout);
                    }
                    appBarLayout.m(E());
                    y0(coordinatorLayout, appBarLayout, b10, b10 < M10 ? -1 : 1, false);
                    i13 = i14;
                }
            }
            x0(coordinatorLayout, appBarLayout);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class e extends F0.a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            boolean f26565c;

            /* renamed from: d, reason: collision with root package name */
            boolean f26566d;

            /* renamed from: e, reason: collision with root package name */
            int f26567e;

            /* renamed from: f, reason: collision with root package name */
            float f26568f;

            /* renamed from: g, reason: collision with root package name */
            boolean f26569g;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f26565c = parcel.readByte() != 0;
                this.f26566d = parcel.readByte() != 0;
                this.f26567e = parcel.readInt();
                this.f26568f = parcel.readFloat();
                this.f26569g = parcel.readByte() != 0;
            }

            @Override // F0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f26565c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f26566d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f26567e);
                parcel.writeFloat(this.f26568f);
                parcel.writeByte(this.f26569g ? (byte) 1 : (byte) 0);
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.c {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                AbstractC1484a0.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f26547k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.c
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R10 = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R10 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R10 / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.c
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC1484a0.k0(coordinatorLayout, C5228A.a.f45635q.b());
                AbstractC1484a0.k0(coordinatorLayout, C5228A.a.f45636r.b());
                AbstractC1484a0.q0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout H10 = H(coordinatorLayout.s(view));
            if (H10 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f26595d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    H10.p(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3500Q4);
            O(obtainStyledAttributes.getDimensionPixelSize(l.f3509R4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements I {
        a() {
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            return AppBarLayout.this.n(k02);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f26571a;

        b(g gVar) {
            this.f26571a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f26571a.W(floatValue);
            if (AppBarLayout.this.f26545r instanceof g) {
                ((g) AppBarLayout.this.f26545r).W(floatValue);
            }
            Iterator it = AppBarLayout.this.f26543p.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                this.f26571a.z();
                throw null;
            }
        }
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class d extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f26573a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f26574b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f26573a, appBarLayout, view);
            float abs = this.f26573a.top - Math.abs(f10);
            if (abs > 0.0f) {
                AbstractC1484a0.x0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float a10 = 1.0f - AbstractC4860a.a(Math.abs(abs / this.f26573a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.f26573a.height() * 0.3f) * (1.0f - (a10 * a10)));
            view.setTranslationY(height);
            view.getDrawingRect(this.f26574b);
            this.f26574b.offset(0, (int) (-height));
            AbstractC1484a0.x0(view, this.f26574b);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private void c() {
        WeakReference weakReference = this.f26541n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f26541n = null;
    }

    private View d(View view) {
        int i10;
        if (this.f26541n == null && (i10 = this.f26540m) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f26540m);
            }
            if (findViewById != null) {
                this.f26541n = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.f26541n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        Behavior behavior = this.f26546s;
        BaseBehavior.e t02 = (behavior == null || this.f26529b == -1 || this.f26533f != 0) ? null : behavior.t0(F0.a.f2196b, this);
        this.f26529b = -1;
        this.f26530c = -1;
        this.f26531d = -1;
        if (t02 != null) {
            this.f26546s.s0(t02, false);
        }
    }

    private void q(boolean z10, boolean z11, boolean z12) {
        this.f26533f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean r(boolean z10) {
        if (this.f26537j == z10) {
            return false;
        }
        this.f26537j = z10;
        refreshDrawableState();
        return true;
    }

    private boolean u() {
        return this.f26545r != null && getTopInset() > 0;
    }

    private boolean w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || AbstractC1484a0.x(childAt)) ? false : true;
    }

    private void x(g gVar, boolean z10) {
        float dimension = getResources().getDimension(H7.d.f3190a);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f26542o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
        this.f26542o = ofFloat;
        ofFloat.setDuration(getResources().getInteger(H7.g.f3275a));
        this.f26542o.setInterpolator(I7.a.f4335a);
        this.f26542o.addUpdateListener(new b(gVar));
        this.f26542o.start();
    }

    private void y() {
        setWillNotDraw(!u());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (u()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f26528a);
            this.f26545r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f26545r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f26546s = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i10;
        int B10;
        int i11 = this.f26530c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f26575a;
            if ((i13 & 5) != 5) {
                if (i12 > 0) {
                    break;
                }
            } else {
                int i14 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if ((i13 & 8) != 0) {
                    B10 = AbstractC1484a0.B(childAt);
                } else if ((i13 & 2) != 0) {
                    B10 = measuredHeight - AbstractC1484a0.B(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && AbstractC1484a0.x(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + B10;
                if (childCount == 0) {
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                }
                i12 += i10;
            }
        }
        int max = Math.max(0, i12);
        this.f26530c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f26531d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            int i13 = eVar.f26575a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= AbstractC1484a0.B(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f26531d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f26540m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int B10 = AbstractC1484a0.B(this);
        if (B10 == 0) {
            int childCount = getChildCount();
            B10 = childCount >= 1 ? AbstractC1484a0.B(getChildAt(childCount - 1)) : 0;
            if (B10 == 0) {
                return getHeight() / 3;
            }
        }
        return (B10 * 2) + topInset;
    }

    int getPendingAction() {
        return this.f26533f;
    }

    public Drawable getStatusBarForeground() {
        return this.f26545r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        K0 k02 = this.f26534g;
        if (k02 != null) {
            return k02.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f26529b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f26575a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            if (i11 == 0 && AbstractC1484a0.x(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= AbstractC1484a0.B(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f26529b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.f26532e;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.f26539l;
    }

    void m(int i10) {
        this.f26528a = i10;
        if (!willNotDraw()) {
            AbstractC1484a0.h0(this);
        }
        List list = this.f26535h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                android.support.v4.media.session.b.a(this.f26535h.get(i11));
            }
        }
    }

    K0 n(K0 k02) {
        K0 k03 = AbstractC1484a0.x(this) ? k02 : null;
        if (!y0.b.a(this.f26534g, k03)) {
            this.f26534g = k03;
            y();
            requestLayout();
        }
        return k02;
    }

    void o() {
        this.f26533f = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f26544q == null) {
            this.f26544q = new int[4];
        }
        int[] iArr = this.f26544q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f26537j;
        int i11 = H7.b.f3121M;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f26538k) ? H7.b.f3122N : -H7.b.f3122N;
        int i12 = H7.b.f3120L;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f26538k) ? H7.b.f3119K : -H7.b.f3119K;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (AbstractC1484a0.x(this) && w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC1484a0.b0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f26532e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f26532e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f26545r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f26536i) {
            return;
        }
        if (!this.f26539l && !i()) {
            z11 = false;
        }
        r(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && AbstractC1484a0.x(this) && w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = AbstractC4860a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(boolean z10, boolean z11) {
        q(z10, z11, true);
    }

    boolean s(boolean z10) {
        return t(z10, !this.f26536i);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        p(z10, AbstractC1484a0.U(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f26539l = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f26540m = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f26536i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f26545r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f26545r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f26545r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.f26545r, AbstractC1484a0.A(this));
                this.f26545r.setVisible(getVisibility() == 0, false);
                this.f26545r.setCallback(this);
            }
            y();
            AbstractC1484a0.h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(AbstractC3220a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        f.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f26545r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    boolean t(boolean z10, boolean z11) {
        if (!z11 || this.f26538k == z10) {
            return false;
        }
        this.f26538k = z10;
        refreshDrawableState();
        if (!this.f26539l || !(getBackground() instanceof g)) {
            return true;
        }
        x((g) getBackground(), z10);
        return true;
    }

    boolean v(View view) {
        View d10 = d(view);
        if (d10 != null) {
            view = d10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f26545r;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3129b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f26527t;
        this.f26529b = -1;
        this.f26530c = -1;
        this.f26531d = -1;
        this.f26533f = 0;
        this.f26543p = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            f.a(this);
        }
        f.c(this, attributeSet, i10, i11);
        TypedArray h10 = m.h(context2, attributeSet, l.f3674k, i10, i11, new int[0]);
        AbstractC1484a0.u0(this, h10.getDrawable(l.f3683l));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            g gVar = new g();
            gVar.X(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.M(context2);
            AbstractC1484a0.u0(this, gVar);
        }
        if (h10.hasValue(l.f3719p)) {
            q(h10.getBoolean(l.f3719p, false), false, false);
        }
        if (h10.hasValue(l.f3710o)) {
            f.b(this, h10.getDimensionPixelSize(l.f3710o, 0));
        }
        if (i12 >= 26) {
            if (h10.hasValue(l.f3701n)) {
                setKeyboardNavigationCluster(h10.getBoolean(l.f3701n, false));
            }
            if (h10.hasValue(l.f3692m)) {
                setTouchscreenBlocksFocus(h10.getBoolean(l.f3692m, false));
            }
        }
        this.f26539l = h10.getBoolean(l.f3728q, false);
        this.f26540m = h10.getResourceId(l.f3737r, -1);
        setStatusBarForeground(h10.getDrawable(l.f3746s));
        h10.recycle();
        AbstractC1484a0.F0(this, new a());
    }

    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        int f26575a;

        /* renamed from: b, reason: collision with root package name */
        private c f26576b;

        /* renamed from: c, reason: collision with root package name */
        Interpolator f26577c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26575a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3764u);
            this.f26575a = obtainStyledAttributes.getInt(l.f3782w, 0);
            f(a(obtainStyledAttributes.getInt(l.f3773v, 0)));
            if (obtainStyledAttributes.hasValue(l.f3791x)) {
                this.f26577c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(l.f3791x, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f26576b;
        }

        public int c() {
            return this.f26575a;
        }

        public Interpolator d() {
            return this.f26577c;
        }

        boolean e() {
            int i10 = this.f26575a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(c cVar) {
            this.f26576b = cVar;
        }

        public void g(int i10) {
            this.f26575a = i10;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f26575a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f26575a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f26575a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f26575a = 1;
        }
    }
}
