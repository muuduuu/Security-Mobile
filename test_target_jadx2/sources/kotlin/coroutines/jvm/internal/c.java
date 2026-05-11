package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class c implements kotlin.coroutines.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f36376a = new c();

    private c() {
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
