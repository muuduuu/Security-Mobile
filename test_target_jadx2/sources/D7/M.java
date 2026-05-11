package D7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import w7.HandlerC5043a;

/* loaded from: classes2.dex */
final class M implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f1332a = new HandlerC5043a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1332a.post(runnable);
    }
}
