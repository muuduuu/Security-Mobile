package Nd;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class j implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f6782a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6783b;

    public j(Throwable th, CoroutineContext coroutineContext) {
        this.f6782a = coroutineContext;
        this.f6783b = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object K(Object obj, Function2 function2) {
        return this.f6782a.K(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element a(CoroutineContext.b bVar) {
        return this.f6782a.a(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext l(CoroutineContext coroutineContext) {
        return this.f6782a.l(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext t(CoroutineContext.b bVar) {
        return this.f6782a.t(bVar);
    }
}
