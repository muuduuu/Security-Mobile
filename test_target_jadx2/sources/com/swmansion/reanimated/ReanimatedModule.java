package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.C1936c0;
import com.facebook.react.uimanager.J0;
import com.facebook.react.uimanager.P0;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

@K4.a(name = NativeReanimatedModuleSpec.NAME)
/* loaded from: classes2.dex */
public class ReanimatedModule extends NativeReanimatedModuleSpec implements LifecycleEventListener, P0, UIManagerListener {
    private NodesManager mNodesManager;
    private ArrayList<UIThreadOperation> mOperations;

    private interface UIThreadOperation {
        void execute(NodesManager nodesManager);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$willDispatchViewUpdates$0(ArrayList arrayList, UIBlockViewResolver uIBlockViewResolver) {
        NodesManager nodesManager = getNodesManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UIThreadOperation) it.next()).execute(nodesManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$willDispatchViewUpdates$1(ArrayList arrayList, C1936c0 c1936c0) {
        NodesManager nodesManager = getNodesManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UIThreadOperation) it.next()).execute(nodesManager);
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
    }

    public NodesManager getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new NodesManager(getReactApplicationContext());
        }
        return this.mNodesManager;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManager fabricUIManager = reactApplicationContext.getFabricUIManager();
        if (!(fabricUIManager instanceof FabricUIManager)) {
            throw new RuntimeException("[Reanimated] Failed to obtain instance of FabricUIManager.");
        }
        ((FabricUIManager) fabricUIManager).addUIManagerEventListener(this);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.swmansion.reanimated.NativeReanimatedModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule(String str) {
        JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        boolean z10 = javaScriptContextHolder.get() == 0;
        Utils.isChromeDebugger = z10;
        if (z10) {
            Log.w("[REANIMATED]", "Unable to create Reanimated Native Module. You can ignore this message if you are using Chrome Debugger now.");
            return false;
        }
        getNodesManager().initWithContext(getReactApplicationContext(), str);
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.invalidate();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostPause();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostResume();
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        if (!(uIManager instanceof FabricUIManager)) {
            throw new RuntimeException("[Reanimated] Failed to obtain instance of FabricUIManager.");
        }
        ((FabricUIManager) uIManager).addUIBlock(new UIBlock() { // from class: com.swmansion.reanimated.f
            @Override // com.facebook.react.fabric.interop.UIBlock
            public final void execute(UIBlockViewResolver uIBlockViewResolver) {
                ReanimatedModule.this.lambda$willDispatchViewUpdates$0(arrayList, uIBlockViewResolver);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.uimanager.P0
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        uIManagerModule.addUIBlock(new J0() { // from class: com.swmansion.reanimated.g
            @Override // com.facebook.react.uimanager.J0
            public final void a(C1936c0 c1936c0) {
                ReanimatedModule.this.lambda$willDispatchViewUpdates$1(arrayList, c1936c0);
            }
        });
    }
}
