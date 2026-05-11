package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Status status = null;
        r rVar = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                status = (Status) W6.b.f(parcel, t10, Status.CREATOR);
            } else if (m10 != 2) {
                W6.b.B(parcel, t10);
            } else {
                rVar = (r) W6.b.f(parcel, t10, r.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new q(status, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
