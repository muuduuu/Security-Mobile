package V6;

import V6.InterfaceC1280k;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: V6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1263a extends InterfaceC1280k.a {
    public static Account l1(InterfaceC1280k interfaceC1280k) {
        Account account = null;
        if (interfaceC1280k != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC1280k.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
