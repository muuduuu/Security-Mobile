package O9;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.F0;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7155d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static int f7156e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final F0 f7157a;

    /* renamed from: b, reason: collision with root package name */
    private O9.a f7158b = new O9.a(0.0d, 0.0d);

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f7159c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n(F0 f02) {
        this.f7157a = f02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(n this$0, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e(viewGroup);
    }

    private final void e(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        O9.a aVar = new O9.a(L9.e.a(viewGroup.getWidth()), L9.e.a(viewGroup.getHeight()));
        if (Intrinsics.b(aVar, this.f7158b)) {
            return;
        }
        this.f7158b = aVar;
        F0 f02 = this.f7157a;
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("height", aVar.a());
        createMap.putDouble("width", aVar.b());
        Unit unit = Unit.f36324a;
        Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
        L9.i.b(f02, "KeyboardController::windowDidResize", createMap);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        F0 f02 = this.f7157a;
        if (f02 == null || f7156e == f02.hashCode()) {
            return;
        }
        f7156e = this.f7157a.hashCode();
        final ViewGroup a10 = L9.h.a(this.f7157a);
        e(a10);
        this.f7159c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: O9.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                n.c(n.this, a10);
            }
        };
        if (a10 == null || (viewTreeObserver = a10.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.f7159c);
    }

    public final void d() {
        ViewGroup a10;
        ViewTreeObserver viewTreeObserver;
        F0 f02 = this.f7157a;
        if (f02 == null || (a10 = L9.h.a(f02)) == null || (viewTreeObserver = a10.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.f7159c);
    }
}
