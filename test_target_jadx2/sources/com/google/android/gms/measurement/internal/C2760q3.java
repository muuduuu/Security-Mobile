package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC2316o4;
import com.google.android.gms.internal.measurement.C2301m7;
import com.google.android.gms.internal.measurement.EnumC2315o3;
import d7.C2998d;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2760q3 implements V3 {

    /* renamed from: E, reason: collision with root package name */
    private static volatile C2760q3 f26262E;

    /* renamed from: A, reason: collision with root package name */
    private int f26263A;

    /* renamed from: B, reason: collision with root package name */
    private int f26264B;

    /* renamed from: D, reason: collision with root package name */
    final long f26266D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f26267a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26268b;

    /* renamed from: c, reason: collision with root package name */
    private final C2668f f26269c;

    /* renamed from: d, reason: collision with root package name */
    private final C2724m f26270d;

    /* renamed from: e, reason: collision with root package name */
    private final Q2 f26271e;

    /* renamed from: f, reason: collision with root package name */
    private final C2 f26272f;

    /* renamed from: g, reason: collision with root package name */
    private final C2696i3 f26273g;

    /* renamed from: h, reason: collision with root package name */
    private final C2810w6 f26274h;

    /* renamed from: i, reason: collision with root package name */
    private final l7 f26275i;

    /* renamed from: j, reason: collision with root package name */
    private final C2798v2 f26276j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f26277k;

    /* renamed from: l, reason: collision with root package name */
    private final C2793u5 f26278l;

    /* renamed from: m, reason: collision with root package name */
    private final C2642b5 f26279m;

    /* renamed from: n, reason: collision with root package name */
    private final E0 f26280n;

    /* renamed from: o, reason: collision with root package name */
    private final C2682g5 f26281o;

    /* renamed from: p, reason: collision with root package name */
    private final String f26282p;

    /* renamed from: q, reason: collision with root package name */
    private C2782t2 f26283q;

    /* renamed from: r, reason: collision with root package name */
    private C2667e6 f26284r;

    /* renamed from: s, reason: collision with root package name */
    private C f26285s;

    /* renamed from: t, reason: collision with root package name */
    private C2759q2 f26286t;

    /* renamed from: u, reason: collision with root package name */
    private C2698i5 f26287u;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f26289w;

    /* renamed from: x, reason: collision with root package name */
    private long f26290x;

    /* renamed from: y, reason: collision with root package name */
    private volatile Boolean f26291y;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f26292z;

    /* renamed from: v, reason: collision with root package name */
    private boolean f26288v = false;

    /* renamed from: C, reason: collision with root package name */
    private final AtomicInteger f26265C = new AtomicInteger(0);

    C2760q3(C2689h4 c2689h4) {
        AbstractC1287s.m(c2689h4);
        Context context = c2689h4.f26086a;
        C2668f c2668f = new C2668f(context);
        this.f26269c = c2668f;
        Y1.f25741a = c2668f;
        this.f26267a = context;
        this.f26268b = c2689h4.f26090e;
        this.f26291y = c2689h4.f26087b;
        this.f26282p = c2689h4.f26092g;
        this.f26292z = true;
        AbstractC2316o4.b(context);
        com.google.android.gms.common.util.f d10 = com.google.android.gms.common.util.i.d();
        this.f26277k = d10;
        Long l10 = c2689h4.f26091f;
        this.f26266D = l10 != null ? l10.longValue() : d10.a();
        this.f26270d = new C2724m(this);
        Q2 q22 = new Q2(this);
        q22.m();
        this.f26271e = q22;
        C2 c22 = new C2(this);
        c22.m();
        this.f26272f = c22;
        l7 l7Var = new l7(this);
        l7Var.m();
        this.f26275i = l7Var;
        this.f26276j = new C2798v2(new C2681g4(c2689h4, this));
        this.f26280n = new E0(this);
        C2793u5 c2793u5 = new C2793u5(this);
        c2793u5.k();
        this.f26278l = c2793u5;
        C2642b5 c2642b5 = new C2642b5(this);
        c2642b5.k();
        this.f26279m = c2642b5;
        C2810w6 c2810w6 = new C2810w6(this);
        c2810w6.k();
        this.f26274h = c2810w6;
        C2682g5 c2682g5 = new C2682g5(this);
        c2682g5.m();
        this.f26281o = c2682g5;
        C2696i3 c2696i3 = new C2696i3(this);
        c2696i3.m();
        this.f26273g = c2696i3;
        com.google.android.gms.internal.measurement.H0 h02 = c2689h4.f26089d;
        boolean z10 = h02 == null || h02.f24224b == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(c2642b5);
            if (c2642b5.f25694a.f26267a.getApplicationContext() instanceof Application) {
                Application application = (Application) c2642b5.f25694a.f26267a.getApplicationContext();
                if (c2642b5.f25787c == null) {
                    c2642b5.f25787c = new N4(c2642b5);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(c2642b5.f25787c);
                    application.registerActivityLifecycleCallbacks(c2642b5.f25787c);
                    C2 c23 = c2642b5.f25694a.f26272f;
                    u(c23);
                    c23.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(c22);
            c22.r().a("Application context is not an Application");
        }
        c2696i3.t(new RunnableC2712k3(this, c2689h4));
    }

    public static C2760q3 O(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        Bundle bundle;
        if (h02 != null) {
            Bundle bundle2 = h02.f24226d;
            h02 = new com.google.android.gms.internal.measurement.H0(h02.f24223a, h02.f24224b, h02.f24225c, bundle2, null);
        }
        AbstractC1287s.m(context);
        AbstractC1287s.m(context.getApplicationContext());
        if (f26262E == null) {
            synchronized (C2760q3.class) {
                try {
                    if (f26262E == null) {
                        f26262E = new C2760q3(new C2689h4(context, h02, l10));
                    }
                } finally {
                }
            }
        } else if (h02 != null && (bundle = h02.f24226d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1287s.m(f26262E);
            f26262E.f26291y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1287s.m(f26262E);
        return f26262E;
    }

    static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void r(G1 g12) {
        if (g12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void s(T3 t32) {
        if (t32 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void t(AbstractC2687h2 abstractC2687h2) {
        if (abstractC2687h2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC2687h2.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2687h2.getClass())));
        }
    }

    private static final void u(U3 u32) {
        if (u32 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!u32.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(u32.getClass())));
        }
    }

    final C2696i3 A() {
        return this.f26273g;
    }

    public final C2642b5 B() {
        C2642b5 c2642b5 = this.f26279m;
        t(c2642b5);
        return c2642b5;
    }

    public final l7 C() {
        l7 l7Var = this.f26275i;
        s(l7Var);
        return l7Var;
    }

    public final C2798v2 D() {
        return this.f26276j;
    }

    public final C2782t2 E() {
        t(this.f26283q);
        return this.f26283q;
    }

    public final C2682g5 F() {
        C2682g5 c2682g5 = this.f26281o;
        u(c2682g5);
        return c2682g5;
    }

    public final boolean G() {
        return this.f26268b;
    }

    public final String H() {
        return this.f26282p;
    }

    public final C2793u5 I() {
        C2793u5 c2793u5 = this.f26278l;
        t(c2793u5);
        return c2793u5;
    }

    public final C2667e6 J() {
        t(this.f26284r);
        return this.f26284r;
    }

    public final C K() {
        u(this.f26285s);
        return this.f26285s;
    }

    public final C2759q2 L() {
        t(this.f26286t);
        return this.f26286t;
    }

    public final E0 M() {
        E0 e02 = this.f26280n;
        r(e02);
        return e02;
    }

    public final C2698i5 N() {
        r(this.f26287u);
        return this.f26287u;
    }

    final void P(boolean z10) {
        this.f26291y = Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final C2 a() {
        C2 c22 = this.f26272f;
        u(c22);
        return c22;
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final C2696i3 b() {
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        return c2696i3;
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final C2668f c() {
        return this.f26269c;
    }

    public final boolean d() {
        return this.f26291y != null && this.f26291y.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final Context e() {
        return this.f26267a;
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final com.google.android.gms.common.util.f f() {
        return this.f26277k;
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        c2696i3.h();
        C2724m c2724m = this.f26270d;
        if (c2724m.L()) {
            return 1;
        }
        u(c2696i3);
        c2696i3.h();
        if (!this.f26292z) {
            return 8;
        }
        Q2 q22 = this.f26271e;
        s(q22);
        Boolean t10 = q22.t();
        if (t10 != null) {
            return t10.booleanValue() ? 0 : 3;
        }
        C2668f c2668f = c2724m.f25694a.f26269c;
        Boolean J10 = c2724m.J("firebase_analytics_collection_enabled");
        return J10 != null ? J10.booleanValue() ? 0 : 4 : (this.f26291y == null || this.f26291y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z10) {
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        c2696i3.h();
        this.f26292z = z10;
    }

    public final boolean j() {
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        c2696i3.h();
        return this.f26292z;
    }

    final void k() {
        this.f26263A++;
    }

    final void l() {
        this.f26265C.incrementAndGet();
    }

    protected final boolean m() {
        if (!this.f26288v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        c2696i3.h();
        Boolean bool = this.f26289w;
        if (bool == null || this.f26290x == 0 || (!bool.booleanValue() && Math.abs(this.f26277k.c() - this.f26290x) > 1000)) {
            this.f26290x = this.f26277k.c();
            l7 l7Var = this.f26275i;
            s(l7Var);
            boolean z10 = false;
            if (l7Var.M("android.permission.INTERNET")) {
                s(l7Var);
                if (l7Var.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f26267a;
                    if (C2998d.a(context).f() || this.f26270d.m() || (l7.j0(context) && l7.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z10);
            this.f26289w = valueOf;
            if (valueOf.booleanValue()) {
                s(l7Var);
                this.f26289w = Boolean.valueOf(l7Var.o(L().r()));
            }
        }
        return this.f26289w.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r4.W() >= 234200) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        NetworkInfo activeNetworkInfo;
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        c2696i3.h();
        C2682g5 c2682g5 = this.f26281o;
        u(c2682g5);
        u(c2682g5);
        String q10 = L().q();
        if (!this.f26270d.M()) {
            C2 c22 = this.f26272f;
            u(c22);
            c22.w().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Q2 q22 = this.f26271e;
        s(q22);
        Pair o10 = q22.o(q10);
        if (((Boolean) o10.second).booleanValue() || TextUtils.isEmpty((CharSequence) o10.first)) {
            C2 c23 = this.f26272f;
            u(c23);
            c23.w().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        u(c2682g5);
        c2682g5.l();
        ConnectivityManager connectivityManager = (ConnectivityManager) c2682g5.f25694a.f26267a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
            if (activeNetworkInfo != null || !activeNetworkInfo.isConnected()) {
                C2 c24 = this.f26272f;
                u(c24);
                c24.r().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            C2667e6 J10 = J();
            J10.h();
            J10.j();
            if (J10.y()) {
                l7 l7Var = J10.f25694a.f26275i;
                s(l7Var);
            }
            C2642b5 c2642b5 = this.f26279m;
            t(c2642b5);
            C2760q3 c2760q3 = c2642b5.f25694a;
            c2642b5.h();
            C2748p l02 = c2760q3.J().l0();
            Bundle bundle = l02 != null ? l02.f26234a : null;
            if (bundle == null) {
                int i10 = this.f26264B;
                this.f26264B = i10 + 1;
                boolean z10 = i10 < 10;
                C2 c25 = this.f26272f;
                u(c25);
                String str = i10 < 10 ? "Retrying." : "Skipping.";
                A2 v10 = c25.v();
                StringBuilder sb3 = new StringBuilder(str.length() + 60);
                sb3.append("Failed to retrieve DMA consent from the service, ");
                sb3.append(str);
                sb3.append(" retryCount");
                v10.b(sb3.toString(), Integer.valueOf(this.f26264B));
                return z10;
            }
            C2633a4 e10 = C2633a4.e(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(e10.k());
            A h10 = A.h(bundle, 100);
            sb2.append("&dma=");
            sb2.append(!Objects.equals(h10.j(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(h10.k())) {
                sb2.append("&dma_cps=");
                sb2.append(h10.k());
            }
            int i11 = !Objects.equals(A.i(bundle), Boolean.TRUE) ? 1 : 0;
            sb2.append("&npa=");
            sb2.append(i11);
            C2 c26 = this.f26272f;
            u(c26);
            c26.w().b("Consent query parameters to Bow", sb2);
            l7 l7Var2 = this.f26275i;
            s(l7Var2);
            L().f25694a.f26270d.A();
            String str2 = (String) o10.first;
            Q2 q23 = this.f26271e;
            s(q23);
            URL i02 = l7Var2.i0(133005L, q10, str2, (-1) + q23.f25649v.a(), sb2.toString());
            if (i02 != null) {
                C2682g5 c2682g52 = this.f26281o;
                u(c2682g52);
                InterfaceC2658d5 interfaceC2658d5 = new InterfaceC2658d5() { // from class: com.google.android.gms.measurement.internal.l3
                    @Override // com.google.android.gms.measurement.internal.InterfaceC2658d5
                    public final /* synthetic */ void a(String str3, int i12, Throwable th, byte[] bArr, Map map) {
                        C2760q3.this.o(str3, i12, th, bArr, map);
                    }
                };
                c2682g52.l();
                AbstractC1287s.m(i02);
                AbstractC1287s.m(interfaceC2658d5);
                C2696i3 c2696i32 = c2682g52.f25694a.f26273g;
                u(c2696i32);
                c2696i32.w(new RunnableC2674f5(c2682g52, q10, i02, null, null, interfaceC2658d5));
            }
            return false;
        }
        activeNetworkInfo = null;
        if (activeNetworkInfo != null) {
        }
        C2 c242 = this.f26272f;
        u(c242);
        c242.r().a("Network is not available for Deferred Deep Link request. Skipping");
        return false;
    }

    final /* synthetic */ void o(String str, int i10, Throwable th, byte[] bArr, Map map) {
        int i11;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (i10 == 200 || i10 == 204) {
            i11 = i10;
        } else {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
                C2 c22 = this.f26272f;
                u(c22);
                c22.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th);
            }
        }
        if (th == null) {
            Q2 q22 = this.f26271e;
            s(q22);
            q22.f25648u.b(true);
            if (bArr == null || bArr.length == 0) {
                C2 c23 = this.f26272f;
                u(c23);
                c23.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                if (TextUtils.isEmpty(optString)) {
                    C2 c24 = this.f26272f;
                    u(c24);
                    c24.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                String optString3 = jSONObject.optString("gbraid", BuildConfig.FLAVOR);
                String optString4 = jSONObject.optString("gad_source", BuildConfig.FLAVOR);
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle2 = new Bundle();
                l7 l7Var = this.f26275i;
                s(l7Var);
                C2760q3 c2760q3 = l7Var.f25694a;
                if (!TextUtils.isEmpty(optString)) {
                    Context context = c2760q3.f26267a;
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle2.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle2.putString("gad_source", optString4);
                        }
                        bundle2.putString("gclid", optString2);
                        bundle2.putString("_cis", "ddp");
                        this.f26279m.t("auto", "_cmp", bundle2);
                        s(l7Var);
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = l7Var.f25694a.f26267a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                }
                                makeBasic = BroadcastOptions.makeBasic();
                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                bundle = shareIdentityEnabled.toBundle();
                                context2.sendBroadcast(intent, null, bundle);
                                return;
                            }
                            return;
                        } catch (RuntimeException e10) {
                            C2 c25 = l7Var.f25694a.f26272f;
                            u(c25);
                            c25.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                C2 c26 = this.f26272f;
                u(c26);
                c26.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (JSONException e11) {
                C2 c27 = this.f26272f;
                u(c27);
                c27.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        C2 c222 = this.f26272f;
        u(c222);
        c222.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th);
    }

    final /* synthetic */ void p(C2689h4 c2689h4) {
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        c2696i3.h();
        C2724m c2724m = this.f26270d;
        c2724m.u();
        C c10 = new C(this);
        c10.m();
        this.f26285s = c10;
        com.google.android.gms.internal.measurement.H0 h02 = c2689h4.f26089d;
        C2759q2 c2759q2 = new C2759q2(this, c2689h4.f26088c, h02 == null ? 0L : h02.f24223a);
        c2759q2.k();
        this.f26286t = c2759q2;
        C2782t2 c2782t2 = new C2782t2(this);
        c2782t2.k();
        this.f26283q = c2782t2;
        C2667e6 c2667e6 = new C2667e6(this);
        c2667e6.k();
        this.f26284r = c2667e6;
        l7 l7Var = this.f26275i;
        l7Var.n();
        this.f26271e.n();
        this.f26286t.l();
        C2698i5 c2698i5 = new C2698i5(this);
        c2698i5.k();
        this.f26287u = c2698i5;
        c2698i5.l();
        C2 c22 = this.f26272f;
        u(c22);
        A2 u10 = c22.u();
        c2724m.A();
        u10.b("App measurement initialized, version", 133005L);
        u(c22);
        c22.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q10 = c2759q2.q();
        s(l7Var);
        if (l7Var.P(q10, c2724m.R())) {
            u(c22);
            c22.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(c22);
            c22.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(q10)));
        }
        u(c22);
        c22.v().a("Debug-level message logging enabled");
        int i10 = this.f26263A;
        AtomicInteger atomicInteger = this.f26265C;
        if (i10 != atomicInteger.get()) {
            u(c22);
            c22.o().c("Not all components initialized", Integer.valueOf(this.f26263A), Integer.valueOf(atomicInteger.get()));
        }
        this.f26288v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r1.G() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void v(com.google.android.gms.internal.measurement.H0 h02) {
        C2633a4 a10;
        C2642b5 c2642b5;
        X3 O10;
        X3 O11;
        Bundle bundle;
        A h10;
        Boolean J10;
        N2 n22;
        C2696i3 c2696i3 = this.f26273g;
        u(c2696i3);
        c2696i3.h();
        EnumC2315o3 q10 = N().q();
        EnumC2315o3 enumC2315o3 = EnumC2315o3.CLIENT_UPLOAD_ELIGIBLE;
        C2301m7.a();
        C2663e2 c2663e2 = AbstractC2671f2.f25970R0;
        C2724m c2724m = this.f26270d;
        boolean H10 = c2724m.H(null, c2663e2);
        boolean z10 = q10 == enumC2315o3;
        if (H10) {
            l7 l7Var = this.f26275i;
            s(l7Var);
        }
        if (z10) {
            z10 = true;
            l7 l7Var2 = this.f26275i;
            s(l7Var2);
            l7Var2.h();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            s7 s7Var = new s7(l7Var2.f25694a);
            C2760q3 c2760q3 = l7Var2.f25694a;
            androidx.core.content.a.k(c2760q3.f26267a, s7Var, intentFilter, 2);
            C2 c22 = c2760q3.f26272f;
            u(c22);
            c22.v().a("Registered app receiver");
            if (z10) {
                N().o(((Long) AbstractC2671f2.f25939C.b(null)).longValue());
            }
        }
        Q2 q22 = this.f26271e;
        s(q22);
        C2633a4 w10 = q22.w();
        int b10 = w10.b();
        X3 O12 = c2724m.O("google_analytics_default_allow_ad_storage", false);
        X3 O13 = c2724m.O("google_analytics_default_allow_analytics_storage", false);
        X3 x32 = X3.UNINITIALIZED;
        if (O12 != x32 || O13 != x32) {
            s(q22);
            if (q22.v(-10)) {
                a10 = C2633a4.a(O12, O13, -10);
                if (a10 != null) {
                    C2642b5 c2642b52 = this.f26279m;
                    t(c2642b52);
                    c2642b52.q0(a10, true);
                    w10 = a10;
                }
                c2642b5 = this.f26279m;
                t(c2642b5);
                c2642b5.o(w10);
                s(q22);
                int b11 = q22.u().b();
                O10 = c2724m.O("google_analytics_default_allow_ad_personalization_signals", true);
                if (O10 != x32) {
                    C2 c23 = this.f26272f;
                    u(c23);
                    c23.w().b("Default ad personalization consent from Manifest", O10);
                }
                O11 = c2724m.O("google_analytics_default_allow_ad_user_data", true);
                if (O11 == x32 && C2633a4.u(-10, b11)) {
                    t(c2642b5);
                    c2642b5.p0(A.a(O11, -10), true);
                } else if (TextUtils.isEmpty(L().r()) && (b11 == 0 || b11 == 30)) {
                    t(c2642b5);
                    c2642b5.p0(new A((Boolean) null, -10, (Boolean) null, (String) null), true);
                } else if (TextUtils.isEmpty(L().r()) && h02 != null && (bundle = h02.f24226d) != null && C2633a4.u(30, b11)) {
                    h10 = A.h(bundle, 30);
                    if (h10.d()) {
                        t(c2642b5);
                        c2642b5.p0(h10, true);
                    }
                }
                J10 = c2724m.J("google_analytics_tcf_data_enabled");
                if (J10 != null || J10.booleanValue()) {
                    C2 c24 = this.f26272f;
                    u(c24);
                    c24.v().a("TCF client enabled.");
                    t(c2642b5);
                    c2642b5.s();
                    t(c2642b5);
                    c2642b5.r();
                }
                s(q22);
                n22 = q22.f25633f;
                if (n22.a() == 0) {
                    C2 c25 = this.f26272f;
                    u(c25);
                    long j10 = this.f26266D;
                    c25.w().b("Persisting first open", Long.valueOf(j10));
                    s(q22);
                    n22.b(j10);
                }
                t(c2642b5);
                c2642b5.f25802r.c();
                if (!m()) {
                    if (!TextUtils.isEmpty(L().r())) {
                        l7 l7Var3 = this.f26275i;
                        s(l7Var3);
                        String r10 = L().r();
                        s(q22);
                        q22.h();
                        if (l7Var3.p(r10, q22.p().getString("gmp_app_id", null))) {
                            C2 c26 = this.f26272f;
                            u(c26);
                            c26.u().a("Rechecking which service to use due to a GMP App Id change");
                            s(q22);
                            q22.h();
                            Boolean t10 = q22.t();
                            SharedPreferences.Editor edit = q22.p().edit();
                            edit.clear();
                            edit.apply();
                            if (t10 != null) {
                                q22.s(t10);
                            }
                            E().o();
                            this.f26284r.A();
                            this.f26284r.w();
                            s(q22);
                            n22.b(this.f26266D);
                            s(q22);
                            q22.f25635h.b(null);
                        }
                        s(q22);
                        String r11 = L().r();
                        q22.h();
                        SharedPreferences.Editor edit2 = q22.p().edit();
                        edit2.putString("gmp_app_id", r11);
                        edit2.apply();
                    }
                    s(q22);
                    if (!q22.w().o(Z3.ANALYTICS_STORAGE)) {
                        s(q22);
                        q22.f25635h.b(null);
                    }
                    t(c2642b5);
                    s(q22);
                    c2642b5.E(q22.f25635h.a());
                    l7 l7Var4 = this.f26275i;
                    s(l7Var4);
                    try {
                        l7Var4.f25694a.f26267a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    } catch (ClassNotFoundException unused) {
                        Q2 q23 = this.f26271e;
                        s(q23);
                        P2 p22 = q23.f25650w;
                        if (!TextUtils.isEmpty(p22.a())) {
                            C2 c27 = this.f26272f;
                            u(c27);
                            c27.r().a("Remote config removed with active feature rollouts");
                            s(q23);
                            p22.b(null);
                        }
                    }
                    if (!TextUtils.isEmpty(L().r())) {
                        boolean g10 = g();
                        Q2 q24 = this.f26271e;
                        s(q24);
                        if (!q24.z() && !this.f26270d.L()) {
                            s(q24);
                            q24.y(!g10);
                        }
                        if (g10) {
                            C2642b5 c2642b53 = this.f26279m;
                            t(c2642b53);
                            c2642b53.H();
                        }
                        C2810w6 c2810w6 = this.f26274h;
                        t(c2810w6);
                        c2810w6.f26443e.a();
                        J().q(new AtomicReference());
                        C2667e6 J11 = J();
                        s(q24);
                        J11.v(q24.f25653z.a());
                    }
                } else if (g()) {
                    l7 l7Var5 = this.f26275i;
                    s(l7Var5);
                    if (!l7Var5.M("android.permission.INTERNET")) {
                        C2 c28 = this.f26272f;
                        u(c28);
                        c28.o().a("App is missing INTERNET permission");
                    }
                    s(l7Var5);
                    if (!l7Var5.M("android.permission.ACCESS_NETWORK_STATE")) {
                        C2 c29 = this.f26272f;
                        u(c29);
                        c29.o().a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    Context context = this.f26267a;
                    if (!C2998d.a(context).f() && !this.f26270d.m()) {
                        if (!l7.j0(context)) {
                            C2 c210 = this.f26272f;
                            u(c210);
                            c210.o().a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!l7.E(context, false)) {
                            C2 c211 = this.f26272f;
                            u(c211);
                            c211.o().a("AppMeasurementService not registered/enabled");
                        }
                    }
                    C2 c212 = this.f26272f;
                    u(c212);
                    c212.o().a("Uploading is not possible. App measurement disabled");
                }
                C2301m7.a();
                if (this.f26270d.H(null, AbstractC2671f2.f25970R0)) {
                    l7 l7Var6 = this.f26275i;
                    s(l7Var6);
                    if (l7Var6.G()) {
                        long max = Math.max(500L, ((((Integer) AbstractC2671f2.f26048y0.b(null)).intValue() * 1000) + new Random().nextInt(5000)) - this.f26277k.c());
                        if (max > 500) {
                            C2 c213 = this.f26272f;
                            u(c213);
                            c213.w().b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(max));
                        }
                        C2642b5 c2642b54 = this.f26279m;
                        t(c2642b54);
                        c2642b54.s0(max);
                    }
                }
                Q2 q25 = this.f26271e;
                s(q25);
                q25.f25643p.b(true);
            }
        }
        if (!TextUtils.isEmpty(L().r()) && (b10 == 0 || b10 == 30 || b10 == 10 || b10 == 40)) {
            C2642b5 c2642b55 = this.f26279m;
            t(c2642b55);
            c2642b55.q0(new C2633a4(null, null, -10), false);
        }
        a10 = null;
        if (a10 != null) {
        }
        c2642b5 = this.f26279m;
        t(c2642b5);
        c2642b5.o(w10);
        s(q22);
        int b112 = q22.u().b();
        O10 = c2724m.O("google_analytics_default_allow_ad_personalization_signals", true);
        if (O10 != x32) {
        }
        O11 = c2724m.O("google_analytics_default_allow_ad_user_data", true);
        if (O11 == x32) {
        }
        if (TextUtils.isEmpty(L().r())) {
        }
        if (TextUtils.isEmpty(L().r())) {
            h10 = A.h(bundle, 30);
            if (h10.d()) {
            }
        }
        J10 = c2724m.J("google_analytics_tcf_data_enabled");
        if (J10 != null) {
        }
        C2 c242 = this.f26272f;
        u(c242);
        c242.v().a("TCF client enabled.");
        t(c2642b5);
        c2642b5.s();
        t(c2642b5);
        c2642b5.r();
        s(q22);
        n22 = q22.f25633f;
        if (n22.a() == 0) {
        }
        t(c2642b5);
        c2642b5.f25802r.c();
        if (!m()) {
        }
        C2301m7.a();
        if (this.f26270d.H(null, AbstractC2671f2.f25970R0)) {
        }
        Q2 q252 = this.f26271e;
        s(q252);
        q252.f25643p.b(true);
    }

    public final C2724m w() {
        return this.f26270d;
    }

    public final Q2 x() {
        Q2 q22 = this.f26271e;
        s(q22);
        return q22;
    }

    public final C2 y() {
        C2 c22 = this.f26272f;
        if (c22 == null || !c22.k()) {
            return null;
        }
        return c22;
    }

    public final C2810w6 z() {
        C2810w6 c2810w6 = this.f26274h;
        t(c2810w6);
        return c2810w6;
    }
}
