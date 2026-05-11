package com.bumptech.glide.load.data;

import java.io.OutputStream;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f20314a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f20315b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3600b f20316c;

    /* renamed from: d, reason: collision with root package name */
    private int f20317d;

    public c(OutputStream outputStream, InterfaceC3600b interfaceC3600b) {
        this(outputStream, interfaceC3600b, 65536);
    }

    private void a() {
        int i10 = this.f20317d;
        if (i10 > 0) {
            this.f20314a.write(this.f20315b, 0, i10);
            this.f20317d = 0;
        }
    }

    private void b() {
        if (this.f20317d == this.f20315b.length) {
            a();
        }
    }

    private void c() {
        byte[] bArr = this.f20315b;
        if (bArr != null) {
            this.f20316c.put(bArr);
            this.f20315b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f20314a.close();
            c();
        } catch (Throwable th) {
            this.f20314a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f20314a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f20315b;
        int i11 = this.f20317d;
        this.f20317d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    c(OutputStream outputStream, InterfaceC3600b interfaceC3600b, int i10) {
        this.f20314a = outputStream;
        this.f20316c = interfaceC3600b;
        this.f20315b = (byte[]) interfaceC3600b.d(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f20317d;
            if (i15 == 0 && i13 >= this.f20315b.length) {
                this.f20314a.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f20315b.length - i15);
            System.arraycopy(bArr, i14, this.f20315b, this.f20317d, min);
            this.f20317d += min;
            i12 += min;
            b();
        } while (i12 < i11);
    }
}
