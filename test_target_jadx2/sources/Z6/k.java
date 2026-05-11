package Z6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 != 2) {
                W6.b.B(parcel, t10);
            } else {
                z10 = W6.b.n(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new g(i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
