package V6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f10990a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1267c f10991b;

    public o0(AbstractC1267c abstractC1267c, int i10) {
        Objects.requireNonNull(abstractC1267c);
        this.f10991b = abstractC1267c;
        this.f10990a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1267c abstractC1267c = this.f10991b;
        if (iBinder == null) {
            abstractC1267c.d0(16);
            return;
        }
        synchronized (abstractC1267c.f0()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1267c.g0((queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1283n)) ? new C1270d0(iBinder) : (InterfaceC1283n) queryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10991b.Z(0, null, this.f10990a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1267c abstractC1267c = this.f10991b;
        synchronized (abstractC1267c.f0()) {
            abstractC1267c.g0(null);
        }
        AbstractC1267c abstractC1267c2 = this.f10991b;
        int i10 = this.f10990a;
        Handler handler = abstractC1267c2.f10905l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
