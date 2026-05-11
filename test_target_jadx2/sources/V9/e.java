package V9;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.T;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends j implements A0 {

    /* renamed from: a, reason: collision with root package name */
    private final F0 f11083a;

    /* renamed from: b, reason: collision with root package name */
    private final T f11084b;

    /* renamed from: c, reason: collision with root package name */
    private b f11085c;

    /* renamed from: d, reason: collision with root package name */
    private EventDispatcher f11086d;

    /* renamed from: e, reason: collision with root package name */
    private E0 f11087e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(F0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f11083a = reactContext;
        this.f11084b = new T(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f11085c = new b(this);
        }
    }

    private final void s(int i10, int i11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", L9.e.a(i10));
        writableNativeMap.putDouble("screenHeight", L9.e.a(i11));
        E0 e02 = this.f11087e;
        if (e02 != null) {
            e02.updateState(writableNativeMap);
        }
    }

    @Override // com.facebook.react.uimanager.A0
    public void a(Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        this.f11083a.b().handleException(new RuntimeException(t10));
    }

    @Override // com.facebook.react.uimanager.A0
    public void b(View view, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher = this.f11086d;
        if (eventDispatcher != null) {
            this.f11084b.g(ev, eventDispatcher);
            b bVar = this.f11085c;
            if (bVar != null) {
                bVar.p(view, ev, eventDispatcher);
            }
        }
    }

    @Override // com.facebook.react.uimanager.A0
    public void d(View childView, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher = this.f11086d;
        if (eventDispatcher != null) {
            this.f11084b.f(ev, eventDispatcher);
        }
        b bVar = this.f11085c;
        if (bVar != null) {
            bVar.o();
        }
    }

    public final EventDispatcher getEventDispatcher$react_native_keyboard_controller_release() {
        return this.f11086d;
    }

    public final E0 getStateWrapper$react_native_keyboard_controller_release() {
        return this.f11087e;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point a10 = L9.c.a(this.f11083a);
        s(a10.x, a10.y);
        this.f11088f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s(0, 0);
        this.f11088f = false;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        b bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f11086d;
        if (eventDispatcher != null && (bVar = this.f11085c) != null) {
            bVar.v(event, eventDispatcher, false);
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent event) {
        b bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f11086d;
        if (eventDispatcher != null && (bVar = this.f11085c) != null) {
            bVar.v(event, eventDispatcher, true);
        }
        return super.onHoverEvent(event);
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f11086d;
        if (eventDispatcher != null) {
            try {
                this.f11084b.c(event, eventDispatcher);
                b bVar = this.f11085c;
                if (bVar != null) {
                    bVar.v(event, eventDispatcher, true);
                    Unit unit = Unit.f36324a;
                }
            } catch (RuntimeException e10) {
                P9.a aVar = P9.a.f7630a;
                str = f.f11089a;
                aVar.c(str, "Can not handle touch event", e10);
                Unit unit2 = Unit.f36324a;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.j, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        s(i10, i11);
    }

    @Override // com.facebook.react.views.view.j, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f11086d;
        if (eventDispatcher != null) {
            try {
                this.f11084b.c(event, eventDispatcher);
                b bVar = this.f11085c;
                if (bVar != null) {
                    bVar.v(event, eventDispatcher, false);
                    Unit unit = Unit.f36324a;
                }
            } catch (RuntimeException e10) {
                P9.a aVar = P9.a.f7630a;
                str = f.f11089a;
                aVar.c(str, "Can not handle touch event", e10);
                Unit unit2 = Unit.f36324a;
            }
        }
        super.onTouchEvent(event);
        return true;
    }

    public final boolean r() {
        return this.f11088f;
    }

    public final void setAttached$react_native_keyboard_controller_release(boolean z10) {
        this.f11088f = z10;
    }

    public final void setEventDispatcher$react_native_keyboard_controller_release(EventDispatcher eventDispatcher) {
        this.f11086d = eventDispatcher;
    }

    public final void setStateWrapper$react_native_keyboard_controller_release(E0 e02) {
        this.f11087e = e02;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
    }
}
