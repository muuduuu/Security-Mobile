package r7;

import t8.c;

/* renamed from: r7.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4043b3 implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    static final C4043b3 f39923a = new C4043b3();

    /* renamed from: b, reason: collision with root package name */
    private static final t8.c f39924b;

    /* renamed from: c, reason: collision with root package name */
    private static final t8.c f39925c;

    /* renamed from: d, reason: collision with root package name */
    private static final t8.c f39926d;

    /* renamed from: e, reason: collision with root package name */
    private static final t8.c f39927e;

    /* renamed from: f, reason: collision with root package name */
    private static final t8.c f39928f;

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f39929g;

    static {
        c.b a10 = t8.c.a("maxMs");
        O0 o02 = new O0();
        o02.a(1);
        f39924b = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("minMs");
        O0 o03 = new O0();
        o03.a(2);
        f39925c = a11.b(o03.b()).a();
        c.b a12 = t8.c.a("avgMs");
        O0 o04 = new O0();
        o04.a(3);
        f39926d = a12.b(o04.b()).a();
        c.b a13 = t8.c.a("firstQuartileMs");
        O0 o05 = new O0();
        o05.a(4);
        f39927e = a13.b(o05.b()).a();
        c.b a14 = t8.c.a("medianMs");
        O0 o06 = new O0();
        o06.a(5);
        f39928f = a14.b(o06.b()).a();
        c.b a15 = t8.c.a("thirdQuartileMs");
        O0 o07 = new O0();
        o07.a(6);
        f39929g = a15.b(o07.b()).a();
    }

    private C4043b3() {
    }

    @Override // t8.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        F5 f52 = (F5) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.a(f39924b, f52.c());
        eVar.a(f39925c, f52.e());
        eVar.a(f39926d, f52.a());
        eVar.a(f39927e, f52.b());
        eVar.a(f39928f, f52.d());
        eVar.a(f39929g, f52.f());
    }
}
