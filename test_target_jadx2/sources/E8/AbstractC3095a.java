package e8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3095a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f32262f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32263g;

    protected AbstractC3095a(IBinder iBinder, String str) {
        this.f32262f = iBinder;
        this.f32263g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32262f;
    }

    protected final void k1(int i10, Parcel parcel) {
        try {
            this.f32262f.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32263g);
        return obtain;
    }
}
