package s7;

import java.io.OutputStream;

/* renamed from: s7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4368g extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f41211a = 0;

    C4368g() {
    }

    final long a() {
        return this.f41211a;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f41211a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f41211a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f41211a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
