package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
abstract class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f21836a;

    public b(OutputStream outputStream) {
        super(outputStream);
        this.f21836a = 0L;
    }

    public long a() {
        return this.f21836a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f21836a += i11;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        this.f21836a++;
    }
}
