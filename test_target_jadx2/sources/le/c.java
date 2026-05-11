package le;

import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.C3890s;
import pe.b0;

/* loaded from: classes3.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37164a;

    /* renamed from: b, reason: collision with root package name */
    private final C3877e f37165b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f37166c;

    /* renamed from: d, reason: collision with root package name */
    private final C3890s f37167d;

    public c(boolean z10) {
        this.f37164a = z10;
        C3877e c3877e = new C3877e();
        this.f37165b = c3877e;
        Inflater inflater = new Inflater(true);
        this.f37166c = inflater;
        this.f37167d = new C3890s((b0) c3877e, inflater);
    }

    public final void a(C3877e buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f37165b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f37164a) {
            this.f37166c.reset();
        }
        this.f37165b.s0(buffer);
        this.f37165b.l0(65535);
        long bytesRead = this.f37166c.getBytesRead() + this.f37165b.size();
        do {
            this.f37167d.a(buffer, Long.MAX_VALUE);
            if (this.f37166c.getBytesRead() >= bytesRead) {
                return;
            }
        } while (!this.f37166c.finished());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37167d.close();
    }
}
