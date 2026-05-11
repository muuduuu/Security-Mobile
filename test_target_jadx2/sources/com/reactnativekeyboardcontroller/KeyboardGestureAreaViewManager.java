package com.reactnativekeyboardcontroller;

import U9.e;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.c1;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.j;
import h5.C3260o;
import h5.InterfaceC3262p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010#\u001a\u001e\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00000\u00000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lh5/p;", "Lcom/facebook/react/views/view/j;", "<init>", "()V", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "context", "LU9/e;", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)LU9/e;", "view", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "setOffset", "(Lcom/facebook/react/views/view/j;D)V", "setInterpolator", "(Lcom/facebook/react/views/view/j;Ljava/lang/String;)V", BuildConfig.FLAVOR, "setShowOnSwipeUp", "(Lcom/facebook/react/views/view/j;Z)V", "setEnableSwipeToDismiss", "setTextInputNativeID", "LQ9/b;", "manager", "LQ9/b;", "Lh5/o;", "kotlin.jvm.PlatformType", "mDelegate", "Lh5/o;", "react-native-keyboard-controller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardGestureAreaViewManager extends ReactViewManager implements InterfaceC3262p {
    private final Q9.b manager = new Q9.b();
    private final C3260o mDelegate = new C3260o(this);

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardGestureArea";
    }

    @Override // h5.InterfaceC3262p
    @Z4.a(name = "textInputNativeID")
    public void setTextInputNativeID(j view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // h5.InterfaceC3262p
    @Z4.a(name = "enableSwipeToDismiss")
    public void setEnableSwipeToDismiss(j view, boolean value) {
        Q9.b bVar = this.manager;
        Intrinsics.e(view, "null cannot be cast to non-null type com.reactnativekeyboardcontroller.views.KeyboardGestureAreaReactViewGroup");
        bVar.d((e) view, value);
    }

    @Override // h5.InterfaceC3262p
    @Z4.a(name = "interpolator")
    public void setInterpolator(j view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Q9.b bVar = this.manager;
        e eVar = (e) view;
        if (value == null) {
            value = "linear";
        }
        bVar.b(eVar, value);
    }

    @Override // h5.InterfaceC3262p
    @Z4.a(name = "offset")
    public void setOffset(j view, double value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.manager.c((e) view, value);
    }

    @Override // h5.InterfaceC3262p
    @Z4.a(name = "showOnSwipeUp")
    public void setShowOnSwipeUp(j view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.manager.e((e) view, value);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public e createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.manager.a(context);
    }
}
