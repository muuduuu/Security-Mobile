package x6;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5112b {

    /* renamed from: b, reason: collision with root package name */
    private static final C5112b f44787b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C5115e f44788a;

    /* renamed from: x6.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C5115e f44789a = null;

        a() {
        }

        public C5112b a() {
            return new C5112b(this.f44789a);
        }

        public a b(C5115e c5115e) {
            this.f44789a = c5115e;
            return this;
        }
    }

    C5112b(C5115e c5115e) {
        this.f44788a = c5115e;
    }

    public static a b() {
        return new a();
    }

    public C5115e a() {
        return this.f44788a;
    }
}
