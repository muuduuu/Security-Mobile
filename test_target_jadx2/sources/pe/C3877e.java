package pe;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.conscrypt.BuildConfig;

/* renamed from: pe.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3877e implements InterfaceC3879g, InterfaceC3878f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public W f38666a;

    /* renamed from: b, reason: collision with root package name */
    private long f38667b;

    /* renamed from: pe.e$a */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public C3877e f38668a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f38669b;

        /* renamed from: c, reason: collision with root package name */
        private W f38670c;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f38672e;

        /* renamed from: d, reason: collision with root package name */
        public long f38671d = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f38673f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f38674g = -1;

        public final W a() {
            return this.f38670c;
        }

        public final int b() {
            long j10 = this.f38671d;
            C3877e c3877e = this.f38668a;
            Intrinsics.d(c3877e);
            if (j10 == c3877e.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f38671d;
            return d(j11 == -1 ? 0L : j11 + (this.f38674g - this.f38673f));
        }

        public final long c(long j10) {
            C3877e c3877e = this.f38668a;
            if (c3877e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f38669b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c3877e.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    W w10 = c3877e.f38666a;
                    Intrinsics.d(w10);
                    W w11 = w10.f38635g;
                    Intrinsics.d(w11);
                    int i10 = w11.f38631c;
                    long j12 = i10 - w11.f38630b;
                    if (j12 > j11) {
                        w11.f38631c = i10 - ((int) j11);
                        break;
                    }
                    c3877e.f38666a = w11.b();
                    X.b(w11);
                    j11 -= j12;
                }
                e(null);
                this.f38671d = j10;
                this.f38672e = null;
                this.f38673f = -1;
                this.f38674g = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    W A02 = c3877e.A0(1);
                    int min = (int) Math.min(j13, 8192 - A02.f38631c);
                    A02.f38631c += min;
                    j13 -= min;
                    if (z10) {
                        e(A02);
                        this.f38671d = size;
                        this.f38672e = A02.f38629a;
                        int i11 = A02.f38631c;
                        this.f38673f = i11 - min;
                        this.f38674g = i11;
                        z10 = false;
                    }
                }
            }
            c3877e.i0(j10);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f38668a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f38668a = null;
            e(null);
            this.f38671d = -1L;
            this.f38672e = null;
            this.f38673f = -1;
            this.f38674g = -1;
        }

        public final int d(long j10) {
            W w10;
            C3877e c3877e = this.f38668a;
            if (c3877e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > c3877e.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c3877e.size());
            }
            if (j10 == -1 || j10 == c3877e.size()) {
                e(null);
                this.f38671d = j10;
                this.f38672e = null;
                this.f38673f = -1;
                this.f38674g = -1;
                return -1;
            }
            long size = c3877e.size();
            W w11 = c3877e.f38666a;
            long j11 = 0;
            if (a() != null) {
                long j12 = this.f38671d;
                int i10 = this.f38673f;
                Intrinsics.d(a());
                long j13 = j12 - (i10 - r9.f38630b);
                if (j13 > j10) {
                    w10 = w11;
                    w11 = a();
                    size = j13;
                } else {
                    w10 = a();
                    j11 = j13;
                }
            } else {
                w10 = w11;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    Intrinsics.d(w10);
                    int i11 = w10.f38631c;
                    int i12 = w10.f38630b;
                    if (j10 < (i11 - i12) + j11) {
                        break;
                    }
                    j11 += i11 - i12;
                    w10 = w10.f38634f;
                }
            } else {
                while (size > j10) {
                    Intrinsics.d(w11);
                    w11 = w11.f38635g;
                    Intrinsics.d(w11);
                    size -= w11.f38631c - w11.f38630b;
                }
                j11 = size;
                w10 = w11;
            }
            if (this.f38669b) {
                Intrinsics.d(w10);
                if (w10.f38632d) {
                    W f10 = w10.f();
                    if (c3877e.f38666a == w10) {
                        c3877e.f38666a = f10;
                    }
                    w10 = w10.c(f10);
                    W w12 = w10.f38635g;
                    Intrinsics.d(w12);
                    w12.b();
                }
            }
            e(w10);
            this.f38671d = j10;
            Intrinsics.d(w10);
            this.f38672e = w10.f38629a;
            int i13 = w10.f38630b + ((int) (j10 - j11));
            this.f38673f = i13;
            int i14 = w10.f38631c;
            this.f38674g = i14;
            return i14 - i13;
        }

        public final void e(W w10) {
            this.f38670c = w10;
        }
    }

    /* renamed from: pe.e$c */
    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return C3877e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C3877e.this.q0(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            C3877e.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a H(C3877e c3877e, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC3874b.d();
        }
        return c3877e.C(aVar);
    }

    @Override // pe.b0
    public c0 A() {
        return c0.f38662e;
    }

    public final W A0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        W w10 = this.f38666a;
        if (w10 != null) {
            Intrinsics.d(w10);
            W w11 = w10.f38635g;
            Intrinsics.d(w11);
            return (w11.f38631c + i10 > 8192 || !w11.f38633e) ? w11.c(X.c()) : w11;
        }
        W c10 = X.c();
        this.f38666a = c10;
        c10.f38635g = c10;
        c10.f38634f = c10;
        return c10;
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: A1, reason: merged with bridge method [inline-methods] */
    public C3877e h1(long j10) {
        if (j10 == 0) {
            return q0(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        W A02 = A0(i10);
        byte[] bArr = A02.f38629a;
        int i11 = A02.f38631c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = qe.a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        A02.f38631c += i10;
        i0(size() + i10);
        return this;
    }

    @Override // pe.InterfaceC3879g
    public byte[] B1(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    public final a C(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return qe.a.a(this, unsafeCursor);
    }

    @Override // pe.InterfaceC3879g
    public long C0() {
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z11 = false;
        do {
            W w10 = this.f38666a;
            Intrinsics.d(w10);
            byte[] bArr = w10.f38629a;
            int i11 = w10.f38630b;
            int i12 = w10.f38631c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i13 < j11)) {
                        C3877e q02 = new C3877e().V1(j10).q0(b10);
                        if (!z10) {
                            q02.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + q02.F1());
                    }
                    j10 = (j10 * 10) + i13;
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f38666a = w10.b();
                X.b(w10);
            } else {
                w10.f38630b = i11;
            }
            if (z11) {
                break;
            }
        } while (this.f38666a != null);
        i0(size() - i10);
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j10 : -j10;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + AbstractC3874b.k(p(0L)));
    }

    @Override // pe.InterfaceC3879g
    public boolean D0(long j10, C3880h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return y(j10, bytes, 0, bytes.L());
    }

    @Override // pe.InterfaceC3879g
    public String F0(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long q10 = q((byte) 10, 0L, j11);
        if (q10 != -1) {
            return qe.a.d(this, q10);
        }
        if (j11 < size() && p(j11 - 1) == 13 && p(j11) == 10) {
            return qe.a.d(this, j11);
        }
        C3877e c3877e = new C3877e();
        l(c3877e, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c3877e.K().u() + (char) 8230);
    }

    @Override // pe.InterfaceC3879g
    public String F1() {
        return N(this.f38667b, Charsets.UTF_8);
    }

    @Override // pe.InterfaceC3879g
    public short I1() {
        return AbstractC3874b.j(readShort());
    }

    @Override // pe.InterfaceC3879g
    public long J1(Z sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.N0(this, size);
        }
        return size;
    }

    public C3880h K() {
        return Y(size());
    }

    @Override // pe.InterfaceC3879g
    public long L1() {
        return AbstractC3874b.i(readLong());
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public C3877e l0(int i10) {
        W A02 = A0(4);
        byte[] bArr = A02.f38629a;
        int i11 = A02.f38631c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        A02.f38631c = i11 + 4;
        i0(size() + 4);
        return this;
    }

    public String N(long j10, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f38667b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return BuildConfig.FLAVOR;
        }
        W w10 = this.f38666a;
        Intrinsics.d(w10);
        int i10 = w10.f38630b;
        if (i10 + j10 > w10.f38631c) {
            return new String(B1(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(w10.f38629a, i10, i11, charset);
        int i12 = w10.f38630b + i11;
        w10.f38630b = i12;
        this.f38667b -= j10;
        if (i12 == w10.f38631c) {
            this.f38666a = w10.b();
            X.b(w10);
        }
        return str;
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        W w10;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC3874b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            W w11 = source.f38666a;
            Intrinsics.d(w11);
            int i10 = w11.f38631c;
            Intrinsics.d(source.f38666a);
            if (j10 < i10 - r1.f38630b) {
                W w12 = this.f38666a;
                if (w12 != null) {
                    Intrinsics.d(w12);
                    w10 = w12.f38635g;
                } else {
                    w10 = null;
                }
                if (w10 != null && w10.f38633e) {
                    if ((w10.f38631c + j10) - (w10.f38632d ? 0 : w10.f38630b) <= 8192) {
                        W w13 = source.f38666a;
                        Intrinsics.d(w13);
                        w13.g(w10, (int) j10);
                        source.i0(source.size() - j10);
                        i0(size() + j10);
                        return;
                    }
                }
                W w14 = source.f38666a;
                Intrinsics.d(w14);
                source.f38666a = w14.e((int) j10);
            }
            W w15 = source.f38666a;
            Intrinsics.d(w15);
            long j11 = w15.f38631c - w15.f38630b;
            source.f38666a = w15.b();
            W w16 = this.f38666a;
            if (w16 == null) {
                this.f38666a = w15;
                w15.f38635g = w15;
                w15.f38634f = w15;
            } else {
                Intrinsics.d(w16);
                W w17 = w16.f38635g;
                Intrinsics.d(w17);
                w17.c(w15).a();
            }
            source.i0(source.size() - j11);
            i0(size() + j11);
            j10 -= j11;
        }
    }

    public C3877e N1(int i10) {
        return l0(AbstractC3874b.h(i10));
    }

    @Override // pe.InterfaceC3879g
    public long O(C3880h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return s(bytes, 0L);
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C3877e Q1(C3880h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.S(this, 0, byteString.L());
        return this;
    }

    public C3877e O1(long j10) {
        W A02 = A0(8);
        byte[] bArr = A02.f38629a;
        int i10 = A02.f38631c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        A02.f38631c = i10 + 8;
        i0(size() + 8);
        return this;
    }

    public int Q() {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte p10 = p(0L);
        if ((p10 & 128) == 0) {
            i10 = p10 & Byte.MAX_VALUE;
            i12 = 0;
            i11 = 1;
        } else if ((p10 & 224) == 192) {
            i10 = p10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((p10 & 240) == 224) {
            i10 = p10 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((p10 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = p10 & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + AbstractC3874b.k(p10) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte p11 = p(j11);
            if ((p11 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (p11 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Override // pe.InterfaceC3879g
    public String R(long j10) {
        return N(j10, Charsets.UTF_8);
    }

    @Override // pe.InterfaceC3879g
    public void R0(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= j10) {
            sink.N0(this, j10);
        } else {
            sink.N0(this, size());
            throw new EOFException();
        }
    }

    @Override // pe.InterfaceC3879g
    public void S1(long j10) {
        if (this.f38667b < j10) {
            throw new EOFException();
        }
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public C3877e f0(int i10) {
        W A02 = A0(2);
        byte[] bArr = A02.f38629a;
        int i11 = A02.f38631c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        A02.f38631c = i11 + 2;
        i0(size() + 2);
        return this;
    }

    @Override // pe.InterfaceC3879g
    public long W0(C3880h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return x(targetBytes, 0L);
    }

    @Override // pe.InterfaceC3878f
    public OutputStream X1() {
        return new c();
    }

    @Override // pe.InterfaceC3879g
    public C3880h Y(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C3880h(B1(j10));
        }
        C3880h z02 = z0((int) j10);
        skip(j10);
        return z02;
    }

    @Override // pe.InterfaceC3879g
    public String Y0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return N(this.f38667b, charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // pe.InterfaceC3879g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long Z1() {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            W w10 = this.f38666a;
            Intrinsics.d(w10);
            byte[] bArr = w10.f38629a;
            int i12 = w10.f38630b;
            int i13 = w10.f38631c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else if (b10 >= 65 && b10 <= 70) {
                    i10 = b10 - 55;
                } else {
                    if (i11 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC3874b.k(b10));
                    }
                    z10 = true;
                    if (i12 != i13) {
                        this.f38666a = w10.b();
                        X.b(w10);
                    } else {
                        w10.f38630b = i12;
                    }
                    if (!z10) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new C3877e().h1(j10).q0(b10).F1());
                }
                j10 = (j10 << 4) | i10;
                i12++;
                i11++;
            }
            if (i12 != i13) {
            }
            if (!z10) {
            }
        } while (this.f38666a != null);
        i0(size() - i11);
        return j10;
    }

    public final void a() {
        skip(size());
    }

    @Override // pe.InterfaceC3879g
    public InputStream a2() {
        return new b();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3877e clone() {
        return i();
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.N0(this, j10);
        return j10;
    }

    public final long d() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        W w10 = this.f38666a;
        Intrinsics.d(w10);
        W w11 = w10.f38635g;
        Intrinsics.d(w11);
        if (w11.f38631c < 8192 && w11.f38633e) {
            size -= r3 - w11.f38630b;
        }
        return size;
    }

    public C3877e e2(String string, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (Intrinsics.b(charset, Charsets.UTF_8)) {
            return e1(string, i10, i11);
        }
        String substring = string.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3877e) {
            C3877e c3877e = (C3877e) obj;
            if (size() == c3877e.size()) {
                if (size() == 0) {
                    return true;
                }
                W w10 = this.f38666a;
                Intrinsics.d(w10);
                W w11 = c3877e.f38666a;
                Intrinsics.d(w11);
                int i10 = w10.f38630b;
                int i11 = w11.f38630b;
                long j10 = 0;
                while (j10 < size()) {
                    long min = Math.min(w10.f38631c - i10, w11.f38631c - i11);
                    long j11 = 0;
                    while (j11 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (w10.f38629a[i10] == w11.f38629a[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == w10.f38631c) {
                        w10 = w10.f38634f;
                        Intrinsics.d(w10);
                        i10 = w10.f38630b;
                    }
                    if (i11 == w11.f38631c) {
                        w11 = w11.f38634f;
                        Intrinsics.d(w11);
                        i11 = w11.f38630b;
                    }
                    j10 += min;
                }
                return true;
            }
        }
        return false;
    }

    public C3877e f2(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return e2(string, 0, string.length(), charset);
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: g2, reason: merged with bridge method [inline-methods] */
    public C3877e T0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return e1(string, 0, string.length());
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: h2, reason: merged with bridge method [inline-methods] */
    public C3877e e1(String string, int i10, int i11) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char charAt2 = string.charAt(i10);
            if (charAt2 < 128) {
                W A02 = A0(1);
                byte[] bArr = A02.f38629a;
                int i12 = A02.f38631c - i10;
                int min = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) charAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= min || (charAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt;
                }
                int i14 = A02.f38631c;
                int i15 = (i12 + i10) - i14;
                A02.f38631c = i14 + i15;
                i0(size() + i15);
            } else {
                if (charAt2 < 2048) {
                    W A03 = A0(2);
                    byte[] bArr2 = A03.f38629a;
                    int i16 = A03.f38631c;
                    bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                    A03.f38631c = i16 + 2;
                    i0(size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    W A04 = A0(3);
                    byte[] bArr3 = A04.f38629a;
                    int i17 = A04.f38631c;
                    bArr3[i17] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                    A04.f38631c = i17 + 3;
                    i0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char charAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        q0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        W A05 = A0(4);
                        byte[] bArr4 = A05.f38629a;
                        int i20 = A05.f38631c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        A05.f38631c = i20 + 4;
                        i0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public int hashCode() {
        W w10 = this.f38666a;
        if (w10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = w10.f38631c;
            for (int i12 = w10.f38630b; i12 < i11; i12++) {
                i10 = (i10 * 31) + w10.f38629a[i12];
            }
            w10 = w10.f38634f;
            Intrinsics.d(w10);
        } while (w10 != this.f38666a);
        return i10;
    }

    public final C3877e i() {
        C3877e c3877e = new C3877e();
        if (size() != 0) {
            W w10 = this.f38666a;
            Intrinsics.d(w10);
            W d10 = w10.d();
            c3877e.f38666a = d10;
            d10.f38635g = d10;
            d10.f38634f = d10;
            for (W w11 = w10.f38634f; w11 != w10; w11 = w11.f38634f) {
                W w12 = d10.f38635g;
                Intrinsics.d(w12);
                Intrinsics.d(w11);
                w12.c(w11.d());
            }
            c3877e.i0(size());
        }
        return c3877e;
    }

    public final void i0(long j10) {
        this.f38667b = j10;
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: i2, reason: merged with bridge method [inline-methods] */
    public C3877e g0(int i10) {
        if (i10 < 128) {
            q0(i10);
        } else if (i10 < 2048) {
            W A02 = A0(2);
            byte[] bArr = A02.f38629a;
            int i11 = A02.f38631c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            A02.f38631c = i11 + 2;
            i0(size() + 2);
        } else if (55296 <= i10 && i10 < 57344) {
            q0(63);
        } else if (i10 < 65536) {
            W A03 = A0(3);
            byte[] bArr2 = A03.f38629a;
            int i12 = A03.f38631c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            A03.f38631c = i12 + 3;
            i0(size() + 3);
        } else {
            if (i10 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC3874b.l(i10));
            }
            W A04 = A0(4);
            byte[] bArr3 = A04.f38629a;
            int i13 = A04.f38631c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            A04.f38631c = i13 + 4;
            i0(size() + 4);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // pe.InterfaceC3879g
    public int k1(P options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int f10 = qe.a.f(this, options, false, 2, null);
        if (f10 == -1) {
            return -1;
        }
        skip(options.j()[f10].L());
        return f10;
    }

    public final C3877e l(C3877e out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        AbstractC3874b.b(size(), j10, j11);
        if (j11 != 0) {
            out.i0(out.size() + j11);
            W w10 = this.f38666a;
            while (true) {
                Intrinsics.d(w10);
                int i10 = w10.f38631c;
                int i11 = w10.f38630b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                w10 = w10.f38634f;
            }
            while (j11 > 0) {
                Intrinsics.d(w10);
                W d10 = w10.d();
                int i12 = d10.f38630b + ((int) j10);
                d10.f38630b = i12;
                d10.f38631c = Math.min(i12 + ((int) j11), d10.f38631c);
                W w11 = out.f38666a;
                if (w11 == null) {
                    d10.f38635g = d10;
                    d10.f38634f = d10;
                    out.f38666a = d10;
                } else {
                    Intrinsics.d(w11);
                    W w12 = w11.f38635g;
                    Intrinsics.d(w12);
                    w12.c(d10);
                }
                j11 -= d10.f38631c - d10.f38630b;
                w10 = w10.f38634f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C3877e G1(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // pe.InterfaceC3879g
    public byte[] n0() {
        return B1(size());
    }

    @Override // pe.InterfaceC3879g
    public boolean n1(long j10) {
        return this.f38667b >= j10;
    }

    public final C3880h o0() {
        if (size() <= 2147483647L) {
            return z0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final byte p(long j10) {
        AbstractC3874b.b(size(), j10, 1L);
        W w10 = this.f38666a;
        if (w10 == null) {
            Intrinsics.d(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                w10 = w10.f38635g;
                Intrinsics.d(w10);
                size -= w10.f38631c - w10.f38630b;
            }
            Intrinsics.d(w10);
            return w10.f38629a[(int) ((w10.f38630b + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (w10.f38631c - w10.f38630b) + j11;
            if (j12 > j10) {
                Intrinsics.d(w10);
                return w10.f38629a[(int) ((w10.f38630b + j10) - j11)];
            }
            w10 = w10.f38634f;
            Intrinsics.d(w10);
            j11 = j12;
        }
    }

    @Override // pe.InterfaceC3879g
    public boolean p0() {
        return this.f38667b == 0;
    }

    @Override // pe.InterfaceC3879g
    public InterfaceC3879g peek() {
        return M.c(new T(this));
    }

    public long q(byte b10, long j10, long j11) {
        W w10;
        int i10;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (w10 = this.f38666a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j12 = size();
            while (j12 > j10) {
                w10 = w10.f38635g;
                Intrinsics.d(w10);
                j12 -= w10.f38631c - w10.f38630b;
            }
            while (j12 < j11) {
                byte[] bArr = w10.f38629a;
                int min = (int) Math.min(w10.f38631c, (w10.f38630b + j11) - j12);
                i10 = (int) ((w10.f38630b + j10) - j12);
                while (i10 < min) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                j12 += w10.f38631c - w10.f38630b;
                w10 = w10.f38634f;
                Intrinsics.d(w10);
                j10 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = (w10.f38631c - w10.f38630b) + j12;
            if (j13 > j10) {
                break;
            }
            w10 = w10.f38634f;
            Intrinsics.d(w10);
            j12 = j13;
        }
        while (j12 < j11) {
            byte[] bArr2 = w10.f38629a;
            int min2 = (int) Math.min(w10.f38631c, (w10.f38630b + j11) - j12);
            i10 = (int) ((w10.f38630b + j10) - j12);
            while (i10 < min2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            j12 += w10.f38631c - w10.f38630b;
            w10 = w10.f38634f;
            Intrinsics.d(w10);
            j10 = j12;
        }
        return -1L;
        return (i10 - w10.f38630b) + j12;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        W w10 = this.f38666a;
        if (w10 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), w10.f38631c - w10.f38630b);
        sink.put(w10.f38629a, w10.f38630b, min);
        int i10 = w10.f38630b + min;
        w10.f38630b = i10;
        this.f38667b -= min;
        if (i10 == w10.f38631c) {
            this.f38666a = w10.b();
            X.b(w10);
        }
        return min;
    }

    @Override // pe.InterfaceC3879g
    public byte readByte() {
        if (size() == 0) {
            throw new EOFException();
        }
        W w10 = this.f38666a;
        Intrinsics.d(w10);
        int i10 = w10.f38630b;
        int i11 = w10.f38631c;
        int i12 = i10 + 1;
        byte b10 = w10.f38629a[i10];
        i0(size() - 1);
        if (i12 == i11) {
            this.f38666a = w10.b();
            X.b(w10);
        } else {
            w10.f38630b = i12;
        }
        return b10;
    }

    @Override // pe.InterfaceC3879g
    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int z10 = z(sink, i10, sink.length - i10);
            if (z10 == -1) {
                throw new EOFException();
            }
            i10 += z10;
        }
    }

    @Override // pe.InterfaceC3879g
    public int readInt() {
        if (size() < 4) {
            throw new EOFException();
        }
        W w10 = this.f38666a;
        Intrinsics.d(w10);
        int i10 = w10.f38630b;
        int i11 = w10.f38631c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = w10.f38629a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        i0(size() - 4);
        if (i14 == i11) {
            this.f38666a = w10.b();
            X.b(w10);
        } else {
            w10.f38630b = i14;
        }
        return i15;
    }

    @Override // pe.InterfaceC3879g
    public long readLong() {
        if (size() < 8) {
            throw new EOFException();
        }
        W w10 = this.f38666a;
        Intrinsics.d(w10);
        int i10 = w10.f38630b;
        int i11 = w10.f38631c;
        if (i11 - i10 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = w10.f38629a;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        i0(size() - 8);
        if (i13 == i11) {
            this.f38666a = w10.b();
            X.b(w10);
        } else {
            w10.f38630b = i13;
        }
        return j11;
    }

    @Override // pe.InterfaceC3879g
    public short readShort() {
        if (size() < 2) {
            throw new EOFException();
        }
        W w10 = this.f38666a;
        Intrinsics.d(w10);
        int i10 = w10.f38630b;
        int i11 = w10.f38631c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = w10.f38629a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        i0(size() - 2);
        if (i14 == i11) {
            this.f38666a = w10.b();
            X.b(w10);
        } else {
            w10.f38630b = i14;
        }
        return (short) i15;
    }

    public long s(C3880h bytes, long j10) {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.L() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        W w10 = this.f38666a;
        if (w10 != null) {
            if (size() - j11 < j11) {
                j12 = size();
                while (j12 > j11) {
                    w10 = w10.f38635g;
                    Intrinsics.d(w10);
                    j12 -= w10.f38631c - w10.f38630b;
                }
                byte[] y10 = bytes.y();
                byte b10 = y10[0];
                int L10 = bytes.L();
                long size = (size() - L10) + 1;
                while (j12 < size) {
                    byte[] bArr = w10.f38629a;
                    long j13 = size;
                    int min = (int) Math.min(w10.f38631c, (w10.f38630b + size) - j12);
                    i10 = (int) ((w10.f38630b + j11) - j12);
                    while (i10 < min) {
                        if (bArr[i10] == b10 && qe.a.c(w10, i10 + 1, y10, 1, L10)) {
                            return (i10 - w10.f38630b) + j12;
                        }
                        i10++;
                    }
                    j12 += w10.f38631c - w10.f38630b;
                    w10 = w10.f38634f;
                    Intrinsics.d(w10);
                    j11 = j12;
                    size = j13;
                }
            } else {
                while (true) {
                    long j14 = (w10.f38631c - w10.f38630b) + j12;
                    if (j14 > j11) {
                        break;
                    }
                    w10 = w10.f38634f;
                    Intrinsics.d(w10);
                    j12 = j14;
                }
                byte[] y11 = bytes.y();
                byte b11 = y11[0];
                int L11 = bytes.L();
                long size2 = (size() - L11) + 1;
                while (j12 < size2) {
                    byte[] bArr2 = w10.f38629a;
                    int min2 = (int) Math.min(w10.f38631c, (w10.f38630b + size2) - j12);
                    i10 = (int) ((w10.f38630b + j11) - j12);
                    while (i10 < min2) {
                        if (bArr2[i10] == b11 && qe.a.c(w10, i10 + 1, y11, 1, L11)) {
                            return (i10 - w10.f38630b) + j12;
                        }
                        i10++;
                    }
                    j12 += w10.f38631c - w10.f38630b;
                    w10 = w10.f38634f;
                    Intrinsics.d(w10);
                    j11 = j12;
                }
            }
        }
        return -1L;
    }

    @Override // pe.InterfaceC3878f
    public long s0(b0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long b22 = source.b2(this, 8192L);
            if (b22 == -1) {
                return j10;
            }
            j10 += b22;
        }
    }

    public final long size() {
        return this.f38667b;
    }

    @Override // pe.InterfaceC3879g
    public void skip(long j10) {
        while (j10 > 0) {
            W w10 = this.f38666a;
            if (w10 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, w10.f38631c - w10.f38630b);
            long j11 = min;
            i0(size() - j11);
            j10 -= j11;
            int i10 = w10.f38630b + min;
            w10.f38630b = i10;
            if (i10 == w10.f38631c) {
                this.f38666a = w10.b();
                X.b(w10);
            }
        }
    }

    public String toString() {
        return o0().toString();
    }

    @Override // pe.InterfaceC3879g
    public String u1() {
        return F0(Long.MAX_VALUE);
    }

    @Override // pe.InterfaceC3879g
    public int w1() {
        return AbstractC3874b.h(readInt());
    }

    public long x(C3880h targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        W w10 = this.f38666a;
        if (w10 == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j11 = size();
            while (j11 > j10) {
                w10 = w10.f38635g;
                Intrinsics.d(w10);
                j11 -= w10.f38631c - w10.f38630b;
            }
            if (targetBytes.L() == 2) {
                byte p10 = targetBytes.p(0);
                byte p11 = targetBytes.p(1);
                while (j11 < size()) {
                    byte[] bArr = w10.f38629a;
                    i10 = (int) ((w10.f38630b + j10) - j11);
                    int i12 = w10.f38631c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 != p10 && b10 != p11) {
                            i10++;
                        }
                        i11 = w10.f38630b;
                    }
                    j11 += w10.f38631c - w10.f38630b;
                    w10 = w10.f38634f;
                    Intrinsics.d(w10);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] y10 = targetBytes.y();
            while (j11 < size()) {
                byte[] bArr2 = w10.f38629a;
                i10 = (int) ((w10.f38630b + j10) - j11);
                int i13 = w10.f38631c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : y10) {
                        if (b11 == b12) {
                            i11 = w10.f38630b;
                        }
                    }
                    i10++;
                }
                j11 += w10.f38631c - w10.f38630b;
                w10 = w10.f38634f;
                Intrinsics.d(w10);
                j10 = j11;
            }
            return -1L;
        }
        while (true) {
            long j12 = (w10.f38631c - w10.f38630b) + j11;
            if (j12 > j10) {
                break;
            }
            w10 = w10.f38634f;
            Intrinsics.d(w10);
            j11 = j12;
        }
        if (targetBytes.L() == 2) {
            byte p12 = targetBytes.p(0);
            byte p13 = targetBytes.p(1);
            while (j11 < size()) {
                byte[] bArr3 = w10.f38629a;
                i10 = (int) ((w10.f38630b + j10) - j11);
                int i14 = w10.f38631c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 != p12 && b13 != p13) {
                        i10++;
                    }
                    i11 = w10.f38630b;
                }
                j11 += w10.f38631c - w10.f38630b;
                w10 = w10.f38634f;
                Intrinsics.d(w10);
                j10 = j11;
            }
            return -1L;
        }
        byte[] y11 = targetBytes.y();
        while (j11 < size()) {
            byte[] bArr4 = w10.f38629a;
            i10 = (int) ((w10.f38630b + j10) - j11);
            int i15 = w10.f38631c;
            while (i10 < i15) {
                byte b14 = bArr4[i10];
                for (byte b15 : y11) {
                    if (b14 == b15) {
                        i11 = w10.f38630b;
                    }
                }
                i10++;
            }
            j11 += w10.f38631c - w10.f38630b;
            w10 = w10.f38634f;
            Intrinsics.d(w10);
            j10 = j11;
        }
        return -1L;
        return (i10 - i11) + j11;
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C3877e write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        AbstractC3874b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            W A02 = A0(1);
            int min = Math.min(i12 - i10, 8192 - A02.f38631c);
            int i13 = i10 + min;
            AbstractC3574i.e(source, A02.f38629a, A02.f38631c, i10, i13);
            A02.f38631c += min;
            i10 = i13;
        }
        i0(size() + j10);
        return this;
    }

    public boolean y(long j10, C3880h bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.L() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (p(i12 + j10) != bytes.p(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public C3877e q0(int i10) {
        W A02 = A0(1);
        byte[] bArr = A02.f38629a;
        int i11 = A02.f38631c;
        A02.f38631c = i11 + 1;
        bArr[i11] = (byte) i10;
        i0(size() + 1);
        return this;
    }

    public int z(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC3874b.b(sink.length, i10, i11);
        W w10 = this.f38666a;
        if (w10 == null) {
            return -1;
        }
        int min = Math.min(i11, w10.f38631c - w10.f38630b);
        byte[] bArr = w10.f38629a;
        int i12 = w10.f38630b;
        AbstractC3574i.e(bArr, sink, i10, i12, i12 + min);
        w10.f38630b += min;
        i0(size() - min);
        if (w10.f38630b == w10.f38631c) {
            this.f38666a = w10.b();
            X.b(w10);
        }
        return min;
    }

    public final C3880h z0(int i10) {
        if (i10 == 0) {
            return C3880h.f38684e;
        }
        AbstractC3874b.b(size(), 0L, i10);
        W w10 = this.f38666a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.d(w10);
            int i14 = w10.f38631c;
            int i15 = w10.f38630b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            w10 = w10.f38634f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        W w11 = this.f38666a;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.d(w11);
            bArr[i16] = w11.f38629a;
            i11 += w11.f38631c - w11.f38630b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = w11.f38630b;
            w11.f38632d = true;
            i16++;
            w11 = w11.f38634f;
        }
        return new Y(bArr, iArr);
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public C3877e V1(long j10) {
        boolean z10;
        if (j10 == 0) {
            return q0(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return T0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        W A02 = A0(i10);
        byte[] bArr = A02.f38629a;
        int i11 = A02.f38631c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = qe.a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        A02.f38631c += i10;
        i0(size() + i10);
        return this;
    }

    /* renamed from: pe.e$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C3877e.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C3877e.this.size() > 0) {
                return C3877e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C3877e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C3877e.this.z(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            W A02 = A0(1);
            int min = Math.min(i10, 8192 - A02.f38631c);
            source.get(A02.f38629a, A02.f38631c, min);
            i10 -= min;
            A02.f38631c += min;
        }
        this.f38667b += remaining;
        return remaining;
    }

    @Override // pe.InterfaceC3879g
    public C3877e X() {
        return this;
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // pe.InterfaceC3878f, pe.Z, java.io.Flushable
    public void flush() {
    }

    @Override // pe.InterfaceC3879g
    public C3877e m() {
        return this;
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3877e e0() {
        return this;
    }

    @Override // pe.InterfaceC3878f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3877e B0() {
        return this;
    }
}
