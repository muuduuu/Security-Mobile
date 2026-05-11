package B7;

import V6.X;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        C2010b c2010b = null;
        int i10 = 0;
        X x10 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 2) {
                c2010b = (C2010b) W6.b.f(parcel, t10, C2010b.CREATOR);
            } else if (m10 != 3) {
                W6.b.B(parcel, t10);
            } else {
                x10 = (X) W6.b.f(parcel, t10, X.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new l(i10, c2010b, x10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
