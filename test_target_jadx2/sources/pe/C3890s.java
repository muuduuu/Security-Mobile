package pe;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3890s implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3879g f38724a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f38725b;

    /* renamed from: c, reason: collision with root package name */
    private int f38726c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38727d;

    public C3890s(InterfaceC3879g source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f38724a = source;
        this.f38725b = inflater;
    }

    private final void c() {
        int i10 = this.f38726c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f38725b.getRemaining();
        this.f38726c -= remaining;
        this.f38724a.skip(remaining);
    }

    @Override // pe.b0
    public c0 A() {
        return this.f38724a.A();
    }

    public final long a(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f38727d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            W A02 = sink.A0(1);
            int min = (int) Math.min(j10, 8192 - A02.f38631c);
            b();
            int inflate = this.f38725b.inflate(A02.f38629a, A02.f38631c, min);
            c();
            if (inflate > 0) {
                A02.f38631c += inflate;
                long j11 = inflate;
                sink.i0(sink.size() + j11);
                return j11;
            }
            if (A02.f38630b == A02.f38631c) {
                sink.f38666a = A02.b();
                X.b(A02);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.f38725b.needsInput()) {
            return false;
        }
        if (this.f38724a.p0()) {
            return true;
        }
        W w10 = this.f38724a.m().f38666a;
        Intrinsics.d(w10);
        int i10 = w10.f38631c;
        int i11 = w10.f38630b;
        int i12 = i10 - i11;
        this.f38726c = i12;
        this.f38725b.setInput(w10.f38629a, i11, i12);
        return false;
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long a10 = a(sink, j10);
            if (a10 > 0) {
                return a10;
            }
            if (this.f38725b.finished() || this.f38725b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f38724a.p0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38727d) {
            return;
        }
        this.f38725b.end();
        this.f38727d = true;
        this.f38724a.close();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3890s(b0 source, Inflater inflater) {
        this(M.c(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
