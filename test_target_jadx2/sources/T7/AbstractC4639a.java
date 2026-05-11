package t7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4639a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f42805f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42806g;

    protected AbstractC4639a(IBinder iBinder, String str) {
        this.f42805f = iBinder;
        this.f42806g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f42805f;
    }

    protected final Parcel k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f42805f.transact(i10, parcel, obtain, 0);
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
            this.f42805f.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f42806g);
        return obtain;
    }
}
