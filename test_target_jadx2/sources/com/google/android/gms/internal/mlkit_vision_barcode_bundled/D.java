package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        C2516u c2516u = null;
        C2531x c2531x = null;
        C2536y c2536y = null;
        A a10 = null;
        C2541z c2541z = null;
        C2521v c2521v = null;
        r rVar = null;
        C2506s c2506s = null;
        C2511t c2511t = null;
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
                    c2516u = (C2516u) W6.b.f(parcel, t10, C2516u.CREATOR);
                    break;
                case 8:
                    c2531x = (C2531x) W6.b.f(parcel, t10, C2531x.CREATOR);
                    break;
                case 9:
                    c2536y = (C2536y) W6.b.f(parcel, t10, C2536y.CREATOR);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    a10 = (A) W6.b.f(parcel, t10, A.CREATOR);
                    break;
                case 11:
                    c2541z = (C2541z) W6.b.f(parcel, t10, C2541z.CREATOR);
                    break;
                case 12:
                    c2521v = (C2521v) W6.b.f(parcel, t10, C2521v.CREATOR);
                    break;
                case 13:
                    rVar = (r) W6.b.f(parcel, t10, r.CREATOR);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    c2506s = (C2506s) W6.b.f(parcel, t10, C2506s.CREATOR);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    c2511t = (C2511t) W6.b.f(parcel, t10, C2511t.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C(i10, str, str2, bArr, pointArr, i11, c2516u, c2531x, c2536y, a10, c2541z, c2521v, rVar, c2506s, c2511t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C[i10];
    }
}
