package pe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3886n implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final Z f38711a;

    public AbstractC3886n(Z delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38711a = delegate;
    }

    @Override // pe.Z
    public c0 A() {
        return this.f38711a.A();
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f38711a.N0(source, j10);
    }

    @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38711a.close();
    }

    @Override // pe.Z, java.io.Flushable
    public void flush() {
        this.f38711a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f38711a + ')';
    }
}
