package G1;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final b f2811d = new b();

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f2812a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f2813b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f2814c;

    /* renamed from: G1.b$b, reason: collision with other inner class name */
    private static class ExecutorC0065b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private ThreadLocal f2815a;

        private ExecutorC0065b() {
            this.f2815a = new ThreadLocal();
        }

        private int a() {
            Integer num = (Integer) this.f2815a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f2815a.remove();
            } else {
                this.f2815a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = (Integer) this.f2815a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f2815a.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private b() {
        this.f2812a = !c() ? Executors.newCachedThreadPool() : G1.a.b();
        this.f2813b = Executors.newSingleThreadScheduledExecutor();
        this.f2814c = new ExecutorC0065b();
    }

    public static ExecutorService a() {
        return f2811d.f2812a;
    }

    static Executor b() {
        return f2811d.f2814c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
