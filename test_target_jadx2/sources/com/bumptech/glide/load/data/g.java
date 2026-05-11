package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f20321c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20322d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f20323e;

    /* renamed from: a, reason: collision with root package name */
    private final byte f20324a;

    /* renamed from: b, reason: collision with root package name */
    private int f20325b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f20321c = bArr;
        int length = bArr.length;
        f20322d = length;
        f20323e = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f20324a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f20325b;
        int read = (i11 < 2 || i11 > (i10 = f20323e)) ? super.read() : i11 == i10 ? this.f20324a : f20321c[i11 - 2] & 255;
        if (read != -1) {
            this.f20325b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f20325b = (int) (this.f20325b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f20325b;
        int i14 = f20323e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f20324a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f20321c, this.f20325b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f20325b += i12;
        }
        return i12;
    }
}
