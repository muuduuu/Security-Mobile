package f7;

import android.os.Process;

/* renamed from: f7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3151c extends Thread {
    C3151c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
