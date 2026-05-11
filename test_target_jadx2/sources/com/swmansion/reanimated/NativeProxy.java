package com.swmansion.reanimated;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.L0;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder;
import com.swmansion.reanimated.nativeProxy.NativeProxyCommon;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public class NativeProxy extends NativeProxyCommon {
    private final HybridData mHybridData;

    public NativeProxy(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        ReactFeatureFlagsWrapper.enableMountHooks();
        FabricUIManager fabricUIManager = (FabricUIManager) L0.g(reactApplicationContext, 2);
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        ReanimatedMessageQueueThread reanimatedMessageQueueThread = new ReanimatedMessageQueueThread();
        if (reactApplicationContext.isBridgeless()) {
            RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
            JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
            Objects.requireNonNull(javaScriptContextHolder);
            this.mHybridData = initHybridBridgeless(javaScriptContextHolder.get(), runtimeExecutor, this.mAndroidUIScheduler, layoutAnimations, reanimatedMessageQueueThread, fabricUIManager, str);
        } else {
            CallInvokerHolderImpl callInvokerHolderImpl = (CallInvokerHolderImpl) reactApplicationContext.getJSCallInvokerHolder();
            JavaScriptContextHolder javaScriptContextHolder2 = reactApplicationContext.getJavaScriptContextHolder();
            Objects.requireNonNull(javaScriptContextHolder2);
            this.mHybridData = initHybrid(javaScriptContextHolder2.get(), callInvokerHolderImpl, this.mAndroidUIScheduler, layoutAnimations, reanimatedMessageQueueThread, fabricUIManager, str);
        }
        prepareLayoutAnimations(layoutAnimations);
        installJSIBindings();
    }

    public static NativeMethodsHolder createNativeMethodsHolder(LayoutAnimations layoutAnimations) {
        return new NativeMethodsHolder() { // from class: com.swmansion.reanimated.NativeProxy.1
            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void cancelAnimation(int i10) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void checkDuplicateSharedTag(int i10, int i11) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void clearAnimationConfig(int i10) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int findPrecedingViewTagForTransition(int i10) {
                return -1;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int[] getSharedGroup(int i10) {
                return new int[0];
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean hasAnimation(int i10, int i11) {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean isLayoutAnimationEnabled() {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean shouldAnimateExiting(int i10, boolean z10) {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void startAnimation(int i10, int i11, HashMap<String, Object> hashMap) {
            }
        };
    }

    private native HybridData initHybrid(long j10, CallInvokerHolderImpl callInvokerHolderImpl, AndroidUIScheduler androidUIScheduler, LayoutAnimations layoutAnimations, MessageQueueThread messageQueueThread, FabricUIManager fabricUIManager, String str);

    private native HybridData initHybridBridgeless(long j10, RuntimeExecutor runtimeExecutor, AndroidUIScheduler androidUIScheduler, LayoutAnimations layoutAnimations, MessageQueueThread messageQueueThread, FabricUIManager fabricUIManager, String str);

    @Override // com.swmansion.reanimated.nativeProxy.NativeProxyCommon
    protected HybridData getHybridData() {
        return this.mHybridData;
    }

    public native boolean isAnyHandlerWaitingForEvent(String str, int i10);

    public native void performOperations();
}
