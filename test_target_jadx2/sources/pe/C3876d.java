package pe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3876d implements Z {
    @Override // pe.Z
    public c0 A() {
        return c0.f38662e;
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // pe.Z, java.io.Flushable
    public void flush() {
    }
}
