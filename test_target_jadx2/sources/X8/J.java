package X8;

import V6.AbstractC1287s;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class J implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f11780a;

    /* synthetic */ J(n nVar, I i10) {
        AtomicReference atomicReference;
        this.f11780a = nVar;
        atomicReference = nVar.f11827d;
        AbstractC1287s.p(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f11780a.f11827d;
        atomicReference.set(null);
        this.f11780a.d();
    }
}
