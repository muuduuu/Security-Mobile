package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class P {
    public static P a(Executor executor, Handler handler) {
        return new C1428c(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
