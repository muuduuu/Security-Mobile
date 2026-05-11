package V6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: V6.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1264a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Scope[] scopeArr = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 2) {
                i11 = W6.b.v(parcel, t10);
            } else if (m10 == 3) {
                i12 = W6.b.v(parcel, t10);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                scopeArr = (Scope[]) W6.b.j(parcel, t10, Scope.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new Z(i10, i11, i12, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Z[i10];
    }
}
