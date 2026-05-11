package t7;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t7.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4669e1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        PointF[] pointFArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 2) {
                pointFArr = (PointF[]) W6.b.j(parcel, t10, PointF.CREATOR);
            } else if (m10 != 3) {
                W6.b.B(parcel, t10);
            } else {
                i10 = W6.b.v(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new D0(pointFArr, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new D0[i10];
    }
}
