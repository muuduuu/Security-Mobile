package O6;

import S6.h;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class i extends AbstractC1277h {

    /* renamed from: I, reason: collision with root package name */
    private final GoogleSignInOptions f7094I;

    public i(Context context, Looper looper, C1271e c1271e, GoogleSignInOptions googleSignInOptions, h.b bVar, h.c cVar) {
        super(context, looper, 91, c1271e, bVar, cVar);
        GoogleSignInOptions.a aVar = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar.i(j7.h.a());
        if (!c1271e.d().isEmpty()) {
            Iterator it = c1271e.d().iterator();
            while (it.hasNext()) {
                aVar.e((Scope) it.next(), new Scope[0]);
            }
        }
        this.f7094I = aVar.a();
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final boolean b() {
        return true;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return AbstractC2022n.f23510a;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final Intent r() {
        return q.a(D(), this.f7094I);
    }

    public final GoogleSignInOptions r0() {
        return this.f7094I;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new w(iBinder);
    }
}
