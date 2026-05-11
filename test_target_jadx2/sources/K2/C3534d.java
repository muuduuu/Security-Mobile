package k2;

import java.security.MessageDigest;

/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3534d implements i2.f {

    /* renamed from: b, reason: collision with root package name */
    private final i2.f f36001b;

    /* renamed from: c, reason: collision with root package name */
    private final i2.f f36002c;

    C3534d(i2.f fVar, i2.f fVar2) {
        this.f36001b = fVar;
        this.f36002c = fVar2;
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        this.f36001b.a(messageDigest);
        this.f36002c.a(messageDigest);
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (!(obj instanceof C3534d)) {
            return false;
        }
        C3534d c3534d = (C3534d) obj;
        return this.f36001b.equals(c3534d.f36001b) && this.f36002c.equals(c3534d.f36002c);
    }

    @Override // i2.f
    public int hashCode() {
        return (this.f36001b.hashCode() * 31) + this.f36002c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f36001b + ", signature=" + this.f36002c + '}';
    }
}
