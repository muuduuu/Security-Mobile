package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class f extends AbstractC3551a implements IInterface {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void l1(h hVar) {
        Parcel p10 = p();
        e.c(p10, hVar);
        k1(1, p10);
    }
}
