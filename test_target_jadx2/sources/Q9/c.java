package Q9;

import V9.d;
import com.facebook.react.uimanager.F0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8286a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final d a(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new d(reactContext);
    }

    public final void b(d view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (z10) {
            view.s();
        } else {
            view.r();
        }
    }
}
