package C6;

import C6.AbstractC0754e;
import org.conscrypt.BuildConfig;

/* renamed from: C6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0750a extends AbstractC0754e {

    /* renamed from: b, reason: collision with root package name */
    private final long f972b;

    /* renamed from: c, reason: collision with root package name */
    private final int f973c;

    /* renamed from: d, reason: collision with root package name */
    private final int f974d;

    /* renamed from: e, reason: collision with root package name */
    private final long f975e;

    /* renamed from: f, reason: collision with root package name */
    private final int f976f;

    /* renamed from: C6.a$b */
    static final class b extends AbstractC0754e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f977a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f978b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f979c;

        /* renamed from: d, reason: collision with root package name */
        private Long f980d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f981e;

        b() {
        }

        @Override // C6.AbstractC0754e.a
        AbstractC0754e a() {
            Long l10 = this.f977a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " maxStorageSizeInBytes";
            }
            if (this.f978b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f979c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f980d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f981e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0750a(this.f977a.longValue(), this.f978b.intValue(), this.f979c.intValue(), this.f980d.longValue(), this.f981e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C6.AbstractC0754e.a
        AbstractC0754e.a b(int i10) {
            this.f979c = Integer.valueOf(i10);
            return this;
        }

        @Override // C6.AbstractC0754e.a
        AbstractC0754e.a c(long j10) {
            this.f980d = Long.valueOf(j10);
            return this;
        }

        @Override // C6.AbstractC0754e.a
        AbstractC0754e.a d(int i10) {
            this.f978b = Integer.valueOf(i10);
            return this;
        }

        @Override // C6.AbstractC0754e.a
        AbstractC0754e.a e(int i10) {
            this.f981e = Integer.valueOf(i10);
            return this;
        }

        @Override // C6.AbstractC0754e.a
        AbstractC0754e.a f(long j10) {
            this.f977a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // C6.AbstractC0754e
    int b() {
        return this.f974d;
    }

    @Override // C6.AbstractC0754e
    long c() {
        return this.f975e;
    }

    @Override // C6.AbstractC0754e
    int d() {
        return this.f973c;
    }

    @Override // C6.AbstractC0754e
    int e() {
        return this.f976f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0754e)) {
            return false;
        }
        AbstractC0754e abstractC0754e = (AbstractC0754e) obj;
        return this.f972b == abstractC0754e.f() && this.f973c == abstractC0754e.d() && this.f974d == abstractC0754e.b() && this.f975e == abstractC0754e.c() && this.f976f == abstractC0754e.e();
    }

    @Override // C6.AbstractC0754e
    long f() {
        return this.f972b;
    }

    public int hashCode() {
        long j10 = this.f972b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f973c) * 1000003) ^ this.f974d) * 1000003;
        long j11 = this.f975e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f976f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f972b + ", loadBatchSize=" + this.f973c + ", criticalSectionEnterTimeoutMs=" + this.f974d + ", eventCleanUpAge=" + this.f975e + ", maxBlobByteSizePerRow=" + this.f976f + "}";
    }

    private C0750a(long j10, int i10, int i11, long j11, int i12) {
        this.f972b = j10;
        this.f973c = i10;
        this.f974d = i11;
        this.f975e = j11;
        this.f976f = i12;
    }
}
