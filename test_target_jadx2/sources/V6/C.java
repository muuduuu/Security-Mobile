package V6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        ArrayList arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 != 2) {
                W6.b.B(parcel, t10);
            } else {
                arrayList = W6.b.k(parcel, t10, C1285p.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new C1291w(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1291w[i10];
    }
}
