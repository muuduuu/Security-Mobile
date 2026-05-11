package D2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final Queue f1184c = l.g(0);

    /* renamed from: a, reason: collision with root package name */
    private InputStream f1185a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f1186b;

    d() {
    }

    public static d b(InputStream inputStream) {
        d dVar;
        Queue queue = f1184c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.d(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f1186b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f1185a.available();
    }

    public void c() {
        this.f1186b = null;
        this.f1185a = null;
        Queue queue = f1184c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1185a.close();
    }

    void d(InputStream inputStream) {
        this.f1185a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f1185a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f1185a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f1185a.read();
        } catch (IOException e10) {
            this.f1186b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f1185a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f1185a.skip(j10);
        } catch (IOException e10) {
            this.f1186b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f1185a.read(bArr);
        } catch (IOException e10) {
            this.f1186b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f1185a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f1186b = e10;
            throw e10;
        }
    }
}
