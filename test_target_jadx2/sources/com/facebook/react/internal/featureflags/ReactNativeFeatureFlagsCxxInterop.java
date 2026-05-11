package com.facebook.react.internal.featureflags;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b/\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0087 J\t\u0010\u0005\u001a\u00020\u0004H\u0087 J\t\u0010\u0006\u001a\u00020\u0004H\u0087 J\t\u0010\u0007\u001a\u00020\bH\u0087 J\t\u0010\t\u001a\u00020\u0004H\u0087 J\t\u0010\n\u001a\u00020\u0004H\u0087 J\t\u0010\u000b\u001a\u00020\u0004H\u0087 J\t\u0010\f\u001a\u00020\u0004H\u0087 J\t\u0010\r\u001a\u00020\u0004H\u0087 J\t\u0010\u000e\u001a\u00020\u0004H\u0087 J\t\u0010\u000f\u001a\u00020\u0004H\u0087 J\t\u0010\u0010\u001a\u00020\u0004H\u0087 J\t\u0010\u0011\u001a\u00020\u0004H\u0087 J\t\u0010\u0012\u001a\u00020\u0004H\u0087 J\t\u0010\u0013\u001a\u00020\u0004H\u0087 J\t\u0010\u0014\u001a\u00020\u0004H\u0087 J\t\u0010\u0015\u001a\u00020\u0004H\u0087 J\t\u0010\u0016\u001a\u00020\u0004H\u0087 J\t\u0010\u0017\u001a\u00020\u0004H\u0087 J\t\u0010\u0018\u001a\u00020\u0004H\u0087 J\t\u0010\u0019\u001a\u00020\u0004H\u0087 J\t\u0010\u001a\u001a\u00020\u0004H\u0087 J\t\u0010\u001b\u001a\u00020\u0004H\u0087 J\t\u0010\u001c\u001a\u00020\u0004H\u0087 J\t\u0010\u001d\u001a\u00020\u0004H\u0087 J\t\u0010\u001e\u001a\u00020\u0004H\u0087 J\t\u0010\u001f\u001a\u00020\u0004H\u0087 J\t\u0010 \u001a\u00020\u0004H\u0087 J\t\u0010!\u001a\u00020\u0004H\u0087 J\t\u0010\"\u001a\u00020\u0004H\u0087 J\t\u0010#\u001a\u00020\u0004H\u0087 J\t\u0010$\u001a\u00020\u0004H\u0087 J\t\u0010%\u001a\u00020\u0004H\u0087 J\t\u0010&\u001a\u00020\u0004H\u0087 J\t\u0010'\u001a\u00020\u0004H\u0087 J\u0011\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0001H\u0087 J\t\u0010*\u001a\u00020\u0004H\u0087 J\t\u0010+\u001a\u00020\u0004H\u0087 J\t\u0010,\u001a\u00020\u0004H\u0087 J\t\u0010-\u001a\u00020\u0004H\u0087 J\t\u0010.\u001a\u00020\u0004H\u0087 J\t\u0010/\u001a\u00020\u0004H\u0087 J\t\u00100\u001a\u00020\u0004H\u0087 J\t\u00101\u001a\u00020\u0004H\u0087 J\t\u00102\u001a\u00020\u0004H\u0087 J\t\u00103\u001a\u00020\u0004H\u0087 J\t\u00104\u001a\u00020\u0004H\u0087 J\t\u00105\u001a\u00020\u0004H\u0087 J\t\u00106\u001a\u00020\u0004H\u0087 ¨\u00067"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", BuildConfig.FLAVOR, "()V", "batchRenderingUpdatesInEventLoop", BuildConfig.FLAVOR, "commonTestFlag", "completeReactInstanceCreationOnBgThreadOnAndroid", "dangerouslyReset", BuildConfig.FLAVOR, "destroyFabricSurfacesInReactInstanceManager", "enableAlignItemsBaselineOnFabricIOS", "enableAndroidMixBlendModeProp", "enableBackgroundStyleApplicator", "enableCleanTextInputYogaNode", "enableEagerRootViewAttachment", "enableEventEmitterRetentionDuringGesturesOnAndroid", "enableFabricLogs", "enableFabricRendererExclusively", "enableGranularShadowTreeStateReconciliation", "enableIOSViewClipToPaddingBox", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableMicrotasks", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewRecycling", "excludeYogaFromRawProps", "fetchImagesInViewPreallocation", "fixIncorrectScrollViewStateUpdateOnAndroid", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMissedFabricStateUpdatesOnAndroid", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "forceBatchingMountItemsOnAndroid", "fuseboxEnabledDebug", "fuseboxEnabledRelease", "initEagerTurboModulesOnNativeModulesQueueAndroid", "lazyAnimationCallbacks", "loadVectorDrawablesOnImages", "override", "provider", "setAndroidLayoutDirection", "traceTurboModulePromiseRejectionsOnAndroid", "useFabricInterop", "useImmediateExecutorInAndroidBridgeless", "useModernRuntimeScheduler", "useNativeViewConfigsInBridgelessMode", "useNewReactImageViewBackgroundDrawing", "useOptimisedViewPreallocationOnAndroid", "useOptimizedEventBatchingOnAndroid", "useRuntimeShadowNodeReferenceUpdate", "useRuntimeShadowNodeReferenceUpdateOnLayout", "useStateAlignmentMechanism", "useTurboModuleInterop", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReactNativeFeatureFlagsCxxInterop {

    /* renamed from: a, reason: collision with root package name */
    public static final ReactNativeFeatureFlagsCxxInterop f21704a = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.t("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    public static final native boolean batchRenderingUpdatesInEventLoop();

    public static final native boolean commonTestFlag();

    public static final native boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    public static final native void dangerouslyReset();

    public static final native boolean destroyFabricSurfacesInReactInstanceManager();

    public static final native boolean enableAlignItemsBaselineOnFabricIOS();

    public static final native boolean enableAndroidMixBlendModeProp();

    public static final native boolean enableBackgroundStyleApplicator();

    public static final native boolean enableCleanTextInputYogaNode();

    public static final native boolean enableEagerRootViewAttachment();

    public static final native boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    public static final native boolean enableFabricLogs();

    public static final native boolean enableFabricRendererExclusively();

    public static final native boolean enableGranularShadowTreeStateReconciliation();

    public static final native boolean enableIOSViewClipToPaddingBox();

    public static final native boolean enableLayoutAnimationsOnIOS();

    public static final native boolean enableLongTaskAPI();

    public static final native boolean enableMicrotasks();

    public static final native boolean enablePropsUpdateReconciliationAndroid();

    public static final native boolean enableReportEventPaintTime();

    public static final native boolean enableSynchronousStateUpdates();

    public static final native boolean enableUIConsistency();

    public static final native boolean enableViewRecycling();

    public static final native boolean excludeYogaFromRawProps();

    public static final native boolean fetchImagesInViewPreallocation();

    public static final native boolean fixIncorrectScrollViewStateUpdateOnAndroid();

    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    public static final native boolean fixMissedFabricStateUpdatesOnAndroid();

    public static final native boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    public static final native boolean forceBatchingMountItemsOnAndroid();

    public static final native boolean fuseboxEnabledDebug();

    public static final native boolean fuseboxEnabledRelease();

    public static final native boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    public static final native boolean lazyAnimationCallbacks();

    public static final native boolean loadVectorDrawablesOnImages();

    public static final native void override(Object provider);

    public static final native boolean setAndroidLayoutDirection();

    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    public static final native boolean useFabricInterop();

    public static final native boolean useImmediateExecutorInAndroidBridgeless();

    public static final native boolean useModernRuntimeScheduler();

    public static final native boolean useNativeViewConfigsInBridgelessMode();

    public static final native boolean useNewReactImageViewBackgroundDrawing();

    public static final native boolean useOptimisedViewPreallocationOnAndroid();

    public static final native boolean useOptimizedEventBatchingOnAndroid();

    public static final native boolean useRuntimeShadowNodeReferenceUpdate();

    public static final native boolean useRuntimeShadowNodeReferenceUpdateOnLayout();

    public static final native boolean useStateAlignmentMechanism();

    public static final native boolean useTurboModuleInterop();
}
