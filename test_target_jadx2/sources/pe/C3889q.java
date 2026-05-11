package pe;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3889q implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final U f38714a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f38715b;

    /* renamed from: c, reason: collision with root package name */
    private final C3881i f38716c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38717d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f38718e;

    public C3889q(Z sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        U u10 = new U(sink);
        this.f38714a = u10;
        Deflater deflater = new Deflater(qe.k.b(), true);
        this.f38715b = deflater;
        this.f38716c = new C3881i((InterfaceC3878f) u10, deflater);
        this.f38718e = new CRC32();
        C3877e c3877e = u10.f38621b;
        c3877e.f0(8075);
        c3877e.q0(8);
        c3877e.q0(0);
        c3877e.l0(0);
        c3877e.q0(0);
        c3877e.q0(0);
    }

    private final void a(C3877e c3877e, long j10) {
        W w10 = c3877e.f38666a;
        Intrinsics.d(w10);
        while (j10 > 0) {
            int min = (int) Math.min(j10, w10.f38631c - w10.f38630b);
            this.f38718e.update(w10.f38629a, w10.f38630b, min);
            j10 -= min;
            w10 = w10.f38634f;
            Intrinsics.d(w10);
        }
    }

    private final void b() {
        this.f38714a.a((int) this.f38718e.getValue());
        this.f38714a.a((int) this.f38715b.getBytesRead());
    }

    @Override // pe.Z
    public c0 A() {
        return this.f38714a.A();
    }

    @Override // pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        a(source, j10);
        this.f38716c.N0(source, j10);
    }

    @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38717d) {
            return;
        }
        try {
            this.f38716c.b();
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f38715b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f38714a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f38717d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // pe.Z, java.io.Flushable
    public void flush() {
        this.f38716c.flush();
    }
}
