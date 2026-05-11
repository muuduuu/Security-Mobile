package pe;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class U implements InterfaceC3878f {

    /* renamed from: a, reason: collision with root package name */
    public final Z f38620a;

    /* renamed from: b, reason: collision with root package name */
    public final C3877e f38621b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38622c;

    public U(Z sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f38620a = sink;
        this.f38621b = new C3877e();
    }

    @Override // pe.Z
    public c0 A() {
        return this.f38620a.A();
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f B0() {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        long d10 = this.f38621b.d();
        if (d10 > 0) {
            this.f38620a.N0(this.f38621b, d10);
        }
        return this;
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f G1(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.G1(source);
        return B0();
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.N0(source, j10);
        B0();
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f Q1(C3880h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.Q1(byteString);
        return B0();
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f T0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.T0(string);
        return B0();
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f V1(long j10) {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.V1(j10);
        return B0();
    }

    @Override // pe.InterfaceC3878f
    public OutputStream X1() {
        return new a();
    }

    public InterfaceC3878f a(int i10) {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.N1(i10);
        return B0();
    }

    @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38622c) {
            return;
        }
        try {
            if (this.f38621b.size() > 0) {
                Z z10 = this.f38620a;
                C3877e c3877e = this.f38621b;
                z10.N0(c3877e, c3877e.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f38620a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f38622c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f e0() {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f38621b.size();
        if (size > 0) {
            this.f38620a.N0(this.f38621b, size);
        }
        return this;
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f e1(String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.e1(string, i10, i11);
        return B0();
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f f0(int i10) {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.f0(i10);
        return B0();
    }

    @Override // pe.InterfaceC3878f, pe.Z, java.io.Flushable
    public void flush() {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        if (this.f38621b.size() > 0) {
            Z z10 = this.f38620a;
            C3877e c3877e = this.f38621b;
            z10.N0(c3877e, c3877e.size());
        }
        this.f38620a.flush();
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f g0(int i10) {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.g0(i10);
        return B0();
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f h1(long j10) {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.h1(j10);
        return B0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f38622c;
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f l0(int i10) {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.l0(i10);
        return B0();
    }

    @Override // pe.InterfaceC3878f
    public C3877e m() {
        return this.f38621b;
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f q0(int i10) {
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        this.f38621b.q0(i10);
        return B0();
    }

    @Override // pe.InterfaceC3878f
    public long s0(b0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long b22 = source.b2(this.f38621b, 8192L);
            if (b22 == -1) {
                return j10;
            }
            j10 += b22;
            B0();
        }
    }

    public String toString() {
        return "buffer(" + this.f38620a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f38622c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f38621b.write(source);
        B0();
        return write;
    }

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            U.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            U u10 = U.this;
            if (u10.f38622c) {
                return;
            }
            u10.flush();
        }

        public String toString() {
            return U.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            U u10 = U.this;
            if (u10.f38622c) {
                throw new IOException("closed");
            }
            u10.f38621b.q0((byte) i10);
            U.this.B0();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            U u10 = U.this;
            if (!u10.f38622c) {
                u10.f38621b.write(data, i10, i11);
                U.this.B0();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // pe.InterfaceC3878f
    public InterfaceC3878f write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f38622c) {
            this.f38621b.write(source, i10, i11);
            return B0();
        }
        throw new IllegalStateException("closed");
    }
}
