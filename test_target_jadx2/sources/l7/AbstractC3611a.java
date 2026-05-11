package l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3611a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f37098f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37099g;

    protected AbstractC3611a(IBinder iBinder, String str) {
        this.f37098f = iBinder;
        this.f37099g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37098f;
    }

    protected final Parcel k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f37098f.transact(2, parcel, obtain, 0);
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
            this.f37098f.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final void m1(int i10, Parcel parcel) {
        try {
            this.f37098f.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f37099g);
        return obtain;
    }
}
