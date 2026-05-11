package o8;

/* renamed from: o8.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3760B implements A8.b {

    /* renamed from: c, reason: collision with root package name */
    private static final A8.a f37961c = new A8.a() { // from class: o8.z
        @Override // A8.a
        public final void a(A8.b bVar) {
            C3760B.d(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final A8.b f37962d = new A8.b() { // from class: o8.A
        @Override // A8.b
        public final Object get() {
            Object e10;
            e10 = C3760B.e();
            return e10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private A8.a f37963a;

    /* renamed from: b, reason: collision with root package name */
    private volatile A8.b f37964b;

    private C3760B(A8.a aVar, A8.b bVar) {
        this.f37963a = aVar;
        this.f37964b = bVar;
    }

    static C3760B c() {
        return new C3760B(f37961c, f37962d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    void f(A8.b bVar) {
        A8.a aVar;
        if (this.f37964b != f37962d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f37963a;
            this.f37963a = null;
            this.f37964b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // A8.b
    public Object get() {
        return this.f37964b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(A8.b bVar) {
    }
}
