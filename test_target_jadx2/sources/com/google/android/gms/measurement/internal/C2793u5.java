package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2793u5 extends AbstractC2687h2 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C2730m5 f26377c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C2730m5 f26378d;

    /* renamed from: e, reason: collision with root package name */
    protected C2730m5 f26379e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f26380f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.J0 f26381g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f26382h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C2730m5 f26383i;

    /* renamed from: j, reason: collision with root package name */
    private C2730m5 f26384j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26385k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f26386l;

    public C2793u5(C2760q3 c2760q3) {
        super(c2760q3);
        this.f26386l = new Object();
        this.f26380f = new ConcurrentHashMap();
    }

    private final void F(String str, C2730m5 c2730m5, boolean z10) {
        C2730m5 c2730m52;
        C2730m5 c2730m53 = this.f26377c == null ? this.f26378d : this.f26377c;
        if (c2730m5.f26173b == null) {
            c2730m52 = new C2730m5(c2730m5.f26172a, str != null ? r(str, "Activity") : null, c2730m5.f26174c, c2730m5.f26176e, c2730m5.f26177f);
        } else {
            c2730m52 = c2730m5;
        }
        this.f26378d = this.f26377c;
        this.f26377c = c2730m52;
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.b().t(new RunnableC2746o5(this, c2730m52, c2730m53, c2760q3.f().c(), z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void G(C2730m5 c2730m5, C2730m5 c2730m52, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        long j12;
        h();
        boolean z12 = false;
        if (c2730m52 != null) {
            if (c2730m52.f26174c == c2730m5.f26174c && Objects.equals(c2730m52.f26173b, c2730m5.f26173b) && Objects.equals(c2730m52.f26172a, c2730m5.f26172a)) {
                z11 = false;
                if (z10 && this.f26379e != null) {
                    z12 = true;
                }
                if (z11) {
                    Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                    l7.k0(c2730m5, bundle2, true);
                    if (c2730m52 != null) {
                        String str = c2730m52.f26172a;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        String str2 = c2730m52.f26173b;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", c2730m52.f26174c);
                    }
                    if (z12) {
                        C2794u6 c2794u6 = this.f25694a.z().f26444f;
                        long j13 = j10 - c2794u6.f26388b;
                        c2794u6.f26388b = j10;
                        if (j13 > 0) {
                            this.f25694a.C().Z(bundle2, j13);
                        }
                    }
                    C2760q3 c2760q3 = this.f25694a;
                    if (!c2760q3.w().N()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    boolean z13 = c2730m5.f26176e;
                    String str3 = true != z13 ? "auto" : "app";
                    long a10 = c2760q3.f().a();
                    if (z13) {
                        j11 = a10;
                        long j14 = c2730m5.f26177f;
                        if (j14 != 0) {
                            j12 = j14;
                            this.f25694a.B().u(str3, "_vs", j12, bundle2);
                        }
                    } else {
                        j11 = a10;
                    }
                    j12 = j11;
                    this.f25694a.B().u(str3, "_vs", j12, bundle2);
                }
                if (z12) {
                    o(this.f26379e, true, j10);
                }
                this.f26379e = c2730m5;
                if (c2730m5.f26176e) {
                    this.f26384j = c2730m5;
                }
                this.f25694a.J().u(c2730m5);
            }
        }
        z11 = true;
        if (z10) {
            z12 = true;
        }
        if (z11) {
        }
        if (z12) {
        }
        this.f26379e = c2730m5;
        if (c2730m5.f26176e) {
        }
        this.f25694a.J().u(c2730m5);
    }

    private final void o(C2730m5 c2730m5, boolean z10, long j10) {
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.M().k(c2760q3.f().c());
        if (!c2760q3.z().f26444f.d(c2730m5 != null && c2730m5.f26175d, z10, j10) || c2730m5 == null) {
            return;
        }
        c2730m5.f26175d = false;
    }

    private final C2730m5 p(com.google.android.gms.internal.measurement.J0 j02) {
        AbstractC1287s.m(j02);
        Integer valueOf = Integer.valueOf(j02.f24243a);
        Map map = this.f26380f;
        C2730m5 c2730m5 = (C2730m5) map.get(valueOf);
        if (c2730m5 == null) {
            C2730m5 c2730m52 = new C2730m5(null, r(j02.f24244b, "Activity"), this.f25694a.C().p0());
            map.put(valueOf, c2730m52);
            c2730m5 = c2730m52;
        }
        return this.f26383i != null ? this.f26383i : c2730m5;
    }

    final /* synthetic */ void A(Bundle bundle, C2730m5 c2730m5, C2730m5 c2730m52, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(c2730m5, c2730m52, j10, true, this.f25694a.C().t(null, "screen_view", bundle, null, false));
    }

    final /* synthetic */ void B(C2730m5 c2730m5, C2730m5 c2730m52, long j10, boolean z10, Bundle bundle) {
        G(c2730m5, c2730m52, j10, z10, null);
    }

    final /* synthetic */ void C(C2730m5 c2730m5, boolean z10, long j10) {
        o(c2730m5, false, j10);
    }

    final /* synthetic */ C2730m5 D() {
        return this.f26384j;
    }

    final /* synthetic */ void E(C2730m5 c2730m5) {
        this.f26384j = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final boolean m() {
        return false;
    }

    public final C2730m5 q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f26379e;
        }
        C2730m5 c2730m5 = this.f26379e;
        return c2730m5 != null ? c2730m5 : this.f26384j;
    }

    final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = length > 0 ? split[length - 1] : BuildConfig.FLAVOR;
        C2760q3 c2760q3 = this.f25694a;
        return str3.length() > c2760q3.w().x(null, false) ? str3.substring(0, c2760q3.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f26386l) {
            try {
                if (!this.f26385k) {
                    this.f25694a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f25694a.w().x(null, false))) {
                    this.f25694a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f25694a.w().x(null, false))) {
                    this.f25694a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.J0 j02 = this.f26381g;
                    string2 = j02 != null ? r(j02.f24244b, "Activity") : "Activity";
                }
                C2730m5 c2730m5 = this.f26377c;
                if (this.f26382h && c2730m5 != null) {
                    this.f26382h = false;
                    boolean equals = Objects.equals(c2730m5.f26173b, string2);
                    boolean equals2 = Objects.equals(c2730m5.f26172a, string);
                    if (equals && equals2) {
                        this.f25694a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C2760q3 c2760q3 = this.f25694a;
                c2760q3.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                C2730m5 c2730m52 = this.f26377c == null ? this.f26378d : this.f26377c;
                C2730m5 c2730m53 = new C2730m5(string, string2, c2760q3.C().p0(), true, j10);
                this.f26377c = c2730m53;
                this.f26378d = c2730m52;
                this.f26383i = c2730m53;
                c2760q3.b().t(new RunnableC2738n5(this, bundle, c2730m53, c2730m52, c2760q3.f().c()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(com.google.android.gms.internal.measurement.J0 j02, String str, String str2) {
        C2760q3 c2760q3 = this.f25694a;
        if (!c2760q3.w().N()) {
            c2760q3.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C2730m5 c2730m5 = this.f26377c;
        if (c2730m5 == null) {
            c2760q3.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f26380f;
        Integer valueOf = Integer.valueOf(j02.f24243a);
        if (map.get(valueOf) == null) {
            c2760q3.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(j02.f24244b, "Activity");
        }
        String str3 = c2730m5.f26173b;
        String str4 = c2730m5.f26172a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            c2760q3.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c2760q3.w().x(null, false))) {
            c2760q3.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c2760q3.w().x(null, false))) {
            c2760q3.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c2760q3.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C2730m5 c2730m52 = new C2730m5(str, str2, c2760q3.C().p0());
        map.put(valueOf, c2730m52);
        F(j02.f24244b, c2730m52, true);
    }

    public final C2730m5 u() {
        return this.f26377c;
    }

    public final void v(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        Bundle bundle2;
        if (!this.f25694a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f26380f.put(Integer.valueOf(j02.f24243a), new C2730m5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(com.google.android.gms.internal.measurement.J0 j02) {
        Object obj = this.f26386l;
        synchronized (obj) {
            this.f26385k = true;
            if (!Objects.equals(j02, this.f26381g)) {
                synchronized (obj) {
                    this.f26381g = j02;
                    this.f26382h = false;
                    C2760q3 c2760q3 = this.f25694a;
                    if (c2760q3.w().N()) {
                        this.f26383i = null;
                        c2760q3.b().t(new RunnableC2785t5(this));
                    }
                }
            }
        }
        C2760q3 c2760q32 = this.f25694a;
        if (!c2760q32.w().N()) {
            this.f26377c = this.f26383i;
            c2760q32.b().t(new RunnableC2754p5(this));
            return;
        }
        F(j02.f24244b, p(j02), false);
        E0 M10 = this.f25694a.M();
        C2760q3 c2760q33 = M10.f25694a;
        c2760q33.b().t(new RunnableC2653d0(M10, c2760q33.f().c()));
    }

    public final void x(com.google.android.gms.internal.measurement.J0 j02) {
        synchronized (this.f26386l) {
            this.f26385k = false;
            this.f26382h = true;
        }
        C2760q3 c2760q3 = this.f25694a;
        long c10 = c2760q3.f().c();
        if (!c2760q3.w().N()) {
            this.f26377c = null;
            c2760q3.b().t(new RunnableC2762q5(this, c10));
        } else {
            C2730m5 p10 = p(j02);
            this.f26378d = this.f26377c;
            this.f26377c = null;
            c2760q3.b().t(new RunnableC2769r5(this, p10, c10));
        }
    }

    public final void y(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        C2730m5 c2730m5;
        if (!this.f25694a.w().N() || bundle == null || (c2730m5 = (C2730m5) this.f26380f.get(Integer.valueOf(j02.f24243a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2730m5.f26174c);
        bundle2.putString("name", c2730m5.f26172a);
        bundle2.putString("referrer_name", c2730m5.f26173b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(com.google.android.gms.internal.measurement.J0 j02) {
        synchronized (this.f26386l) {
            try {
                if (Objects.equals(this.f26381g, j02)) {
                    this.f26381g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f25694a.w().N()) {
            this.f26380f.remove(Integer.valueOf(j02.f24243a));
        }
    }
}
