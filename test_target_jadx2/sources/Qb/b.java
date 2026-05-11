package Qb;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import androidx.core.view.AbstractC1512o0;
import androidx.core.view.K0;
import androidx.core.view.i1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8292a = new b();

    /* renamed from: Qb.b$b, reason: collision with other inner class name */
    static final class C0159b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0159b f8294a = new C0159b();

        C0159b() {
            super(1);
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            Log.e("NavigationBar", m10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    static final class d extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f8296a = new d();

        d() {
            super(1);
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            Log.e("NavigationBar", m10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    static final class f extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f8298a = new f();

        f() {
            super(1);
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            Log.e("NavigationBar", m10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    static final class h extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f8300a = new h();

        h() {
            super(1);
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            Log.e("NavigationBar", m10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    static final class j extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f8302a = new j();

        j() {
            super(1);
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            Log.e("NavigationBar", m10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    private b() {
    }

    public static final void b(Activity activity, String behavior) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        f8292a.c(activity, behavior, a.f8293a, C0159b.f8294a);
    }

    public static final void d(Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f8292a.e(activity, i10, c.f8295a, d.f8296a);
    }

    public static final void g(Activity activity, String visible) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(visible, "visible");
        f8292a.c(activity, visible, e.f8297a, f.f8298a);
    }

    public static final void h(Activity activity, String position) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(position, "position");
        f8292a.i(activity, position, g.f8299a, h.f8300a);
    }

    public static final void j(Activity activity, String visibility) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        f8292a.k(activity, visibility, i.f8301a, j.f8302a);
    }

    public final void a(Activity activity, int i10, Function0 successCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        activity.getWindow().setNavigationBarColor(i10);
        successCallback.invoke();
    }

    public final void c(Activity activity, String behavior, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        i1 i1Var = new i1(activity.getWindow(), activity.getWindow().getDecorView());
        int hashCode = behavior.hashCode();
        if (hashCode == -1158014083) {
            if (behavior.equals("overlay-swipe")) {
                i1Var.g(2);
                successCallback.invoke();
                return;
            }
            failureCallback.invoke("Invalid behavior: \"" + behavior + "\"");
        }
        if (hashCode == -342250870) {
            if (behavior.equals("inset-swipe")) {
                i1Var.g(1);
                successCallback.invoke();
                return;
            }
            failureCallback.invoke("Invalid behavior: \"" + behavior + "\"");
        }
        if (hashCode == -341554545 && behavior.equals("inset-touch")) {
            i1Var.g(0);
            successCallback.invoke();
            return;
        }
        failureCallback.invoke("Invalid behavior: \"" + behavior + "\"");
    }

    public final void e(Activity activity, int i10, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        if (Build.VERSION.SDK_INT < 28) {
            failureCallback.invoke("'setBorderColorAsync' is only available on Android API 28 or higher");
        } else {
            activity.getWindow().setNavigationBarDividerColor(i10);
            successCallback.invoke();
        }
    }

    public final void f(Activity activity, String buttonStyle, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        i1 i1Var = new i1(activity.getWindow(), activity.getWindow().getDecorView());
        if (Intrinsics.b(buttonStyle, "light")) {
            i1Var.e(false);
        } else {
            if (!Intrinsics.b(buttonStyle, "dark")) {
                failureCallback.invoke("Invalid style: \"" + buttonStyle + "\"");
                return;
            }
            i1Var.e(true);
        }
        successCallback.invoke();
    }

    public final void i(Activity activity, String position, Function0 successCallback, Function1 failureCallback) {
        boolean z10;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        if (Intrinsics.b(position, "absolute")) {
            z10 = false;
        } else {
            if (!Intrinsics.b(position, "relative")) {
                failureCallback.invoke("Invalid position: \"" + position + "\"");
                return;
            }
            z10 = true;
        }
        AbstractC1512o0.b(activity.getWindow(), z10);
        activity.getWindow().getDecorView().setFitsSystemWindows(z10);
        successCallback.invoke();
    }

    public final void k(Activity activity, String visibility, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        i1 i1Var = new i1(activity.getWindow(), activity.getWindow().getDecorView());
        if (Intrinsics.b(visibility, "visible")) {
            i1Var.h(K0.m.e());
        } else {
            if (!Intrinsics.b(visibility, "hidden")) {
                failureCallback.invoke("Invalid visibility: \"" + visibility + "\"");
                return;
            }
            i1Var.c(K0.m.e());
        }
        successCallback.invoke();
    }

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8293a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }

        public final void a() {
        }
    }

    static final class c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8295a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }

        public final void a() {
        }
    }

    static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8297a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }

        public final void a() {
        }
    }

    static final class g extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f8299a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }

        public final void a() {
        }
    }

    static final class i extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f8301a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }

        public final void a() {
        }
    }
}
