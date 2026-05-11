package j7;

import S6.h;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class p extends AbstractC1277h {

    /* renamed from: I, reason: collision with root package name */
    private final J6.g f35888I;

    public p(Context context, Looper looper, C1271e c1271e, J6.g gVar, h.b bVar, h.c cVar) {
        super(context, looper, 68, c1271e, bVar, cVar);
        J6.f fVar = new J6.f(gVar == null ? J6.g.f4801d : gVar);
        fVar.a(h.a());
        this.f35888I = new J6.g(fVar);
    }

    @Override // V6.AbstractC1267c
    protected final Bundle F() {
        return this.f35888I.a();
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return 12800000;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof q ? (q) queryLocalInterface : new q(iBinder);
    }
}
