package x0;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import h.AbstractC3220a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0.g;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f44637b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f44638a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            g gVar = new g(activity, null);
            gVar.b();
            return gVar;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f44639a;

        /* renamed from: b, reason: collision with root package name */
        private int f44640b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f44641c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f44642d;

        /* renamed from: e, reason: collision with root package name */
        private Drawable f44643e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f44644f;

        /* renamed from: g, reason: collision with root package name */
        private d f44645g;

        /* renamed from: h, reason: collision with root package name */
        private e f44646h;

        /* renamed from: i, reason: collision with root package name */
        private s f44647i;

        public static final class a implements View.OnLayoutChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f44649b;

            a(s sVar) {
                this.f44649b = sVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!b.this.h().a()) {
                        b.this.d(this.f44649b);
                    } else {
                        b.this.f44647i = this.f44649b;
                    }
                }
            }
        }

        public b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f44639a = activity;
            this.f44645g = new d() { // from class: x0.h
                @Override // x0.g.d
                public final boolean a() {
                    boolean l10;
                    l10 = g.b.l();
                    return l10;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(s splashScreenViewProvider, e finalListener) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider, "$splashScreenViewProvider");
            Intrinsics.checkNotNullParameter(finalListener, "$finalListener");
            splashScreenViewProvider.a().bringToFront();
            finalListener.a(splashScreenViewProvider);
        }

        private final void f(View view, Drawable drawable) {
            float dimension;
            ImageView imageView = (ImageView) view.findViewById(x0.e.f44635a);
            if (this.f44644f) {
                Drawable b10 = AbstractC3220a.b(imageView.getContext(), x0.d.f44634a);
                dimension = imageView.getResources().getDimension(x0.c.f44633b) * 0.6666667f;
                if (b10 != null) {
                    imageView.setBackground(new C5093a(b10, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(x0.c.f44632a) * 0.6666667f;
            }
            imageView.setImageDrawable(new C5093a(drawable, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l() {
            return false;
        }

        public final void d(final s splashScreenViewProvider) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
            final e eVar = this.f44646h;
            if (eVar == null) {
                return;
            }
            this.f44646h = null;
            splashScreenViewProvider.a().postOnAnimation(new Runnable() { // from class: x0.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.e(s.this, eVar);
                }
            });
        }

        public final Activity g() {
            return this.f44639a;
        }

        public final d h() {
            return this.f44645g;
        }

        public void i() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f44639a.getTheme();
            if (currentTheme.resolveAttribute(x0.b.f44631d, typedValue, true)) {
                this.f44641c = Integer.valueOf(typedValue.resourceId);
                this.f44642d = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(x0.b.f44630c, typedValue, true)) {
                this.f44643e = AbstractC3220a.b(this.f44639a, typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(x0.b.f44629b, typedValue, true)) {
                this.f44644f = typedValue.resourceId == x0.c.f44633b;
            }
            Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
            k(currentTheme, typedValue);
        }

        public void j(e exitAnimationListener) {
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            this.f44646h = exitAnimationListener;
            s sVar = new s(this.f44639a);
            Integer num = this.f44641c;
            Integer num2 = this.f44642d;
            View a10 = sVar.a();
            if (num != null && num.intValue() != 0) {
                a10.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                a10.setBackgroundColor(num2.intValue());
            } else {
                a10.setBackground(this.f44639a.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f44643e;
            if (drawable != null) {
                f(a10, drawable);
            }
            a10.addOnLayoutChangeListener(new a(sVar));
        }

        protected final void k(Resources.Theme currentTheme, TypedValue typedValue) {
            Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
            Intrinsics.checkNotNullParameter(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(x0.b.f44628a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f44640b = i10;
                if (i10 != 0) {
                    this.f44639a.setTheme(i10);
                }
            }
        }
    }

    public interface d {
        boolean a();
    }

    public interface e {
        void a(s sVar);
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f44638a.i();
    }

    public final void c(e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44638a.j(listener);
    }

    private g(Activity activity) {
        this.f44638a = Build.VERSION.SDK_INT >= 31 ? new c(activity) : new b(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends b {

        /* renamed from: j, reason: collision with root package name */
        private boolean f44650j;

        /* renamed from: k, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f44651k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f44650j = true;
            this.f44651k = new a(activity);
        }

        private final void n() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = g().getTheme();
            Window window = g().getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            Intrinsics.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            Intrinsics.checkNotNullExpressionValue(theme, "theme");
            w.a(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.f44650j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(c this$0, e exitAnimationListener, SplashScreenView splashScreenView) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(exitAnimationListener, "$exitAnimationListener");
            Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
            if (Build.VERSION.SDK_INT < 33) {
                this$0.n();
            }
            exitAnimationListener.a(new s(splashScreenView, this$0.g()));
        }

        @Override // x0.g.b
        public void i() {
            Resources.Theme theme = g().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
            k(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = g().getWindow().getDecorView();
                Intrinsics.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f44651k);
            }
        }

        @Override // x0.g.b
        public void j(final e exitAnimationListener) {
            SplashScreen splashScreen;
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            splashScreen = g().getSplashScreen();
            splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: x0.p
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    g.c.q(g.c.this, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final boolean o(SplashScreenView child) {
            WindowInsets build;
            View rootView;
            Intrinsics.checkNotNullParameter(child, "child");
            build = j.a().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = child.getRootView();
            return (build == rootView.computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
        }

        public final void p(boolean z10) {
            this.f44650j = z10;
        }

        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f44653b;

            a(Activity activity) {
                this.f44653b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (q.a(view2)) {
                    c cVar = c.this;
                    cVar.p(cVar.o(r.a(view2)));
                    View decorView = this.f44653b.getWindow().getDecorView();
                    Intrinsics.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}
