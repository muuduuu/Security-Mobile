package pe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3887o implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f38712a;

    public AbstractC3887o(b0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38712a = delegate;
    }

    @Override // pe.b0
    public c0 A() {
        return this.f38712a.A();
    }

    public final b0 a() {
        return this.f38712a;
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.f38712a.b2(sink, j10);
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38712a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f38712a + ')';
    }
}
