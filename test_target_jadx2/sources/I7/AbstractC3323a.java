package i7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3323a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f34145f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34146g = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected AbstractC3323a(IBinder iBinder, String str) {
        this.f34145f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34145f;
    }

    protected final Parcel k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f34145f.transact(i10, parcel, obtain, 0);
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

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f34146g);
        return obtain;
    }
}
