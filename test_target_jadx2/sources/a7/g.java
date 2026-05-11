package a7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import l7.AbstractC3611a;

/* loaded from: classes2.dex */
public final class g extends AbstractC3611a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void n1(InterfaceC1366f interfaceC1366f, C1361a c1361a) {
        Parcel p10 = p();
        l7.c.d(p10, interfaceC1366f);
        l7.c.c(p10, c1361a);
        l1(1, p10);
    }

    public final void o1(InterfaceC1366f interfaceC1366f, C1361a c1361a, h hVar) {
        Parcel p10 = p();
        l7.c.d(p10, interfaceC1366f);
        l7.c.c(p10, c1361a);
        l7.c.d(p10, hVar);
        l1(2, p10);
    }
}
