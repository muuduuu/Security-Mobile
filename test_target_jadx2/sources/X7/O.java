package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                arrayList = W6.b.k(parcel, t10, LocationRequest.CREATOR);
            } else if (m10 == 2) {
                z10 = W6.b.n(parcel, t10);
            } else if (m10 != 3) {
                W6.b.B(parcel, t10);
            } else {
                z11 = W6.b.n(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C5132o(arrayList, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5132o[i10];
    }
}
