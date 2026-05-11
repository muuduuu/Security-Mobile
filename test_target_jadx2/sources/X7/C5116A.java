package x7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.ArrayList;

/* renamed from: x7.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5116A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                arrayList = W6.b.k(parcel, t10, C5119b.CREATOR);
            } else if (m10 == 2) {
                j10 = W6.b.x(parcel, t10);
            } else if (m10 == 3) {
                j11 = W6.b.x(parcel, t10);
            } else if (m10 == 4) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                bundle = W6.b.a(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new ActivityRecognitionResult(arrayList, j10, j11, i10, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityRecognitionResult[i10];
    }
}
