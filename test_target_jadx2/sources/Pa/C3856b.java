package pa;

import android.util.Log;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import nc.AbstractC3728a;
import xc.C5142C;
import xc.m;

/* renamed from: pa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3856b implements P {

    /* renamed from: b, reason: collision with root package name */
    public static final C0593b f38491b = new C0593b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy f38492c = i.a(a.f38494a);

    /* renamed from: a, reason: collision with root package name */
    private final expo.modules.adapters.react.a f38493a = new expo.modules.adapters.react.a(f38491b.a());

    /* renamed from: pa.b$a */
    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38494a = new a();

        /* renamed from: pa.b$a$a, reason: collision with other inner class name */
        public static final class C0592a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Ba.a aVar = Ba.a.f548a;
                return AbstractC3728a.a(Integer.valueOf(aVar.a(C5142C.b(((Ea.g) obj2).getClass()).e())), Integer.valueOf(aVar.a(C5142C.b(((Ea.g) obj).getClass()).e())));
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                Object invoke = C3857c.class.getMethod("getPackageList", null).invoke(null, null);
                Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
                return CollectionsKt.F0((List) invoke, new C0592a());
            } catch (Exception e10) {
                Log.e("ExpoModulesPackage", "Couldn't get expo package list.", e10);
                return CollectionsKt.j();
            }
        }
    }

    /* renamed from: pa.b$b, reason: collision with other inner class name */
    public static final class C0593b {
        public /* synthetic */ C0593b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return (List) C3856b.f38492c.getValue();
        }

        private C0593b() {
        }
    }

    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List createNativeModules = this.f38493a.createNativeModules(reactContext);
        Intrinsics.checkNotNullExpressionValue(createNativeModules, "createNativeModules(...)");
        return createNativeModules;
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List createViewManagers = this.f38493a.createViewManagers(reactContext);
        Intrinsics.checkNotNullExpressionValue(createViewManagers, "createViewManagers(...)");
        return createViewManagers;
    }
}
