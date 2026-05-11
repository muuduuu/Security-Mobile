package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class V2 {

    /* renamed from: a, reason: collision with root package name */
    private final U2 f25711a;

    public V2(U2 u22) {
        AbstractC1287s.m(u22);
        this.f25711a = u22;
    }

    public final void a(Context context, Intent intent) {
        C2760q3 O10 = C2760q3.O(context, null, null);
        C2 a10 = O10.a();
        if (intent == null) {
            a10.r().a("Receiver called with null intent");
            return;
        }
        O10.c();
        String action = intent.getAction();
        a10.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                a10.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            a10.w().a("Starting wakeful intent.");
            this.f25711a.a(context, className);
        }
    }
}
