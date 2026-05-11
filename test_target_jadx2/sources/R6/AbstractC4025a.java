package r6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4025a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f39256f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39257g = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected AbstractC4025a(IBinder iBinder) {
        this.f39256f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39256f;
    }

    protected final Parcel k1(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f39256f.transact(1, parcel, obtain, 0);
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
        obtain.writeInterfaceToken(this.f39257g);
        return obtain;
    }
}
