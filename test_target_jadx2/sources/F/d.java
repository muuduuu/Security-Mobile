package F;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f2167a;

    d() {
    }

    static Executor a() {
        if (f2167a != null) {
            return f2167a;
        }
        synchronized (d.class) {
            try {
                if (f2167a == null) {
                    f2167a = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2167a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
