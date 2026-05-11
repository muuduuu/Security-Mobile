package V6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import n7.AbstractC3711a;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC3711a implements InterfaceC1280k {
    B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // V6.InterfaceC1280k
    public final Account zzb() {
        Parcel p10 = p(2, l1());
        Account account = (Account) n7.o.b(p10, Account.CREATOR);
        p10.recycle();
        return account;
    }
}
