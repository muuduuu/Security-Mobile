package com.facebook.react.fabric;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.i1;
import s5.C4313a;

/* loaded from: classes.dex */
public class FabricUIManagerProviderImpl implements UIManagerProvider {
    private final ComponentFactory mComponentFactory;
    private final ReactNativeConfig mConfig;
    private final i1 mViewManagerRegistry;

    public FabricUIManagerProviderImpl(ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig, i1 i1Var) {
        this.mComponentFactory = componentFactory;
        this.mConfig = reactNativeConfig;
        this.mViewManagerRegistry = i1Var;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        C4313a.c(0L, "FabricUIManagerProviderImpl.create");
        EventBeatManager eventBeatManager = new EventBeatManager();
        C4313a.c(0L, "FabricUIManagerProviderImpl.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(reactApplicationContext, this.mViewManagerRegistry, eventBeatManager);
        C4313a.i(0L);
        C4313a.c(0L, "FabricUIManagerProviderImpl.registerBinding");
        BindingImpl bindingImpl = new BindingImpl();
        CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
        RuntimeExecutor runtimeExecutor = catalystInstance.getRuntimeExecutor();
        RuntimeScheduler runtimeScheduler = catalystInstance.getRuntimeScheduler();
        if (runtimeExecutor == null || runtimeScheduler == null) {
            throw new IllegalStateException("Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null");
        }
        bindingImpl.register(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, this.mComponentFactory, this.mConfig);
        C4313a.i(0L);
        C4313a.i(0L);
        return fabricUIManager;
    }
}
