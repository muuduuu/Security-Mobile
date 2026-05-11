package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.InterfaceC1682a;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1683b implements Parcelable {
    public static final Parcelable.Creator<C1683b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f19080a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f19081b = null;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC1682a f19082c;

    /* renamed from: c.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1683b createFromParcel(Parcel parcel) {
            return new C1683b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1683b[] newArray(int i10) {
            return new C1683b[i10];
        }
    }

    /* renamed from: c.b$b, reason: collision with other inner class name */
    class BinderC0340b extends InterfaceC1682a.AbstractBinderC0338a {
        BinderC0340b() {
        }

        @Override // c.InterfaceC1682a
        public void h1(int i10, Bundle bundle) {
            C1683b c1683b = C1683b.this;
            Handler handler = c1683b.f19081b;
            if (handler != null) {
                handler.post(c1683b.new c(i10, bundle));
            } else {
                c1683b.a(i10, bundle);
            }
        }
    }

    /* renamed from: c.b$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f19084a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f19085b;

        c(int i10, Bundle bundle) {
            this.f19084a = i10;
            this.f19085b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1683b.this.a(this.f19084a, this.f19085b);
        }
    }

    C1683b(Parcel parcel) {
        this.f19082c = InterfaceC1682a.AbstractBinderC0338a.p(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f19082c == null) {
                    this.f19082c = new BinderC0340b();
                }
                parcel.writeStrongBinder(this.f19082c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(int i10, Bundle bundle) {
    }
}
