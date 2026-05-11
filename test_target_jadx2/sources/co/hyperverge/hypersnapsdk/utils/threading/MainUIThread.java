package co.hyperverge.hypersnapsdk.utils.threading;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class MainUIThread {
    private static MainUIThread mainUiThread;
    private Handler handler = new Handler(Looper.getMainLooper());

    private MainUIThread() {
    }

    public static synchronized MainUIThread getInstance() {
        MainUIThread mainUIThread;
        synchronized (MainUIThread.class) {
            try {
                if (mainUiThread == null) {
                    mainUiThread = new MainUIThread();
                }
                mainUIThread = mainUiThread;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mainUIThread;
    }

    public void post(Runnable runnable) {
        this.handler.post(runnable);
    }
}
