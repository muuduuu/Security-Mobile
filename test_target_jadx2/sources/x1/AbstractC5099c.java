package x1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5099c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f44674a = 8;

    /* renamed from: x1.c$a */
    public static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f44675a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f44676b;

        a(boolean z10) {
            this.f44676b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            return new Thread(runnable, (this.f44676b ? "WM.task-" : "androidx.work-") + this.f44675a.incrementAndGet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor b(boolean z10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static final int c() {
        return f44674a;
    }
}
