package Z3;

/* loaded from: classes.dex */
public abstract class v {

    class a implements z {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f12421a;

        a(t tVar) {
            this.f12421a = tVar;
        }

        @Override // Z3.z
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(V2.d dVar) {
            this.f12421a.g(dVar);
        }

        @Override // Z3.z
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(V2.d dVar) {
            this.f12421a.f(dVar);
        }

        @Override // Z3.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(V2.d dVar) {
            this.f12421a.m(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.n(xVar);
        return new u(xVar, new a(tVar));
    }
}
