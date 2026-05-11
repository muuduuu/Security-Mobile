package V6;

import V6.AbstractC1267c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class p0 extends AbstractC1268c0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f11001g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC1267c f11002h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(AbstractC1267c abstractC1267c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC1267c, i10, bundle);
        Objects.requireNonNull(abstractC1267c);
        this.f11002h = abstractC1267c;
        this.f11001g = iBinder;
    }

    @Override // V6.AbstractC1268c0
    protected final boolean e() {
        try {
            IBinder iBinder = this.f11001g;
            AbstractC1287s.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC1267c abstractC1267c = this.f11002h;
            if (!abstractC1267c.J().equals(interfaceDescriptor)) {
                String J10 = abstractC1267c.J();
                StringBuilder sb2 = new StringBuilder(String.valueOf(J10).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(J10);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface x10 = abstractC1267c.x(this.f11001g);
            if (x10 == null || !(abstractC1267c.c0(2, 4, x10) || abstractC1267c.c0(3, 4, x10))) {
                return false;
            }
            abstractC1267c.l0(null);
            AbstractC1267c.a i02 = abstractC1267c.i0();
            Bundle C10 = abstractC1267c.C();
            if (i02 == null) {
                return true;
            }
            abstractC1267c.i0().onConnected(C10);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // V6.AbstractC1268c0
    protected final void f(C2010b c2010b) {
        AbstractC1267c abstractC1267c = this.f11002h;
        if (abstractC1267c.j0() != null) {
            abstractC1267c.j0().onConnectionFailed(c2010b);
        }
        abstractC1267c.Q(c2010b);
    }
}
