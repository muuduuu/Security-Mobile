package pb;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.views.GroupViewManagerWrapper;
import expo.modules.kotlin.views.SimpleViewManagerWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC3901a;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final C3862a f38559a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38560a;

        static {
            int[] iArr = new int[expo.modules.kotlin.views.p.values().length];
            try {
                iArr[expo.modules.kotlin.views.p.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[expo.modules.kotlin.views.p.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38560a = iArr;
        }
    }

    public i(l modulesProvider, Ba.b legacyModuleRegistry, WeakReference reactContext) {
        Intrinsics.checkNotNullParameter(modulesProvider, "modulesProvider");
        Intrinsics.checkNotNullParameter(legacyModuleRegistry, "legacyModuleRegistry");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f38559a = new C3862a(modulesProvider, legacyModuleRegistry, reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k g() {
        return this.f38559a.p().h();
    }

    public final void b(String moduleName, String method, ReadableArray arguments, m promise) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            j t10 = g().t(moduleName);
            if (t10 != null) {
                Object[] array = arguments.toArrayList().toArray();
                Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
                t10.d(method, array, promise);
            } else {
                throw new IllegalArgumentException(("Trying to call '" + method + "' on the non-existing module '" + moduleName + "'").toString());
            }
        } catch (CodedException e10) {
            promise.h(e10);
        } catch (Throwable th) {
            promise.h(new UnexpectedException(th));
        }
    }

    public final void c() {
        this.f38559a.A();
    }

    public final List d() {
        BaseViewManager simpleViewManagerWrapper;
        AbstractC3901a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.exportViewManagers");
        try {
            k g10 = g();
            ArrayList<j> arrayList = new ArrayList();
            for (Object obj : g10) {
                if (((j) obj).e().h() != null) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
            for (j jVar : arrayList) {
                expo.modules.kotlin.views.q qVar = new expo.modules.kotlin.views.q(jVar);
                expo.modules.kotlin.views.o h10 = jVar.e().h();
                Intrinsics.d(h10);
                int i10 = a.f38560a[h10.i().ordinal()];
                if (i10 == 1) {
                    simpleViewManagerWrapper = new SimpleViewManagerWrapper(qVar);
                } else {
                    if (i10 != 2) {
                        throw new lc.m();
                    }
                    simpleViewManagerWrapper = new GroupViewManagerWrapper(qVar);
                }
                arrayList2.add(simpleViewManagerWrapper);
            }
            AbstractC3901a.f();
            return arrayList2;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public final List e(List viewManagers) {
        Intrinsics.checkNotNullParameter(viewManagers, "viewManagers");
        AbstractC3901a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.extractViewManagersDelegateHolders");
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : viewManagers) {
                if (obj instanceof expo.modules.kotlin.views.s) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            AbstractC3901a.f();
        }
    }

    public final C3862a f() {
        return this.f38559a;
    }

    public final boolean h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return g().w(name);
    }

    public final void i() {
        this.f38559a.y();
    }

    public final void j() {
        this.f38559a.B();
        AbstractC3864c.a().c("✅ KotlinInteropModuleRegistry was destroyed");
    }

    public final void k(NativeModulesProxy proxyModule) {
        Intrinsics.checkNotNullParameter(proxyModule, "proxyModule");
        this.f38559a.H(new WeakReference(proxyModule));
    }

    public final void l(List viewWrapperHolders) {
        Intrinsics.checkNotNullParameter(viewWrapperHolders, "viewWrapperHolders");
        AbstractC3901a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.updateModuleHoldersInViewManagers");
        try {
            List list = viewWrapperHolders;
            ArrayList<expo.modules.kotlin.views.q> arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((expo.modules.kotlin.views.s) it.next()).getViewWrapperDelegate());
            }
            for (expo.modules.kotlin.views.q qVar : arrayList) {
                j t10 = g().t(qVar.d().h());
                if (t10 == null) {
                    throw new IllegalArgumentException(("Cannot update the module holder for " + qVar.d().h() + ".").toString());
                }
                qVar.j(t10);
            }
            Unit unit = Unit.f36324a;
            AbstractC3901a.f();
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public final Map m() {
        List j10;
        AbstractC3901a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.viewManagersMetadata");
        try {
            k g10 = g();
            ArrayList<j> arrayList = new ArrayList();
            for (Object obj : g10) {
                if (((j) obj).e().h() != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(arrayList, 10)), 16));
            for (j jVar : arrayList) {
                String h10 = jVar.h();
                expo.modules.kotlin.views.o h11 = jVar.e().h();
                if (h11 == null || (j10 = h11.g()) == null) {
                    j10 = CollectionsKt.j();
                }
                Pair a10 = lc.t.a(h10, G.e(lc.t.a("propsNames", j10)));
                linkedHashMap.put(a10.c(), a10.d());
            }
            AbstractC3901a.f();
            return linkedHashMap;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
