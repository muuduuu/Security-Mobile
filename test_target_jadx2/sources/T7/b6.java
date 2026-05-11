package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 2) {
                i11 = W6.b.v(parcel, t10);
            } else if (m10 == 3) {
                i12 = W6.b.v(parcel, t10);
            } else if (m10 == 4) {
                i13 = W6.b.v(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                j10 = W6.b.x(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new a6(i10, i11, i12, i13, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a6[i10];
    }
}
