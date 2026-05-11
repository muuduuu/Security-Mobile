package V6;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: V6.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1270d0 implements InterfaceC1283n {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f10926f;

    C1270d0(IBinder iBinder) {
        this.f10926f = iBinder;
    }

    @Override // V6.InterfaceC1283n
    public final void H0(InterfaceC1282m interfaceC1282m, C1275g c1275g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC1282m != null ? interfaceC1282m.asBinder() : null);
            if (c1275g != null) {
                obtain.writeInt(1);
                u0.a(c1275g, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f10926f.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10926f;
    }
}
