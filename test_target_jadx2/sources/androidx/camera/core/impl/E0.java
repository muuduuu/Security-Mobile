package androidx.camera.core.impl;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface E0 {

    public interface a {
        void a(Object obj);

        void onError(Throwable th);
    }

    void a(a aVar);

    h8.d c();

    void e(Executor executor, a aVar);
}
