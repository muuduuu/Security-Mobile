package T6;

import S6.a;
import S6.h;
import V6.AbstractC1287s;
import V6.C1271e;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import java.util.Set;

/* loaded from: classes2.dex */
public final class n0 extends B7.d implements h.b, h.c {

    /* renamed from: m, reason: collision with root package name */
    private static final a.AbstractC0172a f9447m = A7.d.f387c;

    /* renamed from: f, reason: collision with root package name */
    private final Context f9448f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f9449g;

    /* renamed from: h, reason: collision with root package name */
    private final a.AbstractC0172a f9450h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f9451i;

    /* renamed from: j, reason: collision with root package name */
    private final C1271e f9452j;

    /* renamed from: k, reason: collision with root package name */
    private A7.e f9453k;

    /* renamed from: l, reason: collision with root package name */
    private m0 f9454l;

    public n0(Context context, Handler handler, C1271e c1271e) {
        a.AbstractC0172a abstractC0172a = f9447m;
        this.f9448f = context;
        this.f9449g = handler;
        this.f9452j = (C1271e) AbstractC1287s.n(c1271e, "ClientSettings must not be null");
        this.f9451i = c1271e.g();
        this.f9450h = abstractC0172a;
    }

    static /* bridge */ /* synthetic */ void m1(n0 n0Var, B7.l lVar) {
        C2010b j10 = lVar.j();
        if (j10.Z0()) {
            V6.X x10 = (V6.X) AbstractC1287s.m(lVar.u());
            C2010b j11 = x10.j();
            if (!j11.Z0()) {
                String valueOf = String.valueOf(j11);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                n0Var.f9454l.b(j11);
                n0Var.f9453k.h();
                return;
            }
            n0Var.f9454l.c(x10.u(), n0Var.f9451i);
        } else {
            n0Var.f9454l.b(j10);
        }
        n0Var.f9453k.h();
    }

    @Override // B7.f
    public final void a0(B7.l lVar) {
        this.f9449g.post(new l0(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [A7.e, S6.a$f] */
    public final void n1(m0 m0Var) {
        A7.e eVar = this.f9453k;
        if (eVar != null) {
            eVar.h();
        }
        this.f9452j.l(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0172a abstractC0172a = this.f9450h;
        Context context = this.f9448f;
        Handler handler = this.f9449g;
        C1271e c1271e = this.f9452j;
        this.f9453k = abstractC0172a.c(context, handler.getLooper(), c1271e, c1271e.h(), this, this);
        this.f9454l = m0Var;
        Set set = this.f9451i;
        if (set == null || set.isEmpty()) {
            this.f9449g.post(new k0(this));
        } else {
            this.f9453k.t();
        }
    }

    public final void o1() {
        A7.e eVar = this.f9453k;
        if (eVar != null) {
            eVar.h();
        }
    }

    @Override // T6.InterfaceC1169e
    public final void onConnected(Bundle bundle) {
        this.f9453k.u(this);
    }

    @Override // T6.InterfaceC1184n
    public final void onConnectionFailed(C2010b c2010b) {
        this.f9454l.b(c2010b);
    }

    @Override // T6.InterfaceC1169e
    public final void onConnectionSuspended(int i10) {
        this.f9454l.d(i10);
    }
}
