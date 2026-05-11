package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.Objects;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2824y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f26471a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26472b;

    RunnableC2824y4(C2642b5 c2642b5, Bundle bundle) {
        this.f26471a = bundle;
        Objects.requireNonNull(c2642b5);
        this.f26472b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2642b5 c2642b5 = this.f26472b;
        c2642b5.h();
        c2642b5.j();
        Bundle bundle = this.f26471a;
        AbstractC1287s.m(bundle);
        String g10 = AbstractC1287s.g(bundle.getString("name"));
        if (!c2642b5.f25694a.g()) {
            c2642b5.f25694a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c2642b5.f25694a.J().d0(new C2692i(bundle.getString("app_id"), BuildConfig.FLAVOR, new h7(g10, 0L, null, BuildConfig.FLAVOR), bundle.getLong("creation_timestamp"), bundle.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c2642b5.f25694a.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
