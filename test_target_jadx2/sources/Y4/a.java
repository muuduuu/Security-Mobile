package Y4;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: c, reason: collision with root package name */
    private static final C0224a f12008c = new C0224a(null);

    /* renamed from: a, reason: collision with root package name */
    private volatile int f12009a = -1;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f12010b;

    /* renamed from: Y4.a$a, reason: collision with other inner class name */
    private static final class C0224a {
        public /* synthetic */ C0224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0224a() {
        }
    }

    private final void c() {
        ViewParent viewParent = this.f12010b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.f12010b = null;
    }

    @Override // Y4.b
    public boolean a(ViewGroup view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = this.f12009a;
        return (i10 == -1 || event.getAction() == 1 || view.getId() != i10) ? false : true;
    }

    public final void b() {
        this.f12009a = -1;
        c();
    }

    public final void d(int i10, ViewParent viewParent) {
        this.f12009a = i10;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f12010b = viewParent;
        }
    }
}
