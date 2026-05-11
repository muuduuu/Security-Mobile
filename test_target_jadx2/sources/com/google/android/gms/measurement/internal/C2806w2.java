package com.google.android.gms.measurement.internal;

import V6.AbstractC1267c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.AbstractC2022n;

/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2806w2 extends AbstractC1267c {
    public C2806w2(Context context, Looper looper, AbstractC1267c.a aVar, AbstractC1267c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return AbstractC2022n.f23510a;
    }

    @Override // V6.AbstractC1267c
    public final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC2703j2 ? (InterfaceC2703j2) queryLocalInterface : new C2679g2(iBinder);
    }
}
