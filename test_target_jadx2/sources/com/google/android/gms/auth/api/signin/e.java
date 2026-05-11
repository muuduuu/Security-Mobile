package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    arrayList = W6.b.k(parcel, t10, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) W6.b.f(parcel, t10, Account.CREATOR);
                    break;
                case 4:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 5:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case 6:
                    z12 = W6.b.n(parcel, t10);
                    break;
                case 7:
                    str = W6.b.g(parcel, t10);
                    break;
                case 8:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 9:
                    arrayList2 = W6.b.k(parcel, t10, O6.a.CREATOR);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    str3 = W6.b.g(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
