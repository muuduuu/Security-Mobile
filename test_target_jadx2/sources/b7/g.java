package B7;

import V6.InterfaceC1280k;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import l7.AbstractC3611a;

/* loaded from: classes2.dex */
public final class g extends AbstractC3611a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void n1(int i10) {
        Parcel p10 = p();
        p10.writeInt(i10);
        l1(7, p10);
    }

    public final void o1(InterfaceC1280k interfaceC1280k, int i10, boolean z10) {
        Parcel p10 = p();
        l7.c.d(p10, interfaceC1280k);
        p10.writeInt(i10);
        p10.writeInt(z10 ? 1 : 0);
        l1(9, p10);
    }

    public final void p1(j jVar, f fVar) {
        Parcel p10 = p();
        l7.c.c(p10, jVar);
        l7.c.d(p10, fVar);
        l1(12, p10);
    }
}
