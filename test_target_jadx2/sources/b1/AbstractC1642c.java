package b1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1642c {

    /* renamed from: e, reason: collision with root package name */
    private static Handler f18499e;

    /* renamed from: b, reason: collision with root package name */
    private volatile e f18501b = e.PENDING;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f18502c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f18503d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final FutureTask f18500a = new b(new a());

    /* renamed from: b1.c$a */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC1642c.this.f18503d.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = AbstractC1642c.this.b();
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    /* renamed from: b1.c$b */
    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC1642c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                AbstractC1642c.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: b1.c$c, reason: collision with other inner class name */
    class RunnableC0322c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f18506a;

        RunnableC0322c(Object obj) {
            this.f18506a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1642c.this.d(this.f18506a);
        }
    }

    /* renamed from: b1.c$d */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18508a;

        static {
            int[] iArr = new int[e.values().length];
            f18508a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18508a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: b1.c$e */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    AbstractC1642c() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (AbstractC1642c.class) {
            try {
                if (f18499e == null) {
                    f18499e = new Handler(Looper.getMainLooper());
                }
                handler = f18499e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f18502c.set(true);
        return this.f18500a.cancel(z10);
    }

    protected abstract Object b();

    public final void c(Executor executor) {
        if (this.f18501b == e.PENDING) {
            this.f18501b = e.RUNNING;
            executor.execute(this.f18500a);
            return;
        }
        int i10 = d.f18508a[this.f18501b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f18501b = e.FINISHED;
    }

    public final boolean f() {
        return this.f18502c.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    void i(Object obj) {
        e().post(new RunnableC0322c(obj));
    }

    void j(Object obj) {
        if (this.f18503d.get()) {
            return;
        }
        i(obj);
    }
}
