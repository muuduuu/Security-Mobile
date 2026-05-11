package V6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Bundle bundle = null;
        C1273f c1273f = null;
        int i10 = 0;
        C2012d[] c2012dArr = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                bundle = W6.b.a(parcel, t10);
            } else if (m10 == 2) {
                c2012dArr = (C2012d[]) W6.b.j(parcel, t10, C2012d.CREATOR);
            } else if (m10 == 3) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                c1273f = (C1273f) W6.b.f(parcel, t10, C1273f.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new r0(bundle, c2012dArr, i10, c1273f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r0[i10];
    }
}
