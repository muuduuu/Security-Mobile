package V6;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes2.dex */
public final class n0 extends G0 {

    /* renamed from: f, reason: collision with root package name */
    private AbstractC1267c f10985f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10986g;

    public n0(AbstractC1267c abstractC1267c, int i10) {
        this.f10985f = abstractC1267c;
        this.f10986g = i10;
    }

    @Override // V6.InterfaceC1282m
    public final void H(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // V6.InterfaceC1282m
    public final void J0(int i10, IBinder iBinder, r0 r0Var) {
        AbstractC1267c abstractC1267c = this.f10985f;
        AbstractC1287s.n(abstractC1267c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC1287s.m(r0Var);
        abstractC1267c.a0(r0Var);
        Z(i10, iBinder, r0Var.f11007a);
    }

    @Override // V6.InterfaceC1282m
    public final void Z(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC1287s.n(this.f10985f, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f10985f.S(i10, iBinder, bundle, this.f10986g);
        this.f10985f = null;
    }
}
