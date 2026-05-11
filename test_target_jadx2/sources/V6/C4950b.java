package v6;

import v6.AbstractC4955g;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4950b extends AbstractC4955g {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4955g.a f43976a;

    /* renamed from: b, reason: collision with root package name */
    private final long f43977b;

    C4950b(AbstractC4955g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f43976a = aVar;
        this.f43977b = j10;
    }

    @Override // v6.AbstractC4955g
    public long b() {
        return this.f43977b;
    }

    @Override // v6.AbstractC4955g
    public AbstractC4955g.a c() {
        return this.f43976a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4955g)) {
            return false;
        }
        AbstractC4955g abstractC4955g = (AbstractC4955g) obj;
        return this.f43976a.equals(abstractC4955g.c()) && this.f43977b == abstractC4955g.b();
    }

    public int hashCode() {
        int hashCode = (this.f43976a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f43977b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f43976a + ", nextRequestWaitMillis=" + this.f43977b + "}";
    }
}
