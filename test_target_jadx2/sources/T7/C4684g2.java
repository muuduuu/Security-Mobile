package t7;

import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* renamed from: t7.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4684g2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = Float.MAX_VALUE;
        float f18 = Float.MAX_VALUE;
        float f19 = Float.MAX_VALUE;
        N5[] n5Arr = null;
        D0[] d0Arr = null;
        float f20 = -1.0f;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    f10 = W6.b.r(parcel, t10);
                    break;
                case 4:
                    f11 = W6.b.r(parcel, t10);
                    break;
                case 5:
                    f12 = W6.b.r(parcel, t10);
                    break;
                case 6:
                    f13 = W6.b.r(parcel, t10);
                    break;
                case 7:
                    f17 = W6.b.r(parcel, t10);
                    break;
                case 8:
                    f18 = W6.b.r(parcel, t10);
                    break;
                case 9:
                    n5Arr = (N5[]) W6.b.j(parcel, t10, N5.CREATOR);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    f14 = W6.b.r(parcel, t10);
                    break;
                case 11:
                    f15 = W6.b.r(parcel, t10);
                    break;
                case 12:
                    f16 = W6.b.r(parcel, t10);
                    break;
                case 13:
                    d0Arr = (D0[]) W6.b.j(parcel, t10, D0.CREATOR);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    f19 = W6.b.r(parcel, t10);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    f20 = W6.b.r(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new F1(i10, i11, f10, f11, f12, f13, f17, f18, f19, n5Arr, f14, f15, f16, d0Arr, f20);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new F1[i10];
    }
}
