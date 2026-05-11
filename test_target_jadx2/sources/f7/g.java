package F7;

import F7.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        a.h hVar = null;
        String str = null;
        String str2 = null;
        a.i[] iVarArr = null;
        a.f[] fVarArr = null;
        String[] strArr = null;
        a.C0056a[] c0056aArr = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    hVar = (a.h) W6.b.f(parcel, t10, a.h.CREATOR);
                    break;
                case 3:
                    str = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    iVarArr = (a.i[]) W6.b.j(parcel, t10, a.i.CREATOR);
                    break;
                case 6:
                    fVarArr = (a.f[]) W6.b.j(parcel, t10, a.f.CREATOR);
                    break;
                case 7:
                    strArr = W6.b.h(parcel, t10);
                    break;
                case 8:
                    c0056aArr = (a.C0056a[]) W6.b.j(parcel, t10, a.C0056a.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new a.d(hVar, str, str2, iVarArr, fVarArr, strArr, c0056aArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.d[i10];
    }
}
