package cb;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: cb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class FutureC1748b implements Future {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f19436a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    private Object f19437b;

    /* renamed from: c, reason: collision with root package name */
    private Exception f19438c;

    private void a() {
        if (this.f19436a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public void b(Object obj) {
        a();
        this.f19437b = obj;
        this.f19436a.countDown();
    }

    public void c(Exception exc) {
        a();
        this.f19438c = exc;
        this.f19436a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        this.f19436a.await();
        if (this.f19438c == null) {
            return this.f19437b;
        }
        throw new ExecutionException(this.f19438c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f19436a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        if (this.f19436a.await(j10, timeUnit)) {
            if (this.f19438c == null) {
                return this.f19437b;
            }
            throw new ExecutionException(this.f19438c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
