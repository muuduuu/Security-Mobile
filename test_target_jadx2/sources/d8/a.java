package D8;

import D8.d;

/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f1371a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1372b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1373c;

    /* renamed from: d, reason: collision with root package name */
    private final f f1374d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f1375e;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f1376a;

        /* renamed from: b, reason: collision with root package name */
        private String f1377b;

        /* renamed from: c, reason: collision with root package name */
        private String f1378c;

        /* renamed from: d, reason: collision with root package name */
        private f f1379d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f1380e;

        b() {
        }

        @Override // D8.d.a
        public d a() {
            return new a(this.f1376a, this.f1377b, this.f1378c, this.f1379d, this.f1380e);
        }

        @Override // D8.d.a
        public d.a b(f fVar) {
            this.f1379d = fVar;
            return this;
        }

        @Override // D8.d.a
        public d.a c(String str) {
            this.f1377b = str;
            return this;
        }

        @Override // D8.d.a
        public d.a d(String str) {
            this.f1378c = str;
            return this;
        }

        @Override // D8.d.a
        public d.a e(d.b bVar) {
            this.f1380e = bVar;
            return this;
        }

        @Override // D8.d.a
        public d.a f(String str) {
            this.f1376a = str;
            return this;
        }
    }

    @Override // D8.d
    public f b() {
        return this.f1374d;
    }

    @Override // D8.d
    public String c() {
        return this.f1372b;
    }

    @Override // D8.d
    public String d() {
        return this.f1373c;
    }

    @Override // D8.d
    public d.b e() {
        return this.f1375e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f1371a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f1372b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f1373c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f1374d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f1375e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // D8.d
    public String f() {
        return this.f1371a;
    }

    public int hashCode() {
        String str = this.f1371a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f1372b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1373c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f1374d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f1375e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f1371a + ", fid=" + this.f1372b + ", refreshToken=" + this.f1373c + ", authToken=" + this.f1374d + ", responseCode=" + this.f1375e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f1371a = str;
        this.f1372b = str2;
        this.f1373c = str3;
        this.f1374d = fVar;
        this.f1375e = bVar;
    }
}
