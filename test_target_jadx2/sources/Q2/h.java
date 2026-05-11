package Q2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC3887o;
import pe.C3877e;
import pe.M;
import pe.b0;

/* loaded from: classes.dex */
public final class h extends AbstractC3887o {

    /* renamed from: b, reason: collision with root package name */
    private boolean f8089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b0 delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8089b = true;
    }

    @Override // pe.AbstractC3887o, pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long b22 = super.b2(sink, j10);
            if (b22 == -1) {
                this.f8089b = false;
            }
            return b22;
        } catch (IOException e10) {
            this.f8089b = false;
            throw e10;
        }
    }

    @Override // pe.AbstractC3887o, pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f8089b) {
            try {
                M.c(a()).J1(M.a());
            } catch (IOException e10) {
                new IOException("An error occurred while depleting the source", e10).printStackTrace();
            }
        }
        this.f8089b = false;
        super.close();
    }
}
