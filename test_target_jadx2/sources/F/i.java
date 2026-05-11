package F;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
final class i implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f2189b;

    /* renamed from: a, reason: collision with root package name */
    final Deque f2188a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final b f2190c = new b();

    /* renamed from: d, reason: collision with root package name */
    c f2191d = c.IDLE;

    /* renamed from: e, reason: collision with root package name */
    long f2192e = 0;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f2193a;

        a(Runnable runnable) {
            this.f2193a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2193a.run();
        }
    }

    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            A.AbstractC0700h0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
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
                    synchronized (i.this.f2188a) {
                        if (!z10) {
                            i iVar = i.this;
                            c cVar = iVar.f2191d;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                iVar.f2192e++;
                                iVar.f2191d = cVar2;
                                z10 = true;
                            }
                        }
                        Runnable runnable = (Runnable) i.this.f2188a.poll();
                        if (runnable == null) {
                            i.this.f2191d = c.IDLE;
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
                synchronized (i.this.f2188a) {
                    i.this.f2191d = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    i(Executor executor) {
        this.f2189b = (Executor) y0.f.g(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        y0.f.g(runnable);
        synchronized (this.f2188a) {
            c cVar2 = this.f2191d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f2192e;
                a aVar = new a(runnable);
                this.f2188a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f2191d = cVar3;
                try {
                    this.f2189b.execute(this.f2190c);
                    if (this.f2191d != cVar3) {
                        return;
                    }
                    synchronized (this.f2188a) {
                        try {
                            if (this.f2192e == j10 && this.f2191d == cVar3) {
                                this.f2191d = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f2188a) {
                        try {
                            c cVar4 = this.f2191d;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z10 = false;
                                if ((e10 instanceof RejectedExecutionException) || z10) {
                                    throw e10;
                                }
                            }
                            if (this.f2188a.removeLastOccurrence(aVar)) {
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
            this.f2188a.add(runnable);
        }
    }
}
