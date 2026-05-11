package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d extends a {
    private final CoroutineContext _context;
    private transient kotlin.coroutines.d<Object> intercepted;

    public d(kotlin.coroutines.d dVar, CoroutineContext coroutineContext) {
        super(dVar);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.d(coroutineContext);
        return coroutineContext;
    }

    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d dVar = this.intercepted;
        if (dVar == null) {
            kotlin.coroutines.e eVar = (kotlin.coroutines.e) getContext().a(kotlin.coroutines.e.f36370f0);
            if (eVar == null || (dVar = eVar.i(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        kotlin.coroutines.d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            CoroutineContext.Element a10 = getContext().a(kotlin.coroutines.e.f36370f0);
            Intrinsics.d(a10);
            ((kotlin.coroutines.e) a10).f(dVar);
        }
        this.intercepted = c.f36376a;
    }

    public d(kotlin.coroutines.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
