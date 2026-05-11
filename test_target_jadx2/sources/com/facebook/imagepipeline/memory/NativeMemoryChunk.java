package com.facebook.imagepipeline.memory;

import android.util.Log;
import b3.l;
import j4.v;
import j4.w;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p5.AbstractC3794a;

/* loaded from: classes.dex */
public class NativeMemoryChunk implements v, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final long f20690a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20691b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20692c;

    static {
        AbstractC3794a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i10) {
        l.b(Boolean.valueOf(i10 > 0));
        this.f20691b = i10;
        this.f20690a = nativeAllocate(i10);
        this.f20692c = false;
    }

    private void d(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        l.i(!isClosed());
        l.i(!vVar.isClosed());
        w.b(i10, vVar.k(), i11, i12, this.f20691b);
        nativeMemcpy(vVar.L() + i11, this.f20690a + i10, i12);
    }

    private static native long nativeAllocate(int i10);

    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    private static native void nativeFree(long j10);

    private static native void nativeMemcpy(long j10, long j11, int i10);

    private static native byte nativeReadByte(long j10);

    @Override // j4.v
    public synchronized byte B(int i10) {
        l.i(!isClosed());
        l.b(Boolean.valueOf(i10 >= 0));
        l.b(Boolean.valueOf(i10 < this.f20691b));
        return nativeReadByte(this.f20690a + i10);
    }

    @Override // j4.v
    public synchronized int E(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        l.g(bArr);
        l.i(!isClosed());
        a10 = w.a(i10, i12, this.f20691b);
        w.b(i10, bArr.length, i11, a10, this.f20691b);
        nativeCopyToByteArray(this.f20690a + i10, bArr, i11, a10);
        return a10;
    }

    @Override // j4.v
    public long L() {
        return this.f20690a;
    }

    @Override // j4.v
    public long a() {
        return this.f20690a;
    }

    @Override // j4.v
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        l.g(bArr);
        l.i(!isClosed());
        a10 = w.a(i10, i12, this.f20691b);
        w.b(i10, bArr.length, i11, a10, this.f20691b);
        nativeCopyFromByteArray(this.f20690a + i10, bArr, i11, a10);
        return a10;
    }

    @Override // j4.v
    public void c(int i10, v vVar, int i11, int i12) {
        l.g(vVar);
        if (vVar.a() == a()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(vVar)) + " which share the same address " + Long.toHexString(this.f20690a));
            l.b(Boolean.FALSE);
        }
        if (vVar.a() < a()) {
            synchronized (vVar) {
                synchronized (this) {
                    d(i10, vVar, i11, i12);
                }
            }
        } else {
            synchronized (this) {
                synchronized (vVar) {
                    d(i10, vVar, i11, i12);
                }
            }
        }
    }

    @Override // j4.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f20692c) {
            this.f20692c = true;
            nativeFree(this.f20690a);
        }
    }

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // j4.v
    public ByteBuffer h() {
        return null;
    }

    @Override // j4.v
    public synchronized boolean isClosed() {
        return this.f20692c;
    }

    @Override // j4.v
    public int k() {
        return this.f20691b;
    }

    public NativeMemoryChunk() {
        this.f20691b = 0;
        this.f20690a = 0L;
        this.f20692c = true;
    }
}
