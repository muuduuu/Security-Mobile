package xd;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f45001c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f45002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Lock lock, Runnable checkCancelled, Function1 interruptedExceptionHandler) {
        super(lock);
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f45001c = checkCancelled;
        this.f45002d = interruptedExceptionHandler;
    }

    @Override // xd.d, xd.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f45001c.run();
            } catch (InterruptedException e10) {
                this.f45002d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable checkCancelled, Function1 interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
