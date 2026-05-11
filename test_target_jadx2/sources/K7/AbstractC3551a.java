package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3551a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f36260f;

    /* renamed from: g, reason: collision with root package name */
    private final String f36261g = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    protected AbstractC3551a(IBinder iBinder, String str) {
        this.f36260f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36260f;
    }

    protected final void k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f36260f.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f36261g);
        return obtain;
    }
}
