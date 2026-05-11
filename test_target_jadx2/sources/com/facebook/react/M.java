package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import c3.AbstractC1721a;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.W;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C1872h;
import com.facebook.react.jscexecutor.JSCExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public class M {

    /* renamed from: B, reason: collision with root package name */
    private static final String f21118B = "M";

    /* renamed from: b, reason: collision with root package name */
    private String f21121b;

    /* renamed from: c, reason: collision with root package name */
    private JSBundleLoader f21122c;

    /* renamed from: d, reason: collision with root package name */
    private String f21123d;

    /* renamed from: e, reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f21124e;

    /* renamed from: f, reason: collision with root package name */
    private Application f21125f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21126g;

    /* renamed from: h, reason: collision with root package name */
    private com.facebook.react.devsupport.I f21127h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21128i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21129j;

    /* renamed from: k, reason: collision with root package name */
    private LifecycleState f21130k;

    /* renamed from: l, reason: collision with root package name */
    private JSExceptionHandler f21131l;

    /* renamed from: m, reason: collision with root package name */
    private Activity f21132m;

    /* renamed from: n, reason: collision with root package name */
    private O4.b f21133n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21134o;

    /* renamed from: p, reason: collision with root package name */
    private C4.b f21135p;

    /* renamed from: q, reason: collision with root package name */
    private JavaScriptExecutorFactory f21136q;

    /* renamed from: t, reason: collision with root package name */
    private UIManagerProvider f21139t;

    /* renamed from: u, reason: collision with root package name */
    private Map f21140u;

    /* renamed from: v, reason: collision with root package name */
    private W.a f21141v;

    /* renamed from: w, reason: collision with root package name */
    private v4.j f21142w;

    /* renamed from: x, reason: collision with root package name */
    private C4.c f21143x;

    /* renamed from: a, reason: collision with root package name */
    private final List f21120a = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f21137r = 1;

    /* renamed from: s, reason: collision with root package name */
    private int f21138s = -1;

    /* renamed from: y, reason: collision with root package name */
    private EnumC1894i f21144y = null;

    /* renamed from: z, reason: collision with root package name */
    private F4.b f21145z = null;

    /* renamed from: A, reason: collision with root package name */
    private C4.h f21119A = null;

    M() {
    }

    private JavaScriptExecutorFactory c(String str, String str2, Context context) {
        J.K(context);
        EnumC1894i enumC1894i = this.f21144y;
        if (enumC1894i != null) {
            if (enumC1894i == EnumC1894i.HERMES) {
                HermesExecutor.a();
                return new com.facebook.hermes.reactexecutor.a();
            }
            JSCExecutor.b();
            return new I4.a(str, str2);
        }
        try {
            try {
                HermesExecutor.a();
                return new com.facebook.hermes.reactexecutor.a();
            } catch (UnsatisfiedLinkError unused) {
                JSCExecutor.b();
                return new I4.a(str, str2);
            }
        } catch (UnsatisfiedLinkError e10) {
            AbstractC1721a.m(f21118B, "Unable to load neither the Hermes nor the JSC native library. Your application is not built correctly and will fail to execute");
            if (e10.getMessage().contains("__cxa_bad_typeid")) {
                throw e10;
            }
            return null;
        }
    }

    public M a(P p10) {
        this.f21120a.add(p10);
        return this;
    }

    public J b() {
        String str;
        AbstractC4012a.d(this.f21125f, "Application property has not been set with this builder");
        if (this.f21130k == LifecycleState.RESUMED) {
            AbstractC4012a.d(this.f21132m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z10 = true;
        AbstractC4012a.b((!this.f21126g && this.f21121b == null && this.f21122c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f21123d == null && this.f21121b == null && this.f21122c == null) {
            z10 = false;
        }
        AbstractC4012a.b(z10, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = this.f21125f.getPackageName();
        String d10 = S4.a.d();
        Application application = this.f21125f;
        Activity activity = this.f21132m;
        O4.b bVar = this.f21133n;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f21136q;
        JavaScriptExecutorFactory c10 = javaScriptExecutorFactory == null ? c(packageName, d10, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader jSBundleLoader = this.f21122c;
        if (jSBundleLoader == null && (str = this.f21121b) != null) {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.f21125f, str, false);
        }
        JSBundleLoader jSBundleLoader2 = jSBundleLoader;
        String str2 = this.f21123d;
        List list = this.f21120a;
        boolean z11 = this.f21126g;
        com.facebook.react.devsupport.I i10 = this.f21127h;
        if (i10 == null) {
            i10 = new C1872h();
        }
        return new J(application, activity, bVar, c10, jSBundleLoader2, str2, list, z11, i10, this.f21128i, this.f21129j, this.f21124e, (LifecycleState) AbstractC4012a.d(this.f21130k, "Initial lifecycle state was not set"), this.f21131l, null, this.f21134o, this.f21135p, this.f21137r, this.f21138s, this.f21139t, this.f21140u, this.f21141v, this.f21142w, this.f21143x, this.f21145z, this.f21119A);
    }

    public M d(Application application) {
        this.f21125f = application;
        return this;
    }

    public M e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f21121b = str2;
        this.f21122c = null;
        return this;
    }

    public M f(F4.b bVar) {
        this.f21145z = bVar;
        return this;
    }

    public M g(C4.c cVar) {
        this.f21143x = cVar;
        return this;
    }

    public M h(com.facebook.react.devsupport.I i10) {
        this.f21127h = i10;
        return this;
    }

    public M i(LifecycleState lifecycleState) {
        this.f21130k = lifecycleState;
        return this;
    }

    public M j(String str) {
        if (!str.startsWith("assets://")) {
            return k(JSBundleLoader.createFileLoader(str));
        }
        this.f21121b = str;
        this.f21122c = null;
        return this;
    }

    public M k(JSBundleLoader jSBundleLoader) {
        this.f21122c = jSBundleLoader;
        this.f21121b = null;
        return this;
    }

    public M l(EnumC1894i enumC1894i) {
        this.f21144y = enumC1894i;
        return this;
    }

    public M m(JSExceptionHandler jSExceptionHandler) {
        this.f21131l = jSExceptionHandler;
        return this;
    }

    public M n(String str) {
        this.f21123d = str;
        return this;
    }

    public M o(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f21136q = javaScriptExecutorFactory;
        return this;
    }

    public M p(boolean z10) {
        this.f21134o = z10;
        return this;
    }

    public M q(C4.h hVar) {
        this.f21119A = hVar;
        return this;
    }

    public M r(W.a aVar) {
        this.f21141v = aVar;
        return this;
    }

    public M t(boolean z10) {
        this.f21128i = z10;
        return this;
    }

    public M u(v4.j jVar) {
        this.f21142w = jVar;
        return this;
    }

    public M v(UIManagerProvider uIManagerProvider) {
        this.f21139t = uIManagerProvider;
        return this;
    }

    public M w(boolean z10) {
        this.f21126g = z10;
        return this;
    }

    public M s(C4.i iVar) {
        return this;
    }
}
