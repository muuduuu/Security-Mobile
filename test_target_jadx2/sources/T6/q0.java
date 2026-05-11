package T6;

import D7.C0787k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
abstract class q0 extends X {

    /* renamed from: b, reason: collision with root package name */
    protected final C0787k f9471b;

    public q0(int i10, C0787k c0787k) {
        super(i10);
        this.f9471b = c0787k;
    }

    @Override // T6.v0
    public final void a(Status status) {
        this.f9471b.d(new S6.b(status));
    }

    @Override // T6.v0
    public final void b(Exception exc) {
        this.f9471b.d(exc);
    }

    @Override // T6.v0
    public final void c(N n10) {
        try {
            h(n10);
        } catch (DeadObjectException e10) {
            a(v0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(v0.e(e11));
        } catch (RuntimeException e12) {
            this.f9471b.d(e12);
        }
    }

    protected abstract void h(N n10);
}
