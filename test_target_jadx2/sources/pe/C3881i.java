package pe;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3881i implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3878f f38688a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f38689b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38690c;

    public C3881i(InterfaceC3878f sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f38688a = sink;
        this.f38689b = deflater;
    }

    private final void a(boolean z10) {
        W A02;
        int deflate;
        C3877e m10 = this.f38688a.m();
        while (true) {
            A02 = m10.A0(1);
            if (z10) {
                try {
                    Deflater deflater = this.f38689b;
                    byte[] bArr = A02.f38629a;
                    int i10 = A02.f38631c;
                    deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f38689b;
                byte[] bArr2 = A02.f38629a;
                int i11 = A02.f38631c;
                deflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (deflate > 0) {
                A02.f38631c += deflate;
                m10.i0(m10.size() + deflate);
                this.f38688a.B0();
            } else if (this.f38689b.needsInput()) {
                break;
            }
        }
        if (A02.f38630b == A02.f38631c) {
            m10.f38666a = A02.b();
            X.b(A02);
        }
    }

    @Override // pe.Z
    public c0 A() {
        return this.f38688a.A();
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC3874b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            W w10 = source.f38666a;
            Intrinsics.d(w10);
            int min = (int) Math.min(j10, w10.f38631c - w10.f38630b);
            this.f38689b.setInput(w10.f38629a, w10.f38630b, min);
            a(false);
            long j11 = min;
            source.i0(source.size() - j11);
            int i10 = w10.f38630b + min;
            w10.f38630b = i10;
            if (i10 == w10.f38631c) {
                source.f38666a = w10.b();
                X.b(w10);
            }
            j10 -= j11;
        }
    }

    public final void b() {
        this.f38689b.finish();
        a(false);
    }

    @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38690c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f38689b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f38688a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f38690c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // pe.Z, java.io.Flushable
    public void flush() {
        a(true);
        this.f38688a.flush();
    }

    public String toString() {
        return "DeflaterSink(" + this.f38688a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3881i(Z sink, Deflater deflater) {
        this(M.b(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
