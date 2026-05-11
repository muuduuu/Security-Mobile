package M8;

import u8.InterfaceC4873a;
import u8.InterfaceC4874b;

/* loaded from: classes2.dex */
public final class a implements InterfaceC4873a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC4873a f6075a = new a();

    /* renamed from: M8.a$a, reason: collision with other inner class name */
    private static final class C0120a implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0120a f6076a = new C0120a();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f6077b = t8.c.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final t8.c f6078c = t8.c.d("variantId");

        /* renamed from: d, reason: collision with root package name */
        private static final t8.c f6079d = t8.c.d("parameterKey");

        /* renamed from: e, reason: collision with root package name */
        private static final t8.c f6080e = t8.c.d("parameterValue");

        /* renamed from: f, reason: collision with root package name */
        private static final t8.c f6081f = t8.c.d("templateVersion");

        private C0120a() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, t8.e eVar) {
            eVar.a(f6077b, dVar.d());
            eVar.a(f6078c, dVar.f());
            eVar.a(f6079d, dVar.b());
            eVar.a(f6080e, dVar.c());
            eVar.b(f6081f, dVar.e());
        }
    }

    private a() {
    }

    @Override // u8.InterfaceC4873a
    public void a(InterfaceC4874b interfaceC4874b) {
        C0120a c0120a = C0120a.f6076a;
        interfaceC4874b.a(d.class, c0120a);
        interfaceC4874b.a(b.class, c0120a);
    }
}
