package O6;

import T6.InterfaceC1188s;
import android.content.Context;
import android.util.Log;
import b1.AbstractC1640a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class g extends AbstractC1640a implements InterfaceC1188s {

    /* renamed from: o, reason: collision with root package name */
    private final Semaphore f7092o;

    /* renamed from: p, reason: collision with root package name */
    private final Set f7093p;

    public g(Context context, Set set) {
        super(context);
        this.f7092o = new Semaphore(0);
        this.f7093p = set;
    }

    @Override // b1.AbstractC1640a
    public final /* bridge */ /* synthetic */ Object D() {
        Iterator it = this.f7093p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((S6.h) it.next()).m(this)) {
                i10++;
            }
        }
        try {
            this.f7092o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // T6.InterfaceC1188s
    public final void a() {
        this.f7092o.release();
    }

    @Override // b1.AbstractC1641b
    protected final void q() {
        this.f7092o.drainPermits();
        i();
    }
}
