package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.Element {

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineContext.b f36364a;

    public a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f36364a = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object K(Object obj, Function2 function2) {
        return CoroutineContext.Element.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element a(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.b getKey() {
        return this.f36364a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext l(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext t(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }
}
