package F7;

import F7.a;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
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
                    str5 = W6.b.g(parcel, t10);
                    break;
                case 7:
                    str6 = W6.b.g(parcel, t10);
                    break;
                case 8:
                    str7 = W6.b.g(parcel, t10);
                    break;
                case 9:
                    str8 = W6.b.g(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    str9 = W6.b.g(parcel, t10);
                    break;
                case 11:
                    str10 = W6.b.g(parcel, t10);
                    break;
                case 12:
                    str11 = W6.b.g(parcel, t10);
                    break;
                case 13:
                    str12 = W6.b.g(parcel, t10);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    str13 = W6.b.g(parcel, t10);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    str14 = W6.b.g(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new a.e(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.e[i10];
    }
}
