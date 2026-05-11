package x6;

/* renamed from: x6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5115e {

    /* renamed from: c, reason: collision with root package name */
    private static final C5115e f44800c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f44801a;

    /* renamed from: b, reason: collision with root package name */
    private final long f44802b;

    /* renamed from: x6.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f44803a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f44804b = 0;

        a() {
        }

        public C5115e a() {
            return new C5115e(this.f44803a, this.f44804b);
        }

        public a b(long j10) {
            this.f44803a = j10;
            return this;
        }

        public a c(long j10) {
            this.f44804b = j10;
            return this;
        }
    }

    C5115e(long j10, long j11) {
        this.f44801a = j10;
        this.f44802b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f44801a;
    }

    public long b() {
        return this.f44802b;
    }
}
