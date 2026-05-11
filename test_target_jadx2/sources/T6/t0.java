package T6;

import D7.C0787k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class t0 extends X {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1191v f9474b;

    /* renamed from: c, reason: collision with root package name */
    private final C0787k f9475c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1189t f9476d;

    public t0(int i10, AbstractC1191v abstractC1191v, C0787k c0787k, InterfaceC1189t interfaceC1189t) {
        super(i10);
        this.f9475c = c0787k;
        this.f9474b = abstractC1191v;
        this.f9476d = interfaceC1189t;
        if (i10 == 2 && abstractC1191v.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // T6.v0
    public final void a(Status status) {
        this.f9475c.d(this.f9476d.a(status));
    }

    @Override // T6.v0
    public final void b(Exception exc) {
        this.f9475c.d(exc);
    }

    @Override // T6.v0
    public final void c(N n10) {
        try {
            this.f9474b.b(n10.t(), this.f9475c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(v0.e(e11));
        } catch (RuntimeException e12) {
            this.f9475c.d(e12);
        }
    }

    @Override // T6.v0
    public final void d(A a10, boolean z10) {
        a10.d(this.f9475c, z10);
    }

    @Override // T6.X
    public final boolean f(N n10) {
        return this.f9474b.c();
    }

    @Override // T6.X
    public final C2012d[] g(N n10) {
        return this.f9474b.e();
    }
}
