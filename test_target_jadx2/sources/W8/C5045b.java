package w8;

import java.io.OutputStream;

/* renamed from: w8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5045b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f44341a = 0;

    C5045b() {
    }

    long a() {
        return this.f44341a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f44341a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f44341a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f44341a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
