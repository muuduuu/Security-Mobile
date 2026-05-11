package i7;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: i7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3326d extends AbstractC3323a implements InterfaceC3328f {
    C3326d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // i7.InterfaceC3328f
    public final String a() {
        Parcel k12 = k1(1, p());
        String readString = k12.readString();
        k12.recycle();
        return readString;
    }

    @Override // i7.InterfaceC3328f
    public final boolean y(boolean z10) {
        Parcel p10 = p();
        AbstractC3325c.a(p10, true);
        Parcel k12 = k1(2, p10);
        boolean b10 = AbstractC3325c.b(k12);
        k12.recycle();
        return b10;
    }
}
