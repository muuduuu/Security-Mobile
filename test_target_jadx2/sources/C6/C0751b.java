package C6;

/* renamed from: C6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0751b extends AbstractC0760k {

    /* renamed from: a, reason: collision with root package name */
    private final long f982a;

    /* renamed from: b, reason: collision with root package name */
    private final u6.o f983b;

    /* renamed from: c, reason: collision with root package name */
    private final u6.i f984c;

    C0751b(long j10, u6.o oVar, u6.i iVar) {
        this.f982a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f983b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f984c = iVar;
    }

    @Override // C6.AbstractC0760k
    public u6.i b() {
        return this.f984c;
    }

    @Override // C6.AbstractC0760k
    public long c() {
        return this.f982a;
    }

    @Override // C6.AbstractC0760k
    public u6.o d() {
        return this.f983b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0760k)) {
            return false;
        }
        AbstractC0760k abstractC0760k = (AbstractC0760k) obj;
        return this.f982a == abstractC0760k.c() && this.f983b.equals(abstractC0760k.d()) && this.f984c.equals(abstractC0760k.b());
    }

    public int hashCode() {
        long j10 = this.f982a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f983b.hashCode()) * 1000003) ^ this.f984c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f982a + ", transportContext=" + this.f983b + ", event=" + this.f984c + "}";
    }
}
