package r7;

import java.io.OutputStream;

/* loaded from: classes2.dex */
final class P0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f39591a = 0;

    P0() {
    }

    final long a() {
        return this.f39591a;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f39591a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f39591a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f39591a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
