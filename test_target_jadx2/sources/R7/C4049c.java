package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4049c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 2) {
                d10 = W6.b.p(parcel, t10);
            } else if (m10 != 3) {
                W6.b.B(parcel, t10);
            } else {
                d11 = W6.b.p(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C4224t5(d10, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4224t5[i10];
    }
}
