package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    bArr = W6.b.b(parcel, t10);
                    break;
                case 4:
                    bArr2 = W6.b.c(parcel, t10);
                    break;
                case 5:
                    bArr3 = W6.b.c(parcel, t10);
                    break;
                case 6:
                    bArr4 = W6.b.c(parcel, t10);
                    break;
                case 7:
                    bArr5 = W6.b.c(parcel, t10);
                    break;
                case 8:
                    iArr = W6.b.d(parcel, t10);
                    break;
                case 9:
                    bArr6 = W6.b.c(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C5262a(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5262a[i10];
    }
}
