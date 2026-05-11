package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import d7.C2998d;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* renamed from: com.google.android.gms.measurement.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2724m extends T3 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f26165b;

    /* renamed from: c, reason: collision with root package name */
    private String f26166c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2716l f26167d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f26168e;

    C2724m(C2760q3 c2760q3) {
        super(c2760q3);
        this.f26167d = C2708k.f26139a;
    }

    public static final long n() {
        return ((Long) AbstractC2671f2.f25999e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) AbstractC2671f2.f26014j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) AbstractC2671f2.f26020l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) AbstractC2671f2.f25971S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) AbstractC2671f2.f25961N.b(null)).longValue();
    }

    private final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            AbstractC1287s.m(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f25694a.a().o().b("Could not find SystemProperties class", e10);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e11) {
            this.f25694a.a().o().b("Could not access SystemProperties.get()", e11);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e12) {
            this.f25694a.a().o().b("Could not find SystemProperties.get() method", e12);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e13) {
            this.f25694a.a().o().b("SystemProperties.get() threw an exception", e13);
            return BuildConfig.FLAVOR;
        }
    }

    public final long A() {
        this.f25694a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f26168e == null) {
            synchronized (this) {
                try {
                    if (this.f26168e == null) {
                        C2760q3 c2760q3 = this.f25694a;
                        ApplicationInfo applicationInfo = c2760q3.e().getApplicationInfo();
                        String a10 = com.google.android.gms.common.util.p.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(a10)) {
                                z10 = true;
                            }
                            this.f26168e = Boolean.valueOf(z10);
                        }
                        if (this.f26168e == null) {
                            this.f26168e = Boolean.TRUE;
                            c2760q3.a().o().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f26168e.booleanValue();
    }

    public final String C(String str, C2663e2 c2663e2) {
        return TextUtils.isEmpty(str) ? (String) c2663e2.b(null) : (String) c2663e2.b(this.f26167d.d(str, c2663e2.a()));
    }

    public final long D(String str, C2663e2 c2663e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c2663e2.b(null)).longValue();
        }
        String d10 = this.f26167d.d(str, c2663e2.a());
        if (TextUtils.isEmpty(d10)) {
            return ((Long) c2663e2.b(null)).longValue();
        }
        try {
            return ((Long) c2663e2.b(Long.valueOf(Long.parseLong(d10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2663e2.b(null)).longValue();
        }
    }

    public final int E(String str, C2663e2 c2663e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c2663e2.b(null)).intValue();
        }
        String d10 = this.f26167d.d(str, c2663e2.a());
        if (TextUtils.isEmpty(d10)) {
            return ((Integer) c2663e2.b(null)).intValue();
        }
        try {
            return ((Integer) c2663e2.b(Integer.valueOf(Integer.parseInt(d10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2663e2.b(null)).intValue();
        }
    }

    public final int F(String str, C2663e2 c2663e2, int i10, int i11) {
        return Math.max(Math.min(E(str, c2663e2), i11), i10);
    }

    public final double G(String str, C2663e2 c2663e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c2663e2.b(null)).doubleValue();
        }
        String d10 = this.f26167d.d(str, c2663e2.a());
        if (TextUtils.isEmpty(d10)) {
            return ((Double) c2663e2.b(null)).doubleValue();
        }
        try {
            return ((Double) c2663e2.b(Double.valueOf(Double.parseDouble(d10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2663e2.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, C2663e2 c2663e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c2663e2.b(null)).booleanValue();
        }
        String d10 = this.f26167d.d(str, c2663e2.a());
        return TextUtils.isEmpty(d10) ? ((Boolean) c2663e2.b(null)).booleanValue() : ((Boolean) c2663e2.b(Boolean.valueOf("1".equals(d10)))).booleanValue();
    }

    final Bundle I() {
        try {
            C2760q3 c2760q3 = this.f25694a;
            if (c2760q3.e().getPackageManager() == null) {
                c2760q3.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = C2998d.a(c2760q3.e()).c(c2760q3.e().getPackageName(), 128);
            if (c10 != null) {
                return c10.metaData;
            }
            c2760q3.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f25694a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    final Boolean J(String str) {
        AbstractC1287s.g(str);
        Bundle I10 = I();
        if (I10 == null) {
            this.f25694a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (I10.containsKey(str)) {
            return Boolean.valueOf(I10.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List K(String str) {
        Integer valueOf;
        AbstractC1287s.g("analytics.safelisted_events");
        Bundle I10 = I();
        if (I10 == null) {
            this.f25694a.a().o().a("Failed to load metadata: Metadata bundle is null");
        } else if (I10.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(I10.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = this.f25694a.e().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.f25694a.a().o().b("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    public final boolean L() {
        this.f25694a.c();
        Boolean J10 = J("firebase_analytics_collection_deactivated");
        return J10 != null && J10.booleanValue();
    }

    public final boolean M() {
        Boolean J10 = J("google_analytics_adid_collection_enabled");
        return J10 == null || J10.booleanValue();
    }

    public final boolean N() {
        Boolean J10 = J("google_analytics_automatic_screen_reporting_enabled");
        return J10 == null || J10.booleanValue();
    }

    public final X3 O(String str, boolean z10) {
        Object obj;
        AbstractC1287s.g(str);
        C2760q3 c2760q3 = this.f25694a;
        Bundle I10 = I();
        if (I10 == null) {
            c2760q3.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = I10.get(str);
        }
        if (obj == null) {
            return X3.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return X3.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return X3.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return X3.POLICY;
        }
        c2760q3.a().r().b("Invalid manifest metadata for", str);
        return X3.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean J10 = J("google_analytics_sgtm_upload_enabled");
        if (J10 == null) {
            return false;
        }
        return J10.booleanValue();
    }

    public final void Q(String str) {
        this.f26166c = str;
    }

    public final String R() {
        return this.f26166c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    public final String j() {
        return s("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    public final boolean k(String str) {
        return "1".equals(this.f26167d.d(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f26167d.d(str, "measurement.event_sampling_enabled"));
    }

    final boolean m() {
        if (this.f26165b == null) {
            Boolean J10 = J("app_measurement_lite");
            this.f26165b = J10;
            if (J10 == null) {
                this.f26165b = Boolean.FALSE;
            }
        }
        return this.f26165b.booleanValue() || !this.f25694a.G();
    }

    final void t(InterfaceC2716l interfaceC2716l) {
        this.f26167d = interfaceC2716l;
    }

    final String u() {
        this.f25694a.c();
        return "FA";
    }

    public final int v() {
        return this.f25694a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, AbstractC2671f2.f25983Y, 25, 100);
    }

    final int x(String str, boolean z10) {
        if (z10) {
            return F(str, AbstractC2671f2.f26012i0, 100, 500);
        }
        return 500;
    }

    final int y(String str, boolean z10) {
        return Math.max(x(str, z10), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    final int z(String str) {
        return F(str, AbstractC2671f2.f25981X, 500, 2000);
    }
}
