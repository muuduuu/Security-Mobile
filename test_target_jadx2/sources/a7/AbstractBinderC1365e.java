package a7;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: a7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1365e extends l7.b implements InterfaceC1366f {
    public AbstractBinderC1365e() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // l7.b
    protected final boolean k1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) l7.c.a(parcel, Status.CREATOR);
            Z6.b bVar = (Z6.b) l7.c.a(parcel, Z6.b.CREATOR);
            l7.c.b(parcel);
            N(status, bVar);
        } else if (i10 == 2) {
            Status status2 = (Status) l7.c.a(parcel, Status.CREATOR);
            Z6.g gVar = (Z6.g) l7.c.a(parcel, Z6.g.CREATOR);
            l7.c.b(parcel);
            u0(status2, gVar);
        } else if (i10 == 3) {
            Status status3 = (Status) l7.c.a(parcel, Status.CREATOR);
            Z6.e eVar = (Z6.e) l7.c.a(parcel, Z6.e.CREATOR);
            l7.c.b(parcel);
            n(status3, eVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) l7.c.a(parcel, Status.CREATOR);
            l7.c.b(parcel);
            O0(status4);
        }
        return true;
    }
}
