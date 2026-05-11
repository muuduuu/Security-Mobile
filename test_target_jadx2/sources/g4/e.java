package G4;

import com.facebook.react.config.ReactFeatureFlags;

/* loaded from: classes.dex */
public abstract class e extends d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2922a;

    public e(boolean z10) {
        this.f2922a = z10;
        if (z10) {
            ReactFeatureFlags.enableFabricRenderer = true;
            ReactFeatureFlags.useTurboModules = true;
            ReactFeatureFlags.enableBridgelessArchitecture = true;
        }
    }

    @Override // G4.d, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        return this.f2922a || super.batchRenderingUpdatesInEventLoop();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        return true;
    }

    @Override // G4.d, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        return this.f2922a || super.useTurboModuleInterop();
    }
}
