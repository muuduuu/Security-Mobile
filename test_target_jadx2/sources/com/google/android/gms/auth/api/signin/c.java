package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    str4 = W6.b.g(parcel, t10);
                    break;
                case 6:
                    uri = (Uri) W6.b.f(parcel, t10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = W6.b.g(parcel, t10);
                    break;
                case 8:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 9:
                    str6 = W6.b.g(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    arrayList = W6.b.k(parcel, t10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = W6.b.g(parcel, t10);
                    break;
                case 12:
                    str8 = W6.b.g(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
