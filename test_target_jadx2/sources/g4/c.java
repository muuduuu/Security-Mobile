package G4;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: A, reason: collision with root package name */
    private Boolean f2875A;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f2876B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f2877C;

    /* renamed from: D, reason: collision with root package name */
    private Boolean f2878D;

    /* renamed from: E, reason: collision with root package name */
    private Boolean f2879E;

    /* renamed from: F, reason: collision with root package name */
    private Boolean f2880F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f2881G;

    /* renamed from: H, reason: collision with root package name */
    private Boolean f2882H;

    /* renamed from: I, reason: collision with root package name */
    private Boolean f2883I;

    /* renamed from: J, reason: collision with root package name */
    private Boolean f2884J;

    /* renamed from: K, reason: collision with root package name */
    private Boolean f2885K;

    /* renamed from: L, reason: collision with root package name */
    private Boolean f2886L;

    /* renamed from: M, reason: collision with root package name */
    private Boolean f2887M;

    /* renamed from: N, reason: collision with root package name */
    private Boolean f2888N;

    /* renamed from: O, reason: collision with root package name */
    private Boolean f2889O;

    /* renamed from: P, reason: collision with root package name */
    private Boolean f2890P;

    /* renamed from: Q, reason: collision with root package name */
    private Boolean f2891Q;

    /* renamed from: R, reason: collision with root package name */
    private Boolean f2892R;

    /* renamed from: S, reason: collision with root package name */
    private Boolean f2893S;

    /* renamed from: T, reason: collision with root package name */
    private Boolean f2894T;

    /* renamed from: U, reason: collision with root package name */
    private Boolean f2895U;

    /* renamed from: a, reason: collision with root package name */
    private Boolean f2896a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f2897b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f2898c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f2899d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f2900e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f2901f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f2902g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f2903h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f2904i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f2905j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f2906k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f2907l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f2908m;

    /* renamed from: n, reason: collision with root package name */
    private Boolean f2909n;

    /* renamed from: o, reason: collision with root package name */
    private Boolean f2910o;

    /* renamed from: p, reason: collision with root package name */
    private Boolean f2911p;

    /* renamed from: q, reason: collision with root package name */
    private Boolean f2912q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f2913r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f2914s;

    /* renamed from: t, reason: collision with root package name */
    private Boolean f2915t;

    /* renamed from: u, reason: collision with root package name */
    private Boolean f2916u;

    /* renamed from: v, reason: collision with root package name */
    private Boolean f2917v;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f2918w;

    /* renamed from: x, reason: collision with root package name */
    private Boolean f2919x;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f2920y;

    /* renamed from: z, reason: collision with root package name */
    private Boolean f2921z;

    @Override // G4.b
    public void a(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        ReactNativeFeatureFlagsCxxInterop.override(provider);
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        Boolean bool = this.f2897b;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.batchRenderingUpdatesInEventLoop());
            this.f2897b = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean bool = this.f2896a;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.f2896a = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean completeReactInstanceCreationOnBgThreadOnAndroid() {
        Boolean bool = this.f2898c;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.completeReactInstanceCreationOnBgThreadOnAndroid());
            this.f2898c = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean destroyFabricSurfacesInReactInstanceManager() {
        Boolean bool = this.f2899d;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.destroyFabricSurfacesInReactInstanceManager());
            this.f2899d = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAlignItemsBaselineOnFabricIOS() {
        Boolean bool = this.f2900e;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAlignItemsBaselineOnFabricIOS());
            this.f2900e = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidMixBlendModeProp() {
        Boolean bool = this.f2901f;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAndroidMixBlendModeProp());
            this.f2901f = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBackgroundStyleApplicator() {
        Boolean bool = this.f2902g;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBackgroundStyleApplicator());
            this.f2902g = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCleanTextInputYogaNode() {
        Boolean bool = this.f2903h;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCleanTextInputYogaNode());
            this.f2903h = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean bool = this.f2904i;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEagerRootViewAttachment());
            this.f2904i = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
        Boolean bool = this.f2905j;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEventEmitterRetentionDuringGesturesOnAndroid());
            this.f2905j = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean bool = this.f2906k;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricLogs());
            this.f2906k = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRendererExclusively() {
        Boolean bool = this.f2907l;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricRendererExclusively());
            this.f2907l = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        Boolean bool = this.f2908m;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableGranularShadowTreeStateReconciliation());
            this.f2908m = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean bool = this.f2909n;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIOSViewClipToPaddingBox());
            this.f2909n = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean bool = this.f2910o;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnIOS());
            this.f2910o = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLongTaskAPI() {
        Boolean bool = this.f2911p;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLongTaskAPI());
            this.f2911p = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        Boolean bool = this.f2912q;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMicrotasks());
            this.f2912q = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean bool = this.f2913r;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePropsUpdateReconciliationAndroid());
            this.f2913r = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableReportEventPaintTime() {
        Boolean bool = this.f2914s;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableReportEventPaintTime());
            this.f2914s = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean bool = this.f2915t;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.f2915t = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean bool = this.f2916u;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.f2916u = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean bool = this.f2917v;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecycling());
            this.f2917v = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean excludeYogaFromRawProps() {
        Boolean bool = this.f2918w;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.excludeYogaFromRawProps());
            this.f2918w = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fetchImagesInViewPreallocation() {
        Boolean bool = this.f2919x;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fetchImagesInViewPreallocation());
            this.f2919x = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixIncorrectScrollViewStateUpdateOnAndroid() {
        Boolean bool = this.f2920y;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixIncorrectScrollViewStateUpdateOnAndroid());
            this.f2920y = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean bool = this.f2921z;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.f2921z = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMissedFabricStateUpdatesOnAndroid() {
        Boolean bool = this.f2875A;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMissedFabricStateUpdatesOnAndroid());
            this.f2875A = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        Boolean bool = this.f2876B;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMountingCoordinatorReportedPendingTransactionsOnAndroid());
            this.f2876B = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean forceBatchingMountItemsOnAndroid() {
        Boolean bool = this.f2877C;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.forceBatchingMountItemsOnAndroid());
            this.f2877C = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledDebug() {
        Boolean bool = this.f2878D;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledDebug());
            this.f2878D = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean bool = this.f2879E;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.f2879E = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean initEagerTurboModulesOnNativeModulesQueueAndroid() {
        Boolean bool = this.f2880F;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.initEagerTurboModulesOnNativeModulesQueueAndroid());
            this.f2880F = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean bool = this.f2881G;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.f2881G = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean loadVectorDrawablesOnImages() {
        Boolean bool = this.f2882H;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.loadVectorDrawablesOnImages());
            this.f2882H = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean setAndroidLayoutDirection() {
        Boolean bool = this.f2883I;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.setAndroidLayoutDirection());
            this.f2883I = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean bool = this.f2884J;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.traceTurboModulePromiseRejectionsOnAndroid());
            this.f2884J = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean bool = this.f2885K;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useFabricInterop());
            this.f2885K = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean bool = this.f2886L;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useImmediateExecutorInAndroidBridgeless());
            this.f2886L = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        Boolean bool = this.f2887M;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useModernRuntimeScheduler());
            this.f2887M = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean bool = this.f2888N;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.f2888N = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNewReactImageViewBackgroundDrawing() {
        Boolean bool = this.f2889O;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNewReactImageViewBackgroundDrawing());
            this.f2889O = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimisedViewPreallocationOnAndroid() {
        Boolean bool = this.f2890P;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimisedViewPreallocationOnAndroid());
            this.f2890P = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        Boolean bool = this.f2891Q;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimizedEventBatchingOnAndroid());
            this.f2891Q = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean bool = this.f2892R;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdate());
            this.f2892R = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        Boolean bool = this.f2893S;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdateOnLayout());
            this.f2893S = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useStateAlignmentMechanism() {
        Boolean bool = this.f2894T;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useStateAlignmentMechanism());
            this.f2894T = bool;
        }
        return bool.booleanValue();
    }

    @Override // G4.b, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean bool = this.f2895U;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModuleInterop());
            this.f2895U = bool;
        }
        return bool.booleanValue();
    }
}
