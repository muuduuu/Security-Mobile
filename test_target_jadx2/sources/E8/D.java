package e8;

import D7.C0787k;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class D extends AbstractRunnableC3093A {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0787k f32258b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractRunnableC3093A f32259c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3100f f32260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C3100f c3100f, C0787k c0787k, C0787k c0787k2, AbstractRunnableC3093A abstractRunnableC3093A) {
        super(c0787k);
        this.f32260d = c3100f;
        this.f32258b = c0787k2;
        this.f32259c = abstractRunnableC3093A;
    }

    @Override // e8.AbstractRunnableC3093A
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        z zVar;
        obj = this.f32260d.f32274f;
        synchronized (obj) {
            try {
                C3100f.o(this.f32260d, this.f32258b);
                atomicInteger = this.f32260d.f32280l;
                if (atomicInteger.getAndIncrement() > 0) {
                    zVar = this.f32260d.f32270b;
                    zVar.c("Already connected to the service.", new Object[0]);
                }
                C3100f.q(this.f32260d, this.f32259c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
