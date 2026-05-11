package a1;

import Jd.A0;
import Jd.N;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336a implements AutoCloseable, N {

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineContext f12539a;

    public C1336a(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f12539a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        A0.d(y(), null, 1, null);
    }

    @Override // Jd.N
    public CoroutineContext y() {
        return this.f12539a;
    }
}
