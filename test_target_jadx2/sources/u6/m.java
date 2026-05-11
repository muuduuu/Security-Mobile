package u6;

import java.util.concurrent.Executor;
import y6.AbstractC5177a;

/* loaded from: classes2.dex */
class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f43564a;

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f43565a;

        a(Runnable runnable) {
            this.f43565a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f43565a.run();
            } catch (Exception e10) {
                AbstractC5177a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    m(Executor executor) {
        this.f43564a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f43564a.execute(new a(runnable));
    }
}
