package j8;

/* renamed from: j8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3507a extends AbstractC3518l {

    /* renamed from: a, reason: collision with root package name */
    private final long f35889a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35890b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35891c;

    C3507a(long j10, long j11, long j12) {
        this.f35889a = j10;
        this.f35890b = j11;
        this.f35891c = j12;
    }

    @Override // j8.AbstractC3518l
    public long b() {
        return this.f35890b;
    }

    @Override // j8.AbstractC3518l
    public long c() {
        return this.f35889a;
    }

    @Override // j8.AbstractC3518l
    public long d() {
        return this.f35891c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3518l)) {
            return false;
        }
        AbstractC3518l abstractC3518l = (AbstractC3518l) obj;
        return this.f35889a == abstractC3518l.c() && this.f35890b == abstractC3518l.b() && this.f35891c == abstractC3518l.d();
    }

    public int hashCode() {
        long j10 = this.f35889a;
        long j11 = this.f35890b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f35891c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f35889a + ", elapsedRealtime=" + this.f35890b + ", uptimeMillis=" + this.f35891c + "}";
    }
}
