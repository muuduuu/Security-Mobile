package Z3;

/* loaded from: classes.dex */
public abstract class s {

    class a implements z {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f12418a;

        a(t tVar) {
            this.f12418a = tVar;
        }

        @Override // Z3.z
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(V2.d dVar) {
            this.f12418a.c(dVar);
        }

        @Override // Z3.z
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(V2.d dVar) {
            this.f12418a.a(dVar);
        }

        @Override // Z3.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(V2.d dVar) {
            this.f12418a.j(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.b(xVar);
        return new u(xVar, new a(tVar));
    }
}
