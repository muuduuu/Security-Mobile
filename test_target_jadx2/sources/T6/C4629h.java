package t6;

/* renamed from: t6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4629h extends AbstractC4635n {

    /* renamed from: a, reason: collision with root package name */
    private final long f42399a;

    C4629h(long j10) {
        this.f42399a = j10;
    }

    @Override // t6.AbstractC4635n
    public long c() {
        return this.f42399a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC4635n) && this.f42399a == ((AbstractC4635n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f42399a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f42399a + "}";
    }
}
