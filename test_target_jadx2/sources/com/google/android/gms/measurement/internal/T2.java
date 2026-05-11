package com.google.android.gms.measurement.internal;

import d7.C2997c;
import d7.C2998d;

/* loaded from: classes2.dex */
public final class T2 {

    /* renamed from: a, reason: collision with root package name */
    final C2760q3 f25693a;

    T2(b7 b7Var) {
        this.f25693a = b7Var.g0();
    }

    final boolean a() {
        try {
            C2760q3 c2760q3 = this.f25693a;
            C2997c a10 = C2998d.a(c2760q3.e());
            if (a10 != null) {
                return a10.e("com.android.vending", 128).versionCode >= 80837300;
            }
            c2760q3.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f25693a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
