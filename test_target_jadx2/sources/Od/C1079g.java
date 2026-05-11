package Od;

import kotlin.coroutines.CoroutineContext;

/* renamed from: Od.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1079g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final transient CoroutineContext f7319a;

    public C1079g(CoroutineContext coroutineContext) {
        this.f7319a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f7319a.toString();
    }
}
