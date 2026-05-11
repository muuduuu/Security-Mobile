package B7;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class e extends l7.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // l7.b
    protected final boolean k1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                l7.c.b(parcel);
                break;
            case 4:
                l7.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                l7.c.b(parcel);
                break;
            case 7:
                l7.c.b(parcel);
                break;
            case 8:
                l lVar = (l) l7.c.a(parcel, l.CREATOR);
                l7.c.b(parcel);
                a0(lVar);
                break;
            case 9:
                l7.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
