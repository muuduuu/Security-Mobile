package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = BuildConfig.FLAVOR;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = BuildConfig.FLAVOR;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 4) {
                str = W6.b.g(parcel, t10);
            } else if (m10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) W6.b.f(parcel, t10, GoogleSignInAccount.CREATOR);
            } else if (m10 != 8) {
                W6.b.B(parcel, t10);
            } else {
                str2 = W6.b.g(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
