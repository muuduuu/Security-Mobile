package com.facebook.react.modules.debug;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@K4.a(name = NativeDevMenuSpec.NAME)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/debug/DevMenuModule;", "Lcom/facebook/fbreact/specs/NativeDevMenuSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LC4/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LC4/e;)V", BuildConfig.FLAVOR, "show", "()V", "reload", BuildConfig.FLAVOR, "enableDebug", "debugRemotely", "(Z)V", AppConstants.VIDEO_RECORDING_ENABLED, "setProfilingEnabled", "setHotLoadingEnabled", "LC4/e;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DevMenuModule extends NativeDevMenuSpec {
    private final C4.e devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevMenuModule(ReactApplicationContext reactApplicationContext, C4.e devSupportManager) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(DevMenuModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.devSupportManager.q();
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void debugRemotely(boolean enableDebug) {
        this.devSupportManager.g(enableDebug);
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void reload() {
        if (this.devSupportManager.n()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.a
                @Override // java.lang.Runnable
                public final void run() {
                    DevMenuModule.reload$lambda$0(DevMenuModule.this);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setHotLoadingEnabled(boolean enabled) {
        this.devSupportManager.c(enabled);
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setProfilingEnabled(boolean enabled) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void show() {
        if (this.devSupportManager.n()) {
            this.devSupportManager.C();
        }
    }
}
