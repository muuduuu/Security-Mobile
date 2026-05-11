package T6;

import V6.AbstractC1287s;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2006a;

/* loaded from: classes2.dex */
public final class r0 extends v0 {

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC2006a f9472b;

    public r0(int i10, AbstractC2006a abstractC2006a) {
        super(i10);
        this.f9472b = (AbstractC2006a) AbstractC1287s.n(abstractC2006a, "Null methods are not runnable.");
    }

    @Override // T6.v0
    public final void a(Status status) {
        try {
            this.f9472b.a(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // T6.v0
    public final void b(Exception exc) {
        try {
            this.f9472b.a(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // T6.v0
    public final void c(N n10) {
        try {
            this.f9472b.v(n10.t());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // T6.v0
    public final void d(A a10, boolean z10) {
        a10.c(this.f9472b, z10);
    }
}
