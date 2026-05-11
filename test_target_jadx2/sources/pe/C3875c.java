package pe;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3875c extends c0 {

    /* renamed from: i, reason: collision with root package name */
    private static final a f38648i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f38649j;

    /* renamed from: k, reason: collision with root package name */
    private static final Condition f38650k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f38651l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f38652m;

    /* renamed from: n, reason: collision with root package name */
    private static C3875c f38653n;

    /* renamed from: f, reason: collision with root package name */
    private int f38654f;

    /* renamed from: g, reason: collision with root package name */
    private C3875c f38655g;

    /* renamed from: h, reason: collision with root package name */
    private long f38656h;

    /* renamed from: pe.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(C3875c c3875c, long j10, boolean z10) {
            if (C3875c.f38653n == null) {
                C3875c.f38653n = new C3875c();
                new b().start();
            }
            long nanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                c3875c.f38656h = Math.min(j10, c3875c.c() - nanoTime) + nanoTime;
            } else if (j10 != 0) {
                c3875c.f38656h = j10 + nanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                c3875c.f38656h = c3875c.c();
            }
            long y10 = c3875c.y(nanoTime);
            C3875c c3875c2 = C3875c.f38653n;
            Intrinsics.d(c3875c2);
            while (c3875c2.f38655g != null) {
                C3875c c3875c3 = c3875c2.f38655g;
                Intrinsics.d(c3875c3);
                if (y10 < c3875c3.y(nanoTime)) {
                    break;
                }
                c3875c2 = c3875c2.f38655g;
                Intrinsics.d(c3875c2);
            }
            c3875c.f38655g = c3875c2.f38655g;
            c3875c2.f38655g = c3875c;
            if (c3875c2 == C3875c.f38653n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C3875c c3875c) {
            for (C3875c c3875c2 = C3875c.f38653n; c3875c2 != null; c3875c2 = c3875c2.f38655g) {
                if (c3875c2.f38655g == c3875c) {
                    c3875c2.f38655g = c3875c.f38655g;
                    c3875c.f38655g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C3875c c() {
            C3875c c3875c = C3875c.f38653n;
            Intrinsics.d(c3875c);
            C3875c c3875c2 = c3875c.f38655g;
            if (c3875c2 == null) {
                long nanoTime = System.nanoTime();
                d().await(C3875c.f38651l, TimeUnit.MILLISECONDS);
                C3875c c3875c3 = C3875c.f38653n;
                Intrinsics.d(c3875c3);
                if (c3875c3.f38655g != null || System.nanoTime() - nanoTime < C3875c.f38652m) {
                    return null;
                }
                return C3875c.f38653n;
            }
            long y10 = c3875c2.y(System.nanoTime());
            if (y10 > 0) {
                d().await(y10, TimeUnit.NANOSECONDS);
                return null;
            }
            C3875c c3875c4 = C3875c.f38653n;
            Intrinsics.d(c3875c4);
            c3875c4.f38655g = c3875c2.f38655g;
            c3875c2.f38655g = null;
            c3875c2.f38654f = 2;
            return c3875c2;
        }

        public final Condition d() {
            return C3875c.f38650k;
        }

        public final ReentrantLock e() {
            return C3875c.f38649j;
        }

        private a() {
        }
    }

    /* renamed from: pe.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock e10;
            C3875c c10;
            while (true) {
                try {
                    e10 = C3875c.f38648i.e();
                    e10.lock();
                    try {
                        c10 = C3875c.f38648i.c();
                    } finally {
                        e10.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c10 == C3875c.f38653n) {
                    a unused2 = C3875c.f38648i;
                    C3875c.f38653n = null;
                    return;
                } else {
                    Unit unit = Unit.f36324a;
                    e10.unlock();
                    if (c10 != null) {
                        c10.B();
                    }
                }
            }
        }
    }

    /* renamed from: pe.c$c, reason: collision with other inner class name */
    public static final class C0597c implements Z {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z f38658b;

        C0597c(Z z10) {
            this.f38658b = z10;
        }

        @Override // pe.Z
        public void N0(C3877e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            AbstractC3874b.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                W w10 = source.f38666a;
                Intrinsics.d(w10);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += w10.f38631c - w10.f38630b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        w10 = w10.f38634f;
                        Intrinsics.d(w10);
                    }
                }
                C3875c c3875c = C3875c.this;
                Z z10 = this.f38658b;
                c3875c.v();
                try {
                    z10.N0(source, j11);
                    Unit unit = Unit.f36324a;
                    if (c3875c.w()) {
                        throw c3875c.p(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!c3875c.w()) {
                        throw e10;
                    }
                    throw c3875c.p(e10);
                } finally {
                    c3875c.w();
                }
            }
        }

        @Override // pe.Z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3875c A() {
            return C3875c.this;
        }

        @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3875c c3875c = C3875c.this;
            Z z10 = this.f38658b;
            c3875c.v();
            try {
                z10.close();
                Unit unit = Unit.f36324a;
                if (c3875c.w()) {
                    throw c3875c.p(null);
                }
            } catch (IOException e10) {
                if (!c3875c.w()) {
                    throw e10;
                }
                throw c3875c.p(e10);
            } finally {
                c3875c.w();
            }
        }

        @Override // pe.Z, java.io.Flushable
        public void flush() {
            C3875c c3875c = C3875c.this;
            Z z10 = this.f38658b;
            c3875c.v();
            try {
                z10.flush();
                Unit unit = Unit.f36324a;
                if (c3875c.w()) {
                    throw c3875c.p(null);
                }
            } catch (IOException e10) {
                if (!c3875c.w()) {
                    throw e10;
                }
                throw c3875c.p(e10);
            } finally {
                c3875c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f38658b + ')';
        }
    }

    /* renamed from: pe.c$d */
    public static final class d implements b0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f38660b;

        d(b0 b0Var) {
            this.f38660b = b0Var;
        }

        @Override // pe.b0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3875c A() {
            return C3875c.this;
        }

        @Override // pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            C3875c c3875c = C3875c.this;
            b0 b0Var = this.f38660b;
            c3875c.v();
            try {
                long b22 = b0Var.b2(sink, j10);
                if (c3875c.w()) {
                    throw c3875c.p(null);
                }
                return b22;
            } catch (IOException e10) {
                if (c3875c.w()) {
                    throw c3875c.p(e10);
                }
                throw e10;
            } finally {
                c3875c.w();
            }
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3875c c3875c = C3875c.this;
            b0 b0Var = this.f38660b;
            c3875c.v();
            try {
                b0Var.close();
                Unit unit = Unit.f36324a;
                if (c3875c.w()) {
                    throw c3875c.p(null);
                }
            } catch (IOException e10) {
                if (!c3875c.w()) {
                    throw e10;
                }
                throw c3875c.p(e10);
            } finally {
                c3875c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f38660b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f38649j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        f38650k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f38651l = millis;
        f38652m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j10) {
        return this.f38656h - j10;
    }

    public final b0 A(b0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long h10 = h();
        boolean e10 = e();
        if (h10 != 0 || e10) {
            ReentrantLock reentrantLock = f38649j;
            reentrantLock.lock();
            try {
                if (this.f38654f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f38654f = 1;
                f38648i.f(this, h10, e10);
                Unit unit = Unit.f36324a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f38649j;
        reentrantLock.lock();
        try {
            int i10 = this.f38654f;
            this.f38654f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f38648i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Z z(Z sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C0597c(sink);
    }

    protected void B() {
    }
}
