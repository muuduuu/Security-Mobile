package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 2:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case 3:
                    z12 = W6.b.n(parcel, t10);
                    break;
                case 4:
                    z13 = W6.b.n(parcel, t10);
                    break;
                case 5:
                    z14 = W6.b.n(parcel, t10);
                    break;
                case 6:
                    z15 = W6.b.n(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new r(z10, z11, z12, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
