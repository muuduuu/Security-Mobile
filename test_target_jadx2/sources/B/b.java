package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f18437d = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C0319a implements b {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f18438f;

            C0319a(IBinder iBinder) {
                this.f18438f = iBinder;
            }

            @Override // b.b
            public boolean J(InterfaceC1638a interfaceC1638a, Uri uri, Bundle bundle, List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f18437d);
                    obtain.writeStrongInterface(interfaceC1638a);
                    C0320b.d(obtain, uri, 0);
                    C0320b.d(obtain, bundle, 0);
                    C0320b.c(obtain, list, 0);
                    this.f18438f.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean O(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f18437d);
                    obtain.writeLong(j10);
                    this.f18438f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean V(InterfaceC1638a interfaceC1638a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f18437d);
                    obtain.writeStrongInterface(interfaceC1638a);
                    this.f18438f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18438f;
            }

            @Override // b.b
            public boolean y0(InterfaceC1638a interfaceC1638a, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f18437d);
                    obtain.writeStrongInterface(interfaceC1638a);
                    C0320b.d(obtain, bundle, 0);
                    this.f18438f.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f18437d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0319a(iBinder) : (b) queryLocalInterface;
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0320b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    boolean J(InterfaceC1638a interfaceC1638a, Uri uri, Bundle bundle, List list);

    boolean O(long j10);

    boolean V(InterfaceC1638a interfaceC1638a);

    boolean y0(InterfaceC1638a interfaceC1638a, Bundle bundle);
}
