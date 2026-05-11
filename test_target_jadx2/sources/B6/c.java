package B6;

import B6.f;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f450a;

    /* renamed from: b, reason: collision with root package name */
    private final long f451b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f452c;

    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f453a;

        /* renamed from: b, reason: collision with root package name */
        private Long f454b;

        /* renamed from: c, reason: collision with root package name */
        private Set f455c;

        b() {
        }

        @Override // B6.f.b.a
        public f.b a() {
            Long l10 = this.f453a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " delta";
            }
            if (this.f454b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f455c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f453a.longValue(), this.f454b.longValue(), this.f455c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B6.f.b.a
        public f.b.a b(long j10) {
            this.f453a = Long.valueOf(j10);
            return this;
        }

        @Override // B6.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f455c = set;
            return this;
        }

        @Override // B6.f.b.a
        public f.b.a d(long j10) {
            this.f454b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // B6.f.b
    long b() {
        return this.f450a;
    }

    @Override // B6.f.b
    Set c() {
        return this.f452c;
    }

    @Override // B6.f.b
    long d() {
        return this.f451b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f450a == bVar.b() && this.f451b == bVar.d() && this.f452c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f450a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f451b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f452c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f450a + ", maxAllowedDelay=" + this.f451b + ", flags=" + this.f452c + "}";
    }

    private c(long j10, long j11, Set set) {
        this.f450a = j10;
        this.f451b = j11;
        this.f452c = set;
    }
}
