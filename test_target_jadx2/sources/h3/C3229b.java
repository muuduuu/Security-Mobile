package h3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3229b extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f33964a;

    /* renamed from: b, reason: collision with root package name */
    private int f33965b;

    /* renamed from: c, reason: collision with root package name */
    private int f33966c;

    public C3229b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f33964a = bArr;
    }

    private int a() {
        int i10 = this.f33965b;
        byte[] bArr = this.f33964a;
        if (i10 >= bArr.length) {
            return -1;
        }
        this.f33965b = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i10);
            this.f33966c = this.f33965b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f33965b = this.f33966c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (read != -1) {
            return read;
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i12 < i11) {
            int a10 = a();
            if (a10 == -1) {
                break;
            }
            bArr[i10 + i12] = (byte) a10;
            i12++;
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }
}
