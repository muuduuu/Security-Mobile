package V6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: V6.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1274f0 extends n7.n implements InterfaceC1276g0 {
    public static InterfaceC1276g0 k1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC1276g0 ? (InterfaceC1276g0) queryLocalInterface : new C1272e0(iBinder);
    }
}
