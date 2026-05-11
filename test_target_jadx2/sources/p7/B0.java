package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2012d;
import java.util.List;

/* loaded from: classes2.dex */
public final class B0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        List v10 = v0.v();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        C3807c0 c3807c0 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    str = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 6:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 7:
                    c3807c0 = (C3807c0) W6.b.f(parcel, t10, C3807c0.CREATOR);
                    break;
                case 8:
                    v10 = W6.b.k(parcel, t10, C2012d.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C3807c0(i10, i11, str, str2, str3, i12, v10, c3807c0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3807c0[i10];
    }
}
