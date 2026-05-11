package e3;

import java.io.InputStream;

/* loaded from: classes.dex */
public class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    final h f32191a;

    /* renamed from: b, reason: collision with root package name */
    int f32192b;

    /* renamed from: c, reason: collision with root package name */
    int f32193c;

    public j(h hVar) {
        b3.l.b(Boolean.valueOf(!hVar.isClosed()));
        this.f32191a = (h) b3.l.g(hVar);
        this.f32192b = 0;
        this.f32193c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f32191a.size() - this.f32192b;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f32193c = this.f32192b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f32191a;
        int i10 = this.f32192b;
        this.f32192b = i10 + 1;
        return hVar.B(i10) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f32192b = this.f32193c;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        b3.l.b(Boolean.valueOf(j10 >= 0));
        int min = Math.min((int) j10, available());
        this.f32192b += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i11 <= 0) {
                return 0;
            }
            int min = Math.min(available, i11);
            this.f32191a.E(this.f32192b, bArr, i10, min);
            this.f32192b += min;
            return min;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
