package pe;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3882j implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38691a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38692b;

    /* renamed from: c, reason: collision with root package name */
    private int f38693c;

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f38694d = f0.b();

    /* renamed from: pe.j$a */
    private static final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3882j f38695a;

        /* renamed from: b, reason: collision with root package name */
        private long f38696b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f38697c;

        public a(AbstractC3882j fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f38695a = fileHandle;
            this.f38696b = j10;
        }

        @Override // pe.b0
        public c0 A() {
            return c0.f38662e;
        }

        @Override // pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f38697c) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f38695a.j(this.f38696b, sink, j10);
            if (j11 != -1) {
                this.f38696b += j11;
            }
            return j11;
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f38697c) {
                return;
            }
            this.f38697c = true;
            ReentrantLock e10 = this.f38695a.e();
            e10.lock();
            try {
                AbstractC3882j abstractC3882j = this.f38695a;
                abstractC3882j.f38693c--;
                if (this.f38695a.f38693c == 0 && this.f38695a.f38692b) {
                    Unit unit = Unit.f36324a;
                    e10.unlock();
                    this.f38695a.f();
                }
            } finally {
                e10.unlock();
            }
        }
    }

    public AbstractC3882j(boolean z10) {
        this.f38691a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long j(long j10, C3877e c3877e, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            W A02 = c3877e.A0(1);
            int g10 = g(j13, A02.f38629a, A02.f38631c, (int) Math.min(j12 - j13, 8192 - r7));
            if (g10 == -1) {
                if (A02.f38630b == A02.f38631c) {
                    c3877e.f38666a = A02.b();
                    X.b(A02);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                A02.f38631c += g10;
                long j14 = g10;
                j13 += j14;
                c3877e.i0(c3877e.size() + j14);
            }
        }
        return j13 - j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f38694d;
        reentrantLock.lock();
        try {
            if (this.f38692b) {
                return;
            }
            this.f38692b = true;
            if (this.f38693c != 0) {
                return;
            }
            Unit unit = Unit.f36324a;
            reentrantLock.unlock();
            f();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock e() {
        return this.f38694d;
    }

    protected abstract void f();

    protected abstract int g(long j10, byte[] bArr, int i10, int i11);

    protected abstract long i();

    public final b0 l(long j10) {
        ReentrantLock reentrantLock = this.f38694d;
        reentrantLock.lock();
        try {
            if (this.f38692b) {
                throw new IllegalStateException("closed");
            }
            this.f38693c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f38694d;
        reentrantLock.lock();
        try {
            if (this.f38692b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f36324a;
            reentrantLock.unlock();
            return i();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
