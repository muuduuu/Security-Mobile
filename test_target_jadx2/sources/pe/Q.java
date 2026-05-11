package pe;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class Q implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f38609a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f38610b;

    public Q(OutputStream out, c0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f38609a = out;
        this.f38610b = timeout;
    }

    @Override // pe.Z
    public c0 A() {
        return this.f38610b;
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC3874b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f38610b.f();
            W w10 = source.f38666a;
            Intrinsics.d(w10);
            int min = (int) Math.min(j10, w10.f38631c - w10.f38630b);
            this.f38609a.write(w10.f38629a, w10.f38630b, min);
            w10.f38630b += min;
            long j11 = min;
            j10 -= j11;
            source.i0(source.size() - j11);
            if (w10.f38630b == w10.f38631c) {
                source.f38666a = w10.b();
                X.b(w10);
            }
        }
    }

    @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38609a.close();
    }

    @Override // pe.Z, java.io.Flushable
    public void flush() {
        this.f38609a.flush();
    }

    public String toString() {
        return "sink(" + this.f38609a + ')';
    }
}
