package N5;

/* loaded from: classes2.dex */
public abstract class m extends M5.g {

    /* renamed from: a, reason: collision with root package name */
    protected final M5.e f6562a;

    /* renamed from: b, reason: collision with root package name */
    protected final D5.d f6563b;

    protected m(M5.e eVar, D5.d dVar) {
        this.f6562a = eVar;
        this.f6563b = dVar;
    }

    @Override // M5.g
    public String b() {
        return null;
    }

    @Override // M5.g
    public B5.b g(com.fasterxml.jackson.core.f fVar, B5.b bVar) {
        i(bVar);
        return fVar.l2(bVar);
    }

    @Override // M5.g
    public B5.b h(com.fasterxml.jackson.core.f fVar, B5.b bVar) {
        return fVar.m2(bVar);
    }

    protected void i(B5.b bVar) {
        if (bVar.f443c == null) {
            Object obj = bVar.f441a;
            Class cls = bVar.f442b;
            bVar.f443c = cls == null ? k(obj) : l(obj, cls);
        }
    }

    protected String k(Object obj) {
        String b10 = this.f6562a.b(obj);
        if (b10 == null) {
            j(obj);
        }
        return b10;
    }

    protected String l(Object obj, Class cls) {
        String c10 = this.f6562a.c(obj, cls);
        if (c10 == null) {
            j(obj);
        }
        return c10;
    }

    protected void j(Object obj) {
    }
}
