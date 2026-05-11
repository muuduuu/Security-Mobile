package E1;

import Jd.J;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface b {
    J a();

    Executor b();

    a c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
