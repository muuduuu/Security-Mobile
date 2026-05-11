package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2197b2;
import com.google.android.gms.internal.measurement.C2222e0;
import com.google.android.gms.internal.measurement.C2224e2;
import com.google.android.gms.internal.measurement.C2242g2;
import com.google.android.gms.internal.measurement.C2251h2;
import com.google.android.gms.internal.measurement.C2269j2;
import com.google.android.gms.internal.measurement.C2278k2;
import com.google.android.gms.internal.measurement.C2326p5;
import com.google.android.gms.internal.measurement.C2349s2;
import com.google.android.gms.internal.measurement.C2370u5;
import com.google.android.gms.internal.measurement.C2413z3;
import com.google.android.gms.internal.measurement.InterfaceC2399x7;
import com.google.android.gms.internal.measurement.S7;
import com.google.android.gms.internal.measurement.T7;
import j0.C3476a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2656d3 extends M6 implements InterfaceC2716l {

    /* renamed from: d, reason: collision with root package name */
    private final Map f25874d;

    /* renamed from: e, reason: collision with root package name */
    final Map f25875e;

    /* renamed from: f, reason: collision with root package name */
    final Map f25876f;

    /* renamed from: g, reason: collision with root package name */
    final Map f25877g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f25878h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f25879i;

    /* renamed from: j, reason: collision with root package name */
    final j0.h f25880j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC2399x7 f25881k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f25882l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f25883m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f25884n;

    C2656d3(b7 b7Var) {
        super(b7Var);
        this.f25874d = new C3476a();
        this.f25875e = new C3476a();
        this.f25876f = new C3476a();
        this.f25877g = new C3476a();
        this.f25878h = new C3476a();
        this.f25882l = new C3476a();
        this.f25883m = new C3476a();
        this.f25884n = new C3476a();
        this.f25879i = new C3476a();
        this.f25880j = new W2(this, 20);
        this.f25881k = new X2(this);
    }

    private final void q(String str) {
        j();
        h();
        AbstractC1287s.g(str);
        Map map = this.f25878h;
        if (map.get(str) == null) {
            r N02 = this.f25405b.F0().N0(str);
            if (N02 != null) {
                C2269j2 c2269j2 = (C2269j2) t(str, N02.f26301a).p();
                r(str, c2269j2);
                this.f25874d.put(str, u((C2278k2) c2269j2.v()));
                map.put(str, (C2278k2) c2269j2.v());
                s(str, (C2278k2) c2269j2.v());
                this.f25882l.put(str, c2269j2.G());
                this.f25883m.put(str, N02.f26302b);
                this.f25884n.put(str, N02.f26303c);
                return;
            }
            this.f25874d.put(str, null);
            this.f25876f.put(str, null);
            this.f25875e.put(str, null);
            this.f25877g.put(str, null);
            map.put(str, null);
            this.f25882l.put(str, null);
            this.f25883m.put(str, null);
            this.f25884n.put(str, null);
            this.f25879i.put(str, null);
        }
    }

    private final void r(String str, C2269j2 c2269j2) {
        HashSet hashSet = new HashSet();
        C3476a c3476a = new C3476a();
        C3476a c3476a2 = new C3476a();
        C3476a c3476a3 = new C3476a();
        Iterator it = c2269j2.E().iterator();
        while (it.hasNext()) {
            hashSet.add(((C2242g2) it.next()).C());
        }
        for (int i10 = 0; i10 < c2269j2.y(); i10++) {
            C2251h2 c2251h2 = (C2251h2) c2269j2.z(i10).p();
            if (c2251h2.y().isEmpty()) {
                this.f25694a.a().r().a("EventConfig contained null event name");
            } else {
                String y10 = c2251h2.y();
                String b10 = AbstractC2641b4.b(c2251h2.y());
                if (!TextUtils.isEmpty(b10)) {
                    c2251h2.z(b10);
                    c2269j2.A(i10, c2251h2);
                }
                if (c2251h2.A() && c2251h2.B()) {
                    c3476a.put(y10, Boolean.TRUE);
                }
                if (c2251h2.C() && c2251h2.D()) {
                    c3476a2.put(c2251h2.y(), Boolean.TRUE);
                }
                if (c2251h2.E()) {
                    if (c2251h2.G() < 2 || c2251h2.G() > 65535) {
                        this.f25694a.a().r().c("Invalid sampling rate. Event name, sample rate", c2251h2.y(), Integer.valueOf(c2251h2.G()));
                    } else {
                        c3476a3.put(c2251h2.y(), Integer.valueOf(c2251h2.G()));
                    }
                }
            }
        }
        this.f25875e.put(str, hashSet);
        this.f25876f.put(str, c3476a);
        this.f25877g.put(str, c3476a2);
        this.f25879i.put(str, c3476a3);
    }

    private final void s(final String str, C2278k2 c2278k2) {
        if (c2278k2.L() == 0) {
            this.f25880j.e(str);
            return;
        }
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.a().w().b("EES programs found", Integer.valueOf(c2278k2.L()));
        com.google.android.gms.internal.measurement.C3 c32 = (com.google.android.gms.internal.measurement.C3) c2278k2.K().get(0);
        try {
            C2222e0 c2222e0 = new C2222e0();
            c2222e0.a("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.c3
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new C2370u5("internal.remoteConfig", new Y2(C2656d3.this, str));
                }
            });
            c2222e0.a("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.Z2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final C2656d3 c2656d3 = C2656d3.this;
                    final String str2 = str;
                    return new T7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.b3
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            C2656d3 c2656d32 = C2656d3.this;
                            C2803w F02 = c2656d32.f25405b.F0();
                            String str3 = str2;
                            I2 J02 = F02.J0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            c2656d32.f25694a.w().A();
                            hashMap.put("gmp_version", 133005L);
                            if (J02 != null) {
                                String D02 = J02.D0();
                                if (D02 != null) {
                                    hashMap.put("app_version", D02);
                                }
                                hashMap.put("app_version_int", Long.valueOf(J02.F0()));
                                hashMap.put("dynamite_version", Long.valueOf(J02.b()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            c2222e0.a("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.a3
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new S7(C2656d3.this.f25881k);
                }
            });
            c2222e0.f(c32);
            this.f25880j.d(str, c2222e0);
            c2760q3.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(c32.D().D()));
            Iterator it = c32.D().C().iterator();
            while (it.hasNext()) {
                c2760q3.a().w().b("EES program activity", ((C2413z3) it.next()).C());
            }
        } catch (com.google.android.gms.internal.measurement.D0 unused) {
            this.f25694a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    private final C2278k2 t(String str, byte[] bArr) {
        if (bArr == null) {
            return C2278k2.T();
        }
        try {
            C2278k2 c2278k2 = (C2278k2) ((C2269j2) g7.W(C2278k2.S(), bArr)).v();
            this.f25694a.a().w().c("Parsed config. version, gmp_app_id", c2278k2.C() ? Long.valueOf(c2278k2.D()) : null, c2278k2.E() ? c2278k2.F() : null);
            return c2278k2;
        } catch (C2326p5 e10) {
            this.f25694a.a().r().c("Unable to merge remote config. appId", C2.x(str), e10);
            return C2278k2.T();
        } catch (RuntimeException e11) {
            this.f25694a.a().r().c("Unable to merge remote config. appId", C2.x(str), e11);
            return C2278k2.T();
        }
    }

    private static final Map u(C2278k2 c2278k2) {
        C3476a c3476a = new C3476a();
        if (c2278k2 != null) {
            for (C2349s2 c2349s2 : c2278k2.G()) {
                c3476a.put(c2349s2.C(), c2349s2.D());
            }
        }
        return c3476a;
    }

    private static final Z3 v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return Z3.AD_STORAGE;
        }
        if (i11 == 2) {
            return Z3.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return Z3.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return Z3.AD_PERSONALIZATION;
    }

    protected final void A(String str) {
        h();
        this.f25883m.put(str, null);
    }

    final void B(String str) {
        h();
        this.f25878h.remove(str);
    }

    protected final boolean C(String str, byte[] bArr, String str2, String str3) {
        j();
        h();
        AbstractC1287s.g(str);
        C2269j2 c2269j2 = (C2269j2) t(str, bArr).p();
        r(str, c2269j2);
        s(str, (C2278k2) c2269j2.v());
        this.f25878h.put(str, (C2278k2) c2269j2.v());
        this.f25882l.put(str, c2269j2.G());
        this.f25883m.put(str, str2);
        this.f25884n.put(str, str3);
        this.f25874d.put(str, u((C2278k2) c2269j2.v()));
        this.f25405b.F0().Y(str, new ArrayList(c2269j2.B()));
        try {
            c2269j2.C();
            bArr = ((C2278k2) c2269j2.v()).c();
        } catch (RuntimeException e10) {
            this.f25694a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2.x(str), e10);
        }
        C2803w F02 = this.f25405b.F0();
        AbstractC1287s.g(str);
        F02.h();
        F02.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (F02.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                F02.f25694a.a().o().b("Failed to update remote config (got 0). appId", C2.x(str));
            }
        } catch (SQLiteException e11) {
            F02.f25694a.a().o().c("Error storing remote config. appId", C2.x(str), e11);
        }
        c2269j2.D();
        this.f25878h.put(str, (C2278k2) c2269j2.v());
        return true;
    }

    final boolean D(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if (H(str) && l7.N(str2)) {
            return true;
        }
        if (I(str) && l7.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f25876f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean E(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f25877g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final Set F(String str) {
        h();
        q(str);
        return (Set) this.f25875e.get(str);
    }

    final int G(String str, String str2) {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f25879i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean H(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_internal"));
    }

    final boolean I(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_public"));
    }

    final boolean J(String str) {
        h();
        q(str);
        Map map = this.f25875e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean K(String str) {
        h();
        q(str);
        Map map = this.f25875e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean L(String str) {
        h();
        q(str);
        Map map = this.f25875e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    final boolean M(String str) {
        h();
        q(str);
        Map map = this.f25875e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    final boolean N(String str) {
        h();
        q(str);
        Map map = this.f25875e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    final boolean O(String str) {
        h();
        q(str);
        Map map = this.f25875e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean P(String str, Z3 z32) {
        h();
        q(str);
        C2224e2 R10 = R(str);
        if (R10 == null) {
            return false;
        }
        Iterator it = R10.C().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.S1 s12 = (com.google.android.gms.internal.measurement.S1) it.next();
            if (z32 == v(s12.D())) {
                if (s12.E() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final Z3 Q(String str, Z3 z32) {
        h();
        q(str);
        C2224e2 R10 = R(str);
        if (R10 == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.U1 u12 : R10.D()) {
            if (z32 == v(u12.D())) {
                return v(u12.E());
            }
        }
        return null;
    }

    final C2224e2 R(String str) {
        h();
        q(str);
        C2278k2 w10 = w(str);
        if (w10 == null || !w10.O()) {
            return null;
        }
        return w10.P();
    }

    final boolean S(String str) {
        h();
        q(str);
        C2224e2 R10 = R(str);
        return R10 == null || !R10.F() || R10.G();
    }

    final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        C2224e2 R10 = R(str);
        if (R10 != null) {
            Iterator it = R10.E().iterator();
            while (it.hasNext()) {
                treeSet.add(((C2197b2) it.next()).C());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2716l
    public final String d(String str, String str2) {
        h();
        q(str);
        Map map = (Map) this.f25874d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.M6
    protected final boolean l() {
        return false;
    }

    final X3 m(String str, Z3 z32) {
        h();
        q(str);
        C2224e2 R10 = R(str);
        if (R10 == null) {
            return X3.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.S1 s12 : R10.H()) {
            if (v(s12.D()) == z32) {
                int E10 = s12.E() - 1;
                return E10 != 1 ? E10 != 2 ? X3.UNINITIALIZED : X3.DENIED : X3.GRANTED;
            }
        }
        return X3.UNINITIALIZED;
    }

    final boolean n(String str) {
        h();
        q(str);
        C2224e2 R10 = R(str);
        if (R10 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.S1 s12 : R10.C()) {
            if (s12.D() == 3 && s12.F() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ C2222e0 o(String str) {
        j();
        AbstractC1287s.g(str);
        r N02 = this.f25405b.F0().N0(str);
        if (N02 == null) {
            return null;
        }
        this.f25694a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, N02.f26301a));
        return (C2222e0) this.f25880j.h().get(str);
    }

    final /* synthetic */ Map p() {
        return this.f25874d;
    }

    protected final C2278k2 w(String str) {
        j();
        h();
        AbstractC1287s.g(str);
        q(str);
        return (C2278k2) this.f25878h.get(str);
    }

    final String x(String str) {
        h();
        q(str);
        return (String) this.f25882l.get(str);
    }

    protected final String y(String str) {
        h();
        return (String) this.f25883m.get(str);
    }

    protected final String z(String str) {
        h();
        return (String) this.f25884n.get(str);
    }
}
