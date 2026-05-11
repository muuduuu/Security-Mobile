package t7;

import java.io.OutputStream;

/* renamed from: t7.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4779u0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f43251a = 0;

    C4779u0() {
    }

    final long a() {
        return this.f43251a;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f43251a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f43251a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f43251a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
