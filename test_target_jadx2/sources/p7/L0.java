package p7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class L0 extends AbstractBinderC3824l implements M0 {
    public L0() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // p7.AbstractBinderC3824l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC3801A.a(parcel, Status.CREATOR);
        Location location = (Location) AbstractC3801A.a(parcel, Location.CREATOR);
        AbstractC3801A.b(parcel);
        u(status, location);
        return true;
    }
}
