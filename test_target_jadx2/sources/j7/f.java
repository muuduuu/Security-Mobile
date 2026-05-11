package j7;

import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class f extends AbstractC1277h {

    /* renamed from: I, reason: collision with root package name */
    private final Bundle f35859I;

    public f(Context context, Looper looper, K6.e eVar, C1271e c1271e, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        super(context, looper, 212, c1271e, interfaceC1169e, interfaceC1184n);
        this.f35859I = new Bundle();
    }

    @Override // V6.AbstractC1267c
    public final C2012d[] A() {
        return g.f35883x;
    }

    @Override // V6.AbstractC1267c
    protected final Bundle F() {
        return this.f35859I;
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // V6.AbstractC1267c
    protected final boolean N() {
        return true;
    }

    @Override // V6.AbstractC1267c
    public final boolean X() {
        return true;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return 17895000;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof t ? (t) queryLocalInterface : new t(iBinder);
    }
}
