package k7;

import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class i extends AbstractC1277h {
    public i(Context context, Looper looper, C1271e c1271e, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        super(context, looper, 126, c1271e, interfaceC1169e, interfaceC1184n);
    }

    @Override // V6.AbstractC1267c
    public final C2012d[] A() {
        return c.f36266e;
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // V6.AbstractC1267c
    public final boolean X() {
        return true;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return AbstractC2022n.f23510a;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }
}
