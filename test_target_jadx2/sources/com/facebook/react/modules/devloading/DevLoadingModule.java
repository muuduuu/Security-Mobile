package com.facebook.react.modules.devloading;

import C4.c;
import K4.a;
import com.facebook.fbreact.specs.NativeDevLoadingViewSpec;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.E;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@a(name = "DevLoadingView")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/modules/devloading/DevLoadingModule;", "Lcom/facebook/fbreact/specs/NativeDevLoadingViewSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "color", RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR, BuildConfig.FLAVOR, "showMessage", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "hide", "()V", "Lcom/facebook/react/bridge/JSExceptionHandler;", "jsExceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "LC4/c;", "devLoadingViewManager", "LC4/c;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DevLoadingModule extends NativeDevLoadingViewSpec {
    public static final String NAME = "DevLoadingView";
    private c devLoadingViewManager;
    private final JSExceptionHandler jsExceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLoadingModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        JSExceptionHandler jSExceptionHandler = reactContext.getJSExceptionHandler();
        this.jsExceptionHandler = jSExceptionHandler;
        if (jSExceptionHandler == null || !(jSExceptionHandler instanceof E)) {
            return;
        }
        this.devLoadingViewManager = ((E) jSExceptionHandler).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$1(DevLoadingModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        c cVar = this$0.devLoadingViewManager;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$0(DevLoadingModule this$0, String message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        c cVar = this$0.devLoadingViewManager;
        if (cVar != null) {
            cVar.showMessage(message);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: Q4.a
            @Override // java.lang.Runnable
            public final void run() {
                DevLoadingModule.hide$lambda$1(DevLoadingModule.this);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void showMessage(final String message, Double color, Double backgroundColor) {
        Intrinsics.checkNotNullParameter(message, "message");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: Q4.b
            @Override // java.lang.Runnable
            public final void run() {
                DevLoadingModule.showMessage$lambda$0(DevLoadingModule.this, message);
            }
        });
    }
}
