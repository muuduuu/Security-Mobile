package k2;

/* loaded from: classes.dex */
class p implements v {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36145a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36146b;

    /* renamed from: c, reason: collision with root package name */
    private final v f36147c;

    /* renamed from: d, reason: collision with root package name */
    private final a f36148d;

    /* renamed from: e, reason: collision with root package name */
    private final i2.f f36149e;

    /* renamed from: f, reason: collision with root package name */
    private int f36150f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36151g;

    interface a {
        void a(i2.f fVar, p pVar);
    }

    p(v vVar, boolean z10, boolean z11, i2.f fVar, a aVar) {
        this.f36147c = (v) D2.k.d(vVar);
        this.f36145a = z10;
        this.f36146b = z11;
        this.f36149e = fVar;
        this.f36148d = (a) D2.k.d(aVar);
    }

    @Override // k2.v
    public Class a() {
        return this.f36147c.a();
    }

    synchronized void b() {
        if (this.f36151g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f36150f++;
    }

    v c() {
        return this.f36147c;
    }

    boolean d() {
        return this.f36145a;
    }

    void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f36150f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f36150f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f36148d.a(this.f36149e, this);
        }
    }

    @Override // k2.v
    public Object get() {
        return this.f36147c.get();
    }

    @Override // k2.v
    public int k() {
        return this.f36147c.k();
    }

    @Override // k2.v
    public synchronized void recycle() {
        if (this.f36150f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f36151g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f36151g = true;
        if (this.f36146b) {
            this.f36147c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f36145a + ", listener=" + this.f36148d + ", key=" + this.f36149e + ", acquired=" + this.f36150f + ", isRecycled=" + this.f36151g + ", resource=" + this.f36147c + '}';
    }
}
