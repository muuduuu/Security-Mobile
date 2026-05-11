package p8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: p8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3853l implements Executor {
    INSTANCE;

    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}
