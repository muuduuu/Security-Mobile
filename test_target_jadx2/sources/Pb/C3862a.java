package pb;

import Jd.C0874b0;
import Jd.M;
import Jd.N;
import Jd.O;
import Jd.O0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.L0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import jb.InterfaceC3521a;
import kb.InterfaceC3557a;
import kb.InterfaceC3558b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC3618a;
import mb.InterfaceC3663a;
import q1.AbstractC3901a;
import rb.C4293a;
import ub.C4879b;
import ub.C4880c;
import vb.EnumC5010e;
import vb.InterfaceC5007b;
import xb.AbstractC5139a;
import zb.InterfaceC5271b;

/* renamed from: pb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3862a implements InterfaceC5271b {

    /* renamed from: a, reason: collision with root package name */
    private final Ba.b f38537a;

    /* renamed from: b, reason: collision with root package name */
    private final r f38538b;

    /* renamed from: c, reason: collision with root package name */
    private final p f38539c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38540d;

    /* renamed from: e, reason: collision with root package name */
    private final Kd.d f38541e;

    /* renamed from: f, reason: collision with root package name */
    private final N f38542f;

    /* renamed from: g, reason: collision with root package name */
    private final N f38543g;

    /* renamed from: h, reason: collision with root package name */
    private final N f38544h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f38545i;

    /* renamed from: j, reason: collision with root package name */
    private final C4293a f38546j;

    /* renamed from: k, reason: collision with root package name */
    private final rb.m f38547k;

    public C3862a(l modulesProvider, Ba.b legacyModuleRegistry, WeakReference reactContextHolder) {
        Intrinsics.checkNotNullParameter(modulesProvider, "modulesProvider");
        Intrinsics.checkNotNullParameter(legacyModuleRegistry, "legacyModuleRegistry");
        Intrinsics.checkNotNullParameter(reactContextHolder, "reactContextHolder");
        this.f38537a = legacyModuleRegistry;
        r rVar = new r(this, reactContextHolder);
        this.f38538b = rVar;
        p pVar = new p(this);
        this.f38539c = pVar;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        Kd.d c10 = Kd.e.c(new Handler(handlerThread.getLooper()), null, 1, null);
        this.f38541e = c10;
        this.f38542f = O.a(C0874b0.b().l(O0.b(null, 1, null)).l(new M("expo.modules.BackgroundCoroutineScope")));
        this.f38543g = O.a(c10.l(O0.b(null, 1, null)).l(new M("expo.modules.AsyncFunctionQueue")));
        this.f38544h = O.a(C0874b0.c().l(O0.b(null, 1, null)).l(new M("expo.modules.MainQueue")));
        C4293a c4293a = new C4293a(this);
        this.f38546j = c4293a;
        this.f38547k = new rb.m(c4293a);
        Object obj = reactContextHolder.get();
        if (obj == null) {
            throw new IllegalArgumentException("The app context should be created with valid react context.");
        }
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
        reactApplicationContext.addLifecycleEventListener(pVar);
        reactApplicationContext.addActivityEventListener(pVar);
        rVar.h().I(new C4879b());
        rVar.h().I(new C4880c());
        rVar.h().G(modulesProvider);
        AbstractC3864c.a().c("✅ AppContext was initialized");
    }

    private final InterfaceC3557a h() {
        Object obj;
        try {
            obj = r().b(InterfaceC3557a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (InterfaceC3557a) obj;
    }

    public final void A() {
        AbstractC3901a.c("[ExpoModulesCore] AppContext.onCreate");
        try {
            p().h().E();
            Unit unit = Unit.f36324a;
        } finally {
            AbstractC3901a.f();
        }
    }

    public final void B() {
        AbstractC3901a.c("[ExpoModulesCore] AppContext.onDestroy");
        try {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) p().g().get();
            if (reactApplicationContext != null) {
                reactApplicationContext.removeLifecycleEventListener(this.f38539c);
            }
            p().h().A(EnumC5010e.MODULE_DESTROY);
            p().h().j();
            O.c(u(), new Da.b(null, 1, null));
            O.c(t(), new Da.b(null, 1, null));
            O.c(i(), new Da.b(null, 1, null));
            p().a();
            AbstractC3864c.a().c("✅ AppContext was destroyed");
            Unit unit = Unit.f36324a;
            AbstractC3901a.f();
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public final void C() {
        Activity a10 = a();
        if (a10 != null) {
            if (!(a10 instanceof androidx.appcompat.app.d)) {
                Activity a11 = a();
                throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (a11 != null ? a11.getLocalClassName() : null)).toString());
            }
            this.f38546j.g((androidx.appcompat.app.d) a10);
        }
        this.f38538b.h().A(EnumC5010e.ACTIVITY_DESTROYS);
        this.f38540d = true;
    }

    public final void D() {
        this.f38538b.h().A(EnumC5010e.ACTIVITY_ENTERS_BACKGROUND);
    }

    public final void E() {
        Activity a10 = a();
        if (a10 == null) {
            return;
        }
        if (a10 instanceof androidx.appcompat.app.d) {
            if (this.f38540d) {
                this.f38540d = false;
                this.f38538b.h().J();
            }
            this.f38546j.h((androidx.appcompat.app.d) a10);
            this.f38538b.h().A(EnumC5010e.ACTIVITY_ENTERS_FOREGROUND);
            return;
        }
        Activity a11 = a();
        throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (a11 != null ? a11.getLocalClassName() : null)).toString());
    }

    public final void F(Intent intent) {
        this.f38538b.h().B(EnumC5010e.ON_NEW_INTENT, intent);
    }

    public final void G() {
        this.f38538b.h().A(EnumC5010e.ON_USER_LEAVES_ACTIVITY);
    }

    public final void H(WeakReference weakReference) {
        this.f38545i = weakReference;
    }

    @Override // zb.InterfaceC5271b
    public Activity a() {
        Activity a10;
        Ea.b f10 = f();
        if (f10 != null && (a10 = f10.a()) != null) {
            return a10;
        }
        Context w10 = w();
        ReactApplicationContext reactApplicationContext = w10 instanceof ReactApplicationContext ? (ReactApplicationContext) w10 : null;
        if (reactApplicationContext != null) {
            return reactApplicationContext.getCurrentActivity();
        }
        return null;
    }

    public final void c() {
        s sVar = s.f38590a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String name2 = Looper.getMainLooper().getThread().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        throw new expo.modules.kotlin.exception.f(name, name2);
    }

    public final InterfaceC5007b d(AbstractC5139a module) {
        Object obj;
        Intrinsics.checkNotNullParameter(module, "module");
        try {
            obj = r().b(Fa.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        Fa.a aVar = (Fa.a) obj;
        if (aVar == null) {
            return null;
        }
        j u10 = this.f38538b.h().u(module);
        if (u10 != null) {
            return new vb.h(u10, aVar, this.f38538b.g());
        }
        throw new IllegalArgumentException("Cannot create an event emitter for the module that isn't present in the module registry.");
    }

    public final View e(int i10) {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f38538b.g().get();
        if (reactApplicationContext == null) {
            return null;
        }
        UIManager i11 = L0.i(reactApplicationContext, i10);
        View resolveView = i11 != null ? i11.resolveView(i10) : null;
        if (resolveView != null) {
            return resolveView;
        }
        return null;
    }

    public final Ea.b f() {
        Object obj;
        try {
            obj = r().b(Ea.b.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (Ea.b) obj;
    }

    public final rb.m g() {
        return this.f38547k;
    }

    public final N i() {
        return this.f38542f;
    }

    public final File j() {
        File a10;
        InterfaceC3557a h10 = h();
        if (h10 == null || (a10 = h10.a()) == null) {
            throw new Da.e("expo.modules.interfaces.filesystem.AppDirectories");
        }
        return a10;
    }

    public final InterfaceC5007b k() {
        Object obj;
        try {
            obj = r().b(Fa.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        Fa.a aVar = (Fa.a) obj;
        if (aVar == null) {
            return null;
        }
        return new vb.g(aVar, this.f38538b.g());
    }

    public final InterfaceC3521a l() {
        Object obj;
        try {
            obj = r().b(InterfaceC3521a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (InterfaceC3521a) obj;
    }

    public final C4879b m() {
        Object obj;
        Iterator it = this.f38538b.h().v().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            AbstractC5139a g10 = ((j) obj).g();
            if (g10 != null ? g10 instanceof C4879b : true) {
                break;
            }
        }
        j jVar = (j) obj;
        AbstractC5139a g11 = jVar != null ? jVar.g() : null;
        return (C4879b) (g11 instanceof C4879b ? g11 : null);
    }

    public final InterfaceC3558b n() {
        Object obj;
        try {
            obj = r().b(InterfaceC3558b.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (InterfaceC3558b) obj;
    }

    public final boolean o() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f38538b.g().get();
        if (reactApplicationContext != null) {
            return reactApplicationContext.hasActiveReactInstance();
        }
        return false;
    }

    public final r p() {
        return this.f38538b;
    }

    public final InterfaceC3618a q() {
        Object obj;
        try {
            obj = r().b(InterfaceC3618a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (InterfaceC3618a) obj;
    }

    public final Ba.b r() {
        return this.f38537a;
    }

    public final WeakReference s() {
        return this.f38545i;
    }

    public final N t() {
        return this.f38544h;
    }

    public final N u() {
        return this.f38543g;
    }

    public final InterfaceC3663a v() {
        Object obj;
        try {
            obj = r().b(InterfaceC3663a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (InterfaceC3663a) obj;
    }

    public final Context w() {
        return (ReactApplicationContext) this.f38538b.g().get();
    }

    public final Activity x() {
        Activity currentActivity;
        Ea.b f10 = f();
        if (f10 == null || (currentActivity = f10.a()) == null) {
            Context w10 = w();
            ReactApplicationContext reactApplicationContext = w10 instanceof ReactApplicationContext ? (ReactApplicationContext) w10 : null;
            currentActivity = reactApplicationContext != null ? reactApplicationContext.getCurrentActivity() : null;
        }
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new expo.modules.kotlin.exception.g();
    }

    public final void y() {
        this.f38538b.j();
    }

    public final void z(Activity activity, int i10, int i11, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f38546j.f(i10, i11, intent);
        this.f38538b.h().D(EnumC5010e.ON_ACTIVITY_RESULT, activity, new vb.j(i10, i11, intent));
    }
}
