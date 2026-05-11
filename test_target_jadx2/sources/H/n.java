package H;

import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.V;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface n extends Q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final V.a f3080d = V.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor T(Executor executor) {
        return (Executor) f(f3080d, executor);
    }
}
