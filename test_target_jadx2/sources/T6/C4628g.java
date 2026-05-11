package t6;

import java.util.List;
import org.conscrypt.BuildConfig;
import t6.AbstractC4634m;

/* renamed from: t6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4628g extends AbstractC4634m {

    /* renamed from: a, reason: collision with root package name */
    private final long f42385a;

    /* renamed from: b, reason: collision with root package name */
    private final long f42386b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4632k f42387c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f42388d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42389e;

    /* renamed from: f, reason: collision with root package name */
    private final List f42390f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC4637p f42391g;

    /* renamed from: t6.g$b */
    static final class b extends AbstractC4634m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f42392a;

        /* renamed from: b, reason: collision with root package name */
        private Long f42393b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC4632k f42394c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f42395d;

        /* renamed from: e, reason: collision with root package name */
        private String f42396e;

        /* renamed from: f, reason: collision with root package name */
        private List f42397f;

        /* renamed from: g, reason: collision with root package name */
        private EnumC4637p f42398g;

        b() {
        }

        @Override // t6.AbstractC4634m.a
        public AbstractC4634m a() {
            Long l10 = this.f42392a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " requestTimeMs";
            }
            if (this.f42393b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C4628g(this.f42392a.longValue(), this.f42393b.longValue(), this.f42394c, this.f42395d, this.f42396e, this.f42397f, this.f42398g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t6.AbstractC4634m.a
        public AbstractC4634m.a b(AbstractC4632k abstractC4632k) {
            this.f42394c = abstractC4632k;
            return this;
        }

        @Override // t6.AbstractC4634m.a
        public AbstractC4634m.a c(List list) {
            this.f42397f = list;
            return this;
        }

        @Override // t6.AbstractC4634m.a
        AbstractC4634m.a d(Integer num) {
            this.f42395d = num;
            return this;
        }

        @Override // t6.AbstractC4634m.a
        AbstractC4634m.a e(String str) {
            this.f42396e = str;
            return this;
        }

        @Override // t6.AbstractC4634m.a
        public AbstractC4634m.a f(EnumC4637p enumC4637p) {
            this.f42398g = enumC4637p;
            return this;
        }

        @Override // t6.AbstractC4634m.a
        public AbstractC4634m.a g(long j10) {
            this.f42392a = Long.valueOf(j10);
            return this;
        }

        @Override // t6.AbstractC4634m.a
        public AbstractC4634m.a h(long j10) {
            this.f42393b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // t6.AbstractC4634m
    public AbstractC4632k b() {
        return this.f42387c;
    }

    @Override // t6.AbstractC4634m
    public List c() {
        return this.f42390f;
    }

    @Override // t6.AbstractC4634m
    public Integer d() {
        return this.f42388d;
    }

    @Override // t6.AbstractC4634m
    public String e() {
        return this.f42389e;
    }

    public boolean equals(Object obj) {
        AbstractC4632k abstractC4632k;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4634m)) {
            return false;
        }
        AbstractC4634m abstractC4634m = (AbstractC4634m) obj;
        if (this.f42385a == abstractC4634m.g() && this.f42386b == abstractC4634m.h() && ((abstractC4632k = this.f42387c) != null ? abstractC4632k.equals(abstractC4634m.b()) : abstractC4634m.b() == null) && ((num = this.f42388d) != null ? num.equals(abstractC4634m.d()) : abstractC4634m.d() == null) && ((str = this.f42389e) != null ? str.equals(abstractC4634m.e()) : abstractC4634m.e() == null) && ((list = this.f42390f) != null ? list.equals(abstractC4634m.c()) : abstractC4634m.c() == null)) {
            EnumC4637p enumC4637p = this.f42391g;
            if (enumC4637p == null) {
                if (abstractC4634m.f() == null) {
                    return true;
                }
            } else if (enumC4637p.equals(abstractC4634m.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // t6.AbstractC4634m
    public EnumC4637p f() {
        return this.f42391g;
    }

    @Override // t6.AbstractC4634m
    public long g() {
        return this.f42385a;
    }

    @Override // t6.AbstractC4634m
    public long h() {
        return this.f42386b;
    }

    public int hashCode() {
        long j10 = this.f42385a;
        long j11 = this.f42386b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC4632k abstractC4632k = this.f42387c;
        int hashCode = (i10 ^ (abstractC4632k == null ? 0 : abstractC4632k.hashCode())) * 1000003;
        Integer num = this.f42388d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f42389e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f42390f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC4637p enumC4637p = this.f42391g;
        return hashCode4 ^ (enumC4637p != null ? enumC4637p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f42385a + ", requestUptimeMs=" + this.f42386b + ", clientInfo=" + this.f42387c + ", logSource=" + this.f42388d + ", logSourceName=" + this.f42389e + ", logEvents=" + this.f42390f + ", qosTier=" + this.f42391g + "}";
    }

    private C4628g(long j10, long j11, AbstractC4632k abstractC4632k, Integer num, String str, List list, EnumC4637p enumC4637p) {
        this.f42385a = j10;
        this.f42386b = j11;
        this.f42387c = abstractC4632k;
        this.f42388d = num;
        this.f42389e = str;
        this.f42390f = list;
        this.f42391g = enumC4637p;
    }
}
