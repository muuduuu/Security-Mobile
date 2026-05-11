package Q9;

import K9.f;
import O9.n;
import com.facebook.react.uimanager.F0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v4.AbstractC4929e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0157a f8283b = new C0157a(null);

    /* renamed from: a, reason: collision with root package name */
    private n f8284a;

    /* renamed from: Q9.a$a, reason: collision with other inner class name */
    public static final class C0157a {
        public /* synthetic */ C0157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0157a() {
        }
    }

    public final U9.c a(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (this.f8284a == null) {
            n nVar = new n(reactContext);
            this.f8284a = nVar;
            nVar.b();
        }
        return new U9.c(reactContext);
    }

    public final Map b() {
        f.a aVar = f.f5492f;
        Map j10 = AbstractC4929e.j(aVar.c().getValue(), AbstractC4929e.d("registrationName", "onKeyboardMove"), aVar.d().getValue(), AbstractC4929e.d("registrationName", "onKeyboardMoveStart"), aVar.a().getValue(), AbstractC4929e.d("registrationName", "onKeyboardMoveEnd"), aVar.b().getValue(), AbstractC4929e.d("registrationName", "onKeyboardMoveInteractive"), "topFocusedInputLayoutChanged", AbstractC4929e.d("registrationName", "onFocusedInputLayoutChanged"), "topFocusedInputTextChanged", AbstractC4929e.d("registrationName", "onFocusedInputTextChanged"), "topFocusedInputSelectionChanged", AbstractC4929e.d("registrationName", "onFocusedInputSelectionChanged"));
        Intrinsics.checkNotNullExpressionValue(j10, "of(...)");
        return j10;
    }

    public final void c() {
        n nVar = this.f8284a;
        if (nVar != null) {
            nVar.d();
        }
    }

    public final void d(U9.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.D();
    }

    public final void e(U9.c view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setActive(z10);
    }

    public final void f(U9.c view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarTranslucent(z10);
    }

    public final void g(U9.c view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPreserveEdgeToEdge(z10);
    }

    public final void h(U9.c view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(z10);
    }
}
