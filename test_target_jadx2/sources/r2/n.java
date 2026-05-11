package r2;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f39163a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final n f39164b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final n f39165c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final n f39166d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final n f39167e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f39168f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f39169g;

    /* renamed from: h, reason: collision with root package name */
    public static final i2.g f39170h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f39171i;

    private static class a extends n {
        a() {
        }

        @Override // r2.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // r2.n
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    private static class b extends n {
        b() {
        }

        @Override // r2.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // r2.n
        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    private static class c extends n {
        c() {
        }

        @Override // r2.n
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : n.f39165c.a(i10, i11, i12, i13);
        }

        @Override // r2.n
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, n.f39165c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends n {
        d() {
        }

        @Override // r2.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // r2.n
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    private static class e extends n {
        e() {
        }

        @Override // r2.n
        public g a(int i10, int i11, int i12, int i13) {
            return n.f39171i ? g.QUALITY : g.MEMORY;
        }

        @Override // r2.n
        public float b(int i10, int i11, int i12, int i13) {
            if (n.f39171i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    private static class f extends n {
        f() {
        }

        @Override // r2.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // r2.n
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f39167e = dVar;
        f39168f = new f();
        f39169g = dVar;
        f39170h = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f39171i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
