package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.K0;
import c3.AbstractC1721a;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.views.view.o;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.C5146G;

@K4.a(name = "StatusBarManager")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "getStatusBarHeightPx", "()F", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getTypedExportedConstants", "()Ljava/util/Map;", BuildConfig.FLAVOR, "colorDouble", BuildConfig.FLAVOR, "animated", BuildConfig.FLAVOR, "setColor", "(DZ)V", "translucent", "setTranslucent", "(Z)V", "hidden", "setHidden", "style", "setStyle", "(Ljava/lang/String;)V", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public static final class b extends GuardedRunnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21866a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21867b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21868c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, boolean z10, int i10, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f21866a = activity;
            this.f21867b = z10;
            this.f21868c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Activity activity, ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            Object animatedValue = animator.getAnimatedValue();
            Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f21866a.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            if (!this.f21867b) {
                window.setStatusBarColor(this.f21868c);
                return;
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.f21868c));
            final Activity activity = this.f21866a;
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatusBarModule.b.b(activity, valueAnimator);
                }
            });
            ofObject.setDuration(300L).setStartDelay(0L);
            ofObject.start();
        }
    }

    public static final class c extends GuardedRunnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21870b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z10, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f21869a = activity;
            this.f21870b = z10;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f21869a.getWindow();
            if (window != null) {
                o.b(window, this.f21870b);
            }
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        K0 H10;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (H10 = AbstractC1484a0.H(decorView)) == null) {
            return 0.0f;
        }
        return H10.f(K0.m.f() | K0.m.e() | K0.m.a()).f15925b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z10) {
        Window window = activity.getWindow();
        if (window != null) {
            o.d(window, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        WindowInsetsController insetsController;
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(Intrinsics.b("dark-content", str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if (Intrinsics.b("dark-content", str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    protected Map<String, Object> getTypedExportedConstants() {
        String str;
        Window window;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            str = "black";
        } else {
            int statusBarColor = window.getStatusBarColor();
            C5146G c5146g = C5146G.f44966a;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(statusBarColor & 16777215)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        return G.k(t.a(HEIGHT_KEY, Float.valueOf(C1944g0.e(getStatusBarHeightPx()))), t.a(DEFAULT_BACKGROUND_COLOR_KEY, str));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double colorDouble, boolean animated) {
        int i10 = (int) colorDouble;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC1721a.J("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, animated, i10, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean hidden) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC1721a.J("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.a
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$1(currentActivity, hidden);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(final String style) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC1721a.J("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.b
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setStyle$lambda$2(currentActivity, style);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean translucent) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC1721a.J("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(currentActivity, translucent, getReactApplicationContext()));
        }
    }
}
