package t7;

import t8.c;

/* renamed from: t7.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4656c2 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4656c2 f42844a = new C4656c2();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f42845b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f42846c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f42847d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f42848e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f42849f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f42850g;

    static {
        c.b a10 = t8.c.a("landmarkMode");
        C4772t0 c4772t0 = new C4772t0();
        c4772t0.a(1);
        f42845b = a10.b(c4772t0.b()).a();
        c.b a11 = t8.c.a("classificationMode");
        C4772t0 c4772t02 = new C4772t0();
        c4772t02.a(2);
        f42846c = a11.b(c4772t02.b()).a();
        c.b a12 = t8.c.a("performanceMode");
        C4772t0 c4772t03 = new C4772t0();
        c4772t03.a(3);
        f42847d = a12.b(c4772t03.b()).a();
        c.b a13 = t8.c.a("contourMode");
        C4772t0 c4772t04 = new C4772t0();
        c4772t04.a(4);
        f42848e = a13.b(c4772t04.b()).a();
        c.b a14 = t8.c.a("isTrackingEnabled");
        C4772t0 c4772t05 = new C4772t0();
        c4772t05.a(5);
        f42849f = a14.b(c4772t05.b()).a();
        c.b a15 = t8.c.a("minFaceSize");
        C4772t0 c4772t06 = new C4772t0();
        c4772t06.a(6);
        f42850g = a15.b(c4772t06.b()).a();
    }

    private C4656c2() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        V3 v32 = (V3) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f42845b, v32.c());
        eVar.a(f42846c, v32.a());
        eVar.a(f42847d, v32.d());
        eVar.a(f42848e, v32.b());
        eVar.a(f42849f, v32.e());
        eVar.a(f42850g, v32.f());
    }
}
