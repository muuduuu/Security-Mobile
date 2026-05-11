package j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3504a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f35850f;

    /* renamed from: g, reason: collision with root package name */
    private final String f35851g;

    protected AbstractC3504a(IBinder iBinder, String str) {
        this.f35850f = iBinder;
        this.f35851g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f35850f;
    }

    protected final void k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f35850f.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f35851g);
        return obtain;
    }
}
