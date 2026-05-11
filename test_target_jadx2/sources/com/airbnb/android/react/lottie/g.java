package com.airbnb.android.react.lottie;

import O1.H;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.AbstractC1484a0;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v4.AbstractC4929e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f19971a = new g();

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) v10;
            lottieAnimationView.setProgress(0.0f);
            lottieAnimationView.y();
            lottieAnimationView.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            ((LottieAnimationView) v10).removeOnAttachStateChangeListener(this);
        }
    }

    private g() {
    }

    public static final void A(float f10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.m(Float.valueOf(f10));
    }

    public static final void B(String str, h viewManager) {
        H h10;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 165298699) {
                if (hashCode != 899536360) {
                    if (hashCode == 2101957031 && str.equals("SOFTWARE")) {
                        h10 = H.SOFTWARE;
                    }
                } else if (str.equals("HARDWARE")) {
                    h10 = H.HARDWARE;
                }
            } else if (str.equals("AUTOMATIC")) {
                h10 = H.AUTOMATIC;
            }
            viewManager.n(h10);
        }
        h10 = null;
        viewManager.n(h10);
    }

    public static final void C(String str, h viewManager) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    }
                } else if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
            } else if (str.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            }
            viewManager.o(scaleType);
        }
        scaleType = null;
        viewManager.o(scaleType);
    }

    public static final void D(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.p(str);
        viewManager.a();
    }

    public static final void E(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.c(str);
        viewManager.a();
    }

    public static final void F(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null && !StringsKt.K(str, ".", false, 2, null)) {
            str = str + ".json";
        }
        viewManager.d(str);
        viewManager.a();
    }

    public static final void G(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.e(str);
        viewManager.a();
    }

    public static final void H(double d10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.q(Float.valueOf((float) d10));
    }

    public static final void I(ReadableArray readableArray, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.r(readableArray);
    }

    public static final LottieAnimationView e(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    public static final Map f() {
        Map f10 = AbstractC4929e.f("topAnimationFinish", AbstractC4929e.d("registrationName", "onAnimationFinish"), "topAnimationFailure", AbstractC4929e.d("registrationName", "onAnimationFailure"), "topAnimationLoaded", AbstractC4929e.d("registrationName", "onAnimationLoaded"));
        Intrinsics.checkNotNullExpressionValue(f10, "of(...)");
        return f10;
    }

    public static final Map g() {
        Map a10 = AbstractC4929e.a().b("VERSION", 1).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        return a10;
    }

    public static final void h(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.f
            @Override // java.lang.Runnable
            public final void run() {
                g.i(LottieAnimationView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (AbstractC1484a0.T(view)) {
            view.x();
        }
    }

    public static final void j(final LottieAnimationView view, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.e
            @Override // java.lang.Runnable
            public final void run() {
                g.k(i10, i11, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(int i10, int i11, LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (i10 != -1 && i11 != -1) {
            if (i10 > i11) {
                view.I(i11, i10);
                if (view.getSpeed() > 0.0f) {
                    view.C();
                }
            } else {
                view.I(i10, i11);
                if (view.getSpeed() < 0.0f) {
                    view.C();
                }
            }
        }
        if (!AbstractC1484a0.T(view)) {
            view.addOnAttachStateChangeListener(new a());
        } else {
            view.setProgress(0.0f);
            view.y();
        }
    }

    public static final void l(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.c
            @Override // java.lang.Runnable
            public final void run() {
                g.m(LottieAnimationView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (AbstractC1484a0.T(view)) {
            view.m();
            view.setProgress(0.0f);
        }
    }

    public static final void n(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.d
            @Override // java.lang.Runnable
            public final void run() {
                g.o(LottieAnimationView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (AbstractC1484a0.T(view)) {
            view.B();
        }
    }

    public static final void p(LottieAnimationView view, Throwable error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        F0 f02 = (F0) context;
        EventDispatcher c10 = L0.c(f02, view.getId());
        if (c10 != null) {
            c10.c(new j(f02.c(), view.getId(), error));
        }
    }

    public static final void q(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        F0 f02 = (F0) context;
        EventDispatcher c10 = L0.c(f02, view.getId());
        if (c10 != null) {
            c10.c(new l(f02.c(), view.getId()));
        }
    }

    public static final void r(LottieAnimationView view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        F0 f02 = (F0) context;
        EventDispatcher c10 = L0.c(f02, view.getId());
        if (c10 != null) {
            c10.c(new k(f02.c(), view.getId(), z10));
        }
    }

    public static final void s(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f(Boolean.valueOf(z10));
    }

    public static final void t(LottieAnimationView view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(z10);
    }

    public static final void u(ReadableArray readableArray, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.g(readableArray);
    }

    public static final void v(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.h(Boolean.valueOf(z10));
    }

    public static final void w(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.i(Boolean.valueOf(z10));
    }

    public static final void x(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.k(z10 ? 2 : 1);
    }

    public static final void y(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.j(str);
    }

    public static final void z(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.l(Boolean.valueOf(z10));
    }
}
