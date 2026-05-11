package p7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3824l extends Binder implements IInterface {
    protected AbstractBinderC3824l(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return p(i10, parcel, parcel2, i11);
    }

    protected abstract boolean p(int i10, Parcel parcel, Parcel parcel2, int i11);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
