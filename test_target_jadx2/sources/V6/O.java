package V6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;
import l7.AbstractC3611a;

/* loaded from: classes2.dex */
public final class O extends AbstractC3611a implements IInterface {
    O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final InterfaceC3089a n1(InterfaceC3089a interfaceC3089a, Z z10) {
        Parcel p10 = p();
        l7.c.d(p10, interfaceC3089a);
        l7.c.c(p10, z10);
        Parcel k12 = k1(2, p10);
        InterfaceC3089a k13 = InterfaceC3089a.AbstractBinderC0469a.k1(k12.readStrongBinder());
        k12.recycle();
        return k13;
    }
}
