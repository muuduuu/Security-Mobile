package sa;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Db.T;
import Db.U;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.provider.Settings;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import expo.modules.kotlin.exception.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import lc.t;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import wb.i;
import wb.j;
import wb.k;
import wb.q;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;
import yb.C5189g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0015\u001a\n \u000f*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lsa/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "o", "()Landroid/content/Context;", "context", BuildConfig.FLAVOR, "n", "()Ljava/lang/String;", "applicationName", "kotlin.jvm.PlatformType", "q", "packageName", "Landroid/content/pm/PackageManager;", "p", "()Landroid/content/pm/PackageManager;", "packageManager", "s", "versionName", BuildConfig.FLAVOR, "r", "()I", "versionCode", "expo-application_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4507a extends AbstractC5139a {

    /* renamed from: sa.a$a, reason: collision with other inner class name */
    static final class C0613a extends m implements Function0 {
        C0613a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return G.k(t.a("applicationName", C4507a.this.n()), t.a("applicationId", C4507a.this.q()), t.a("nativeApplicationVersion", C4507a.this.s()), t.a("nativeBuildVersion", String.valueOf(C4507a.this.r())));
        }
    }

    /* renamed from: sa.a$b */
    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f41670a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f41671b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ pb.m f41672c;

        b(InstallReferrerClient installReferrerClient, StringBuilder sb2, pb.m mVar) {
            this.f41670a = installReferrerClient;
            this.f41671b = sb2;
            this.f41672c = mVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            this.f41672c.reject("ERR_APPLICATION_INSTALL_REFERRER_SERVICE_DISCONNECTED", "Connection to install referrer service was lost.", null);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (i10 == 0) {
                try {
                    this.f41671b.append(this.f41670a.getInstallReferrer().getInstallReferrer());
                    pb.m mVar = this.f41672c;
                    String sb2 = this.f41671b.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                    mVar.a(sb2);
                } catch (RemoteException e10) {
                    this.f41672c.reject("ERR_APPLICATION_INSTALL_REFERRER_REMOTE_EXCEPTION", "RemoteException getting install referrer information. This may happen if the process hosting the remote object is no longer available.", e10);
                    return;
                }
            } else if (i10 == 1) {
                this.f41672c.reject("ERR_APPLICATION_INSTALL_REFERRER", "General error retrieving the install referrer: response code " + i10, null);
            } else if (i10 != 2) {
                this.f41672c.reject("ERR_APPLICATION_INSTALL_REFERRER", "General error retrieving the install referrer: response code " + i10, null);
            } else {
                this.f41672c.reject("ERR_APPLICATION_INSTALL_REFERRER_UNAVAILABLE", "The current Play Store app doesn't provide the installation referrer API, or the Play Store may not be installed.", null);
            }
            this.f41670a.endConnection();
        }
    }

    /* renamed from: sa.a$c */
    public static final class c extends m implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            PackageInfo d10;
            Intrinsics.checkNotNullParameter(it, "it");
            PackageManager packageManager = C4507a.this.o().getPackageManager();
            String packageName = C4507a.this.o().getPackageName();
            Intrinsics.d(packageManager);
            Intrinsics.d(packageName);
            d10 = AbstractC4508b.d(packageManager, packageName, 0);
            return Double.valueOf(d10.firstInstallTime);
        }
    }

    /* renamed from: sa.a$d */
    public static final class d extends m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            PackageInfo d10;
            Intrinsics.checkNotNullParameter(it, "it");
            PackageManager packageManager = C4507a.this.o().getPackageManager();
            String packageName = C4507a.this.o().getPackageName();
            Intrinsics.d(packageManager);
            Intrinsics.d(packageName);
            d10 = AbstractC4508b.d(packageManager, packageName, 0);
            return Double.valueOf(d10.lastUpdateTime);
        }
    }

    /* renamed from: sa.a$e */
    public static final class e extends m implements Function2 {
        public e() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            StringBuilder sb2 = new StringBuilder();
            InstallReferrerClient build = InstallReferrerClient.newBuilder(C4507a.this.o()).build();
            build.startConnection(new b(build, sb2, promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: sa.a$f */
    public static final class f extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f41676a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(pb.m.class);
        }
    }

    /* renamed from: sa.a$g */
    public static final class g extends m implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            pb.m mVar = (pb.m) objArr[0];
            StringBuilder sb2 = new StringBuilder();
            InstallReferrerClient build = InstallReferrerClient.newBuilder(C4507a.this.o()).build();
            build.startConnection(new b(build, sb2, mVar));
            return Unit.f36324a;
        }
    }

    /* renamed from: sa.a$h */
    static final class h extends m implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Settings.Secure.getString(C4507a.this.o().getContentResolver(), "android_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return o().getApplicationInfo().loadLabel(o().getPackageManager()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context o() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new l();
    }

    private final PackageManager p() {
        return o().getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q() {
        return o().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        PackageInfo d10;
        long c10;
        PackageManager p10 = p();
        Intrinsics.checkNotNullExpressionValue(p10, "<get-packageManager>(...)");
        String q10 = q();
        Intrinsics.checkNotNullExpressionValue(q10, "<get-packageName>(...)");
        d10 = AbstractC4508b.d(p10, q10, 0);
        c10 = AbstractC4508b.c(d10);
        return (int) c10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s() {
        PackageInfo d10;
        PackageManager p10 = p();
        Intrinsics.checkNotNullExpressionValue(p10, "<get-packageManager>(...)");
        String q10 = q();
        Intrinsics.checkNotNullExpressionValue(q10, "<get-packageName>(...)");
        d10 = AbstractC4508b.d(p10, q10, 0);
        return d10.versionName;
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoApplication");
            bVar.b(new C0613a());
            C5189g c5189g = new C5189g("androidId");
            C0792a[] c0792aArr = new C0792a[0];
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(String.class));
            if (t10 == null) {
                t10 = new T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t10);
            }
            c5189g.b(new q("get", c0792aArr, t10, new h()));
            bVar.m().put("androidId", c5189g);
            C0792a[] c0792aArr2 = new C0792a[0];
            c cVar = new c();
            Class cls = Integer.TYPE;
            bVar.k().put("getInstallationTimeAsync", Intrinsics.b(Double.class, cls) ? new k("getInstallationTimeAsync", c0792aArr2, cVar) : Intrinsics.b(Double.class, Boolean.TYPE) ? new wb.h("getInstallationTimeAsync", c0792aArr2, cVar) : Intrinsics.b(Double.class, Double.TYPE) ? new i("getInstallationTimeAsync", c0792aArr2, cVar) : Intrinsics.b(Double.class, Float.TYPE) ? new j("getInstallationTimeAsync", c0792aArr2, cVar) : Intrinsics.b(Double.class, String.class) ? new wb.m("getInstallationTimeAsync", c0792aArr2, cVar) : new wb.e("getInstallationTimeAsync", c0792aArr2, cVar));
            C0792a[] c0792aArr3 = new C0792a[0];
            d dVar = new d();
            bVar.k().put("getLastUpdateTimeAsync", Intrinsics.b(Double.class, cls) ? new k("getLastUpdateTimeAsync", c0792aArr3, dVar) : Intrinsics.b(Double.class, Boolean.TYPE) ? new wb.h("getLastUpdateTimeAsync", c0792aArr3, dVar) : Intrinsics.b(Double.class, Double.TYPE) ? new i("getLastUpdateTimeAsync", c0792aArr3, dVar) : Intrinsics.b(Double.class, Float.TYPE) ? new j("getLastUpdateTimeAsync", c0792aArr3, dVar) : Intrinsics.b(Double.class, String.class) ? new wb.m("getLastUpdateTimeAsync", c0792aArr3, dVar) : new wb.e("getLastUpdateTimeAsync", c0792aArr3, dVar));
            if (Intrinsics.b(pb.m.class, pb.m.class)) {
                kVar = new wb.f("getInstallReferrerAsync", new C0792a[0], new e());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(pb.m.class), Boolean.FALSE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(pb.m.class), false, f.f41676a));
                }
                C0792a[] c0792aArr4 = {c0792a};
                g gVar = new g();
                kVar = Intrinsics.b(Unit.class, cls) ? new k("getInstallReferrerAsync", c0792aArr4, gVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("getInstallReferrerAsync", c0792aArr4, gVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("getInstallReferrerAsync", c0792aArr4, gVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("getInstallReferrerAsync", c0792aArr4, gVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("getInstallReferrerAsync", c0792aArr4, gVar) : new wb.e("getInstallReferrerAsync", c0792aArr4, gVar);
            }
            bVar.k().put("getInstallReferrerAsync", kVar);
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
