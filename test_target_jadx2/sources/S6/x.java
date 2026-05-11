package S6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class x implements Parcelable.Creator {
    public static final c a(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        boolean z10 = false;
        e eVar = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                eVar = (e) W6.b.f(parcel, t10, e.CREATOR);
            } else if (m10 != 2) {
                W6.b.B(parcel, t10);
            } else {
                z10 = W6.b.n(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new c(eVar, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
