package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class j extends a {
    public j(kotlin.coroutines.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != kotlin.coroutines.g.f36372a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return kotlin.coroutines.g.f36372a;
    }
}
