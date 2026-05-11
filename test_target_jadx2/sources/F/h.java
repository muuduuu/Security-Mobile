package F;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f2187a;

    static ScheduledExecutorService a() {
        if (f2187a != null) {
            return f2187a;
        }
        synchronized (h.class) {
            try {
                if (f2187a == null) {
                    f2187a = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2187a;
    }
}
