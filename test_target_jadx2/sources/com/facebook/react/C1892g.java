package com.facebook.react;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import v4.C4925a;

/* renamed from: com.facebook.react.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1892g extends AbstractC1862b implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private Map f21692a;

    private static void f(Map map, String str, Provider provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    private L4.a g() {
        final HashMap hashMap = new HashMap();
        Class cls = new Class[]{JSCHeapCapture.class}[0];
        K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
        hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
        return new L4.a() { // from class: com.facebook.react.f
            @Override // L4.a
            public final Map a() {
                Map i10;
                i10 = C1892g.i(hashMap);
                return i10;
            }
        };
    }

    private Map h() {
        if (this.f21692a == null) {
            HashMap hashMap = new HashMap();
            f(hashMap, DebuggingOverlayManager.REACT_CLASS, new Provider() { // from class: com.facebook.react.e
                @Override // javax.inject.Provider
                public final Object get() {
                    return new DebuggingOverlayManager();
                }
            });
            this.f21692a = hashMap;
        }
        return this.f21692a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map i(Map map) {
        return map;
    }

    @Override // com.facebook.react.b0
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = (ModuleSpec) h().get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals(NativeJSCHeapCaptureSpec.NAME)) {
            return new JSCHeapCapture(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        if (!C4925a.a()) {
            return g();
        }
        try {
            return (L4.a) C4925a.b("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return g();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.b0
    public Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return h().keySet();
    }

    @Override // com.facebook.react.AbstractC1862b
    public List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(h().values());
    }
}
