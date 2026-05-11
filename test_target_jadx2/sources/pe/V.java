package pe;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class V implements InterfaceC3879g {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f38624a;

    /* renamed from: b, reason: collision with root package name */
    public final C3877e f38625b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38626c;

    public V(b0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f38624a = source;
        this.f38625b = new C3877e();
    }

    @Override // pe.b0
    public c0 A() {
        return this.f38624a.A();
    }

    @Override // pe.InterfaceC3879g
    public byte[] B1(long j10) {
        S1(j10);
        return this.f38625b.B1(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // pe.InterfaceC3879g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long C0() {
        S1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!n1(j11)) {
                break;
            }
            byte p10 = this.f38625b.p(j10);
            if ((p10 < 48 || p10 > 57) && !(j10 == 0 && p10 == 45)) {
                break;
            }
            j10 = j11;
        }
        return this.f38625b.C0();
    }

    @Override // pe.InterfaceC3879g
    public boolean D0(long j10, C3880h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return e(j10, bytes, 0, bytes.L());
    }

    @Override // pe.InterfaceC3879g
    public String F0(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long b10 = b((byte) 10, 0L, j11);
        if (b10 != -1) {
            return qe.a.d(this.f38625b, b10);
        }
        if (j11 < Long.MAX_VALUE && n1(j11) && this.f38625b.p(j11 - 1) == 13 && n1(1 + j11) && this.f38625b.p(j11) == 10) {
            return qe.a.d(this.f38625b, j11);
        }
        C3877e c3877e = new C3877e();
        C3877e c3877e2 = this.f38625b;
        c3877e2.l(c3877e, 0L, Math.min(32, c3877e2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f38625b.size(), j10) + " content=" + c3877e.K().u() + (char) 8230);
    }

    @Override // pe.InterfaceC3879g
    public String F1() {
        this.f38625b.s0(this.f38624a);
        return this.f38625b.F1();
    }

    @Override // pe.InterfaceC3879g
    public short I1() {
        S1(2L);
        return this.f38625b.I1();
    }

    @Override // pe.InterfaceC3879g
    public long J1(Z sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f38624a.b2(this.f38625b, 8192L) != -1) {
            long d10 = this.f38625b.d();
            if (d10 > 0) {
                j10 += d10;
                sink.N0(this.f38625b, d10);
            }
        }
        if (this.f38625b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f38625b.size();
        C3877e c3877e = this.f38625b;
        sink.N0(c3877e, c3877e.size());
        return size;
    }

    @Override // pe.InterfaceC3879g
    public long L1() {
        S1(8L);
        return this.f38625b.L1();
    }

    @Override // pe.InterfaceC3879g
    public long O(C3880h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return c(bytes, 0L);
    }

    @Override // pe.InterfaceC3879g
    public String R(long j10) {
        S1(j10);
        return this.f38625b.R(j10);
    }

    @Override // pe.InterfaceC3879g
    public void R0(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            S1(j10);
            this.f38625b.R0(sink, j10);
        } catch (EOFException e10) {
            sink.s0(this.f38625b);
            throw e10;
        }
    }

    @Override // pe.InterfaceC3879g
    public void S1(long j10) {
        if (!n1(j10)) {
            throw new EOFException();
        }
    }

    @Override // pe.InterfaceC3879g
    public long W0(C3880h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return d(targetBytes, 0L);
    }

    @Override // pe.InterfaceC3879g
    public C3877e X() {
        return this.f38625b;
    }

    @Override // pe.InterfaceC3879g
    public C3880h Y(long j10) {
        S1(j10);
        return this.f38625b.Y(j10);
    }

    @Override // pe.InterfaceC3879g
    public String Y0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f38625b.s0(this.f38624a);
        return this.f38625b.Y0(charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // pe.InterfaceC3879g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long Z1() {
        S1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!n1(i11)) {
                break;
            }
            byte p10 = this.f38625b.p(i10);
            if ((p10 < 48 || p10 > 57) && ((p10 < 97 || p10 > 102) && (p10 < 65 || p10 > 70))) {
                break;
            }
            i10 = i11;
        }
        return this.f38625b.Z1();
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    @Override // pe.InterfaceC3879g
    public InputStream a2() {
        return new a();
    }

    public long b(byte b10, long j10, long j11) {
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long q10 = this.f38625b.q(b10, j10, j11);
            if (q10 != -1) {
                return q10;
            }
            long size = this.f38625b.size();
            if (size >= j11 || this.f38624a.b2(this.f38625b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        if (this.f38625b.size() == 0 && this.f38624a.b2(this.f38625b, 8192L) == -1) {
            return -1L;
        }
        return this.f38625b.b2(sink, Math.min(j10, this.f38625b.size()));
    }

    public long c(C3880h bytes, long j10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long s10 = this.f38625b.s(bytes, j10);
            if (s10 != -1) {
                return s10;
            }
            long size = this.f38625b.size();
            if (this.f38624a.b2(this.f38625b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - bytes.L()) + 1);
        }
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38626c) {
            return;
        }
        this.f38626c = true;
        this.f38624a.close();
        this.f38625b.a();
    }

    public long d(C3880h targetBytes, long j10) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long x10 = this.f38625b.x(targetBytes, j10);
            if (x10 != -1) {
                return x10;
            }
            long size = this.f38625b.size();
            if (this.f38624a.b2(this.f38625b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    public boolean e(long j10, C3880h bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.L() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = i12 + j10;
            if (!n1(1 + j11) || this.f38625b.p(j11) != bytes.p(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f38626c;
    }

    @Override // pe.InterfaceC3879g
    public int k1(P options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int e10 = qe.a.e(this.f38625b, options, true);
            if (e10 != -2) {
                if (e10 != -1) {
                    this.f38625b.skip(options.j()[e10].L());
                    return e10;
                }
            } else if (this.f38624a.b2(this.f38625b, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // pe.InterfaceC3879g
    public C3877e m() {
        return this.f38625b;
    }

    @Override // pe.InterfaceC3879g
    public byte[] n0() {
        this.f38625b.s0(this.f38624a);
        return this.f38625b.n0();
    }

    @Override // pe.InterfaceC3879g
    public boolean n1(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        while (this.f38625b.size() < j10) {
            if (this.f38624a.b2(this.f38625b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // pe.InterfaceC3879g
    public boolean p0() {
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        return this.f38625b.p0() && this.f38624a.b2(this.f38625b, 8192L) == -1;
    }

    @Override // pe.InterfaceC3879g
    public InterfaceC3879g peek() {
        return M.c(new T(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f38625b.size() == 0 && this.f38624a.b2(this.f38625b, 8192L) == -1) {
            return -1;
        }
        return this.f38625b.read(sink);
    }

    @Override // pe.InterfaceC3879g
    public byte readByte() {
        S1(1L);
        return this.f38625b.readByte();
    }

    @Override // pe.InterfaceC3879g
    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            S1(sink.length);
            this.f38625b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f38625b.size() > 0) {
                C3877e c3877e = this.f38625b;
                int z10 = c3877e.z(sink, i10, (int) c3877e.size());
                if (z10 == -1) {
                    throw new AssertionError();
                }
                i10 += z10;
            }
            throw e10;
        }
    }

    @Override // pe.InterfaceC3879g
    public int readInt() {
        S1(4L);
        return this.f38625b.readInt();
    }

    @Override // pe.InterfaceC3879g
    public long readLong() {
        S1(8L);
        return this.f38625b.readLong();
    }

    @Override // pe.InterfaceC3879g
    public short readShort() {
        S1(2L);
        return this.f38625b.readShort();
    }

    @Override // pe.InterfaceC3879g
    public void skip(long j10) {
        if (this.f38626c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f38625b.size() == 0 && this.f38624a.b2(this.f38625b, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f38625b.size());
            this.f38625b.skip(min);
            j10 -= min;
        }
    }

    public String toString() {
        return "buffer(" + this.f38624a + ')';
    }

    @Override // pe.InterfaceC3879g
    public String u1() {
        return F0(Long.MAX_VALUE);
    }

    @Override // pe.InterfaceC3879g
    public int w1() {
        S1(4L);
        return this.f38625b.w1();
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            V v10 = V.this;
            if (v10.f38626c) {
                throw new IOException("closed");
            }
            return (int) Math.min(v10.f38625b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            V.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            V v10 = V.this;
            if (v10.f38626c) {
                throw new IOException("closed");
            }
            if (v10.f38625b.size() == 0) {
                V v11 = V.this;
                if (v11.f38624a.b2(v11.f38625b, 8192L) == -1) {
                    return -1;
                }
            }
            return V.this.f38625b.readByte() & 255;
        }

        public String toString() {
            return V.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!V.this.f38626c) {
                AbstractC3874b.b(data.length, i10, i11);
                if (V.this.f38625b.size() == 0) {
                    V v10 = V.this;
                    if (v10.f38624a.b2(v10.f38625b, 8192L) == -1) {
                        return -1;
                    }
                }
                return V.this.f38625b.z(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
