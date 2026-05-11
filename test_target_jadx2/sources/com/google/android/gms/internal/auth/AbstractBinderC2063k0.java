package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2063k0 extends AbstractBinderC2038c implements F0 {
    public static F0 k1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof F0 ? (F0) queryLocalInterface : new J(iBinder);
    }
}
