package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        S8 s82 = null;
        String str = null;
        String str2 = null;
        T8[] t8Arr = null;
        Q8[] q8Arr = null;
        String[] strArr = null;
        K8[] k8Arr = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    s82 = (S8) W6.b.f(parcel, t10, S8.CREATOR);
                    break;
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 4:
                    t8Arr = (T8[]) W6.b.j(parcel, t10, T8.CREATOR);
                    break;
                case 5:
                    q8Arr = (Q8[]) W6.b.j(parcel, t10, Q8.CREATOR);
                    break;
                case 6:
                    strArr = W6.b.h(parcel, t10);
                    break;
                case 7:
                    k8Arr = (K8[]) W6.b.j(parcel, t10, K8.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new O8(s82, str, str2, t8Arr, q8Arr, strArr, k8Arr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new O8[i10];
    }
}
