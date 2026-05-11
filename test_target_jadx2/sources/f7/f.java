package F7;

import F7.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 4:
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 5:
                    i13 = W6.b.v(parcel, t10);
                    break;
                case 6:
                    i14 = W6.b.v(parcel, t10);
                    break;
                case 7:
                    i15 = W6.b.v(parcel, t10);
                    break;
                case 8:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 9:
                    str = W6.b.g(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new a.b(i10, i11, i12, i13, i14, i15, z10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.b[i10];
    }
}
