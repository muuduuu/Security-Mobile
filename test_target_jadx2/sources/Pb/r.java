package pb;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC3901a;
import ub.C4878a;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f38582a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f38583b;

    /* renamed from: c, reason: collision with root package name */
    private final k f38584c;

    /* renamed from: d, reason: collision with root package name */
    public JSIContext f38585d;

    /* renamed from: e, reason: collision with root package name */
    private final j f38586e;

    /* renamed from: f, reason: collision with root package name */
    private final JNIDeallocator f38587f;

    /* renamed from: g, reason: collision with root package name */
    private final Bb.c f38588g;

    /* renamed from: h, reason: collision with root package name */
    private final Bb.a f38589h;

    public r(C3862a appContext, WeakReference reactContextHolder) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(reactContextHolder, "reactContextHolder");
        this.f38582a = reactContextHolder;
        this.f38583b = t.a(appContext);
        this.f38584c = new k(t.a(this));
        C4878a c4878a = new C4878a();
        c4878a.h(this);
        this.f38586e = new j(c4878a);
        this.f38587f = new JNIDeallocator(false, 1, null);
        this.f38588g = new Bb.c(this);
        this.f38589h = new Bb.a();
    }

    private final boolean k() {
        return this.f38585d != null;
    }

    public final void a() {
        ((C4878a) this.f38586e.g()).h(null);
        this.f38587f.c();
    }

    public final C3862a b() {
        return (C3862a) this.f38583b.get();
    }

    public final Bb.a c() {
        return this.f38589h;
    }

    public final j d() {
        return this.f38586e;
    }

    public final JNIDeallocator e() {
        return this.f38587f;
    }

    public final JSIContext f() {
        JSIContext jSIContext = this.f38585d;
        if (jSIContext != null) {
            return jSIContext;
        }
        Intrinsics.v("jsiContext");
        return null;
    }

    public final WeakReference g() {
        return this.f38582a;
    }

    public final k h() {
        return this.f38584c;
    }

    public final Bb.c i() {
        return this.f38588g;
    }

    public final void j() {
        synchronized (this) {
            if (k()) {
                Ga.d.g(AbstractC3864c.a(), "⚠️ JSI interop was already installed", null, 2, null);
                return;
            }
            AbstractC3901a.c("[ExpoModulesCore] " + (this + ".installJSIContext"));
            try {
                l(new JSIContext());
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) g().get();
                if (reactApplicationContext != null) {
                    Intrinsics.d(reactApplicationContext);
                    JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
                    if (javaScriptContextHolder != null) {
                        Long valueOf = Long.valueOf(javaScriptContextHolder.get());
                        if (valueOf.longValue() == 0) {
                            valueOf = null;
                        }
                        if (valueOf == null) {
                            Ga.d.b(AbstractC3864c.a(), "❌ Cannot install JSI interop - JS runtime pointer is null", null, 2, null);
                        } else {
                            long longValue = valueOf.longValue();
                            if (reactApplicationContext.isBridgeless()) {
                                JSIContext f10 = f();
                                RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
                                Intrinsics.d(runtimeExecutor);
                                f10.d(this, longValue, runtimeExecutor);
                            } else {
                                JSIContext f11 = f();
                                CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
                                Intrinsics.e(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
                                f11.c(this, longValue, (CallInvokerHolderImpl) jSCallInvokerHolder);
                            }
                            AbstractC3864c.a().c("✅ JSI interop was installed");
                        }
                    }
                }
            } catch (Throwable th) {
                AbstractC3864c.a().a("❌ Cannot install JSI interop: " + th, th);
            } finally {
            }
            Unit unit = Unit.f36324a;
        }
    }

    public final void l(JSIContext jSIContext) {
        Intrinsics.checkNotNullParameter(jSIContext, "<set-?>");
        this.f38585d = jSIContext;
    }
}
