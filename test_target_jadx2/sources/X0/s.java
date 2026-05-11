package x0;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final a f44658a;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f44659a;

        /* renamed from: b, reason: collision with root package name */
        private final Lazy f44660b;

        /* renamed from: x0.s$a$a, reason: collision with other inner class name */
        static final class C0649a extends xc.m implements Function0 {
            C0649a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewGroup invoke() {
                View inflate = View.inflate(a.this.b(), f.f44636a, null);
                Intrinsics.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                return (ViewGroup) inflate;
            }
        }

        public a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f44659a = activity;
            this.f44660b = lc.i.a(new C0649a());
        }

        private final ViewGroup d() {
            return (ViewGroup) this.f44660b.getValue();
        }

        public void a() {
            View rootView = ((ViewGroup) this.f44659a.findViewById(R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(d());
            }
        }

        public final Activity b() {
            return this.f44659a;
        }

        public ViewGroup c() {
            return d();
        }

        public void e() {
            ViewParent parent = c().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c());
            }
        }
    }

    public s(Activity ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        a bVar = Build.VERSION.SDK_INT >= 31 ? new b(ctx) : new a(ctx);
        bVar.a();
        this.f44658a = bVar;
    }

    public final View a() {
        return this.f44658a.c();
    }

    public final void b() {
        this.f44658a.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(SplashScreenView platformView, Activity ctx) {
        this(ctx);
        Intrinsics.checkNotNullParameter(platformView, "platformView");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        a aVar = this.f44658a;
        Intrinsics.e(aVar, "null cannot be cast to non-null type androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31");
        ((b) aVar).h(platformView);
    }

    private static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public SplashScreenView f44662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // x0.s.a
        public void e() {
            f().remove();
            if (Build.VERSION.SDK_INT < 33) {
                Resources.Theme theme = b().getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
                View decorView = b().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
                w.b(theme, decorView, null, 4, null);
            }
        }

        public final SplashScreenView f() {
            SplashScreenView splashScreenView = this.f44662c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            Intrinsics.v("platformView");
            return null;
        }

        @Override // x0.s.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public SplashScreenView c() {
            return f();
        }

        public final void h(SplashScreenView splashScreenView) {
            Intrinsics.checkNotNullParameter(splashScreenView, "<set-?>");
            this.f44662c = splashScreenView;
        }

        @Override // x0.s.a
        public void a() {
        }
    }
}
