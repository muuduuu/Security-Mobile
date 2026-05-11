package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2278k2;
import com.google.android.gms.internal.measurement.C2297m3;
import com.google.android.gms.internal.measurement.C2359t3;
import com.google.android.gms.internal.measurement.EnumC2315o3;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class O6 extends F6 {
    O6(b7 b7Var) {
        super(b7Var);
    }

    private final String k(String str) {
        String x10 = this.f25405b.D0().x(str);
        if (TextUtils.isEmpty(x10)) {
            return (String) AbstractC2671f2.f26033r.b(null);
        }
        Uri parse = Uri.parse((String) AbstractC2671f2.f26033r.b(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(x10).length() + 1 + String.valueOf(authority).length());
        sb2.append(x10);
        sb2.append(".");
        sb2.append(authority);
        buildUpon.authority(sb2.toString());
        return buildUpon.build().toString();
    }

    private static final boolean l(String str) {
        String str2 = (String) AbstractC2671f2.f26037t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final N6 i(String str) {
        I2 J02;
        b7 b7Var = this.f25405b;
        I2 J03 = b7Var.F0().J0(str);
        N6 n62 = null;
        if (J03 == null || !J03.V()) {
            return new N6(k(str), Collections.emptyMap(), EnumC2714k5.GOOGLE_ANALYTICS, null);
        }
        C2297m3 D10 = C2359t3.D();
        D10.z(2);
        D10.y((EnumC2315o3) AbstractC1287s.m(EnumC2315o3.zzb(J03.M())));
        String p02 = J03.p0();
        C2278k2 w10 = b7Var.D0().w(str);
        if (w10 == null || (J02 = b7Var.F0().J0(str)) == null || ((!w10.Q() || w10.R().E() != 100) && !this.f25694a.C().P(str, J02.l0()) && (TextUtils.isEmpty(p02) || Math.abs(p02.hashCode() % 100) >= w10.R().E()))) {
            D10.A(3);
            return new N6(k(str), Collections.emptyMap(), EnumC2714k5.GOOGLE_ANALYTICS, (C2359t3) D10.v());
        }
        String o02 = J03.o0();
        D10.z(2);
        C2278k2 w11 = b7Var.D0().w(J03.o0());
        if (w11 == null || !w11.Q()) {
            this.f25694a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", o02);
            D10.A(4);
        } else {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(J03.l0())) {
                hashMap.put("x-gtm-server-preview", J03.l0());
            }
            String F10 = w11.R().F();
            EnumC2315o3 zzb = EnumC2315o3.zzb(J03.M());
            if (zzb != null && zzb != EnumC2315o3.CLIENT_UPLOAD_ELIGIBLE) {
                D10.y(zzb);
            } else if (l(J03.o0())) {
                D10.y(EnumC2315o3.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(F10)) {
                D10.y(EnumC2315o3.MISSING_SGTM_SERVER_URL);
            } else {
                this.f25694a.a().w().b("[sgtm] Eligible for client side upload. appId", o02);
                D10.z(3);
                D10.y(EnumC2315o3.CLIENT_UPLOAD_ELIGIBLE);
                n62 = new N6(F10, hashMap, EnumC2714k5.SGTM_CLIENT, (C2359t3) D10.v());
            }
            w11.R().C();
            w11.R().D();
            C2760q3 c2760q3 = this.f25694a;
            c2760q3.c();
            if (TextUtils.isEmpty(F10)) {
                D10.A(6);
                c2760q3.a().w().b("[sgtm] Local service, missing sgtm_server_url", J03.o0());
            } else {
                c2760q3.a().w().b("[sgtm] Eligible for local service direct upload. appId", o02);
                D10.z(5);
                D10.A(2);
                n62 = new N6(F10, hashMap, EnumC2714k5.SGTM, (C2359t3) D10.v());
            }
        }
        return n62 != null ? n62 : new N6(k(str), Collections.emptyMap(), EnumC2714k5.GOOGLE_ANALYTICS, (C2359t3) D10.v());
    }

    final boolean j(String str, EnumC2315o3 enumC2315o3) {
        C2278k2 w10;
        h();
        return (enumC2315o3 != EnumC2315o3.CLIENT_UPLOAD_ELIGIBLE || l(str) || (w10 = this.f25405b.D0().w(str)) == null || !w10.Q() || w10.R().F().isEmpty()) ? false : true;
    }
}
