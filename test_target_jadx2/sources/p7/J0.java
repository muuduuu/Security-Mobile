package p7;

import T6.InterfaceC1173g;
import V6.InterfaceC1281l;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import x7.C5118a;
import x7.C5127j;
import x7.C5128k;
import x7.C5132o;

/* loaded from: classes2.dex */
public final class J0 extends AbstractC3802a implements K0 {
    J0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p7.K0
    public final void I0(C3811e0 c3811e0, InterfaceC1173g interfaceC1173g) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, c3811e0);
        AbstractC3801A.d(p10, interfaceC1173g);
        l1(89, p10);
    }

    @Override // p7.K0
    public final void M0(C5127j c5127j, PendingIntent pendingIntent, I0 i02) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, c5127j);
        AbstractC3801A.c(p10, pendingIntent);
        AbstractC3801A.d(p10, i02);
        l1(57, p10);
    }

    @Override // p7.K0
    public final void S(C5128k c5128k, M0 m02) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, c5128k);
        AbstractC3801A.d(p10, m02);
        l1(82, p10);
    }

    @Override // p7.K0
    public final void S0(C5132o c5132o, O0 o02, String str) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, c5132o);
        AbstractC3801A.d(p10, o02);
        p10.writeString(null);
        l1(63, p10);
    }

    @Override // p7.K0
    public final Location f() {
        Parcel k12 = k1(7, p());
        Location location = (Location) AbstractC3801A.a(k12, Location.CREATOR);
        k12.recycle();
        return location;
    }

    @Override // p7.K0
    public final void h0(C3811e0 c3811e0, LocationRequest locationRequest, InterfaceC1173g interfaceC1173g) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, c3811e0);
        AbstractC3801A.c(p10, locationRequest);
        AbstractC3801A.d(p10, interfaceC1173g);
        l1(88, p10);
    }

    @Override // p7.K0
    public final void j1(PendingIntent pendingIntent, I0 i02, String str) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, pendingIntent);
        AbstractC3801A.d(p10, i02);
        p10.writeString(str);
        l1(2, p10);
    }

    @Override // p7.K0
    public final InterfaceC1281l l0(C5118a c5118a, M0 m02) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, c5118a);
        AbstractC3801A.d(p10, m02);
        Parcel k12 = k1(87, p10);
        InterfaceC1281l k13 = InterfaceC1281l.a.k1(k12.readStrongBinder());
        k12.recycle();
        return k13;
    }

    @Override // p7.K0
    public final void z0(C3819i0 c3819i0) {
        Parcel p10 = p();
        AbstractC3801A.c(p10, c3819i0);
        l1(59, p10);
    }
}
