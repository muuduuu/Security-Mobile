package pe;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3891t implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f38728a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f38729b;

    public C3891t(InputStream input, c0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f38728a = input;
        this.f38729b = timeout;
    }

    @Override // pe.b0
    public c0 A() {
        return this.f38729b;
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f38729b.f();
            W A02 = sink.A0(1);
            int read = this.f38728a.read(A02.f38629a, A02.f38631c, (int) Math.min(j10, 8192 - A02.f38631c));
            if (read != -1) {
                A02.f38631c += read;
                long j11 = read;
                sink.i0(sink.size() + j11);
                return j11;
            }
            if (A02.f38630b != A02.f38631c) {
                return -1L;
            }
            sink.f38666a = A02.b();
            X.b(A02);
            return -1L;
        } catch (AssertionError e10) {
            if (M.d(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38728a.close();
    }

    public String toString() {
        return "source(" + this.f38728a + ')';
    }
}
