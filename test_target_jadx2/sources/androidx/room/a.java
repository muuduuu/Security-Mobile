package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17766a = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0302a extends Binder implements a {

        /* renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        private static class C0303a implements a {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f17767f;

            C0303a(IBinder iBinder) {
                this.f17767f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17767f;
            }

            @Override // androidx.room.a
            public void w(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f17766a);
                    obtain.writeStringArray(strArr);
                    this.f17767f.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0302a() {
            attachInterface(this, a.f17766a);
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f17766a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0303a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f17766a;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            w(parcel.createStringArray());
            return true;
        }
    }

    void w(String[] strArr);
}
