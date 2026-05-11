package h1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f33801a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f33802b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f33803c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f33804d;

    public D(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f33801a = executor;
        this.f33802b = new ArrayDeque();
        this.f33804d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, D this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f33804d) {
            try {
                Object poll = this.f33802b.poll();
                Runnable runnable = (Runnable) poll;
                this.f33803c = runnable;
                if (poll != null) {
                    this.f33801a.execute(runnable);
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f33804d) {
            try {
                this.f33802b.offer(new Runnable() { // from class: h1.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        D.b(command, this);
                    }
                });
                if (this.f33803c == null) {
                    c();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
