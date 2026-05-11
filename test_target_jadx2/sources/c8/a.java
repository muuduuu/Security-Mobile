package C8;

import C8.c;
import C8.d;

/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f1034b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f1035c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1036d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1037e;

    /* renamed from: f, reason: collision with root package name */
    private final long f1038f;

    /* renamed from: g, reason: collision with root package name */
    private final long f1039g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1040h;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f1041a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f1042b;

        /* renamed from: c, reason: collision with root package name */
        private String f1043c;

        /* renamed from: d, reason: collision with root package name */
        private String f1044d;

        /* renamed from: e, reason: collision with root package name */
        private long f1045e;

        /* renamed from: f, reason: collision with root package name */
        private long f1046f;

        /* renamed from: g, reason: collision with root package name */
        private String f1047g;

        /* renamed from: h, reason: collision with root package name */
        private byte f1048h;

        @Override // C8.d.a
        public d a() {
            if (this.f1048h == 3 && this.f1042b != null) {
                return new a(this.f1041a, this.f1042b, this.f1043c, this.f1044d, this.f1045e, this.f1046f, this.f1047g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f1042b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f1048h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f1048h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // C8.d.a
        public d.a b(String str) {
            this.f1043c = str;
            return this;
        }

        @Override // C8.d.a
        public d.a c(long j10) {
            this.f1045e = j10;
            this.f1048h = (byte) (this.f1048h | 1);
            return this;
        }

        @Override // C8.d.a
        public d.a d(String str) {
            this.f1041a = str;
            return this;
        }

        @Override // C8.d.a
        public d.a e(String str) {
            this.f1047g = str;
            return this;
        }

        @Override // C8.d.a
        public d.a f(String str) {
            this.f1044d = str;
            return this;
        }

        @Override // C8.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f1042b = aVar;
            return this;
        }

        @Override // C8.d.a
        public d.a h(long j10) {
            this.f1046f = j10;
            this.f1048h = (byte) (this.f1048h | 2);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f1041a = dVar.d();
            this.f1042b = dVar.g();
            this.f1043c = dVar.b();
            this.f1044d = dVar.f();
            this.f1045e = dVar.c();
            this.f1046f = dVar.h();
            this.f1047g = dVar.e();
            this.f1048h = (byte) 3;
        }
    }

    @Override // C8.d
    public String b() {
        return this.f1036d;
    }

    @Override // C8.d
    public long c() {
        return this.f1038f;
    }

    @Override // C8.d
    public String d() {
        return this.f1034b;
    }

    @Override // C8.d
    public String e() {
        return this.f1040h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f1034b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f1035c.equals(dVar.g()) && ((str = this.f1036d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f1037e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f1038f == dVar.c() && this.f1039g == dVar.h()) {
                String str4 = this.f1040h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // C8.d
    public String f() {
        return this.f1037e;
    }

    @Override // C8.d
    public c.a g() {
        return this.f1035c;
    }

    @Override // C8.d
    public long h() {
        return this.f1039g;
    }

    public int hashCode() {
        String str = this.f1034b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f1035c.hashCode()) * 1000003;
        String str2 = this.f1036d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1037e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f1038f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f1039g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f1040h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // C8.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f1034b + ", registrationStatus=" + this.f1035c + ", authToken=" + this.f1036d + ", refreshToken=" + this.f1037e + ", expiresInSecs=" + this.f1038f + ", tokenCreationEpochInSecs=" + this.f1039g + ", fisError=" + this.f1040h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f1034b = str;
        this.f1035c = aVar;
        this.f1036d = str2;
        this.f1037e = str3;
        this.f1038f = j10;
        this.f1039g = j11;
        this.f1040h = str4;
    }
}
