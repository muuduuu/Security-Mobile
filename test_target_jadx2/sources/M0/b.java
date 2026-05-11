package M0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f5959a;

    public b(boolean z10) {
        this.f5959a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f5959a.get();
    }

    public final void b(boolean z10) {
        this.f5959a.set(z10);
    }
}
