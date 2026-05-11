package com.github.penfeizhou.animation.io;

import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class c implements Reader {
    protected Reader reader;

    public c(Reader reader) {
        this.reader = reader;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int available() {
        return this.reader.available();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void close() {
        this.reader.close();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() {
        return this.reader.peek();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.reader.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) {
        return this.reader.read(bArr, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void reset() {
        this.reader.reset();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) {
        return this.reader.skip(j10);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() {
        reset();
        return this.reader.toInputStream();
    }
}
