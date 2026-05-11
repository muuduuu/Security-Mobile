package D8;

import D8.f;

/* loaded from: classes2.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f1381a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1382b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f1383c;

    /* renamed from: D8.b$b, reason: collision with other inner class name */
    static final class C0025b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f1384a;

        /* renamed from: b, reason: collision with root package name */
        private long f1385b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f1386c;

        /* renamed from: d, reason: collision with root package name */
        private byte f1387d;

        C0025b() {
        }

        @Override // D8.f.a
        public f a() {
            if (this.f1387d == 1) {
                return new b(this.f1384a, this.f1385b, this.f1386c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // D8.f.a
        public f.a b(f.b bVar) {
            this.f1386c = bVar;
            return this;
        }

        @Override // D8.f.a
        public f.a c(String str) {
            this.f1384a = str;
            return this;
        }

        @Override // D8.f.a
        public f.a d(long j10) {
            this.f1385b = j10;
            this.f1387d = (byte) (this.f1387d | 1);
            return this;
        }
    }

    @Override // D8.f
    public f.b b() {
        return this.f1383c;
    }

    @Override // D8.f
    public String c() {
        return this.f1381a;
    }

    @Override // D8.f
    public long d() {
        return this.f1382b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f1381a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f1382b == fVar.d()) {
                f.b bVar = this.f1383c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1381a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f1382b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f1383c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f1381a + ", tokenExpirationTimestamp=" + this.f1382b + ", responseCode=" + this.f1383c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f1381a = str;
        this.f1382b = j10;
        this.f1383c = bVar;
    }
}
