package expo.modules.adapters.react;

import com.facebook.react.bridge.BaseJavaModule;

/* loaded from: classes2.dex */
public class ModuleRegistryReadyNotifier extends BaseJavaModule {
    private Ba.b mModuleRegistry;

    public ModuleRegistryReadyNotifier(Ba.b bVar) {
        this.mModuleRegistry = bVar;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ModuleRegistryReadyNotifier";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mModuleRegistry.a();
    }
}
