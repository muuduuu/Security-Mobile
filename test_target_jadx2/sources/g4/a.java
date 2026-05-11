package G4;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2871a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function0 f2872b;

    /* renamed from: c, reason: collision with root package name */
    private static b f2873c;

    /* renamed from: G4.a$a, reason: collision with other inner class name */
    static final class C0067a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0067a f2874a = new C0067a();

        C0067a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return new c();
        }
    }

    static {
        C0067a c0067a = C0067a.f2874a;
        f2872b = c0067a;
        f2873c = (b) c0067a.invoke();
    }

    private a() {
    }

    public static final boolean a() {
        return f2873c.completeReactInstanceCreationOnBgThreadOnAndroid();
    }

    public static final boolean b() {
        return f2873c.enableAndroidMixBlendModeProp();
    }

    public static final boolean c() {
        return f2873c.enableBackgroundStyleApplicator();
    }

    public static final boolean d() {
        return f2873c.enableEagerRootViewAttachment();
    }

    public static final boolean e() {
        return f2873c.enableEventEmitterRetentionDuringGesturesOnAndroid();
    }

    public static final boolean f() {
        return f2873c.enableFabricLogs();
    }

    public static final boolean g() {
        return f2873c.enableFabricRendererExclusively();
    }

    public static final boolean h() {
        return f2873c.enableViewRecycling();
    }

    public static final boolean i() {
        return f2873c.fixIncorrectScrollViewStateUpdateOnAndroid();
    }

    public static final boolean j() {
        return f2873c.forceBatchingMountItemsOnAndroid();
    }

    public static final boolean k() {
        return f2873c.initEagerTurboModulesOnNativeModulesQueueAndroid();
    }

    public static final boolean l() {
        return f2873c.lazyAnimationCallbacks();
    }

    public static final boolean m() {
        return f2873c.loadVectorDrawablesOnImages();
    }

    public static final void n(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        f2873c.a(provider);
    }

    public static final boolean o() {
        return f2873c.setAndroidLayoutDirection();
    }

    public static final boolean p() {
        return f2873c.useFabricInterop();
    }

    public static final boolean q() {
        return f2873c.useImmediateExecutorInAndroidBridgeless();
    }

    public static final boolean r() {
        return f2873c.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean s() {
        return f2873c.useNewReactImageViewBackgroundDrawing();
    }

    public static final boolean t() {
        return f2873c.useOptimisedViewPreallocationOnAndroid();
    }

    public static final boolean u() {
        return f2873c.useOptimizedEventBatchingOnAndroid();
    }

    public static final boolean v() {
        return f2873c.useTurboModuleInterop();
    }
}
