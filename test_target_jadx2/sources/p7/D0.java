package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class D0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Status status = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            if (W6.b.m(t10) != 1) {
                W6.b.B(parcel, t10);
            } else {
                status = (Status) W6.b.f(parcel, t10, Status.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new C0(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0[i10];
    }
}
