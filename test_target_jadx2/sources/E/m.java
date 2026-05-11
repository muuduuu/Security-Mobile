package E;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Handler f1864a;

    public static Handler a() {
        if (f1864a != null) {
            return f1864a;
        }
        synchronized (m.class) {
            try {
                if (f1864a == null) {
                    f1864a = androidx.core.os.h.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1864a;
    }
}
