package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class s extends e {

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f14757d;

    s(n nVar) {
        super(nVar);
        this.f14757d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        if (this.f14757d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
