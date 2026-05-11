package e8;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class E extends AbstractRunnableC3093A {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3100f f32261b;

    E(C3100f c3100f) {
        this.f32261b = c3100f;
    }

    @Override // e8.AbstractRunnableC3093A
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        z zVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        z zVar2;
        obj = this.f32261b.f32274f;
        synchronized (obj) {
            try {
                atomicInteger = this.f32261b.f32280l;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.f32261b.f32280l;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        zVar2 = this.f32261b.f32270b;
                        zVar2.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                C3100f c3100f = this.f32261b;
                iInterface = c3100f.f32282n;
                if (iInterface != null) {
                    zVar = c3100f.f32270b;
                    zVar.c("Unbind from service.", new Object[0]);
                    C3100f c3100f2 = this.f32261b;
                    context = c3100f2.f32269a;
                    serviceConnection = c3100f2.f32281m;
                    context.unbindService(serviceConnection);
                    this.f32261b.f32275g = false;
                    this.f32261b.f32282n = null;
                    this.f32261b.f32281m = null;
                }
                this.f32261b.x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
