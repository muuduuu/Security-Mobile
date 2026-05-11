package p7;

import android.app.PendingIntent;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class H0 extends AbstractBinderC3824l implements I0 {
    public H0() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // p7.AbstractBinderC3824l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            AbstractC3801A.b(parcel);
            i1(readInt, createStringArray);
        } else if (i10 == 2) {
            int readInt2 = parcel.readInt();
            String[] createStringArray2 = parcel.createStringArray();
            AbstractC3801A.b(parcel);
            D(readInt2, createStringArray2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) AbstractC3801A.a(parcel, PendingIntent.CREATOR);
            AbstractC3801A.b(parcel);
            w0(readInt3, pendingIntent);
        }
        return true;
    }
}
