package com.reactnativekeyboardcontroller;

import S9.j;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;", "Lcom/reactnativekeyboardcontroller/NativeStatusBarManagerCompatSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hidden", BuildConfig.FLAVOR, "setHidden", "(Z)V", BuildConfig.FLAVOR, "color", "animated", "setColor", "(DZ)V", "translucent", "setTranslucent", "style", "setStyle", "(Ljava/lang/String;)V", "LS9/j;", "module", "LS9/j;", "react-native-keyboard-controller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StatusBarManagerCompatModule extends NativeStatusBarManagerCompatSpec {
    private final j module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarManagerCompatModule(ReactApplicationContext mReactContext) {
        super(mReactContext);
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.module = new j(mReactContext);
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeStatusBarManagerCompatSpec.NAME;
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setColor(double color, boolean animated) {
        this.module.g((int) color, animated);
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setHidden(boolean hidden) {
        this.module.j(hidden);
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setStyle(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.module.l(style);
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setTranslucent(boolean translucent) {
        this.module.n(translucent);
    }
}
