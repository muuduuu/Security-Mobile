package j4;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class m implements v, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f35817a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35818b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35819c = System.identityHashCode(this);

    public m(int i10) {
        this.f35817a = ByteBuffer.allocateDirect(i10);
        this.f35818b = i10;
    }

    private void d(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof m)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        b3.l.i(!isClosed());
        b3.l.i(!vVar.isClosed());
        b3.l.g(this.f35817a);
        w.b(i10, vVar.k(), i11, i12, this.f35818b);
        this.f35817a.position(i10);
        ByteBuffer byteBuffer = (ByteBuffer) b3.l.g(vVar.h());
        byteBuffer.position(i11);
        byte[] bArr = new byte[i12];
        this.f35817a.get(bArr, 0, i12);
        byteBuffer.put(bArr, 0, i12);
    }

    @Override // j4.v
    public synchronized byte B(int i10) {
        b3.l.i(!isClosed());
        b3.l.b(Boolean.valueOf(i10 >= 0));
        b3.l.b(Boolean.valueOf(i10 < this.f35818b));
        b3.l.g(this.f35817a);
        return this.f35817a.get(i10);
    }

    @Override // j4.v
    public synchronized int E(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        b3.l.g(bArr);
        b3.l.i(!isClosed());
        b3.l.g(this.f35817a);
        a10 = w.a(i10, i12, this.f35818b);
        w.b(i10, bArr.length, i11, a10, this.f35818b);
        this.f35817a.position(i10);
        this.f35817a.get(bArr, i11, a10);
        return a10;
    }

    @Override // j4.v
    public long L() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // j4.v
    public long a() {
        return this.f35819c;
    }

    @Override // j4.v
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        b3.l.g(bArr);
        b3.l.i(!isClosed());
        b3.l.g(this.f35817a);
        a10 = w.a(i10, i12, this.f35818b);
        w.b(i10, bArr.length, i11, a10, this.f35818b);
        this.f35817a.position(i10);
        this.f35817a.put(bArr, i11, a10);
        return a10;
    }

    @Override // j4.v
    public void c(int i10, v vVar, int i11, int i12) {
        b3.l.g(vVar);
        if (vVar.a() == a()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(a()) + " to BufferMemoryChunk " + Long.toHexString(vVar.a()) + " which are the same ");
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
        this.f35817a = null;
    }

    @Override // j4.v
    public synchronized ByteBuffer h() {
        return this.f35817a;
    }

    @Override // j4.v
    public synchronized boolean isClosed() {
        return this.f35817a == null;
    }

    @Override // j4.v
    public int k() {
        return this.f35818b;
    }
}
