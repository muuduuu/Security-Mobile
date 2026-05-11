package p7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3802a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f38397f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38398g;

    protected AbstractC3802a(IBinder iBinder, String str) {
        this.f38397f = iBinder;
        this.f38398g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38397f;
    }

    protected final Parcel k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f38397f.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void l1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f38397f.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38398g);
        return obtain;
    }
}
