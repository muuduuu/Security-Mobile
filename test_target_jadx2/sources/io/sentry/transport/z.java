package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final a f35545a;

    private static final class a extends AbstractQueuedSynchronizer {
        a(int i10) {
            setState(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i10) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i10) {
            int state;
            int i11;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i11 = state - 1;
            } while (!compareAndSetState(state, i11));
            return i11 == 0;
        }
    }

    public z(int i10) {
        if (i10 >= 0) {
            this.f35545a = new a(i10);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i10 + "' is not allowed");
    }

    public void a() {
        this.f35545a.d();
    }

    public int b() {
        return this.f35545a.e();
    }

    public void c() {
        this.f35545a.f();
    }

    public boolean d(long j10, TimeUnit timeUnit) {
        return this.f35545a.tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
    }

    public z() {
        this(0);
    }
}
