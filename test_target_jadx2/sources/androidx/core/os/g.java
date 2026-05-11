package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class g {

    private static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f15972a;

        a(Handler handler) {
            this.f15972a = (Handler) y0.f.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f15972a.post((Runnable) y0.f.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f15972a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
