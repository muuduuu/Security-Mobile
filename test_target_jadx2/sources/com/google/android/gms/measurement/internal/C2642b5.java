package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.google.android.gms.internal.measurement.C2301m7;
import com.google.android.gms.internal.measurement.EnumC2342r4;
import com.google.android.gms.internal.measurement.EnumC2351s4;
import com.google.common.collect.j;
import f1.AbstractC3136a;
import h8.AbstractC3297b;
import j0.C3476a;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2642b5 extends AbstractC2687h2 {

    /* renamed from: c, reason: collision with root package name */
    protected N4 f25787c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2665e4 f25788d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f25789e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25790f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f25791g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f25792h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25793i;

    /* renamed from: j, reason: collision with root package name */
    private int f25794j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC2827z f25795k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC2827z f25796l;

    /* renamed from: m, reason: collision with root package name */
    private PriorityQueue f25797m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25798n;

    /* renamed from: o, reason: collision with root package name */
    private C2633a4 f25799o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicLong f25800p;

    /* renamed from: q, reason: collision with root package name */
    private long f25801q;

    /* renamed from: r, reason: collision with root package name */
    final t7 f25802r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f25803s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC2827z f25804t;

    /* renamed from: u, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f25805u;

    /* renamed from: v, reason: collision with root package name */
    private AbstractC2827z f25806v;

    /* renamed from: w, reason: collision with root package name */
    private final k7 f25807w;

    protected C2642b5(C2760q3 c2760q3) {
        super(c2760q3);
        this.f25789e = new CopyOnWriteArraySet();
        this.f25792h = new Object();
        this.f25793i = false;
        this.f25794j = 1;
        this.f25803s = true;
        this.f25807w = new C4(this);
        this.f25791g = new AtomicReference();
        this.f25799o = C2633a4.f25768c;
        this.f25801q = -1L;
        this.f25800p = new AtomicLong(0L);
        this.f25802r = new t7(c2760q3);
    }

    private final EnumC2706j5 e0(final G6 g62) {
        try {
            URL url = new URI(g62.f25426c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String s10 = this.f25694a.L().s();
            C2760q3 c2760q3 = this.f25694a;
            A2 w10 = c2760q3.a().w();
            Long valueOf = Long.valueOf(g62.f25424a);
            w10.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, g62.f25426c, Integer.valueOf(g62.f25425b.length));
            if (!TextUtils.isEmpty(g62.f25430g)) {
                c2760q3.a().w().c("[sgtm] Uploading data from app. row_id", valueOf, g62.f25430g);
            }
            HashMap hashMap = new HashMap();
            Bundle bundle = g62.f25427d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            C2682g5 F10 = c2760q3.F();
            byte[] bArr = g62.f25425b;
            InterfaceC2658d5 interfaceC2658d5 = new InterfaceC2658d5() { // from class: com.google.android.gms.measurement.internal.O4
                /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
                @Override // com.google.android.gms.measurement.internal.InterfaceC2658d5
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ void a(String str2, int i10, Throwable th, byte[] bArr2, Map map) {
                    EnumC2706j5 enumC2706j5;
                    AtomicReference atomicReference2;
                    C2642b5 c2642b5 = C2642b5.this;
                    c2642b5.h();
                    G6 g63 = g62;
                    if (i10 != 200 && i10 != 204) {
                        if (i10 == 304) {
                            i10 = 304;
                        }
                        c2642b5.f25694a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(g63.f25424a), Integer.valueOf(i10), th);
                        enumC2706j5 = !Arrays.asList(((String) AbstractC2671f2.f26039u.b(null)).split(",")).contains(String.valueOf(i10)) ? EnumC2706j5.BACKOFF : EnumC2706j5.FAILURE;
                        atomicReference2 = atomicReference;
                        C2667e6 J10 = c2642b5.f25694a.J();
                        long j10 = g63.f25424a;
                        J10.k0(new C2676g(j10, enumC2706j5.zza(), g63.f25429f));
                        c2642b5.f25694a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j10), enumC2706j5);
                        synchronized (atomicReference2) {
                            atomicReference2.set(enumC2706j5);
                            atomicReference2.notifyAll();
                        }
                        return;
                    }
                    if (th == null) {
                        c2642b5.f25694a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(g63.f25424a));
                        enumC2706j5 = EnumC2706j5.SUCCESS;
                        atomicReference2 = atomicReference;
                        C2667e6 J102 = c2642b5.f25694a.J();
                        long j102 = g63.f25424a;
                        J102.k0(new C2676g(j102, enumC2706j5.zza(), g63.f25429f));
                        c2642b5.f25694a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j102), enumC2706j5);
                        synchronized (atomicReference2) {
                        }
                    }
                    c2642b5.f25694a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(g63.f25424a), Integer.valueOf(i10), th);
                    if (!Arrays.asList(((String) AbstractC2671f2.f26039u.b(null)).split(",")).contains(String.valueOf(i10))) {
                    }
                    atomicReference2 = atomicReference;
                    C2667e6 J1022 = c2642b5.f25694a.J();
                    long j1022 = g63.f25424a;
                    J1022.k0(new C2676g(j1022, enumC2706j5.zza(), g63.f25429f));
                    c2642b5.f25694a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j1022), enumC2706j5);
                    synchronized (atomicReference2) {
                    }
                }
            };
            F10.l();
            AbstractC1287s.m(url);
            AbstractC1287s.m(bArr);
            AbstractC1287s.m(interfaceC2658d5);
            F10.f25694a.b().w(new RunnableC2674f5(F10, s10, url, bArr, hashMap, interfaceC2658d5));
            try {
                C2760q3 c2760q32 = c2760q3.C().f25694a;
                long a10 = c2760q32.f().a() + 60000;
                synchronized (atomicReference) {
                    for (long j10 = 60000; atomicReference.get() == null && j10 > 0; j10 = a10 - c2760q32.f().a()) {
                        try {
                            atomicReference.wait(j10);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f25694a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? EnumC2706j5.UNKNOWN : (EnumC2706j5) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f25694a.a().o().d("[sgtm] Bad upload url for row_id", g62.f25426c, Long.valueOf(g62.f25424a), e10);
            return EnumC2706j5.FAILURE;
        }
    }

    private final void f0(Boolean bool, boolean z10) {
        h();
        j();
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.a().v().b("Setting app measurement enabled (FE)", bool);
        c2760q3.x().s(bool);
        if (z10) {
            Q2 x10 = c2760q3.x();
            C2760q3 c2760q32 = x10.f25694a;
            x10.h();
            SharedPreferences.Editor edit = x10.p().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f25694a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        h();
        C2760q3 c2760q3 = this.f25694a;
        String a10 = c2760q3.x().f25641n.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                B("app", "_npa", null, c2760q3.f().a());
            } else {
                B("app", "_npa", Long.valueOf(true != "true".equals(a10) ? 0L : 1L), c2760q3.f().a());
            }
        }
        if (!this.f25694a.g() || !this.f25803s) {
            c2760q3.a().v().a("Updating Scion state (FE)");
            this.f25694a.J().X();
        } else {
            c2760q3.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            this.f25694a.z().f26443e.a();
            c2760q3.b().t(new RunnableC2745o4(this));
        }
    }

    final void A(String str, String str2, long j10, Object obj) {
        this.f25694a.b().t(new RunnableC2784t4(this, str, str2, obj, j10));
    }

    final void B(String str, String str2, Object obj, long j10) {
        AbstractC1287s.g(str);
        AbstractC1287s.g(str2);
        h();
        j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    C2760q3 c2760q3 = this.f25694a;
                    Long valueOf = Long.valueOf(j11);
                    c2760q3.x().f25641n.b(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    this.f25694a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                    obj2 = obj;
                }
            }
            if (obj == null) {
                this.f25694a.x().f25641n.b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f25694a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        C2760q3 c2760q32 = this.f25694a;
        if (!c2760q32.g()) {
            this.f25694a.a().w().a("User property not set since app measurement is disabled");
        } else if (c2760q32.m()) {
            this.f25694a.J().o(new h7(str4, j10, obj3, str));
        }
    }

    public final Map C(String str, String str2, boolean z10) {
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.b().p()) {
            c2760q3.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        c2760q3.c();
        if (C2668f.a()) {
            c2760q3.a().o().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f25694a.b().u(atomicReference, 5000L, "get user properties", new A4(this, atomicReference, null, str, str2, z10));
        List<h7> list = (List) atomicReference.get();
        if (list == null) {
            c2760q3.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        C3476a c3476a = new C3476a(list.size());
        for (h7 h7Var : list) {
            Object j10 = h7Var.j();
            if (j10 != null) {
                c3476a.put(h7Var.f26096b, j10);
            }
        }
        return c3476a;
    }

    public final String D() {
        return (String) this.f25791g.get();
    }

    final void E(String str) {
        this.f25791g.set(str);
    }

    public final void F() {
        h();
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.x().f25648u.a()) {
            c2760q3.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = c2760q3.x().f25649v.a();
        c2760q3.x().f25649v.b(1 + a10);
        c2760q3.w();
        if (a10 >= 5) {
            c2760q3.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            c2760q3.x().f25648u.b(true);
        } else {
            if (this.f25804t == null) {
                this.f25804t = new C2800v4(this, this.f25694a);
            }
            this.f25804t.b(0L);
        }
    }

    public final void G(long j10) {
        this.f25791g.set(null);
        this.f25694a.b().t(new RunnableC2808w4(this, j10));
    }

    public final void H() {
        h();
        j();
        if (this.f25694a.m()) {
            C2760q3 c2760q3 = this.f25694a;
            C2724m w10 = c2760q3.w();
            w10.f25694a.c();
            Boolean J10 = w10.J("google_analytics_deferred_deep_link_enabled");
            if (J10 != null && J10.booleanValue()) {
                c2760q3.a().v().a("Deferred Deep Link feature enabled.");
                c2760q3.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.Y4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C2642b5.this.F();
                    }
                });
            }
            this.f25694a.J().s();
            this.f25803s = false;
            Q2 x10 = c2760q3.x();
            x10.h();
            String string = x10.p().getString("previous_os_version", null);
            x10.f25694a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = x10.p().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c2760q3.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(InterfaceC2665e4 interfaceC2665e4) {
        InterfaceC2665e4 interfaceC2665e42;
        h();
        j();
        if (interfaceC2665e4 != null && interfaceC2665e4 != (interfaceC2665e42 = this.f25788d)) {
            AbstractC1287s.q(interfaceC2665e42 == null, "EventInterceptor already set.");
        }
        this.f25788d = interfaceC2665e4;
    }

    public final void J(InterfaceC2673f4 interfaceC2673f4) {
        j();
        AbstractC1287s.m(interfaceC2673f4);
        if (this.f25789e.add(interfaceC2673f4)) {
            return;
        }
        this.f25694a.a().r().a("OnEventListener already registered");
    }

    public final void K(InterfaceC2673f4 interfaceC2673f4) {
        j();
        AbstractC1287s.m(interfaceC2673f4);
        if (this.f25789e.remove(interfaceC2673f4)) {
            return;
        }
        this.f25694a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        AbstractC1287s.g(str);
        this.f25694a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f25694a.f().a());
    }

    public final void N(Bundle bundle, long j10) {
        AbstractC1287s.m(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f25694a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC1287s.m(bundle2);
        W3.b(bundle2, "app_id", String.class, null);
        W3.b(bundle2, "origin", String.class, null);
        W3.b(bundle2, "name", String.class, null);
        W3.b(bundle2, "value", Object.class, null);
        W3.b(bundle2, "trigger_event_name", String.class, null);
        W3.b(bundle2, "trigger_timeout", Long.class, 0L);
        W3.b(bundle2, "timed_out_event_name", String.class, null);
        W3.b(bundle2, "timed_out_event_params", Bundle.class, null);
        W3.b(bundle2, "triggered_event_name", String.class, null);
        W3.b(bundle2, "triggered_event_params", Bundle.class, null);
        W3.b(bundle2, "time_to_live", Long.class, 0L);
        W3.b(bundle2, "expired_event_name", String.class, null);
        W3.b(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1287s.g(bundle2.getString("name"));
        AbstractC1287s.g(bundle2.getString("origin"));
        AbstractC1287s.m(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.C().y0(string) != 0) {
            c2760q3.a().o().b("Invalid conditional user property name", c2760q3.D().c(string));
            return;
        }
        if (c2760q3.C().y(string, obj) != 0) {
            c2760q3.a().o().c("Invalid conditional user property value", c2760q3.D().c(string), obj);
            return;
        }
        Object z10 = c2760q3.C().z(string, obj);
        if (z10 == null) {
            c2760q3.a().o().c("Unable to normalize conditional user property value", c2760q3.D().c(string), obj);
            return;
        }
        W3.a(bundle2, z10);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c2760q3.w();
            if (j11 > 15552000000L || j11 < 1) {
                c2760q3.a().o().c("Invalid conditional user property timeout", c2760q3.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        c2760q3.w();
        if (j12 > 15552000000L || j12 < 1) {
            c2760q3.a().o().c("Invalid conditional user property time to live", c2760q3.D().c(string), Long.valueOf(j12));
        } else {
            c2760q3.b().t(new RunnableC2816x4(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        C2760q3 c2760q3 = this.f25694a;
        long a10 = c2760q3.f().a();
        AbstractC1287s.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        c2760q3.b().t(new RunnableC2824y4(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.b().p()) {
            c2760q3.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c2760q3.c();
        if (C2668f.a()) {
            c2760q3.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f25694a.b().u(atomicReference, 5000L, "get conditional user properties", new RunnableC2832z4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return l7.h0(list);
        }
        c2760q3.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        C2730m5 u10 = this.f25694a.I().u();
        if (u10 != null) {
            return u10.f26172a;
        }
        return null;
    }

    public final String R() {
        C2730m5 u10 = this.f25694a.I().u();
        if (u10 != null) {
            return u10.f26173b;
        }
        return null;
    }

    public final String S() {
        try {
            return AbstractC2722l5.a(this.f25694a.e(), "google_app_id", this.f25694a.H());
        } catch (IllegalStateException e10) {
            this.f25694a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        C2760q3 c2760q3 = this.f25694a;
        if (!c2760q3.w().H(null, AbstractC2671f2.f25989a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                c2760q3.a().w().a("IABTCF_TCString change picked up in listener.");
                ((AbstractC2827z) AbstractC1287s.m(this.f25806v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            c2760q3.a().w().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC2827z) AbstractC1287s.m(this.f25806v)).b(500L);
        }
    }

    final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            C2760q3 c2760q3 = this.f25694a;
            bundle2 = new Bundle(c2760q3.x().f25653z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (c2760q3.C().B0(obj)) {
                        c2760q3.C().B(this.f25807w, null, 27, null, null, 0);
                    }
                    c2760q3.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (l7.N(next)) {
                    c2760q3.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (c2760q3.C().C0("param", next, c2760q3.w().x(null, false), obj)) {
                    c2760q3.C().A(bundle2, next, obj);
                }
            }
            c2760q3.C();
            int v10 = c2760q3.w().v();
            if (bundle2.size() > v10) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > v10) {
                        bundle2.remove(str);
                    }
                }
                c2760q3.C().B(this.f25807w, null, 26, null, null, 0);
                c2760q3.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        C2760q3 c2760q32 = this.f25694a;
        c2760q32.x().f25653z.b(bundle2);
        if (!bundle.isEmpty() || c2760q32.w().H(null, AbstractC2671f2.f25982X0)) {
            this.f25694a.J().v(bundle2);
        }
    }

    final /* synthetic */ void V(int i10) {
        if (this.f25795k == null) {
            this.f25795k = new C2729m4(this, this.f25694a);
        }
        this.f25795k.b(i10 * 1000);
    }

    final /* synthetic */ void W(Boolean bool, boolean z10) {
        f0(bool, true);
    }

    final /* synthetic */ void X(C2633a4 c2633a4, long j10, boolean z10, boolean z11) {
        h();
        j();
        C2760q3 c2760q3 = this.f25694a;
        C2633a4 w10 = c2760q3.x().w();
        if (j10 <= this.f25801q && C2633a4.u(w10.b(), c2633a4.b())) {
            c2760q3.a().u().b("Dropped out-of-date consent setting, proposed settings", c2633a4);
            return;
        }
        Q2 x10 = c2760q3.x();
        C2760q3 c2760q32 = x10.f25694a;
        x10.h();
        int b10 = c2633a4.b();
        if (!x10.v(b10)) {
            c2760q3.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c2633a4.b()));
            return;
        }
        C2760q3 c2760q33 = this.f25694a;
        SharedPreferences.Editor edit = x10.p().edit();
        edit.putString("consent_settings", c2633a4.l());
        edit.putInt("consent_source", b10);
        edit.apply();
        c2760q3.a().w().b("Setting storage consent(FE)", c2633a4);
        this.f25801q = j10;
        if (c2760q33.J().D()) {
            c2760q33.J().Z(z10);
        } else {
            c2760q33.J().Y(z10);
        }
        if (z11) {
            c2760q33.J().q(new AtomicReference());
        }
    }

    final /* synthetic */ void Z(boolean z10) {
        this.f25793i = false;
    }

    final /* synthetic */ int a0() {
        return this.f25794j;
    }

    final /* synthetic */ void b0(int i10) {
        this.f25794j = i10;
    }

    final /* synthetic */ AbstractC2827z c0() {
        return this.f25804t;
    }

    final /* synthetic */ int d0(Throwable th) {
        String message = th.getMessage();
        this.f25798n = false;
        int i10 = 2;
        if (message != null) {
            if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                i10 = 1;
                if (message.contains("Background")) {
                    this.f25798n = true;
                    return 1;
                }
            } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                return 3;
            }
        }
        return i10;
    }

    public final void h0() {
        C2760q3 c2760q3 = this.f25694a;
        if (!(c2760q3.e().getApplicationContext() instanceof Application) || this.f25787c == null) {
            return;
        }
        ((Application) c2760q3.e().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f25787c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f25694a.b().u(atomicReference, 15000L, "boolean test flag value", new RunnableC2792u4(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f25694a.b().u(atomicReference, 15000L, "String test flag value", new D4(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f25694a.b().u(atomicReference, 15000L, "long test flag value", new E4(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f25694a.b().u(atomicReference, 15000L, "int test flag value", new F4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f25694a.b().u(atomicReference, 15000L, "double test flag value", new G4(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f25694a.b().t(new H4(this, bool));
    }

    final void o(C2633a4 c2633a4) {
        h();
        boolean z10 = (c2633a4.o(Z3.ANALYTICS_STORAGE) && c2633a4.o(Z3.AD_STORAGE)) || this.f25694a.J().C();
        C2760q3 c2760q3 = this.f25694a;
        if (z10 != c2760q3.j()) {
            c2760q3.i(z10);
            Q2 x10 = this.f25694a.x();
            C2760q3 c2760q32 = x10.f25694a;
            x10.h();
            Boolean valueOf = x10.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(x10.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    final void o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        C2633a4 c2633a4 = C2633a4.f25768c;
        Z3[] zzb = Y3.STORAGE.zzb();
        int length = zzb.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = zzb[i11].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            C2760q3 c2760q3 = this.f25694a;
            c2760q3.a().t().b("Ignoring invalid consent setting", obj);
            c2760q3.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean p10 = this.f25694a.b().p();
        C2633a4 e10 = C2633a4.e(bundle, i10);
        if (e10.c()) {
            q0(e10, p10);
        }
        A h10 = A.h(bundle, i10);
        if (h10.d()) {
            p0(h10, p10);
        }
        Boolean i12 = A.i(bundle);
        if (i12 != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (p10) {
                B(str2, "allow_personalized_ads", i12.toString(), j10);
            } else {
                z(str2, "allow_personalized_ads", i12.toString(), false, j10);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f25694a.f().a());
    }

    final void p0(A a10, boolean z10) {
        I4 i42 = new I4(this, a10);
        if (!z10) {
            this.f25694a.b().t(i42);
        } else {
            h();
            i42.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f25694a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f25788d != null && !l7.N(str2)) {
            z12 = false;
        }
        x(str == null ? "app" : str, str2, j10, bundle2, z11, z12, z10, null);
    }

    public final void q0(C2633a4 c2633a4, boolean z10) {
        boolean z11;
        C2633a4 c2633a42;
        boolean z12;
        boolean z13;
        j();
        int b10 = c2633a4.b();
        if (b10 != -10) {
            X3 p10 = c2633a4.p();
            X3 x32 = X3.UNINITIALIZED;
            if (p10 == x32 && c2633a4.q() == x32) {
                this.f25694a.a().t().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f25792h) {
            try {
                z11 = false;
                if (C2633a4.u(b10, this.f25799o.b())) {
                    z12 = c2633a4.r(this.f25799o);
                    Z3 z32 = Z3.ANALYTICS_STORAGE;
                    if (c2633a4.o(z32) && !this.f25799o.o(z32)) {
                        z11 = true;
                    }
                    C2633a4 t10 = c2633a4.t(this.f25799o);
                    this.f25799o = t10;
                    c2633a42 = t10;
                    z13 = z11;
                    z11 = true;
                } else {
                    c2633a42 = c2633a4;
                    z12 = false;
                    z13 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z11) {
            this.f25694a.a().u().b("Ignoring lower-priority consent settings, proposed settings", c2633a42);
            return;
        }
        long andIncrement = this.f25800p.getAndIncrement();
        if (z12) {
            this.f25791g.set(null);
            J4 j42 = new J4(this, c2633a42, andIncrement, z13);
            if (!z10) {
                this.f25694a.b().v(j42);
                return;
            } else {
                h();
                j42.run();
                return;
            }
        }
        K4 k42 = new K4(this, c2633a42, andIncrement, z13);
        if (z10) {
            h();
            k42.run();
        } else if (b10 == 30 || b10 == -10) {
            this.f25694a.b().v(k42);
        } else {
            this.f25694a.b().t(k42);
        }
    }

    public final void r() {
        C2760q3 c2760q3;
        C2663e2 c2663e2;
        C2818x6 c2818x6;
        C2818x6 c2818x62;
        int i10;
        C2642b5 c2642b5;
        EnumC2351s4 enumC2351s4;
        h();
        C2760q3 c2760q32 = this.f25694a;
        c2760q32.a().v().a("Handle tcf update.");
        SharedPreferences q10 = c2760q32.x().q();
        HashMap hashMap = new HashMap();
        C2663e2 c2663e22 = AbstractC2671f2.f25989a1;
        if (((Boolean) c2663e22.b(null)).booleanValue()) {
            com.google.common.collect.i iVar = AbstractC2834z6.f26499a;
            EnumC2342r4 enumC2342r4 = EnumC2342r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            EnumC2826y6 enumC2826y6 = EnumC2826y6.CONSENT;
            Map.Entry a10 = AbstractC2634a5.a(enumC2342r4, enumC2826y6);
            EnumC2342r4 enumC2342r42 = EnumC2342r4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            EnumC2826y6 enumC2826y62 = EnumC2826y6.FLEXIBLE_LEGITIMATE_INTEREST;
            c2663e2 = c2663e22;
            c2760q3 = c2760q32;
            com.google.common.collect.j l10 = com.google.common.collect.j.l(a10, AbstractC2634a5.a(enumC2342r42, enumC2826y62), AbstractC2634a5.a(EnumC2342r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, enumC2826y6), AbstractC2634a5.a(EnumC2342r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, enumC2826y6), AbstractC2634a5.a(EnumC2342r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, enumC2826y62), AbstractC2634a5.a(EnumC2342r4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, enumC2826y62), AbstractC2634a5.a(EnumC2342r4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, enumC2826y62));
            com.google.common.collect.k A10 = com.google.common.collect.k.A("CH");
            char[] cArr = new char[5];
            boolean contains = q10.contains("IABTCF_TCString");
            int b10 = AbstractC2834z6.b(q10, "IABTCF_CmpSdkID");
            int b11 = AbstractC2834z6.b(q10, "IABTCF_PolicyVersion");
            int b12 = AbstractC2834z6.b(q10, "IABTCF_gdprApplies");
            int b13 = AbstractC2834z6.b(q10, "IABTCF_PurposeOneTreatment");
            int b14 = AbstractC2834z6.b(q10, "IABTCF_EnableAdvertiserConsentMode");
            String a11 = AbstractC2834z6.a(q10, "IABTCF_PublisherCC");
            j.a a12 = com.google.common.collect.j.a();
            com.google.common.collect.z it = l10.keySet().iterator();
            while (it.hasNext()) {
                EnumC2342r4 enumC2342r43 = (EnumC2342r4) it.next();
                int zza = enumC2342r43.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(zza);
                String a13 = AbstractC2834z6.a(q10, sb2.toString());
                if (TextUtils.isEmpty(a13) || a13.length() < 755) {
                    enumC2351s4 = EnumC2351s4.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = Character.digit(a13.charAt(754), 10);
                    enumC2351s4 = (digit < 0 || digit > EnumC2351s4.values().length || digit == 0) ? EnumC2351s4.PURPOSE_RESTRICTION_NOT_ALLOWED : digit != 1 ? digit != 2 ? EnumC2351s4.PURPOSE_RESTRICTION_UNDEFINED : EnumC2351s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : EnumC2351s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                a12.f(enumC2342r43, enumC2351s4);
            }
            com.google.common.collect.j c10 = a12.c();
            String a14 = AbstractC2834z6.a(q10, "IABTCF_PurposeConsents");
            String a15 = AbstractC2834z6.a(q10, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(a15) && a15.length() >= 755 && a15.charAt(754) == '1';
            String a16 = AbstractC2834z6.a(q10, "IABTCF_PurposeLegitimateInterests");
            String a17 = AbstractC2834z6.a(q10, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(a17) && a17.length() >= 755 && a17.charAt(754) == '1';
            cArr[0] = '2';
            c2818x6 = new C2818x6(AbstractC2834z6.d(l10, c10, A10, cArr, b10, b14, b12, b11, b13, a11, a14, a16, z10, z11, contains));
        } else {
            c2760q3 = c2760q32;
            c2663e2 = c2663e22;
            String a18 = AbstractC2834z6.a(q10, "IABTCF_VendorConsents");
            if (!BuildConfig.FLAVOR.equals(a18) && a18.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a18.charAt(754)));
            }
            int b15 = AbstractC2834z6.b(q10, "IABTCF_gdprApplies");
            if (b15 != -1) {
                hashMap.put("gdprApplies", String.valueOf(b15));
            }
            int b16 = AbstractC2834z6.b(q10, "IABTCF_EnableAdvertiserConsentMode");
            if (b16 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(b16));
            }
            int b17 = AbstractC2834z6.b(q10, "IABTCF_PolicyVersion");
            if (b17 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(b17));
            }
            String a19 = AbstractC2834z6.a(q10, "IABTCF_PurposeConsents");
            if (!BuildConfig.FLAVOR.equals(a19)) {
                hashMap.put("PurposeConsents", a19);
            }
            int b18 = AbstractC2834z6.b(q10, "IABTCF_CmpSdkID");
            if (b18 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(b18));
            }
            c2818x6 = new C2818x6(hashMap);
        }
        c2760q3.a().w().b("Tcf preferences read", c2818x6);
        if (!c2760q3.w().H(null, c2663e2)) {
            if (c2760q3.x().x(c2818x6)) {
                Bundle b19 = c2818x6.b();
                c2760q3.a().w().b("Consent generated from Tcf", b19);
                if (b19 != Bundle.EMPTY) {
                    o0(b19, -30, c2760q3.f().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", c2818x6.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        Q2 x10 = c2760q3.x();
        x10.h();
        String string = x10.p().getString("stored_tcf_param", BuildConfig.FLAVOR);
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c2818x62 = new C2818x6(hashMap2);
        } else {
            String[] split = string.split(";");
            int length = split.length;
            int i11 = 0;
            while (i11 < length) {
                String[] split2 = split[i11].split("=");
                if (split2.length < 2 || !AbstractC2834z6.f26499a.contains(split2[0])) {
                    i10 = 1;
                } else {
                    i10 = 1;
                    hashMap2.put(split2[0], split2[1]);
                }
                i11 += i10;
            }
            c2818x62 = new C2818x6(hashMap2);
        }
        if (c2760q3.x().x(c2818x6)) {
            Bundle b20 = c2818x6.b();
            c2760q3.a().w().b("Consent generated from Tcf", b20);
            if (b20 != Bundle.EMPTY) {
                c2642b5 = this;
                c2642b5.o0(b20, -30, c2760q3.f().a());
            } else {
                c2642b5 = this;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", c2818x6.d(c2818x62));
            bundle2.putString("_tcfd2", c2818x6.c());
            bundle2.putString("_tcfd", c2818x6.e());
            c2642b5.t("auto", "_tcf", bundle2);
        }
    }

    final void r0(Runnable runnable) {
        j();
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.b().p()) {
            c2760q3.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (c2760q3.b().q()) {
            c2760q3.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        c2760q3.c();
        if (C2668f.a()) {
            c2760q3.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        c2760q3.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (!z10) {
            c2760q3.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c2760q3.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.Z4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C2642b5.this.f25694a.J().j0(atomicReference, I6.j(EnumC2714k5.SGTM_CLIENT));
                }
            });
            K6 k62 = (K6) atomicReference.get();
            if (k62 == null) {
                break;
            }
            List list = k62.f25528a;
            if (!list.isEmpty()) {
                c2760q3.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                i10 += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    EnumC2706j5 e02 = e0((G6) it.next());
                    if (e02 == EnumC2706j5.SUCCESS) {
                        i11++;
                    } else if (e02 == EnumC2706j5.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        c2760q3.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i10), Integer.valueOf(i11));
        runnable.run();
    }

    public final void s() {
        h();
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.a().v().a("Register tcfPrefChangeListener.");
        if (this.f25805u == null) {
            this.f25806v = new C2768r4(this, this.f25694a);
            this.f25805u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.V4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C2642b5.this.T(sharedPreferences, str);
                }
            };
        }
        c2760q3.x().q().registerOnSharedPreferenceChangeListener(this.f25805u);
    }

    final void s0(long j10) {
        h();
        if (this.f25796l == null) {
            this.f25796l = new C2705j4(this, this.f25694a);
        }
        this.f25796l.b(j10);
    }

    final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f25694a.f().a(), bundle);
    }

    final void t0() {
        h();
        AbstractC2827z abstractC2827z = this.f25796l;
        if (abstractC2827z != null) {
            abstractC2827z.d();
        }
    }

    final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        v(str, str2, j10, bundle, true, this.f25788d == null || l7.N(str2), true, null);
    }

    final void u0() {
        C2301m7.a();
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.w().H(null, AbstractC2671f2.f25970R0)) {
            if (c2760q3.b().p()) {
                c2760q3.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            c2760q3.c();
            if (C2668f.a()) {
                c2760q3.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            c2760q3.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c2760q3.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.Q4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C2642b5 c2642b5 = C2642b5.this;
                    c2642b5.f25694a.J().i0(atomicReference, c2642b5.f25694a.x().f25642o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c2760q3.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                c2760q3.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.S4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        boolean contains;
                        C2642b5 c2642b5 = C2642b5.this;
                        c2642b5.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<B6> list2 = list;
                        SparseArray r10 = c2642b5.f25694a.x().r();
                        for (B6 b62 : list2) {
                            int i10 = b62.f25324c;
                            contains = r10.contains(i10);
                            if (!contains || ((Long) r10.get(i10)).longValue() < b62.f25323b) {
                                c2642b5.w0().add(b62);
                            }
                        }
                        c2642b5.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        Bundle bundle2;
        String str4;
        long j11;
        String str5;
        String str6;
        Bundle[] bundleArr;
        int i10;
        AbstractC1287s.g(str);
        AbstractC1287s.m(bundle);
        h();
        j();
        C2760q3 c2760q3 = this.f25694a;
        if (!c2760q3.g()) {
            this.f25694a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List w10 = this.f25694a.L().w();
        if (w10 != null && !w10.contains(str2)) {
            this.f25694a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f25790f) {
            this.f25790f = true;
            try {
                try {
                    (!c2760q3.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f25694a.e().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f25694a.e());
                } catch (Exception e10) {
                    this.f25694a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f25694a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        C2760q3 c2760q32 = this.f25694a;
        if (!c2760q32.w().H(null, AbstractC2671f2.f26007g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            c2760q32.c();
            B("auto", "_lgclid", bundle.getString("gclid"), c2760q32.f().a());
        }
        c2760q32.c();
        if (z10 && l7.U(str2)) {
            c2760q32.C().w(bundle, c2760q32.x().f25653z.a());
        }
        if (!z12) {
            c2760q32.c();
            if (!"_iap".equals(str2)) {
                C2760q3 c2760q33 = this.f25694a;
                l7 C10 = c2760q33.C();
                if (C10.t0(Keys.EVENT, str2)) {
                    if (C10.v0(Keys.EVENT, AbstractC2641b4.f25783a, AbstractC2641b4.f25784b, str2)) {
                        C10.f25694a.w();
                        if (C10.w0(Keys.EVENT, 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                    if (i10 != 0) {
                        c2760q32.a().q().b("Invalid public event name. Event will not be logged (FE)", c2760q32.D().a(str2));
                        l7 C11 = c2760q33.C();
                        c2760q33.w();
                        c2760q33.C().B(this.f25807w, null, i10, "_ev", C11.q(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
                i10 = 2;
                if (i10 != 0) {
                }
            }
        }
        c2760q32.c();
        C2760q3 c2760q34 = this.f25694a;
        C2730m5 q10 = c2760q34.I().q(false);
        if (q10 != null && !bundle.containsKey("_sc")) {
            q10.f26175d = true;
        }
        l7.k0(q10, bundle, z10 && !z12);
        boolean equals = "am".equals(str);
        boolean N10 = l7.N(str2);
        if (!z10 || this.f25788d == null || N10) {
            z13 = equals;
        } else {
            if (!equals) {
                c2760q32.a().v().c("Passing event to registered event handler (FE)", c2760q32.D().a(str2), c2760q32.D().e(bundle));
                AbstractC1287s.m(this.f25788d);
                this.f25788d.a(str, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        C2760q3 c2760q35 = this.f25694a;
        if (c2760q35.m()) {
            int x02 = c2760q32.C().x0(str2);
            if (x02 != 0) {
                c2760q32.a().q().b("Invalid event name. Event will not be logged (FE)", c2760q32.D().a(str2));
                l7 C12 = c2760q32.C();
                c2760q32.w();
                c2760q35.C().B(this.f25807w, str3, x02, "_ev", C12.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            String str7 = "_o";
            Bundle t10 = c2760q32.C().t(str3, str2, bundle, com.google.android.gms.common.util.g.b("_o", "_sn", "_sc", "_si"), z12);
            AbstractC1287s.m(t10);
            c2760q32.c();
            if (c2760q34.I().q(false) != null && "_ae".equals(str2)) {
                C2794u6 c2794u6 = c2760q34.z().f26444f;
                long c10 = c2794u6.f26390d.f25694a.f().c();
                long j12 = c10 - c2794u6.f26388b;
                c2794u6.f26388b = c10;
                if (j12 > 0) {
                    c2760q32.C().Z(t10, j12);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                l7 C13 = c2760q32.C();
                String string = t10.getString("_ffr");
                if (com.google.android.gms.common.util.q.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                C2760q3 c2760q36 = C13.f25694a;
                if (Objects.equals(string, c2760q36.x().f25650w.a())) {
                    c2760q36.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                c2760q36.x().f25650w.b(string);
            } else if ("_ae".equals(str2)) {
                String a10 = c2760q32.C().f25694a.x().f25650w.a();
                if (!TextUtils.isEmpty(a10)) {
                    t10.putString("_ffr", a10);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(t10);
            boolean p10 = c2760q32.w().H(null, AbstractC2671f2.f25978V0) ? c2760q34.z().p() : c2760q32.x().f25647t.a();
            if (c2760q32.x().f25644q.a() > 0 && c2760q32.x().A(j10) && p10) {
                c2760q32.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                j11 = 0;
                bundle2 = t10;
                str4 = "_ae";
                B("auto", "_sid", null, c2760q32.f().a());
                B("auto", "_sno", null, c2760q32.f().a());
                B("auto", "_se", null, c2760q32.f().a());
                c2760q32.x().f25645r.b(0L);
            } else {
                bundle2 = t10;
                str4 = "_ae";
                j11 = 0;
            }
            if (bundle2.getLong("extend_session", j11) == 1) {
                c2760q32.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c2760q35.z().f26443e.b(j10, true);
            }
            ArrayList arrayList2 = new ArrayList(bundle2.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str8 = (String) arrayList2.get(i11);
                if (str8 != null) {
                    c2760q32.C();
                    Object obj = bundle2.get(str8);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundle2.putParcelableArray(str8, bundleArr);
                    }
                }
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                Bundle bundle3 = (Bundle) arrayList.get(i12);
                if (i12 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                String str9 = str7;
                bundle3.putString(str9, str5);
                if (z11) {
                    bundle3 = c2760q32.C().Q(bundle3, null);
                }
                Bundle bundle4 = bundle3;
                c2760q34.J().c0(new I(str6, new G(bundle4), str, j10), str3);
                if (!z13) {
                    Iterator it = this.f25789e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2673f4) it.next()).a(str, str2, new Bundle(bundle4), j10);
                    }
                }
                i12++;
                str7 = str9;
            }
            c2760q32.c();
            if (c2760q34.I().q(false) == null || !str4.equals(str2)) {
                return;
            }
            c2760q34.z().f26444f.d(true, true, c2760q32.f().c());
        }
    }

    final boolean v0() {
        return this.f25798n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        C2760q3.q();
        x("auto", str2, this.f25694a.f().a(), bundle, false, true, true, str3);
    }

    final PriorityQueue w0() {
        if (this.f25797m == null) {
            this.f25797m = new PriorityQueue(Comparator.comparing(T4.f25695a, U4.f25704a));
        }
        return this.f25797m;
    }

    protected final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        int i10 = l7.f26158k;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.f25694a.b().t(new RunnableC2776s4(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    final void x0() {
        B6 b62;
        h();
        this.f25798n = false;
        if (w0().isEmpty() || this.f25793i || (b62 = (B6) w0().poll()) == null) {
            return;
        }
        C2760q3 c2760q3 = this.f25694a;
        AbstractC3136a H10 = c2760q3.C().H();
        if (H10 != null) {
            this.f25793i = true;
            A2 w10 = c2760q3.a().w();
            String str = b62.f25322a;
            w10.b("Registering trigger URI", str);
            h8.d c10 = H10.c(Uri.parse(str));
            if (c10 != null) {
                AbstractC3297b.a(c10, new C2721l4(this, b62), new ExecutorC2713k4(this));
            } else {
                this.f25793i = false;
                w0().add(b62);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f25694a.f().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int i11;
        if (z10) {
            i11 = this.f25694a.C().y0(str2);
        } else {
            l7 C10 = this.f25694a.C();
            if (C10.t0("user property", str2)) {
                if (C10.v0("user property", AbstractC2657d4.f25885a, null, str2)) {
                    C10.f25694a.w();
                    if (C10.w0("user property", 24, str2)) {
                        i10 = 0;
                        if (i10 != 0) {
                            C2760q3 c2760q3 = this.f25694a;
                            l7 C11 = c2760q3.C();
                            c2760q3.w();
                            this.f25694a.C().B(this.f25807w, null, i10, "_ev", C11.q(str2, 24, true), str2 != null ? str2.length() : 0);
                            return;
                        }
                        String str3 = str == null ? "app" : str;
                        if (obj == null) {
                            A(str3, str2, j10, null);
                            return;
                        }
                        C2760q3 c2760q32 = this.f25694a;
                        int y10 = c2760q32.C().y(str2, obj);
                        if (y10 == 0) {
                            Object z11 = c2760q32.C().z(str2, obj);
                            if (z11 != null) {
                                A(str3, str2, j10, z11);
                                return;
                            }
                            return;
                        }
                        l7 C12 = c2760q32.C();
                        c2760q32.w();
                        this.f25694a.C().B(this.f25807w, null, y10, "_ev", C12.q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                        return;
                    }
                } else {
                    i11 = 15;
                }
            }
            i10 = 6;
            if (i10 != 0) {
            }
        }
        i10 = i11;
        if (i10 != 0) {
        }
    }
}
