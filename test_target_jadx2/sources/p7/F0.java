package p7;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class F0 extends AbstractBinderC3824l implements G0 {
    public F0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // p7.AbstractBinderC3824l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C0 c02 = (C0) AbstractC3801A.a(parcel, C0.CREATOR);
            AbstractC3801A.b(parcel);
            Y0(c02);
        } else {
            if (i10 != 2) {
                return false;
            }
            g();
        }
        return true;
    }
}
