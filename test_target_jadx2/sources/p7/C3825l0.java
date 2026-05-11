package p7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p7.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3825l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        int i10 = 0;
        short s10 = 0;
        int i11 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f10 = 0.0f;
        long j10 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    str = W6.b.g(parcel, t10);
                    break;
                case 2:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 3:
                    s10 = W6.b.z(parcel, t10);
                    break;
                case 4:
                    d10 = W6.b.p(parcel, t10);
                    break;
                case 5:
                    d11 = W6.b.p(parcel, t10);
                    break;
                case 6:
                    f10 = W6.b.r(parcel, t10);
                    break;
                case 7:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 8:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 9:
                    i12 = W6.b.v(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C3823k0(str, i10, s10, d10, d11, f10, j10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3823k0[i10];
    }
}
