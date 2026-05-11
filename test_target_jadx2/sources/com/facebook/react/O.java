package com.facebook.react;

import android.app.Application;
import com.facebook.react.W;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import java.util.Iterator;
import java.util.List;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private final Application f21146a;

    /* renamed from: b, reason: collision with root package name */
    private J f21147b;

    class a implements v4.j {
        a() {
        }

        @Override // v4.j
        public v4.i d(String str) {
            return null;
        }
    }

    protected O(Application application) {
        this.f21146a = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UIManager h(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public boolean b() {
        return false;
    }

    public synchronized J c() {
        try {
            if (this.f21147b == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.f21147b = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21147b;
    }

    protected J createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        M baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return baseReactInstanceManagerBuilder.b();
    }

    public boolean d() {
        return true;
    }

    public v4.j e() {
        return new a();
    }

    public abstract boolean f();

    public synchronized boolean g() {
        return this.f21147b != null;
    }

    protected final Application getApplication() {
        return this.f21146a;
    }

    protected M getBaseReactInstanceManagerBuilder() {
        M p10 = J.v().d(this.f21146a).n(getJSMainModuleName()).w(f()).h(getDevSupportManagerFactory()).g(getDevLoadingViewManager()).t(d()).u(e()).m(getJSExceptionHandler()).p(b());
        getRedBoxHandler();
        M q10 = p10.s(null).o(getJavaScriptExecutorFactory()).v(getUIManagerProvider()).i(LifecycleState.BEFORE_CREATE).r(getReactPackageTurboModuleManagerDelegateBuilder()).l(getJSEngineResolutionAlgorithm()).f(getChoreographerProvider()).q(getPausedInDebuggerOverlayManager());
        Iterator<P> it = getPackages().iterator();
        while (it.hasNext()) {
            q10.a(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            q10.j(jSBundleFile);
        } else {
            q10.e((String) AbstractC4012a.c(getBundleAssetName()));
        }
        return q10;
    }

    protected String getBundleAssetName() {
        return "index.android.bundle";
    }

    protected F4.b getChoreographerProvider() {
        return null;
    }

    protected C4.c getDevLoadingViewManager() {
        return null;
    }

    protected com.facebook.react.devsupport.I getDevSupportManagerFactory() {
        return null;
    }

    protected String getJSBundleFile() {
        return null;
    }

    protected EnumC1894i getJSEngineResolutionAlgorithm() {
        return null;
    }

    protected JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    protected String getJSMainModuleName() {
        return "index.android";
    }

    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    protected abstract List<P> getPackages();

    protected C4.h getPausedInDebuggerOverlayManager() {
        return null;
    }

    protected W.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    protected C4.i getRedBoxHandler() {
        return null;
    }

    protected UIManagerProvider getUIManagerProvider() {
        return new UIManagerProvider() { // from class: com.facebook.react.N
            @Override // com.facebook.react.bridge.UIManagerProvider
            public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                UIManager h10;
                h10 = O.h(reactApplicationContext);
                return h10;
            }
        };
    }
}
