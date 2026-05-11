package E;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final OutputStream f1807a;

    /* renamed from: b, reason: collision with root package name */
    private ByteOrder f1808b;

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f1807a = outputStream;
        this.f1808b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.f1808b = byteOrder;
    }

    public void b(int i10) {
        this.f1807a.write(i10);
    }

    public void c(int i10) {
        ByteOrder byteOrder = this.f1808b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1807a.write(i10 & 255);
            this.f1807a.write((i10 >>> 8) & 255);
            this.f1807a.write((i10 >>> 16) & 255);
            this.f1807a.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1807a.write((i10 >>> 24) & 255);
            this.f1807a.write((i10 >>> 16) & 255);
            this.f1807a.write((i10 >>> 8) & 255);
            this.f1807a.write(i10 & 255);
        }
    }

    public void d(short s10) {
        ByteOrder byteOrder = this.f1808b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1807a.write(s10 & 255);
            this.f1807a.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1807a.write((s10 >>> 8) & 255);
            this.f1807a.write(s10 & 255);
        }
    }

    public void e(long j10) {
        c((int) j10);
    }

    public void f(int i10) {
        d((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f1807a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f1807a.write(bArr, i10, i11);
    }
}
