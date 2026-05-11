package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p7.AbstractBinderC3824l;
import p7.AbstractC3801A;

/* loaded from: classes2.dex */
public abstract class I extends AbstractBinderC3824l implements J {
    public I() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static J k1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof J ? (J) queryLocalInterface : new H(iBinder);
    }

    @Override // p7.AbstractBinderC3824l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) AbstractC3801A.a(parcel, LocationResult.CREATOR);
            AbstractC3801A.b(parcel);
            b0(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) AbstractC3801A.a(parcel, LocationAvailability.CREATOR);
            AbstractC3801A.b(parcel);
            s0(locationAvailability);
        } else {
            if (i10 != 3) {
                return false;
            }
            h();
        }
        return true;
    }
}
