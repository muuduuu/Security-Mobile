package com.google.android.gms.measurement.internal;

import H6.a;
import V6.AbstractC1287s;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class Q2 extends U3 {

    /* renamed from: A, reason: collision with root package name */
    static final Pair f25629A = new Pair(BuildConfig.FLAVOR, 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f25630c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f25631d;

    /* renamed from: e, reason: collision with root package name */
    public O2 f25632e;

    /* renamed from: f, reason: collision with root package name */
    public final N2 f25633f;

    /* renamed from: g, reason: collision with root package name */
    public final N2 f25634g;

    /* renamed from: h, reason: collision with root package name */
    public final P2 f25635h;

    /* renamed from: i, reason: collision with root package name */
    private String f25636i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25637j;

    /* renamed from: k, reason: collision with root package name */
    private long f25638k;

    /* renamed from: l, reason: collision with root package name */
    public final N2 f25639l;

    /* renamed from: m, reason: collision with root package name */
    public final L2 f25640m;

    /* renamed from: n, reason: collision with root package name */
    public final P2 f25641n;

    /* renamed from: o, reason: collision with root package name */
    public final M2 f25642o;

    /* renamed from: p, reason: collision with root package name */
    public final L2 f25643p;

    /* renamed from: q, reason: collision with root package name */
    public final N2 f25644q;

    /* renamed from: r, reason: collision with root package name */
    public final N2 f25645r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25646s;

    /* renamed from: t, reason: collision with root package name */
    public final L2 f25647t;

    /* renamed from: u, reason: collision with root package name */
    public final L2 f25648u;

    /* renamed from: v, reason: collision with root package name */
    public final N2 f25649v;

    /* renamed from: w, reason: collision with root package name */
    public final P2 f25650w;

    /* renamed from: x, reason: collision with root package name */
    public final P2 f25651x;

    /* renamed from: y, reason: collision with root package name */
    public final N2 f25652y;

    /* renamed from: z, reason: collision with root package name */
    public final M2 f25653z;

    Q2(C2760q3 c2760q3) {
        super(c2760q3);
        this.f25639l = new N2(this, "session_timeout", 1800000L);
        this.f25640m = new L2(this, "start_new_session", true);
        this.f25644q = new N2(this, "last_pause_time", 0L);
        this.f25645r = new N2(this, "session_id", 0L);
        this.f25641n = new P2(this, "non_personalized_ads", null);
        this.f25642o = new M2(this, "last_received_uri_timestamps_by_source", null);
        this.f25643p = new L2(this, "allow_remote_dynamite", false);
        this.f25633f = new N2(this, "first_open_time", 0L);
        this.f25634g = new N2(this, "app_install_time", 0L);
        this.f25635h = new P2(this, "app_instance_id", null);
        this.f25647t = new L2(this, "app_backgrounded", false);
        this.f25648u = new L2(this, "deep_link_retrieval_complete", false);
        this.f25649v = new N2(this, "deep_link_retrieval_attempts", 0L);
        this.f25650w = new P2(this, "firebase_feature_rollouts", null);
        this.f25651x = new P2(this, "deferred_attribution_cache", null);
        this.f25652y = new N2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f25653z = new M2(this, "default_event_parameters", null);
    }

    final boolean A(long j10) {
        return j10 - this.f25639l.a() > this.f25644q.a();
    }

    @Override // com.google.android.gms.measurement.internal.U3
    protected final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.U3
    protected final void j() {
        C2760q3 c2760q3 = this.f25694a;
        SharedPreferences sharedPreferences = c2760q3.e().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f25630c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f25646s = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f25630c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        c2760q3.w();
        this.f25632e = new O2(this, "health_monitor", Math.max(0L, ((Long) AbstractC2671f2.f25996d.b(null)).longValue()), null);
    }

    final Pair o(String str) {
        h();
        if (!w().o(Z3.AD_STORAGE)) {
            return new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
        }
        C2760q3 c2760q3 = this.f25694a;
        long c10 = c2760q3.f().c();
        String str2 = this.f25636i;
        if (str2 != null && c10 < this.f25638k) {
            return new Pair(str2, Boolean.valueOf(this.f25637j));
        }
        this.f25638k = c10 + c2760q3.w().D(str, AbstractC2671f2.f25990b);
        H6.a.b(true);
        try {
            a.C0076a a10 = H6.a.a(c2760q3.e());
            this.f25636i = BuildConfig.FLAVOR;
            String a11 = a10.a();
            if (a11 != null) {
                this.f25636i = a11;
            }
            this.f25637j = a10.b();
        } catch (Exception e10) {
            this.f25694a.a().v().b("Unable to get advertising id", e10);
            this.f25636i = BuildConfig.FLAVOR;
        }
        H6.a.b(false);
        return new Pair(this.f25636i, Boolean.valueOf(this.f25637j));
    }

    protected final SharedPreferences p() {
        h();
        l();
        AbstractC1287s.m(this.f25630c);
        return this.f25630c;
    }

    protected final SharedPreferences q() {
        h();
        l();
        if (this.f25631d == null) {
            C2760q3 c2760q3 = this.f25694a;
            String valueOf = String.valueOf(c2760q3.e().getPackageName());
            A2 w10 = c2760q3.a().w();
            String concat = valueOf.concat("_preferences");
            w10.b("Default prefs file", concat);
            this.f25631d = c2760q3.e().getSharedPreferences(concat, 0);
        }
        return this.f25631d;
    }

    final SparseArray r() {
        Bundle a10 = this.f25642o.a();
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f25694a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = p().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final A u() {
        h();
        return A.g(p().getString("dma_consent_settings", null));
    }

    final boolean v(int i10) {
        return C2633a4.u(i10, p().getInt("consent_source", 100));
    }

    final C2633a4 w() {
        h();
        return C2633a4.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    protected final boolean x(C2818x6 c2818x6) {
        h();
        String string = p().getString("stored_tcf_param", BuildConfig.FLAVOR);
        String a10 = c2818x6.a();
        if (a10.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = p().edit();
        edit.putString("stored_tcf_param", a10);
        edit.apply();
        return true;
    }

    final void y(boolean z10) {
        h();
        this.f25694a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = p().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    final boolean z() {
        SharedPreferences sharedPreferences = this.f25630c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
