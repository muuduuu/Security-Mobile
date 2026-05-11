package com.google.android.gms.internal.auth;

import T6.InterfaceC1173g;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class T1 extends AbstractC2032a implements IInterface {
    T1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void m1(InterfaceC1173g interfaceC1173g, C2050g c2050g) {
        Parcel p10 = p();
        AbstractC2059j.d(p10, interfaceC1173g);
        AbstractC2059j.c(p10, c2050g);
        l1(2, p10);
    }

    public final void n1(S1 s12, Account account, String str, Bundle bundle) {
        Parcel p10 = p();
        AbstractC2059j.d(p10, s12);
        AbstractC2059j.c(p10, account);
        p10.writeString(str);
        AbstractC2059j.c(p10, bundle);
        l1(1, p10);
    }
}
