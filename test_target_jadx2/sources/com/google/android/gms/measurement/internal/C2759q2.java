package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2301m7;
import com.google.android.gms.internal.measurement.L7;
import d7.AbstractC2995a;
import d7.C2997c;
import d7.C2998d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2759q2 extends AbstractC2687h2 {

    /* renamed from: c, reason: collision with root package name */
    private String f26247c;

    /* renamed from: d, reason: collision with root package name */
    private String f26248d;

    /* renamed from: e, reason: collision with root package name */
    private int f26249e;

    /* renamed from: f, reason: collision with root package name */
    private String f26250f;

    /* renamed from: g, reason: collision with root package name */
    private String f26251g;

    /* renamed from: h, reason: collision with root package name */
    private long f26252h;

    /* renamed from: i, reason: collision with root package name */
    private final long f26253i;

    /* renamed from: j, reason: collision with root package name */
    private final long f26254j;

    /* renamed from: k, reason: collision with root package name */
    private List f26255k;

    /* renamed from: l, reason: collision with root package name */
    private String f26256l;

    /* renamed from: m, reason: collision with root package name */
    private int f26257m;

    /* renamed from: n, reason: collision with root package name */
    private String f26258n;

    /* renamed from: o, reason: collision with root package name */
    private String f26259o;

    /* renamed from: p, reason: collision with root package name */
    private long f26260p;

    /* renamed from: q, reason: collision with root package name */
    private String f26261q;

    C2759q2(C2760q3 c2760q3, long j10, long j11) {
        super(c2760q3);
        this.f26260p = 0L;
        this.f26261q = null;
        this.f26253i = j10;
        this.f26254j = j11;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final boolean m() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:3)(6:59|60|(1:62)(2:77|(1:79))|63|64|(16:66|(1:68)(1:75)|69|70|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(3:31|(1:33)(3:40|(3:43|(1:45)(1:46)|41)|47)|(2:35|36)(2:38|39))|48|(0)(0)))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.f25694a.a().o().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.C2.x(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void n() {
        String str;
        String str2;
        PackageInfo packageInfo;
        int h10;
        List K10;
        String a10;
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.a().w().c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.f26254j), Long.valueOf(this.f26253i));
        String packageName = c2760q3.e().getPackageName();
        PackageManager packageManager = c2760q3.e().getPackageManager();
        String str3 = BuildConfig.FLAVOR;
        int i10 = Integer.MIN_VALUE;
        String str4 = "Unknown";
        String str5 = "unknown";
        if (packageManager == null) {
            c2760q3.a().o().b("PackageManager is null, app identity information might be inaccurate. appId", C2.x(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.f25694a.a().o().b("Error retrieving app installer package name. appId", C2.x(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = BuildConfig.FLAVOR;
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.f25694a.e().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i10 = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.f25694a.a().o().c("Error retrieving package info. appId, appName", C2.x(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.f26247c = packageName;
                    this.f26250f = str5;
                    this.f26248d = str4;
                    this.f26249e = i10;
                    this.f26251g = str2;
                    this.f26252h = 0L;
                    C2760q3 c2760q32 = this.f25694a;
                    h10 = c2760q32.h();
                    if (h10 == 0) {
                    }
                    this.f26258n = BuildConfig.FLAVOR;
                    C2760q3 c2760q33 = this.f25694a;
                    c2760q33.c();
                    a10 = AbstractC2722l5.a(c2760q33.e(), "google_app_id", c2760q32.H());
                    if (!TextUtils.isEmpty(a10)) {
                    }
                    this.f26258n = str3;
                    if (h10 == 0) {
                    }
                    this.f26255k = null;
                    C2760q3 c2760q34 = this.f25694a;
                    c2760q34.c();
                    K10 = c2760q34.w().K("analytics.safelisted_events");
                    if (K10 != null) {
                    }
                    this.f26255k = K10;
                    if (packageManager == null) {
                    }
                }
                this.f26247c = packageName;
                this.f26250f = str5;
                this.f26248d = str4;
                this.f26249e = i10;
                this.f26251g = str2;
                this.f26252h = 0L;
                C2760q3 c2760q322 = this.f25694a;
                h10 = c2760q322.h();
                if (h10 == 0) {
                    this.f25694a.a().w().a("App measurement collection enabled");
                } else if (h10 == 1) {
                    this.f25694a.a().u().a("App measurement deactivated via the manifest");
                } else if (h10 == 3) {
                    this.f25694a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (h10 == 4) {
                    this.f25694a.a().u().a("App measurement disabled via the manifest");
                } else if (h10 == 6) {
                    this.f25694a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (h10 == 7) {
                    this.f25694a.a().u().a("App measurement disabled via the global data collection setting");
                } else if (h10 != 8) {
                    C2760q3 c2760q35 = this.f25694a;
                    c2760q35.a().u().a("App measurement disabled");
                    c2760q35.a().p().a("Invalid scion state in identity");
                } else {
                    this.f25694a.a().u().a("App measurement disabled due to denied storage consent");
                }
                this.f26258n = BuildConfig.FLAVOR;
                C2760q3 c2760q332 = this.f25694a;
                c2760q332.c();
                a10 = AbstractC2722l5.a(c2760q332.e(), "google_app_id", c2760q322.H());
                if (!TextUtils.isEmpty(a10)) {
                    str3 = a10;
                }
                this.f26258n = str3;
                if (h10 == 0) {
                    c2760q332.a().w().c("App measurement enabled for app package, google app id", this.f26247c, this.f26258n);
                }
                this.f26255k = null;
                C2760q3 c2760q342 = this.f25694a;
                c2760q342.c();
                K10 = c2760q342.w().K("analytics.safelisted_events");
                if (K10 != null) {
                    if (K10.isEmpty()) {
                        c2760q342.a().t().a("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = K10.iterator();
                        while (it.hasNext()) {
                            if (!c2760q342.C().u0("safelisted event", (String) it.next())) {
                                break;
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.f26257m = AbstractC2995a.a(c2760q342.e()) ? 1 : 0;
                        return;
                    } else {
                        this.f26257m = 0;
                        return;
                    }
                }
                this.f26255k = K10;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.f26247c = packageName;
        this.f26250f = str5;
        this.f26248d = str4;
        this.f26249e = i10;
        this.f26251g = str2;
        this.f26252h = 0L;
        C2760q3 c2760q3222 = this.f25694a;
        h10 = c2760q3222.h();
        if (h10 == 0) {
        }
        this.f26258n = BuildConfig.FLAVOR;
        C2760q3 c2760q3322 = this.f25694a;
        c2760q3322.c();
        a10 = AbstractC2722l5.a(c2760q3322.e(), "google_app_id", c2760q3222.H());
        if (!TextUtils.isEmpty(a10)) {
        }
        this.f26258n = str3;
        if (h10 == 0) {
        }
        this.f26255k = null;
        C2760q3 c2760q3422 = this.f25694a;
        c2760q3422.c();
        K10 = c2760q3422.w().K("analytics.safelisted_events");
        if (K10 != null) {
        }
        this.f26255k = K10;
        if (packageManager == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final n7 o(String str) {
        Class<?> loadClass;
        Object invoke;
        String str2;
        C2760q3 c2760q3;
        long j10;
        long j11;
        List list;
        String str3;
        C2760q3 c2760q32;
        int i10;
        int i11;
        long j12;
        ApplicationInfo c10;
        long j13;
        h();
        String q10 = q();
        String r10 = r();
        j();
        String str4 = this.f26248d;
        j();
        long j14 = this.f26249e;
        j();
        AbstractC1287s.m(this.f26250f);
        String str5 = this.f26250f;
        C2760q3 c2760q33 = this.f25694a;
        c2760q33.w().A();
        j();
        h();
        long j15 = this.f26252h;
        if (j15 == 0) {
            l7 C10 = this.f25694a.C();
            Context e10 = c2760q33.e();
            String packageName = c2760q33.e().getPackageName();
            C10.h();
            AbstractC1287s.m(e10);
            AbstractC1287s.g(packageName);
            PackageManager packageManager = e10.getPackageManager();
            MessageDigest C11 = l7.C();
            if (C11 == null) {
                C10.f25694a.a().o().a("Could not get MD5 instance");
                j15 = -1;
            } else {
                if (packageManager != null) {
                    try {
                        if (C10.S(e10, packageName)) {
                            j13 = 0;
                        } else {
                            C2997c a10 = C2998d.a(e10);
                            C2760q3 c2760q34 = C10.f25694a;
                            Signature[] signatureArr = a10.e(c2760q34.e().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                c2760q34.a().r().a("Could not get signatures");
                                j13 = -1;
                            } else {
                                j13 = l7.D(C11.digest(signatureArr[0].toByteArray()));
                            }
                        }
                        j15 = j13;
                    } catch (PackageManager.NameNotFoundException e11) {
                        C10.f25694a.a().o().b("Package name not found", e11);
                    }
                }
                j15 = 0;
            }
            this.f26252h = j15;
        }
        long j16 = j15;
        C2760q3 c2760q35 = this.f25694a;
        boolean g10 = c2760q35.g();
        boolean z10 = !c2760q35.x().f25646s;
        h();
        if (c2760q35.g()) {
            L7.a();
            if (c2760q35.w().H(null, AbstractC2671f2.f25952I0)) {
                this.f25694a.a().w().a("Disabled IID for tests.");
            } else {
                try {
                    loadClass = c2760q35.e().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f25694a.e());
                    } catch (Exception unused2) {
                        this.f25694a.a().s().a("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                        } catch (Exception unused3) {
                            this.f25694a.a().t().a("Failed to retrieve Firebase Instance Id");
                        }
                        C2760q3 c2760q36 = this.f25694a;
                        long a11 = c2760q36.x().f25633f.a();
                        long min = a11 != 0 ? c2760q36.f26266D : Math.min(c2760q36.f26266D, a11);
                        j();
                        int i12 = this.f26257m;
                        c2760q3 = this.f25694a;
                        boolean M10 = c2760q3.w().M();
                        Q2 x10 = c2760q3.x();
                        x10.h();
                        boolean z11 = x10.p().getBoolean("deferred_analytics_collection", false);
                        boolean z12 = c2760q3.w().O("google_analytics_default_allow_ad_personalization_signals", true) == X3.GRANTED;
                        long j17 = this.f26253i;
                        Boolean valueOf = Boolean.valueOf(z12);
                        List list2 = this.f26255k;
                        String l10 = c2760q3.x().w().l();
                        if (this.f26256l == null) {
                            this.f26256l = c2760q3.C().l0();
                        }
                        String str6 = this.f26256l;
                        if (c2760q3.x().w().o(Z3.ANALYTICS_STORAGE)) {
                            j11 = j17;
                            j10 = 0;
                            str3 = null;
                            list = list2;
                        } else {
                            h();
                            j10 = 0;
                            if (this.f26260p == 0) {
                                j11 = j17;
                                list = list2;
                            } else {
                                j11 = j17;
                                list = list2;
                                long a12 = c2760q3.f().a() - this.f26260p;
                                if (this.f26259o != null && a12 > 86400000 && this.f26261q == null) {
                                    p();
                                }
                            }
                            if (this.f26259o == null) {
                                p();
                            }
                            str3 = this.f26259o;
                        }
                        boolean P10 = c2760q3.w().P();
                        l7 C12 = c2760q3.C();
                        String q11 = q();
                        c2760q32 = C12.f25694a;
                        if (c2760q32.e().getPackageManager() != null) {
                            j12 = j10;
                            i10 = 0;
                        } else {
                            try {
                                i10 = 0;
                                try {
                                    c10 = C2998d.a(c2760q32.e()).c(q11, 0);
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    C2760q3 c2760q37 = C12.f25694a;
                                    c2760q37.c();
                                    c2760q37.a().u().b("PackageManager failed to find running app: app_id", q11);
                                    i11 = i10;
                                    j12 = i11;
                                    C2760q3 c2760q38 = this.f25694a;
                                    int b10 = c2760q38.x().w().b();
                                    String e12 = c2760q38.x().u().e();
                                    C2301m7.a();
                                    C2724m w10 = c2760q38.w();
                                    C2663e2 c2663e2 = AbstractC2671f2.f25970R0;
                                    if (w10.H(null, c2663e2)) {
                                    }
                                    C2301m7.a();
                                    if (c2760q38.w().H(null, c2663e2)) {
                                    }
                                    String R10 = c2760q38.w().R();
                                    String b11 = new C2670f1(c2760q38.w().O("google_analytics_default_allow_ad_personalization_signals", true)).b();
                                    C2760q3 c2760q39 = this.f25694a;
                                    return new n7(q10, r10, str4, j14, str5, 133005L, j16, str, g10, z10, str2, min, i12, M10, z11, valueOf, j11, list, l10, str6, str3, P10, j12, b10, e12, r46, r47, R10, b11, c2760q39.f26266D, c2760q39.N().q().zza());
                                }
                            } catch (PackageManager.NameNotFoundException unused5) {
                                i10 = 0;
                            }
                            if (c10 != null) {
                                i11 = c10.targetSdkVersion;
                                j12 = i11;
                            }
                            i11 = i10;
                            j12 = i11;
                        }
                        C2760q3 c2760q382 = this.f25694a;
                        int b102 = c2760q382.x().w().b();
                        String e122 = c2760q382.x().u().e();
                        C2301m7.a();
                        C2724m w102 = c2760q382.w();
                        C2663e2 c2663e22 = AbstractC2671f2.f25970R0;
                        int I10 = w102.H(null, c2663e22) ? c2760q382.C().I() : i10;
                        C2301m7.a();
                        long J10 = c2760q382.w().H(null, c2663e22) ? c2760q382.C().J() : j10;
                        String R102 = c2760q382.w().R();
                        String b112 = new C2670f1(c2760q382.w().O("google_analytics_default_allow_ad_personalization_signals", true)).b();
                        C2760q3 c2760q392 = this.f25694a;
                        return new n7(q10, r10, str4, j14, str5, 133005L, j16, str, g10, z10, str2, min, i12, M10, z11, valueOf, j11, list, l10, str6, str3, P10, j12, b102, e122, I10, J10, R102, b112, c2760q392.f26266D, c2760q392.N().q().zza());
                    }
                }
            }
        }
        str2 = null;
        C2760q3 c2760q362 = this.f25694a;
        long a112 = c2760q362.x().f25633f.a();
        if (a112 != 0) {
        }
        j();
        int i122 = this.f26257m;
        c2760q3 = this.f25694a;
        boolean M102 = c2760q3.w().M();
        Q2 x102 = c2760q3.x();
        x102.h();
        boolean z112 = x102.p().getBoolean("deferred_analytics_collection", false);
        if (c2760q3.w().O("google_analytics_default_allow_ad_personalization_signals", true) == X3.GRANTED) {
        }
        long j172 = this.f26253i;
        Boolean valueOf2 = Boolean.valueOf(z12);
        List list22 = this.f26255k;
        String l102 = c2760q3.x().w().l();
        if (this.f26256l == null) {
        }
        String str62 = this.f26256l;
        if (c2760q3.x().w().o(Z3.ANALYTICS_STORAGE)) {
        }
        boolean P102 = c2760q3.w().P();
        l7 C122 = c2760q3.C();
        String q112 = q();
        c2760q32 = C122.f25694a;
        if (c2760q32.e().getPackageManager() != null) {
        }
        C2760q3 c2760q3822 = this.f25694a;
        int b1022 = c2760q3822.x().w().b();
        String e1222 = c2760q3822.x().u().e();
        C2301m7.a();
        C2724m w1022 = c2760q3822.w();
        C2663e2 c2663e222 = AbstractC2671f2.f25970R0;
        if (w1022.H(null, c2663e222)) {
        }
        C2301m7.a();
        if (c2760q3822.w().H(null, c2663e222)) {
        }
        String R1022 = c2760q3822.w().R();
        String b1122 = new C2670f1(c2760q3822.w().O("google_analytics_default_allow_ad_personalization_signals", true)).b();
        C2760q3 c2760q3922 = this.f25694a;
        return new n7(q10, r10, str4, j14, str5, 133005L, j16, str, g10, z10, str2, min, i122, M102, z112, valueOf2, j11, list, l102, str62, str3, P102, j12, b1022, e1222, I10, J10, R1022, b1122, c2760q3922.f26266D, c2760q3922.N().q().zza());
    }

    final void p() {
        String format;
        h();
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.x().w().o(Z3.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            c2760q3.C().q0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            c2760q3.a().v().a("Analytics Storage consent is not granted");
            format = null;
        }
        c2760q3.a().v().a(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.f26259o = format;
        this.f26260p = c2760q3.f().a();
    }

    final String q() {
        j();
        AbstractC1287s.m(this.f26247c);
        return this.f26247c;
    }

    final String r() {
        h();
        j();
        AbstractC1287s.m(this.f26258n);
        return this.f26258n;
    }

    final String s() {
        j();
        AbstractC1287s.m(this.f26251g);
        return this.f26251g;
    }

    final int t() {
        j();
        return this.f26249e;
    }

    final long u() {
        return this.f26254j;
    }

    final int v() {
        j();
        return this.f26257m;
    }

    final List w() {
        return this.f26255k;
    }

    final boolean x(String str) {
        String str2 = this.f26261q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f26261q = str;
        return z10;
    }
}
