package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1512o0;
import androidx.core.view.K0;
import androidx.core.view.i1;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.L;
import com.swmansion.rnscreens.r;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f29899b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f29900c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f29901d;

    /* renamed from: e, reason: collision with root package name */
    private static Integer f29902e;

    /* renamed from: a, reason: collision with root package name */
    public static final L f29898a = new L();

    /* renamed from: f, reason: collision with root package name */
    private static d f29903f = new d();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29904a;

        static {
            int[] iArr = new int[r.g.values().length];
            try {
                iArr[r.g.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.g.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.g.STYLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.g.TRANSLUCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.g.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r.g.ANIMATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[r.g.NAVIGATION_BAR_COLOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[r.g.NAVIGATION_BAR_TRANSLUCENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[r.g.NAVIGATION_BAR_HIDDEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f29904a = iArr;
        }
    }

    public static final class b extends GuardedRunnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f29905a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f29906b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29907c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, Integer num, boolean z10, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f29905a = activity;
            this.f29906b = num;
            this.f29907c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Window window, ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = animator.getAnimatedValue();
            Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            final Window window = this.f29905a.getWindow();
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.f29906b);
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.M
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    L.b.b(window, valueAnimator);
                }
            });
            if (this.f29907c) {
                ofObject.setDuration(300L).setStartDelay(0L);
            } else {
                ofObject.setDuration(0L).setStartDelay(300L);
            }
            ofObject.start();
        }
    }

    public static final class c extends GuardedRunnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f29908a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z10, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f29908a = activity;
            this.f29909b = z10;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            View decorView = this.f29908a.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            if (this.f29909b) {
                C2939i c2939i = C2939i.f29960a;
                c2939i.d(decorView);
                c2939i.a(L.f29903f);
            } else {
                C2939i.f29960a.f(L.f29903f);
            }
            AbstractC1484a0.n0(decorView);
        }
    }

    public static final class d implements androidx.core.view.I {
        d() {
        }

        @Override // androidx.core.view.I
        public K0 p(View v10, K0 insets) {
            Intrinsics.checkNotNullParameter(v10, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            K0 c02 = AbstractC1484a0.c0(v10, insets);
            Intrinsics.checkNotNullExpressionValue(c02, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                K0 q10 = c02.q(c02.j(), 0, c02.k(), c02.i());
                Intrinsics.checkNotNullExpressionValue(q10, "replaceSystemWindowInsets(...)");
                return q10;
            }
            androidx.core.graphics.e f10 = c02.f(K0.m.f());
            Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
            K0 a10 = new K0.b().b(K0.m.f(), androidx.core.graphics.e.b(f10.f15924a, 0, f10.f15926c, f10.f15927d)).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            return a10;
        }
    }

    private L() {
    }

    private final boolean h(r rVar, r.g gVar) {
        switch (a.f29904a[gVar.ordinal()]) {
            case 1:
                if (rVar.getScreenOrientation() == null) {
                    return false;
                }
                break;
            case 2:
                if (rVar.getStatusBarColor() == null) {
                    return false;
                }
                break;
            case 3:
                if (rVar.getStatusBarStyle() == null) {
                    return false;
                }
                break;
            case 4:
                if (rVar.k() == null) {
                    return false;
                }
                break;
            case 5:
                if (rVar.j() == null) {
                    return false;
                }
                break;
            case 6:
                if (rVar.i() == null) {
                    return false;
                }
                break;
            case 7:
                if (rVar.getNavigationBarColor() == null) {
                    return false;
                }
                break;
            case 8:
                if (rVar.h() == null) {
                    return false;
                }
                break;
            case 9:
                if (rVar.g() == null) {
                    return false;
                }
                break;
            default:
                throw new lc.m();
        }
        return true;
    }

    private final r i(r rVar, r.g gVar) {
        z fragmentWrapper;
        if (rVar == null || (fragmentWrapper = rVar.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            r topScreen = ((C2949t) it.next()).getTopScreen();
            L l10 = f29898a;
            r i10 = l10.i(topScreen, gVar);
            if (i10 != null) {
                return i10;
            }
            if (topScreen != null && l10.h(topScreen, gVar)) {
                return topScreen;
            }
        }
        return null;
    }

    private final r j(r rVar, r.g gVar) {
        for (ViewParent container = rVar.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof r) {
                r rVar2 = (r) container;
                if (h(rVar2, gVar)) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    private final r k(r rVar, r.g gVar) {
        r i10 = i(rVar, gVar);
        return i10 != null ? i10 : h(rVar, gVar) ? rVar : j(rVar, gVar);
    }

    private final boolean l(int i10) {
        return ((double) 1) - ((((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d)) / ((double) 255)) < 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(boolean z10, i1 controller) {
        Intrinsics.checkNotNullParameter(controller, "$controller");
        if (z10) {
            controller.c(K0.m.f());
        } else {
            controller.h(K0.m.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Window window, int i10) {
        new i1(window, window.getDecorView()).e(f29898a.l(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Activity activity, String style) {
        Intrinsics.checkNotNullParameter(style, "$style");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        new i1(activity.getWindow(), decorView).f(Intrinsics.b(style, "dark"));
    }

    public final void e() {
        f29901d = true;
    }

    public final void f() {
        f29899b = true;
    }

    public final void g() {
        f29900c = true;
    }

    public final void m(r screen, Activity activity, ReactContext reactContext) {
        Integer num;
        Boolean i10;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        if (f29902e == null) {
            f29902e = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        r k10 = k(screen, r.g.COLOR);
        r k11 = k(screen, r.g.ANIMATED);
        if (k10 == null || (num = k10.getStatusBarColor()) == null) {
            num = f29902e;
        }
        UiThreadUtil.runOnUiThread(new b(activity, num, (k11 == null || (i10 = k11.i()) == null) ? false : i10.booleanValue(), reactContext.getExceptionHandler()));
    }

    public final void o(r screen, Activity activity) {
        Boolean j10;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        r k10 = k(screen, r.g.HIDDEN);
        final boolean booleanValue = (k10 == null || (j10 = k10.j()) == null) ? false : j10.booleanValue();
        Window window = activity.getWindow();
        final i1 i1Var = new i1(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.I
            @Override // java.lang.Runnable
            public final void run() {
                L.n(booleanValue, i1Var);
            }
        });
    }

    public final void q(r screen, Activity activity) {
        Integer navigationBarColor;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        final Window window = activity.getWindow();
        r k10 = k(screen, r.g.NAVIGATION_BAR_COLOR);
        final int navigationBarColor2 = (k10 == null || (navigationBarColor = k10.getNavigationBarColor()) == null) ? window.getNavigationBarColor() : navigationBarColor.intValue();
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.K
            @Override // java.lang.Runnable
            public final void run() {
                L.p(window, navigationBarColor2);
            }
        });
        window.setNavigationBarColor(navigationBarColor2);
    }

    public final void r(r screen, Activity activity) {
        Boolean g10;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        r k10 = k(screen, r.g.NAVIGATION_BAR_HIDDEN);
        if (!((k10 == null || (g10 = k10.g()) == null) ? false : g10.booleanValue())) {
            new i1(window, window.getDecorView()).h(K0.m.e());
            return;
        }
        i1 i1Var = new i1(window, window.getDecorView());
        i1Var.c(K0.m.e());
        i1Var.g(2);
    }

    public final void s(r screen, Activity activity) {
        Boolean h10;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        r k10 = k(screen, r.g.NAVIGATION_BAR_TRANSLUCENT);
        if (k10 == null || (h10 = k10.h()) == null) {
            return;
        }
        AbstractC1512o0.b(window, !h10.booleanValue());
    }

    public final void t(r screen, Activity activity) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        r k10 = k(screen, r.g.ORIENTATION);
        activity.setRequestedOrientation((k10 == null || (screenOrientation = k10.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void v(r screen, final Activity activity, ReactContext reactContext) {
        final String str;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        r k10 = k(screen, r.g.STYLE);
        if (k10 == null || (str = k10.getStatusBarStyle()) == null) {
            str = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.J
            @Override // java.lang.Runnable
            public final void run() {
                L.u(activity, str);
            }
        });
    }

    public final void w(r screen, Activity activity, ReactContext reactContext) {
        Boolean k10;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        r k11 = k(screen, r.g.TRANSLUCENT);
        UiThreadUtil.runOnUiThread(new c(activity, (k11 == null || (k10 = k11.k()) == null) ? false : k10.booleanValue(), reactContext.getExceptionHandler()));
    }

    public final void x(r screen, Activity activity, ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (f29899b) {
            t(screen, activity);
        }
        if (f29900c) {
            m(screen, activity, reactContext);
            v(screen, activity, reactContext);
            w(screen, activity, reactContext);
            o(screen, activity);
        }
        if (f29901d) {
            q(screen, activity);
            s(screen, activity);
            r(screen, activity);
        }
    }
}
