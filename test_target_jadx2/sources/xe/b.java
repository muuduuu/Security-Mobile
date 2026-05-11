package xe;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class b extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f45040a;

    /* renamed from: b, reason: collision with root package name */
    private int f45041b;

    /* renamed from: c, reason: collision with root package name */
    private int f45042c;

    /* renamed from: d, reason: collision with root package name */
    private final k f45043d;

    public b(InputStream inputStream) {
        this(inputStream, 16384, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k.a(this.f45043d);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f45042c >= this.f45041b) {
            byte[] bArr = this.f45040a;
            int read = read(bArr, 0, bArr.length);
            this.f45041b = read;
            this.f45042c = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.f45040a;
        int i10 = this.f45042c;
        this.f45042c = i10 + 1;
        return bArr2[i10] & 255;
    }

    public b(InputStream inputStream, int i10, byte[] bArr) {
        k kVar = new k();
        this.f45043d = kVar;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i10);
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.f45040a = new byte[i10];
        this.f45041b = 0;
        this.f45042c = 0;
        try {
            k.c(kVar, inputStream);
            if (bArr != null) {
                e.s(kVar, bArr);
            }
        } catch (c e10) {
            throw new IOException("Brotli decoder initialization failed", e10);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Bad offset: " + i10);
        }
        if (i11 >= 0) {
            int i12 = i10 + i11;
            if (i12 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i12 + " > " + bArr.length);
            }
            if (i11 == 0) {
                return 0;
            }
            int max = Math.max(this.f45041b - this.f45042c, 0);
            if (max != 0) {
                max = Math.min(max, i11);
                System.arraycopy(this.f45040a, this.f45042c, bArr, i10, max);
                this.f45042c += max;
                i10 += max;
                i11 -= max;
                if (i11 == 0) {
                    return max;
                }
            }
            try {
                k kVar = this.f45043d;
                kVar.f45091Z = bArr;
                kVar.f45086U = i10;
                kVar.f45087V = i11;
                kVar.f45088W = 0;
                e.i(kVar);
                int i13 = this.f45043d.f45088W;
                if (i13 == 0) {
                    return -1;
                }
                return i13 + max;
            } catch (c e10) {
                throw new IOException("Brotli stream decoding failed", e10);
            }
        }
        throw new IllegalArgumentException("Bad length: " + i11);
    }
}
