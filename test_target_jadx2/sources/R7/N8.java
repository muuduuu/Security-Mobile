package r7;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public final class N8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        double d10 = 0.0d;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        S4 s42 = null;
        C4245v6 c4245v6 = null;
        W6 w62 = null;
        U7 u72 = null;
        C4266x7 c4266x7 = null;
        C4224t5 c4224t5 = null;
        C4183p3 c4183p3 = null;
        Q3 q32 = null;
        C4203r4 c4203r4 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    str = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 6:
                    pointArr = (Point[]) W6.b.j(parcel, t10, Point.CREATOR);
                    break;
                case 7:
                    s42 = (S4) W6.b.f(parcel, t10, S4.CREATOR);
                    break;
                case 8:
                    c4245v6 = (C4245v6) W6.b.f(parcel, t10, C4245v6.CREATOR);
                    break;
                case 9:
                    w62 = (W6) W6.b.f(parcel, t10, W6.CREATOR);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    u72 = (U7) W6.b.f(parcel, t10, U7.CREATOR);
                    break;
                case 11:
                    c4266x7 = (C4266x7) W6.b.f(parcel, t10, C4266x7.CREATOR);
                    break;
                case 12:
                    c4224t5 = (C4224t5) W6.b.f(parcel, t10, C4224t5.CREATOR);
                    break;
                case 13:
                    c4183p3 = (C4183p3) W6.b.f(parcel, t10, C4183p3.CREATOR);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    q32 = (Q3) W6.b.f(parcel, t10, Q3.CREATOR);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    c4203r4 = (C4203r4) W6.b.f(parcel, t10, C4203r4.CREATOR);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    bArr = W6.b.b(parcel, t10);
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 18:
                    d10 = W6.b.p(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C4247v8(i10, str, str2, i11, pointArr, s42, c4245v6, w62, u72, c4266x7, c4224t5, c4183p3, q32, c4203r4, bArr, z10, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4247v8[i10];
    }
}
