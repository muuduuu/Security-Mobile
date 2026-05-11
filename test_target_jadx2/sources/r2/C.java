package r2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
public class C extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private volatile byte[] f39116a;

    /* renamed from: b, reason: collision with root package name */
    private int f39117b;

    /* renamed from: c, reason: collision with root package name */
    private int f39118c;

    /* renamed from: d, reason: collision with root package name */
    private int f39119d;

    /* renamed from: e, reason: collision with root package name */
    private int f39120e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3600b f39121f;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public C(InputStream inputStream, InterfaceC3600b interfaceC3600b) {
        this(inputStream, interfaceC3600b, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f39119d;
        if (i10 != -1) {
            int i11 = this.f39120e - i10;
            int i12 = this.f39118c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f39117b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f39121f.d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f39116a = bArr2;
                    this.f39121f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f39120e - this.f39119d;
                this.f39120e = i13;
                this.f39119d = 0;
                this.f39117b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f39120e;
                if (read > 0) {
                    i14 += read;
                }
                this.f39117b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f39119d = -1;
            this.f39120e = 0;
            this.f39117b = read2;
        }
        return read2;
    }

    private static IOException d() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f39116a == null || inputStream == null) {
            throw d();
        }
        return (this.f39117b - this.f39120e) + inputStream.available();
    }

    public synchronized void b() {
        this.f39118c = this.f39116a.length;
    }

    public synchronized void c() {
        if (this.f39116a != null) {
            this.f39121f.put(this.f39116a);
            this.f39116a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f39116a != null) {
            this.f39121f.put(this.f39116a);
            this.f39116a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f39118c = Math.max(this.f39118c, i10);
        this.f39119d = this.f39120e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f39116a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.f39120e >= this.f39117b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f39116a && (bArr = this.f39116a) == null) {
            throw d();
        }
        int i10 = this.f39117b;
        int i11 = this.f39120e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f39120e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f39116a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f39119d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f39120e + " markLimit: " + this.f39118c);
        }
        this.f39120e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f39116a;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i10 = this.f39117b;
        int i11 = this.f39120e;
        if (i10 - i11 >= j10) {
            this.f39120e = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f39120e = i10;
        if (this.f39119d == -1 || j10 > this.f39118c) {
            long skip = inputStream.skip(j10 - j11);
            if (skip > 0) {
                this.f39119d = -1;
            }
            return j11 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f39117b;
        int i13 = this.f39120e;
        if (i12 - i13 >= j10 - j11) {
            this.f39120e = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f39120e = i12;
        return j12;
    }

    C(InputStream inputStream, InterfaceC3600b interfaceC3600b, int i10) {
        super(inputStream);
        this.f39119d = -1;
        this.f39121f = interfaceC3600b;
        this.f39116a = (byte[]) interfaceC3600b.d(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f39116a;
        if (bArr2 == null) {
            throw d();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f39120e;
            int i15 = this.f39117b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f39120e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f39119d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f39116a && (bArr2 = this.f39116a) == null) {
                        throw d();
                    }
                    int i17 = this.f39117b;
                    int i18 = this.f39120e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f39120e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw d();
        }
    }
}
