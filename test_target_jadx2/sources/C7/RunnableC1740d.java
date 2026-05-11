package c7;

import android.os.Process;

/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1740d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f19431a;

    public RunnableC1740d(Runnable runnable, int i10) {
        this.f19431a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f19431a.run();
    }
}
