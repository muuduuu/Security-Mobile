package ga;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.I;
import androidx.core.view.K0;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.G;
import androidx.fragment.app.P;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.AbstractC2942l;
import com.swmansion.rnscreens.AbstractC2945o;
import com.swmansion.rnscreens.B;
import com.swmansion.rnscreens.C;
import com.swmansion.rnscreens.C2939i;
import com.swmansion.rnscreens.C2940j;
import com.swmansion.rnscreens.C2941k;
import com.swmansion.rnscreens.C2943m;
import com.swmansion.rnscreens.C2949t;
import com.swmansion.rnscreens.D;
import com.swmansion.rnscreens.InterfaceC2944n;
import com.swmansion.rnscreens.r;
import com.swmansion.rnscreens.y;
import com.swmansion.rnscreens.z;
import ga.AnimationAnimationListenerC3211d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.n;

/* renamed from: ga.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC3211d extends ComponentCallbacksC1573o implements InterfaceC1596m, D, Animation.AnimationListener, I, InterfaceC2944n {

    /* renamed from: j, reason: collision with root package name */
    public static final b f33620j = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final z f33621a;

    /* renamed from: b, reason: collision with root package name */
    private C3212e f33622b;

    /* renamed from: c, reason: collision with root package name */
    private C3213f f33623c;

    /* renamed from: d, reason: collision with root package name */
    private final float f33624d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33625e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC2942l f33626f;

    /* renamed from: g, reason: collision with root package name */
    private BottomSheetBehavior.f f33627g;

    /* renamed from: h, reason: collision with root package name */
    private final C2939i f33628h;

    /* renamed from: i, reason: collision with root package name */
    private final List f33629i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga.d$a */
    static final class a extends BottomSheetBehavior.f {

        /* renamed from: a, reason: collision with root package name */
        private final r f33630a;

        /* renamed from: b, reason: collision with root package name */
        private final View f33631b;

        /* renamed from: c, reason: collision with root package name */
        private final float f33632c;

        /* renamed from: d, reason: collision with root package name */
        private float f33633d;

        /* renamed from: e, reason: collision with root package name */
        private float f33634e;

        /* renamed from: f, reason: collision with root package name */
        private float f33635f;

        /* renamed from: g, reason: collision with root package name */
        private final ValueAnimator f33636g;

        public a(r screen, View viewToAnimate, float f10) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(viewToAnimate, "viewToAnimate");
            this.f33630a = screen;
            this.f33631b = viewToAnimate;
            this.f33632c = f10;
            this.f33633d = f(screen.getSheetLargestUndimmedDetentIndex());
            float f11 = f(kotlin.ranges.d.k(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().size() - 1));
            this.f33634e = f11;
            this.f33635f = f11 - this.f33633d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            ofFloat.setDuration(1L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ga.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AnimationAnimationListenerC3211d.a.e(AnimationAnimationListenerC3211d.a.this, valueAnimator);
                }
            });
            this.f33636g = ofFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a this$0, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            View view = this$0.f33631b;
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        private final float f(int i10) {
            int size = this.f33630a.getSheetDetents().size();
            if (size != 1) {
                if (size != 2) {
                    if (size == 3 && i10 != -1) {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                BottomSheetBehavior<r> sheetBehavior = this.f33630a.getSheetBehavior();
                                Intrinsics.d(sheetBehavior);
                                return sheetBehavior.i0();
                            }
                            if (i10 == 2) {
                                return 1.0f;
                            }
                        }
                        return 0.0f;
                    }
                } else if (i10 != -1) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            return 1.0f;
                        }
                    }
                    return 0.0f;
                }
            } else if (i10 != -1 && i10 == 0) {
                return 1.0f;
            }
            return -1.0f;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            float f11 = this.f33633d;
            if (f11 >= f10 || f10 >= this.f33634e) {
                return;
            }
            this.f33636g.setCurrentFraction((f10 - f11) / this.f33635f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i10 == 1 || i10 == 2) {
                this.f33633d = f(this.f33630a.getSheetLargestUndimmedDetentIndex());
                float f10 = f(kotlin.ranges.d.k(this.f33630a.getSheetLargestUndimmedDetentIndex() + 1, 0, this.f33630a.getSheetDetents().size() - 1));
                this.f33634e = f10;
                this.f33635f = f10 - this.f33633d;
            }
        }
    }

    /* renamed from: ga.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: ga.d$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33637a;

        static {
            int[] iArr = new int[AbstractC1592i.a.values().length];
            try {
                iArr[AbstractC1592i.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f33637a = iArr;
        }
    }

    public AnimationAnimationListenerC3211d(z nestedFragment) {
        Intrinsics.checkNotNullParameter(nestedFragment, "nestedFragment");
        this.f33621a = nestedFragment;
        this.f33624d = 0.15f;
        this.f33626f = C2941k.f29967a;
        this.f33628h = C2939i.f29960a;
        boolean z10 = nestedFragment.f() instanceof C;
        ComponentCallbacksC1573o f10 = nestedFragment.f();
        Intrinsics.e(f10, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        C c10 = (C) f10;
        c10.getLifecycle().a(this);
        c10.f0(this);
        this.f33629i = nestedFragment.getChildScreenContainers();
    }

    private final void F() {
        BottomSheetBehavior<r> sheetBehavior;
        BottomSheetBehavior.f fVar = this.f33627g;
        if (fVar != null && (sheetBehavior = this.f33621a.m().getSheetBehavior()) != null) {
            sheetBehavior.s0(fVar);
        }
        C3212e c3212e = this.f33622b;
        if (c3212e == null) {
            Intrinsics.v("dimmingView");
            c3212e = null;
        }
        c3212e.setOnClickListener(null);
        this.f33621a.f().getLifecycle().d(this);
        this.f33628h.f(this);
    }

    private final void H(boolean z10) {
        if (isRemoving()) {
            return;
        }
        if (z10) {
            ReactContext reactContext = this.f33621a.m().getReactContext();
            int e10 = L0.e(reactContext);
            EventDispatcher c10 = L0.c(reactContext, m().getId());
            if (c10 != null) {
                c10.c(new ha.g(e10, m().getId()));
            }
        }
        F();
        G();
    }

    private final B I() {
        C2949t container = m().getContainer();
        if (container instanceof B) {
            return (B) container;
        }
        return null;
    }

    private final void J() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        C3213f c3213f = new C3213f(requireContext);
        c3213f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c3213f.setBackgroundColor(0);
        c3213f.setId(View.generateViewId());
        this.f33623c = c3213f;
    }

    private final void K() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        C3212e c3212e = new C3212e(requireContext, this.f33624d);
        c3212e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c3212e.setOnClickListener(new View.OnClickListener() { // from class: ga.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimationAnimationListenerC3211d.L(AnimationAnimationListenerC3211d.this, view);
            }
        });
        this.f33622b = c3212e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(AnimationAnimationListenerC3211d this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m().getSheetClosesOnTouchOutside()) {
            this$0.H(true);
        }
    }

    private final void M() {
        J();
        K();
        C3213f c3213f = this.f33623c;
        C3212e c3212e = null;
        if (c3213f == null) {
            Intrinsics.v("containerView");
            c3213f = null;
        }
        C3212e c3212e2 = this.f33622b;
        if (c3212e2 == null) {
            Intrinsics.v("dimmingView");
        } else {
            c3212e = c3212e2;
        }
        c3213f.addView(c3212e);
    }

    private final void N() {
        G childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        P n10 = childFragmentManager.n();
        Intrinsics.checkNotNullExpressionValue(n10, "beginTransaction()");
        n10.t(true);
        n10.c(requireView().getId(), this.f33621a.f(), null);
        n10.h();
    }

    private final View O() {
        Activity currentActivity = m().getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    public void G() {
        B I10 = I();
        if (I10 != null) {
            I10.D(this);
        }
    }

    @Override // com.swmansion.rnscreens.z
    public void b(C2949t container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f33621a.b(container);
    }

    @Override // com.swmansion.rnscreens.v
    public void c(y.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new n("An operation is not implemented: Not yet implemented");
    }

    @Override // androidx.lifecycle.InterfaceC1596m
    public void d(InterfaceC1599p source, AbstractC1592i.a event) {
        BottomSheetBehavior<r> sheetBehavior;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (c.f33637a[event.ordinal()] != 1 || (sheetBehavior = this.f33621a.m().getSheetBehavior()) == null) {
            return;
        }
        r m10 = this.f33621a.m();
        C3212e c3212e = this.f33622b;
        if (c3212e == null) {
            Intrinsics.v("dimmingView");
            c3212e = null;
        }
        a aVar = new a(m10, c3212e, this.f33624d);
        this.f33627g = aVar;
        Intrinsics.d(aVar);
        sheetBehavior.W(aVar);
    }

    @Override // com.swmansion.rnscreens.z
    public Activity e() {
        return getActivity();
    }

    @Override // com.swmansion.rnscreens.z
    public ReactContext k() {
        Context context = getContext();
        if (context instanceof ReactContext) {
            return (ReactContext) context;
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.z
    public r m() {
        return this.f33621a.m();
    }

    @Override // com.swmansion.rnscreens.InterfaceC2944n
    public void n(D dismissed) {
        Intrinsics.checkNotNullParameter(dismissed, "dismissed");
        H(true);
    }

    @Override // com.swmansion.rnscreens.v
    public void o(y.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new n("An operation is not implemented: Not yet implemented");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        G();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return AnimationUtils.loadAnimation(getContext(), z10 ? AbstractC2945o.f29974f : AbstractC2945o.f29975g);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        M();
        C3213f c3213f = this.f33623c;
        if (c3213f != null) {
            return c3213f;
        }
        Intrinsics.v("containerView");
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onPause() {
        super.onPause();
        this.f33628h.f(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onResume() {
        this.f33628h.a(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onStart() {
        super.onStart();
        this.f33628h.d(O());
        N();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        C3212e c3212e = null;
        if (m().getSheetInitialDetentIndex() <= m().getSheetLargestUndimmedDetentIndex()) {
            C3212e c3212e2 = this.f33622b;
            if (c3212e2 == null) {
                Intrinsics.v("dimmingView");
            } else {
                c3212e = c3212e2;
            }
            c3212e.setAlpha(0.0f);
            return;
        }
        C3212e c3212e3 = this.f33622b;
        if (c3212e3 == null) {
            Intrinsics.v("dimmingView");
        } else {
            c3212e = c3212e3;
        }
        c3212e.setAlpha(this.f33624d);
    }

    @Override // androidx.core.view.I
    public K0 p(View v10, K0 insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean p10 = insets.p(K0.m.b());
        androidx.core.graphics.e f10 = insets.f(K0.m.b());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        if (p10) {
            this.f33625e = true;
            this.f33626f = new C2943m(f10.f15927d);
            BottomSheetBehavior<r> sheetBehavior = m().getSheetBehavior();
            if (sheetBehavior != null) {
                z zVar = this.f33621a;
                Intrinsics.e(zVar, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                ((C) zVar).V(sheetBehavior, new C2943m(f10.f15927d));
            }
            if (isRemoving()) {
                return insets;
            }
            androidx.core.graphics.e f11 = insets.f(K0.m.e());
            Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
            K0 a10 = new K0.b(insets).b(K0.m.e(), androidx.core.graphics.e.b(f11.f15924a, f11.f15925b, f11.f15926c, 0)).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            return a10;
        }
        if (isRemoving()) {
            androidx.core.graphics.e f12 = insets.f(K0.m.e());
            Intrinsics.checkNotNullExpressionValue(f12, "getInsets(...)");
            K0 a11 = new K0.b(insets).b(K0.m.e(), androidx.core.graphics.e.b(f12.f15924a, f12.f15925b, f12.f15926c, 0)).a();
            Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
            return a11;
        }
        BottomSheetBehavior<r> sheetBehavior2 = m().getSheetBehavior();
        if (sheetBehavior2 != null) {
            if (this.f33625e) {
                z zVar2 = this.f33621a;
                Intrinsics.e(zVar2, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                ((C) zVar2).V(sheetBehavior2, C2940j.f29966a);
            } else {
                AbstractC2942l abstractC2942l = this.f33626f;
                C2941k c2941k = C2941k.f29967a;
                if (!Intrinsics.b(abstractC2942l, c2941k)) {
                    z zVar3 = this.f33621a;
                    Intrinsics.e(zVar3, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                    ((C) zVar3).V(sheetBehavior2, c2941k);
                }
            }
        }
        this.f33626f = C2941k.f29967a;
        this.f33625e = false;
        androidx.core.graphics.e f13 = insets.f(K0.m.e());
        Intrinsics.checkNotNullExpressionValue(f13, "getInsets(...)");
        K0 a12 = new K0.b(insets).b(K0.m.e(), androidx.core.graphics.e.b(f13.f15924a, f13.f15925b, f13.f15926c, 0)).a();
        Intrinsics.checkNotNullExpressionValue(a12, "build(...)");
        return a12;
    }

    @Override // com.swmansion.rnscreens.z
    /* renamed from: q */
    public List getChildScreenContainers() {
        return this.f33629i;
    }

    @Override // com.swmansion.rnscreens.z
    public void r(C2949t container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f33621a.r(container);
    }

    @Override // com.swmansion.rnscreens.z
    public void s() {
        this.f33621a.s();
    }

    @Override // com.swmansion.rnscreens.InterfaceC2938h
    public ComponentCallbacksC1573o f() {
        return this;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
