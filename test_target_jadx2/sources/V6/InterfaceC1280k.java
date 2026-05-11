package V6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: V6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1280k extends IInterface {

    /* renamed from: V6.k$a */
    public static abstract class a extends n7.n implements InterfaceC1280k {
        public static InterfaceC1280k k1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC1280k ? (InterfaceC1280k) queryLocalInterface : new B0(iBinder);
        }
    }

    Account zzb();
}
