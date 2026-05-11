package V6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class G0 extends n7.n implements InterfaceC1282m {
    public G0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // n7.n
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) n7.o.b(parcel, Bundle.CREATOR);
            n7.o.e(parcel);
            Z(readInt, readStrongBinder, bundle);
        } else if (i10 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) n7.o.b(parcel, Bundle.CREATOR);
            n7.o.e(parcel);
            H(readInt2, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            r0 r0Var = (r0) n7.o.b(parcel, r0.CREATOR);
            n7.o.e(parcel);
            J0(readInt3, readStrongBinder2, r0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
