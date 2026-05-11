package X6;

import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import V6.AbstractC1277h;
import V6.C1271e;
import V6.C1294z;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class e extends AbstractC1277h {

    /* renamed from: I, reason: collision with root package name */
    private final C1294z f11758I;

    public e(Context context, Looper looper, C1271e c1271e, C1294z c1294z, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        super(context, looper, 270, c1271e, interfaceC1169e, interfaceC1184n);
        this.f11758I = c1294z;
    }

    @Override // V6.AbstractC1267c
    public final C2012d[] A() {
        return l7.d.f37102b;
    }

    @Override // V6.AbstractC1267c
    protected final Bundle F() {
        return this.f11758I.b();
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // V6.AbstractC1267c
    protected final boolean N() {
        return true;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return 203400000;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }
}
