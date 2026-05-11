package V6;

import android.os.IBinder;
import android.os.Parcel;
import e7.InterfaceC3089a;
import n7.AbstractC3711a;

/* renamed from: V6.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1272e0 extends AbstractC3711a implements InterfaceC1276g0 {
    C1272e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // V6.InterfaceC1276g0
    public final boolean T(com.google.android.gms.common.Q q10, InterfaceC3089a interfaceC3089a) {
        Parcel l12 = l1();
        n7.o.c(l12, q10);
        n7.o.d(l12, interfaceC3089a);
        Parcel p10 = p(5, l12);
        boolean a10 = n7.o.a(p10);
        p10.recycle();
        return a10;
    }

    @Override // V6.InterfaceC1276g0
    public final com.google.android.gms.common.O U0(com.google.android.gms.common.M m10) {
        Parcel l12 = l1();
        n7.o.c(l12, m10);
        Parcel p10 = p(8, l12);
        com.google.android.gms.common.O o10 = (com.google.android.gms.common.O) n7.o.b(p10, com.google.android.gms.common.O.CREATOR);
        p10.recycle();
        return o10;
    }

    @Override // V6.InterfaceC1276g0
    public final boolean i() {
        Parcel p10 = p(7, l1());
        boolean a10 = n7.o.a(p10);
        p10.recycle();
        return a10;
    }

    @Override // V6.InterfaceC1276g0
    public final com.google.android.gms.common.O x0(com.google.android.gms.common.M m10) {
        Parcel l12 = l1();
        n7.o.c(l12, m10);
        Parcel p10 = p(6, l12);
        com.google.android.gms.common.O o10 = (com.google.android.gms.common.O) n7.o.b(p10, com.google.android.gms.common.O.CREATOR);
        p10.recycle();
        return o10;
    }
}
