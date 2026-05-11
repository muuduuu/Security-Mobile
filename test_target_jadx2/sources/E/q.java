package E;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class q {
    public static void a() {
        y0.f.j(c(), "Not in application's main thread");
    }

    private static Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            y0.f.j(b().post(runnable), "Unable to post to main thread");
        }
    }
}
