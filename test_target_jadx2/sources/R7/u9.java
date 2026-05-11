package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class u9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        U5 u52 = null;
        String str = null;
        String str2 = null;
        C4245v6[] c4245v6Arr = null;
        S4[] s4Arr = null;
        String[] strArr = null;
        C4162n2[] c4162n2Arr = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    u52 = (U5) W6.b.f(parcel, t10, U5.CREATOR);
                    break;
                case 3:
                    str = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    c4245v6Arr = (C4245v6[]) W6.b.j(parcel, t10, C4245v6.CREATOR);
                    break;
                case 6:
                    s4Arr = (S4[]) W6.b.j(parcel, t10, S4.CREATOR);
                    break;
                case 7:
                    strArr = W6.b.h(parcel, t10);
                    break;
                case 8:
                    c4162n2Arr = (C4162n2[]) W6.b.j(parcel, t10, C4162n2.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new Q3(u52, str, str2, c4245v6Arr, s4Arr, strArr, c4162n2Arr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q3[i10];
    }
}
