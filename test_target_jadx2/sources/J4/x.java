package j4;

import e3.h;
import f3.AbstractC3142a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class x implements e3.h {

    /* renamed from: a, reason: collision with root package name */
    private final int f35835a;

    /* renamed from: b, reason: collision with root package name */
    AbstractC3142a f35836b;

    public x(AbstractC3142a abstractC3142a, int i10) {
        b3.l.g(abstractC3142a);
        b3.l.b(Boolean.valueOf(i10 >= 0 && i10 <= ((v) abstractC3142a.p()).k()));
        this.f35836b = abstractC3142a.clone();
        this.f35835a = i10;
    }

    @Override // e3.h
    public synchronized byte B(int i10) {
        a();
        b3.l.b(Boolean.valueOf(i10 >= 0));
        b3.l.b(Boolean.valueOf(i10 < this.f35835a));
        b3.l.g(this.f35836b);
        return ((v) this.f35836b.p()).B(i10);
    }

    @Override // e3.h
    public synchronized int E(int i10, byte[] bArr, int i11, int i12) {
        a();
        b3.l.b(Boolean.valueOf(i10 + i12 <= this.f35835a));
        b3.l.g(this.f35836b);
        return ((v) this.f35836b.p()).E(i10, bArr, i11, i12);
    }

    @Override // e3.h
    public synchronized long L() {
        a();
        b3.l.g(this.f35836b);
        return ((v) this.f35836b.p()).L();
    }

    synchronized void a() {
        if (isClosed()) {
            throw new h.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        AbstractC3142a.n(this.f35836b);
        this.f35836b = null;
    }

    @Override // e3.h
    public synchronized ByteBuffer h() {
        b3.l.g(this.f35836b);
        return ((v) this.f35836b.p()).h();
    }

    @Override // e3.h
    public synchronized boolean isClosed() {
        return !AbstractC3142a.x(this.f35836b);
    }

    @Override // e3.h
    public synchronized int size() {
        a();
        return this.f35835a;
    }
}
