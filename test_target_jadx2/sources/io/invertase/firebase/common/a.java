package io.invertase.firebase.common;

import Zb.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f34332e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f34333a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34334b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34335c;

    /* renamed from: d, reason: collision with root package name */
    private final RejectedExecutionHandler f34336d = new RejectedExecutionHandler() { // from class: Zb.n
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            io.invertase.firebase.common.a.this.h(runnable, threadPoolExecutor);
        }
    };

    a(String str) {
        this.f34333a = str;
        i g10 = i.g();
        this.f34334b = g10.d("android_task_executor_maximum_pool_size", 1);
        this.f34335c = g10.d("android_task_executor_keep_alive_seconds", 3);
    }

    private ExecutorService e(boolean z10) {
        if (z10) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f34334b, this.f34335c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f34336d);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        f().execute(runnable);
    }

    public ExecutorService b() {
        return c(this.f34334b <= 1, BuildConfig.FLAVOR);
    }

    public ExecutorService c(boolean z10, String str) {
        String d10 = d(z10, str);
        Map map = f34332e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(d10);
                if (executorService != null) {
                    return executorService;
                }
                ExecutorService e10 = e(z10);
                map.put(d10, e10);
                return e10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(boolean z10, String str) {
        if (z10) {
            return this.f34333a + "TransactionalExecutor" + str;
        }
        return this.f34333a + "Executor" + str;
    }

    public ExecutorService f() {
        return c(true, BuildConfig.FLAVOR);
    }

    public ExecutorService g(String str) {
        if (this.f34334b == 0) {
            str = BuildConfig.FLAVOR;
        }
        return c(true, str);
    }

    public void i(String str) {
        Map map = f34332e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Map map = f34332e;
        synchronized (map) {
            try {
                for (String str : new ArrayList(map.keySet())) {
                    if (str.startsWith(this.f34333a)) {
                        i(str);
                    } else {
                        f34332e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
