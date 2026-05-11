package Vb;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import expo.modules.splashscreen.SplashScreenOptions;
import kotlin.jvm.internal.Intrinsics;
import x0.g;
import x0.r;
import x0.s;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f11096c;

    /* renamed from: d, reason: collision with root package name */
    private static g f11097d;

    /* renamed from: a, reason: collision with root package name */
    public static final d f11094a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f11095b = true;

    /* renamed from: e, reason: collision with root package name */
    private static final ReactMarker.MarkerListener f11098e = new ReactMarker.MarkerListener() { // from class: Vb.a
        @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
        public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
            d.i(reactMarkerConstants, str, i10);
        }
    };

    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f11099a;

        a(View view) {
            this.f11099a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (d.f11095b) {
                return false;
            }
            this.f11099a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    private d() {
    }

    private final void e(SplashScreenOptions splashScreenOptions) {
        if (f11097d == null) {
            return;
        }
        final long duration = splashScreenOptions.getDuration();
        g gVar = f11097d;
        if (gVar == null) {
            Intrinsics.v("splashScreen");
            gVar = null;
        }
        gVar.c(new g.e() { // from class: Vb.b
            @Override // x0.g.e
            public final void a(s sVar) {
                d.g(duration, sVar);
            }
        });
    }

    static /* synthetic */ void f(d dVar, SplashScreenOptions splashScreenOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            splashScreenOptions = new SplashScreenOptions();
        }
        dVar.e(splashScreenOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(long j10, final s splashScreenViewProvider) {
        Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
        final View a10 = splashScreenViewProvider.a();
        a10.animate().setDuration(j10).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: Vb.c
            @Override // java.lang.Runnable
            public final void run() {
                d.h(s.this, a10);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(s splashScreenViewProvider, View splashScreenView) {
        Intrinsics.checkNotNullParameter(splashScreenViewProvider, "$splashScreenViewProvider");
        Intrinsics.checkNotNullParameter(splashScreenView, "$splashScreenView");
        if (Build.VERSION.SDK_INT < 31) {
            splashScreenViewProvider.b();
        } else {
            r.a(splashScreenView).remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        if (reactMarkerConstants != ReactMarkerConstants.CONTENT_APPEARED || f11096c) {
            return;
        }
        f11094a.j();
    }

    public final void j() {
        f11095b = false;
    }

    public final void k(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f11097d = g.f44637b.a(activity);
        ReactMarker.addListener(f11098e);
        View findViewById = activity.findViewById(R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new a(findViewById));
        f(this, null, 1, null);
    }

    public final void l(boolean z10) {
        f11096c = z10;
    }

    public final void m(SplashScreenOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        e(options);
    }

    public final void n() {
        ReactMarker.removeListener(f11098e);
    }
}
