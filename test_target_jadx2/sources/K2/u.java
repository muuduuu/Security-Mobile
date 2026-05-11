package k2;

import E2.a;

/* loaded from: classes.dex */
final class u implements v, a.f {

    /* renamed from: e, reason: collision with root package name */
    private static final y0.d f36167e = E2.a.d(20, new a());

    /* renamed from: a, reason: collision with root package name */
    private final E2.c f36168a = E2.c.a();

    /* renamed from: b, reason: collision with root package name */
    private v f36169b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36170c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36171d;

    class a implements a.d {
        a() {
        }

        @Override // E2.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u create() {
            return new u();
        }
    }

    u() {
    }

    private void b(v vVar) {
        this.f36171d = false;
        this.f36170c = true;
        this.f36169b = vVar;
    }

    static u c(v vVar) {
        u uVar = (u) D2.k.d((u) f36167e.b());
        uVar.b(vVar);
        return uVar;
    }

    private void d() {
        this.f36169b = null;
        f36167e.a(this);
    }

    @Override // k2.v
    public Class a() {
        return this.f36169b.a();
    }

    @Override // E2.a.f
    public E2.c e() {
        return this.f36168a;
    }

    synchronized void f() {
        this.f36168a.c();
        if (!this.f36170c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f36170c = false;
        if (this.f36171d) {
            recycle();
        }
    }

    @Override // k2.v
    public Object get() {
        return this.f36169b.get();
    }

    @Override // k2.v
    public int k() {
        return this.f36169b.k();
    }

    @Override // k2.v
    public synchronized void recycle() {
        this.f36168a.c();
        this.f36171d = true;
        if (!this.f36170c) {
            this.f36169b.recycle();
            d();
        }
    }
}
