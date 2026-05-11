package h3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3228a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private int f33962a;

    /* renamed from: b, reason: collision with root package name */
    private int f33963b;

    public C3228a(InputStream inputStream, int i10) {
        super(inputStream);
        inputStream.getClass();
        if (i10 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f33962a = i10;
        this.f33963b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f33962a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i10);
            this.f33963b = this.f33962a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f33962a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f33962a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f33963b == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f33962a = this.f33963b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f33962a));
        this.f33962a = (int) (this.f33962a - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f33962a;
        if (i12 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, Math.min(i11, i12));
        if (read > 0) {
            this.f33962a -= read;
        }
        return read;
    }
}
