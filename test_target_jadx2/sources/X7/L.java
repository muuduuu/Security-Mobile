package x7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p7.AbstractBinderC3824l;
import p7.AbstractC3801A;

/* loaded from: classes2.dex */
public abstract class L extends AbstractBinderC3824l implements M {
    public L() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static M k1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(iBinder);
    }

    @Override // p7.AbstractBinderC3824l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Location location = (Location) AbstractC3801A.a(parcel, Location.CREATOR);
            AbstractC3801A.b(parcel);
            m(location);
        } else {
            if (i10 != 2) {
                return false;
            }
            g();
        }
        return true;
    }
}
