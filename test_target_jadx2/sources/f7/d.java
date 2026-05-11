package F7;

import F7.a;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        a.f fVar = null;
        a.i iVar = null;
        a.j jVar = null;
        a.l lVar = null;
        a.k kVar = null;
        a.g gVar = null;
        a.c cVar = null;
        a.d dVar = null;
        a.e eVar = null;
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
                    fVar = (a.f) W6.b.f(parcel, t10, a.f.CREATOR);
                    break;
                case 8:
                    iVar = (a.i) W6.b.f(parcel, t10, a.i.CREATOR);
                    break;
                case 9:
                    jVar = (a.j) W6.b.f(parcel, t10, a.j.CREATOR);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    lVar = (a.l) W6.b.f(parcel, t10, a.l.CREATOR);
                    break;
                case 11:
                    kVar = (a.k) W6.b.f(parcel, t10, a.k.CREATOR);
                    break;
                case 12:
                    gVar = (a.g) W6.b.f(parcel, t10, a.g.CREATOR);
                    break;
                case 13:
                    cVar = (a.c) W6.b.f(parcel, t10, a.c.CREATOR);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    dVar = (a.d) W6.b.f(parcel, t10, a.d.CREATOR);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    eVar = (a.e) W6.b.f(parcel, t10, a.e.CREATOR);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    bArr = W6.b.b(parcel, t10);
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    z10 = W6.b.n(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new a(i10, str, str2, i11, pointArr, fVar, iVar, jVar, lVar, kVar, gVar, cVar, dVar, eVar, bArr, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
