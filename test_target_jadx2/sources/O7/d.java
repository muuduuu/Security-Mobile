package o7;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class d {
    public static Object a(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
