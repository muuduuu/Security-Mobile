package D2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final long f1182a;

    /* renamed from: b, reason: collision with root package name */
    private int f1183b;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f1182a = j10;
    }

    private int a(int i10) {
        if (i10 >= 0) {
            this.f1183b += i10;
        } else if (this.f1182a - this.f1183b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f1182a + ", but read: " + this.f1183b);
        }
        return i10;
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f1182a - this.f1183b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
