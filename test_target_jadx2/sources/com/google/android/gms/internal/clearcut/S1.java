package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
public abstract class S1 extends AbstractBinderC2173w implements R1 {
    public S1() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractBinderC2173w
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                t0((Status) V.a(parcel, Status.CREATOR));
                return true;
            case 2:
                b((Status) V.a(parcel, Status.CREATOR));
                return true;
            case 3:
                q((Status) V.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                b1((Status) V.a(parcel, Status.CREATOR));
                return true;
            case 5:
                d1((Status) V.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                K0((Status) V.a(parcel, Status.CREATOR), (Q6.f[]) parcel.createTypedArray(Q6.f.CREATOR));
                return true;
            case 7:
                t((DataHolder) V.a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                c((Status) V.a(parcel, Status.CREATOR), (Q6.d) V.a(parcel, Q6.d.CREATOR));
                return true;
            case 9:
                v((Status) V.a(parcel, Status.CREATOR), (Q6.d) V.a(parcel, Q6.d.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
