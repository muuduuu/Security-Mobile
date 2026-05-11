package com.google.android.material.snackbar;

import a8.AbstractC1367a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import androidx.core.view.I;
import androidx.core.view.K0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.b;
import java.util.ArrayList;
import java.util.List;
import z0.C5228A;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f27380a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f27381b;

    /* renamed from: c, reason: collision with root package name */
    protected final s f27382c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f27383d;

    /* renamed from: e, reason: collision with root package name */
    private int f27384e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27385f;

    /* renamed from: i, reason: collision with root package name */
    private int f27388i;

    /* renamed from: j, reason: collision with root package name */
    private int f27389j;

    /* renamed from: k, reason: collision with root package name */
    private int f27390k;

    /* renamed from: l, reason: collision with root package name */
    private int f27391l;

    /* renamed from: m, reason: collision with root package name */
    private int f27392m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27393n;

    /* renamed from: o, reason: collision with root package name */
    private List f27394o;

    /* renamed from: p, reason: collision with root package name */
    private Behavior f27395p;

    /* renamed from: q, reason: collision with root package name */
    private final AccessibilityManager f27396q;

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f27377t = false;

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f27378u = {H7.b.f3117I};

    /* renamed from: v, reason: collision with root package name */
    private static final String f27379v = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: s, reason: collision with root package name */
    static final Handler f27376s = new Handler(Looper.getMainLooper(), new h());

    /* renamed from: g, reason: collision with root package name */
    private boolean f27386g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f27387h = new i();

    /* renamed from: r, reason: collision with root package name */
    b.InterfaceC0404b f27397r = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k, reason: collision with root package name */
        private final r f27398k = new r(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void P(BaseTransientBottomBar baseTransientBottomBar) {
            this.f27398k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f27398k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f27398k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27399a;

        a(int i10) {
            this.f27399a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.f27399a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f27382c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f27382c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f27382c.setScaleY(floatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f27383d.a(70, 180);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f27404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27405b;

        e(int i10) {
            this.f27405b = i10;
            this.f27404a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f27377t) {
                AbstractC1484a0.b0(BaseTransientBottomBar.this.f27382c, intValue - this.f27404a);
            } else {
                BaseTransientBottomBar.this.f27382c.setTranslationY(intValue);
            }
            this.f27404a = intValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27407a;

        f(int i10) {
            this.f27407a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.f27407a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f27383d.b(0, 180);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f27409a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f27377t) {
                AbstractC1484a0.b0(BaseTransientBottomBar.this.f27382c, intValue - this.f27409a);
            } else {
                BaseTransientBottomBar.this.f27382c.setTranslationY(intValue);
            }
            this.f27409a = intValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).T();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).E(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int y10;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f27382c == null || baseTransientBottomBar.f27381b == null || (y10 = (BaseTransientBottomBar.this.y() - BaseTransientBottomBar.this.C()) + ((int) BaseTransientBottomBar.this.f27382c.getTranslationY())) >= BaseTransientBottomBar.this.f27391l) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f27382c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f27379v, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f27391l - y10;
            BaseTransientBottomBar.this.f27382c.requestLayout();
        }
    }

    class j implements I {
        j() {
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            BaseTransientBottomBar.this.f27388i = k02.i();
            BaseTransientBottomBar.this.f27389j = k02.j();
            BaseTransientBottomBar.this.f27390k = k02.k();
            BaseTransientBottomBar.this.Z();
            return k02;
        }
    }

    class k extends C1483a {
        k() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            c5228a.a(1048576);
            c5228a.v0(true);
        }

        @Override // androidx.core.view.C1483a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.r();
            return true;
        }
    }

    class l implements b.InterfaceC0404b {
        l() {
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0404b
        public void b() {
            Handler handler = BaseTransientBottomBar.f27376s;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0404b
        public void c(int i10) {
            Handler handler = BaseTransientBottomBar.f27376s;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.K(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.s(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.f27397r);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.f27397r);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = BaseTransientBottomBar.this.f27382c;
            if (sVar == null) {
                return;
            }
            if (sVar.getParent() != null) {
                BaseTransientBottomBar.this.f27382c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f27382c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.V();
            } else {
                BaseTransientBottomBar.this.X();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }
    }

    public static abstract class q {
        public abstract void a(Object obj, int i10);

        public abstract void b(Object obj);
    }

    public static class r {

        /* renamed from: a, reason: collision with root package name */
        private b.InterfaceC0404b f27419a;

        public r(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof s;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().j(this.f27419a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().k(this.f27419a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f27419a = baseTransientBottomBar.f27397r;
        }
    }

    protected static class s extends FrameLayout {

        /* renamed from: k, reason: collision with root package name */
        private static final View.OnTouchListener f27420k = new a();

        /* renamed from: a, reason: collision with root package name */
        private BaseTransientBottomBar f27421a;

        /* renamed from: b, reason: collision with root package name */
        private int f27422b;

        /* renamed from: c, reason: collision with root package name */
        private final float f27423c;

        /* renamed from: d, reason: collision with root package name */
        private final float f27424d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27425e;

        /* renamed from: f, reason: collision with root package name */
        private final int f27426f;

        /* renamed from: g, reason: collision with root package name */
        private ColorStateList f27427g;

        /* renamed from: h, reason: collision with root package name */
        private PorterDuff.Mode f27428h;

        /* renamed from: i, reason: collision with root package name */
        private Rect f27429i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f27430j;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected s(Context context, AttributeSet attributeSet) {
            super(AbstractC1367a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, H7.l.f3734q5);
            if (obtainStyledAttributes.hasValue(H7.l.f3797x5)) {
                AbstractC1484a0.y0(this, obtainStyledAttributes.getDimensionPixelSize(H7.l.f3797x5, 0));
            }
            this.f27422b = obtainStyledAttributes.getInt(H7.l.f3761t5, 0);
            this.f27423c = obtainStyledAttributes.getFloat(H7.l.f3770u5, 1.0f);
            setBackgroundTintList(V7.c.a(context2, obtainStyledAttributes, H7.l.f3779v5));
            setBackgroundTintMode(com.google.android.material.internal.o.f(obtainStyledAttributes.getInt(H7.l.f3788w5, -1), PorterDuff.Mode.SRC_IN));
            this.f27424d = obtainStyledAttributes.getFloat(H7.l.f3752s5, 1.0f);
            this.f27425e = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3743r5, -1);
            this.f27426f = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3806y5, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f27420k);
            setFocusable(true);
            if (getBackground() == null) {
                AbstractC1484a0.u0(this, d());
            }
        }

        private Drawable d() {
            float dimension = getResources().getDimension(H7.d.f3195c0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(M7.a.i(this, H7.b.f3143p, H7.b.f3140m, getBackgroundOverlayColorAlpha()));
            if (this.f27427g == null) {
                return androidx.core.graphics.drawable.a.l(gradientDrawable);
            }
            Drawable l10 = androidx.core.graphics.drawable.a.l(gradientDrawable);
            androidx.core.graphics.drawable.a.i(l10, this.f27427g);
            return l10;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f27429i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f27421a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f27430j = true;
            viewGroup.addView(this);
            this.f27430j = false;
        }

        float getActionTextColorAlpha() {
            return this.f27424d;
        }

        int getAnimationMode() {
            return this.f27422b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f27423c;
        }

        int getMaxInlineActionWidth() {
            return this.f27426f;
        }

        int getMaxWidth() {
            return this.f27425e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f27421a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.H();
            }
            AbstractC1484a0.n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f27421a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.I();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f27421a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.J();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f27425e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f27425e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f27422b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f27427g != null) {
                drawable = androidx.core.graphics.drawable.a.l(drawable.mutate());
                androidx.core.graphics.drawable.a.i(drawable, this.f27427g);
                androidx.core.graphics.drawable.a.j(drawable, this.f27428h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f27427g = colorStateList;
            if (getBackground() != null) {
                Drawable l10 = androidx.core.graphics.drawable.a.l(getBackground().mutate());
                androidx.core.graphics.drawable.a.i(l10, colorStateList);
                androidx.core.graphics.drawable.a.j(l10, this.f27428h);
                if (l10 != getBackground()) {
                    super.setBackgroundDrawable(l10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f27428h = mode;
            if (getBackground() != null) {
                Drawable l10 = androidx.core.graphics.drawable.a.l(getBackground().mutate());
                androidx.core.graphics.drawable.a.j(l10, mode);
                if (l10 != getBackground()) {
                    super.setBackgroundDrawable(l10);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f27430j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f27421a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Z();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f27420k);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f27380a = viewGroup;
        this.f27383d = aVar;
        this.f27381b = context;
        com.google.android.material.internal.m.a(context);
        s sVar = (s) LayoutInflater.from(context).inflate(z(), viewGroup, false);
        this.f27382c = sVar;
        sVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(sVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(sVar.getMaxInlineActionWidth());
        }
        sVar.addView(view);
        AbstractC1484a0.s0(sVar, 1);
        AbstractC1484a0.B0(sVar, 1);
        AbstractC1484a0.z0(sVar, true);
        AbstractC1484a0.F0(sVar, new j());
        AbstractC1484a0.q0(sVar, new k());
        this.f27396q = (AccessibilityManager) context.getSystemService("accessibility");
    }

    private int A() {
        int height = this.f27382c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f27382c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        int[] iArr = new int[2];
        this.f27382c.getLocationOnScreen(iArr);
        return iArr[1] + this.f27382c.getHeight();
    }

    private boolean G() {
        ViewGroup.LayoutParams layoutParams = this.f27382c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void M() {
        this.f27392m = q();
        Z();
    }

    private void P(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f27395p;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = w();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).P(this);
        }
        swipeDismissBehavior.K(new n());
        fVar.o(swipeDismissBehavior);
        if (u() == null) {
            fVar.f15676g = 80;
        }
    }

    private boolean R() {
        return this.f27391l > 0 && !this.f27385f && G();
    }

    private void U() {
        if (Q()) {
            o();
            return;
        }
        if (this.f27382c.getParent() != null) {
            this.f27382c.setVisibility(0);
        }
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        ValueAnimator t10 = t(0.0f, 1.0f);
        ValueAnimator x10 = x(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(t10, x10);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void W(int i10) {
        ValueAnimator t10 = t(1.0f, 0.0f);
        t10.setDuration(75L);
        t10.addListener(new a(i10));
        t10.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        int A10 = A();
        if (f27377t) {
            AbstractC1484a0.b0(this.f27382c, A10);
        } else {
            this.f27382c.setTranslationY(A10);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(A10, 0);
        valueAnimator.setInterpolator(I7.a.f4336b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(A10));
        valueAnimator.start();
    }

    private void Y(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, A());
        valueAnimator.setInterpolator(I7.a.f4336b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ViewGroup.LayoutParams layoutParams = this.f27382c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f27382c.f27429i == null) {
            Log.w(f27379v, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f27382c.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.f27382c.f27429i.bottom + (u() != null ? this.f27392m : this.f27388i);
        marginLayoutParams.leftMargin = this.f27382c.f27429i.left + this.f27389j;
        marginLayoutParams.rightMargin = this.f27382c.f27429i.right + this.f27390k;
        marginLayoutParams.topMargin = this.f27382c.f27429i.top;
        this.f27382c.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !R()) {
            return;
        }
        this.f27382c.removeCallbacks(this.f27387h);
        this.f27382c.post(this.f27387h);
    }

    private void p(int i10) {
        if (this.f27382c.getAnimationMode() == 1) {
            W(i10);
        } else {
            Y(i10);
        }
    }

    private int q() {
        if (u() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        u().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f27380a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f27380a.getHeight()) - i10;
    }

    private ValueAnimator t(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(I7.a.f4335a);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator x(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(I7.a.f4338d);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y() {
        WindowManager windowManager = (WindowManager) this.f27381b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public View B() {
        return this.f27382c;
    }

    protected boolean D() {
        TypedArray obtainStyledAttributes = this.f27381b.obtainStyledAttributes(f27378u);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void E(int i10) {
        if (Q() && this.f27382c.getVisibility() == 0) {
            p(i10);
        } else {
            K(i10);
        }
    }

    public boolean F() {
        return com.google.android.material.snackbar.b.c().e(this.f27397r);
    }

    void H() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i10;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f27382c.getRootWindowInsets()) == null) {
            return;
        }
        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
        i10 = mandatorySystemGestureInsets.bottom;
        this.f27391l = i10;
        Z();
    }

    void I() {
        if (F()) {
            f27376s.post(new m());
        }
    }

    void J() {
        if (this.f27393n) {
            U();
            this.f27393n = false;
        }
    }

    void K(int i10) {
        com.google.android.material.snackbar.b.c().h(this.f27397r);
        List list = this.f27394o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f27394o.get(size)).a(this, i10);
            }
        }
        ViewParent parent = this.f27382c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f27382c);
        }
    }

    void L() {
        com.google.android.material.snackbar.b.c().i(this.f27397r);
        List list = this.f27394o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f27394o.get(size)).b(this);
            }
        }
    }

    public BaseTransientBottomBar N(int i10) {
        this.f27382c.setAnimationMode(i10);
        return this;
    }

    public BaseTransientBottomBar O(int i10) {
        this.f27384e = i10;
        return this;
    }

    boolean Q() {
        AccessibilityManager accessibilityManager = this.f27396q;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void S() {
        com.google.android.material.snackbar.b.c().m(v(), this.f27397r);
    }

    final void T() {
        if (this.f27382c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f27382c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                P((CoordinatorLayout.f) layoutParams);
            }
            this.f27382c.c(this.f27380a);
            M();
            this.f27382c.setVisibility(4);
        }
        if (AbstractC1484a0.U(this.f27382c)) {
            U();
        } else {
            this.f27393n = true;
        }
    }

    public BaseTransientBottomBar n(q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f27394o == null) {
            this.f27394o = new ArrayList();
        }
        this.f27394o.add(qVar);
        return this;
    }

    void o() {
        this.f27382c.post(new o());
    }

    public void r() {
        s(3);
    }

    protected void s(int i10) {
        com.google.android.material.snackbar.b.c().b(this.f27397r, i10);
    }

    public View u() {
        return null;
    }

    public int v() {
        return this.f27384e;
    }

    protected SwipeDismissBehavior w() {
        return new Behavior();
    }

    protected int z() {
        return D() ? H7.h.f3299v : H7.h.f3279b;
    }
}
