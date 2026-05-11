package Q6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.X1;
import z7.C5262a;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        X1 x12 = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        C5262a[] c5262aArr = null;
        boolean z10 = true;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    x12 = (X1) W6.b.f(parcel, t10, X1.CREATOR);
                    break;
                case 3:
                    bArr = W6.b.b(parcel, t10);
                    break;
                case 4:
                    iArr = W6.b.d(parcel, t10);
                    break;
                case 5:
                    strArr = W6.b.h(parcel, t10);
                    break;
                case 6:
                    iArr2 = W6.b.d(parcel, t10);
                    break;
                case 7:
                    bArr2 = W6.b.c(parcel, t10);
                    break;
                case 8:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 9:
                    c5262aArr = (C5262a[]) W6.b.j(parcel, t10, C5262a.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new f(x12, bArr, iArr, strArr, iArr2, bArr2, z10, c5262aArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
