package fc;

/* renamed from: fc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3164b {

    /* renamed from: d, reason: collision with root package name */
    public static final C3164b f32979d = new a().b(EnumC3163a.HIGH).c(0.0f).d(500).a();

    /* renamed from: e, reason: collision with root package name */
    public static final C3164b f32980e = new a().b(EnumC3163a.MEDIUM).c(150.0f).d(2500).a();

    /* renamed from: f, reason: collision with root package name */
    public static final C3164b f32981f = new a().b(EnumC3163a.LOW).c(500.0f).d(5000).a();

    /* renamed from: a, reason: collision with root package name */
    private long f32982a;

    /* renamed from: b, reason: collision with root package name */
    private float f32983b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC3163a f32984c;

    /* renamed from: fc.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private EnumC3163a f32985a;

        /* renamed from: b, reason: collision with root package name */
        private long f32986b;

        /* renamed from: c, reason: collision with root package name */
        private float f32987c;

        public C3164b a() {
            return new C3164b(this.f32985a, this.f32986b, this.f32987c);
        }

        public a b(EnumC3163a enumC3163a) {
            this.f32985a = enumC3163a;
            return this;
        }

        public a c(float f10) {
            this.f32987c = f10;
            return this;
        }

        public a d(long j10) {
            this.f32986b = j10;
            return this;
        }
    }

    C3164b(EnumC3163a enumC3163a, long j10, float f10) {
        this.f32982a = j10;
        this.f32983b = f10;
        this.f32984c = enumC3163a;
    }

    public EnumC3163a a() {
        return this.f32984c;
    }

    public float b() {
        return this.f32983b;
    }

    public long c() {
        return this.f32982a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3164b)) {
            return false;
        }
        C3164b c3164b = (C3164b) obj;
        return Float.compare(c3164b.f32983b, this.f32983b) == 0 && this.f32982a == c3164b.f32982a && this.f32984c == c3164b.f32984c;
    }

    public int hashCode() {
        long j10 = this.f32982a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        float f10 = this.f32983b;
        return ((i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f32984c.hashCode();
    }
}
