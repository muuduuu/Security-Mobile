package com.facebook.react.runtime;

import C4.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c3.AbstractC1721a;
import com.facebook.react.ComponentCallbacks2C1895j;
import com.facebook.react.EnumC1894i;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.C1903a;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import r4.AbstractC4012a;
import x4.C5109a;

/* loaded from: classes.dex */
public class ReactHostImpl implements com.facebook.react.A {

    /* renamed from: C, reason: collision with root package name */
    private static final AtomicInteger f21985C = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    private W4.d f21986A;

    /* renamed from: B, reason: collision with root package name */
    private W4.d f21987B;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21988a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1909g f21989b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentFactory f21990c;

    /* renamed from: d, reason: collision with root package name */
    private final C4.e f21991d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f21992e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f21993f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f21994g;

    /* renamed from: h, reason: collision with root package name */
    private final ComponentCallbacks2C1895j f21995h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21996i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21997j;

    /* renamed from: k, reason: collision with root package name */
    private final C1903a f21998k;

    /* renamed from: l, reason: collision with root package name */
    private ReactInstance f21999l;

    /* renamed from: m, reason: collision with root package name */
    private final C1903a f22000m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f22001n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f22002o;

    /* renamed from: p, reason: collision with root package name */
    private final C1906d f22003p;

    /* renamed from: q, reason: collision with root package name */
    private final h0 f22004q;

    /* renamed from: r, reason: collision with root package name */
    private final int f22005r;

    /* renamed from: s, reason: collision with root package name */
    private EnumC1894i f22006s;

    /* renamed from: t, reason: collision with root package name */
    private MemoryPressureListener f22007t;

    /* renamed from: u, reason: collision with root package name */
    private O4.b f22008u;

    /* renamed from: v, reason: collision with root package name */
    private final List f22009v;

    /* renamed from: w, reason: collision with root package name */
    private final List f22010w;

    /* renamed from: x, reason: collision with root package name */
    private ReactHostInspectorTarget f22011x;

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f22012y;

    /* renamed from: z, reason: collision with root package name */
    private W4.d f22013z;

    class a implements e.a {
        a() {
        }

        @Override // C4.e.a
        public void a() {
            UiThreadUtil.assertOnUiThread();
            if (ReactHostImpl.this.f22011x != null) {
                ReactHostImpl.this.f22011x.sendDebuggerResumeCommand();
            }
        }
    }

    class b implements C4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22015a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.devsupport.E f22016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W4.e f22017c;

        b(String str, com.facebook.react.devsupport.E e10, W4.e eVar) {
            this.f22015a = str;
            this.f22016b = e10;
            this.f22017c = eVar;
        }

        @Override // C4.a
        public void onError(Exception exc) {
            this.f22017c.c(exc);
        }

        @Override // C4.a
        public void onSuccess() {
            ReactHostImpl.this.E1("loadJSBundleFromMetro()", "Creating BundleLoader");
            this.f22017c.d(JSBundleLoader.createCachedBundleFromNetworkLoader(this.f22015a, this.f22016b.k()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        final ReactInstance f22019a;

        /* renamed from: b, reason: collision with root package name */
        final ReactContext f22020b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f22021c;

        private c(ReactInstance reactInstance, ReactContext reactContext, boolean z10) {
            this.f22019a = reactInstance;
            this.f22020b = reactContext;
            this.f22021c = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {
        void a(ReactInstance reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e {
        ReactInstance a(W4.d dVar, String str);
    }

    public ReactHostImpl(Context context, InterfaceC1909g interfaceC1909g, ComponentFactory componentFactory, boolean z10, boolean z11) {
        this(context, interfaceC1909g, componentFactory, Executors.newSingleThreadExecutor(), W4.d.f11360j, z10, z11);
    }

    private ReactHostInspectorTarget A0() {
        if (this.f22011x == null && InspectorFlags.getFuseboxEnabled()) {
            this.f22011x = new ReactHostInspectorTarget(this);
        }
        return this.f22011x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1(String str, j0 j0Var, ReactInstance reactInstance) {
        E1(str, "Execute");
        reactInstance.D(j0Var);
    }

    private W4.d B0() {
        return W4.d.d(new Callable() { // from class: com.facebook.react.runtime.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                W4.d Q12;
                Q12 = ReactHostImpl.this.Q1();
                return Q12;
            }
        }, this.f21992e).j(new C1920s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d B1(int i10, int i11, W4.d dVar) {
        return R1(i10 + 1, i11);
    }

    private W4.d C0() {
        D1("getOrCreateReactInstanceTask()");
        return (W4.d) this.f21998k.c(new C1903a.InterfaceC0381a() { // from class: com.facebook.react.runtime.E
            @Override // com.facebook.react.runtime.C1903a.InterfaceC0381a
            public final Object get() {
                W4.d k12;
                k12 = ReactHostImpl.this.k1();
                return k12;
            }
        });
    }

    private W4.d C1() {
        D1("loadJSBundleFromMetro()");
        W4.e eVar = new W4.e();
        com.facebook.react.devsupport.E e10 = (com.facebook.react.devsupport.E) i();
        String q10 = e10.k0().q((String) AbstractC4012a.c(e10.l0()));
        e10.L0(q10, new b(q10, e10, eVar));
        return eVar.a();
    }

    private W4.d D0(final String str) {
        D1("getOrCreateReloadTask()");
        H1("getOrCreateReloadTask()", str);
        final e k02 = k0("Reload", "getOrCreateReloadTask()", str);
        if (this.f21986A == null) {
            this.f21986A = ((W4.d) this.f21998k.a()).k(new W4.a() { // from class: com.facebook.react.runtime.n
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d l12;
                    l12 = ReactHostImpl.this.l1(k02, str, dVar);
                    return l12;
                }
            }, this.f21993f).k(new W4.a() { // from class: com.facebook.react.runtime.o
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d m12;
                    m12 = ReactHostImpl.this.m1(k02, dVar);
                    return m12;
                }
            }, this.f21992e).k(new W4.a() { // from class: com.facebook.react.runtime.p
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d n12;
                    n12 = ReactHostImpl.this.n1(k02, dVar);
                    return n12;
                }
            }, this.f21993f).k(new W4.a() { // from class: com.facebook.react.runtime.q
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d o12;
                    o12 = ReactHostImpl.this.o1(k02, dVar);
                    return o12;
                }
            }, this.f21993f).k(new W4.a() { // from class: com.facebook.react.runtime.r
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d p12;
                    p12 = ReactHostImpl.this.p1(k02, dVar);
                    return p12;
                }
            }, this.f21992e).k(new W4.a() { // from class: com.facebook.react.runtime.t
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d q12;
                    q12 = ReactHostImpl.this.q1(k02, dVar);
                    return q12;
                }
            }, this.f21992e).k(new W4.a() { // from class: com.facebook.react.runtime.u
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d r12;
                    r12 = ReactHostImpl.this.r1(str, dVar);
                    return r12;
                }
            }, this.f21992e);
        }
        return this.f21986A;
    }

    private void D1(String str) {
        this.f22003p.a("ReactHost{" + this.f22005r + "}." + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public W4.d E0() {
        if (this.f22013z == null) {
            E1("getOrCreateStartTask()", "Schedule");
            this.f22013z = Q1().k(new W4.a() { // from class: com.facebook.react.runtime.k
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d t12;
                    t12 = ReactHostImpl.this.t1(dVar);
                    return t12;
                }
            }, this.f21992e);
        }
        return this.f22013z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1(String str, String str2) {
        this.f22003p.a("ReactHost{" + this.f22005r + "}." + str + ": " + str2);
    }

    private void F1(ReactContext reactContext) {
        this.f22004q.b(reactContext);
        K1(null);
    }

    private void H1(String str, String str2) {
        I1(str, str2, null);
    }

    private void I1(String str, String str2, Throwable th) {
        String str3 = "raiseSoftException(" + str + ")";
        E1(str3, str2);
        ReactSoftExceptionLogger.logSoftException("ReactHost", new ReactNoCrashSoftException(str3 + ": " + str2, th));
    }

    private void K1(Activity activity) {
        this.f22001n.set(activity);
        if (activity != null) {
            this.f22002o.set(new WeakReference(activity));
        }
    }

    private W4.d L0() {
        D1("isMetroRunning()");
        final W4.e eVar = new W4.e();
        i().x(new C4.g() { // from class: com.facebook.react.runtime.P
            @Override // C4.g
            public final void a(boolean z10) {
                ReactHostImpl.this.u1(eVar, z10);
            }
        });
        return eVar.a();
    }

    private void L1(String str, ReactInstance reactInstance) {
        E1(str, "Restarting previously running React Native Surfaces");
        synchronized (this.f21994g) {
            try {
                Iterator it = this.f21994g.iterator();
                while (it.hasNext()) {
                    reactInstance.C((j0) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object N0(String str, d dVar, W4.d dVar2) {
        ReactInstance reactInstance = G4.a.a() ? (ReactInstance) dVar2.o() : this.f21999l;
        if (reactInstance == null) {
            H1(str, "Execute: reactInstance is null. Dropping work.");
            return null;
        }
        dVar.a(reactInstance);
        return null;
    }

    private void N1(String str, ReactInstance reactInstance) {
        E1(str, "Stopping all React Native surfaces");
        synchronized (this.f21994g) {
            try {
                for (j0 j0Var : this.f21994g) {
                    reactInstance.D(j0Var);
                    j0Var.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void O0(W4.d dVar) {
        if (!dVar.s()) {
            return null;
        }
        I0(dVar.n());
        return null;
    }

    private void P1(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.f22011x;
                AbstractC4012a.b(reactHostInspectorTarget != null && reactHostInspectorTarget.isValid(), "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Q0(String str, d dVar, W4.d dVar2) {
        ReactInstance reactInstance = G4.a.a() ? (ReactInstance) dVar2.o() : this.f21999l;
        if (reactInstance == null) {
            H1(str, "Execute: reactInstance is null. Dropping work.");
            return Boolean.FALSE;
        }
        dVar.a(reactInstance);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public W4.d Q1() {
        return R1(0, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R0(WeakReference weakReference, int i10) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.r(i10);
        }
    }

    private W4.d R1(final int i10, final int i11) {
        if (this.f21986A != null) {
            E1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return this.f21986A;
        }
        if (this.f21987B != null) {
            if (i10 < i11) {
                E1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + i10 + ").");
                return this.f21987B.v(new W4.a() { // from class: com.facebook.react.runtime.m
                    @Override // W4.a
                    public final Object a(W4.d dVar) {
                        W4.d B12;
                        B12 = ReactHostImpl.this.B1(i10, i11, dVar);
                        return B12;
                    }
                }, this.f21992e);
            }
            H1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.");
        }
        return C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(final WeakReference weakReference, final int i10) {
        this.f21992e.execute(new Runnable() { // from class: com.facebook.react.runtime.S
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.R0(weakReference, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance T0(String str, String str2, String str3, W4.d dVar, String str4) {
        ReactInstance reactInstance = (ReactInstance) dVar.o();
        ReactInstance reactInstance2 = this.f21999l;
        String str5 = "Stage: " + str4;
        String str6 = str + " reason: " + str2;
        if (dVar.s()) {
            H1(str3, str + ": ReactInstance task faulted. " + str5 + ". " + ("Fault reason: " + dVar.n().getMessage()) + ". " + str6);
            return reactInstance2;
        }
        if (dVar.q()) {
            H1(str3, str + ": ReactInstance task cancelled. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance == null) {
            H1(str3, str + ": ReactInstance task returned null. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance2 != null && reactInstance != reactInstance2) {
            H1(str3, str + ": Detected two different ReactInstances. Returning old. " + str5 + ". " + str6);
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d U0(String str, Exception exc, W4.d dVar) {
        return y0(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d V0(final String str, final Exception exc) {
        if (this.f21986A == null) {
            return y0(str, exc);
        }
        E1("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return this.f21986A.k(new W4.a() { // from class: com.facebook.react.runtime.Z
            @Override // W4.a
            public final Object a(W4.d dVar) {
                W4.d U02;
                U02 = ReactHostImpl.this.U0(str, exc, dVar);
                return U02;
            }
        }, this.f21992e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0() {
        UiThreadUtil.assertOnUiThread();
        O4.b bVar = this.f22008u;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d X0(W4.d dVar) {
        return ((Boolean) dVar.o()).booleanValue() ? C1() : W4.d.m(this.f21989b.getJsBundleLoader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ JSBundleLoader Y0() {
        return this.f21989b.getJsBundleLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d Z0(e eVar, String str, W4.d dVar) {
        ReactHostInspectorTarget reactHostInspectorTarget;
        E1("getOrCreateDestroyTask()", "Starting React Native destruction");
        ReactInstance a10 = eVar.a(dVar, "1: Starting destroy");
        P1(a10);
        if (this.f22012y && (reactHostInspectorTarget = this.f22011x) != null) {
            reactHostInspectorTarget.close();
            this.f22011x = null;
        }
        if (this.f21997j) {
            E1("getOrCreateDestroyTask()", "DevSupportManager cleanup");
            this.f21991d.m();
        }
        ReactContext reactContext = (ReactContext) this.f22000m.b();
        if (reactContext == null) {
            H1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        E1("getOrCreateDestroyTask()", "Move ReactHost to onHostDestroy()");
        this.f22004q.b(reactContext);
        return W4.d.m(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d a1(e eVar, W4.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "2: Stopping surfaces");
        if (a10 == null) {
            H1("getOrCreateDestroyTask()", "Skipping surface shutdown: ReactInstance null");
            return dVar;
        }
        N1("getOrCreateDestroyTask()", a10);
        synchronized (this.f21994g) {
            this.f21994g.clear();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d b1(e eVar, W4.d dVar) {
        HashSet hashSet;
        eVar.a(dVar, "3: Executing Before Destroy Listeners");
        synchronized (this.f22010w) {
            hashSet = new HashSet(this.f22010w);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d c1(e eVar, String str, W4.d dVar) {
        eVar.a(dVar, "4: Destroying ReactContext");
        ReactContext reactContext = (ReactContext) this.f22000m.b();
        if (reactContext == null) {
            H1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        E1("getOrCreateDestroyTask()", "Destroying MemoryPressureRouter");
        this.f21995h.b(this.f21988a);
        if (reactContext != null) {
            E1("getOrCreateDestroyTask()", "Resetting ReactContext ref");
            this.f22000m.d();
            E1("getOrCreateDestroyTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        K1(null);
        l5.c.d().c();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d d1(e eVar, W4.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "5: Destroying ReactInstance");
        if (a10 == null) {
            H1("getOrCreateDestroyTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            E1("getOrCreateDestroyTask()", "Resetting ReactInstance ptr");
            this.f21999l = null;
            E1("getOrCreateDestroyTask()", "Destroying ReactInstance");
            a10.j();
        }
        E1("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
        this.f21998k.d();
        E1("getOrCreateDestroyTask()", "Resetting start task ref");
        this.f22013z = null;
        E1("getOrCreateDestroyTask()", "Resetting destroy task ref");
        this.f21987B = null;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void e1(String str, W4.d dVar) {
        if (dVar.s()) {
            I1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task faulted. Fault reason: " + dVar.n().getMessage() + ". Destroy reason: " + str, dVar.n());
        }
        if (!dVar.q()) {
            return null;
        }
        H1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1905c f1() {
        E1("getOrCreateReactContext()", "Creating BridgelessReactContext");
        return new C1905c(this.f21988a, this);
    }

    private W4.d g0(String str, final d dVar, Executor executor) {
        final String str2 = "callAfterGetOrCreateReactInstance(" + str + ")";
        if (executor == null) {
            executor = p0();
        }
        return B0().u(new W4.a() { // from class: com.facebook.react.runtime.X
            @Override // W4.a
            public final Object a(W4.d dVar2) {
                Object N02;
                N02 = ReactHostImpl.this.N0(str2, dVar, dVar2);
                return N02;
            }
        }, executor).h(new W4.a() { // from class: com.facebook.react.runtime.Y
            @Override // W4.a
            public final Object a(W4.d dVar2) {
                Void O02;
                O02 = ReactHostImpl.this.O0(dVar2);
                return O02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g1() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    private Map<String, String> getHostMetadata() {
        return S4.a.e(this.f21988a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c h1(W4.d dVar) {
        JSBundleLoader jSBundleLoader = (JSBundleLoader) dVar.o();
        C1905c z02 = z0();
        C4.e i10 = i();
        z02.setJSExceptionHandler(i10);
        E1("getOrCreateReactInstanceTask()", "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(z02, this.f21989b, this.f21990c, i10, new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.K
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                ReactHostImpl.this.I0(exc);
            }
        }, this.f21997j, A0());
        this.f21999l = reactInstance;
        MemoryPressureListener j02 = j0(reactInstance);
        this.f22007t = j02;
        this.f21995h.a(j02);
        reactInstance.t();
        E1("getOrCreateReactInstanceTask()", "Loading JS Bundle");
        reactInstance.z(jSBundleLoader);
        E1("getOrCreateReactInstanceTask()", "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
        i10.p(z02);
        z02.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.L
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.g1();
            }
        });
        return new c(reactInstance, z02, this.f21986A != null);
    }

    private W4.d i0(String str, final d dVar, Executor executor) {
        final String str2 = "callWithExistingReactInstance(" + str + ")";
        if (executor == null) {
            executor = p0();
        }
        return ((W4.d) this.f21998k.a()).u(new W4.a() { // from class: com.facebook.react.runtime.a0
            @Override // W4.a
            public final Object a(W4.d dVar2) {
                Boolean Q02;
                Q02 = ReactHostImpl.this.Q0(str2, dVar, dVar2);
                return Q02;
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance i1(W4.d dVar) {
        com.facebook.react.B[] bArr;
        ReactInstance reactInstance = ((c) dVar.o()).f22019a;
        ReactContext reactContext = ((c) dVar.o()).f22020b;
        boolean z10 = ((c) dVar.o()).f22021c;
        boolean z11 = this.f22004q.a() == LifecycleState.RESUMED;
        if (!z10 || z11) {
            this.f22004q.e(reactContext, n0());
        } else {
            this.f22004q.d(reactContext, n0());
        }
        E1("getOrCreateReactInstanceTask()", "Executing ReactInstanceEventListeners");
        synchronized (this.f22009v) {
            bArr = (com.facebook.react.B[]) this.f22009v.toArray(new com.facebook.react.B[0]);
        }
        for (com.facebook.react.B b10 : bArr) {
            if (b10 != null) {
                b10.a(reactContext);
            }
        }
        return reactInstance;
    }

    private MemoryPressureListener j0(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.N
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i10) {
                ReactHostImpl.this.S0(weakReference, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ReactInstance j1(W4.d dVar) {
        return ((c) dVar.o()).f22019a;
    }

    private e k0(final String str, final String str2, final String str3) {
        return new e() { // from class: com.facebook.react.runtime.C
            @Override // com.facebook.react.runtime.ReactHostImpl.e
            public final ReactInstance a(W4.d dVar, String str4) {
                ReactInstance T02;
                T02 = ReactHostImpl.this.T0(str, str3, str2, dVar, str4);
                return T02;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d k1() {
        E1("getOrCreateReactInstanceTask()", "Start");
        AbstractC4012a.b(!this.f22012y, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        W4.d u10 = t0().u(new W4.a() { // from class: com.facebook.react.runtime.F
            @Override // W4.a
            public final Object a(W4.d dVar) {
                ReactHostImpl.c h12;
                h12 = ReactHostImpl.this.h1(dVar);
                return h12;
            }
        }, this.f21992e);
        W4.a aVar = new W4.a() { // from class: com.facebook.react.runtime.G
            @Override // W4.a
            public final Object a(W4.d dVar) {
                ReactInstance i12;
                i12 = ReactHostImpl.this.i1(dVar);
                return i12;
            }
        };
        if (!G4.a.a()) {
            return u10.u(aVar, this.f21993f);
        }
        u10.u(aVar, this.f21993f);
        return u10.u(new W4.a() { // from class: com.facebook.react.runtime.H
            @Override // W4.a
            public final Object a(W4.d dVar) {
                ReactInstance j12;
                j12 = ReactHostImpl.j1(dVar);
                return j12;
            }
        }, W4.d.f11359i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d l1(e eVar, String str, W4.d dVar) {
        E1("getOrCreateReloadTask()", "Starting React Native reload");
        ReactInstance a10 = eVar.a(dVar, "1: Starting reload");
        P1(a10);
        ReactContext reactContext = (ReactContext) this.f22000m.b();
        if (reactContext == null) {
            H1("getOrCreateReloadTask()", "ReactContext is null. Reload reason: " + str);
        }
        if (reactContext != null && this.f22004q.a() == LifecycleState.RESUMED) {
            E1("getOrCreateReloadTask()", "Calling ReactContext.onHostPause()");
            reactContext.onHostPause();
        }
        return W4.d.m(a10);
    }

    private void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        B4.a.a(str, inspectorNetworkRequestListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d m1(e eVar, W4.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "2: Surface shutdown");
        if (a10 == null) {
            H1("getOrCreateReloadTask()", "Skipping surface shutdown: ReactInstance null");
            return dVar;
        }
        N1("getOrCreateReloadTask()", a10);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d n1(e eVar, W4.d dVar) {
        int i10;
        Function0[] function0Arr;
        eVar.a(dVar, "3: Executing Before Destroy Listeners");
        synchronized (this.f22010w) {
            function0Arr = (Function0[]) this.f22010w.toArray(new Function0[0]);
        }
        for (Function0 function0 : function0Arr) {
            function0.invoke();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d o1(e eVar, W4.d dVar) {
        eVar.a(dVar, "4: Destroying ReactContext");
        if (this.f22007t != null) {
            E1("getOrCreateReloadTask()", "Removing memory pressure listener");
            this.f21995h.d(this.f22007t);
        }
        ReactContext reactContext = (ReactContext) this.f22000m.b();
        if (reactContext != null) {
            E1("getOrCreateReloadTask()", "Resetting ReactContext ref");
            this.f22000m.d();
            E1("getOrCreateReloadTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        if (this.f21997j && reactContext != null) {
            E1("getOrCreateReloadTask()", "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            this.f21991d.D(reactContext);
        }
        return dVar;
    }

    private Executor p0() {
        return G4.a.q() ? W4.d.f11359i : this.f21992e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d p1(e eVar, W4.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "5: Destroying ReactInstance");
        if (a10 == null) {
            H1("getOrCreateReloadTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            E1("getOrCreateReloadTask()", "Resetting ReactInstance ptr");
            this.f21999l = null;
            E1("getOrCreateReloadTask()", "Destroying ReactInstance");
            a10.j();
        }
        E1("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
        this.f21998k.d();
        E1("getOrCreateReloadTask()", "Resetting start task ref");
        this.f22013z = null;
        return C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d q1(e eVar, W4.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "6: Restarting surfaces");
        if (a10 == null) {
            H1("getOrCreateReloadTask()", "Skipping surface restart: ReactInstance null");
            return dVar;
        }
        L1("getOrCreateReloadTask()", a10);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d r1(String str, W4.d dVar) {
        if (dVar.s()) {
            I1("getOrCreateReloadTask()", "Error during reload. ReactInstance task faulted. Fault reason: " + dVar.n().getMessage() + ". Reload reason: " + str, dVar.n());
        }
        if (dVar.q()) {
            H1("getOrCreateReloadTask()", "Error during reload. ReactInstance task cancelled. Reload reason: " + str);
        }
        E1("getOrCreateReloadTask()", "Resetting reload task ref");
        this.f21986A = null;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ W4.d s1(W4.d dVar, W4.d dVar2) {
        return W4.d.l(dVar.n());
    }

    private void setPausedInDebuggerMessage(String str) {
        if (str == null) {
            this.f21991d.h();
        } else {
            this.f21991d.j(str, new a());
        }
    }

    private W4.d t0() {
        D1("getJSBundleLoader()");
        if (this.f21997j && this.f21996i) {
            return L0().v(new W4.a() { // from class: com.facebook.react.runtime.I
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d X02;
                    X02 = ReactHostImpl.this.X0(dVar);
                    return X02;
                }
            }, this.f21992e);
        }
        if (C5109a.f44775b) {
            AbstractC1721a.b("ReactHost", "Packager server access is disabled in this environment");
        }
        return W4.d.c(new Callable() { // from class: com.facebook.react.runtime.J
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSBundleLoader Y02;
                Y02 = ReactHostImpl.this.Y0();
                return Y02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d t1(final W4.d dVar) {
        if (!dVar.s()) {
            return dVar.t();
        }
        Exception n10 = dVar.n();
        if (this.f21997j) {
            this.f21991d.handleException(n10);
        } else {
            this.f21989b.d(n10);
        }
        return y0("getOrCreateStartTask() failure: " + dVar.n().getMessage(), dVar.n()).j(new W4.a() { // from class: com.facebook.react.runtime.B
            @Override // W4.a
            public final Object a(W4.d dVar2) {
                W4.d s12;
                s12 = ReactHostImpl.s1(W4.d.this, dVar2);
                return s12;
            }
        }).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(W4.e eVar, boolean z10) {
        E1("isMetroRunning()", "Async result = " + z10);
        eVar.d(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(String str, int i10, String str2, Callback callback, ReactInstance reactInstance) {
        E1(str, "Execute");
        reactInstance.B(i10, str2);
        ((Callback) AbstractC4012a.c(callback)).invoke(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d w1(String str, W4.d dVar) {
        return D0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d x1(W4.d dVar) {
        if (!dVar.s()) {
            return dVar;
        }
        Exception n10 = dVar.n();
        if (this.f21997j) {
            this.f21991d.handleException(n10);
        } else {
            this.f21989b.d(n10);
        }
        return y0("Reload failed", n10);
    }

    private W4.d y0(final String str, Exception exc) {
        D1("getOrCreateDestroyTask()");
        I1("getOrCreateDestroyTask()", str, exc);
        final e k02 = k0("Destroy", "getOrCreateDestroyTask()", str);
        if (this.f21987B == null) {
            this.f21987B = ((W4.d) this.f21998k.a()).k(new W4.a() { // from class: com.facebook.react.runtime.v
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d Z02;
                    Z02 = ReactHostImpl.this.Z0(k02, str, dVar);
                    return Z02;
                }
            }, this.f21993f).k(new W4.a() { // from class: com.facebook.react.runtime.w
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d a12;
                    a12 = ReactHostImpl.this.a1(k02, dVar);
                    return a12;
                }
            }, this.f21992e).k(new W4.a() { // from class: com.facebook.react.runtime.x
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d b12;
                    b12 = ReactHostImpl.this.b1(k02, dVar);
                    return b12;
                }
            }, this.f21993f).k(new W4.a() { // from class: com.facebook.react.runtime.y
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d c12;
                    c12 = ReactHostImpl.this.c1(k02, str, dVar);
                    return c12;
                }
            }, this.f21993f).k(new W4.a() { // from class: com.facebook.react.runtime.z
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d d12;
                    d12 = ReactHostImpl.this.d1(k02, dVar);
                    return d12;
                }
            }, this.f21992e).h(new W4.a() { // from class: com.facebook.react.runtime.A
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    Void e12;
                    e12 = ReactHostImpl.this.e1(str, dVar);
                    return e12;
                }
            });
        }
        return this.f21987B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ W4.d y1(final String str) {
        W4.d t10;
        if (this.f21987B != null) {
            E1("reload()", "Waiting for destroy to finish, before reloading React Native.");
            t10 = this.f21987B.k(new W4.a() { // from class: com.facebook.react.runtime.i
                @Override // W4.a
                public final Object a(W4.d dVar) {
                    W4.d w12;
                    w12 = ReactHostImpl.this.w1(str, dVar);
                    return w12;
                }
            }, this.f21992e).t();
        } else {
            t10 = D0(str).t();
        }
        return t10.k(new W4.a() { // from class: com.facebook.react.runtime.j
            @Override // W4.a
            public final Object a(W4.d dVar) {
                W4.d x12;
                x12 = ReactHostImpl.this.x1(dVar);
                return x12;
            }
        }, this.f21992e);
    }

    private C1905c z0() {
        return (C1905c) this.f22000m.c(new C1903a.InterfaceC0381a() { // from class: com.facebook.react.runtime.M
            @Override // com.facebook.react.runtime.C1903a.InterfaceC0381a
            public final Object get() {
                C1905c f12;
                f12 = ReactHostImpl.this.f1();
                return f12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(String str, j0 j0Var, ReactInstance reactInstance) {
        E1(str, "Execute");
        reactInstance.C(j0Var);
    }

    public ReactQueueConfiguration F0() {
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance != null) {
            return reactInstance.p();
        }
        return null;
    }

    RuntimeExecutor G0() {
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        H1("getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready");
        return null;
    }

    public void G1(Activity activity) {
        D1("onHostResume(activity)");
        K1(activity);
        this.f22004q.d(k(), n0());
    }

    FabricUIManager H0() {
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance == null) {
            return null;
        }
        return reactInstance.q();
    }

    void I0(Exception exc) {
        String str = "handleHostException(message = \"" + exc.getMessage() + "\")";
        D1(str);
        if (this.f21997j) {
            this.f21991d.handleException(exc);
        } else {
            this.f21989b.d(exc);
        }
        l0(str, exc);
    }

    boolean J0(Class cls) {
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance != null) {
            return reactInstance.s(cls);
        }
        return false;
    }

    W4.d J1(final int i10, final String str, final Callback callback) {
        final String str2 = "registerSegment(segmentId = \"" + i10 + "\", path = \"" + str + "\")";
        E1(str2, "Schedule");
        return i0(str2, new d() { // from class: com.facebook.react.runtime.T
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                ReactHostImpl.this.v1(str2, i10, str, callback, reactInstance);
            }
        }, null);
    }

    boolean K0() {
        return this.f21999l != null;
    }

    boolean M0(String str) {
        synchronized (this.f21994g) {
            try {
                Iterator it = this.f21994g.iterator();
                while (it.hasNext()) {
                    if (((j0) it.next()).j().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    D4.a M1(final j0 j0Var) {
        final String str = "startSurface(surfaceId = " + j0Var.n() + ")";
        E1(str, "Schedule");
        f0(j0Var);
        return g0(str, new d() { // from class: com.facebook.react.runtime.D
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                ReactHostImpl.this.z1(str, j0Var, reactInstance);
            }
        }, this.f21992e);
    }

    D4.a O1(final j0 j0Var) {
        final String str = "stopSurface(surfaceId = " + j0Var.n() + ")";
        E1(str, "Schedule");
        m0(j0Var);
        return i0(str, new d() { // from class: com.facebook.react.runtime.O
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                ReactHostImpl.this.A1(str, j0Var, reactInstance);
            }
        }, this.f21992e).t();
    }

    @Override // com.facebook.react.A
    public boolean a() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.m(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.A
    public E4.a b(Context context, String str, Bundle bundle) {
        j0 j0Var = new j0(context, str, bundle);
        k0 k0Var = new k0(context, j0Var);
        k0Var.setShouldLogContentAppeared(true);
        j0Var.d(k0Var);
        j0Var.c(this);
        return j0Var;
    }

    @Override // com.facebook.react.A
    public void c(Context context) {
        AppearanceModule appearanceModule;
        ReactContext k10 = k();
        if (k10 == null || (appearanceModule = (AppearanceModule) k10.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    @Override // com.facebook.react.A
    public void d(Activity activity) {
        D1("onHostPause(activity)");
        ReactContext k10 = k();
        Activity n02 = n0();
        if (n02 != null) {
            String simpleName = n02.getClass().getSimpleName();
            String simpleName2 = activity == null ? "null" : activity.getClass().getSimpleName();
            AbstractC4012a.b(activity == n02, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + simpleName2);
        }
        this.f22008u = null;
        this.f22004q.c(k10, n02);
    }

    @Override // com.facebook.react.A
    public void e(com.facebook.react.B b10) {
        synchronized (this.f22009v) {
            this.f22009v.remove(b10);
        }
    }

    @Override // com.facebook.react.A
    public void f(Activity activity) {
        D1("onHostDestroy(activity)");
        if (n0() == activity) {
            F1(k());
        }
    }

    void f0(j0 j0Var) {
        D1("attachSurface(surfaceId = " + j0Var.n() + ")");
        synchronized (this.f21994g) {
            this.f21994g.add(j0Var);
        }
    }

    @Override // com.facebook.react.A
    public D4.a g(final String str) {
        return W4.d.d(new Callable() { // from class: com.facebook.react.runtime.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                W4.d y12;
                y12 = ReactHostImpl.this.y1(str);
                return y12;
            }
        }, this.f21992e).j(new C1920s());
    }

    @Override // com.facebook.react.A
    public void h(Activity activity, O4.b bVar) {
        this.f22008u = bVar;
        G1(activity);
    }

    W4.d h0(final String str, final String str2, final NativeArray nativeArray) {
        return i0("callFunctionOnModule(\"" + str + "\", \"" + str2 + "\")", new d() { // from class: com.facebook.react.runtime.U
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                reactInstance.callFunctionOnModule(str, str2, nativeArray);
            }
        }, null);
    }

    @Override // com.facebook.react.A
    public C4.e i() {
        return (C4.e) AbstractC4012a.c(this.f21991d);
    }

    @Override // com.facebook.react.A
    public void j(Activity activity) {
        D1("onUserLeaveHint(activity)");
        ReactContext k10 = k();
        if (k10 != null) {
            k10.onUserLeaveHint(activity);
        }
    }

    @Override // com.facebook.react.A
    public ReactContext k() {
        return (ReactContext) this.f22000m.b();
    }

    @Override // com.facebook.react.A
    public void l(com.facebook.react.B b10) {
        synchronized (this.f22009v) {
            this.f22009v.add(b10);
        }
    }

    public D4.a l0(final String str, final Exception exc) {
        return W4.d.d(new Callable() { // from class: com.facebook.react.runtime.V
            @Override // java.util.concurrent.Callable
            public final Object call() {
                W4.d V02;
                V02 = ReactHostImpl.this.V0(str, exc);
                return V02;
            }
        }, this.f21992e).j(new C1920s());
    }

    void m0(j0 j0Var) {
        D1("detachSurface(surfaceId = " + j0Var.n() + ")");
        synchronized (this.f21994g) {
            this.f21994g.remove(j0Var);
        }
    }

    Activity n0() {
        return (Activity) this.f22001n.get();
    }

    O4.b o0() {
        return new O4.b() { // from class: com.facebook.react.runtime.Q
            @Override // O4.b
            public final void b() {
                ReactHostImpl.this.W0();
            }
        };
    }

    @Override // com.facebook.react.A
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + i10 + "\", resultCode = \"" + i11 + "\", data = \"" + intent + "\")";
        ReactContext k10 = k();
        if (k10 != null) {
            k10.onActivityResult(activity, i10, i11, intent);
        } else {
            H1(str, "Tried to access onActivityResult while context is not ready");
        }
    }

    @Override // com.facebook.react.A
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        String str = "onNewIntent(intent = \"" + intent + "\")";
        ReactContext k10 = k();
        if (k10 == null) {
            H1(str, "Tried to access onNewIntent while context is not ready");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) k10.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        k10.onNewIntent(n0(), intent);
    }

    @Override // com.facebook.react.A
    public void onWindowFocusChange(boolean z10) {
        String str = "onWindowFocusChange(hasFocus = \"" + z10 + "\")";
        ReactContext k10 = k();
        if (k10 != null) {
            k10.onWindowFocusChange(z10);
        } else {
            H1(str, "Tried to access onWindowFocusChange while context is not ready");
        }
    }

    EventDispatcher q0() {
        ReactInstance reactInstance = this.f21999l;
        return reactInstance == null ? com.facebook.react.uimanager.events.b.l() : reactInstance.k();
    }

    CallInvokerHolder r0() {
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        H1("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready");
        return null;
    }

    JavaScriptContextHolder s0() {
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance != null) {
            return reactInstance.l();
        }
        return null;
    }

    @Override // com.facebook.react.A
    public D4.a start() {
        return W4.d.d(new Callable() { // from class: com.facebook.react.runtime.W
            @Override // java.util.concurrent.Callable
            public final Object call() {
                W4.d E02;
                E02 = ReactHostImpl.this.E0();
                return E02;
            }
        }, this.f21992e).j(new C1920s());
    }

    Activity u0() {
        WeakReference weakReference = (WeakReference) this.f22002o.get();
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    NativeModule v0(Class cls) {
        if (cls == UIManagerModule.class) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose("ReactHost", new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance != null) {
            return reactInstance.m(cls);
        }
        return null;
    }

    NativeModule w0(String str) {
        ReactInstance reactInstance = this.f21999l;
        if (reactInstance != null) {
            return reactInstance.n(str);
        }
        return null;
    }

    Collection x0() {
        ReactInstance reactInstance = this.f21999l;
        return reactInstance != null ? reactInstance.o() : new ArrayList();
    }

    public ReactHostImpl(Context context, InterfaceC1909g interfaceC1909g, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z10, boolean z11) {
        this.f21994g = new HashSet();
        this.f21998k = new C1903a(W4.d.m(null));
        this.f22000m = new C1903a();
        this.f22001n = new AtomicReference();
        this.f22002o = new AtomicReference(new WeakReference(null));
        C1906d c1906d = new C1906d(C5109a.f44775b);
        this.f22003p = c1906d;
        this.f22004q = new h0(c1906d);
        this.f22005r = f21985C.getAndIncrement();
        this.f22006s = null;
        this.f22009v = new ArrayList();
        this.f22010w = new ArrayList();
        this.f22012y = false;
        this.f22013z = null;
        this.f21986A = null;
        this.f21987B = null;
        this.f21988a = context;
        this.f21989b = interfaceC1909g;
        this.f21990c = componentFactory;
        this.f21992e = executor;
        this.f21993f = executor2;
        this.f21995h = new ComponentCallbacks2C1895j(context);
        this.f21996i = z10;
        this.f21997j = z11;
        if (z11) {
            this.f21991d = new C1904b(this, context, interfaceC1909g.getJsMainModulePath());
        } else {
            this.f21991d = new com.facebook.react.devsupport.j0();
        }
    }
}
