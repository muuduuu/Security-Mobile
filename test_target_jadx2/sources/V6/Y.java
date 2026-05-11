package V6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public final class Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        C2010b c2010b = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 2) {
                iBinder = W6.b.u(parcel, t10);
            } else if (m10 == 3) {
                c2010b = (C2010b) W6.b.f(parcel, t10, C2010b.CREATOR);
            } else if (m10 == 4) {
                z10 = W6.b.n(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                z11 = W6.b.n(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new X(i10, iBinder, c2010b, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new X[i10];
    }
}
