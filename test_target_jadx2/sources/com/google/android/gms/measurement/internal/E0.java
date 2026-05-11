package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import j0.C3476a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class E0 extends G1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f25376b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f25377c;

    /* renamed from: d, reason: collision with root package name */
    private long f25378d;

    public E0(C2760q3 c2760q3) {
        super(c2760q3);
        this.f25377c = new C3476a();
        this.f25376b = new C3476a();
    }

    private final void o(long j10, C2730m5 c2730m5) {
        if (c2730m5 == null) {
            this.f25694a.a().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f25694a.a().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        l7.k0(c2730m5, bundle, true);
        this.f25694a.B().t("am", "_xa", bundle);
    }

    private final void p(String str, long j10, C2730m5 c2730m5) {
        if (c2730m5 == null) {
            this.f25694a.a().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f25694a.a().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        l7.k0(c2730m5, bundle, true);
        this.f25694a.B().t("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(long j10) {
        Map map = this.f25376b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f25378d = j10;
    }

    public final void i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f25694a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f25694a.b().t(new RunnableC2628a(this, str, j10));
        }
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f25694a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f25694a.b().t(new B(this, str, j10));
        }
    }

    public final void k(long j10) {
        C2730m5 q10 = this.f25694a.I().q(false);
        Map map = this.f25376b;
        for (String str : map.keySet()) {
            p(str, j10 - ((Long) map.get(str)).longValue(), q10);
        }
        if (!map.isEmpty()) {
            o(j10 - this.f25378d, q10);
        }
        n(j10);
    }

    final /* synthetic */ void l(String str, long j10) {
        h();
        AbstractC1287s.g(str);
        Map map = this.f25377c;
        if (map.isEmpty()) {
            this.f25378d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f25694a.a().r().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f25376b.put(str, Long.valueOf(j10));
        }
    }

    final /* synthetic */ void m(String str, long j10) {
        h();
        AbstractC1287s.g(str);
        Map map = this.f25377c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f25694a.a().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C2730m5 q10 = this.f25694a.I().q(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            map.put(str, Integer.valueOf(intValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f25376b;
        Long l10 = (Long) map2.get(str);
        if (l10 == null) {
            this.f25694a.a().o().a("First ad unit exposure time was never set");
        } else {
            long longValue = j10 - l10.longValue();
            map2.remove(str);
            p(str, longValue, q10);
        }
        if (map.isEmpty()) {
            long j11 = this.f25378d;
            if (j11 == 0) {
                this.f25694a.a().o().a("First ad exposure time was never set");
            } else {
                o(j10 - j11, q10);
                this.f25378d = 0L;
            }
        }
    }
}
