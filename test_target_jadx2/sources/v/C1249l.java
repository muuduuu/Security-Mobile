package V;

/* renamed from: V.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1249l extends Z {

    /* renamed from: a, reason: collision with root package name */
    private final long f10653a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10654b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1238b f10655c;

    C1249l(long j10, long j11, AbstractC1238b abstractC1238b) {
        this.f10653a = j10;
        this.f10654b = j11;
        if (abstractC1238b == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.f10655c = abstractC1238b;
    }

    @Override // V.Z
    public AbstractC1238b a() {
        return this.f10655c;
    }

    @Override // V.Z
    public long b() {
        return this.f10654b;
    }

    @Override // V.Z
    public long c() {
        return this.f10653a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return this.f10653a == z10.c() && this.f10654b == z10.b() && this.f10655c.equals(z10.a());
    }

    public int hashCode() {
        long j10 = this.f10653a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f10654b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f10655c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f10653a + ", numBytesRecorded=" + this.f10654b + ", audioStats=" + this.f10655c + "}";
    }
}
