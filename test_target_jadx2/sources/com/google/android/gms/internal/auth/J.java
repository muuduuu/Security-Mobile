package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class J extends AbstractC2032a implements F0 {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle D0(String str, Bundle bundle) {
        Parcel p10 = p();
        p10.writeString(str);
        AbstractC2059j.c(p10, bundle);
        Parcel k12 = k1(2, p10);
        Bundle bundle2 = (Bundle) AbstractC2059j.a(k12, Bundle.CREATOR);
        k12.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle s(Account account, String str, Bundle bundle) {
        Parcel p10 = p();
        AbstractC2059j.c(p10, account);
        p10.writeString(str);
        AbstractC2059j.c(p10, bundle);
        Parcel k12 = k1(5, p10);
        Bundle bundle2 = (Bundle) AbstractC2059j.a(k12, Bundle.CREATOR);
        k12.recycle();
        return bundle2;
    }
}
