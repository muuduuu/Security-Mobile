package com.google.android.gms.internal.clearcut;

import S6.h;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class P1 extends AbstractC1277h {
    public P1(Context context, Looper looper, C1271e c1271e, h.b bVar, h.c cVar) {
        super(context, looper, 40, c1271e, bVar, cVar);
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return 11925000;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof T1 ? (T1) queryLocalInterface : new U1(iBinder);
    }
}
