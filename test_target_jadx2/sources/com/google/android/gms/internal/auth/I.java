package com.google.android.gms.internal.auth;

import android.net.Uri;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    final Uri f23604a;

    /* renamed from: b, reason: collision with root package name */
    final String f23605b;

    /* renamed from: c, reason: collision with root package name */
    final String f23606c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f23607d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f23608e;

    private I(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, Q q10) {
        this.f23604a = uri;
        this.f23605b = BuildConfig.FLAVOR;
        this.f23606c = BuildConfig.FLAVOR;
        this.f23607d = z10;
        this.f23608e = z12;
    }

    public final I a() {
        return new I(null, this.f23604a, this.f23605b, this.f23606c, this.f23607d, false, true, false, null);
    }

    public final I b() {
        if (this.f23605b.isEmpty()) {
            return new I(null, this.f23604a, this.f23605b, this.f23606c, true, false, this.f23608e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final M c(String str, double d10) {
        return new G(this, str, Double.valueOf(0.0d), true);
    }

    public final M d(String str, long j10) {
        return new E(this, str, Long.valueOf(j10), true);
    }

    public final M e(String str, boolean z10) {
        return new F(this, str, Boolean.valueOf(z10), true);
    }

    public final M f(String str, Object obj, O1 o12) {
        return new H(this, "getTokenRefactor__blocked_packages", obj, true, o12);
    }

    public I(Uri uri) {
        this(null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, null);
    }
}
