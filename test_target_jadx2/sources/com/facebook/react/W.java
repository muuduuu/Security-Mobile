package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public abstract class W extends TurboModuleManagerDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final List f21155a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21156b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21157c;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private List f21158a;

        /* renamed from: b, reason: collision with root package name */
        private ReactApplicationContext f21159b;

        public W a() {
            AbstractC4012a.d(this.f21159b, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            AbstractC4012a.d(this.f21158a, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return b(this.f21159b, this.f21158a);
        }

        protected abstract W b(ReactApplicationContext reactApplicationContext, List list);

        public a c(List list) {
            this.f21158a = new ArrayList(list);
            return this;
        }

        public a d(ReactApplicationContext reactApplicationContext) {
            this.f21159b = reactApplicationContext;
            return this;
        }
    }

    interface b {
        NativeModule getModule(String str);
    }

    protected W(ReactApplicationContext reactApplicationContext, List list, HybridData hybridData) {
        super(hybridData);
        this.f21155a = new ArrayList();
        this.f21156b = new HashMap();
        this.f21157c = ReactFeatureFlags.enableBridgelessArchitecture && G4.a.v();
        b(reactApplicationContext, list);
    }

    private void b(final ReactApplicationContext reactApplicationContext, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            if (p10 instanceof AbstractC1862b) {
                final AbstractC1862b abstractC1862b = (AbstractC1862b) p10;
                b bVar = new b() { // from class: com.facebook.react.U
                    @Override // com.facebook.react.W.b
                    public final NativeModule getModule(String str) {
                        NativeModule c10;
                        c10 = W.c(AbstractC1862b.this, reactApplicationContext, str);
                        return c10;
                    }
                };
                this.f21155a.add(bVar);
                this.f21156b.put(bVar, abstractC1862b.getReactModuleInfoProvider().a());
            } else {
                d();
                if (d()) {
                    List<NativeModule> createNativeModules = p10.createNativeModules(reactApplicationContext);
                    final HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    for (NativeModule nativeModule : createNativeModules) {
                        Class<?> cls = nativeModule.getClass();
                        K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
                        String name = aVar != null ? aVar.name() : nativeModule.getName();
                        hashMap2.put(name, aVar != null ? new ReactModuleInfo(name, cls.getName(), aVar.canOverrideExistingModule(), true, aVar.isCxxModule(), ReactModuleInfo.b(cls)) : new ReactModuleInfo(name, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.b(cls)));
                        hashMap.put(name, nativeModule);
                    }
                    b bVar2 = new b() { // from class: com.facebook.react.V
                        @Override // com.facebook.react.W.b
                        public final NativeModule getModule(String str) {
                            return (NativeModule) hashMap.get(str);
                        }
                    };
                    this.f21155a.add(bVar2);
                    this.f21156b.put(bVar2, hashMap2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeModule c(AbstractC1862b abstractC1862b, ReactApplicationContext reactApplicationContext, String str) {
        return abstractC1862b.getModule(str, reactApplicationContext);
    }

    private boolean d() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f21155a.iterator();
        while (it.hasNext()) {
            for (ReactModuleInfo reactModuleInfo : ((Map) this.f21156b.get((b) it.next())).values()) {
                if (reactModuleInfo.e() && reactModuleInfo.g()) {
                    arrayList.add(reactModuleInfo.f());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(String str) {
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b bVar : this.f21155a) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f21156b.get(bVar)).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String str) {
        Object obj = null;
        for (b bVar : this.f21155a) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f21156b.get(bVar)).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e() && (obj == null || reactModuleInfo.a())) {
                Object module = bVar.getModule(str);
                if (module != null) {
                    obj = module;
                }
            }
        }
        if (obj instanceof TurboModule) {
            return (TurboModule) obj;
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String str) {
        Iterator it = this.f21155a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f21156b.get((b) it.next())).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String str) {
        Iterator it = this.f21155a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f21156b.get((b) it.next())).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.f21157c;
    }
}
