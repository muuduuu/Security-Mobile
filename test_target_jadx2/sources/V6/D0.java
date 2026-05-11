package V6;

import android.os.IBinder;
import android.os.Parcel;
import e7.InterfaceC3089a;
import n7.AbstractC3711a;

/* loaded from: classes2.dex */
public final class D0 extends AbstractC3711a implements F0 {
    D0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // V6.F0
    public final InterfaceC3089a f() {
        Parcel p10 = p(1, l1());
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(p10.readStrongBinder());
        p10.recycle();
        return k12;
    }

    @Override // V6.F0
    public final int g() {
        Parcel p10 = p(2, l1());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }
}
