package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4039b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        String str3 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 2) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 3) {
                str = W6.b.g(parcel, t10);
            } else if (m10 == 4) {
                str3 = W6.b.g(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                str2 = W6.b.g(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new S4(i10, str, str3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new S4[i10];
    }
}
