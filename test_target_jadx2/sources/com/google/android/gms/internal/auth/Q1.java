package com.google.android.gms.internal.auth;

import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
final class Q1 extends AbstractC1277h {
    Q1(Context context, Looper looper, C1271e c1271e, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        super(context, looper, 224, c1271e, interfaceC1169e, interfaceC1184n);
    }

    @Override // V6.AbstractC1267c
    public final C2012d[] A() {
        return new C2012d[]{I6.e.f4319l, I6.e.f4318k, I6.e.f4308a};
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // V6.AbstractC1267c
    protected final boolean N() {
        return true;
    }

    @Override // V6.AbstractC1267c
    public final boolean X() {
        return true;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final void d(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.d(str);
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return 17895000;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof T1 ? (T1) queryLocalInterface : new T1(iBinder);
    }
}
