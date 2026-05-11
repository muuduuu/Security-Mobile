package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4089g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 2) {
                str = W6.b.g(parcel, t10);
            } else if (m10 != 3) {
                W6.b.B(parcel, t10);
            } else {
                str2 = W6.b.g(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C4266x7(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4266x7[i10];
    }
}
