package com.facebook.react.uimanager;

import a5.C1351a;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import b5.InterfaceC1650a;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.AbstractC3747a;
import s5.C4313a;
import s5.C4314b;
import v4.AbstractC4929e;

@K4.a(name = UIManagerModule.NAME)
/* loaded from: classes.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = n3.c.a().b(AbstractC3747a.f37917f);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List<P0> mListeners;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final K0 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final i1 mViewManagerRegistry;

    class a implements d {
        a() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.d
        public String a(String str) {
            return UIManagerModule.this.resolveCustomDirectEventName(str);
        }
    }

    class b extends GuardedRunnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f22293b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i10, Object obj) {
            super(reactContext);
            this.f22292a = i10;
            this.f22293b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.U(this.f22292a, this.f22293b);
        }
    }

    class c extends GuardedRunnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f22296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, int i10, int i11, int i12) {
            super(reactContext);
            this.f22295a = i10;
            this.f22296b = i11;
            this.f22297c = i12;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.Y(this.f22295a, this.f22296b, this.f22297c);
            UIManagerModule.this.mUIImplementation.m(-1);
        }
    }

    public interface d {
        String a(String str);
    }

    private static class e implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 >= 60) {
                n1.a().c();
            }
        }

        private e() {
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, j1 j1Var, int i10) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        C1978y.f(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        this.mModuleConstants = createConstants(j1Var);
        this.mCustomDirectEvents = N0.c();
        i1 i1Var = new i1(j1Var);
        this.mViewManagerRegistry = i1Var;
        this.mUIImplementation = new K0(reactApplicationContext, i1Var, eVar, i10);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(j1 j1Var) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C4314b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return O0.a(j1Var);
        } finally {
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t10) {
        return addRootView(t10, null);
    }

    public void addUIBlock(J0 j02) {
        this.mUIImplementation.a(j02);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(P0 p02) {
        this.mListeners.add(p02);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i10, String str, int i11, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            AbstractC1721a.b("ReactNative", str2);
            n3.c.a().a(AbstractC3747a.f37917f, str2);
        }
        this.mUIImplementation.j(i10, str, i11, readableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        this.mUIImplementation.k(i10, i11, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i10, Dynamic dynamic, ReadableArray readableArray) {
        UIManager g10 = L0.g(getReactApplicationContext(), C1351a.a(i10));
        if (g10 == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            g10.dispatchCommand(i10, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            g10.dispatchCommand(i10, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i10, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.o(i10, Math.round(C1944g0.f(readableArray.getDouble(0))), Math.round(C1944g0.f(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager O10 = this.mUIImplementation.O(str);
        if (O10 == null) {
            return null;
        }
        return getConstantsForViewManager(O10, this.mCustomDirectEvents);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap((Map<String, Object>) O0.d());
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a();
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.p();
    }

    @Deprecated
    public K0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public i1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        this.mEventDispatcher.a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.g();
        this.mUIImplementation.B();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        n1.a().c();
        e1.a();
    }

    public void invalidateNodeLayout(int i10) {
        InterfaceC1969t0 N10 = this.mUIImplementation.N(i10);
        if (N10 != null) {
            N10.i();
            this.mUIImplementation.m(-1);
        } else {
            AbstractC1721a.J("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i10);
        }
    }

    @ReactMethod
    public void manageChildren(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i10 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            AbstractC1721a.b("ReactNative", str);
            n3.c.a().a(AbstractC3747a.f37917f, str);
        }
        this.mUIImplementation.u(i10, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i10, int i11) {
    }

    @ReactMethod
    public void measure(int i10, Callback callback) {
        this.mUIImplementation.v(i10, callback);
    }

    @ReactMethod
    public void measureInWindow(int i10, Callback callback) {
        this.mUIImplementation.w(i10, callback);
    }

    @ReactMethod
    public void measureLayout(int i10, int i11, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i10, i11, callback, callback2);
    }

    public void onBatchComplete() {
        int i10 = this.mBatchId;
        this.mBatchId = i10 + 1;
        C4314b.a(0L, "onBatchCompleteUI").a("BatchId", i10).c();
        Iterator<P0> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.q() > 0) {
                this.mUIImplementation.m(i10);
            }
        } finally {
            C4313a.i(0L);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.D();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.E();
    }

    public void prependUIBlock(J0 j02) {
        this.mUIImplementation.F(j02);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.G();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i10) {
        this.mUIImplementation.J(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(P0 p02) {
        this.mListeners.remove(p02);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i10) {
        return C1351a.d(i10) ? i10 : this.mUIImplementation.M(i10);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i10) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().S().resolveView(i10);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i10, int i11) {
        int a10 = C1351a.a(i10);
        if (a10 != 2) {
            this.mUIImplementation.P(i10, i11);
            return;
        }
        UIManager g10 = L0.g(getReactApplicationContext(), a10);
        if (g10 != null) {
            g10.sendAccessibilityEvent(i10, i11);
        }
    }

    @ReactMethod
    public void setChildren(int i10, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i10 + ", children: " + readableArray;
            AbstractC1721a.b("ReactNative", str);
            n3.c.a().a(AbstractC3747a.f37917f, str);
        }
        this.mUIImplementation.Q(i10, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i10, boolean z10) {
        this.mUIImplementation.R(i10, z10);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z10) {
        this.mUIImplementation.S(z10);
    }

    public void setViewHierarchyUpdateDebugListener(InterfaceC1650a interfaceC1650a) {
        this.mUIImplementation.T(interfaceC1650a);
    }

    public void setViewLocalData(int i10, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i10, obj));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i10, int i11) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i10, ReadableMap readableMap) {
        this.mUIImplementation.V(i10, new C1973v0(readableMap));
    }

    public void updateInsetsPadding(int i10, int i11, int i12, int i13, int i14) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.W(i10, i11, i12, i13, i14);
    }

    public void updateNodeSize(int i10, int i11, int i12) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.X(i10, i11, i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i10, i11, i12));
    }

    @ReactMethod
    public void updateView(int i10, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            AbstractC1721a.b("ReactNative", str2);
            n3.c.a().a(AbstractC3747a.f37917f, str2);
        }
        this.mUIImplementation.a0(i10, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i10, int i11, Callback callback) {
        this.mUIImplementation.c0(i10, i11, callback);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t10, WritableMap writableMap) {
        C4313a.c(0L, "UIManagerModule.addRootView");
        int a10 = C1967s0.a();
        this.mUIImplementation.H(t10, a10, new F0(getReactApplicationContext(), t10.getContext(), ((InterfaceC1965r0) t10).getSurfaceID(), -1));
        C4313a.i(0L);
        return a10;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        this.mUIImplementation.l(i10, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i11, str, writableMap);
    }

    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        C4314b.a(0L, "UIManagerModule.getConstantsForViewManager").b("ViewManager", viewManager.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map c10 = O0.c(viewManager, null, null, null, map);
            if (c10 != null) {
                return Arguments.makeNativeMap((Map<String, Object>) c10);
            }
            return null;
        } finally {
            C4314b.b(0L).c();
        }
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C4314b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return O0.b(list, map, map2);
        } finally {
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i10) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        C1978y.f(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        HashMap b10 = AbstractC4929e.b();
        this.mCustomDirectEvents = b10;
        this.mModuleConstants = createConstants(list, null, b10);
        i1 i1Var = new i1(list);
        this.mViewManagerRegistry = i1Var;
        this.mUIImplementation = new K0(reactApplicationContext, i1Var, eVar, i10);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
