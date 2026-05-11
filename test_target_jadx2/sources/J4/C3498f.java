package j4;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: j4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3498f implements v, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private SharedMemory f35796a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f35797b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35798c;

    public C3498f(int i10) {
        SharedMemory create;
        ByteBuffer mapReadWrite;
        b3.l.b(Boolean.valueOf(i10 > 0));
        try {
            create = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f35796a = create;
            mapReadWrite = create.mapReadWrite();
            this.f35797b = mapReadWrite;
            this.f35798c = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    private void d(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof C3498f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        b3.l.i(!isClosed());
        b3.l.i(!vVar.isClosed());
        b3.l.g(this.f35797b);
        b3.l.g(vVar.h());
        w.b(i10, vVar.k(), i11, i12, k());
        this.f35797b.position(i10);
        vVar.h().position(i11);
        byte[] bArr = new byte[i12];
        this.f35797b.get(bArr, 0, i12);
        vVar.h().put(bArr, 0, i12);
    }

    @Override // j4.v
    public synchronized byte B(int i10) {
        b3.l.i(!isClosed());
        b3.l.b(Boolean.valueOf(i10 >= 0));
        b3.l.b(Boolean.valueOf(i10 < k()));
        b3.l.g(this.f35797b);
        return this.f35797b.get(i10);
    }

    @Override // j4.v
    public synchronized int E(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        b3.l.g(bArr);
        b3.l.g(this.f35797b);
        a10 = w.a(i10, i12, k());
        w.b(i10, bArr.length, i11, a10, k());
        this.f35797b.position(i10);
        this.f35797b.get(bArr, i11, a10);
        return a10;
    }

    @Override // j4.v
    public long L() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // j4.v
    public long a() {
        return this.f35798c;
    }

    @Override // j4.v
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        b3.l.g(bArr);
        b3.l.g(this.f35797b);
        a10 = w.a(i10, i12, k());
        w.b(i10, bArr.length, i11, a10, k());
        this.f35797b.position(i10);
        this.f35797b.put(bArr, i11, a10);
        return a10;
    }

    @Override // j4.v
    public void c(int i10, v vVar, int i11, int i12) {
        b3.l.g(vVar);
        if (vVar.a() == a()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(a()) + " to AshmemMemoryChunk " + Long.toHexString(vVar.a()) + " which are the same ");
            b3.l.b(Boolean.FALSE);
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
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f35796a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f35797b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f35797b = null;
                this.f35796a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j4.v
    public ByteBuffer h() {
        return this.f35797b;
    }

    @Override // j4.v
    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f35797b != null) {
            z10 = this.f35796a == null;
        }
        return z10;
    }

    @Override // j4.v
    public int k() {
        int size;
        b3.l.g(this.f35796a);
        size = this.f35796a.getSize();
        return size;
    }
}
