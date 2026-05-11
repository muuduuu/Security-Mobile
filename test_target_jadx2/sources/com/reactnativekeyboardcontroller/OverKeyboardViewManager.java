package com.reactnativekeyboardcontroller;

import Q9.c;
import V9.d;
import android.view.View;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import h5.C3271u;
import h5.InterfaceC3273v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010(\u001a\u001e\u0012\f\u0012\n '*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n '*\u0004\u0018\u00010\u00000\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/reactnativekeyboardcontroller/OverKeyboardViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LV9/d;", "Lh5/v;", "<init>", "()V", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)LV9/d;", "Lcom/facebook/react/uimanager/V;", "createShadowNodeInstance", "()Lcom/facebook/react/uimanager/V;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "Lcom/facebook/react/uimanager/v0;", "props", "Lcom/facebook/react/uimanager/E0;", "stateWrapper", BuildConfig.FLAVOR, "updateState", "(LV9/d;Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/uimanager/E0;)Ljava/lang/Object;", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "setVisible", "(LV9/d;Z)V", "LQ9/c;", "manager", "LQ9/c;", "Lh5/u;", "kotlin.jvm.PlatformType", "mDelegate", "Lh5/u;", "react-native-keyboard-controller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OverKeyboardViewManager extends ViewGroupManager<d> implements InterfaceC3273v {
    private final c manager = new c();
    private final C3271u mDelegate = new C3271u(this);

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "OverKeyboardView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends V> getShadowNodeClass() {
        return V9.c.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public V createShadowNodeInstance() {
        return new V9.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.manager.a(context);
    }

    @Override // h5.InterfaceC3273v
    @Z4.a(name = "visible")
    public void setVisible(d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.manager.b(view, value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(d view, C1973v0 props, E0 stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        return null;
    }
}
