package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class o extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f29608a;

    /* renamed from: b, reason: collision with root package name */
    private long f29609b;

    /* renamed from: c, reason: collision with root package name */
    private long f29610c;

    /* renamed from: d, reason: collision with root package name */
    private long f29611d;

    /* renamed from: e, reason: collision with root package name */
    private long f29612e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29613f;

    /* renamed from: g, reason: collision with root package name */
    private int f29614g;

    o(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void d(long j10) {
        try {
            long j11 = this.f29610c;
            long j12 = this.f29609b;
            if (j11 >= j12 || j12 > this.f29611d) {
                this.f29610c = j12;
                this.f29608a.mark((int) (j10 - j12));
            } else {
                this.f29608a.reset();
                this.f29608a.mark((int) (j10 - this.f29610c));
                e(this.f29610c, this.f29609b);
            }
            this.f29611d = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    private void e(long j10, long j11) {
        while (j10 < j11) {
            long skip = this.f29608a.skip(j11 - j10);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j10 += skip;
        }
    }

    public void a(boolean z10) {
        this.f29613f = z10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f29608a.available();
    }

    public void b(long j10) {
        if (this.f29609b > this.f29611d || j10 < this.f29610c) {
            throw new IOException("Cannot reset");
        }
        this.f29608a.reset();
        e(this.f29610c, j10);
        this.f29609b = j10;
    }

    public long c(int i10) {
        long j10 = this.f29609b + i10;
        if (this.f29611d < j10) {
            d(j10);
        }
        return this.f29609b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29608a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f29612e = c(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f29608a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f29613f) {
            long j10 = this.f29609b + 1;
            long j11 = this.f29611d;
            if (j10 > j11) {
                d(j11 + this.f29614g);
            }
        }
        int read = this.f29608a.read();
        if (read != -1) {
            this.f29609b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        b(this.f29612e);
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        if (!this.f29613f) {
            long j11 = this.f29609b;
            if (j11 + j10 > this.f29611d) {
                d(j11 + j10 + this.f29614g);
            }
        }
        long skip = this.f29608a.skip(j10);
        this.f29609b += skip;
        return skip;
    }

    o(InputStream inputStream, int i10) {
        this(inputStream, i10, 1024);
    }

    private o(InputStream inputStream, int i10, int i11) {
        this.f29612e = -1L;
        this.f29613f = true;
        this.f29614g = -1;
        this.f29608a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i10);
        this.f29614g = i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f29613f) {
            long j10 = this.f29609b;
            if (bArr.length + j10 > this.f29611d) {
                d(j10 + bArr.length + this.f29614g);
            }
        }
        int read = this.f29608a.read(bArr);
        if (read != -1) {
            this.f29609b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (!this.f29613f) {
            long j10 = this.f29609b;
            long j11 = i11;
            if (j10 + j11 > this.f29611d) {
                d(j10 + j11 + this.f29614g);
            }
        }
        int read = this.f29608a.read(bArr, i10, i11);
        if (read != -1) {
            this.f29609b += read;
        }
        return read;
    }
}
