package D7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f1347a = new CountDownLatch(1);

    /* synthetic */ q(p pVar) {
    }

    @Override // D7.InterfaceC0781e
    public final void a() {
        this.f1347a.countDown();
    }

    @Override // D7.InterfaceC0782f
    public final void b(Exception exc) {
        this.f1347a.countDown();
    }

    public final void c() {
        this.f1347a.await();
    }

    public final boolean d(long j10, TimeUnit timeUnit) {
        return this.f1347a.await(j10, timeUnit);
    }

    @Override // D7.InterfaceC0783g
    public final void onSuccess(Object obj) {
        this.f1347a.countDown();
    }
}
