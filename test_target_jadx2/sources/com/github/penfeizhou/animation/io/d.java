package com.github.penfeizhou.animation.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class d extends FilterInputStream implements Reader {

    /* renamed from: a, reason: collision with root package name */
    private int f23196a;

    public d(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() {
        byte read = (byte) read();
        this.f23196a++;
        return read;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f23196a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        this.f23196a += Math.max(0, read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public synchronized void reset() {
        super.reset();
        this.f23196a = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) {
        long j11 = j10;
        while (j11 > 0) {
            long skip = super.skip(j11);
            if (skip > 0) {
                j11 -= skip;
            } else {
                if (super.read() == -1) {
                    break;
                }
                j11--;
            }
        }
        long j12 = j10 - j11;
        this.f23196a = (int) (this.f23196a + j12);
        return j12;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() {
        return this;
    }
}
