package x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;
import p7.C3823k0;

/* loaded from: classes2.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = BuildConfig.FLAVOR;
        ArrayList arrayList = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                arrayList = W6.b.k(parcel, t10, C3823k0.CREATOR);
            } else if (m10 == 2) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 3) {
                str = W6.b.g(parcel, t10);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                str2 = W6.b.g(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C5127j(arrayList, i10, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5127j[i10];
    }
}
