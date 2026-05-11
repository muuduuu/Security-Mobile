package V;

/* loaded from: classes.dex */
public abstract class Z {
    Z() {
    }

    static Z d(long j10, long j11, AbstractC1238b abstractC1238b) {
        y0.f.b(j10 >= 0, "duration must be positive value.");
        y0.f.b(j11 >= 0, "bytes must be positive value.");
        return new C1249l(j10, j11, abstractC1238b);
    }

    public abstract AbstractC1238b a();

    public abstract long b();

    public abstract long c();
}
