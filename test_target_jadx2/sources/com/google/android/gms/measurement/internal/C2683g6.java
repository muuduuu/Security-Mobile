package com.google.android.gms.measurement.internal;

import H6.a;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2683g6 extends M6 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f26072d;

    /* renamed from: e, reason: collision with root package name */
    public final N2 f26073e;

    /* renamed from: f, reason: collision with root package name */
    public final N2 f26074f;

    /* renamed from: g, reason: collision with root package name */
    public final N2 f26075g;

    /* renamed from: h, reason: collision with root package name */
    public final N2 f26076h;

    /* renamed from: i, reason: collision with root package name */
    public final N2 f26077i;

    /* renamed from: j, reason: collision with root package name */
    public final N2 f26078j;

    C2683g6(b7 b7Var) {
        super(b7Var);
        this.f26072d = new HashMap();
        Q2 x10 = this.f25694a.x();
        Objects.requireNonNull(x10);
        this.f26073e = new N2(x10, "last_delete_stale", 0L);
        Q2 x11 = this.f25694a.x();
        Objects.requireNonNull(x11);
        this.f26074f = new N2(x11, "last_delete_stale_batch", 0L);
        Q2 x12 = this.f25694a.x();
        Objects.requireNonNull(x12);
        this.f26075g = new N2(x12, "backoff", 0L);
        Q2 x13 = this.f25694a.x();
        Objects.requireNonNull(x13);
        this.f26076h = new N2(x13, "last_upload", 0L);
        Q2 x14 = this.f25694a.x();
        Objects.requireNonNull(x14);
        this.f26077i = new N2(x14, "last_upload_attempt", 0L);
        Q2 x15 = this.f25694a.x();
        Objects.requireNonNull(x15);
        this.f26078j = new N2(x15, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.M6
    protected final boolean l() {
        return false;
    }

    final Pair m(String str, C2633a4 c2633a4) {
        return c2633a4.o(Z3.AD_STORAGE) ? n(str) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    final Pair n(String str) {
        C2675f6 c2675f6;
        a.C0076a c0076a;
        h();
        C2760q3 c2760q3 = this.f25694a;
        long c10 = c2760q3.f().c();
        C2675f6 c2675f62 = (C2675f6) this.f26072d.get(str);
        if (c2675f62 != null && c10 < c2675f62.f26061c) {
            return new Pair(c2675f62.f26059a, Boolean.valueOf(c2675f62.f26060b));
        }
        H6.a.b(true);
        long D10 = c2760q3.w().D(str, AbstractC2671f2.f25990b) + c10;
        try {
            try {
                c0076a = H6.a.a(c2760q3.e());
            } catch (PackageManager.NameNotFoundException unused) {
                c0076a = null;
                if (c2675f62 != null && c10 < c2675f62.f26061c + this.f25694a.w().D(str, AbstractC2671f2.f25993c)) {
                    return new Pair(c2675f62.f26059a, Boolean.valueOf(c2675f62.f26060b));
                }
            }
        } catch (Exception e10) {
            this.f25694a.a().v().b("Unable to get advertising id", e10);
            c2675f6 = new C2675f6(BuildConfig.FLAVOR, false, D10);
        }
        if (c0076a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a10 = c0076a.a();
        c2675f6 = a10 != null ? new C2675f6(a10, c0076a.b(), D10) : new C2675f6(BuildConfig.FLAVOR, c0076a.b(), D10);
        this.f26072d.put(str, c2675f6);
        H6.a.b(false);
        return new Pair(c2675f6.f26059a, Boolean.valueOf(c2675f6.f26060b));
    }

    final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest C10 = l7.C();
        if (C10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, C10.digest(str2.getBytes())));
    }
}
