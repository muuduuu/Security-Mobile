package com.google.android.gms.common.api.internal;

import S6.a;
import T6.InterfaceC1167d;
import V6.AbstractC1287s;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2006a extends BasePendingResult implements InterfaceC1167d {

    /* renamed from: p, reason: collision with root package name */
    private final a.c f23368p;

    /* renamed from: q, reason: collision with root package name */
    private final S6.a f23369q;

    protected AbstractC2006a(S6.a aVar, S6.h hVar) {
        super((S6.h) AbstractC1287s.n(hVar, "GoogleApiClient must not be null"));
        AbstractC1287s.n(aVar, "Api must not be null");
        this.f23368p = aVar.b();
        this.f23369q = aVar;
    }

    private void w(RemoteException remoteException) {
        a(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    @Override // T6.InterfaceC1167d
    public final void a(Status status) {
        AbstractC1287s.b(!status.Z0(), "Failed result must not be success");
        S6.o g10 = g(status);
        k(g10);
        u(g10);
    }

    public /* bridge */ /* synthetic */ void b(Object obj) {
        super.k((S6.o) obj);
    }

    protected abstract void r(a.b bVar);

    public final S6.a s() {
        return this.f23369q;
    }

    public final a.c t() {
        return this.f23368p;
    }

    public final void v(a.b bVar) {
        try {
            r(bVar);
        } catch (DeadObjectException e10) {
            w(e10);
            throw e10;
        } catch (RemoteException e11) {
            w(e11);
        }
    }

    protected void u(S6.o oVar) {
    }
}
