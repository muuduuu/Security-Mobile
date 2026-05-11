package Y;

import Y.p;

/* loaded from: classes.dex */
final class v extends p.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f11982a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11983b;

    v(int i10, long j10) {
        this.f11982a = i10;
        this.f11983b = j10;
    }

    @Override // Y.p.c
    public int a() {
        return this.f11982a;
    }

    @Override // Y.p.c
    public long b() {
        return this.f11983b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p.c)) {
            return false;
        }
        p.c cVar = (p.c) obj;
        return this.f11982a == cVar.a() && this.f11983b == cVar.b();
    }

    public int hashCode() {
        int i10 = (this.f11982a ^ 1000003) * 1000003;
        long j10 = this.f11983b;
        return i10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f11982a + ", timestampNs=" + this.f11983b + "}";
    }
}
