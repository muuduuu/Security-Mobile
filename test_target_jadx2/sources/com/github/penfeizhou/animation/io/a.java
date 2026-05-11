package com.github.penfeizhou.animation.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class a implements Reader {

    /* renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f23194a;

    public a(ByteBuffer byteBuffer) {
        this.f23194a = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int available() {
        return this.f23194a.limit() - this.f23194a.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void close() {
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() {
        return this.f23194a.get();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f23194a.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) {
        this.f23194a.get(bArr, i10, i11);
        return i11;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void reset() {
        this.f23194a.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) {
        this.f23194a.position((int) (r0.position() + j10));
        return j10;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() {
        return new ByteArrayInputStream(this.f23194a.array());
    }
}
