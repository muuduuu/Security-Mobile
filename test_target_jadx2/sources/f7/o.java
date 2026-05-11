package F7;

import F7.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 2) {
                str = W6.b.g(parcel, t10);
            } else if (m10 == 3) {
                str2 = W6.b.g(parcel, t10);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                i10 = W6.b.v(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new a.l(str, str2, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.l[i10];
    }
}
