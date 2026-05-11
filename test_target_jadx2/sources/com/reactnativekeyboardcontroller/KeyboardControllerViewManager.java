package com.reactnativekeyboardcontroller;

import U9.c;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.c1;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.j;
import h5.C3256m;
import h5.InterfaceC3258n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0012J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R0\u0010%\u001a\u001e\u0012\f\u0012\n $*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n $*\u0004\u0018\u00010\u00000\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lh5/n;", "Lcom/facebook/react/views/view/j;", "<init>", "()V", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/facebook/react/views/view/j;", BuildConfig.FLAVOR, "invalidate", "view", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/view/j;)V", BuildConfig.FLAVOR, "value", "setStatusBarTranslucent", "(Lcom/facebook/react/views/view/j;Z)V", "setNavigationBarTranslucent", "setPreserveEdgeToEdge", "setEnabled", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "getName", "()Ljava/lang/String;", "LQ9/a;", "manager", "LQ9/a;", "Lh5/m;", "kotlin.jvm.PlatformType", "mDelegate", "Lh5/m;", "react-native-keyboard-controller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardControllerViewManager extends ReactViewManager implements InterfaceC3258n {
    private final Q9.a manager = new Q9.a();
    private final C3256m mDelegate = new C3256m(this);

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.manager.b();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardControllerView";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.manager.c();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public j createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.manager.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((KeyboardControllerViewManager) view);
        this.manager.d((c) view);
    }

    @Override // h5.InterfaceC3258n
    @Z4.a(name = AppConstants.VIDEO_RECORDING_ENABLED)
    public void setEnabled(j view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.manager.e((c) view, value);
    }

    @Override // h5.InterfaceC3258n
    @Z4.a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(j view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.manager.f((c) view, value);
    }

    @Override // h5.InterfaceC3258n
    @Z4.a(name = "preserveEdgeToEdge")
    public void setPreserveEdgeToEdge(j view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.manager.g((c) view, value);
    }

    @Override // h5.InterfaceC3258n
    @Z4.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(j view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.manager.h((c) view, value);
    }
}
