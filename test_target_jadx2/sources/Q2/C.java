package Q2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.Z;
import pe.b0;
import pe.c0;

/* loaded from: classes.dex */
public final class C implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f8071a;

    /* renamed from: b, reason: collision with root package name */
    private final Z f8072b;

    /* renamed from: c, reason: collision with root package name */
    private final C3877e f8073c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8074d;

    public C(b0 upstream, Z sideStream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(sideStream, "sideStream");
        this.f8071a = upstream;
        this.f8072b = sideStream;
        this.f8073c = new C3877e();
    }

    private final void a(C3877e c3877e, long j10) {
        c3877e.l(this.f8073c, c3877e.size() - j10, j10);
        try {
            this.f8072b.N0(this.f8073c, j10);
        } catch (IOException unused) {
            this.f8074d = true;
            b();
        }
    }

    private final void b() {
        try {
            this.f8072b.close();
        } catch (IOException unused) {
            this.f8074d = true;
        }
    }

    @Override // pe.b0
    public c0 A() {
        c0 A10 = this.f8071a.A();
        Intrinsics.checkNotNullExpressionValue(A10, "upstream.timeout()");
        return A10;
    }

    @Override // pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long b22 = this.f8071a.b2(sink, j10);
        if (b22 == -1) {
            b();
            return -1L;
        }
        if (!this.f8074d) {
            a(sink, b22);
        }
        return b22;
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
        this.f8071a.close();
    }
}
