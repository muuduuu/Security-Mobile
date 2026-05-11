package r7;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public final class Y8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        Q8 q82 = null;
        T8 t82 = null;
        U8 u82 = null;
        W8 w82 = null;
        V8 v82 = null;
        R8 r82 = null;
        M8 m82 = null;
        O8 o82 = null;
        P8 p82 = null;
        int i10 = 0;
        int i11 = 0;
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
                    bArr = W6.b.b(parcel, t10);
                    break;
                case 5:
                    pointArr = (Point[]) W6.b.j(parcel, t10, Point.CREATOR);
                    break;
                case 6:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 7:
                    q82 = (Q8) W6.b.f(parcel, t10, Q8.CREATOR);
                    break;
                case 8:
                    t82 = (T8) W6.b.f(parcel, t10, T8.CREATOR);
                    break;
                case 9:
                    u82 = (U8) W6.b.f(parcel, t10, U8.CREATOR);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    w82 = (W8) W6.b.f(parcel, t10, W8.CREATOR);
                    break;
                case 11:
                    v82 = (V8) W6.b.f(parcel, t10, V8.CREATOR);
                    break;
                case 12:
                    r82 = (R8) W6.b.f(parcel, t10, R8.CREATOR);
                    break;
                case 13:
                    m82 = (M8) W6.b.f(parcel, t10, M8.CREATOR);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    o82 = (O8) W6.b.f(parcel, t10, O8.CREATOR);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    p82 = (P8) W6.b.f(parcel, t10, P8.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new X8(i10, str, str2, bArr, pointArr, i11, q82, t82, u82, w82, v82, r82, m82, o82, p82);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new X8[i10];
    }
}
