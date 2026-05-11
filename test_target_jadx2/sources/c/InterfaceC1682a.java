package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1682a extends IInterface {

    /* renamed from: e, reason: collision with root package name */
    public static final String f19078e = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: c.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void h1(int i10, Bundle bundle);

    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0338a extends Binder implements InterfaceC1682a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C0339a implements InterfaceC1682a {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f19079f;

            C0339a(IBinder iBinder) {
                this.f19079f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19079f;
            }
        }

        public AbstractBinderC0338a() {
            attachInterface(this, InterfaceC1682a.f19078e);
        }

        public static InterfaceC1682a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1682a.f19078e);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1682a)) ? new C0339a(iBinder) : (InterfaceC1682a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC1682a.f19078e;
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
            h1(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
