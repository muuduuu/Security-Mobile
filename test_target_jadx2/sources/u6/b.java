package u6;

import java.util.Map;
import org.conscrypt.BuildConfig;
import u6.i;

/* loaded from: classes2.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f43518a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f43519b;

    /* renamed from: c, reason: collision with root package name */
    private final h f43520c;

    /* renamed from: d, reason: collision with root package name */
    private final long f43521d;

    /* renamed from: e, reason: collision with root package name */
    private final long f43522e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f43523f;

    /* renamed from: u6.b$b, reason: collision with other inner class name */
    static final class C0622b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f43524a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f43525b;

        /* renamed from: c, reason: collision with root package name */
        private h f43526c;

        /* renamed from: d, reason: collision with root package name */
        private Long f43527d;

        /* renamed from: e, reason: collision with root package name */
        private Long f43528e;

        /* renamed from: f, reason: collision with root package name */
        private Map f43529f;

        C0622b() {
        }

        @Override // u6.i.a
        public i d() {
            String str = this.f43524a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " transportName";
            }
            if (this.f43526c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f43527d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f43528e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f43529f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new b(this.f43524a, this.f43525b, this.f43526c, this.f43527d.longValue(), this.f43528e.longValue(), this.f43529f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // u6.i.a
        protected Map e() {
            Map map = this.f43529f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // u6.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f43529f = map;
            return this;
        }

        @Override // u6.i.a
        public i.a g(Integer num) {
            this.f43525b = num;
            return this;
        }

        @Override // u6.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f43526c = hVar;
            return this;
        }

        @Override // u6.i.a
        public i.a i(long j10) {
            this.f43527d = Long.valueOf(j10);
            return this;
        }

        @Override // u6.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f43524a = str;
            return this;
        }

        @Override // u6.i.a
        public i.a k(long j10) {
            this.f43528e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // u6.i
    protected Map c() {
        return this.f43523f;
    }

    @Override // u6.i
    public Integer d() {
        return this.f43519b;
    }

    @Override // u6.i
    public h e() {
        return this.f43520c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f43518a.equals(iVar.j()) && ((num = this.f43519b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f43520c.equals(iVar.e()) && this.f43521d == iVar.f() && this.f43522e == iVar.k() && this.f43523f.equals(iVar.c());
    }

    @Override // u6.i
    public long f() {
        return this.f43521d;
    }

    public int hashCode() {
        int hashCode = (this.f43518a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f43519b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f43520c.hashCode()) * 1000003;
        long j10 = this.f43521d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f43522e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f43523f.hashCode();
    }

    @Override // u6.i
    public String j() {
        return this.f43518a;
    }

    @Override // u6.i
    public long k() {
        return this.f43522e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f43518a + ", code=" + this.f43519b + ", encodedPayload=" + this.f43520c + ", eventMillis=" + this.f43521d + ", uptimeMillis=" + this.f43522e + ", autoMetadata=" + this.f43523f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f43518a = str;
        this.f43519b = num;
        this.f43520c = hVar;
        this.f43521d = j10;
        this.f43522e = j11;
        this.f43523f = map;
    }
}
