package V6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public abstract class E0 extends n7.n implements F0 {
    public E0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static F0 k1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof F0 ? (F0) queryLocalInterface : new D0(iBinder);
    }

    @Override // n7.n
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC3089a f10 = f();
            parcel2.writeNoException();
            n7.o.d(parcel2, f10);
        } else {
            if (i10 != 2) {
                return false;
            }
            int g10 = g();
            parcel2.writeNoException();
            parcel2.writeInt(g10);
        }
        return true;
    }
}
