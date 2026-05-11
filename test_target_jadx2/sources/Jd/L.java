package Jd;

import Od.AbstractC1078f;
import kotlin.coroutines.CoroutineContext;
import lc.AbstractC3622a;

/* loaded from: classes3.dex */
public abstract class L {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            K k10 = (K) coroutineContext.a(K.f5000N);
            if (k10 != null) {
                k10.N(coroutineContext, th);
            } else {
                AbstractC1078f.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            AbstractC1078f.a(coroutineContext, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC3622a.a(runtimeException, th);
        return runtimeException;
    }
}
