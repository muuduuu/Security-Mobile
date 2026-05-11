package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2331q1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f24630e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Activity f24631f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2402y1 f24632g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2331q1(C2402y1 c2402y1, Bundle bundle, Activity activity) {
        super(c2402y1.f24696a, true);
        this.f24630e = bundle;
        this.f24631f = activity;
        Objects.requireNonNull(c2402y1);
        this.f24632g = c2402y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f24630e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        InterfaceC2374v0 interfaceC2374v0 = (InterfaceC2374v0) AbstractC1287s.m(this.f24632g.f24696a.n());
        Activity activity = this.f24631f;
        interfaceC2374v0.onActivityCreatedByScionActivityInfo(J0.j(activity), bundle, this.f24613b);
    }
}
