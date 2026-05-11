package Ia;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import kotlin.text.StringsKt;
import lc.t;
import org.conscrypt.BuildConfig;
import p3.AbstractC3792b;
import q1.AbstractC3901a;
import qc.AbstractC3958a;
import u5.C4870a;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"LIa/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "context", BuildConfig.FLAVOR, "m", "()I", "deviceYearClass", BuildConfig.FLAVOR, "n", "()Ljava/lang/String;", "systemName", "d", C4870a.f43493a, "expo-device_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: Ia.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b c(Context context) {
            if (context.getApplicationContext().getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
                return b.TV;
            }
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                return b.TV;
            }
            b e10 = e(context);
            return e10 != b.UNKNOWN ? e10 : d(context);
        }

        private final b d(Context context) {
            double d10;
            double d11;
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return b.UNKNOWN;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                double d12 = context.getResources().getConfiguration().densityDpi;
                d10 = bounds.width() / d12;
                d11 = bounds.height() / d12;
            } else {
                windowManager.getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                d10 = r8.widthPixels / r8.xdpi;
                d11 = r8.heightPixels / r8.ydpi;
            }
            double sqrt = Math.sqrt(Math.pow(d10, 2.0d) + Math.pow(d11, 2.0d));
            return (3.0d > sqrt || sqrt > 6.9d) ? (sqrt <= 6.9d || sqrt > 18.0d) ? b.UNKNOWN : b.TABLET : b.PHONE;
        }

        private final b e(Context context) {
            int i10 = context.getResources().getConfiguration().smallestScreenWidthDp;
            return i10 == 0 ? b.UNKNOWN : i10 >= 600 ? b.TABLET : b.PHONE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f() {
            return Ha.a.f3820a.a();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        private final int JSValue;
        public static final b UNKNOWN = new b("UNKNOWN", 0, 0);
        public static final b PHONE = new b("PHONE", 1, 1);
        public static final b TABLET = new b("TABLET", 2, 2);
        public static final b DESKTOP = new b("DESKTOP", 3, 3);
        public static final b TV = new b("TV", 4, 4);

        private static final /* synthetic */ b[] $values() {
            return new b[]{UNKNOWN, PHONE, TABLET, DESKTOP, TV};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private b(String str, int i10, int i11) {
            this.JSValue = i11;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int getJSValue() {
            return this.JSValue;
        }
    }

    static final class c extends m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xb.b f4386b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.b bVar) {
            super(0);
            this.f4386b = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0095, code lost:
        
            if ((r1.length == 0) == false) goto L11;
         */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map invoke() {
            Companion companion = a.INSTANCE;
            Pair a10 = t.a("isDevice", Boolean.valueOf(!companion.f()));
            Pair a11 = t.a("brand", Build.BRAND);
            Pair a12 = t.a("manufacturer", Build.MANUFACTURER);
            Pair a13 = t.a("modelName", Build.MODEL);
            Pair a14 = t.a("designName", Build.DEVICE);
            Pair a15 = t.a("productName", Build.PRODUCT);
            Pair a16 = t.a("deviceYearClass", Integer.valueOf(a.this.m()));
            a aVar = a.this;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = aVar.l().getSystemService("activity");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            Pair a17 = t.a("totalMemory", Long.valueOf(memoryInfo.totalMem));
            Pair a18 = t.a("deviceType", Integer.valueOf(companion.c(a.this.l()).getJSValue()));
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
            }
            strArr = null;
            Pair a19 = t.a("supportedCpuArchitectures", strArr);
            Pair a20 = t.a("osName", a.this.n());
            Pair a21 = t.a("osVersion", Build.VERSION.RELEASE);
            Pair a22 = t.a("osBuildId", Build.DISPLAY);
            Pair a23 = t.a("osInternalBuildId", Build.ID);
            Pair a24 = t.a("osBuildFingerprint", Build.FINGERPRINT);
            int i10 = Build.VERSION.SDK_INT;
            return G.k(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, t.a("platformApiLevel", Integer.valueOf(i10)), t.a("deviceName", i10 <= 31 ? Settings.Secure.getString(a.this.l().getContentResolver(), "bluetooth_name") : Settings.Global.getString(a.this.l().getContentResolver(), "device_name")));
        }
    }

    public static final class d extends m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(a.INSTANCE.c(a.this.l()).getJSValue());
        }
    }

    public static final class e extends m implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Double.valueOf(SystemClock.uptimeMillis());
        }
    }

    public static final class f extends m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            long maxMemory = Runtime.getRuntime().maxMemory();
            return Double.valueOf(maxMemory != Long.MAX_VALUE ? maxMemory : -1.0d);
        }
    }

    public static final class g extends m implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            boolean f10 = a.INSTANCE.f();
            String str = Build.TAGS;
            boolean z10 = false;
            if ((!f10 && str != null && StringsKt.K(str, "test-keys", false, 2, null)) || new File("/system/app/Superuser.apk").exists() || (!f10 && new File("/system/xbin/su").exists())) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class h extends m implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            boolean canRequestPackageInstalls;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Build.VERSION.SDK_INT < 26) {
                canRequestPackageInstalls = false;
                if (Settings.Global.getInt(a.this.l().getApplicationContext().getContentResolver(), "install_non_market_apps", 0) == 1) {
                    canRequestPackageInstalls = true;
                }
            } else {
                canRequestPackageInstalls = a.this.l().getApplicationContext().getPackageManager().canRequestPackageInstalls();
            }
            return Boolean.valueOf(canRequestPackageInstalls);
        }
    }

    public static final class i extends m implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FeatureInfo[] systemAvailableFeatures = a.this.l().getApplicationContext().getPackageManager().getSystemAvailableFeatures();
            Intrinsics.checkNotNullExpressionValue(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
            List x10 = AbstractC3574i.x(systemAvailableFeatures);
            ArrayList arrayList = new ArrayList(CollectionsKt.u(x10, 10));
            Iterator it2 = x10.iterator();
            while (it2.hasNext()) {
                arrayList.add(((FeatureInfo) it2.next()).name);
            }
            return arrayList;
        }
    }

    public static final class j extends m implements Function2 {
        public j() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            a.this.l().getApplicationContext().getPackageManager().hasSystemFeature((String) promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class k extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f4391a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class l extends m implements Function1 {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return Boolean.valueOf(a.this.l().getApplicationContext().getPackageManager().hasSystemFeature((String) objArr[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context l() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new expo.modules.kotlin.exception.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m() {
        return AbstractC3792b.d(l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        String str = Build.VERSION.BASE_OS;
        Intrinsics.d(str);
        if (str.length() <= 0) {
            str = null;
        }
        return str == null ? "Android" : str;
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoDevice");
            bVar.b(new c(bVar));
            C0792a[] c0792aArr = new C0792a[0];
            d dVar = new d();
            Class cls = Integer.TYPE;
            bVar.k().put("getDeviceTypeAsync", Intrinsics.b(Integer.class, cls) ? new wb.k("getDeviceTypeAsync", c0792aArr, dVar) : Intrinsics.b(Integer.class, Boolean.TYPE) ? new wb.h("getDeviceTypeAsync", c0792aArr, dVar) : Intrinsics.b(Integer.class, Double.TYPE) ? new wb.i("getDeviceTypeAsync", c0792aArr, dVar) : Intrinsics.b(Integer.class, Float.TYPE) ? new wb.j("getDeviceTypeAsync", c0792aArr, dVar) : Intrinsics.b(Integer.class, String.class) ? new wb.m("getDeviceTypeAsync", c0792aArr, dVar) : new wb.e("getDeviceTypeAsync", c0792aArr, dVar));
            C0792a[] c0792aArr2 = new C0792a[0];
            e eVar = new e();
            bVar.k().put("getUptimeAsync", Intrinsics.b(Double.class, cls) ? new wb.k("getUptimeAsync", c0792aArr2, eVar) : Intrinsics.b(Double.class, Boolean.TYPE) ? new wb.h("getUptimeAsync", c0792aArr2, eVar) : Intrinsics.b(Double.class, Double.TYPE) ? new wb.i("getUptimeAsync", c0792aArr2, eVar) : Intrinsics.b(Double.class, Float.TYPE) ? new wb.j("getUptimeAsync", c0792aArr2, eVar) : Intrinsics.b(Double.class, String.class) ? new wb.m("getUptimeAsync", c0792aArr2, eVar) : new wb.e("getUptimeAsync", c0792aArr2, eVar));
            C0792a[] c0792aArr3 = new C0792a[0];
            f fVar = new f();
            bVar.k().put("getMaxMemoryAsync", Intrinsics.b(Double.class, cls) ? new wb.k("getMaxMemoryAsync", c0792aArr3, fVar) : Intrinsics.b(Double.class, Boolean.TYPE) ? new wb.h("getMaxMemoryAsync", c0792aArr3, fVar) : Intrinsics.b(Double.class, Double.TYPE) ? new wb.i("getMaxMemoryAsync", c0792aArr3, fVar) : Intrinsics.b(Double.class, Float.TYPE) ? new wb.j("getMaxMemoryAsync", c0792aArr3, fVar) : Intrinsics.b(Double.class, String.class) ? new wb.m("getMaxMemoryAsync", c0792aArr3, fVar) : new wb.e("getMaxMemoryAsync", c0792aArr3, fVar));
            C0792a[] c0792aArr4 = new C0792a[0];
            g gVar = new g();
            bVar.k().put("isRootedExperimentalAsync", Intrinsics.b(Boolean.class, cls) ? new wb.k("isRootedExperimentalAsync", c0792aArr4, gVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("isRootedExperimentalAsync", c0792aArr4, gVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("isRootedExperimentalAsync", c0792aArr4, gVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("isRootedExperimentalAsync", c0792aArr4, gVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("isRootedExperimentalAsync", c0792aArr4, gVar) : new wb.e("isRootedExperimentalAsync", c0792aArr4, gVar));
            C0792a[] c0792aArr5 = new C0792a[0];
            h hVar = new h();
            bVar.k().put("isSideLoadingEnabledAsync", Intrinsics.b(Boolean.class, cls) ? new wb.k("isSideLoadingEnabledAsync", c0792aArr5, hVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("isSideLoadingEnabledAsync", c0792aArr5, hVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("isSideLoadingEnabledAsync", c0792aArr5, hVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("isSideLoadingEnabledAsync", c0792aArr5, hVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("isSideLoadingEnabledAsync", c0792aArr5, hVar) : new wb.e("isSideLoadingEnabledAsync", c0792aArr5, hVar));
            C0792a[] c0792aArr6 = new C0792a[0];
            i iVar = new i();
            bVar.k().put("getPlatformFeaturesAsync", Intrinsics.b(List.class, cls) ? new wb.k("getPlatformFeaturesAsync", c0792aArr6, iVar) : Intrinsics.b(List.class, Boolean.TYPE) ? new wb.h("getPlatformFeaturesAsync", c0792aArr6, iVar) : Intrinsics.b(List.class, Double.TYPE) ? new wb.i("getPlatformFeaturesAsync", c0792aArr6, iVar) : Intrinsics.b(List.class, Float.TYPE) ? new wb.j("getPlatformFeaturesAsync", c0792aArr6, iVar) : Intrinsics.b(List.class, String.class) ? new wb.m("getPlatformFeaturesAsync", c0792aArr6, iVar) : new wb.e("getPlatformFeaturesAsync", c0792aArr6, iVar));
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar = new wb.f("hasPlatformFeatureAsync", new C0792a[0], new j());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.FALSE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(String.class), false, k.f4391a));
                }
                C0792a[] c0792aArr7 = {c0792a};
                l lVar = new l();
                kVar = Intrinsics.b(Boolean.class, cls) ? new wb.k("hasPlatformFeatureAsync", c0792aArr7, lVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("hasPlatformFeatureAsync", c0792aArr7, lVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("hasPlatformFeatureAsync", c0792aArr7, lVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("hasPlatformFeatureAsync", c0792aArr7, lVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("hasPlatformFeatureAsync", c0792aArr7, lVar) : new wb.e("hasPlatformFeatureAsync", c0792aArr7, lVar);
            }
            bVar.k().put("hasPlatformFeatureAsync", kVar);
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
