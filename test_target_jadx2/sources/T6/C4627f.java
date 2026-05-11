package t6;

import java.util.Arrays;
import org.conscrypt.BuildConfig;
import t6.AbstractC4633l;

/* renamed from: t6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4627f extends AbstractC4633l {

    /* renamed from: a, reason: collision with root package name */
    private final long f42371a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f42372b;

    /* renamed from: c, reason: collision with root package name */
    private final long f42373c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f42374d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42375e;

    /* renamed from: f, reason: collision with root package name */
    private final long f42376f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC4636o f42377g;

    /* renamed from: t6.f$b */
    static final class b extends AbstractC4633l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f42378a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f42379b;

        /* renamed from: c, reason: collision with root package name */
        private Long f42380c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f42381d;

        /* renamed from: e, reason: collision with root package name */
        private String f42382e;

        /* renamed from: f, reason: collision with root package name */
        private Long f42383f;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC4636o f42384g;

        b() {
        }

        @Override // t6.AbstractC4633l.a
        public AbstractC4633l a() {
            Long l10 = this.f42378a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " eventTimeMs";
            }
            if (this.f42380c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f42383f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C4627f(this.f42378a.longValue(), this.f42379b, this.f42380c.longValue(), this.f42381d, this.f42382e, this.f42383f.longValue(), this.f42384g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t6.AbstractC4633l.a
        public AbstractC4633l.a b(Integer num) {
            this.f42379b = num;
            return this;
        }

        @Override // t6.AbstractC4633l.a
        public AbstractC4633l.a c(long j10) {
            this.f42378a = Long.valueOf(j10);
            return this;
        }

        @Override // t6.AbstractC4633l.a
        public AbstractC4633l.a d(long j10) {
            this.f42380c = Long.valueOf(j10);
            return this;
        }

        @Override // t6.AbstractC4633l.a
        public AbstractC4633l.a e(AbstractC4636o abstractC4636o) {
            this.f42384g = abstractC4636o;
            return this;
        }

        @Override // t6.AbstractC4633l.a
        AbstractC4633l.a f(byte[] bArr) {
            this.f42381d = bArr;
            return this;
        }

        @Override // t6.AbstractC4633l.a
        AbstractC4633l.a g(String str) {
            this.f42382e = str;
            return this;
        }

        @Override // t6.AbstractC4633l.a
        public AbstractC4633l.a h(long j10) {
            this.f42383f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // t6.AbstractC4633l
    public Integer b() {
        return this.f42372b;
    }

    @Override // t6.AbstractC4633l
    public long c() {
        return this.f42371a;
    }

    @Override // t6.AbstractC4633l
    public long d() {
        return this.f42373c;
    }

    @Override // t6.AbstractC4633l
    public AbstractC4636o e() {
        return this.f42377g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4633l)) {
            return false;
        }
        AbstractC4633l abstractC4633l = (AbstractC4633l) obj;
        if (this.f42371a == abstractC4633l.c() && ((num = this.f42372b) != null ? num.equals(abstractC4633l.b()) : abstractC4633l.b() == null) && this.f42373c == abstractC4633l.d()) {
            if (Arrays.equals(this.f42374d, abstractC4633l instanceof C4627f ? ((C4627f) abstractC4633l).f42374d : abstractC4633l.f()) && ((str = this.f42375e) != null ? str.equals(abstractC4633l.g()) : abstractC4633l.g() == null) && this.f42376f == abstractC4633l.h()) {
                AbstractC4636o abstractC4636o = this.f42377g;
                if (abstractC4636o == null) {
                    if (abstractC4633l.e() == null) {
                        return true;
                    }
                } else if (abstractC4636o.equals(abstractC4633l.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t6.AbstractC4633l
    public byte[] f() {
        return this.f42374d;
    }

    @Override // t6.AbstractC4633l
    public String g() {
        return this.f42375e;
    }

    @Override // t6.AbstractC4633l
    public long h() {
        return this.f42376f;
    }

    public int hashCode() {
        long j10 = this.f42371a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f42372b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f42373c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f42374d)) * 1000003;
        String str = this.f42375e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f42376f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC4636o abstractC4636o = this.f42377g;
        return i11 ^ (abstractC4636o != null ? abstractC4636o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f42371a + ", eventCode=" + this.f42372b + ", eventUptimeMs=" + this.f42373c + ", sourceExtension=" + Arrays.toString(this.f42374d) + ", sourceExtensionJsonProto3=" + this.f42375e + ", timezoneOffsetSeconds=" + this.f42376f + ", networkConnectionInfo=" + this.f42377g + "}";
    }

    private C4627f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC4636o abstractC4636o) {
        this.f42371a = j10;
        this.f42372b = num;
        this.f42373c = j11;
        this.f42374d = bArr;
        this.f42375e = str;
        this.f42376f = j12;
        this.f42377g = abstractC4636o;
    }
}
