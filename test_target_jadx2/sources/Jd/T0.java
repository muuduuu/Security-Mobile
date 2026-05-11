package Jd;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class T0 extends Od.z {

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal f5014e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T0(CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        super(coroutineContext.a(r0) == null ? coroutineContext.l(r0) : coroutineContext, dVar);
        U0 u02 = U0.f5017a;
        this.f5014e = new ThreadLocal();
        if (dVar.getContext().a(kotlin.coroutines.e.f36370f0) instanceof J) {
            return;
        }
        Object i10 = Od.K.i(coroutineContext, null);
        Od.K.f(coroutineContext, i10);
        W0(coroutineContext, i10);
    }

    @Override // Od.z, Jd.AbstractC0871a
    protected void R0(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f5014e.get();
            if (pair != null) {
                Od.K.f((CoroutineContext) pair.getFirst(), pair.getSecond());
            }
            this.f5014e.remove();
        }
        Object a10 = D.a(obj, this.f7356d);
        kotlin.coroutines.d dVar = this.f7356d;
        CoroutineContext context = dVar.getContext();
        Object i10 = Od.K.i(context, null);
        T0 m10 = i10 != Od.K.f7306a ? H.m(dVar, context, i10) : null;
        try {
            this.f7356d.resumeWith(a10);
            Unit unit = Unit.f36324a;
        } finally {
            if (m10 == null || m10.V0()) {
                Od.K.f(context, i10);
            }
        }
    }

    public final boolean V0() {
        boolean z10 = this.threadLocalIsSet && this.f5014e.get() == null;
        this.f5014e.remove();
        return !z10;
    }

    public final void W0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f5014e.set(lc.t.a(coroutineContext, obj));
    }
}
