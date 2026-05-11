package pa;

import android.content.Context;
import com.facebook.react.A;
import com.facebook.react.B;
import com.facebook.react.EnumC1894i;
import com.facebook.react.O;
import com.facebook.react.W;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.InterfaceC1909g;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: pa.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3858d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3858d f38497a = new C3858d();

    /* renamed from: b, reason: collision with root package name */
    private static A f38498b;

    /* renamed from: pa.d$b */
    public static final class b implements B {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f38505a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38506b;

        b(O o10, boolean z10) {
            this.f38505a = o10;
            this.f38506b = z10;
        }

        @Override // com.facebook.react.B
        public void a(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Iterator it = ((C3860f) this.f38505a).n().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    private C3858d() {
    }

    public static final A a(Context context, O reactNativeHost) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
        if (!(reactNativeHost instanceof C3860f)) {
            throw new IllegalArgumentException("You can call createFromReactNativeHost only with instances of ReactNativeHostWrapper");
        }
        if (f38498b == null) {
            C3860f c3860f = (C3860f) reactNativeHost;
            boolean f10 = c3860f.f();
            a aVar = new a(new WeakReference(context), c3860f, null, null, null, 28, null);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            Iterator it = c3860f.n().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            ReactHostImpl reactHostImpl = new ReactHostImpl(context, aVar, componentFactory, true, f10);
            Iterator it2 = c3860f.n().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                reactHostImpl.i();
                throw null;
            }
            reactHostImpl.l(new b(reactNativeHost, f10));
            f38498b = reactHostImpl;
        }
        A a10 = f38498b;
        Intrinsics.e(a10, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return a10;
    }

    /* renamed from: pa.d$a */
    private static final class a implements InterfaceC1909g {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f38499a;

        /* renamed from: b, reason: collision with root package name */
        private final C3860f f38500b;

        /* renamed from: c, reason: collision with root package name */
        private final BindingsInstaller f38501c;

        /* renamed from: d, reason: collision with root package name */
        private final ReactNativeConfig f38502d;

        /* renamed from: e, reason: collision with root package name */
        private final W.a f38503e;

        /* renamed from: f, reason: collision with root package name */
        private JSBundleLoader f38504f;

        public a(WeakReference weakContext, C3860f reactNativeHostWrapper, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, W.a turboModuleManagerDelegateBuilder) {
            Intrinsics.checkNotNullParameter(weakContext, "weakContext");
            Intrinsics.checkNotNullParameter(reactNativeHostWrapper, "reactNativeHostWrapper");
            Intrinsics.checkNotNullParameter(reactNativeConfig, "reactNativeConfig");
            Intrinsics.checkNotNullParameter(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
            this.f38499a = weakContext;
            this.f38500b = reactNativeHostWrapper;
            this.f38501c = bindingsInstaller;
            this.f38502d = reactNativeConfig;
            this.f38503e = turboModuleManagerDelegateBuilder;
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        /* renamed from: a */
        public JSRuntimeFactory getJsRuntimeFactory() {
            return this.f38500b.getJSEngineResolutionAlgorithm() == EnumC1894i.HERMES ? new HermesInstance() : new JSCInstance();
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        /* renamed from: b */
        public ReactNativeConfig getReactNativeConfig() {
            return this.f38502d;
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        /* renamed from: c */
        public List getReactPackages() {
            return this.f38500b.getPackages();
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        public void d(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f38500b.f();
            Iterator it = this.f38500b.n().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        /* renamed from: e */
        public JSBundleLoader getJsBundleLoader() {
            JSBundleLoader jSBundleLoader = this.f38504f;
            if (jSBundleLoader != null) {
                return jSBundleLoader;
            }
            Context context = (Context) this.f38499a.get();
            if (context == null) {
                throw new IllegalStateException("Unable to get concrete Context");
            }
            String jSBundleFile = this.f38500b.getJSBundleFile();
            if (jSBundleFile != null) {
                if (StringsKt.F(jSBundleFile, "assets://", false, 2, null)) {
                    JSBundleLoader createAssetLoader = JSBundleLoader.createAssetLoader(context, jSBundleFile, true);
                    Intrinsics.checkNotNullExpressionValue(createAssetLoader, "createAssetLoader(...)");
                    return createAssetLoader;
                }
                JSBundleLoader createFileLoader = JSBundleLoader.createFileLoader(jSBundleFile);
                Intrinsics.checkNotNullExpressionValue(createFileLoader, "createFileLoader(...)");
                return createFileLoader;
            }
            JSBundleLoader createAssetLoader2 = JSBundleLoader.createAssetLoader(context, "assets://" + this.f38500b.getBundleAssetName(), true);
            Intrinsics.checkNotNullExpressionValue(createAssetLoader2, "createAssetLoader(...)");
            return createAssetLoader2;
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        /* renamed from: f */
        public W.a getTurboModuleManagerDelegateBuilder() {
            return this.f38503e;
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        /* renamed from: g */
        public String getJsMainModulePath() {
            return this.f38500b.getJSMainModuleName();
        }

        @Override // com.facebook.react.runtime.InterfaceC1909g
        public BindingsInstaller getBindingsInstaller() {
            return this.f38501c;
        }

        public /* synthetic */ a(WeakReference weakReference, C3860f c3860f, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, W.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(weakReference, c3860f, (i10 & 4) != 0 ? null : bindingsInstaller, (i10 & 8) != 0 ? ReactNativeConfig.DEFAULT_CONFIG : reactNativeConfig, (i10 & 16) != 0 ? new DefaultTurboModuleManagerDelegate.a() : aVar);
        }
    }
}
