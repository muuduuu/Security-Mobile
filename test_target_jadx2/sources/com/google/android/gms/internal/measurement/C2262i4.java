package com.google.android.gms.internal.measurement;

import android.net.Uri;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2262i4 {

    /* renamed from: a, reason: collision with root package name */
    final Uri f24530a;

    /* renamed from: b, reason: collision with root package name */
    final String f24531b;

    /* renamed from: c, reason: collision with root package name */
    final String f24532c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f24533d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f24534e;

    private C2262i4(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, g8.c cVar) {
        this.f24530a = uri;
        this.f24531b = BuildConfig.FLAVOR;
        this.f24532c = BuildConfig.FLAVOR;
        this.f24533d = z10;
        this.f24534e = z12;
    }

    public final C2262i4 a() {
        String str = this.f24531b;
        if (str.isEmpty()) {
            return new C2262i4(null, this.f24530a, str, this.f24532c, true, false, this.f24534e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C2262i4 b() {
        return new C2262i4(null, this.f24530a, this.f24531b, this.f24532c, this.f24533d, false, true, false, null);
    }

    public final AbstractC2316o4 c(String str, long j10) {
        Long valueOf = Long.valueOf(j10);
        int i10 = AbstractC2316o4.f24594j;
        return new C2226e4(this, str, valueOf, true);
    }

    public final AbstractC2316o4 d(String str, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        int i10 = AbstractC2316o4.f24594j;
        return new C2235f4(this, str, valueOf, true);
    }

    public final AbstractC2316o4 e(String str, double d10) {
        Double valueOf = Double.valueOf(-3.0d);
        int i10 = AbstractC2316o4.f24594j;
        return new C2244g4(this, "measurement.test.double_flag", valueOf, true);
    }

    public final AbstractC2316o4 f(String str, String str2) {
        int i10 = AbstractC2316o4.f24594j;
        return new C2253h4(this, str, str2, true);
    }

    public C2262i4(Uri uri) {
        this(null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, null);
    }
}
