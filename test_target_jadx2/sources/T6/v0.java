package T6;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9485a;

    public v0(int i10) {
        this.f9485a = i10;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(N n10);

    public abstract void d(A a10, boolean z10);
}
