package com.google.android.gms.internal.auth;

import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.AbstractC2022n;

/* renamed from: com.google.android.gms.internal.auth.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2041d extends AbstractC1277h {

    /* renamed from: I, reason: collision with root package name */
    private final Bundle f23684I;

    public C2041d(Context context, Looper looper, C1271e c1271e, J6.c cVar, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        super(context, looper, 16, c1271e, interfaceC1169e, interfaceC1184n);
        this.f23684I = new Bundle();
    }

    @Override // V6.AbstractC1267c
    protected final Bundle F() {
        return this.f23684I;
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // V6.AbstractC1267c
    public final boolean X() {
        return true;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return AbstractC2022n.f23510a;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final boolean s() {
        C1271e o02 = o0();
        return (TextUtils.isEmpty(o02.b()) || o02.e(J6.b.f4795a).isEmpty()) ? false : true;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof C2044e ? (C2044e) queryLocalInterface : new C2044e(iBinder);
    }
}
