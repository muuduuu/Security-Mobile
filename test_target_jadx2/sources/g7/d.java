package G7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i11 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 2) {
                f10 = W6.b.r(parcel, t10);
            } else if (m10 == 3) {
                f11 = W6.b.r(parcel, t10);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                i11 = W6.b.v(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new LandmarkParcel(i10, f10, f11, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LandmarkParcel[i10];
    }
}
