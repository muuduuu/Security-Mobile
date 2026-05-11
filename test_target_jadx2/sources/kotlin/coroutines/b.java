package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b implements CoroutineContext.b {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f36365a;

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext.b f36366b;

    public b(CoroutineContext.b baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f36365a = safeCast;
        this.f36366b = baseKey instanceof b ? ((b) baseKey).f36366b : baseKey;
    }

    public final boolean a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f36366b == key;
    }

    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f36365a.invoke(element);
    }
}
