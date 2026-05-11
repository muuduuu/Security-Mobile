package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class J implements Parcelable.Creator {
    static void a(I i10, Parcel parcel, int i11) {
        String str = i10.f25442a;
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, str, false);
        W6.c.s(parcel, 3, i10.f25443b, i11, false);
        W6.c.u(parcel, 4, i10.f25444c, false);
        W6.c.q(parcel, 5, i10.f25445d);
        W6.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        long j10 = 0;
        String str = null;
        G g10 = null;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 2) {
                str = W6.b.g(parcel, t10);
            } else if (m10 == 3) {
                g10 = (G) W6.b.f(parcel, t10, G.CREATOR);
            } else if (m10 == 4) {
                str2 = W6.b.g(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                j10 = W6.b.x(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new I(str, g10, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new I[i10];
    }
}
