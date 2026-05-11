package T5;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class e extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f9277a;

    public e(ByteBuffer byteBuffer) {
        this.f9277a = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f9277a.remaining();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f9277a.hasRemaining()) {
            return this.f9277a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (!this.f9277a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i11, this.f9277a.remaining());
        this.f9277a.get(bArr, i10, min);
        return min;
    }
}
