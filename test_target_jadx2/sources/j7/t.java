package j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class t extends AbstractC3504a implements IInterface {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void l1(s sVar, K6.a aVar, String str, S6.c cVar) {
        Parcel p10 = p();
        o.c(p10, sVar);
        o.b(p10, aVar);
        p10.writeString(str);
        o.b(p10, cVar);
        k1(4, p10);
    }
}
