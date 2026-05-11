package pe;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class r implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private byte f38719a;

    /* renamed from: b, reason: collision with root package name */
    private final V f38720b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f38721c;

    /* renamed from: d, reason: collision with root package name */
    private final C3890s f38722d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f38723e;

    public r(b0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        V v10 = new V(source);
        this.f38720b = v10;
        Inflater inflater = new Inflater(true);
        this.f38721c = inflater;
        this.f38722d = new C3890s((InterfaceC3879g) v10, inflater);
        this.f38723e = new CRC32();
    }

    private final void a(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + StringsKt.i0(AbstractC3874b.l(i11), 8, '0') + " != expected 0x" + StringsKt.i0(AbstractC3874b.l(i10), 8, '0'));
    }

    private final void b() {
        this.f38720b.S1(10L);
        byte p10 = this.f38720b.f38625b.p(3L);
        boolean z10 = ((p10 >> 1) & 1) == 1;
        if (z10) {
            d(this.f38720b.f38625b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f38720b.readShort());
        this.f38720b.skip(8L);
        if (((p10 >> 2) & 1) == 1) {
            this.f38720b.S1(2L);
            if (z10) {
                d(this.f38720b.f38625b, 0L, 2L);
            }
            long I12 = this.f38720b.f38625b.I1() & 65535;
            this.f38720b.S1(I12);
            if (z10) {
                d(this.f38720b.f38625b, 0L, I12);
            }
            this.f38720b.skip(I12);
        }
        if (((p10 >> 3) & 1) == 1) {
            long a10 = this.f38720b.a((byte) 0);
            if (a10 == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.f38720b.f38625b, 0L, a10 + 1);
            }
            this.f38720b.skip(a10 + 1);
        }
        if (((p10 >> 4) & 1) == 1) {
            long a11 = this.f38720b.a((byte) 0);
            if (a11 == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.f38720b.f38625b, 0L, a11 + 1);
            }
            this.f38720b.skip(a11 + 1);
        }
        if (z10) {
            a("FHCRC", this.f38720b.I1(), (short) this.f38723e.getValue());
            this.f38723e.reset();
        }
    }

    private final void c() {
        a("CRC", this.f38720b.w1(), (int) this.f38723e.getValue());
        a("ISIZE", this.f38720b.w1(), (int) this.f38721c.getBytesWritten());
    }

    private final void d(C3877e c3877e, long j10, long j11) {
        W w10 = c3877e.f38666a;
        Intrinsics.d(w10);
        while (true) {
            int i10 = w10.f38631c;
            int i11 = w10.f38630b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            w10 = w10.f38634f;
            Intrinsics.d(w10);
        }
        while (j11 > 0) {
            int min = (int) Math.min(w10.f38631c - r6, j11);
            this.f38723e.update(w10.f38629a, (int) (w10.f38630b + j10), min);
            j11 -= min;
            w10 = w10.f38634f;
            Intrinsics.d(w10);
            j10 = 0;
        }
    }

    @Override // pe.b0
    public c0 A() {
        return this.f38720b.A();
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f38719a == 0) {
            b();
            this.f38719a = (byte) 1;
        }
        if (this.f38719a == 1) {
            long size = sink.size();
            long b22 = this.f38722d.b2(sink, j10);
            if (b22 != -1) {
                d(sink, size, b22);
                return b22;
            }
            this.f38719a = (byte) 2;
        }
        if (this.f38719a == 2) {
            c();
            this.f38719a = (byte) 3;
            if (!this.f38720b.p0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38722d.close();
    }
}
