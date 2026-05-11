package com.reactnativekeyboardcontroller;

import S9.d;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;", "Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", BuildConfig.FLAVOR, "mode", BuildConfig.FLAVOR, "setInputMode", "(D)V", "setDefaultMode", "()V", BuildConfig.FLAVOR, "keepFocus", "dismiss", "(Z)V", "direction", "setFocusTo", "(Ljava/lang/String;)V", "eventName", "addListener", "count", "removeListeners", "LS9/d;", "module", "LS9/d;", "react-native-keyboard-controller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardControllerModule extends NativeKeyboardControllerSpec {
    private final d module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardControllerModule(ReactApplicationContext mReactContext) {
        super(mReactContext);
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.module = new d(mReactContext);
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void addListener(String eventName) {
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void dismiss(boolean keepFocus) {
        this.module.d(keepFocus);
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeKeyboardControllerSpec.NAME;
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void removeListeners(double count) {
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void setDefaultMode() {
        this.module.g();
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void setFocusTo(String direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.module.h(direction);
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void setInputMode(double mode) {
        this.module.j((int) mode);
    }
}
