package H6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f3101a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3102b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f3103c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f3104d = false;

    public c(a aVar, long j10) {
        this.f3101a = new WeakReference(aVar);
        this.f3102b = j10;
        start();
    }

    private final void a() {
        a aVar = (a) this.f3101a.get();
        if (aVar != null) {
            aVar.c();
            this.f3104d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f3103c.await(this.f3102b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
