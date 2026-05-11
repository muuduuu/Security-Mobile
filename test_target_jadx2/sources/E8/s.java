package e8;

/* loaded from: classes2.dex */
final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    private final int f32290a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32291b;

    s(int i10, long j10) {
        this.f32290a = i10;
        this.f32291b = j10;
    }

    @Override // e8.t
    public final int a() {
        return this.f32290a;
    }

    @Override // e8.t
    public final long b() {
        return this.f32291b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f32290a == tVar.a() && this.f32291b == tVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f32291b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f32290a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f32290a + ", eventTimestamp=" + this.f32291b + "}";
    }
}
