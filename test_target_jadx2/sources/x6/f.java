package x6;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f44805c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f44806a;

    /* renamed from: b, reason: collision with root package name */
    private final long f44807b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f44808a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f44809b = 0;

        a() {
        }

        public f a() {
            return new f(this.f44808a, this.f44809b);
        }

        public a b(long j10) {
            this.f44809b = j10;
            return this;
        }

        public a c(long j10) {
            this.f44808a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f44806a = j10;
        this.f44807b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f44807b;
    }

    public long b() {
        return this.f44806a;
    }
}
