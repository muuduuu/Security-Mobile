package O6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class u extends j7.l implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // j7.l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) j7.o.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) j7.o.a(parcel, Status.CREATOR);
                j7.o.d(parcel);
                C(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) j7.o.a(parcel, Status.CREATOR);
                j7.o.d(parcel);
                i0(status2);
                break;
            case 103:
                Status status3 = (Status) j7.o.a(parcel, Status.CREATOR);
                j7.o.d(parcel);
                B0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
