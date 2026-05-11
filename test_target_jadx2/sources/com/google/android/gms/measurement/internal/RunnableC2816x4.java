package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2816x4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f26454a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26455b;

    RunnableC2816x4(C2642b5 c2642b5, Bundle bundle) {
        this.f26454a = bundle;
        Objects.requireNonNull(c2642b5);
        this.f26455b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2642b5 c2642b5 = this.f26455b;
        c2642b5.h();
        c2642b5.j();
        Bundle bundle = this.f26454a;
        AbstractC1287s.m(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC1287s.g(string);
        AbstractC1287s.g(string2);
        AbstractC1287s.m(bundle.get("value"));
        if (!c2642b5.f25694a.g()) {
            c2642b5.f25694a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        h7 h7Var = new h7(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C2760q3 c2760q3 = c2642b5.f25694a;
            I R10 = c2760q3.C().R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c2642b5.f25694a.J().d0(new C2692i(bundle.getString("app_id"), string2, h7Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2760q3.C().R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), R10, bundle.getLong("time_to_live"), c2760q3.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
