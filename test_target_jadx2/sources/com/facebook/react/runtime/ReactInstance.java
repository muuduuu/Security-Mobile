package com.facebook.react.runtime;

import android.content.res.AssetManager;
import android.view.ViewGroup;
import c3.AbstractC1721a;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.C1892g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.devsupport.l0;
import com.facebook.react.fabric.BindingImpl;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.C1978y;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.O0;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.i1;
import com.facebook.react.uimanager.j1;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r4.AbstractC4012a;
import s5.C4313a;

/* loaded from: classes.dex */
final class ReactInstance {

    /* renamed from: h, reason: collision with root package name */
    private static final String f22022h = "ReactInstance";

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f22023i;

    /* renamed from: a, reason: collision with root package name */
    private final C1905c f22024a;

    /* renamed from: b, reason: collision with root package name */
    private final ReactQueueConfiguration f22025b;

    /* renamed from: c, reason: collision with root package name */
    private final TurboModuleManager f22026c;

    /* renamed from: d, reason: collision with root package name */
    private final FabricUIManager f22027d;

    /* renamed from: e, reason: collision with root package name */
    private final JavaTimerManager f22028e;

    /* renamed from: f, reason: collision with root package name */
    private final b f22029f;

    /* renamed from: g, reason: collision with root package name */
    private final JavaScriptContextHolder f22030g;
    private final HybridData mHybridData;

    class a implements JSBundleLoaderDelegate {
        a() {
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z10) {
            ReactInstance.this.f22024a.d(str);
            ReactInstance.this.loadJSBundleFromAssets(assetManager, str);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadScriptFromFile(String str, String str2, boolean z10) {
            ReactInstance.this.f22024a.d(str2);
            ReactInstance.this.loadJSBundleFromFile(str, str2);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadSplitBundleFromFile(String str, String str2) {
            ReactInstance.this.loadJSBundleFromFile(str, str2);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void setSourceURLs(String str, String str2) {
            ReactInstance.this.f22024a.d(str);
        }
    }

    private static class b implements j1 {

        /* renamed from: a, reason: collision with root package name */
        private final List f22032a;

        /* renamed from: b, reason: collision with root package name */
        private final C1905c f22033b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f22034c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        private Map f22035d = null;

        public b(List list, C1905c c1905c) {
            this.f22032a = list;
            this.f22033b = c1905c;
        }

        private ViewManager d(String str) {
            ViewManager createViewManager;
            if (this.f22034c.containsKey(str)) {
                return (ViewManager) this.f22034c.get(str);
            }
            for (com.facebook.react.P p10 : this.f22032a) {
                if ((p10 instanceof com.facebook.react.b0) && (createViewManager = ((com.facebook.react.b0) p10).createViewManager(this.f22033b, str)) != null) {
                    this.f22034c.put(str, createViewManager);
                    return createViewManager;
                }
            }
            return null;
        }

        @Override // com.facebook.react.uimanager.j1
        public synchronized Collection a() {
            HashSet hashSet;
            hashSet = new HashSet();
            hashSet.addAll(e());
            hashSet.addAll(c().keySet());
            return hashSet;
        }

        @Override // com.facebook.react.uimanager.j1
        public synchronized ViewManager b(String str) {
            ViewManager d10 = d(str);
            if (d10 != null) {
                return d10;
            }
            return (ViewManager) c().get(str);
        }

        public synchronized Map c() {
            try {
                Map map = this.f22035d;
                if (map != null) {
                    return map;
                }
                HashMap hashMap = new HashMap();
                for (com.facebook.react.P p10 : this.f22032a) {
                    if (!(p10 instanceof com.facebook.react.b0)) {
                        for (ViewManager viewManager : p10.createViewManagers(this.f22033b)) {
                            hashMap.put(viewManager.getName(), viewManager);
                        }
                    }
                }
                this.f22035d = hashMap;
                return hashMap;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized Collection e() {
            HashSet hashSet;
            Collection viewManagerNames;
            hashSet = new HashSet();
            for (com.facebook.react.P p10 : this.f22032a) {
                if ((p10 instanceof com.facebook.react.b0) && (viewManagerNames = ((com.facebook.react.b0) p10).getViewManagerNames(this.f22033b)) != null) {
                    hashSet.addAll(viewManagerNames);
                }
            }
            return hashSet;
        }
    }

    private class c implements ReactJsExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        private final QueueThreadExceptionHandler f22036a;

        c(QueueThreadExceptionHandler queueThreadExceptionHandler) {
            this.f22036a = queueThreadExceptionHandler;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
        public void reportJsException(ReactJsExceptionHandler.ParsedError parsedError) {
            try {
                ((NativeExceptionsManagerSpec) AbstractC4012a.c(ReactInstance.this.f22026c.getModule(NativeExceptionsManagerSpec.NAME))).reportException(l0.c(parsedError));
            } catch (Exception e10) {
                this.f22036a.handleException(e10);
            }
        }
    }

    static {
        A();
    }

    ReactInstance(C1905c c1905c, InterfaceC1909g interfaceC1909g, ComponentFactory componentFactory, C4.e eVar, QueueThreadExceptionHandler queueThreadExceptionHandler, boolean z10, ReactHostInspectorTarget reactHostInspectorTarget) {
        this.f22024a = c1905c;
        C4313a.c(0L, "ReactInstance.initialize");
        ReactQueueConfigurationImpl create = ReactQueueConfigurationImpl.create(new ReactQueueConfigurationSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("v_native"), MessageQueueThreadSpec.newBackgroundThreadSpec("v_js")), queueThreadExceptionHandler);
        this.f22025b = create;
        AbstractC1721a.b(f22022h, "Calling initializeMessageQueueThreads()");
        c1905c.initializeMessageQueueThreads(create);
        MessageQueueThread jSQueueThread = create.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = create.getNativeModulesQueueThread();
        com.facebook.react.modules.core.a.i(F4.a.b());
        if (z10) {
            eVar.z();
        }
        JSTimerExecutor createJSTimerExecutor = createJSTimerExecutor();
        JavaTimerManager javaTimerManager = new JavaTimerManager(c1905c, createJSTimerExecutor, com.facebook.react.modules.core.a.h(), eVar);
        this.f22028e = javaTimerManager;
        this.mHybridData = initHybrid(interfaceC1909g.getJsRuntimeFactory(), jSQueueThread, nativeModulesQueueThread, javaTimerManager, createJSTimerExecutor, new c(queueThreadExceptionHandler), interfaceC1909g.getBindingsInstaller(), C4313a.j(0L), reactHostInspectorTarget);
        this.f22030g = new JavaScriptContextHolder(getJavaScriptContext());
        C4313a.c(0L, "ReactInstance.initialize#initTurboModules");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1908f(c1905c.c(), c1905c.b()));
        if (z10) {
            arrayList.add(new C1892g());
        }
        arrayList.addAll(interfaceC1909g.getReactPackages());
        com.facebook.react.W a10 = interfaceC1909g.getTurboModuleManagerDelegateBuilder().c(arrayList).d(c1905c).a();
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.f22026c = new TurboModuleManager(unbufferedRuntimeExecutor, a10, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        C4313a.i(0L);
        C4313a.c(0L, "ReactInstance.initialize#initFabric");
        b bVar = new b(arrayList, c1905c);
        this.f22029f = bVar;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new ComponentNameResolver() { // from class: com.facebook.react.runtime.d0
            @Override // com.facebook.react.uimanager.ComponentNameResolver
            public final String[] getComponentNames() {
                String[] v10;
                v10 = ReactInstance.this.v();
                return v10;
            }
        });
        if (G4.a.r()) {
            final HashMap hashMap = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new UIConstantsProviderBinding.DefaultEventTypesProvider() { // from class: com.facebook.react.runtime.e0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
                public final NativeMap getDefaultEventTypes() {
                    NativeMap w10;
                    w10 = ReactInstance.w();
                    return w10;
                }
            }, new UIConstantsProviderBinding.ConstantsForViewManagerProvider() { // from class: com.facebook.react.runtime.f0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
                public final NativeMap getConstantsForViewManager(String str) {
                    NativeMap x10;
                    x10 = ReactInstance.this.x(hashMap, str);
                    return x10;
                }
            }, new UIConstantsProviderBinding.ConstantsProvider() { // from class: com.facebook.react.runtime.g0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
                public final NativeMap getConstants() {
                    NativeMap y10;
                    y10 = ReactInstance.this.y(hashMap);
                    return y10;
                }
            });
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(c1905c, new i1(bVar), eventBeatManager);
        this.f22027d = fabricUIManager;
        C1978y.f(c1905c);
        new BindingImpl().register(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory, interfaceC1909g.getReactNativeConfig());
        fabricUIManager.initialize();
        C4313a.i(0L);
        C4313a.i(0L);
    }

    private static synchronized void A() {
        synchronized (ReactInstance.class) {
            if (!f22023i) {
                SoLoader.t("rninstance");
                f22023i = true;
            }
        }
    }

    private static native JSTimerExecutor createJSTimerExecutor();

    private native long getJavaScriptContext();

    private native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private native RuntimeScheduler getRuntimeScheduler();

    private native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private native void handleMemoryPressureJs(int i10);

    private native HybridData initHybrid(JSRuntimeFactory jSRuntimeFactory, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, JavaTimerManager javaTimerManager, JSTimerExecutor jSTimerExecutor, ReactJsExceptionHandler reactJsExceptionHandler, BindingsInstaller bindingsInstaller, boolean z10, ReactHostInspectorTarget reactHostInspectorTarget);

    private native void installGlobals(boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void loadJSBundleFromAssets(AssetManager assetManager, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void loadJSBundleFromFile(String str, String str2);

    private native void registerSegmentNative(int i10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        C4313a.c(0L, "initializeEagerTurboModules");
        Iterator<String> it = this.f22026c.getEagerInitModuleNames().iterator();
        while (it.hasNext()) {
            this.f22026c.getModule(it.next());
        }
        C4313a.i(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String[] v() {
        Collection a10 = this.f22029f.a();
        if (a10.size() >= 1) {
            return (String[]) a10.toArray(new String[0]);
        }
        AbstractC1721a.m(f22022h, "No ViewManager names found");
        return new String[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeMap w() {
        return Arguments.makeNativeMap((Map<String, Object>) O0.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NativeMap x(Map map, String str) {
        ViewManager b10 = this.f22029f.b(str);
        if (b10 == null) {
            return null;
        }
        return (NativeMap) UIManagerModule.getConstantsForViewManager(b10, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NativeMap y(Map map) {
        Map<String, Object> createConstants = UIManagerModule.createConstants(new ArrayList(this.f22029f.c().values()), null, map);
        Collection e10 = this.f22029f.e();
        if (e10.size() > 0) {
            createConstants.put("ViewManagerNames", new ArrayList(e10));
            createConstants.put("LazyViewManagersEnabled", Boolean.TRUE);
        }
        return Arguments.makeNativeMap(createConstants);
    }

    public void B(int i10, String str) {
        registerSegmentNative(i10, str);
    }

    void C(j0 j0Var) {
        String str = f22022h;
        AbstractC1721a.b(str, "startSurface() is called with surface: " + j0Var.n());
        C4313a.c(0L, "ReactInstance.startSurface");
        ViewGroup a10 = j0Var.a();
        if (a10 == null) {
            throw new IllegalStateException("Starting surface without a view is not supported, use prerenderSurface instead.");
        }
        if (a10.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(str, new com.facebook.react.uimanager.Q("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
            a10.setId(-1);
        }
        if (j0Var.q()) {
            this.f22027d.attachRootView(j0Var.m(), a10);
        } else {
            this.f22027d.startSurface(j0Var.m(), j0Var.h(), a10);
        }
        C4313a.i(0L);
    }

    void D(j0 j0Var) {
        AbstractC1721a.b(f22022h, "stopSurface() is called with surface: " + j0Var.n());
        this.f22027d.stopSurface(j0Var.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void callFunctionOnModule(String str, String str2, NativeArray nativeArray);

    native RuntimeExecutor getBufferedRuntimeExecutor();

    native CallInvokerHolderImpl getJSCallInvokerHolder();

    void j() {
        AbstractC1721a.b(f22022h, "ReactInstance.destroy() is called.");
        this.f22025b.destroy();
        this.f22026c.invalidate();
        this.f22027d.invalidate();
        this.f22028e.w();
        this.mHybridData.resetNative();
        this.f22030g.clear();
    }

    EventDispatcher k() {
        return this.f22027d.getEventDispatcher();
    }

    JavaScriptContextHolder l() {
        return this.f22030g;
    }

    public NativeModule m(Class cls) {
        K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
        if (aVar != null) {
            return n(aVar.name());
        }
        return null;
    }

    public NativeModule n(String str) {
        NativeModule module;
        synchronized (this.f22026c) {
            module = this.f22026c.getModule(str);
        }
        return module;
    }

    public Collection o() {
        return new ArrayList(this.f22026c.getModules());
    }

    public ReactQueueConfiguration p() {
        return this.f22025b;
    }

    FabricUIManager q() {
        return this.f22027d;
    }

    public void r(int i10) {
        try {
            handleMemoryPressureJs(i10);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException(f22022h, new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public boolean s(Class cls) {
        K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
        if (aVar != null) {
            return this.f22026c.hasModule(aVar.name());
        }
        return false;
    }

    void t() {
        Runnable runnable = new Runnable() { // from class: com.facebook.react.runtime.c0
            @Override // java.lang.Runnable
            public final void run() {
                ReactInstance.this.u();
            }
        };
        if (G4.a.k()) {
            this.f22025b.getNativeModulesQueueThread().runOnQueue(runnable);
        } else {
            runnable.run();
        }
    }

    native void unregisterFromInspector();

    public void z(JSBundleLoader jSBundleLoader) {
        C4313a.c(0L, "ReactInstance.loadJSBundle");
        jSBundleLoader.loadScript(new a());
        C4313a.i(0L);
    }
}
