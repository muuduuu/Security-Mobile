package pa;

import C4.i;
import Ea.j;
import android.app.Application;
import android.content.Context;
import com.facebook.react.A;
import com.facebook.react.EnumC1894i;
import com.facebook.react.O;
import com.facebook.react.W;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.devsupport.I;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* renamed from: pa.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3860f extends AbstractC3861g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f38526f = new a(null);

    /* renamed from: pa.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(Context context, O reactNativeHost) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
            return C3858d.a(context, reactNativeHost);
        }

        private a() {
        }
    }

    /* renamed from: pa.f$b */
    static final class b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38527a = new b();

        b() {
            super(1);
        }

        public final Object a(j jVar) {
            return jVar.g();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3860f(Application application, O host) {
        super(application, host);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(host, "host");
    }

    @Override // com.facebook.react.O
    public boolean d() {
        return m().d();
    }

    @Override // com.facebook.react.O
    public v4.j e() {
        v4.j e10 = m().e();
        Intrinsics.checkNotNullExpressionValue(e10, "getSurfaceDelegateFactory(...)");
        return e10;
    }

    @Override // com.facebook.react.O
    protected I getDevSupportManagerFactory() {
        I i10 = (I) kotlin.sequences.j.q(kotlin.sequences.j.x(CollectionsKt.T(n()), b.f38527a));
        return i10 == null ? (I) p("getDevSupportManagerFactory") : i10;
    }

    @Override // com.facebook.react.defaults.b, com.facebook.react.O
    public EnumC1894i getJSEngineResolutionAlgorithm() {
        return (EnumC1894i) p("getJSEngineResolutionAlgorithm");
    }

    @Override // com.facebook.react.defaults.b, com.facebook.react.O
    protected W.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return (W.a) p("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    @Override // com.facebook.react.O
    protected i getRedBoxHandler() {
        android.support.v4.media.session.b.a(p("getRedBoxHandler"));
        return null;
    }

    @Override // com.facebook.react.defaults.b, com.facebook.react.O
    protected UIManagerProvider getUIManagerProvider() {
        return (UIManagerProvider) p("getUIManagerProvider");
    }
}
