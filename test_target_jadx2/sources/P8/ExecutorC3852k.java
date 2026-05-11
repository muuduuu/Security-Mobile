package p8;

import V6.AbstractC1287s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* renamed from: p8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ExecutorC3852k implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f38478f = Logger.getLogger(ExecutorC3852k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38479a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque f38480b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f38481c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f38482d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final b f38483e = new b(this, null);

    /* renamed from: p8.k$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f38484a;

        a(Runnable runnable) {
            this.f38484a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38484a.run();
        }

        public String toString() {
            return this.f38484a.toString();
        }
    }

    /* renamed from: p8.k$b */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f38486a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        
            r8.f38486a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        
            r8.f38486a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            p8.ExecutorC3852k.f38478f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f38486a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                try {
                    synchronized (ExecutorC3852k.this.f38480b) {
                        if (!z10) {
                            c cVar = ExecutorC3852k.this.f38481c;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                ExecutorC3852k.d(ExecutorC3852k.this);
                                ExecutorC3852k.this.f38481c = cVar2;
                                z10 = true;
                            }
                        }
                        Runnable runnable = (Runnable) ExecutorC3852k.this.f38480b.poll();
                        this.f38486a = runnable;
                        if (runnable == null) {
                            ExecutorC3852k.this.f38481c = c.IDLE;
                        }
                    }
                    if (z11) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } finally {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (ExecutorC3852k.this.f38480b) {
                    ExecutorC3852k.this.f38481c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f38486a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC3852k.this.f38481c + "}";
        }

        /* synthetic */ b(ExecutorC3852k executorC3852k, a aVar) {
            this();
        }
    }

    /* renamed from: p8.k$c */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    ExecutorC3852k(Executor executor) {
        this.f38479a = (Executor) AbstractC1287s.m(executor);
    }

    static /* synthetic */ long d(ExecutorC3852k executorC3852k) {
        long j10 = executorC3852k.f38482d;
        executorC3852k.f38482d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        AbstractC1287s.m(runnable);
        synchronized (this.f38480b) {
            c cVar2 = this.f38481c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f38482d;
                a aVar = new a(runnable);
                this.f38480b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f38481c = cVar3;
                try {
                    this.f38479a.execute(this.f38483e);
                    if (this.f38481c != cVar3) {
                        return;
                    }
                    synchronized (this.f38480b) {
                        try {
                            if (this.f38482d == j10 && this.f38481c == cVar3) {
                                this.f38481c = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f38480b) {
                        try {
                            c cVar4 = this.f38481c;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z10 = false;
                                if ((e10 instanceof RejectedExecutionException) || z10) {
                                    throw e10;
                                }
                            }
                            if (this.f38480b.removeLastOccurrence(aVar)) {
                                z10 = true;
                                if (e10 instanceof RejectedExecutionException) {
                                }
                                throw e10;
                            }
                            z10 = false;
                            if (e10 instanceof RejectedExecutionException) {
                            }
                            throw e10;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f38480b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f38479a + "}";
    }
}
