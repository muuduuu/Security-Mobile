package com.github.penfeizhou.animation.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    protected ByteBuffer f23195a;

    public b() {
        d(10240);
    }

    public int a() {
        return this.f23195a.position();
    }

    public void b(byte b10) {
        this.f23195a.put(b10);
    }

    public void c(byte[] bArr) {
        this.f23195a.put(bArr);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }

    public void d(int i10) {
        ByteBuffer byteBuffer = this.f23195a;
        if (byteBuffer == null || i10 > byteBuffer.capacity()) {
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            this.f23195a = allocate;
            allocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f23195a.clear();
    }

    public void e(int i10) {
        this.f23195a.position(i10 + a());
    }

    public byte[] f() {
        return this.f23195a.array();
    }
}
