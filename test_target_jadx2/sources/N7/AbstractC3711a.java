package n7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3711a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f37569f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37570g;

    protected AbstractC3711a(IBinder iBinder, String str) {
        this.f37569f = iBinder;
        this.f37570g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37569f;
    }

    protected final void k1(int i10, Parcel parcel) {
        try {
            this.f37569f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel l1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f37570g);
        return obtain;
    }

    protected final Parcel p(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f37569f.transact(i10, parcel, obtain, 0);
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
}
