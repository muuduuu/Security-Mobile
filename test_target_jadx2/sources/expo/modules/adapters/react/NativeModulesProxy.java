package expo.modules.adapters.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import pb.AbstractC3864c;
import pb.AbstractC3866e;
import pb.h;
import pb.i;
import pb.l;

/* loaded from: classes2.dex */
public class NativeModulesProxy extends ReactContextBaseJavaModule {
    private static final String EXPORTED_METHODS_KEY = "exportedMethods";
    private static final String MODULES_CONSTANTS_KEY = "modulesConstants";
    private static final String NAME = "NativeUnimoduleProxy";
    private static final String UNDEFINED_METHOD_ERROR = "E_UNDEFINED_METHOD";
    private static final String VIEW_MANAGERS_METADATA_KEY = "viewManagersMetadata";
    private Map<String, Object> cachedConstants;
    private i mKotlinInteropModuleRegistry;
    private Ba.b mModuleRegistry;

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, Ba.b bVar) {
        super(reactApplicationContext);
        this.mModuleRegistry = bVar;
        l a10 = AbstractC3866e.f38552a.a();
        Objects.requireNonNull(a10);
        this.mKotlinInteropModuleRegistry = new i(a10, bVar, new WeakReference(reactApplicationContext));
    }

    @ReactMethod
    public void callMethod(String str, String str2, ReadableArray readableArray, Promise promise) {
        if (this.mKotlinInteropModuleRegistry.h(str)) {
            this.mKotlinInteropModuleRegistry.b(str, str2, readableArray, new h(promise));
            return;
        }
        promise.reject(UNDEFINED_METHOD_ERROR, "Method " + str2 + " of Java module " + str + " is undefined.");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> map = this.cachedConstants;
        if (map != null) {
            return map;
        }
        this.mModuleRegistry.a();
        i kotlinInteropModuleRegistry = getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.i();
        kotlinInteropModuleRegistry.c();
        HashMap hashMap = new HashMap(3);
        hashMap.put(MODULES_CONSTANTS_KEY, new HashMap());
        hashMap.put(EXPORTED_METHODS_KEY, new HashMap());
        hashMap.put(VIEW_MANAGERS_METADATA_KEY, this.mKotlinInteropModuleRegistry.m());
        AbstractC3864c.a().c("✅ Constants were exported");
        this.cachedConstants = hashMap;
        return hashMap;
    }

    public i getKotlinInteropModuleRegistry() {
        return this.mKotlinInteropModuleRegistry;
    }

    Ba.b getModuleRegistry() {
        return this.mModuleRegistry;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    ReactApplicationContext getReactContext() {
        return getReactApplicationContext();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mModuleRegistry.d();
        this.mKotlinInteropModuleRegistry.j();
    }

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, Ba.b bVar, l lVar) {
        super(reactApplicationContext);
        this.mModuleRegistry = bVar;
        Objects.requireNonNull(lVar);
        this.mKotlinInteropModuleRegistry = new i(lVar, bVar, new WeakReference(reactApplicationContext));
    }
}
