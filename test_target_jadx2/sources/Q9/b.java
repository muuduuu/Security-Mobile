package Q9;

import U9.e;
import com.facebook.react.uimanager.F0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8285a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final e a(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new e(reactContext);
    }

    public final void b(e view, String interpolator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        view.setInterpolator(interpolator);
    }

    public final void c(e view, double d10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOffset(d10);
    }

    public final void d(e view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollKeyboardOffScreenWhenVisible(z10);
    }

    public final void e(e view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollKeyboardOnScreenWhenNotVisible(z10);
    }
}
