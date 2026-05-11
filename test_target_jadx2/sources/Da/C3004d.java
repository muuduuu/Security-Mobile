package da;

import com.facebook.react.a0;
import com.facebook.react.b0;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import da.C3004d;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import lc.t;
import xc.m;

/* renamed from: da.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3004d extends a0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f31332a = i.a(a.f31333a);

    /* renamed from: da.d$a */
    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31333a = new a();

        a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NativeModule e() {
            return new RNGestureHandlerRootViewManager();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NativeModule f() {
            return new RNGestureHandlerButtonViewManager();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return G.k(t.a(RNGestureHandlerRootViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: da.b
                @Override // javax.inject.Provider
                public final Object get() {
                    NativeModule e10;
                    e10 = C3004d.a.e();
                    return e10;
                }
            })), t.a(RNGestureHandlerButtonViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: da.c
                @Override // javax.inject.Provider
                public final Object get() {
                    NativeModule f10;
                    f10 = C3004d.a.f();
                    return f10;
                }
            })));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f() {
        Annotation annotation = RNGestureHandlerModule.class.getAnnotation(K4.a.class);
        Intrinsics.d(annotation);
        K4.a aVar = (K4.a) annotation;
        String name = aVar.name();
        String name2 = RNGestureHandlerModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        return G.l(t.a("RNGestureHandlerModule", new ReactModuleInfo(name, name2, aVar.canOverrideExistingModule(), aVar.needsEagerInit(), true, aVar.isCxxModule(), true)));
    }

    private final Map g() {
        return (Map) this.f31332a.getValue();
    }

    @Override // com.facebook.react.b0
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        Provider provider;
        ModuleSpec moduleSpec = (ModuleSpec) g().get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.getProvider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.m(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        try {
            Object newInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            Intrinsics.e(newInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (L4.a) newInstance;
        } catch (ClassNotFoundException unused) {
            return new L4.a() { // from class: da.a
                @Override // L4.a
                public final Map a() {
                    Map f10;
                    f10 = C3004d.f();
                    return f10;
                }
            };
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.AbstractC1862b
    protected List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return CollectionsKt.Q0(g().values());
    }

    @Override // com.facebook.react.b0
    public List getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return CollectionsKt.O0(g().keySet());
    }
}
