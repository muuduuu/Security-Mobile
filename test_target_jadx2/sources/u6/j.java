package u6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
abstract class j {
    static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
