package X8;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
enum t implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = C1301g.a().f11789a;
        handler.post(runnable);
    }
}
