package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.internal.measurement.C2207c3;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public final class H2 extends M6 {
    public H2(b7 b7Var) {
        super(b7Var);
    }

    @Override // com.google.android.gms.measurement.internal.M6
    protected final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f25694a.e().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final void n(String str, N6 n62, C2207c3 c2207c3, E2 e22) {
        h();
        j();
        try {
            URL url = new URI(n62.a()).toURL();
            this.f25405b.K0();
            this.f25694a.b().w(new G2(this, str, url, c2207c3.c(), n62.b(), e22));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            this.f25694a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C2.x(str), n62.a());
        }
    }

    public final void o(I2 i22, Map map, E2 e22) {
        h();
        j();
        AbstractC1287s.m(i22);
        AbstractC1287s.m(e22);
        O6 C02 = this.f25405b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) AbstractC2671f2.f26002f.b(null)).encodedAuthority((String) AbstractC2671f2.f26005g.b(null)).path("config/app/".concat(String.valueOf(i22.r0()))).appendQueryParameter("platform", "android");
        C02.f25694a.w().A();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            this.f25694a.b().w(new G2(this, i22.o0(), new URI(uri).toURL(), null, map, e22));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            this.f25694a.a().o().c("Failed to parse config URL. Not fetching. appId", C2.x(i22.o0()), uri);
        }
    }
}
