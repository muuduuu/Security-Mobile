package M8;

import M8.d;

/* loaded from: classes2.dex */
final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f6082b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6083c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6084d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6085e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6086f;

    /* renamed from: M8.b$b, reason: collision with other inner class name */
    static final class C0121b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6087a;

        /* renamed from: b, reason: collision with root package name */
        private String f6088b;

        /* renamed from: c, reason: collision with root package name */
        private String f6089c;

        /* renamed from: d, reason: collision with root package name */
        private String f6090d;

        /* renamed from: e, reason: collision with root package name */
        private long f6091e;

        /* renamed from: f, reason: collision with root package name */
        private byte f6092f;

        C0121b() {
        }

        @Override // M8.d.a
        public d a() {
            if (this.f6092f == 1 && this.f6087a != null && this.f6088b != null && this.f6089c != null && this.f6090d != null) {
                return new b(this.f6087a, this.f6088b, this.f6089c, this.f6090d, this.f6091e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f6087a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f6088b == null) {
                sb2.append(" variantId");
            }
            if (this.f6089c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f6090d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f6092f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // M8.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f6089c = str;
            return this;
        }

        @Override // M8.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f6090d = str;
            return this;
        }

        @Override // M8.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f6087a = str;
            return this;
        }

        @Override // M8.d.a
        public d.a e(long j10) {
            this.f6091e = j10;
            this.f6092f = (byte) (this.f6092f | 1);
            return this;
        }

        @Override // M8.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f6088b = str;
            return this;
        }
    }

    @Override // M8.d
    public String b() {
        return this.f6084d;
    }

    @Override // M8.d
    public String c() {
        return this.f6085e;
    }

    @Override // M8.d
    public String d() {
        return this.f6082b;
    }

    @Override // M8.d
    public long e() {
        return this.f6086f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6082b.equals(dVar.d()) && this.f6083c.equals(dVar.f()) && this.f6084d.equals(dVar.b()) && this.f6085e.equals(dVar.c()) && this.f6086f == dVar.e();
    }

    @Override // M8.d
    public String f() {
        return this.f6083c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f6082b.hashCode() ^ 1000003) * 1000003) ^ this.f6083c.hashCode()) * 1000003) ^ this.f6084d.hashCode()) * 1000003) ^ this.f6085e.hashCode()) * 1000003;
        long j10 = this.f6086f;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f6082b + ", variantId=" + this.f6083c + ", parameterKey=" + this.f6084d + ", parameterValue=" + this.f6085e + ", templateVersion=" + this.f6086f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f6082b = str;
        this.f6083c = str2;
        this.f6084d = str3;
        this.f6085e = str4;
        this.f6086f = j10;
    }
}
