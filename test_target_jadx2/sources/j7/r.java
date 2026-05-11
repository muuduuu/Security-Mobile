package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class r extends l implements s {
    public r() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // j7.l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) o.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) o.a(parcel, PendingIntent.CREATOR);
        o.d(parcel);
        o0(status, pendingIntent);
        return true;
    }
}
