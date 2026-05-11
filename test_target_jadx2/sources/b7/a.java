package B7;

import S6.h;
import V6.AbstractC1267c;
import V6.AbstractC1277h;
import V6.AbstractC1287s;
import V6.C1271e;
import V6.InterfaceC1280k;
import V6.V;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public class a extends AbstractC1277h implements A7.e {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f516M = 0;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f517I;

    /* renamed from: J, reason: collision with root package name */
    private final C1271e f518J;

    /* renamed from: K, reason: collision with root package name */
    private final Bundle f519K;

    /* renamed from: L, reason: collision with root package name */
    private final Integer f520L;

    public a(Context context, Looper looper, boolean z10, C1271e c1271e, Bundle bundle, h.b bVar, h.c cVar) {
        super(context, looper, 44, c1271e, bVar, cVar);
        this.f517I = true;
        this.f518J = c1271e;
        this.f519K = bundle;
        this.f520L = c1271e.i();
    }

    public static Bundle r0(C1271e c1271e) {
        c1271e.h();
        Integer i10 = c1271e.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1271e.a());
        if (i10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // V6.AbstractC1267c
    protected final Bundle F() {
        if (!D().getPackageName().equals(this.f518J.f())) {
            this.f519K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f518J.f());
        }
        return this.f519K;
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // A7.e
    public final void i(InterfaceC1280k interfaceC1280k, boolean z10) {
        try {
            ((g) I()).o1(interfaceC1280k, ((Integer) AbstractC1287s.m(this.f520L)).intValue(), z10);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return AbstractC2022n.f23510a;
    }

    @Override // A7.e
    public final void o() {
        try {
            ((g) I()).n1(((Integer) AbstractC1287s.m(this.f520L)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final boolean s() {
        return this.f517I;
    }

    @Override // A7.e
    public final void t() {
        j(new AbstractC1267c.d(this));
    }

    @Override // A7.e
    public final void u(f fVar) {
        AbstractC1287s.n(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c10 = this.f518J.c();
            ((g) I()).p1(new j(1, new V(c10, ((Integer) AbstractC1287s.m(this.f520L)).intValue(), "<<default account>>".equals(c10.name) ? O6.c.b(D()).c() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.a0(new l(1, new C2010b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
