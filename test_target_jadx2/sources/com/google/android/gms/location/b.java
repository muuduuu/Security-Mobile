package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import p7.C3807c0;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        WorkSource workSource = new WorkSource();
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        long j15 = -1;
        String str = null;
        C3807c0 c3807c0 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 3:
                    j11 = W6.b.x(parcel, t10);
                    break;
                case 4:
                default:
                    W6.b.B(parcel, t10);
                    break;
                case 5:
                    j13 = W6.b.x(parcel, t10);
                    break;
                case 6:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 7:
                    f10 = W6.b.r(parcel, t10);
                    break;
                case 8:
                    j12 = W6.b.x(parcel, t10);
                    break;
                case 9:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    j14 = W6.b.x(parcel, t10);
                    break;
                case 11:
                    j15 = W6.b.x(parcel, t10);
                    break;
                case 12:
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 13:
                    i13 = W6.b.v(parcel, t10);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    str = W6.b.g(parcel, t10);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    workSource = (WorkSource) W6.b.f(parcel, t10, WorkSource.CREATOR);
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    c3807c0 = (C3807c0) W6.b.f(parcel, t10, C3807c0.CREATOR);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new LocationRequest(i10, j10, j11, j12, j13, j14, i11, f10, z10, j15, i12, i13, str, z11, workSource, c3807c0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
