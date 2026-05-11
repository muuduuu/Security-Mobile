package r7;

import t8.c;

/* loaded from: classes2.dex */
final class N4 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final N4 f39544a = new N4();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39545b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39546c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39547d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f39548e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f39549f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f39550g;

    static {
        c.b a10 = t8.c.a("appName");
        O0 o02 = new O0();
        o02.a(1);
        f39545b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("sessionId");
        O0 o03 = new O0();
        o03.a(2);
        f39546c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("startZoomLevel");
        O0 o04 = new O0();
        o04.a(3);
        f39547d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("endZoomLevel");
        O0 o05 = new O0();
        o05.a(4);
        f39548e = a13.b(o05.b()).a();
        c.b a14 = t8.c.a("durationMs");
        O0 o06 = new O0();
        o06.a(5);
        f39549f = a14.b(o06.b()).a();
        c.b a15 = t8.c.a("predictedArea");
        O0 o07 = new O0();
        o07.a(6);
        f39550g = a15.b(o07.b()).a();
    }

    private N4() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A7 a72 = (A7) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f39545b, a72.e());
        eVar.a(f39546c, a72.f());
        eVar.a(f39547d, a72.c());
        eVar.a(f39548e, a72.b());
        eVar.a(f39549f, a72.d());
        eVar.a(f39550g, a72.a());
    }
}
