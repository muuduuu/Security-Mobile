package I0;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: I0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f4028a;

    public C0836b(int i10) {
        this.f4028a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f4028a.decrementAndGet();
    }

    public final int b() {
        return this.f4028a.get();
    }

    public final int c() {
        return this.f4028a.getAndIncrement();
    }

    public final int d() {
        return this.f4028a.incrementAndGet();
    }
}
