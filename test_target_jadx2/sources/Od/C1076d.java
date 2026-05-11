package Od;

import kotlin.coroutines.CoroutineContext;

/* renamed from: Od.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1076d implements Jd.N {

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineContext f7317a;

    public C1076d(CoroutineContext coroutineContext) {
        this.f7317a = coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + y() + ')';
    }

    @Override // Jd.N
    public CoroutineContext y() {
        return this.f7317a;
    }
}
