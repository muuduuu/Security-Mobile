package qe;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC3887o;
import pe.C3877e;
import pe.b0;

/* loaded from: classes3.dex */
public final class g extends AbstractC3887o {

    /* renamed from: b, reason: collision with root package name */
    private final long f38897b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38898c;

    /* renamed from: d, reason: collision with root package name */
    private long f38899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b0 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38897b = j10;
        this.f38898c = z10;
    }

    private final void b(C3877e c3877e, long j10) {
        C3877e c3877e2 = new C3877e();
        c3877e2.s0(c3877e);
        c3877e.N0(c3877e2, j10);
        c3877e2.a();
    }

    @Override // pe.AbstractC3887o, pe.b0
    public long b2(C3877e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f38899d;
        long j12 = this.f38897b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f38898c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long b22 = super.b2(sink, j10);
        if (b22 != -1) {
            this.f38899d += b22;
        }
        long j14 = this.f38899d;
        long j15 = this.f38897b;
        if ((j14 >= j15 || b22 != -1) && j14 <= j15) {
            return b22;
        }
        if (b22 > 0 && j14 > j15) {
            b(sink, sink.size() - (this.f38899d - this.f38897b));
        }
        throw new IOException("expected " + this.f38897b + " bytes but got " + this.f38899d);
    }
}
