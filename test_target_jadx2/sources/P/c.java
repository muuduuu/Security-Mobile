package P;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final P.a f7361a;

    /* renamed from: b, reason: collision with root package name */
    private final d f7362b;

    /* renamed from: c, reason: collision with root package name */
    private final b f7363c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7364d;

    c(P.a aVar, d dVar, b bVar, int i10) {
        this.f7361a = aVar;
        this.f7362b = dVar;
        this.f7363c = bVar;
        this.f7364d = i10;
    }

    public int a() {
        return this.f7364d;
    }

    public P.a b() {
        return this.f7361a;
    }

    public b c() {
        return this.f7363c;
    }

    public d d() {
        return this.f7362b;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private P.a f7365a;

        /* renamed from: b, reason: collision with root package name */
        private d f7366b;

        /* renamed from: c, reason: collision with root package name */
        private b f7367c;

        /* renamed from: d, reason: collision with root package name */
        private int f7368d;

        public a() {
            this.f7365a = P.a.f7357c;
            this.f7366b = null;
            this.f7367c = null;
            this.f7368d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f7365a, this.f7366b, this.f7367c, this.f7368d);
        }

        public a c(int i10) {
            this.f7368d = i10;
            return this;
        }

        public a d(P.a aVar) {
            this.f7365a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f7367c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f7366b = dVar;
            return this;
        }

        private a(c cVar) {
            this.f7365a = P.a.f7357c;
            this.f7366b = null;
            this.f7367c = null;
            this.f7368d = 0;
            this.f7365a = cVar.b();
            this.f7366b = cVar.d();
            this.f7367c = cVar.c();
            this.f7368d = cVar.a();
        }
    }
}
