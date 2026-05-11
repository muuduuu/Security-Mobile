package V6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    i13 = W6.b.v(parcel, t10);
                    break;
                case 4:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 5:
                    j11 = W6.b.x(parcel, t10);
                    break;
                case 6:
                    str = W6.b.g(parcel, t10);
                    break;
                case 7:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 8:
                    i14 = W6.b.v(parcel, t10);
                    break;
                case 9:
                    i10 = W6.b.v(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C1285p(i11, i12, i13, j10, j11, str, str2, i14, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1285p[i10];
    }
}
