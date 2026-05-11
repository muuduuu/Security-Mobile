package p7;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class N0 extends AbstractBinderC3824l implements O0 {
    public N0() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // p7.AbstractBinderC3824l
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        x7.q qVar = (x7.q) AbstractC3801A.a(parcel, x7.q.CREATOR);
        AbstractC3801A.b(parcel);
        x(qVar);
        return true;
    }
}
