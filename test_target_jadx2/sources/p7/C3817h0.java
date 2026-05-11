package p7;

import V6.C1269d;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: p7.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3817h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                locationRequest = (LocationRequest) W6.b.f(parcel, t10, LocationRequest.CREATOR);
            } else if (m10 != 5) {
                switch (m10) {
                    case 8:
                        z10 = W6.b.n(parcel, t10);
                        break;
                    case 9:
                        z11 = W6.b.n(parcel, t10);
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        str = W6.b.g(parcel, t10);
                        break;
                    case 11:
                        z12 = W6.b.n(parcel, t10);
                        break;
                    case 12:
                        z13 = W6.b.n(parcel, t10);
                        break;
                    case 13:
                        str2 = W6.b.g(parcel, t10);
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        j10 = W6.b.x(parcel, t10);
                        break;
                    default:
                        W6.b.B(parcel, t10);
                        break;
                }
            } else {
                arrayList = W6.b.k(parcel, t10, C1269d.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new C3815g0(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3815g0[i10];
    }
}
