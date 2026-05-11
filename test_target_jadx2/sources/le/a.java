package le;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.C3880h;
import pe.C3881i;
import pe.Z;

/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37159a;

    /* renamed from: b, reason: collision with root package name */
    private final C3877e f37160b;

    /* renamed from: c, reason: collision with root package name */
    private final Deflater f37161c;

    /* renamed from: d, reason: collision with root package name */
    private final C3881i f37162d;

    public a(boolean z10) {
        this.f37159a = z10;
        C3877e c3877e = new C3877e();
        this.f37160b = c3877e;
        Deflater deflater = new Deflater(-1, true);
        this.f37161c = deflater;
        this.f37162d = new C3881i((Z) c3877e, deflater);
    }

    private final boolean b(C3877e c3877e, C3880h c3880h) {
        return c3877e.D0(c3877e.size() - c3880h.L(), c3880h);
    }

    public final void a(C3877e buffer) {
        C3880h c3880h;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f37160b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f37159a) {
            this.f37161c.reset();
        }
        this.f37162d.N0(buffer, buffer.size());
        this.f37162d.flush();
        C3877e c3877e = this.f37160b;
        c3880h = b.f37163a;
        if (b(c3877e, c3880h)) {
            long size = this.f37160b.size() - 4;
            C3877e.a H10 = C3877e.H(this.f37160b, null, 1, null);
            try {
                H10.c(size);
                kotlin.io.c.a(H10, null);
            } finally {
            }
        } else {
            this.f37160b.q0(0);
        }
        C3877e c3877e2 = this.f37160b;
        buffer.N0(c3877e2, c3877e2.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37162d.close();
    }
}
