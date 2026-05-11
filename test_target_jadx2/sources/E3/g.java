package e3;

import c3.AbstractC1721a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f32185a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f32186b;

    /* renamed from: c, reason: collision with root package name */
    private final f3.h f32187c;

    /* renamed from: d, reason: collision with root package name */
    private int f32188d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f32189e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32190f = false;

    public g(InputStream inputStream, byte[] bArr, f3.h hVar) {
        this.f32185a = (InputStream) b3.l.g(inputStream);
        this.f32186b = (byte[]) b3.l.g(bArr);
        this.f32187c = (f3.h) b3.l.g(hVar);
    }

    private boolean a() {
        if (this.f32189e < this.f32188d) {
            return true;
        }
        int read = this.f32185a.read(this.f32186b);
        if (read <= 0) {
            return false;
        }
        this.f32188d = read;
        this.f32189e = 0;
        return true;
    }

    private void b() {
        if (this.f32190f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() {
        b3.l.i(this.f32189e <= this.f32188d);
        b();
        return (this.f32188d - this.f32189e) + this.f32185a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32190f) {
            return;
        }
        this.f32190f = true;
        this.f32187c.a(this.f32186b);
        super.close();
    }

    protected void finalize() {
        if (!this.f32190f) {
            AbstractC1721a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() {
        b3.l.i(this.f32189e <= this.f32188d);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f32186b;
        int i10 = this.f32189e;
        this.f32189e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        b3.l.i(this.f32189e <= this.f32188d);
        b();
        int i10 = this.f32188d;
        int i11 = this.f32189e;
        long j11 = i10 - i11;
        if (j11 >= j10) {
            this.f32189e = (int) (i11 + j10);
            return j10;
        }
        this.f32189e = i10;
        return j11 + this.f32185a.skip(j10 - j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        b3.l.i(this.f32189e <= this.f32188d);
        b();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f32188d - this.f32189e, i11);
        System.arraycopy(this.f32186b, this.f32189e, bArr, i10, min);
        this.f32189e += min;
        return min;
    }
}
