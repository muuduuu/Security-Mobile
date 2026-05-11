package F7;

import F7.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        a.b bVar = null;
        a.b bVar2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    str4 = W6.b.g(parcel, t10);
                    break;
                case 6:
                    str5 = W6.b.g(parcel, t10);
                    break;
                case 7:
                    bVar = (a.b) W6.b.f(parcel, t10, a.b.CREATOR);
                    break;
                case 8:
                    bVar2 = (a.b) W6.b.f(parcel, t10, a.b.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new a.c(str, str2, str3, str4, str5, bVar, bVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.c[i10];
    }
}
