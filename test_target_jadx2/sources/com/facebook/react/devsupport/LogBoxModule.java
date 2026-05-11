package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = "LogBox")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/devsupport/LogBoxModule;", "Lcom/facebook/fbreact/specs/NativeLogBoxSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LC4/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LC4/e;)V", BuildConfig.FLAVOR, "show", "()V", "hide", "invalidate", "LC4/e;", "Lv4/i;", "surfaceDelegate", "Lv4/i;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = "LogBox";
    private final C4.e devSupportManager;
    private final v4.i surfaceDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxModule(ReactApplicationContext reactApplicationContext, C4.e devSupportManager) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
        v4.i d10 = devSupportManager.d("LogBox");
        this.surfaceDelegate = d10 == null ? new S(devSupportManager) : d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$1(LogBoxModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.surfaceDelegate.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidate$lambda$2(LogBoxModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.surfaceDelegate.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(LogBoxModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.surfaceDelegate.d()) {
            this$0.surfaceDelegate.f("LogBox");
        }
        this$0.surfaceDelegate.b();
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.T
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.hide$lambda$1(LogBoxModule.this);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.U
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.invalidate$lambda$2(LogBoxModule.this);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.V
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.show$lambda$0(LogBoxModule.this);
            }
        });
    }
}
