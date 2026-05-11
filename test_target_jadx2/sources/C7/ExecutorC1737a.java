package c7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import n7.p;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ExecutorC1737a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f19425a;

    public ExecutorC1737a(Looper looper) {
        this.f19425a = new p(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f19425a.post(runnable);
    }
}
