package Z6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            if (W6.b.m(t10) != 1) {
                W6.b.B(parcel, t10);
            } else {
                pendingIntent = (PendingIntent) W6.b.f(parcel, t10, PendingIntent.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new e(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
