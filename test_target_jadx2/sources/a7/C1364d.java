package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2012d;
import java.util.ArrayList;

/* renamed from: a7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1364d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                arrayList = W6.b.k(parcel, t10, C2012d.CREATOR);
            } else if (m10 == 2) {
                z10 = W6.b.n(parcel, t10);
            } else if (m10 == 3) {
                str2 = W6.b.g(parcel, t10);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                str = W6.b.g(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C1361a(arrayList, z10, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1361a[i10];
    }
}
