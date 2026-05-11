package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String f17768b = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        private static class C0304a implements b {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f17769f;

            C0304a(IBinder iBinder) {
                this.f17769f = iBinder;
            }

            @Override // androidx.room.b
            public int E(androidx.room.a aVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17768b);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    this.f17769f.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.b
            public void X0(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17768b);
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f17769f.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17769f;
            }
        }

        public a() {
            attachInterface(this, b.f17768b);
        }

        public static b p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f17768b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0304a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = b.f17768b;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int E10 = E(a.AbstractBinderC0302a.p(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(E10);
            } else if (i10 == 2) {
                c1(a.AbstractBinderC0302a.p(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                X0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int E(androidx.room.a aVar, String str);

    void X0(int i10, String[] strArr);

    void c1(androidx.room.a aVar, int i10);
}
