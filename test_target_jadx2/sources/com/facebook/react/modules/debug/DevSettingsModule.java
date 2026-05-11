package com.facebook.react.modules.debug;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@K4.a(name = NativeDevSettingsSpec.NAME)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/debug/DevSettingsModule;", "Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LC4/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LC4/e;)V", BuildConfig.FLAVOR, "reload", "()V", BuildConfig.FLAVOR, "reason", "reloadWithReason", "(Ljava/lang/String;)V", "onFastRefresh", BuildConfig.FLAVOR, "isHotLoadingEnabled", "setHotLoadingEnabled", "(Z)V", "isDebugginRemotelyEnabled", "setIsDebuggingRemotely", "isProfilingEnabled", "setProfilingEnabled", "toggleElementInspector", "title", "addMenuItem", "openDebugger", AppConstants.VIDEO_RECORDING_ENABLED, "setIsShakeToShowDevMenuEnabled", "eventName", "addListener", BuildConfig.FLAVOR, "count", "removeListeners", "(D)V", "LC4/e;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DevSettingsModule extends NativeDevSettingsSpec {
    private final C4.e devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(ReactApplicationContext reactApplicationContext, C4.e devSupportManager) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMenuItem$lambda$1(String title, DevSettingsModule this$0) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("title", title);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = this$0.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didPressMenuItem", createMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(DevSettingsModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.devSupportManager.q();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(final String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.devSupportManager.r(title, new C4.d() { // from class: com.facebook.react.modules.debug.b
            @Override // C4.d
            public final void a() {
                DevSettingsModule.addMenuItem$lambda$1(title, this);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void openDebugger() {
        this.devSupportManager.E();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        if (this.devSupportManager.n()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.c
                @Override // java.lang.Runnable
                public final void run() {
                    DevSettingsModule.reload$lambda$0(DevSettingsModule.this);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean isHotLoadingEnabled) {
        this.devSupportManager.c(isHotLoadingEnabled);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean isDebugginRemotelyEnabled) {
        this.devSupportManager.g(isDebugginRemotelyEnabled);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean enabled) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean isProfilingEnabled) {
        this.devSupportManager.f(isProfilingEnabled);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.devSupportManager.i();
    }
}
