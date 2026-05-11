package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class f6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        float f10 = 0.0f;
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
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 4:
                    i13 = W6.b.v(parcel, t10);
                    break;
                case 5:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 6:
                    f10 = W6.b.r(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new e6(i10, i11, i12, i13, z10, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e6[i10];
    }
}
