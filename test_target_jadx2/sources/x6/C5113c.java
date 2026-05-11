package x6;

import w8.InterfaceC5046c;

/* renamed from: x6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5113c {

    /* renamed from: c, reason: collision with root package name */
    private static final C5113c f44790c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f44791a;

    /* renamed from: b, reason: collision with root package name */
    private final b f44792b;

    /* renamed from: x6.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f44793a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f44794b = b.REASON_UNKNOWN;

        a() {
        }

        public C5113c a() {
            return new C5113c(this.f44793a, this.f44794b);
        }

        public a b(long j10) {
            this.f44793a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f44794b = bVar;
            return this;
        }
    }

    /* renamed from: x6.c$b */
    public enum b implements InterfaceC5046c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // w8.InterfaceC5046c
        public int getNumber() {
            return this.number_;
        }
    }

    C5113c(long j10, b bVar) {
        this.f44791a = j10;
        this.f44792b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f44791a;
    }

    public b b() {
        return this.f44792b;
    }
}
