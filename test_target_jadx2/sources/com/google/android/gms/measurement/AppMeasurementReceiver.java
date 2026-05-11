package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.U2;
import com.google.android.gms.measurement.internal.V2;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends X0.a implements U2 {

    /* renamed from: c, reason: collision with root package name */
    private V2 f25276c;

    @Override // com.google.android.gms.measurement.internal.U2
    public void a(Context context, Intent intent) {
        X0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f25276c == null) {
            this.f25276c = new V2(this);
        }
        this.f25276c.a(context, intent);
    }
}
