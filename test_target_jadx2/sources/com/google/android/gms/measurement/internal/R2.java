package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import b7.C1653b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class R2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.U f25667a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f25668b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S2 f25669c;

    R2(S2 s22, com.google.android.gms.internal.measurement.U u10, ServiceConnection serviceConnection) {
        this.f25667a = u10;
        this.f25668b = serviceConnection;
        Objects.requireNonNull(s22);
        this.f25669c = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        S2 s22 = this.f25669c;
        T2 t22 = s22.f25681b;
        C2760q3 c2760q3 = t22.f25693a;
        c2760q3.b().h();
        Bundle bundle2 = new Bundle();
        String a10 = s22.a();
        bundle2.putString("package_name", a10);
        try {
            bundle = this.f25667a.K(bundle2);
        } catch (Exception e10) {
            t22.f25693a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundle == null) {
            c2760q3.a().o().a("Install Referrer Service returned a null response");
            bundle = null;
        }
        C2760q3 c2760q32 = t22.f25693a;
        c2760q32.b().h();
        C2760q3.q();
        if (bundle != null) {
            long j10 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c2760q32.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c2760q32.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    c2760q32.a().w().b("InstallReferrer API result", string);
                    Bundle s02 = c2760q32.C().s0(Uri.parse("?".concat(string)));
                    if (s02 == null) {
                        c2760q32.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List asList = Arrays.asList(((String) AbstractC2671f2.f26010h1.b(null)).split(","));
                        Iterator<String> it = s02.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (asList.contains(it.next())) {
                                long j11 = bundle.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 > 0) {
                                    s02.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j10 == c2760q32.x().f25634g.a()) {
                            c2760q32.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c2760q32.g()) {
                            c2760q32.x().f25634g.b(j10);
                            c2760q32.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            s02.putString("_cis", "referrer API v2");
                            c2760q32.B().w("auto", "_cmp", s02, a10);
                        }
                    }
                }
            }
        }
        C1653b.b().c(c2760q32.e(), this.f25668b);
    }
}
