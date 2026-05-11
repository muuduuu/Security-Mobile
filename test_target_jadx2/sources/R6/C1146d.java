package R6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1146d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            if (W6.b.m(t10) != 1) {
                W6.b.B(parcel, t10);
            } else {
                intent = (Intent) W6.b.f(parcel, t10, Intent.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new C1143a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1143a[i10];
    }
}
