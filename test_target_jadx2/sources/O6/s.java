package O6;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class s extends j7.l implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // j7.l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            o();
        } else {
            if (i10 != 2) {
                return false;
            }
            A();
        }
        return true;
    }
}
