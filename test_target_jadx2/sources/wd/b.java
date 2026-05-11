package Wd;

import Td.G;
import Td.z;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;
import pe.c0;

/* loaded from: classes3.dex */
public final class b extends G implements b0 {

    /* renamed from: c, reason: collision with root package name */
    private final z f11575c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11576d;

    public b(z zVar, long j10) {
        this.f11575c = zVar;
        this.f11576d = j10;
    }

    @Override // pe.b0
    public c0 A() {
        return c0.f38662e;
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // Td.G
    public long e() {
        return this.f11576d;
    }

    @Override // Td.G
    public z f() {
        return this.f11575c;
    }

    @Override // Td.G
    public InterfaceC3879g j() {
        return M.c(this);
    }

    @Override // Td.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
