package E;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final long f1862a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1863b;

    l(long j10, long j11) {
        this.f1862a = j10;
        this.f1863b = j11;
    }

    long a() {
        return this.f1863b;
    }

    long b() {
        return this.f1862a;
    }

    public String toString() {
        return this.f1862a + "/" + this.f1863b;
    }

    l(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
