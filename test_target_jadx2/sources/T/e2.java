package t;

import A.AbstractC0700h0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f42060a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f42061b;

    public e2(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f42060a = executor;
        this.f42061b = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int decrementAndGet = this$0.f42061b.decrementAndGet();
        if (decrementAndGet >= 0) {
            AbstractC0700h0.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
            return;
        }
        AbstractC0700h0.l("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC0700h0.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.f42061b.incrementAndGet());
    }

    public final void c() {
        this.f42060a.execute(new Runnable() { // from class: t.c2
            @Override // java.lang.Runnable
            public final void run() {
                e2.d(e2.this);
            }
        });
    }

    public final int e() {
        return this.f42061b.get();
    }

    public final void f() {
        this.f42060a.execute(new Runnable() { // from class: t.d2
            @Override // java.lang.Runnable
            public final void run() {
                e2.g(e2.this);
            }
        });
    }

    public final void h() {
        this.f42061b.set(0);
        AbstractC0700h0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
