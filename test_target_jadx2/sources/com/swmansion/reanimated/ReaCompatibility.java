package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.L0;

/* loaded from: classes2.dex */
class ReaCompatibility {
    private FabricUIManager fabricUIManager;

    public ReaCompatibility(ReactApplicationContext reactApplicationContext) {
        this.fabricUIManager = (FabricUIManager) L0.g(reactApplicationContext, 2);
    }

    public void registerFabricEventListener(NodesManager nodesManager) {
        FabricUIManager fabricUIManager = this.fabricUIManager;
        if (fabricUIManager != null) {
            fabricUIManager.getEventDispatcher().b(nodesManager);
        }
    }

    public void synchronouslyUpdateUIProps(int i10, ReadableMap readableMap) {
        this.fabricUIManager.synchronouslyUpdateViewOnUIThread(i10, readableMap);
    }
}
