package x7;

import android.os.Parcel;
import android.os.Parcelable;
import p7.C3807c0;

/* loaded from: classes2.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        String str = null;
        C3807c0 c3807c0 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                j10 = W6.b.x(parcel, t10);
            } else if (m10 == 2) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 3) {
                z10 = W6.b.n(parcel, t10);
            } else if (m10 == 4) {
                str = W6.b.g(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                c3807c0 = (C3807c0) W6.b.f(parcel, t10, C3807c0.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new C5128k(j10, i10, z10, str, c3807c0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5128k[i10];
    }
}
