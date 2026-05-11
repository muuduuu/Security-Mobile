package S9;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.core.view.K0;
import androidx.core.view.i1;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8923d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f8924a;

    /* renamed from: b, reason: collision with root package name */
    private i1 f8925b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f8926c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(ReactApplicationContext mReactContext) {
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.f8924a = mReactContext;
        this.f8926c = new WeakReference(null);
    }

    private final i1 f() {
        String str;
        Activity currentActivity = this.f8924a.getCurrentActivity();
        if (this.f8925b == null || !Intrinsics.b(currentActivity, this.f8926c.get())) {
            if (currentActivity == null) {
                P9.a aVar = P9.a.f7630a;
                str = k.f8927a;
                P9.a.d(aVar, str, "StatusBarManagerCompatModule: can not get `WindowInsetsControllerCompat` because current activity is null.", null, 4, null);
                return this.f8925b;
            }
            Window window = currentActivity.getWindow();
            this.f8926c = new WeakReference(currentActivity);
            this.f8925b = new i1(window, window.getDecorView());
        }
        return this.f8925b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Activity activity, boolean z10, int i10) {
        final Window window = activity.getWindow();
        if (!z10) {
            window.setStatusBarColor(i10);
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i10));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: S9.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j.i(window, valueAnimator);
            }
        });
        ofObject.setDuration(300L).setStartDelay(0L);
        ofObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Window window, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(boolean z10, j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z10) {
            i1 f10 = this$0.f();
            if (f10 != null) {
                f10.c(K0.m.f());
                return;
            }
            return;
        }
        i1 f11 = this$0.f();
        if (f11 != null) {
            f11.h(K0.m.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(j this$0, String style) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(style, "$style");
        i1 f10 = this$0.f();
        if (f10 == null) {
            return;
        }
        f10.f(Intrinsics.b(style, "dark-content"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(j this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View b10 = L9.h.b(this$0.f8924a);
        U9.c cVar = b10 != null ? (U9.c) b10.findViewWithTag(U9.c.f10359l.a()) : null;
        if (cVar != null) {
            cVar.z(z10);
        }
    }

    public final void g(final int i10, final boolean z10) {
        String str;
        final Activity currentActivity = this.f8924a.getCurrentActivity();
        if (currentActivity != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: S9.g
                @Override // java.lang.Runnable
                public final void run() {
                    j.h(currentActivity, z10, i10);
                }
            });
            return;
        }
        P9.a aVar = P9.a.f7630a;
        str = k.f8927a;
        P9.a.d(aVar, str, "StatusBarManagerCompatModule: Ignored status bar change, current activity is null.", null, 4, null);
    }

    public final void j(final boolean z10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: S9.f
            @Override // java.lang.Runnable
            public final void run() {
                j.k(z10, this);
            }
        });
    }

    public final void l(final String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: S9.h
            @Override // java.lang.Runnable
            public final void run() {
                j.m(j.this, style);
            }
        });
    }

    public final void n(final boolean z10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: S9.e
            @Override // java.lang.Runnable
            public final void run() {
                j.o(j.this, z10);
            }
        });
    }
}
