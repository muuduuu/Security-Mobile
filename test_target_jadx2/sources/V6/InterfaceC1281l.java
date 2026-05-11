package V6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: V6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1281l extends IInterface {

    /* renamed from: V6.l$a */
    public static abstract class a extends n7.n implements InterfaceC1281l {
        public static InterfaceC1281l k1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof InterfaceC1281l ? (InterfaceC1281l) queryLocalInterface : new C0(iBinder);
        }
    }

    void cancel();
}
