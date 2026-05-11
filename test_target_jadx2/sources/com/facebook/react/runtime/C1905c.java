package com.facebook.react.runtime;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.react.runtime.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1905c extends ReactApplicationContext implements com.facebook.react.uimanager.events.i {

    /* renamed from: a, reason: collision with root package name */
    private final ReactHostImpl f22068a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f22069b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22070c;

    /* renamed from: com.facebook.react.runtime.c$a */
    private static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final ReactHostImpl f22071a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f22072b;

        public a(ReactHostImpl reactHostImpl, Class cls) {
            this.f22071a = reactHostImpl;
            this.f22072b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            this.f22071a.h0(JavaScriptModuleRegistry.getJSModuleName(this.f22072b), method.getName(), objArr != null ? Arguments.fromJavaArgs(objArr) : new WritableNativeArray());
            return null;
        }
    }

    C1905c(Context context, ReactHostImpl reactHostImpl) {
        super(context);
        this.f22069b = new AtomicReference();
        this.f22070c = getClass().getSimpleName();
        this.f22068a = reactHostImpl;
        if (G4.a.p()) {
            initializeInteropModules();
        }
    }

    O4.b b() {
        return this.f22068a.o0();
    }

    C4.e c() {
        return this.f22068a.i();
    }

    public void d(String str) {
        this.f22069b.set(str);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void emitDeviceEvent(String str, Object obj) {
        this.f22068a.h0("RCTDeviceEventEmitter", "emit", Arguments.fromJavaArgs(new Object[]{str, obj}));
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        Log.w(this.f22070c, "[WARNING] Bridgeless doesn't support CatalystInstance. Accessing an API that's not part of the new architecture is not encouraged usage.");
        return new BridgelessCatalystInstance(this.f22068a);
    }

    @Override // com.facebook.react.uimanager.events.i
    public EventDispatcher getEventDispatcher() {
        return this.f22068a.q0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f22068a.H0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f22068a.r0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptModule getJSModule(Class cls) {
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        return (interopModuleRegistry == null || !interopModuleRegistry.shouldReturnInteropModule(cls)) ? (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this.f22068a, cls)) : this.mInteropModuleRegistry.getInteropModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f22068a.s0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(Class cls) {
        return this.f22068a.v0(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection getNativeModules() {
        return this.f22068a.x0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return (String) this.f22069b.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.f22068a.I0(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f22068a.K0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasNativeModule(Class cls) {
        return this.f22068a.J0(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f22068a.K0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i10, String str, Callback callback) {
        this.f22068a.J1(i10, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        return this.f22068a.w0(str);
    }
}
