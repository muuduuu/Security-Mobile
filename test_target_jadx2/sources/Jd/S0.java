package Jd;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class S0 extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final S0 f5011c = new S0();

    private S0() {
    }

    @Override // Jd.J
    public J i0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        W0 w02 = (W0) coroutineContext.a(W0.f5018c);
        if (w02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        w02.f5019b = true;
    }

    @Override // Jd.J
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // Jd.J
    public boolean y(CoroutineContext coroutineContext) {
        return false;
    }
}
