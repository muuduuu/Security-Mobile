package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements CoroutineContext, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final g f36372a = new g();

    private g() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object K(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext l(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext t(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
