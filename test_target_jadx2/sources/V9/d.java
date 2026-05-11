package V9;

import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final F0 f11079a;

    /* renamed from: b, reason: collision with root package name */
    private final EventDispatcher f11080b;

    /* renamed from: c, reason: collision with root package name */
    private WindowManager f11081c;

    /* renamed from: d, reason: collision with root package name */
    private e f11082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(F0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f11079a = reactContext;
        EventDispatcher c10 = L0.c(reactContext, getId());
        this.f11080b = c10;
        Object systemService = reactContext.getSystemService("window");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f11081c = (WindowManager) systemService;
        e eVar = new e(reactContext);
        this.f11082d = eVar;
        eVar.setEventDispatcher$react_native_keyboard_controller_release(c10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f11082d.addView(view, i10);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i10) {
        return this.f11082d.getChildAt(i10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f11082d.getChildCount();
    }

    public final E0 getStateWrapper() {
        return this.f11082d.getStateWrapper$react_native_keyboard_controller_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    public final void r() {
        if (this.f11082d.r()) {
            this.f11081c.removeView(this.f11082d);
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f11082d.removeView(view);
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup
    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f11082d.removeView(getChildAt(i10));
    }

    public final void s() {
        this.f11081c.addView(this.f11082d, new WindowManager.LayoutParams(-1, -1, 1000, 520, -3));
    }

    public final void setStateWrapper(E0 e02) {
        this.f11082d.setStateWrapper$react_native_keyboard_controller_release(e02);
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
