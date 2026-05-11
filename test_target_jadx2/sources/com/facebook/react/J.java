package com.facebook.react;

import C4.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1484a0;
import c3.AbstractC1721a;
import com.facebook.react.J;
import com.facebook.react.W;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.d0;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.C1978y;
import com.facebook.react.uimanager.InterfaceC1965r0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o3.AbstractC3747a;
import r4.AbstractC4012a;
import s5.C4313a;
import s5.C4314b;

/* loaded from: classes.dex */
public class J {

    /* renamed from: E, reason: collision with root package name */
    private static final String f21071E = "J";

    /* renamed from: A, reason: collision with root package name */
    private final W.a f21072A;

    /* renamed from: B, reason: collision with root package name */
    private List f21073B;

    /* renamed from: b, reason: collision with root package name */
    private volatile LifecycleState f21077b;

    /* renamed from: c, reason: collision with root package name */
    private f f21078c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Thread f21079d;

    /* renamed from: e, reason: collision with root package name */
    private final JavaScriptExecutorFactory f21080e;

    /* renamed from: g, reason: collision with root package name */
    private final JSBundleLoader f21082g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21083h;

    /* renamed from: i, reason: collision with root package name */
    private final List f21084i;

    /* renamed from: j, reason: collision with root package name */
    private final C4.e f21085j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f21086k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f21087l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f21088m;

    /* renamed from: n, reason: collision with root package name */
    private final NotThreadSafeBridgeIdleDebugListener f21089n;

    /* renamed from: p, reason: collision with root package name */
    private volatile ReactContext f21091p;

    /* renamed from: q, reason: collision with root package name */
    private final Context f21092q;

    /* renamed from: r, reason: collision with root package name */
    private O4.b f21093r;

    /* renamed from: s, reason: collision with root package name */
    private Activity f21094s;

    /* renamed from: t, reason: collision with root package name */
    private ReactInstanceManagerInspectorTarget f21095t;

    /* renamed from: x, reason: collision with root package name */
    private final ComponentCallbacks2C1895j f21099x;

    /* renamed from: y, reason: collision with root package name */
    private final JSExceptionHandler f21100y;

    /* renamed from: z, reason: collision with root package name */
    private final UIManagerProvider f21101z;

    /* renamed from: a, reason: collision with root package name */
    private final Set f21076a = Collections.synchronizedSet(new HashSet());

    /* renamed from: f, reason: collision with root package name */
    private Collection f21081f = null;

    /* renamed from: o, reason: collision with root package name */
    private final Object f21090o = new Object();

    /* renamed from: u, reason: collision with root package name */
    private final Collection f21096u = Collections.synchronizedList(new ArrayList());

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f21097v = false;

    /* renamed from: w, reason: collision with root package name */
    private volatile Boolean f21098w = Boolean.FALSE;

    /* renamed from: C, reason: collision with root package name */
    private boolean f21074C = true;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f21075D = false;

    class a implements O4.b {
        a() {
        }

        @Override // O4.b
        public void b() {
            J.this.L();
        }
    }

    class b implements d0 {
        b() {
        }

        @Override // com.facebook.react.devsupport.d0
        public Activity a() {
            return J.this.f21094s;
        }

        @Override // com.facebook.react.devsupport.d0
        public View b(String str) {
            Activity a10 = a();
            if (a10 == null) {
                return null;
            }
            Z z10 = new Z(a10);
            z10.setIsFabric(ReactFeatureFlags.enableFabricRenderer);
            z10.u(J.this, str, new Bundle());
            return z10;
        }

        @Override // com.facebook.react.devsupport.d0
        public JavaScriptExecutorFactory c() {
            return J.this.F();
        }

        @Override // com.facebook.react.devsupport.d0
        public void e(View view) {
            if (view instanceof Z) {
                ((Z) view).v();
            }
        }

        @Override // com.facebook.react.devsupport.d0
        public void i() {
            J.this.w0();
        }
    }

    class c implements C4.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P4.a f21104a;

        c(P4.a aVar) {
            this.f21104a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(boolean z10, P4.a aVar) {
            if (J.this.f21075D) {
                return;
            }
            if (z10) {
                J.this.f21085j.q();
                return;
            }
            if (J.this.f21085j.A() && !aVar.m() && !J.this.f21074C) {
                J.this.g0();
            } else {
                aVar.g(false);
                J.this.o0();
            }
        }

        @Override // C4.g
        public void a(final boolean z10) {
            final P4.a aVar = this.f21104a;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.K
                @Override // java.lang.Runnable
                public final void run() {
                    J.c.this.c(z10, aVar);
                }
            });
        }
    }

    class d implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f21106a;

        d(View view) {
            this.f21106a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f21106a.removeOnAttachStateChangeListener(this);
            J.this.f21085j.t(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements ReactInstanceManagerInspectorTarget.TargetDelegate {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f21108a;

        class a implements e.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ J f21109a;

            a(J j10) {
                this.f21109a = j10;
            }

            @Override // C4.e.a
            public void a() {
                UiThreadUtil.assertOnUiThread();
                if (this.f21109a.f21095t != null) {
                    this.f21109a.f21095t.sendDebuggerResumeCommand();
                }
            }
        }

        public e(J j10) {
            this.f21108a = new WeakReference(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            J j10 = (J) this.f21108a.get();
            if (j10 != null) {
                j10.f21085j.q();
            }
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public Map getMetadata() {
            J j10 = (J) this.f21108a.get();
            return S4.a.e(j10 != null ? j10.f21092q : null);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            B4.a.a(str, inspectorNetworkRequestListener);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onReload() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.L
                @Override // java.lang.Runnable
                public final void run() {
                    J.e.this.b();
                }
            });
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onSetPausedInDebuggerMessage(String str) {
            J j10 = (J) this.f21108a.get();
            if (j10 == null) {
                return;
            }
            if (str == null) {
                j10.f21085j.h();
            } else {
                j10.f21085j.j(str, new a(j10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f {

        /* renamed from: a, reason: collision with root package name */
        private final JavaScriptExecutorFactory f21111a;

        /* renamed from: b, reason: collision with root package name */
        private final JSBundleLoader f21112b;

        public f(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f21111a = (JavaScriptExecutorFactory) AbstractC4012a.c(javaScriptExecutorFactory);
            this.f21112b = (JSBundleLoader) AbstractC4012a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f21112b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f21111a;
        }
    }

    J(Context context, Activity activity, O4.b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List list, boolean z10, com.facebook.react.devsupport.I i10, boolean z11, boolean z12, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, C4.i iVar, boolean z13, C4.b bVar2, int i11, int i12, UIManagerProvider uIManagerProvider, Map map, W.a aVar, v4.j jVar, C4.c cVar, F4.b bVar3, C4.h hVar) {
        AbstractC1721a.b(f21071E, "ReactInstanceManager.ctor()");
        K(context);
        C1978y.f(context);
        this.f21092q = context;
        this.f21094s = activity;
        this.f21093r = bVar;
        this.f21080e = javaScriptExecutorFactory;
        this.f21082g = jSBundleLoader;
        this.f21083h = str;
        ArrayList arrayList = new ArrayList();
        this.f21084i = arrayList;
        this.f21086k = z10;
        this.f21087l = z11;
        this.f21088m = z12;
        C4313a.c(0L, "ReactInstanceManager.initDevSupportManager");
        C4.e a10 = i10.a(context, x(), str, z10, iVar, bVar2, i11, map, jVar, cVar, hVar);
        this.f21085j = a10;
        C4313a.i(0L);
        this.f21089n = notThreadSafeBridgeIdleDebugListener;
        this.f21077b = lifecycleState;
        this.f21099x = new ComponentCallbacks2C1895j(context);
        this.f21100y = jSExceptionHandler;
        this.f21072A = aVar;
        synchronized (arrayList) {
            try {
                n3.c.a().a(AbstractC3747a.f37914c, "RNCore: Use Split Packages");
                arrayList.add(new C1864d(this, new a(), z13, i12));
                if (z10) {
                    arrayList.add(new C1892g());
                }
                arrayList.addAll(list);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21101z = uIManagerProvider;
        com.facebook.react.modules.core.a.i(bVar3 != null ? bVar3 : F4.a.b());
        if (z10) {
            a10.z();
        }
        q0();
    }

    private void C(InterfaceC1965r0 interfaceC1965r0, ReactContext reactContext) {
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (interfaceC1965r0.getState().compareAndSet(1, 0)) {
            int uIManagerType = interfaceC1965r0.getUIManagerType();
            if (uIManagerType == 2) {
                int rootViewTag = interfaceC1965r0.getRootViewTag();
                if (rootViewTag != -1) {
                    UIManager g10 = L0.g(reactContext, uIManagerType);
                    if (g10 != null) {
                        g10.stopSurface(rootViewTag);
                    } else {
                        AbstractC1721a.J("ReactNative", "Failed to stop surface, UIManager has already gone away");
                    }
                } else {
                    ReactSoftExceptionLogger.logSoftException(f21071E, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
                }
            } else {
                ((AppRegistry) reactContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(interfaceC1965r0.getRootViewTag());
            }
            w(interfaceC1965r0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JavaScriptExecutorFactory F() {
        return this.f21080e;
    }

    private ReactInstanceManagerInspectorTarget G() {
        if (this.f21095t == null && InspectorFlags.getFuseboxEnabled()) {
            this.f21095t = new ReactInstanceManagerInspectorTarget(new e(this));
        }
        return this.f21095t;
    }

    static void K(Context context) {
        SoLoader.m(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        UiThreadUtil.assertOnUiThread();
        O4.b bVar = this.f21093r;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(int i10, InterfaceC1965r0 interfaceC1965r0) {
        C4313a.g(0L, "pre_rootView.onAttachedToReactInstance", i10);
        interfaceC1965r0.c(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        f fVar = this.f21078c;
        if (fVar != null) {
            s0(fVar);
            this.f21078c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(ReactApplicationContext reactApplicationContext) {
        try {
            t0(reactApplicationContext);
        } catch (Exception e10) {
            this.f21085j.handleException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(f fVar) {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
        synchronized (this.f21098w) {
            while (this.f21098w.booleanValue()) {
                try {
                    this.f21098w.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.f21097v = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
            final ReactApplicationContext y10 = y(fVar.b().create(), fVar.a());
            try {
                this.f21079d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                Runnable runnable = new Runnable() { // from class: com.facebook.react.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.this.N();
                    }
                };
                y10.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.this.O(y10);
                    }
                });
                UiThreadUtil.runOnUiThread(runnable);
            } catch (Exception e10) {
                this.f21085j.handleException(e10);
            }
        } catch (Exception e11) {
            this.f21097v = false;
            this.f21079d = null;
            this.f21085j.handleException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(B[] bArr, ReactApplicationContext reactApplicationContext) {
        T();
        for (B b10 : bArr) {
            if (b10 != null) {
                b10.a(reactApplicationContext);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }

    private synchronized void T() {
        if (this.f21077b == LifecycleState.RESUMED) {
            W(true);
        }
    }

    private synchronized void U() {
        try {
            ReactContext D10 = D();
            if (D10 != null) {
                if (this.f21077b == LifecycleState.RESUMED) {
                    D10.onHostPause();
                    this.f21077b = LifecycleState.BEFORE_RESUME;
                }
                if (this.f21077b == LifecycleState.BEFORE_RESUME) {
                    D10.onHostDestroy(this.f21088m);
                }
            }
            this.f21077b = LifecycleState.BEFORE_CREATE;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void V() {
        try {
            ReactContext D10 = D();
            if (D10 != null) {
                if (this.f21077b == LifecycleState.BEFORE_CREATE) {
                    D10.onHostResume(this.f21094s);
                    D10.onHostPause();
                } else if (this.f21077b == LifecycleState.RESUMED) {
                    D10.onHostPause();
                }
            }
            this.f21077b = LifecycleState.BEFORE_RESUME;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void W(boolean z10) {
        try {
            ReactContext D10 = D();
            if (D10 != null) {
                if (!z10) {
                    if (this.f21077b != LifecycleState.BEFORE_RESUME) {
                        if (this.f21077b == LifecycleState.BEFORE_CREATE) {
                        }
                    }
                }
                D10.onHostResume(this.f21094s);
            }
            this.f21077b = LifecycleState.RESUMED;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        n0(this.f21080e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f21085j.v(), this.f21085j.k()));
    }

    private void k0(P p10, C1896k c1896k) {
        C4314b.a(0L, "processPackage").b("className", p10.getClass().getSimpleName()).c();
        boolean z10 = p10 instanceof T;
        if (z10) {
            ((T) p10).a();
        }
        c1896k.b(p10);
        if (z10) {
            ((T) p10).b();
        }
        C4314b.b(0L).c();
    }

    private NativeModuleRegistry l0(ReactApplicationContext reactApplicationContext, List list) {
        C1896k c1896k = new C1896k(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f21084i) {
            try {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        P p10 = (P) it.next();
                        C4313a.c(0L, "createAndProcessCustomReactPackage");
                        try {
                            k0(p10, c1896k);
                            C4313a.i(0L);
                        } catch (Throwable th) {
                            C4313a.i(0L);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        C4313a.c(0L, "buildNativeModuleRegistry");
        try {
            return c1896k.a();
        } finally {
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void n0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        f fVar = new f(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f21079d == null) {
            s0(fVar);
        } else {
            this.f21078c = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        AbstractC1721a.b(f21071E, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        n3.c.a().a(AbstractC3747a.f37914c, "RNCore: load from BundleLoader");
        n0(this.f21080e, this.f21082g);
    }

    private void p0() {
        AbstractC1721a.b(f21071E, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        n3.c.a().a(AbstractC3747a.f37914c, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f21086k && this.f21083h != null) {
            P4.a w10 = this.f21085j.w();
            if (!C4313a.j(0L)) {
                if (this.f21082g == null) {
                    this.f21085j.q();
                    return;
                } else {
                    this.f21085j.x(new c(w10));
                    return;
                }
            }
        }
        o0();
    }

    private void q0() {
        Method method;
        try {
            method = J.class.getMethod(f21071E, Exception.class);
        } catch (NoSuchMethodException e10) {
            AbstractC1721a.n("ReactInstanceHolder", "Failed to set cxx error handler function", e10);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    private void s0(final f fVar) {
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        AbstractC4012a.b(!this.f21075D, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f21076a) {
            synchronized (this.f21090o) {
                try {
                    if (this.f21091p != null) {
                        v0(this.f21091p);
                        this.f21091p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f21079d = new Thread(null, new Runnable() { // from class: com.facebook.react.D
            @Override // java.lang.Runnable
            public final void run() {
                J.this.P(fVar);
            }
        }, "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f21079d.start();
    }

    private void t0(final ReactApplicationContext reactApplicationContext) {
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        C4313a.c(0L, "setupReactContext");
        synchronized (this.f21076a) {
            try {
                synchronized (this.f21090o) {
                    this.f21091p = (ReactContext) AbstractC4012a.c(reactApplicationContext);
                }
                CatalystInstance catalystInstance = (CatalystInstance) AbstractC4012a.c(reactApplicationContext.getCatalystInstance());
                catalystInstance.initialize();
                this.f21085j.p(reactApplicationContext);
                this.f21099x.a(catalystInstance);
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator it = this.f21076a.iterator();
                while (it.hasNext()) {
                    u((InterfaceC1965r0) it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th) {
                throw th;
            }
        }
        final B[] bArr = (B[]) this.f21096u.toArray(new B[this.f21096u.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.G
            @Override // java.lang.Runnable
            public final void run() {
                J.this.Q(bArr, reactApplicationContext);
            }
        });
        reactApplicationContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.H
            @Override // java.lang.Runnable
            public final void run() {
                J.R();
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.I
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(0);
            }
        });
        C4313a.i(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    private void u(final InterfaceC1965r0 interfaceC1965r0) {
        final int addRootView;
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        if (interfaceC1965r0.getState().compareAndSet(0, 1)) {
            C4313a.c(0L, "attachRootViewToInstance");
            UIManager g10 = L0.g(this.f21091p, interfaceC1965r0.getUIManagerType());
            if (g10 == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = interfaceC1965r0.getAppProperties();
            if (interfaceC1965r0.getUIManagerType() == 2) {
                addRootView = g10.startSurface(interfaceC1965r0.getRootViewGroup(), interfaceC1965r0.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), interfaceC1965r0.getWidthMeasureSpec(), interfaceC1965r0.getHeightMeasureSpec());
                interfaceC1965r0.setShouldLogContentAppeared(true);
            } else {
                addRootView = g10.addRootView(interfaceC1965r0.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                interfaceC1965r0.setRootViewTag(addRootView);
                interfaceC1965r0.e();
            }
            C4313a.a(0L, "pre_rootView.onAttachedToReactInstance", addRootView);
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.C
                @Override // java.lang.Runnable
                public final void run() {
                    J.M(addRootView, interfaceC1965r0);
                }
            });
            C4313a.i(0L);
        }
    }

    public static M v() {
        return new M();
    }

    private void v0(ReactContext reactContext) {
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f21077b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f21076a) {
            try {
                Iterator it = this.f21076a.iterator();
                while (it.hasNext()) {
                    C((InterfaceC1965r0) it.next(), reactContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21099x.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f21085j.D(reactContext);
    }

    private void w(InterfaceC1965r0 interfaceC1965r0) {
        UiThreadUtil.assertOnUiThread();
        interfaceC1965r0.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = interfaceC1965r0.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        ReactContext D10 = D();
        if (D10 == null || !D10.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(f21071E, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        } else {
            D10.emitDeviceEvent("toggleElementInspector");
        }
    }

    private d0 x() {
        return new b();
    }

    private ReactApplicationContext y(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager createUIManager;
        W.a aVar;
        AbstractC1721a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.f21092q);
        JSExceptionHandler jSExceptionHandler = this.f21100y;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.f21085j;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        CatalystInstanceImpl.Builder inspectorTarget = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(l0(bridgeReactContext, this.f21084i)).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler).setInspectorTarget(G());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        C4313a.c(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = inspectorTarget.build();
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            bridgeReactContext.initializeWithInstance(build);
            build.getRuntimeScheduler();
            if (ReactFeatureFlags.useTurboModules && (aVar = this.f21072A) != null) {
                TurboModuleManager turboModuleManager = new TurboModuleManager(build.getRuntimeExecutor(), aVar.c(this.f21084i).d(bridgeReactContext).a(), build.getJSCallInvokerHolder(), build.getNativeMethodCallInvokerHolder());
                build.setTurboModuleRegistry(turboModuleManager);
                Iterator<String> it = turboModuleManager.getEagerInitModuleNames().iterator();
                while (it.hasNext()) {
                    turboModuleManager.getModule(it.next());
                }
            }
            UIManagerProvider uIManagerProvider = this.f21101z;
            if (uIManagerProvider != null && (createUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                build.setFabricUIManager(createUIManager);
                createUIManager.initialize();
                build.setFabricUIManager(createUIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f21089n;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (C4313a.j(0L)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            C4313a.c(0L, "runJSBundle");
            build.runJSBundle();
            C4313a.i(0L);
            return bridgeReactContext;
        } catch (Throwable th) {
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    public ViewManager A(String str) {
        ViewManager createViewManager;
        synchronized (this.f21090o) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) D();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f21084i) {
                    try {
                        for (P p10 : this.f21084i) {
                            if ((p10 instanceof b0) && (createViewManager = ((b0) p10).createViewManager(reactApplicationContext, str)) != null) {
                                return createViewManager;
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            }
            return null;
        }
    }

    public void B(InterfaceC1965r0 interfaceC1965r0) {
        ReactContext reactContext;
        UiThreadUtil.assertOnUiThread();
        if (this.f21076a.remove(interfaceC1965r0) && (reactContext = this.f21091p) != null && reactContext.hasActiveReactInstance()) {
            C(interfaceC1965r0, reactContext);
        }
    }

    public ReactContext D() {
        ReactContext reactContext;
        synchronized (this.f21090o) {
            reactContext = this.f21091p;
        }
        return reactContext;
    }

    public C4.e E() {
        return this.f21085j;
    }

    public List H(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        C4313a.c(0L, "createAllViewManagers");
        try {
            if (this.f21073B == null) {
                synchronized (this.f21084i) {
                    try {
                        if (this.f21073B == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = this.f21084i.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(((P) it.next()).createViewManagers(reactApplicationContext));
                            }
                            this.f21073B = arrayList;
                            C4313a.i(0L);
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                            return arrayList;
                        }
                    } finally {
                    }
                }
            }
            List list = this.f21073B;
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th) {
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th;
        }
    }

    public Collection I() {
        Collection collection;
        C4313a.c(0L, "ReactInstanceManager.getViewManagerNames");
        try {
            Collection collection2 = this.f21081f;
            if (collection2 != null) {
                return collection2;
            }
            synchronized (this.f21090o) {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) D();
                if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                    synchronized (this.f21084i) {
                        try {
                            if (this.f21081f == null) {
                                HashSet hashSet = new HashSet();
                                for (P p10 : this.f21084i) {
                                    C4314b.a(0L, "ReactInstanceManager.getViewManagerName").b("Package", p10.getClass().getSimpleName()).c();
                                    if (p10 instanceof b0) {
                                        Collection viewManagerNames = ((b0) p10).getViewManagerNames(reactApplicationContext);
                                        if (viewManagerNames != null) {
                                            hashSet.addAll(viewManagerNames);
                                        }
                                    } else {
                                        AbstractC1721a.L("ReactNative", "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", p10.getClass().getSimpleName());
                                    }
                                    C4313a.i(0L);
                                }
                                this.f21081f = hashSet;
                            }
                            collection = this.f21081f;
                        } finally {
                        }
                    }
                    return collection;
                }
                AbstractC1721a.J("ReactNative", "Calling getViewManagerNames without active context");
                return Collections.emptyList();
            }
        } finally {
            C4313a.i(0L);
        }
    }

    public void J(Exception exc) {
        this.f21085j.handleException(exc);
    }

    public void X(Activity activity, int i10, int i11, Intent intent) {
        ReactContext D10 = D();
        if (D10 != null) {
            D10.onActivityResult(activity, i10, i11, intent);
        }
    }

    public void Y() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f21091p;
        if (reactContext == null) {
            AbstractC1721a.J(f21071E, "Instance detached from instance manager");
            L();
        } else {
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
            if (deviceEventManagerModule != null) {
                deviceEventManagerModule.emitHardwareBackPressed();
            }
        }
    }

    public void Z(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext D10 = D();
        if (D10 == null || (appearanceModule = (AppearanceModule) D10.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    public void a0() {
        UiThreadUtil.assertOnUiThread();
        if (this.f21086k) {
            this.f21085j.t(false);
        }
        U();
        if (this.f21088m) {
            return;
        }
        this.f21094s = null;
    }

    public void b0(Activity activity) {
        if (activity == this.f21094s) {
            a0();
        }
    }

    public void c0() {
        UiThreadUtil.assertOnUiThread();
        this.f21093r = null;
        if (this.f21086k) {
            this.f21085j.t(false);
        }
        V();
    }

    public void d0(Activity activity) {
        if (this.f21087l) {
            AbstractC4012a.a(this.f21094s != null);
        }
        Activity activity2 = this.f21094s;
        if (activity2 != null) {
            AbstractC4012a.b(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f21094s.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        c0();
    }

    public void e0(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f21094s = activity;
        if (this.f21086k) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (AbstractC1484a0.T(decorView)) {
                    this.f21085j.t(true);
                } else {
                    decorView.addOnAttachStateChangeListener(new d(decorView));
                }
            } else if (!this.f21087l) {
                this.f21085j.t(true);
            }
        }
        W(false);
    }

    public void f0(Activity activity, O4.b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.f21093r = bVar;
        e0(activity);
    }

    public void h0(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext D10 = D();
        if (D10 == null) {
            AbstractC1721a.J(f21071E, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) D10.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        D10.onNewIntent(this.f21094s, intent);
    }

    public void i0(Activity activity) {
        Activity activity2 = this.f21094s;
        if (activity2 == null || activity != activity2) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext D10 = D();
        if (D10 != null) {
            D10.onUserLeaveHint(activity);
        }
    }

    public void j0(boolean z10) {
        UiThreadUtil.assertOnUiThread();
        ReactContext D10 = D();
        if (D10 != null) {
            D10.onWindowFocusChange(z10);
        }
    }

    public void m0() {
        AbstractC4012a.b(this.f21097v, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        p0();
    }

    public void r0(B b10) {
        this.f21096u.remove(b10);
    }

    public void s(B b10) {
        this.f21096u.add(b10);
    }

    public void t(InterfaceC1965r0 interfaceC1965r0) {
        UiThreadUtil.assertOnUiThread();
        if (this.f21076a.add(interfaceC1965r0)) {
            w(interfaceC1965r0);
        } else {
            AbstractC1721a.m("ReactNative", "ReactRoot was attached multiple times");
        }
        ReactContext D10 = D();
        if (this.f21079d != null || D10 == null) {
            return;
        }
        u(interfaceC1965r0);
    }

    public void u0() {
        UiThreadUtil.assertOnUiThread();
        this.f21085j.C();
    }

    public void z() {
        AbstractC1721a.b(f21071E, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.f21097v) {
            return;
        }
        this.f21097v = true;
        p0();
    }
}
