package V6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        C1289u c1289u = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    c1289u = (C1289u) W6.b.f(parcel, t10, C1289u.CREATOR);
                    break;
                case 2:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 3:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case 4:
                    iArr = W6.b.d(parcel, t10);
                    break;
                case 5:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 6:
                    iArr2 = W6.b.d(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C1273f(c1289u, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1273f[i10];
    }
}
