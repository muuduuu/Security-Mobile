package x7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import p7.C3807c0;

/* renamed from: x7.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5117B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        WorkSource workSource = new WorkSource();
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 102;
        String str = null;
        C3807c0 c3807c0 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 2:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 4:
                    j11 = W6.b.x(parcel, t10);
                    break;
                case 5:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 6:
                    workSource = (WorkSource) W6.b.f(parcel, t10, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 8:
                    str = W6.b.g(parcel, t10);
                    break;
                case 9:
                    c3807c0 = (C3807c0) W6.b.f(parcel, t10, C3807c0.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C5118a(j10, i10, i12, j11, z10, i11, str, workSource, c3807c0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5118a[i10];
    }
}
