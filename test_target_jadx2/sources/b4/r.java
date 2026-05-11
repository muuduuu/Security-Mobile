package b4;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final int f18762a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18763b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18764c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f18765d;

    public r(int i10, String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f18762a = i10;
        this.f18763b = prefix;
        this.f18764c = z10;
        this.f18765d = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(r this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.f18762a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: b4.q
            @Override // java.lang.Runnable
            public final void run() {
                r.b(r.this, runnable);
            }
        };
        if (this.f18764c) {
            str = this.f18763b + "-" + this.f18765d.getAndIncrement();
        } else {
            str = this.f18763b;
        }
        return new Thread(runnable2, str);
    }
}
