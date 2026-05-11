package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    private final C2760q3 f26364a;

    public t7(C2760q3 c2760q3) {
        this.f26364a = c2760q3;
    }

    final void a() {
        C2760q3 c2760q3 = this.f26364a;
        c2760q3.b().h();
        if (e()) {
            if (d()) {
                c2760q3.x().f25651x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c2760q3.B().t("auto", "_cmpx", bundle);
            } else {
                String a10 = c2760q3.x().f25651x.a();
                if (TextUtils.isEmpty(a10)) {
                    c2760q3.a().p().a("Cache still valid but referrer not found");
                } else {
                    long a11 = c2760q3.x().f25652y.a() / 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a11 - 1) * 3600000);
                    Object obj = pair.first;
                    c2760q3.B().t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                c2760q3.x().f25651x.b(null);
            }
            c2760q3.x().f25652y.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String uri;
        C2760q3 c2760q3 = this.f26364a;
        c2760q3.b().h();
        if (c2760q3.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        c2760q3.x().f25651x.b(uri);
        c2760q3.x().f25652y.b(c2760q3.f().a());
    }

    final void c() {
        if (e() && d()) {
            this.f26364a.x().f25651x.b(null);
        }
    }

    final boolean d() {
        if (!e()) {
            return false;
        }
        C2760q3 c2760q3 = this.f26364a;
        return c2760q3.f().a() - c2760q3.x().f25652y.a() > c2760q3.w().D(null, AbstractC2671f2.f26018k0);
    }

    final boolean e() {
        return this.f26364a.x().f25652y.a() > 0;
    }
}
