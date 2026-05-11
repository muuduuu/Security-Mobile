package p8;

import java.util.concurrent.Executor;

/* renamed from: p8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3851j {

    /* renamed from: p8.j$a */
    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new ExecutorC3852k(executor);
    }
}
