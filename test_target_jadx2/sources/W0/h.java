package w0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f44264a;

        /* renamed from: b, reason: collision with root package name */
        private int f44265b;

        /* renamed from: w0.h$a$a, reason: collision with other inner class name */
        private static class C0635a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            private final int f44266a;

            C0635a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f44266a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f44266a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f44264a = str;
            this.f44265b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0635a(runnable, this.f44264a, this.f44265b);
        }
    }

    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Callable f44267a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC5159a f44268b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f44269c;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5159a f44270a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f44271b;

            a(InterfaceC5159a interfaceC5159a, Object obj) {
                this.f44270a = interfaceC5159a;
                this.f44271b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f44270a.accept(this.f44271b);
            }
        }

        b(Handler handler, Callable callable, InterfaceC5159a interfaceC5159a) {
            this.f44267a = callable;
            this.f44268b = interfaceC5159a;
            this.f44269c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f44267a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f44269c.post(new a(this.f44268b, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, InterfaceC5159a interfaceC5159a) {
        executor.execute(new b(AbstractC5016b.a(), callable, interfaceC5159a));
    }

    static Object c(ExecutorService executorService, Callable callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
