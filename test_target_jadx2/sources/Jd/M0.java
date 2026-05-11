package Jd;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
class M0 extends AbstractC0871a {
    public M0(CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    @Override // Jd.C0
    protected boolean o0(Throwable th) {
        L.a(getContext(), th);
        return true;
    }
}
